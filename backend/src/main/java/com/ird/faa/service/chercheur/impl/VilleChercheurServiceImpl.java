package com.ird.faa.service.chercheur.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ird.faa.service.util.StringUtil;
import com.ird.faa.security.common.SecurityUtil;
import com.ird.faa.security.bean.User;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.Ville;
import com.ird.faa.bean.Pays;
import com.ird.faa.dao.VilleDao;
import com.ird.faa.service.chercheur.facade.VilleChercheurService;
import com.ird.faa.service.chercheur.facade.PaysChercheurService;

import com.ird.faa.ws.rest.provided.vo.VilleVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class VilleChercheurServiceImpl extends AbstractServiceImpl<Ville> implements VilleChercheurService {

@Autowired
private VilleDao villeDao;

@Autowired
private ArchivableService<Ville> archivableService;
        @Autowired
        private PaysChercheurService paysService ;


@Autowired
private EntityManager entityManager;


@Override
public List<Ville> findAll(){
    String query = "SELECT o FROM Ville o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}

        @Override
        public List<Ville> findByPaysCode(String code){
        return villeDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return villeDao.deleteByPaysCode(code);
        }

        @Override
        public List<Ville> findByPaysId(Long id){
        return villeDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return villeDao.deleteByPaysId(id);
        }

    @Override
    public Ville findByCode(String code){
    if( code==null) return null;
    return villeDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return villeDao.deleteByCode(code);
    }
    @Override
    public Ville findByIdOrCode(Ville ville){
        Ville resultat=null;
        if(ville != null){
            if(StringUtil.isNotEmpty(ville.getId())){
            resultat= villeDao.getOne(ville.getId());
            }else if(StringUtil.isNotEmpty(ville.getCode())) {
            resultat= villeDao.findByCode(ville.getCode());
            }
        }
    return resultat;
    }

@Override
public Ville findById(Long id){
if(id==null) return null;
return villeDao.getOne(id);
}

@Override
public Ville findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(villeDao.findById(id).isPresent())  {
villeDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Ville update(Ville ville){
Ville foundedVille = findById(ville.getId());
if(foundedVille==null) return null;
else{
    archivableService.prepare(ville);
return  villeDao.save(ville);
}
}
private void prepareSave(Ville ville){
ville.setDateCreation(new Date());
if(ville.getArchive() == null)
  ville.setArchive(false);
if(ville.getAdmin() == null)
  ville.setAdmin(false);
if(ville.getVisible() == null)
  ville.setVisible(false);



}

@Override
public Ville save (Ville ville){
prepareSave(ville);

Ville result =null;
    Ville foundedVille = findByCode(ville.getCode());
   if(foundedVille == null){


    findPays(ville);

Ville savedVille = villeDao.save(ville);

result = savedVille;
   }

return result;
}

@Override
public List<Ville> save(List<Ville> villes){
List<Ville> list = new ArrayList<>();
for(Ville ville: villes){
list.add(save(ville));
}
return list;
}



@Override
@Transactional
public int delete(Ville ville){
    if(ville.getCode()==null) return -1;

    Ville foundedVille = findByCode(ville.getCode());
    if(foundedVille==null) return -1;
villeDao.delete(foundedVille);
return 1;
}


public List<Ville> findByCriteria(VilleVo villeVo){

String query = "SELECT o FROM Ville o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",villeVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",villeVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",villeVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",villeVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",villeVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",villeVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",villeVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",villeVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",villeVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",villeVo.getDateArchivageMin(),villeVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",villeVo.getDateCreationMin(),villeVo.getDateCreationMax());
    if(villeVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",villeVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",villeVo.getPaysVo().getCode());
    }

query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}

    private void findPays(Ville ville){
        Pays loadedPays =paysService.findByIdOrCode(ville.getPays());

    if(loadedPays==null ) {
        return;
    }
    ville.setPays(loadedPays);
    }

@Override
@Transactional
public void delete(List<Ville> villes){
        if(ListUtil.isNotEmpty(villes)){
        villes.forEach(e->villeDao.delete(e));
        }
}
@Override
public void update(List<Ville> villes){
if(ListUtil.isNotEmpty(villes)){
villes.forEach(e->villeDao.save(e));
}
}



}
