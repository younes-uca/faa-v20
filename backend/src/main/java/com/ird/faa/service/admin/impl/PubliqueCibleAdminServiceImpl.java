package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.PubliqueCible;
import com.ird.faa.dao.PubliqueCibleDao;
import com.ird.faa.service.admin.facade.PubliqueCibleAdminService;

import com.ird.faa.ws.rest.provided.vo.PubliqueCibleVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class PubliqueCibleAdminServiceImpl extends AbstractServiceImpl<PubliqueCible> implements PubliqueCibleAdminService {

@Autowired
private PubliqueCibleDao publiqueCibleDao;

@Autowired
private ArchivableService<PubliqueCible> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<PubliqueCible> findAll(){
        return publiqueCibleDao.findAll();
}
    @Override
    public PubliqueCible findByCode(String code){
    if( code==null) return null;
    return publiqueCibleDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return publiqueCibleDao.deleteByCode(code);
    }
    @Override
    public PubliqueCible findByIdOrCode(PubliqueCible publiqueCible){
        PubliqueCible resultat=null;
        if(publiqueCible != null){
            if(StringUtil.isNotEmpty(publiqueCible.getId())){
            resultat= publiqueCibleDao.getOne(publiqueCible.getId());
            }else if(StringUtil.isNotEmpty(publiqueCible.getCode())) {
            resultat= publiqueCibleDao.findByCode(publiqueCible.getCode());
            }
        }
    return resultat;
    }

@Override
public PubliqueCible findById(Long id){
if(id==null) return null;
return publiqueCibleDao.getOne(id);
}

@Override
public PubliqueCible findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public PubliqueCible archiver(PubliqueCible publiqueCible) {
        if (publiqueCible.getArchive() == null) {
        publiqueCible.setArchive(false);
        }
        publiqueCible.setArchive(true);
        publiqueCible.setDateArchivage(new Date());
        publiqueCibleDao.save(publiqueCible);
        return publiqueCible;

    }

    @Override
    public PubliqueCible desarchiver(PubliqueCible publiqueCible) {
    if (publiqueCible.getArchive() == null) {
    publiqueCible.setArchive(false);
    }
    publiqueCible.setArchive(false);
    publiqueCible.setDateArchivage(null);
    publiqueCibleDao.save(publiqueCible);
    return publiqueCible;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(publiqueCibleDao.findById(id).isPresent())  {
publiqueCibleDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public PubliqueCible update(PubliqueCible publiqueCible){
PubliqueCible foundedPubliqueCible = findById(publiqueCible.getId());
if(foundedPubliqueCible==null) return null;
else{
    archivableService.prepare(publiqueCible);
return  publiqueCibleDao.save(publiqueCible);
}
}
private void prepareSave(PubliqueCible publiqueCible){
publiqueCible.setDateCreation(new Date());
if(publiqueCible.getArchive() == null)
  publiqueCible.setArchive(false);
if(publiqueCible.getAdmin() == null)
  publiqueCible.setAdmin(false);
if(publiqueCible.getVisible() == null)
  publiqueCible.setVisible(false);



}

@Override
public PubliqueCible save (PubliqueCible publiqueCible){
prepareSave(publiqueCible);

PubliqueCible result =null;
    PubliqueCible foundedPubliqueCible = findByCode(publiqueCible.getCode());
   if(foundedPubliqueCible == null){



PubliqueCible savedPubliqueCible = publiqueCibleDao.save(publiqueCible);

result = savedPubliqueCible;
   }

return result;
}

@Override
public List<PubliqueCible> save(List<PubliqueCible> publiqueCibles){
List<PubliqueCible> list = new ArrayList<>();
for(PubliqueCible publiqueCible: publiqueCibles){
list.add(save(publiqueCible));
}
return list;
}



@Override
@Transactional
public int delete(PubliqueCible publiqueCible){
    if(publiqueCible.getCode()==null) return -1;

    PubliqueCible foundedPubliqueCible = findByCode(publiqueCible.getCode());
    if(foundedPubliqueCible==null) return -1;
publiqueCibleDao.delete(foundedPubliqueCible);
return 1;
}


public List<PubliqueCible> findByCriteria(PubliqueCibleVo publiqueCibleVo){

String query = "SELECT o FROM PubliqueCible o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",publiqueCibleVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",publiqueCibleVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",publiqueCibleVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",publiqueCibleVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",publiqueCibleVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",publiqueCibleVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",publiqueCibleVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",publiqueCibleVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",publiqueCibleVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",publiqueCibleVo.getDateArchivageMin(),publiqueCibleVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",publiqueCibleVo.getDateCreationMin(),publiqueCibleVo.getDateCreationMax());
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<PubliqueCible> publiqueCibles){
        if(ListUtil.isNotEmpty(publiqueCibles)){
        publiqueCibles.forEach(e->publiqueCibleDao.delete(e));
        }
}
@Override
public void update(List<PubliqueCible> publiqueCibles){
if(ListUtil.isNotEmpty(publiqueCibles)){
publiqueCibles.forEach(e->publiqueCibleDao.save(e));
}
}



}
