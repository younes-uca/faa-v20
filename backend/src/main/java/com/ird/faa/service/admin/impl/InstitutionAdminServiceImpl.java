package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.Institution;
import com.ird.faa.dao.InstitutionDao;
import com.ird.faa.service.admin.facade.InstitutionAdminService;

import com.ird.faa.ws.rest.provided.vo.InstitutionVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class InstitutionAdminServiceImpl extends AbstractServiceImpl<Institution> implements InstitutionAdminService {

@Autowired
private InstitutionDao institutionDao;

@Autowired
private ArchivableService<Institution> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<Institution> findAll(){
        String query = "SELECT o FROM Institution o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public Institution findByCode(String code){
    if( code==null) return null;
    return institutionDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return institutionDao.deleteByCode(code);
    }
    @Override
    public Institution findByIdOrCode(Institution institution){
        Institution resultat=null;
        if(institution != null){
            if(StringUtil.isNotEmpty(institution.getId())){
            resultat= institutionDao.getOne(institution.getId());
            }else if(StringUtil.isNotEmpty(institution.getCode())) {
            resultat= institutionDao.findByCode(institution.getCode());
            }
        }
    return resultat;
    }

@Override
public Institution findById(Long id){
if(id==null) return null;
return institutionDao.getOne(id);
}

@Override
public Institution findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public Institution archiver(Institution institution) {
        if (institution.getArchive() == null) {
        institution.setArchive(false);
        }
        institution.setArchive(true);
        institution.setDateArchivage(new Date());
        institutionDao.save(institution);
        return institution;

    }

    @Override
    public Institution desarchiver(Institution institution) {
    if (institution.getArchive() == null) {
    institution.setArchive(false);
    }
    institution.setArchive(false);
    institution.setDateArchivage(null);
    institutionDao.save(institution);
    return institution;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(institutionDao.findById(id).isPresent())  {
institutionDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Institution update(Institution institution){
Institution foundedInstitution = findById(institution.getId());
if(foundedInstitution==null) return null;
else{
    archivableService.prepare(institution);
return  institutionDao.save(institution);
}
}
private void prepareSave(Institution institution){
institution.setDateCreation(new Date());
if(institution.getArchive() == null)
  institution.setArchive(false);
if(institution.getAdmin() == null)
  institution.setAdmin(false);
if(institution.getVisible() == null)
  institution.setVisible(false);



}

@Override
public Institution save (Institution institution){
prepareSave(institution);

Institution result =null;
    Institution foundedInstitution = findByCode(institution.getCode());
   if(foundedInstitution == null){



Institution savedInstitution = institutionDao.save(institution);

result = savedInstitution;
   }

return result;
}

@Override
public List<Institution> save(List<Institution> institutions){
List<Institution> list = new ArrayList<>();
for(Institution institution: institutions){
list.add(save(institution));
}
return list;
}



@Override
@Transactional
public int delete(Institution institution){
    if(institution.getCode()==null) return -1;

    Institution foundedInstitution = findByCode(institution.getCode());
    if(foundedInstitution==null) return -1;
institutionDao.delete(foundedInstitution);
return 1;
}


public List<Institution> findByCriteria(InstitutionVo institutionVo){

String query = "SELECT o FROM Institution o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",institutionVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",institutionVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",institutionVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",institutionVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",institutionVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",institutionVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",institutionVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",institutionVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",institutionVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",institutionVo.getDateArchivageMin(),institutionVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",institutionVo.getDateCreationMin(),institutionVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<Institution> institutions){
        if(ListUtil.isNotEmpty(institutions)){
        institutions.forEach(e->institutionDao.delete(e));
        }
}
@Override
public void update(List<Institution> institutions){
if(ListUtil.isNotEmpty(institutions)){
institutions.forEach(e->institutionDao.save(e));
}
}



}
