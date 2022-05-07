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
import com.ird.faa.bean.TemplateOuverture;
import com.ird.faa.dao.TemplateOuvertureDao;
import com.ird.faa.service.chercheur.facade.TemplateOuvertureChercheurService;

import com.ird.faa.ws.rest.provided.vo.TemplateOuvertureVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TemplateOuvertureChercheurServiceImpl extends AbstractServiceImpl<TemplateOuverture> implements TemplateOuvertureChercheurService {

@Autowired
private TemplateOuvertureDao templateOuvertureDao;

@Autowired
private ArchivableService<TemplateOuverture> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TemplateOuverture> findAll(){
    String query = "SELECT o FROM TemplateOuverture o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public TemplateOuverture findByCode(String code){
    if( code==null) return null;
    return templateOuvertureDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return templateOuvertureDao.deleteByCode(code);
    }
    @Override
    public TemplateOuverture findByIdOrCode(TemplateOuverture templateOuverture){
        TemplateOuverture resultat=null;
        if(templateOuverture != null){
            if(StringUtil.isNotEmpty(templateOuverture.getId())){
            resultat= templateOuvertureDao.getOne(templateOuverture.getId());
            }else if(StringUtil.isNotEmpty(templateOuverture.getCode())) {
            resultat= templateOuvertureDao.findByCode(templateOuverture.getCode());
            }
        }
    return resultat;
    }

@Override
public TemplateOuverture findById(Long id){
if(id==null) return null;
return templateOuvertureDao.getOne(id);
}

@Override
public TemplateOuverture findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(templateOuvertureDao.findById(id).isPresent())  {
templateOuvertureDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TemplateOuverture update(TemplateOuverture templateOuverture){
TemplateOuverture foundedTemplateOuverture = findById(templateOuverture.getId());
if(foundedTemplateOuverture==null) return null;
else{
    archivableService.prepare(templateOuverture);
return  templateOuvertureDao.save(templateOuverture);
}
}
private void prepareSave(TemplateOuverture templateOuverture){
templateOuverture.setDateCreation(new Date());
if(templateOuverture.getArchive() == null)
  templateOuverture.setArchive(false);
if(templateOuverture.getAdmin() == null)
  templateOuverture.setAdmin(false);
if(templateOuverture.getVisible() == null)
  templateOuverture.setVisible(false);

    templateOuverture.setAdmin(false);
    templateOuverture.setVisible(false);
    User currentUser = SecurityUtil.getCurrentUser();
    if (currentUser != null && StringUtil.isNotEmpty(currentUser.getUsername())){
        templateOuverture.setChercheur(currentUser);
    }


}

@Override
public TemplateOuverture save (TemplateOuverture templateOuverture){
prepareSave(templateOuverture);

TemplateOuverture result =null;
    TemplateOuverture foundedTemplateOuverture = findByCode(templateOuverture.getCode());
   if(foundedTemplateOuverture == null){



TemplateOuverture savedTemplateOuverture = templateOuvertureDao.save(templateOuverture);

result = savedTemplateOuverture;
   }

return result;
}

@Override
public List<TemplateOuverture> save(List<TemplateOuverture> templateOuvertures){
List<TemplateOuverture> list = new ArrayList<>();
for(TemplateOuverture templateOuverture: templateOuvertures){
list.add(save(templateOuverture));
}
return list;
}



@Override
@Transactional
public int delete(TemplateOuverture templateOuverture){
    if(templateOuverture.getCode()==null) return -1;

    TemplateOuverture foundedTemplateOuverture = findByCode(templateOuverture.getCode());
    if(foundedTemplateOuverture==null) return -1;
templateOuvertureDao.delete(foundedTemplateOuverture);
return 1;
}


public List<TemplateOuverture> findByCriteria(TemplateOuvertureVo templateOuvertureVo){

String query = "SELECT o FROM TemplateOuverture o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",templateOuvertureVo.getId());
            query += SearchUtil.addConstraint( "o", "code","LIKE",templateOuvertureVo.getCode());
            query += SearchUtil.addConstraint( "o", "objet","LIKE",templateOuvertureVo.getObjet());
            query += SearchUtil.addConstraint( "o", "message","LIKE",templateOuvertureVo.getMessage());
            query += SearchUtil.addConstraint( "o", "archive","=",templateOuvertureVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",templateOuvertureVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",templateOuvertureVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",templateOuvertureVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",templateOuvertureVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",templateOuvertureVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",templateOuvertureVo.getDateArchivageMin(),templateOuvertureVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",templateOuvertureVo.getDateCreationMin(),templateOuvertureVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TemplateOuverture> templateOuvertures){
        if(ListUtil.isNotEmpty(templateOuvertures)){
        templateOuvertures.forEach(e->templateOuvertureDao.delete(e));
        }
}
@Override
public void update(List<TemplateOuverture> templateOuvertures){
if(ListUtil.isNotEmpty(templateOuvertures)){
templateOuvertures.forEach(e->templateOuvertureDao.save(e));
}
}



}
