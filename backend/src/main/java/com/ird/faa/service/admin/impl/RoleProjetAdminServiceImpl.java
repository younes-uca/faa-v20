package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.RoleProjet;
import com.ird.faa.dao.RoleProjetDao;
import com.ird.faa.service.admin.facade.RoleProjetAdminService;

import com.ird.faa.ws.rest.provided.vo.RoleProjetVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class RoleProjetAdminServiceImpl extends AbstractServiceImpl<RoleProjet> implements RoleProjetAdminService {

@Autowired
private RoleProjetDao roleProjetDao;

@Autowired
private ArchivableService<RoleProjet> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<RoleProjet> findAll(){
        String query = "SELECT o FROM RoleProjet o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public RoleProjet findByCode(String code){
    if( code==null) return null;
    return roleProjetDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return roleProjetDao.deleteByCode(code);
    }
    @Override
    public RoleProjet findByIdOrCode(RoleProjet roleProjet){
        RoleProjet resultat=null;
        if(roleProjet != null){
            if(StringUtil.isNotEmpty(roleProjet.getId())){
            resultat= roleProjetDao.getOne(roleProjet.getId());
            }else if(StringUtil.isNotEmpty(roleProjet.getCode())) {
            resultat= roleProjetDao.findByCode(roleProjet.getCode());
            }
        }
    return resultat;
    }

@Override
public RoleProjet findById(Long id){
if(id==null) return null;
return roleProjetDao.getOne(id);
}

@Override
public RoleProjet findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public RoleProjet archiver(RoleProjet roleProjet) {
        if (roleProjet.getArchive() == null) {
        roleProjet.setArchive(false);
        }
        roleProjet.setArchive(true);
        roleProjet.setDateArchivage(new Date());
        roleProjetDao.save(roleProjet);
        return roleProjet;

    }

    @Override
    public RoleProjet desarchiver(RoleProjet roleProjet) {
    if (roleProjet.getArchive() == null) {
    roleProjet.setArchive(false);
    }
    roleProjet.setArchive(false);
    roleProjet.setDateArchivage(null);
    roleProjetDao.save(roleProjet);
    return roleProjet;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(roleProjetDao.findById(id).isPresent())  {
roleProjetDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public RoleProjet update(RoleProjet roleProjet){
RoleProjet foundedRoleProjet = findById(roleProjet.getId());
if(foundedRoleProjet==null) return null;
else{
    archivableService.prepare(roleProjet);
return  roleProjetDao.save(roleProjet);
}
}
private void prepareSave(RoleProjet roleProjet){
roleProjet.setDateCreation(new Date());
if(roleProjet.getArchive() == null)
  roleProjet.setArchive(false);
if(roleProjet.getAdmin() == null)
  roleProjet.setAdmin(false);
if(roleProjet.getVisible() == null)
  roleProjet.setVisible(false);



}

@Override
public RoleProjet save (RoleProjet roleProjet){
prepareSave(roleProjet);

RoleProjet result =null;
    RoleProjet foundedRoleProjet = findByCode(roleProjet.getCode());
   if(foundedRoleProjet == null){



RoleProjet savedRoleProjet = roleProjetDao.save(roleProjet);

result = savedRoleProjet;
   }

return result;
}

@Override
public List<RoleProjet> save(List<RoleProjet> roleProjets){
List<RoleProjet> list = new ArrayList<>();
for(RoleProjet roleProjet: roleProjets){
list.add(save(roleProjet));
}
return list;
}



@Override
@Transactional
public int delete(RoleProjet roleProjet){
    if(roleProjet.getCode()==null) return -1;

    RoleProjet foundedRoleProjet = findByCode(roleProjet.getCode());
    if(foundedRoleProjet==null) return -1;
roleProjetDao.delete(foundedRoleProjet);
return 1;
}


public List<RoleProjet> findByCriteria(RoleProjetVo roleProjetVo){

String query = "SELECT o FROM RoleProjet o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",roleProjetVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",roleProjetVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",roleProjetVo.getCode());
            query += SearchUtil.addConstraint( "o", "description","LIKE",roleProjetVo.getDescription());
            query += SearchUtil.addConstraint( "o", "archive","=",roleProjetVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",roleProjetVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",roleProjetVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",roleProjetVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",roleProjetVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",roleProjetVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",roleProjetVo.getDateArchivageMin(),roleProjetVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",roleProjetVo.getDateCreationMin(),roleProjetVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<RoleProjet> roleProjets){
        if(ListUtil.isNotEmpty(roleProjets)){
        roleProjets.forEach(e->roleProjetDao.delete(e));
        }
}
@Override
public void update(List<RoleProjet> roleProjets){
if(ListUtil.isNotEmpty(roleProjets)){
roleProjets.forEach(e->roleProjetDao.save(e));
}
}



}
