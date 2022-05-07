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
import com.ird.faa.bean.InstrumentIrd;
import com.ird.faa.bean.TypeInstrumentIrd;
import com.ird.faa.dao.InstrumentIrdDao;
import com.ird.faa.service.chercheur.facade.InstrumentIrdChercheurService;
import com.ird.faa.service.chercheur.facade.TypeInstrumentIrdChercheurService;

import com.ird.faa.ws.rest.provided.vo.InstrumentIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class InstrumentIrdChercheurServiceImpl extends AbstractServiceImpl<InstrumentIrd> implements InstrumentIrdChercheurService {

@Autowired
private InstrumentIrdDao instrumentIrdDao;

@Autowired
private ArchivableService<InstrumentIrd> archivableService;
        @Autowired
        private TypeInstrumentIrdChercheurService typeInstrumentIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<InstrumentIrd> findAll(){
    String query = "SELECT o FROM InstrumentIrd o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}

        @Override
        public List<InstrumentIrd> findByTypeInstrumentIrdCode(String code){
        return instrumentIrdDao.findByTypeInstrumentIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByTypeInstrumentIrdCode(String code){
        return instrumentIrdDao.deleteByTypeInstrumentIrdCode(code);
        }

        @Override
        public List<InstrumentIrd> findByTypeInstrumentIrdId(Long id){
        return instrumentIrdDao.findByTypeInstrumentIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByTypeInstrumentIrdId(Long id){
        return instrumentIrdDao.deleteByTypeInstrumentIrdId(id);
        }

    @Override
    public InstrumentIrd findByCode(String code){
    if( code==null) return null;
    return instrumentIrdDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return instrumentIrdDao.deleteByCode(code);
    }
    @Override
    public InstrumentIrd findByIdOrCode(InstrumentIrd instrumentIrd){
        InstrumentIrd resultat=null;
        if(instrumentIrd != null){
            if(StringUtil.isNotEmpty(instrumentIrd.getId())){
            resultat= instrumentIrdDao.getOne(instrumentIrd.getId());
            }else if(StringUtil.isNotEmpty(instrumentIrd.getCode())) {
            resultat= instrumentIrdDao.findByCode(instrumentIrd.getCode());
            }
        }
    return resultat;
    }

@Override
public InstrumentIrd findById(Long id){
if(id==null) return null;
return instrumentIrdDao.getOne(id);
}

@Override
public InstrumentIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(instrumentIrdDao.findById(id).isPresent())  {
instrumentIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public InstrumentIrd update(InstrumentIrd instrumentIrd){
InstrumentIrd foundedInstrumentIrd = findById(instrumentIrd.getId());
if(foundedInstrumentIrd==null) return null;
else{
    archivableService.prepare(instrumentIrd);
return  instrumentIrdDao.save(instrumentIrd);
}
}
private void prepareSave(InstrumentIrd instrumentIrd){
instrumentIrd.setDateCreation(new Date());
if(instrumentIrd.getArchive() == null)
  instrumentIrd.setArchive(false);
if(instrumentIrd.getAdmin() == null)
  instrumentIrd.setAdmin(false);
if(instrumentIrd.getVisible() == null)
  instrumentIrd.setVisible(false);



}

@Override
public InstrumentIrd save (InstrumentIrd instrumentIrd){
prepareSave(instrumentIrd);

InstrumentIrd result =null;
    InstrumentIrd foundedInstrumentIrd = findByCode(instrumentIrd.getCode());
   if(foundedInstrumentIrd == null){


    findTypeInstrumentIrd(instrumentIrd);

InstrumentIrd savedInstrumentIrd = instrumentIrdDao.save(instrumentIrd);

result = savedInstrumentIrd;
   }

return result;
}

@Override
public List<InstrumentIrd> save(List<InstrumentIrd> instrumentIrds){
List<InstrumentIrd> list = new ArrayList<>();
for(InstrumentIrd instrumentIrd: instrumentIrds){
list.add(save(instrumentIrd));
}
return list;
}



@Override
@Transactional
public int delete(InstrumentIrd instrumentIrd){
    if(instrumentIrd.getCode()==null) return -1;

    InstrumentIrd foundedInstrumentIrd = findByCode(instrumentIrd.getCode());
    if(foundedInstrumentIrd==null) return -1;
instrumentIrdDao.delete(foundedInstrumentIrd);
return 1;
}


public List<InstrumentIrd> findByCriteria(InstrumentIrdVo instrumentIrdVo){

String query = "SELECT o FROM InstrumentIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",instrumentIrdVo.getId());
            query += SearchUtil.addConstraint( "o", "code","LIKE",instrumentIrdVo.getCode());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",instrumentIrdVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "archive","=",instrumentIrdVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",instrumentIrdVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",instrumentIrdVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",instrumentIrdVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",instrumentIrdVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",instrumentIrdVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",instrumentIrdVo.getDateArchivageMin(),instrumentIrdVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",instrumentIrdVo.getDateCreationMin(),instrumentIrdVo.getDateCreationMax());
    if(instrumentIrdVo.getTypeInstrumentIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "typeInstrumentIrd.id","=",instrumentIrdVo.getTypeInstrumentIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "typeInstrumentIrd.code","LIKE",instrumentIrdVo.getTypeInstrumentIrdVo().getCode());
    }

query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}

    private void findTypeInstrumentIrd(InstrumentIrd instrumentIrd){
        TypeInstrumentIrd loadedTypeInstrumentIrd =typeInstrumentIrdService.findByIdOrCode(instrumentIrd.getTypeInstrumentIrd());

    if(loadedTypeInstrumentIrd==null ) {
        return;
    }
    instrumentIrd.setTypeInstrumentIrd(loadedTypeInstrumentIrd);
    }

@Override
@Transactional
public void delete(List<InstrumentIrd> instrumentIrds){
        if(ListUtil.isNotEmpty(instrumentIrds)){
        instrumentIrds.forEach(e->instrumentIrdDao.delete(e));
        }
}
@Override
public void update(List<InstrumentIrd> instrumentIrds){
if(ListUtil.isNotEmpty(instrumentIrds)){
instrumentIrds.forEach(e->instrumentIrdDao.save(e));
}
}



}
