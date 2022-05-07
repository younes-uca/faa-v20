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
import com.ird.faa.bean.EtablissementProjet;
import com.ird.faa.bean.Ville;
import com.ird.faa.bean.Pays;
import com.ird.faa.dao.EtablissementProjetDao;
import com.ird.faa.service.chercheur.facade.EtablissementProjetChercheurService;
import com.ird.faa.service.chercheur.facade.VilleChercheurService;
import com.ird.faa.service.chercheur.facade.PaysChercheurService;

import com.ird.faa.ws.rest.provided.vo.EtablissementProjetVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EtablissementProjetChercheurServiceImpl extends AbstractServiceImpl<EtablissementProjet> implements EtablissementProjetChercheurService {

@Autowired
private EtablissementProjetDao etablissementProjetDao;

@Autowired
private ArchivableService<EtablissementProjet> archivableService;
        @Autowired
        private VilleChercheurService villeService ;
        @Autowired
        private PaysChercheurService paysService ;


@Autowired
private EntityManager entityManager;


@Override
public List<EtablissementProjet> findAll(){
    String query = "SELECT o FROM EtablissementProjet o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}

        @Override
        public List<EtablissementProjet> findByVilleCode(String code){
        return etablissementProjetDao.findByVilleCode(code);
        }

        @Override
        @Transactional
        public int deleteByVilleCode(String code){
        return etablissementProjetDao.deleteByVilleCode(code);
        }

        @Override
        public List<EtablissementProjet> findByVilleId(Long id){
        return etablissementProjetDao.findByVilleId(id);
        }

        @Override
        @Transactional
        public int deleteByVilleId(Long id){
        return etablissementProjetDao.deleteByVilleId(id);
        }


        @Override
        public List<EtablissementProjet> findByPaysCode(String code){
        return etablissementProjetDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return etablissementProjetDao.deleteByPaysCode(code);
        }

        @Override
        public List<EtablissementProjet> findByPaysId(Long id){
        return etablissementProjetDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return etablissementProjetDao.deleteByPaysId(id);
        }

    @Override
    public EtablissementProjet findByCode(String code){
    if( code==null) return null;
    return etablissementProjetDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return etablissementProjetDao.deleteByCode(code);
    }
    @Override
    public EtablissementProjet findByIdOrCode(EtablissementProjet etablissementProjet){
        EtablissementProjet resultat=null;
        if(etablissementProjet != null){
            if(StringUtil.isNotEmpty(etablissementProjet.getId())){
            resultat= etablissementProjetDao.getOne(etablissementProjet.getId());
            }else if(StringUtil.isNotEmpty(etablissementProjet.getCode())) {
            resultat= etablissementProjetDao.findByCode(etablissementProjet.getCode());
            }
        }
    return resultat;
    }

@Override
public EtablissementProjet findById(Long id){
if(id==null) return null;
return etablissementProjetDao.getOne(id);
}

@Override
public EtablissementProjet findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(etablissementProjetDao.findById(id).isPresent())  {
etablissementProjetDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EtablissementProjet update(EtablissementProjet etablissementProjet){
EtablissementProjet foundedEtablissementProjet = findById(etablissementProjet.getId());
if(foundedEtablissementProjet==null) return null;
else{
    archivableService.prepare(etablissementProjet);
return  etablissementProjetDao.save(etablissementProjet);
}
}
private void prepareSave(EtablissementProjet etablissementProjet){
etablissementProjet.setDateCreation(new Date());
if(etablissementProjet.getValide() == null)
  etablissementProjet.setValide(false);
if(etablissementProjet.getArchive() == null)
  etablissementProjet.setArchive(false);
if(etablissementProjet.getAdmin() == null)
  etablissementProjet.setAdmin(false);
if(etablissementProjet.getVisible() == null)
  etablissementProjet.setVisible(false);



}

@Override
public EtablissementProjet save (EtablissementProjet etablissementProjet){
prepareSave(etablissementProjet);

EtablissementProjet result =null;
    EtablissementProjet foundedEtablissementProjet = findByCode(etablissementProjet.getCode());
   if(foundedEtablissementProjet == null){


    findVille(etablissementProjet);
    findPays(etablissementProjet);

EtablissementProjet savedEtablissementProjet = etablissementProjetDao.save(etablissementProjet);

result = savedEtablissementProjet;
   }

return result;
}

@Override
public List<EtablissementProjet> save(List<EtablissementProjet> etablissementProjets){
List<EtablissementProjet> list = new ArrayList<>();
for(EtablissementProjet etablissementProjet: etablissementProjets){
list.add(save(etablissementProjet));
}
return list;
}



@Override
@Transactional
public int delete(EtablissementProjet etablissementProjet){
    if(etablissementProjet.getCode()==null) return -1;

    EtablissementProjet foundedEtablissementProjet = findByCode(etablissementProjet.getCode());
    if(foundedEtablissementProjet==null) return -1;
etablissementProjetDao.delete(foundedEtablissementProjet);
return 1;
}


public List<EtablissementProjet> findByCriteria(EtablissementProjetVo etablissementProjetVo){

String query = "SELECT o FROM EtablissementProjet o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",etablissementProjetVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",etablissementProjetVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",etablissementProjetVo.getCode());
            query += SearchUtil.addConstraint( "o", "description","LIKE",etablissementProjetVo.getDescription());
            query += SearchUtil.addConstraint( "o", "sigleOfficiel","LIKE",etablissementProjetVo.getSigleOfficiel());
            query += SearchUtil.addConstraint( "o", "nomEnFrancais","LIKE",etablissementProjetVo.getNomEnFrancais());
            query += SearchUtil.addConstraint( "o", "sigleEnFrancais","LIKE",etablissementProjetVo.getSigleEnFrancais());
            query += SearchUtil.addConstraint( "o", "anciensNom","LIKE",etablissementProjetVo.getAnciensNom());
            query += SearchUtil.addConstraint( "o", "champIntervention","LIKE",etablissementProjetVo.getChampIntervention());
            query += SearchUtil.addConstraint( "o", "valide","=",etablissementProjetVo.getValide());
            query += SearchUtil.addConstraint( "o", "archive","=",etablissementProjetVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",etablissementProjetVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",etablissementProjetVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",etablissementProjetVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",etablissementProjetVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",etablissementProjetVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",etablissementProjetVo.getDateArchivageMin(),etablissementProjetVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",etablissementProjetVo.getDateCreationMin(),etablissementProjetVo.getDateCreationMax());
    if(etablissementProjetVo.getVilleVo()!=null){
        query += SearchUtil.addConstraint( "o", "ville.id","=",etablissementProjetVo.getVilleVo().getId());
            query += SearchUtil.addConstraint( "o", "ville.code","LIKE",etablissementProjetVo.getVilleVo().getCode());
    }

    if(etablissementProjetVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",etablissementProjetVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",etablissementProjetVo.getPaysVo().getCode());
    }

query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}

    private void findVille(EtablissementProjet etablissementProjet){
        Ville loadedVille =villeService.findByIdOrCode(etablissementProjet.getVille());

    if(loadedVille==null ) {
        return;
    }
    etablissementProjet.setVille(loadedVille);
    }
    private void findPays(EtablissementProjet etablissementProjet){
        Pays loadedPays =paysService.findByIdOrCode(etablissementProjet.getPays());

    if(loadedPays==null ) {
        return;
    }
    etablissementProjet.setPays(loadedPays);
    }

@Override
@Transactional
public void delete(List<EtablissementProjet> etablissementProjets){
        if(ListUtil.isNotEmpty(etablissementProjets)){
        etablissementProjets.forEach(e->etablissementProjetDao.delete(e));
        }
}
@Override
public void update(List<EtablissementProjet> etablissementProjets){
if(ListUtil.isNotEmpty(etablissementProjets)){
etablissementProjets.forEach(e->etablissementProjetDao.save(e));
}
}



}
