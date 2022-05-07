package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.Grade;
import com.ird.faa.dao.GradeDao;
import com.ird.faa.service.admin.facade.GradeAdminService;

import com.ird.faa.ws.rest.provided.vo.GradeVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class GradeAdminServiceImpl extends AbstractServiceImpl<Grade> implements GradeAdminService {

@Autowired
private GradeDao gradeDao;

@Autowired
private ArchivableService<Grade> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<Grade> findAll(){
        String query = "SELECT o FROM Grade o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public Grade findByCode(String code){
    if( code==null) return null;
    return gradeDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return gradeDao.deleteByCode(code);
    }
    @Override
    public Grade findByIdOrCode(Grade grade){
        Grade resultat=null;
        if(grade != null){
            if(StringUtil.isNotEmpty(grade.getId())){
            resultat= gradeDao.getOne(grade.getId());
            }else if(StringUtil.isNotEmpty(grade.getCode())) {
            resultat= gradeDao.findByCode(grade.getCode());
            }
        }
    return resultat;
    }

@Override
public Grade findById(Long id){
if(id==null) return null;
return gradeDao.getOne(id);
}

@Override
public Grade findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public Grade archiver(Grade grade) {
        if (grade.getArchive() == null) {
        grade.setArchive(false);
        }
        grade.setArchive(true);
        grade.setDateArchivage(new Date());
        gradeDao.save(grade);
        return grade;

    }

    @Override
    public Grade desarchiver(Grade grade) {
    if (grade.getArchive() == null) {
    grade.setArchive(false);
    }
    grade.setArchive(false);
    grade.setDateArchivage(null);
    gradeDao.save(grade);
    return grade;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(gradeDao.findById(id).isPresent())  {
gradeDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Grade update(Grade grade){
Grade foundedGrade = findById(grade.getId());
if(foundedGrade==null) return null;
else{
    archivableService.prepare(grade);
return  gradeDao.save(grade);
}
}
private void prepareSave(Grade grade){
grade.setDateCreation(new Date());
if(grade.getArchive() == null)
  grade.setArchive(false);
if(grade.getAdmin() == null)
  grade.setAdmin(false);
if(grade.getVisible() == null)
  grade.setVisible(false);



}

@Override
public Grade save (Grade grade){
prepareSave(grade);

Grade result =null;
    Grade foundedGrade = findByCode(grade.getCode());
   if(foundedGrade == null){



Grade savedGrade = gradeDao.save(grade);

result = savedGrade;
   }

return result;
}

@Override
public List<Grade> save(List<Grade> grades){
List<Grade> list = new ArrayList<>();
for(Grade grade: grades){
list.add(save(grade));
}
return list;
}



@Override
@Transactional
public int delete(Grade grade){
    if(grade.getCode()==null) return -1;

    Grade foundedGrade = findByCode(grade.getCode());
    if(foundedGrade==null) return -1;
gradeDao.delete(foundedGrade);
return 1;
}


public List<Grade> findByCriteria(GradeVo gradeVo){

String query = "SELECT o FROM Grade o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",gradeVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",gradeVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",gradeVo.getCode());
            query += SearchUtil.addConstraint( "o", "description","LIKE",gradeVo.getDescription());
            query += SearchUtil.addConstraint( "o", "archive","=",gradeVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",gradeVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",gradeVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",gradeVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",gradeVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",gradeVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",gradeVo.getDateArchivageMin(),gradeVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",gradeVo.getDateCreationMin(),gradeVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<Grade> grades){
        if(ListUtil.isNotEmpty(grades)){
        grades.forEach(e->gradeDao.delete(e));
        }
}
@Override
public void update(List<Grade> grades){
if(ListUtil.isNotEmpty(grades)){
grades.forEach(e->gradeDao.save(e));
}
}



}
