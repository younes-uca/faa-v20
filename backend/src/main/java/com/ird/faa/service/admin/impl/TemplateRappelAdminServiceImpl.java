package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TemplateRappel;
import com.ird.faa.dao.TemplateRappelDao;
import com.ird.faa.service.admin.facade.TemplateRappelAdminService;

import com.ird.faa.ws.rest.provided.vo.TemplateRappelVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TemplateRappelAdminServiceImpl extends AbstractServiceImpl<TemplateRappel> implements TemplateRappelAdminService {

@Autowired
private TemplateRappelDao templateRappelDao;

@Autowired
private ArchivableService<TemplateRappel> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TemplateRappel> findAll(){
        String query = "SELECT o FROM TemplateRappel o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public TemplateRappel findByCode(String code){
    if( code==null) return null;
    return templateRappelDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return templateRappelDao.deleteByCode(code);
    }
    @Override
    public TemplateRappel findByIdOrCode(TemplateRappel templateRappel){
        TemplateRappel resultat=null;
        if(templateRappel != null){
            if(StringUtil.isNotEmpty(templateRappel.getId())){
            resultat= templateRappelDao.getOne(templateRappel.getId());
            }else if(StringUtil.isNotEmpty(templateRappel.getCode())) {
            resultat= templateRappelDao.findByCode(templateRappel.getCode());
            }
        }
    return resultat;
    }

@Override
public TemplateRappel findById(Long id){
if(id==null) return null;
return templateRappelDao.getOne(id);
}

@Override
public TemplateRappel findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public TemplateRappel archiver(TemplateRappel templateRappel) {
        if (templateRappel.getArchive() == null) {
        templateRappel.setArchive(false);
        }
        templateRappel.setArchive(true);
        templateRappel.setDateArchivage(new Date());
        templateRappelDao.save(templateRappel);
        return templateRappel;

    }

    @Override
    public TemplateRappel desarchiver(TemplateRappel templateRappel) {
    if (templateRappel.getArchive() == null) {
    templateRappel.setArchive(false);
    }
    templateRappel.setArchive(false);
    templateRappel.setDateArchivage(null);
    templateRappelDao.save(templateRappel);
    return templateRappel;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(templateRappelDao.findById(id).isPresent())  {
templateRappelDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TemplateRappel update(TemplateRappel templateRappel){
TemplateRappel foundedTemplateRappel = findById(templateRappel.getId());
if(foundedTemplateRappel==null) return null;
else{
    archivableService.prepare(templateRappel);
return  templateRappelDao.save(templateRappel);
}
}
private void prepareSave(TemplateRappel templateRappel){
templateRappel.setDateCreation(new Date());
if(templateRappel.getArchive() == null)
  templateRappel.setArchive(false);
if(templateRappel.getAdmin() == null)
  templateRappel.setAdmin(false);
if(templateRappel.getVisible() == null)
  templateRappel.setVisible(false);

    templateRappel.setAdmin(true);
    templateRappel.setVisible(true);


}

@Override
public TemplateRappel save (TemplateRappel templateRappel){
prepareSave(templateRappel);

TemplateRappel result =null;
    TemplateRappel foundedTemplateRappel = findByCode(templateRappel.getCode());
   if(foundedTemplateRappel == null){



TemplateRappel savedTemplateRappel = templateRappelDao.save(templateRappel);

result = savedTemplateRappel;
   }

return result;
}

@Override
public List<TemplateRappel> save(List<TemplateRappel> templateRappels){
List<TemplateRappel> list = new ArrayList<>();
for(TemplateRappel templateRappel: templateRappels){
list.add(save(templateRappel));
}
return list;
}



@Override
@Transactional
public int delete(TemplateRappel templateRappel){
    if(templateRappel.getCode()==null) return -1;

    TemplateRappel foundedTemplateRappel = findByCode(templateRappel.getCode());
    if(foundedTemplateRappel==null) return -1;
templateRappelDao.delete(foundedTemplateRappel);
return 1;
}


public List<TemplateRappel> findByCriteria(TemplateRappelVo templateRappelVo){

String query = "SELECT o FROM TemplateRappel o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",templateRappelVo.getId());
            query += SearchUtil.addConstraint( "o", "code","LIKE",templateRappelVo.getCode());
            query += SearchUtil.addConstraint( "o", "objet","LIKE",templateRappelVo.getObjet());
            query += SearchUtil.addConstraint( "o", "message","LIKE",templateRappelVo.getMessage());
            query += SearchUtil.addConstraint( "o", "archive","=",templateRappelVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",templateRappelVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",templateRappelVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",templateRappelVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",templateRappelVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",templateRappelVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",templateRappelVo.getDateArchivageMin(),templateRappelVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",templateRappelVo.getDateCreationMin(),templateRappelVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TemplateRappel> templateRappels){
        if(ListUtil.isNotEmpty(templateRappels)){
        templateRappels.forEach(e->templateRappelDao.delete(e));
        }
}
@Override
public void update(List<TemplateRappel> templateRappels){
if(ListUtil.isNotEmpty(templateRappels)){
templateRappels.forEach(e->templateRappelDao.save(e));
}
}



}
