package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TemplateCloture;
import com.ird.faa.dao.TemplateClotureDao;
import com.ird.faa.service.admin.facade.TemplateClotureAdminService;

import com.ird.faa.ws.rest.provided.vo.TemplateClotureVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TemplateClotureAdminServiceImpl extends AbstractServiceImpl<TemplateCloture> implements TemplateClotureAdminService {

@Autowired
private TemplateClotureDao templateClotureDao;

@Autowired
private ArchivableService<TemplateCloture> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TemplateCloture> findAll(){
        String query = "SELECT o FROM TemplateCloture o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public TemplateCloture findByCode(String code){
    if( code==null) return null;
    return templateClotureDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return templateClotureDao.deleteByCode(code);
    }
    @Override
    public TemplateCloture findByIdOrCode(TemplateCloture templateCloture){
        TemplateCloture resultat=null;
        if(templateCloture != null){
            if(StringUtil.isNotEmpty(templateCloture.getId())){
            resultat= templateClotureDao.getOne(templateCloture.getId());
            }else if(StringUtil.isNotEmpty(templateCloture.getCode())) {
            resultat= templateClotureDao.findByCode(templateCloture.getCode());
            }
        }
    return resultat;
    }

@Override
public TemplateCloture findById(Long id){
if(id==null) return null;
return templateClotureDao.getOne(id);
}

@Override
public TemplateCloture findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public TemplateCloture archiver(TemplateCloture templateCloture) {
        if (templateCloture.getArchive() == null) {
        templateCloture.setArchive(false);
        }
        templateCloture.setArchive(true);
        templateCloture.setDateArchivage(new Date());
        templateClotureDao.save(templateCloture);
        return templateCloture;

    }

    @Override
    public TemplateCloture desarchiver(TemplateCloture templateCloture) {
    if (templateCloture.getArchive() == null) {
    templateCloture.setArchive(false);
    }
    templateCloture.setArchive(false);
    templateCloture.setDateArchivage(null);
    templateClotureDao.save(templateCloture);
    return templateCloture;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(templateClotureDao.findById(id).isPresent())  {
templateClotureDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TemplateCloture update(TemplateCloture templateCloture){
TemplateCloture foundedTemplateCloture = findById(templateCloture.getId());
if(foundedTemplateCloture==null) return null;
else{
    archivableService.prepare(templateCloture);
return  templateClotureDao.save(templateCloture);
}
}
private void prepareSave(TemplateCloture templateCloture){
templateCloture.setDateCreation(new Date());
if(templateCloture.getArchive() == null)
  templateCloture.setArchive(false);
if(templateCloture.getAdmin() == null)
  templateCloture.setAdmin(false);
if(templateCloture.getVisible() == null)
  templateCloture.setVisible(false);

    templateCloture.setAdmin(true);
    templateCloture.setVisible(true);


}

@Override
public TemplateCloture save (TemplateCloture templateCloture){
prepareSave(templateCloture);

TemplateCloture result =null;
    TemplateCloture foundedTemplateCloture = findByCode(templateCloture.getCode());
   if(foundedTemplateCloture == null){



TemplateCloture savedTemplateCloture = templateClotureDao.save(templateCloture);

result = savedTemplateCloture;
   }

return result;
}

@Override
public List<TemplateCloture> save(List<TemplateCloture> templateClotures){
List<TemplateCloture> list = new ArrayList<>();
for(TemplateCloture templateCloture: templateClotures){
list.add(save(templateCloture));
}
return list;
}



@Override
@Transactional
public int delete(TemplateCloture templateCloture){
    if(templateCloture.getCode()==null) return -1;

    TemplateCloture foundedTemplateCloture = findByCode(templateCloture.getCode());
    if(foundedTemplateCloture==null) return -1;
templateClotureDao.delete(foundedTemplateCloture);
return 1;
}


public List<TemplateCloture> findByCriteria(TemplateClotureVo templateClotureVo){

String query = "SELECT o FROM TemplateCloture o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",templateClotureVo.getId());
            query += SearchUtil.addConstraint( "o", "code","LIKE",templateClotureVo.getCode());
            query += SearchUtil.addConstraint( "o", "objet","LIKE",templateClotureVo.getObjet());
            query += SearchUtil.addConstraint( "o", "message","LIKE",templateClotureVo.getMessage());
            query += SearchUtil.addConstraint( "o", "archive","=",templateClotureVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",templateClotureVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",templateClotureVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",templateClotureVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",templateClotureVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",templateClotureVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",templateClotureVo.getDateArchivageMin(),templateClotureVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",templateClotureVo.getDateCreationMin(),templateClotureVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TemplateCloture> templateClotures){
        if(ListUtil.isNotEmpty(templateClotures)){
        templateClotures.forEach(e->templateClotureDao.delete(e));
        }
}
@Override
public void update(List<TemplateCloture> templateClotures){
if(ListUtil.isNotEmpty(templateClotures)){
templateClotures.forEach(e->templateClotureDao.save(e));
}
}



}
