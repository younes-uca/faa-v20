package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.DepartementScientifique;
import com.ird.faa.dao.DepartementScientifiqueDao;
import com.ird.faa.service.admin.facade.DepartementScientifiqueAdminService;

import com.ird.faa.ws.rest.provided.vo.DepartementScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class DepartementScientifiqueAdminServiceImpl extends AbstractServiceImpl<DepartementScientifique> implements DepartementScientifiqueAdminService {

@Autowired
private DepartementScientifiqueDao departementScientifiqueDao;

@Autowired
private ArchivableService<DepartementScientifique> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<DepartementScientifique> findAll(){
        String query = "SELECT o FROM DepartementScientifique o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public DepartementScientifique findByCode(String code){
    if( code==null) return null;
    return departementScientifiqueDao.findByCode(code);
    }




    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return departementScientifiqueDao.deleteByCode(code);
    }
    @Override
    public DepartementScientifique findByIdOrCode(DepartementScientifique departementScientifique){
        DepartementScientifique resultat=null;
        if(departementScientifique != null){
            if(StringUtil.isNotEmpty(departementScientifique.getId())){
            resultat= departementScientifiqueDao.getOne(departementScientifique.getId());
            }else if(StringUtil.isNotEmpty(departementScientifique.getCode())) {
            resultat= departementScientifiqueDao.findByCode(departementScientifique.getCode());
            }
        }
    return resultat;
    }

@Override
public DepartementScientifique findById(Long id){
if(id==null) return null;
return departementScientifiqueDao.getOne(id);
}

@Override
public DepartementScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public DepartementScientifique archiver(DepartementScientifique departementScientifique) {
        if (departementScientifique.getArchive() == null) {
        departementScientifique.setArchive(false);
        }
        departementScientifique.setArchive(true);
        departementScientifique.setDateArchivage(new Date());
        departementScientifiqueDao.save(departementScientifique);
        return departementScientifique;

    }

    @Override
    public DepartementScientifique desarchiver(DepartementScientifique departementScientifique) {
    if (departementScientifique.getArchive() == null) {
    departementScientifique.setArchive(false);
    }
    departementScientifique.setArchive(false);
    departementScientifique.setDateArchivage(null);
    departementScientifiqueDao.save(departementScientifique);
    return departementScientifique;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(departementScientifiqueDao.findById(id).isPresent())  {
departementScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public DepartementScientifique update(DepartementScientifique departementScientifique){
DepartementScientifique foundedDepartementScientifique = findById(departementScientifique.getId());
if(foundedDepartementScientifique==null) return null;
else{
    archivableService.prepare(departementScientifique);
return  departementScientifiqueDao.save(departementScientifique);
}
}
private void prepareSave(DepartementScientifique departementScientifique){
departementScientifique.setDateCreation(new Date());
if(departementScientifique.getArchive() == null)
  departementScientifique.setArchive(false);
if(departementScientifique.getAdmin() == null)
  departementScientifique.setAdmin(false);
if(departementScientifique.getVisible() == null)
  departementScientifique.setVisible(false);



}

@Override
public DepartementScientifique save (DepartementScientifique departementScientifique){
prepareSave(departementScientifique);

DepartementScientifique result =null;
    DepartementScientifique foundedDepartementScientifique = findByCode(departementScientifique.getCode());
   if(foundedDepartementScientifique == null){



DepartementScientifique savedDepartementScientifique = departementScientifiqueDao.save(departementScientifique);

result = savedDepartementScientifique;
   }

return result;
}

@Override
public List<DepartementScientifique> save(List<DepartementScientifique> departementScientifiques){
List<DepartementScientifique> list = new ArrayList<>();
for(DepartementScientifique departementScientifique: departementScientifiques){
list.add(save(departementScientifique));
}
return list;
}



@Override
@Transactional
public int delete(DepartementScientifique departementScientifique){
    if(departementScientifique.getCode()==null) return -1;

    DepartementScientifique foundedDepartementScientifique = findByCode(departementScientifique.getCode());
    if(foundedDepartementScientifique==null) return -1;
departementScientifiqueDao.delete(foundedDepartementScientifique);
return 1;
}


public List<DepartementScientifique> findByCriteria(DepartementScientifiqueVo departementScientifiqueVo){

String query = "SELECT o FROM DepartementScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",departementScientifiqueVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",departementScientifiqueVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",departementScientifiqueVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",departementScientifiqueVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",departementScientifiqueVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",departementScientifiqueVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",departementScientifiqueVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",departementScientifiqueVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",departementScientifiqueVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",departementScientifiqueVo.getDateArchivageMin(),departementScientifiqueVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",departementScientifiqueVo.getDateCreationMin(),departementScientifiqueVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<DepartementScientifique> departementScientifiques){
        if(ListUtil.isNotEmpty(departementScientifiques)){
        departementScientifiques.forEach(e->departementScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<DepartementScientifique> departementScientifiques){
if(ListUtil.isNotEmpty(departementScientifiques)){
departementScientifiques.forEach(e->departementScientifiqueDao.save(e));
}
}



}
