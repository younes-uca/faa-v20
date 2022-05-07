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
import com.ird.faa.bean.NiveauEtude;
import com.ird.faa.dao.NiveauEtudeDao;
import com.ird.faa.service.chercheur.facade.NiveauEtudeChercheurService;

import com.ird.faa.ws.rest.provided.vo.NiveauEtudeVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class NiveauEtudeChercheurServiceImpl extends AbstractServiceImpl<NiveauEtude> implements NiveauEtudeChercheurService {

@Autowired
private NiveauEtudeDao niveauEtudeDao;

@Autowired
private ArchivableService<NiveauEtude> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<NiveauEtude> findAll(){
    String query = "SELECT o FROM NiveauEtude o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public NiveauEtude findByCode(String code){
    if( code==null) return null;
    return niveauEtudeDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return niveauEtudeDao.deleteByCode(code);
    }
    @Override
    public NiveauEtude findByIdOrCode(NiveauEtude niveauEtude){
        NiveauEtude resultat=null;
        if(niveauEtude != null){
            if(StringUtil.isNotEmpty(niveauEtude.getId())){
            resultat= niveauEtudeDao.getOne(niveauEtude.getId());
            }else if(StringUtil.isNotEmpty(niveauEtude.getCode())) {
            resultat= niveauEtudeDao.findByCode(niveauEtude.getCode());
            }
        }
    return resultat;
    }

@Override
public NiveauEtude findById(Long id){
if(id==null) return null;
return niveauEtudeDao.getOne(id);
}

@Override
public NiveauEtude findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(niveauEtudeDao.findById(id).isPresent())  {
niveauEtudeDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public NiveauEtude update(NiveauEtude niveauEtude){
NiveauEtude foundedNiveauEtude = findById(niveauEtude.getId());
if(foundedNiveauEtude==null) return null;
else{
    archivableService.prepare(niveauEtude);
return  niveauEtudeDao.save(niveauEtude);
}
}
private void prepareSave(NiveauEtude niveauEtude){
niveauEtude.setDateCreation(new Date());
if(niveauEtude.getArchive() == null)
  niveauEtude.setArchive(false);
if(niveauEtude.getAdmin() == null)
  niveauEtude.setAdmin(false);
if(niveauEtude.getVisible() == null)
  niveauEtude.setVisible(false);



}

@Override
public NiveauEtude save (NiveauEtude niveauEtude){
prepareSave(niveauEtude);

NiveauEtude result =null;
    NiveauEtude foundedNiveauEtude = findByCode(niveauEtude.getCode());
   if(foundedNiveauEtude == null){



NiveauEtude savedNiveauEtude = niveauEtudeDao.save(niveauEtude);

result = savedNiveauEtude;
   }

return result;
}

@Override
public List<NiveauEtude> save(List<NiveauEtude> niveauEtudes){
List<NiveauEtude> list = new ArrayList<>();
for(NiveauEtude niveauEtude: niveauEtudes){
list.add(save(niveauEtude));
}
return list;
}



@Override
@Transactional
public int delete(NiveauEtude niveauEtude){
    if(niveauEtude.getCode()==null) return -1;

    NiveauEtude foundedNiveauEtude = findByCode(niveauEtude.getCode());
    if(foundedNiveauEtude==null) return -1;
niveauEtudeDao.delete(foundedNiveauEtude);
return 1;
}


public List<NiveauEtude> findByCriteria(NiveauEtudeVo niveauEtudeVo){

String query = "SELECT o FROM NiveauEtude o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",niveauEtudeVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",niveauEtudeVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",niveauEtudeVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",niveauEtudeVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",niveauEtudeVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",niveauEtudeVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",niveauEtudeVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",niveauEtudeVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",niveauEtudeVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",niveauEtudeVo.getDateArchivageMin(),niveauEtudeVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",niveauEtudeVo.getDateCreationMin(),niveauEtudeVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<NiveauEtude> niveauEtudes){
        if(ListUtil.isNotEmpty(niveauEtudes)){
        niveauEtudes.forEach(e->niveauEtudeDao.delete(e));
        }
}
@Override
public void update(List<NiveauEtude> niveauEtudes){
if(ListUtil.isNotEmpty(niveauEtudes)){
niveauEtudes.forEach(e->niveauEtudeDao.save(e));
}
}



}
