package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.Contexte;
import com.ird.faa.dao.ContexteDao;
import com.ird.faa.service.admin.facade.ContexteAdminService;

import com.ird.faa.ws.rest.provided.vo.ContexteVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ContexteAdminServiceImpl extends AbstractServiceImpl<Contexte> implements ContexteAdminService {

@Autowired
private ContexteDao contexteDao;

@Autowired
private ArchivableService<Contexte> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<Contexte> findAll(){
        String query = "SELECT o FROM Contexte o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public Contexte findByCode(String code){
    if( code==null) return null;
    return contexteDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return contexteDao.deleteByCode(code);
    }
    @Override
    public Contexte findByIdOrCode(Contexte contexte){
        Contexte resultat=null;
        if(contexte != null){
            if(StringUtil.isNotEmpty(contexte.getId())){
            resultat= contexteDao.getOne(contexte.getId());
            }else if(StringUtil.isNotEmpty(contexte.getCode())) {
            resultat= contexteDao.findByCode(contexte.getCode());
            }
        }
    return resultat;
    }

@Override
public Contexte findById(Long id){
if(id==null) return null;
return contexteDao.getOne(id);
}

@Override
public Contexte findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public Contexte archiver(Contexte contexte) {
        if (contexte.getArchive() == null) {
        contexte.setArchive(false);
        }
        contexte.setArchive(true);
        contexte.setDateArchivage(new Date());
        contexteDao.save(contexte);
        return contexte;

    }

    @Override
    public Contexte desarchiver(Contexte contexte) {
    if (contexte.getArchive() == null) {
    contexte.setArchive(false);
    }
    contexte.setArchive(false);
    contexte.setDateArchivage(null);
    contexteDao.save(contexte);
    return contexte;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(contexteDao.findById(id).isPresent())  {
contexteDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Contexte update(Contexte contexte){
Contexte foundedContexte = findById(contexte.getId());
if(foundedContexte==null) return null;
else{
    archivableService.prepare(contexte);
return  contexteDao.save(contexte);
}
}
private void prepareSave(Contexte contexte){
contexte.setDateCreation(new Date());
if(contexte.getArchive() == null)
  contexte.setArchive(false);
if(contexte.getAdmin() == null)
  contexte.setAdmin(false);
if(contexte.getVisible() == null)
  contexte.setVisible(false);



}

@Override
public Contexte save (Contexte contexte){
prepareSave(contexte);

Contexte result =null;
    Contexte foundedContexte = findByCode(contexte.getCode());
   if(foundedContexte == null){



Contexte savedContexte = contexteDao.save(contexte);

result = savedContexte;
   }

return result;
}

@Override
public List<Contexte> save(List<Contexte> contextes){
List<Contexte> list = new ArrayList<>();
for(Contexte contexte: contextes){
list.add(save(contexte));
}
return list;
}



@Override
@Transactional
public int delete(Contexte contexte){
    if(contexte.getCode()==null) return -1;

    Contexte foundedContexte = findByCode(contexte.getCode());
    if(foundedContexte==null) return -1;
contexteDao.delete(foundedContexte);
return 1;
}


public List<Contexte> findByCriteria(ContexteVo contexteVo){

String query = "SELECT o FROM Contexte o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",contexteVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",contexteVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",contexteVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",contexteVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",contexteVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",contexteVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",contexteVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",contexteVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",contexteVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",contexteVo.getDateArchivageMin(),contexteVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",contexteVo.getDateCreationMin(),contexteVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<Contexte> contextes){
        if(ListUtil.isNotEmpty(contextes)){
        contextes.forEach(e->contexteDao.delete(e));
        }
}
@Override
public void update(List<Contexte> contextes){
if(ListUtil.isNotEmpty(contextes)){
contextes.forEach(e->contexteDao.save(e));
}
}



}
