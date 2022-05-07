package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ModeDiffusion;
import com.ird.faa.bean.TypeSavoir;
import com.ird.faa.dao.ModeDiffusionDao;
import com.ird.faa.service.admin.facade.ModeDiffusionAdminService;
import com.ird.faa.service.admin.facade.TypeSavoirAdminService;

import com.ird.faa.ws.rest.provided.vo.ModeDiffusionVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ModeDiffusionAdminServiceImpl extends AbstractServiceImpl<ModeDiffusion> implements ModeDiffusionAdminService {

@Autowired
private ModeDiffusionDao modeDiffusionDao;

@Autowired
private ArchivableService<ModeDiffusion> archivableService;
        @Autowired
        private TypeSavoirAdminService typeSavoirService ;


@Autowired
private EntityManager entityManager;


@Override
public List<ModeDiffusion> findAll(){
        String query = "SELECT o FROM ModeDiffusion o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}

        @Override
        public List<ModeDiffusion> findByTypeSavoirCode(String code){
        return modeDiffusionDao.findByTypeSavoirCode(code);
        }

        @Override
        @Transactional
        public int deleteByTypeSavoirCode(String code){
        return modeDiffusionDao.deleteByTypeSavoirCode(code);
        }

        @Override
        public List<ModeDiffusion> findByTypeSavoirId(Long id){
        return modeDiffusionDao.findByTypeSavoirId(id);
        }

        @Override
        @Transactional
        public int deleteByTypeSavoirId(Long id){
        return modeDiffusionDao.deleteByTypeSavoirId(id);
        }

    @Override
    public ModeDiffusion findByCode(String code){
    if( code==null) return null;
    return modeDiffusionDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return modeDiffusionDao.deleteByCode(code);
    }
    @Override
    public ModeDiffusion findByIdOrCode(ModeDiffusion modeDiffusion){
        ModeDiffusion resultat=null;
        if(modeDiffusion != null){
            if(StringUtil.isNotEmpty(modeDiffusion.getId())){
            resultat= modeDiffusionDao.getOne(modeDiffusion.getId());
            }else if(StringUtil.isNotEmpty(modeDiffusion.getCode())) {
            resultat= modeDiffusionDao.findByCode(modeDiffusion.getCode());
            }
        }
    return resultat;
    }

@Override
public ModeDiffusion findById(Long id){
if(id==null) return null;
return modeDiffusionDao.getOne(id);
}

@Override
public ModeDiffusion findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public ModeDiffusion archiver(ModeDiffusion modeDiffusion) {
        if (modeDiffusion.getArchive() == null) {
        modeDiffusion.setArchive(false);
        }
        modeDiffusion.setArchive(true);
        modeDiffusion.setDateArchivage(new Date());
        modeDiffusionDao.save(modeDiffusion);
        return modeDiffusion;

    }

    @Override
    public ModeDiffusion desarchiver(ModeDiffusion modeDiffusion) {
    if (modeDiffusion.getArchive() == null) {
    modeDiffusion.setArchive(false);
    }
    modeDiffusion.setArchive(false);
    modeDiffusion.setDateArchivage(null);
    modeDiffusionDao.save(modeDiffusion);
    return modeDiffusion;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(modeDiffusionDao.findById(id).isPresent())  {
modeDiffusionDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ModeDiffusion update(ModeDiffusion modeDiffusion){
ModeDiffusion foundedModeDiffusion = findById(modeDiffusion.getId());
if(foundedModeDiffusion==null) return null;
else{
    archivableService.prepare(modeDiffusion);
return  modeDiffusionDao.save(modeDiffusion);
}
}
private void prepareSave(ModeDiffusion modeDiffusion){
modeDiffusion.setDateCreation(new Date());
if(modeDiffusion.getArchive() == null)
  modeDiffusion.setArchive(false);
if(modeDiffusion.getAdmin() == null)
  modeDiffusion.setAdmin(false);
if(modeDiffusion.getVisible() == null)
  modeDiffusion.setVisible(false);



}

@Override
public ModeDiffusion save (ModeDiffusion modeDiffusion){
prepareSave(modeDiffusion);

ModeDiffusion result =null;
    ModeDiffusion foundedModeDiffusion = findByCode(modeDiffusion.getCode());
   if(foundedModeDiffusion == null){


    findTypeSavoir(modeDiffusion);

ModeDiffusion savedModeDiffusion = modeDiffusionDao.save(modeDiffusion);

result = savedModeDiffusion;
   }

return result;
}

@Override
public List<ModeDiffusion> save(List<ModeDiffusion> modeDiffusions){
List<ModeDiffusion> list = new ArrayList<>();
for(ModeDiffusion modeDiffusion: modeDiffusions){
list.add(save(modeDiffusion));
}
return list;
}



@Override
@Transactional
public int delete(ModeDiffusion modeDiffusion){
    if(modeDiffusion.getCode()==null) return -1;

    ModeDiffusion foundedModeDiffusion = findByCode(modeDiffusion.getCode());
    if(foundedModeDiffusion==null) return -1;
modeDiffusionDao.delete(foundedModeDiffusion);
return 1;
}


public List<ModeDiffusion> findByCriteria(ModeDiffusionVo modeDiffusionVo){

String query = "SELECT o FROM ModeDiffusion o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",modeDiffusionVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",modeDiffusionVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",modeDiffusionVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",modeDiffusionVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",modeDiffusionVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",modeDiffusionVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",modeDiffusionVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",modeDiffusionVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",modeDiffusionVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",modeDiffusionVo.getDateArchivageMin(),modeDiffusionVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",modeDiffusionVo.getDateCreationMin(),modeDiffusionVo.getDateCreationMax());
    if(modeDiffusionVo.getTypeSavoirVo()!=null){
        query += SearchUtil.addConstraint( "o", "typeSavoir.id","=",modeDiffusionVo.getTypeSavoirVo().getId());
            query += SearchUtil.addConstraint( "o", "typeSavoir.code","LIKE",modeDiffusionVo.getTypeSavoirVo().getCode());
    }

query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}

    private void findTypeSavoir(ModeDiffusion modeDiffusion){
        TypeSavoir loadedTypeSavoir =typeSavoirService.findByIdOrCode(modeDiffusion.getTypeSavoir());

    if(loadedTypeSavoir==null ) {
        return;
    }
    modeDiffusion.setTypeSavoir(loadedTypeSavoir);
    }

@Override
@Transactional
public void delete(List<ModeDiffusion> modeDiffusions){
        if(ListUtil.isNotEmpty(modeDiffusions)){
        modeDiffusions.forEach(e->modeDiffusionDao.delete(e));
        }
}
@Override
public void update(List<ModeDiffusion> modeDiffusions){
if(ListUtil.isNotEmpty(modeDiffusions)){
modeDiffusions.forEach(e->modeDiffusionDao.save(e));
}
}



}
