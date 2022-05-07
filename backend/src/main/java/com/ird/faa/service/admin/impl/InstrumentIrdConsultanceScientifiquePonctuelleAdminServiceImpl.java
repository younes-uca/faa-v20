package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.InstrumentIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.ConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.InstrumentIrd;
import com.ird.faa.dao.InstrumentIrdConsultanceScientifiquePonctuelleDao;
import com.ird.faa.service.admin.facade.InstrumentIrdConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.service.admin.facade.ConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.service.admin.facade.InstrumentIrdAdminService;

import com.ird.faa.ws.rest.provided.vo.InstrumentIrdConsultanceScientifiquePonctuelleVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class InstrumentIrdConsultanceScientifiquePonctuelleAdminServiceImpl extends AbstractServiceImpl<InstrumentIrdConsultanceScientifiquePonctuelle> implements InstrumentIrdConsultanceScientifiquePonctuelleAdminService {

@Autowired
private InstrumentIrdConsultanceScientifiquePonctuelleDao instrumentIrdConsultanceScientifiquePonctuelleDao;

        @Autowired
        private ConsultanceScientifiquePonctuelleAdminService consultanceScientifiquePonctuelleService ;
        @Autowired
        private InstrumentIrdAdminService instrumentIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<InstrumentIrdConsultanceScientifiquePonctuelle> findAll(){
        return instrumentIrdConsultanceScientifiquePonctuelleDao.findAll();
}
        @Override
        public List<InstrumentIrdConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(Long id){
        return instrumentIrdConsultanceScientifiquePonctuelleDao.findByConsultanceScientifiquePonctuelleId(id);
        }

        @Override
        @Transactional
        public int deleteByConsultanceScientifiquePonctuelleId(Long id){
        return instrumentIrdConsultanceScientifiquePonctuelleDao.deleteByConsultanceScientifiquePonctuelleId(id);
        }


        @Override
        public List<InstrumentIrdConsultanceScientifiquePonctuelle> findByInstrumentIrdCode(String code){
        return instrumentIrdConsultanceScientifiquePonctuelleDao.findByInstrumentIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByInstrumentIrdCode(String code){
        return instrumentIrdConsultanceScientifiquePonctuelleDao.deleteByInstrumentIrdCode(code);
        }

        @Override
        public List<InstrumentIrdConsultanceScientifiquePonctuelle> findByInstrumentIrdId(Long id){
        return instrumentIrdConsultanceScientifiquePonctuelleDao.findByInstrumentIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByInstrumentIrdId(Long id){
        return instrumentIrdConsultanceScientifiquePonctuelleDao.deleteByInstrumentIrdId(id);
        }


@Override
public InstrumentIrdConsultanceScientifiquePonctuelle findById(Long id){
if(id==null) return null;
return instrumentIrdConsultanceScientifiquePonctuelleDao.getOne(id);
}

@Override
public InstrumentIrdConsultanceScientifiquePonctuelle findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(instrumentIrdConsultanceScientifiquePonctuelleDao.findById(id).isPresent())  {
instrumentIrdConsultanceScientifiquePonctuelleDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public InstrumentIrdConsultanceScientifiquePonctuelle update(InstrumentIrdConsultanceScientifiquePonctuelle instrumentIrdConsultanceScientifiquePonctuelle){
InstrumentIrdConsultanceScientifiquePonctuelle foundedInstrumentIrdConsultanceScientifiquePonctuelle = findById(instrumentIrdConsultanceScientifiquePonctuelle.getId());
if(foundedInstrumentIrdConsultanceScientifiquePonctuelle==null) return null;
else{
return  instrumentIrdConsultanceScientifiquePonctuelleDao.save(instrumentIrdConsultanceScientifiquePonctuelle);
}
}
private void prepareSave(InstrumentIrdConsultanceScientifiquePonctuelle instrumentIrdConsultanceScientifiquePonctuelle){
if(instrumentIrdConsultanceScientifiquePonctuelle.getExiste() == null)
  instrumentIrdConsultanceScientifiquePonctuelle.setExiste(false);



}

@Override
public InstrumentIrdConsultanceScientifiquePonctuelle save (InstrumentIrdConsultanceScientifiquePonctuelle instrumentIrdConsultanceScientifiquePonctuelle){
prepareSave(instrumentIrdConsultanceScientifiquePonctuelle);



    findConsultanceScientifiquePonctuelle(instrumentIrdConsultanceScientifiquePonctuelle);
    findInstrumentIrd(instrumentIrdConsultanceScientifiquePonctuelle);

return instrumentIrdConsultanceScientifiquePonctuelleDao.save(instrumentIrdConsultanceScientifiquePonctuelle);


}

@Override
public List<InstrumentIrdConsultanceScientifiquePonctuelle> save(List<InstrumentIrdConsultanceScientifiquePonctuelle> instrumentIrdConsultanceScientifiquePonctuelles){
List<InstrumentIrdConsultanceScientifiquePonctuelle> list = new ArrayList<>();
for(InstrumentIrdConsultanceScientifiquePonctuelle instrumentIrdConsultanceScientifiquePonctuelle: instrumentIrdConsultanceScientifiquePonctuelles){
list.add(save(instrumentIrdConsultanceScientifiquePonctuelle));
}
return list;
}



@Override
@Transactional
public int delete(InstrumentIrdConsultanceScientifiquePonctuelle instrumentIrdConsultanceScientifiquePonctuelle){
    if(instrumentIrdConsultanceScientifiquePonctuelle.getId()==null) return -1;
    InstrumentIrdConsultanceScientifiquePonctuelle foundedInstrumentIrdConsultanceScientifiquePonctuelle = findById(instrumentIrdConsultanceScientifiquePonctuelle.getId());
    if(foundedInstrumentIrdConsultanceScientifiquePonctuelle==null) return -1;
instrumentIrdConsultanceScientifiquePonctuelleDao.delete(foundedInstrumentIrdConsultanceScientifiquePonctuelle);
return 1;
}


public List<InstrumentIrdConsultanceScientifiquePonctuelle> findByCriteria(InstrumentIrdConsultanceScientifiquePonctuelleVo instrumentIrdConsultanceScientifiquePonctuelleVo){

String query = "SELECT o FROM InstrumentIrdConsultanceScientifiquePonctuelle o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",instrumentIrdConsultanceScientifiquePonctuelleVo.getId());
            query += SearchUtil.addConstraint( "o", "existe","=",instrumentIrdConsultanceScientifiquePonctuelleVo.getExiste());
    if(instrumentIrdConsultanceScientifiquePonctuelleVo.getConsultanceScientifiquePonctuelleVo()!=null){
        query += SearchUtil.addConstraint( "o", "consultanceScientifiquePonctuelle.id","=",instrumentIrdConsultanceScientifiquePonctuelleVo.getConsultanceScientifiquePonctuelleVo().getId());
    }

    if(instrumentIrdConsultanceScientifiquePonctuelleVo.getInstrumentIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "instrumentIrd.id","=",instrumentIrdConsultanceScientifiquePonctuelleVo.getInstrumentIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "instrumentIrd.code","LIKE",instrumentIrdConsultanceScientifiquePonctuelleVo.getInstrumentIrdVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findConsultanceScientifiquePonctuelle(InstrumentIrdConsultanceScientifiquePonctuelle instrumentIrdConsultanceScientifiquePonctuelle){
        ConsultanceScientifiquePonctuelle loadedConsultanceScientifiquePonctuelle = null;
        if(instrumentIrdConsultanceScientifiquePonctuelle.getConsultanceScientifiquePonctuelle() != null && instrumentIrdConsultanceScientifiquePonctuelle.getConsultanceScientifiquePonctuelle().getId() !=null)
        loadedConsultanceScientifiquePonctuelle =consultanceScientifiquePonctuelleService.findById(instrumentIrdConsultanceScientifiquePonctuelle.getConsultanceScientifiquePonctuelle().getId());

    if(loadedConsultanceScientifiquePonctuelle==null ) {
        return;
    }
    instrumentIrdConsultanceScientifiquePonctuelle.setConsultanceScientifiquePonctuelle(loadedConsultanceScientifiquePonctuelle);
    }
    private void findInstrumentIrd(InstrumentIrdConsultanceScientifiquePonctuelle instrumentIrdConsultanceScientifiquePonctuelle){
        InstrumentIrd loadedInstrumentIrd =instrumentIrdService.findByIdOrCode(instrumentIrdConsultanceScientifiquePonctuelle.getInstrumentIrd());

    if(loadedInstrumentIrd==null ) {
        return;
    }
    instrumentIrdConsultanceScientifiquePonctuelle.setInstrumentIrd(loadedInstrumentIrd);
    }

@Override
@Transactional
public void delete(List<InstrumentIrdConsultanceScientifiquePonctuelle> instrumentIrdConsultanceScientifiquePonctuelles){
        if(ListUtil.isNotEmpty(instrumentIrdConsultanceScientifiquePonctuelles)){
        instrumentIrdConsultanceScientifiquePonctuelles.forEach(e->instrumentIrdConsultanceScientifiquePonctuelleDao.delete(e));
        }
}
@Override
public void update(List<InstrumentIrdConsultanceScientifiquePonctuelle> instrumentIrdConsultanceScientifiquePonctuelles){
if(ListUtil.isNotEmpty(instrumentIrdConsultanceScientifiquePonctuelles)){
instrumentIrdConsultanceScientifiquePonctuelles.forEach(e->instrumentIrdConsultanceScientifiquePonctuelleDao.save(e));
}
}



}
