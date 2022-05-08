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
import com.ird.faa.bean.TemplateRelance;
import com.ird.faa.dao.TemplateRelanceDao;
import com.ird.faa.service.chercheur.facade.TemplateRelanceChercheurService;

import com.ird.faa.ws.rest.provided.vo.TemplateRelanceVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TemplateRelanceChercheurServiceImpl extends AbstractServiceImpl<TemplateRelance> implements TemplateRelanceChercheurService {

@Autowired
private TemplateRelanceDao templateRelanceDao;

@Autowired
private ArchivableService<TemplateRelance> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TemplateRelance> findAll(){
    String query = "SELECT o FROM TemplateRelance o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public TemplateRelance findByCode(String code){
    if( code==null) return null;
    return templateRelanceDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return templateRelanceDao.deleteByCode(code);
    }
    @Override
    public TemplateRelance findByIdOrCode(TemplateRelance templateRelance){
        TemplateRelance resultat=null;
        if(templateRelance != null){
            if(StringUtil.isNotEmpty(templateRelance.getId())){
            resultat= templateRelanceDao.getOne(templateRelance.getId());
            }else if(StringUtil.isNotEmpty(templateRelance.getCode())) {
            resultat= templateRelanceDao.findByCode(templateRelance.getCode());
            }
        }
    return resultat;
    }

@Override
public TemplateRelance findById(Long id){
if(id==null) return null;
return templateRelanceDao.getOne(id);
}

@Override
public TemplateRelance findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(templateRelanceDao.findById(id).isPresent())  {
templateRelanceDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TemplateRelance update(TemplateRelance templateRelance){
TemplateRelance foundedTemplateRelance = findById(templateRelance.getId());
if(foundedTemplateRelance==null) return null;
else{
    archivableService.prepare(templateRelance);
return  templateRelanceDao.save(templateRelance);
}
}
private void prepareSave(TemplateRelance templateRelance){
templateRelance.setDateCreation(new Date());
if(templateRelance.getArchive() == null)
  templateRelance.setArchive(false);
if(templateRelance.getAdmin() == null)
  templateRelance.setAdmin(false);
if(templateRelance.getVisible() == null)
  templateRelance.setVisible(false);

    templateRelance.setAdmin(false);
    templateRelance.setVisible(false);
    User currentUser = SecurityUtil.getCurrentUser();
    if (currentUser != null && StringUtil.isNotEmpty(currentUser.getUsername())){
        templateRelance.setUsername(currentUser.getUsername());
    }


}

@Override
public TemplateRelance save (TemplateRelance templateRelance){
prepareSave(templateRelance);

TemplateRelance result =null;
    TemplateRelance foundedTemplateRelance = findByCode(templateRelance.getCode());
   if(foundedTemplateRelance == null){



TemplateRelance savedTemplateRelance = templateRelanceDao.save(templateRelance);

result = savedTemplateRelance;
   }

return result;
}

@Override
public List<TemplateRelance> save(List<TemplateRelance> templateRelances){
List<TemplateRelance> list = new ArrayList<>();
for(TemplateRelance templateRelance: templateRelances){
list.add(save(templateRelance));
}
return list;
}



@Override
@Transactional
public int delete(TemplateRelance templateRelance){
    if(templateRelance.getCode()==null) return -1;

    TemplateRelance foundedTemplateRelance = findByCode(templateRelance.getCode());
    if(foundedTemplateRelance==null) return -1;
templateRelanceDao.delete(foundedTemplateRelance);
return 1;
}


public List<TemplateRelance> findByCriteria(TemplateRelanceVo templateRelanceVo){

String query = "SELECT o FROM TemplateRelance o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",templateRelanceVo.getId());
            query += SearchUtil.addConstraint( "o", "code","LIKE",templateRelanceVo.getCode());
            query += SearchUtil.addConstraint( "o", "objet","LIKE",templateRelanceVo.getObjet());
            query += SearchUtil.addConstraint( "o", "message","LIKE",templateRelanceVo.getMessage());
            query += SearchUtil.addConstraint( "o", "archive","=",templateRelanceVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",templateRelanceVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",templateRelanceVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",templateRelanceVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",templateRelanceVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",templateRelanceVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",templateRelanceVo.getDateArchivageMin(),templateRelanceVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",templateRelanceVo.getDateCreationMin(),templateRelanceVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TemplateRelance> templateRelances){
        if(ListUtil.isNotEmpty(templateRelances)){
        templateRelances.forEach(e->templateRelanceDao.delete(e));
        }
}
@Override
public void update(List<TemplateRelance> templateRelances){
if(ListUtil.isNotEmpty(templateRelances)){
templateRelances.forEach(e->templateRelanceDao.save(e));
}
}



}
