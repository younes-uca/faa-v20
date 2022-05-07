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
import com.ird.faa.bean.StructureIrd;
import com.ird.faa.dao.StructureIrdDao;
import com.ird.faa.service.chercheur.facade.StructureIrdChercheurService;

import com.ird.faa.ws.rest.provided.vo.StructureIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class StructureIrdChercheurServiceImpl extends AbstractServiceImpl<StructureIrd> implements StructureIrdChercheurService {

@Autowired
private StructureIrdDao structureIrdDao;

@Autowired
private ArchivableService<StructureIrd> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<StructureIrd> findAll(){
    String query = "SELECT o FROM StructureIrd o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public StructureIrd findByCode(String code){
    if( code==null) return null;
    return structureIrdDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return structureIrdDao.deleteByCode(code);
    }
    @Override
    public StructureIrd findByIdOrCode(StructureIrd structureIrd){
        StructureIrd resultat=null;
        if(structureIrd != null){
            if(StringUtil.isNotEmpty(structureIrd.getId())){
            resultat= structureIrdDao.getOne(structureIrd.getId());
            }else if(StringUtil.isNotEmpty(structureIrd.getCode())) {
            resultat= structureIrdDao.findByCode(structureIrd.getCode());
            }
        }
    return resultat;
    }

@Override
public StructureIrd findById(Long id){
if(id==null) return null;
return structureIrdDao.getOne(id);
}

@Override
public StructureIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(structureIrdDao.findById(id).isPresent())  {
structureIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public StructureIrd update(StructureIrd structureIrd){
StructureIrd foundedStructureIrd = findById(structureIrd.getId());
if(foundedStructureIrd==null) return null;
else{
    archivableService.prepare(structureIrd);
return  structureIrdDao.save(structureIrd);
}
}
private void prepareSave(StructureIrd structureIrd){
structureIrd.setDateCreation(new Date());
if(structureIrd.getArchive() == null)
  structureIrd.setArchive(false);
if(structureIrd.getAdmin() == null)
  structureIrd.setAdmin(false);
if(structureIrd.getVisible() == null)
  structureIrd.setVisible(false);



}

@Override
public StructureIrd save (StructureIrd structureIrd){
prepareSave(structureIrd);

StructureIrd result =null;
    StructureIrd foundedStructureIrd = findByCode(structureIrd.getCode());
   if(foundedStructureIrd == null){



StructureIrd savedStructureIrd = structureIrdDao.save(structureIrd);

result = savedStructureIrd;
   }

return result;
}

@Override
public List<StructureIrd> save(List<StructureIrd> structureIrds){
List<StructureIrd> list = new ArrayList<>();
for(StructureIrd structureIrd: structureIrds){
list.add(save(structureIrd));
}
return list;
}



@Override
@Transactional
public int delete(StructureIrd structureIrd){
    if(structureIrd.getCode()==null) return -1;

    StructureIrd foundedStructureIrd = findByCode(structureIrd.getCode());
    if(foundedStructureIrd==null) return -1;
structureIrdDao.delete(foundedStructureIrd);
return 1;
}


public List<StructureIrd> findByCriteria(StructureIrdVo structureIrdVo){

String query = "SELECT o FROM StructureIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",structureIrdVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",structureIrdVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",structureIrdVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",structureIrdVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",structureIrdVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",structureIrdVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",structureIrdVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",structureIrdVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",structureIrdVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",structureIrdVo.getDateArchivageMin(),structureIrdVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",structureIrdVo.getDateCreationMin(),structureIrdVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<StructureIrd> structureIrds){
        if(ListUtil.isNotEmpty(structureIrds)){
        structureIrds.forEach(e->structureIrdDao.delete(e));
        }
}
@Override
public void update(List<StructureIrd> structureIrds){
if(ListUtil.isNotEmpty(structureIrds)){
structureIrds.forEach(e->structureIrdDao.save(e));
}
}



}
