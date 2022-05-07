package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EntiteAdministrative;
import com.ird.faa.bean.TypeEntiteAdministrative;
import com.ird.faa.dao.EntiteAdministrativeDao;
import com.ird.faa.service.admin.facade.EntiteAdministrativeAdminService;
import com.ird.faa.service.admin.facade.TypeEntiteAdministrativeAdminService;

import com.ird.faa.ws.rest.provided.vo.EntiteAdministrativeVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EntiteAdministrativeAdminServiceImpl extends AbstractServiceImpl<EntiteAdministrative> implements EntiteAdministrativeAdminService {

@Autowired
private EntiteAdministrativeDao entiteAdministrativeDao;

@Autowired
private ArchivableService<EntiteAdministrative> archivableService;
        @Autowired
        private TypeEntiteAdministrativeAdminService typeEntiteAdministrativeService ;


@Autowired
private EntityManager entityManager;


@Override
public List<EntiteAdministrative> findAll(){
        String query = "SELECT o FROM EntiteAdministrative o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}

        @Override
        public List<EntiteAdministrative> findByTypeEntiteAdministrativeCode(String code){
        return entiteAdministrativeDao.findByTypeEntiteAdministrativeCode(code);
        }

        @Override
        @Transactional
        public int deleteByTypeEntiteAdministrativeCode(String code){
        return entiteAdministrativeDao.deleteByTypeEntiteAdministrativeCode(code);
        }

        @Override
        public List<EntiteAdministrative> findByTypeEntiteAdministrativeId(Long id){
        return entiteAdministrativeDao.findByTypeEntiteAdministrativeId(id);
        }

        @Override
        @Transactional
        public int deleteByTypeEntiteAdministrativeId(Long id){
        return entiteAdministrativeDao.deleteByTypeEntiteAdministrativeId(id);
        }

    @Override
    public EntiteAdministrative findByCode(String code){
    if( code==null) return null;
    return entiteAdministrativeDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return entiteAdministrativeDao.deleteByCode(code);
    }
    @Override
    public EntiteAdministrative findByIdOrCode(EntiteAdministrative entiteAdministrative){
        EntiteAdministrative resultat=null;
        if(entiteAdministrative != null){
            if(StringUtil.isNotEmpty(entiteAdministrative.getId())){
            resultat= entiteAdministrativeDao.getOne(entiteAdministrative.getId());
            }else if(StringUtil.isNotEmpty(entiteAdministrative.getCode())) {
            resultat= entiteAdministrativeDao.findByCode(entiteAdministrative.getCode());
            }
        }
    return resultat;
    }

@Override
public EntiteAdministrative findById(Long id){
if(id==null) return null;
return entiteAdministrativeDao.getOne(id);
}

@Override
public EntiteAdministrative findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public EntiteAdministrative archiver(EntiteAdministrative entiteAdministrative) {
        if (entiteAdministrative.getArchive() == null) {
        entiteAdministrative.setArchive(false);
        }
        entiteAdministrative.setArchive(true);
        entiteAdministrative.setDateArchivage(new Date());
        entiteAdministrativeDao.save(entiteAdministrative);
        return entiteAdministrative;

    }

    @Override
    public EntiteAdministrative desarchiver(EntiteAdministrative entiteAdministrative) {
    if (entiteAdministrative.getArchive() == null) {
    entiteAdministrative.setArchive(false);
    }
    entiteAdministrative.setArchive(false);
    entiteAdministrative.setDateArchivage(null);
    entiteAdministrativeDao.save(entiteAdministrative);
    return entiteAdministrative;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(entiteAdministrativeDao.findById(id).isPresent())  {
entiteAdministrativeDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EntiteAdministrative update(EntiteAdministrative entiteAdministrative){
EntiteAdministrative foundedEntiteAdministrative = findById(entiteAdministrative.getId());
if(foundedEntiteAdministrative==null) return null;
else{
    archivableService.prepare(entiteAdministrative);
return  entiteAdministrativeDao.save(entiteAdministrative);
}
}
private void prepareSave(EntiteAdministrative entiteAdministrative){
entiteAdministrative.setDateCreation(new Date());
if(entiteAdministrative.getArchive() == null)
  entiteAdministrative.setArchive(false);
if(entiteAdministrative.getAdmin() == null)
  entiteAdministrative.setAdmin(false);
if(entiteAdministrative.getVisible() == null)
  entiteAdministrative.setVisible(false);



}

@Override
public EntiteAdministrative save (EntiteAdministrative entiteAdministrative){
prepareSave(entiteAdministrative);

EntiteAdministrative result =null;
    EntiteAdministrative foundedEntiteAdministrative = findByCode(entiteAdministrative.getCode());
   if(foundedEntiteAdministrative == null){


    findTypeEntiteAdministrative(entiteAdministrative);

EntiteAdministrative savedEntiteAdministrative = entiteAdministrativeDao.save(entiteAdministrative);

result = savedEntiteAdministrative;
   }

return result;
}

@Override
public List<EntiteAdministrative> save(List<EntiteAdministrative> entiteAdministratives){
List<EntiteAdministrative> list = new ArrayList<>();
for(EntiteAdministrative entiteAdministrative: entiteAdministratives){
list.add(save(entiteAdministrative));
}
return list;
}



@Override
@Transactional
public int delete(EntiteAdministrative entiteAdministrative){
    if(entiteAdministrative.getCode()==null) return -1;

    EntiteAdministrative foundedEntiteAdministrative = findByCode(entiteAdministrative.getCode());
    if(foundedEntiteAdministrative==null) return -1;
entiteAdministrativeDao.delete(foundedEntiteAdministrative);
return 1;
}


public List<EntiteAdministrative> findByCriteria(EntiteAdministrativeVo entiteAdministrativeVo){

String query = "SELECT o FROM EntiteAdministrative o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",entiteAdministrativeVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",entiteAdministrativeVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",entiteAdministrativeVo.getCode());
            query += SearchUtil.addConstraint( "o", "identifiantNational","LIKE",entiteAdministrativeVo.getIdentifiantNational());
            query += SearchUtil.addConstraint( "o", "siteWeb","LIKE",entiteAdministrativeVo.getSiteWeb());
            query += SearchUtil.addConstraint( "o", "libelleCourt","LIKE",entiteAdministrativeVo.getLibelleCourt());
            query += SearchUtil.addConstraint( "o", "libelleLong","LIKE",entiteAdministrativeVo.getLibelleLong());
            query += SearchUtil.addConstraint( "o", "description","LIKE",entiteAdministrativeVo.getDescription());
            query += SearchUtil.addConstraint( "o", "archive","=",entiteAdministrativeVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",entiteAdministrativeVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",entiteAdministrativeVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",entiteAdministrativeVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",entiteAdministrativeVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",entiteAdministrativeVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",entiteAdministrativeVo.getDateArchivageMin(),entiteAdministrativeVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",entiteAdministrativeVo.getDateCreationMin(),entiteAdministrativeVo.getDateCreationMax());
    if(entiteAdministrativeVo.getTypeEntiteAdministrativeVo()!=null){
        query += SearchUtil.addConstraint( "o", "typeEntiteAdministrative.id","=",entiteAdministrativeVo.getTypeEntiteAdministrativeVo().getId());
            query += SearchUtil.addConstraint( "o", "typeEntiteAdministrative.code","LIKE",entiteAdministrativeVo.getTypeEntiteAdministrativeVo().getCode());
    }

query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}

    private void findTypeEntiteAdministrative(EntiteAdministrative entiteAdministrative){
        TypeEntiteAdministrative loadedTypeEntiteAdministrative =typeEntiteAdministrativeService.findByIdOrCode(entiteAdministrative.getTypeEntiteAdministrative());

    if(loadedTypeEntiteAdministrative==null ) {
        return;
    }
    entiteAdministrative.setTypeEntiteAdministrative(loadedTypeEntiteAdministrative);
    }

@Override
@Transactional
public void delete(List<EntiteAdministrative> entiteAdministratives){
        if(ListUtil.isNotEmpty(entiteAdministratives)){
        entiteAdministratives.forEach(e->entiteAdministrativeDao.delete(e));
        }
}
@Override
public void update(List<EntiteAdministrative> entiteAdministratives){
if(ListUtil.isNotEmpty(entiteAdministratives)){
entiteAdministratives.forEach(e->entiteAdministrativeDao.save(e));
}
}



}
