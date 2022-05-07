package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ModaliteEtude;
import com.ird.faa.dao.ModaliteEtudeDao;
import com.ird.faa.service.admin.facade.ModaliteEtudeAdminService;

import com.ird.faa.ws.rest.provided.vo.ModaliteEtudeVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ModaliteEtudeAdminServiceImpl extends AbstractServiceImpl<ModaliteEtude> implements ModaliteEtudeAdminService {

@Autowired
private ModaliteEtudeDao modaliteEtudeDao;

@Autowired
private ArchivableService<ModaliteEtude> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<ModaliteEtude> findAll(){
        return modaliteEtudeDao.findAll();
}
    @Override
    public ModaliteEtude findByCode(String code){
    if( code==null) return null;
    return modaliteEtudeDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return modaliteEtudeDao.deleteByCode(code);
    }
    @Override
    public ModaliteEtude findByIdOrCode(ModaliteEtude modaliteEtude){
        ModaliteEtude resultat=null;
        if(modaliteEtude != null){
            if(StringUtil.isNotEmpty(modaliteEtude.getId())){
            resultat= modaliteEtudeDao.getOne(modaliteEtude.getId());
            }else if(StringUtil.isNotEmpty(modaliteEtude.getCode())) {
            resultat= modaliteEtudeDao.findByCode(modaliteEtude.getCode());
            }
        }
    return resultat;
    }

@Override
public ModaliteEtude findById(Long id){
if(id==null) return null;
return modaliteEtudeDao.getOne(id);
}

@Override
public ModaliteEtude findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public ModaliteEtude archiver(ModaliteEtude modaliteEtude) {
        if (modaliteEtude.getArchive() == null) {
        modaliteEtude.setArchive(false);
        }
        modaliteEtude.setArchive(true);
        modaliteEtude.setDateArchivage(new Date());
        modaliteEtudeDao.save(modaliteEtude);
        return modaliteEtude;

    }

    @Override
    public ModaliteEtude desarchiver(ModaliteEtude modaliteEtude) {
    if (modaliteEtude.getArchive() == null) {
    modaliteEtude.setArchive(false);
    }
    modaliteEtude.setArchive(false);
    modaliteEtude.setDateArchivage(null);
    modaliteEtudeDao.save(modaliteEtude);
    return modaliteEtude;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(modaliteEtudeDao.findById(id).isPresent())  {
modaliteEtudeDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ModaliteEtude update(ModaliteEtude modaliteEtude){
ModaliteEtude foundedModaliteEtude = findById(modaliteEtude.getId());
if(foundedModaliteEtude==null) return null;
else{
    archivableService.prepare(modaliteEtude);
return  modaliteEtudeDao.save(modaliteEtude);
}
}
private void prepareSave(ModaliteEtude modaliteEtude){
modaliteEtude.setDateCreation(new Date());
if(modaliteEtude.getArchive() == null)
  modaliteEtude.setArchive(false);
if(modaliteEtude.getAdmin() == null)
  modaliteEtude.setAdmin(false);
if(modaliteEtude.getVisible() == null)
  modaliteEtude.setVisible(false);



}

@Override
public ModaliteEtude save (ModaliteEtude modaliteEtude){
prepareSave(modaliteEtude);

ModaliteEtude result =null;
    ModaliteEtude foundedModaliteEtude = findByCode(modaliteEtude.getCode());
   if(foundedModaliteEtude == null){



ModaliteEtude savedModaliteEtude = modaliteEtudeDao.save(modaliteEtude);

result = savedModaliteEtude;
   }

return result;
}

@Override
public List<ModaliteEtude> save(List<ModaliteEtude> modaliteEtudes){
List<ModaliteEtude> list = new ArrayList<>();
for(ModaliteEtude modaliteEtude: modaliteEtudes){
list.add(save(modaliteEtude));
}
return list;
}



@Override
@Transactional
public int delete(ModaliteEtude modaliteEtude){
    if(modaliteEtude.getCode()==null) return -1;

    ModaliteEtude foundedModaliteEtude = findByCode(modaliteEtude.getCode());
    if(foundedModaliteEtude==null) return -1;
modaliteEtudeDao.delete(foundedModaliteEtude);
return 1;
}


public List<ModaliteEtude> findByCriteria(ModaliteEtudeVo modaliteEtudeVo){

String query = "SELECT o FROM ModaliteEtude o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",modaliteEtudeVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",modaliteEtudeVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",modaliteEtudeVo.getCode());
            query += SearchUtil.addConstraint( "o", "description","LIKE",modaliteEtudeVo.getDescription());
            query += SearchUtil.addConstraint( "o", "archive","=",modaliteEtudeVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",modaliteEtudeVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",modaliteEtudeVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",modaliteEtudeVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",modaliteEtudeVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",modaliteEtudeVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",modaliteEtudeVo.getDateArchivageMin(),modaliteEtudeVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",modaliteEtudeVo.getDateCreationMin(),modaliteEtudeVo.getDateCreationMax());
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<ModaliteEtude> modaliteEtudes){
        if(ListUtil.isNotEmpty(modaliteEtudes)){
        modaliteEtudes.forEach(e->modaliteEtudeDao.delete(e));
        }
}
@Override
public void update(List<ModaliteEtude> modaliteEtudes){
if(ListUtil.isNotEmpty(modaliteEtudes)){
modaliteEtudes.forEach(e->modaliteEtudeDao.save(e));
}
}



}
