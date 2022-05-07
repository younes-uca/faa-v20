package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.Modalite;
import com.ird.faa.dao.ModaliteDao;
import com.ird.faa.service.admin.facade.ModaliteAdminService;

import com.ird.faa.ws.rest.provided.vo.ModaliteVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ModaliteAdminServiceImpl extends AbstractServiceImpl<Modalite> implements ModaliteAdminService {

@Autowired
private ModaliteDao modaliteDao;

@Autowired
private ArchivableService<Modalite> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<Modalite> findAll(){
        return modaliteDao.findAll();
}
    @Override
    public Modalite findByCode(String code){
    if( code==null) return null;
    return modaliteDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return modaliteDao.deleteByCode(code);
    }
    @Override
    public Modalite findByIdOrCode(Modalite modalite){
        Modalite resultat=null;
        if(modalite != null){
            if(StringUtil.isNotEmpty(modalite.getId())){
            resultat= modaliteDao.getOne(modalite.getId());
            }else if(StringUtil.isNotEmpty(modalite.getCode())) {
            resultat= modaliteDao.findByCode(modalite.getCode());
            }
        }
    return resultat;
    }

@Override
public Modalite findById(Long id){
if(id==null) return null;
return modaliteDao.getOne(id);
}

@Override
public Modalite findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public Modalite archiver(Modalite modalite) {
        if (modalite.getArchive() == null) {
        modalite.setArchive(false);
        }
        modalite.setArchive(true);
        modalite.setDateArchivage(new Date());
        modaliteDao.save(modalite);
        return modalite;

    }

    @Override
    public Modalite desarchiver(Modalite modalite) {
    if (modalite.getArchive() == null) {
    modalite.setArchive(false);
    }
    modalite.setArchive(false);
    modalite.setDateArchivage(null);
    modaliteDao.save(modalite);
    return modalite;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(modaliteDao.findById(id).isPresent())  {
modaliteDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Modalite update(Modalite modalite){
Modalite foundedModalite = findById(modalite.getId());
if(foundedModalite==null) return null;
else{
    archivableService.prepare(modalite);
return  modaliteDao.save(modalite);
}
}
private void prepareSave(Modalite modalite){
modalite.setDateCreation(new Date());
if(modalite.getArchive() == null)
  modalite.setArchive(false);
if(modalite.getAdmin() == null)
  modalite.setAdmin(false);
if(modalite.getVisible() == null)
  modalite.setVisible(false);



}

@Override
public Modalite save (Modalite modalite){
prepareSave(modalite);

Modalite result =null;
    Modalite foundedModalite = findByCode(modalite.getCode());
   if(foundedModalite == null){



Modalite savedModalite = modaliteDao.save(modalite);

result = savedModalite;
   }

return result;
}

@Override
public List<Modalite> save(List<Modalite> modalites){
List<Modalite> list = new ArrayList<>();
for(Modalite modalite: modalites){
list.add(save(modalite));
}
return list;
}



@Override
@Transactional
public int delete(Modalite modalite){
    if(modalite.getCode()==null) return -1;

    Modalite foundedModalite = findByCode(modalite.getCode());
    if(foundedModalite==null) return -1;
modaliteDao.delete(foundedModalite);
return 1;
}


public List<Modalite> findByCriteria(ModaliteVo modaliteVo){

String query = "SELECT o FROM Modalite o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",modaliteVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",modaliteVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",modaliteVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",modaliteVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",modaliteVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",modaliteVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",modaliteVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",modaliteVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",modaliteVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",modaliteVo.getDateArchivageMin(),modaliteVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",modaliteVo.getDateCreationMin(),modaliteVo.getDateCreationMax());
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<Modalite> modalites){
        if(ListUtil.isNotEmpty(modalites)){
        modalites.forEach(e->modaliteDao.delete(e));
        }
}
@Override
public void update(List<Modalite> modalites){
if(ListUtil.isNotEmpty(modalites)){
modalites.forEach(e->modaliteDao.save(e));
}
}



}
