package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EtablissementPartenaire;
import com.ird.faa.dao.EtablissementPartenaireDao;
import com.ird.faa.service.admin.facade.EtablissementPartenaireAdminService;

import com.ird.faa.ws.rest.provided.vo.EtablissementPartenaireVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EtablissementPartenaireAdminServiceImpl extends AbstractServiceImpl<EtablissementPartenaire> implements EtablissementPartenaireAdminService {

@Autowired
private EtablissementPartenaireDao etablissementPartenaireDao;

@Autowired
private ArchivableService<EtablissementPartenaire> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<EtablissementPartenaire> findAll(){
        String query = "SELECT o FROM EtablissementPartenaire o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public EtablissementPartenaire findByCode(String code){
    if( code==null) return null;
    return etablissementPartenaireDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return etablissementPartenaireDao.deleteByCode(code);
    }
    @Override
    public EtablissementPartenaire findByIdOrCode(EtablissementPartenaire etablissementPartenaire){
        EtablissementPartenaire resultat=null;
        if(etablissementPartenaire != null){
            if(StringUtil.isNotEmpty(etablissementPartenaire.getId())){
            resultat= etablissementPartenaireDao.getOne(etablissementPartenaire.getId());
            }else if(StringUtil.isNotEmpty(etablissementPartenaire.getCode())) {
            resultat= etablissementPartenaireDao.findByCode(etablissementPartenaire.getCode());
            }
        }
    return resultat;
    }

@Override
public EtablissementPartenaire findById(Long id){
if(id==null) return null;
return etablissementPartenaireDao.getOne(id);
}

@Override
public EtablissementPartenaire findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public EtablissementPartenaire archiver(EtablissementPartenaire etablissementPartenaire) {
        if (etablissementPartenaire.getArchive() == null) {
        etablissementPartenaire.setArchive(false);
        }
        etablissementPartenaire.setArchive(true);
        etablissementPartenaire.setDateArchivage(new Date());
        etablissementPartenaireDao.save(etablissementPartenaire);
        return etablissementPartenaire;

    }

    @Override
    public EtablissementPartenaire desarchiver(EtablissementPartenaire etablissementPartenaire) {
    if (etablissementPartenaire.getArchive() == null) {
    etablissementPartenaire.setArchive(false);
    }
    etablissementPartenaire.setArchive(false);
    etablissementPartenaire.setDateArchivage(null);
    etablissementPartenaireDao.save(etablissementPartenaire);
    return etablissementPartenaire;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(etablissementPartenaireDao.findById(id).isPresent())  {
etablissementPartenaireDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EtablissementPartenaire update(EtablissementPartenaire etablissementPartenaire){
EtablissementPartenaire foundedEtablissementPartenaire = findById(etablissementPartenaire.getId());
if(foundedEtablissementPartenaire==null) return null;
else{
    archivableService.prepare(etablissementPartenaire);
return  etablissementPartenaireDao.save(etablissementPartenaire);
}
}
private void prepareSave(EtablissementPartenaire etablissementPartenaire){
etablissementPartenaire.setDateCreation(new Date());
if(etablissementPartenaire.getArchive() == null)
  etablissementPartenaire.setArchive(false);
if(etablissementPartenaire.getAdmin() == null)
  etablissementPartenaire.setAdmin(false);
if(etablissementPartenaire.getVisible() == null)
  etablissementPartenaire.setVisible(false);



}

@Override
public EtablissementPartenaire save (EtablissementPartenaire etablissementPartenaire){
prepareSave(etablissementPartenaire);

EtablissementPartenaire result =null;
    EtablissementPartenaire foundedEtablissementPartenaire = findByCode(etablissementPartenaire.getCode());
   if(foundedEtablissementPartenaire == null){



EtablissementPartenaire savedEtablissementPartenaire = etablissementPartenaireDao.save(etablissementPartenaire);

result = savedEtablissementPartenaire;
   }

return result;
}

@Override
public List<EtablissementPartenaire> save(List<EtablissementPartenaire> etablissementPartenaires){
List<EtablissementPartenaire> list = new ArrayList<>();
for(EtablissementPartenaire etablissementPartenaire: etablissementPartenaires){
list.add(save(etablissementPartenaire));
}
return list;
}



@Override
@Transactional
public int delete(EtablissementPartenaire etablissementPartenaire){
    if(etablissementPartenaire.getCode()==null) return -1;

    EtablissementPartenaire foundedEtablissementPartenaire = findByCode(etablissementPartenaire.getCode());
    if(foundedEtablissementPartenaire==null) return -1;
etablissementPartenaireDao.delete(foundedEtablissementPartenaire);
return 1;
}


public List<EtablissementPartenaire> findByCriteria(EtablissementPartenaireVo etablissementPartenaireVo){

String query = "SELECT o FROM EtablissementPartenaire o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",etablissementPartenaireVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",etablissementPartenaireVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",etablissementPartenaireVo.getCode());
            query += SearchUtil.addConstraint( "o", "description","LIKE",etablissementPartenaireVo.getDescription());
            query += SearchUtil.addConstraint( "o", "archive","=",etablissementPartenaireVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",etablissementPartenaireVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",etablissementPartenaireVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",etablissementPartenaireVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",etablissementPartenaireVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",etablissementPartenaireVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",etablissementPartenaireVo.getDateArchivageMin(),etablissementPartenaireVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",etablissementPartenaireVo.getDateCreationMin(),etablissementPartenaireVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<EtablissementPartenaire> etablissementPartenaires){
        if(ListUtil.isNotEmpty(etablissementPartenaires)){
        etablissementPartenaires.forEach(e->etablissementPartenaireDao.delete(e));
        }
}
@Override
public void update(List<EtablissementPartenaire> etablissementPartenaires){
if(ListUtil.isNotEmpty(etablissementPartenaires)){
etablissementPartenaires.forEach(e->etablissementPartenaireDao.save(e));
}
}



}
