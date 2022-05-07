package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.OutilPedagogiqueInstrumentIrd;
import com.ird.faa.bean.InstrumentIrd;
import com.ird.faa.bean.OutilPedagogique;
import com.ird.faa.dao.OutilPedagogiqueInstrumentIrdDao;
import com.ird.faa.service.chercheur.facade.OutilPedagogiqueInstrumentIrdChercheurService;
import com.ird.faa.service.chercheur.facade.OutilPedagogiqueChercheurService;
import com.ird.faa.service.chercheur.facade.InstrumentIrdChercheurService;

import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueInstrumentIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class OutilPedagogiqueInstrumentIrdChercheurServiceImpl extends AbstractServiceImpl<OutilPedagogiqueInstrumentIrd> implements OutilPedagogiqueInstrumentIrdChercheurService {

@Autowired
private OutilPedagogiqueInstrumentIrdDao outilPedagogiqueInstrumentIrdDao;

        @Autowired
        private OutilPedagogiqueChercheurService outilPedagogiqueService ;
        @Autowired
        private InstrumentIrdChercheurService instrumentIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<OutilPedagogiqueInstrumentIrd> findAll(){
        return outilPedagogiqueInstrumentIrdDao.findAll();
}

        @Override
        public List<OutilPedagogiqueInstrumentIrd> findByInstrumentIrdCode(String code){
        return outilPedagogiqueInstrumentIrdDao.findByInstrumentIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByInstrumentIrdCode(String code){
        return outilPedagogiqueInstrumentIrdDao.deleteByInstrumentIrdCode(code);
        }

        @Override
        public List<OutilPedagogiqueInstrumentIrd> findByInstrumentIrdId(Long id){
        return outilPedagogiqueInstrumentIrdDao.findByInstrumentIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByInstrumentIrdId(Long id){
        return outilPedagogiqueInstrumentIrdDao.deleteByInstrumentIrdId(id);
        }

        @Override
        public List<OutilPedagogiqueInstrumentIrd> findByOutilPedagogiqueId(Long id){
        return outilPedagogiqueInstrumentIrdDao.findByOutilPedagogiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByOutilPedagogiqueId(Long id){
        return outilPedagogiqueInstrumentIrdDao.deleteByOutilPedagogiqueId(id);
        }


@Override
public OutilPedagogiqueInstrumentIrd findById(Long id){
if(id==null) return null;
return outilPedagogiqueInstrumentIrdDao.getOne(id);
}

@Override
public OutilPedagogiqueInstrumentIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(outilPedagogiqueInstrumentIrdDao.findById(id).isPresent())  {
outilPedagogiqueInstrumentIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public OutilPedagogiqueInstrumentIrd update(OutilPedagogiqueInstrumentIrd outilPedagogiqueInstrumentIrd){
OutilPedagogiqueInstrumentIrd foundedOutilPedagogiqueInstrumentIrd = findById(outilPedagogiqueInstrumentIrd.getId());
if(foundedOutilPedagogiqueInstrumentIrd==null) return null;
else{
return  outilPedagogiqueInstrumentIrdDao.save(outilPedagogiqueInstrumentIrd);
}
}

@Override
public OutilPedagogiqueInstrumentIrd save (OutilPedagogiqueInstrumentIrd outilPedagogiqueInstrumentIrd){



    findInstrumentIrd(outilPedagogiqueInstrumentIrd);
    findOutilPedagogique(outilPedagogiqueInstrumentIrd);

return outilPedagogiqueInstrumentIrdDao.save(outilPedagogiqueInstrumentIrd);


}

@Override
public List<OutilPedagogiqueInstrumentIrd> save(List<OutilPedagogiqueInstrumentIrd> outilPedagogiqueInstrumentIrds){
List<OutilPedagogiqueInstrumentIrd> list = new ArrayList<>();
for(OutilPedagogiqueInstrumentIrd outilPedagogiqueInstrumentIrd: outilPedagogiqueInstrumentIrds){
list.add(save(outilPedagogiqueInstrumentIrd));
}
return list;
}



@Override
@Transactional
public int delete(OutilPedagogiqueInstrumentIrd outilPedagogiqueInstrumentIrd){
    if(outilPedagogiqueInstrumentIrd.getId()==null) return -1;
    OutilPedagogiqueInstrumentIrd foundedOutilPedagogiqueInstrumentIrd = findById(outilPedagogiqueInstrumentIrd.getId());
    if(foundedOutilPedagogiqueInstrumentIrd==null) return -1;
outilPedagogiqueInstrumentIrdDao.delete(foundedOutilPedagogiqueInstrumentIrd);
return 1;
}


public List<OutilPedagogiqueInstrumentIrd> findByCriteria(OutilPedagogiqueInstrumentIrdVo outilPedagogiqueInstrumentIrdVo){

String query = "SELECT o FROM OutilPedagogiqueInstrumentIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",outilPedagogiqueInstrumentIrdVo.getId());
    if(outilPedagogiqueInstrumentIrdVo.getInstrumentIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "instrumentIrd.id","=",outilPedagogiqueInstrumentIrdVo.getInstrumentIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "instrumentIrd.code","LIKE",outilPedagogiqueInstrumentIrdVo.getInstrumentIrdVo().getCode());
    }

    if(outilPedagogiqueInstrumentIrdVo.getOutilPedagogiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "outilPedagogique.id","=",outilPedagogiqueInstrumentIrdVo.getOutilPedagogiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findInstrumentIrd(OutilPedagogiqueInstrumentIrd outilPedagogiqueInstrumentIrd){
        InstrumentIrd loadedInstrumentIrd =instrumentIrdService.findByIdOrCode(outilPedagogiqueInstrumentIrd.getInstrumentIrd());

    if(loadedInstrumentIrd==null ) {
        return;
    }
    outilPedagogiqueInstrumentIrd.setInstrumentIrd(loadedInstrumentIrd);
    }
    private void findOutilPedagogique(OutilPedagogiqueInstrumentIrd outilPedagogiqueInstrumentIrd){
        OutilPedagogique loadedOutilPedagogique = null;
        if(outilPedagogiqueInstrumentIrd.getOutilPedagogique() != null && outilPedagogiqueInstrumentIrd.getOutilPedagogique().getId() !=null)
        loadedOutilPedagogique =outilPedagogiqueService.findById(outilPedagogiqueInstrumentIrd.getOutilPedagogique().getId());

    if(loadedOutilPedagogique==null ) {
        return;
    }
    outilPedagogiqueInstrumentIrd.setOutilPedagogique(loadedOutilPedagogique);
    }

@Override
@Transactional
public void delete(List<OutilPedagogiqueInstrumentIrd> outilPedagogiqueInstrumentIrds){
        if(ListUtil.isNotEmpty(outilPedagogiqueInstrumentIrds)){
        outilPedagogiqueInstrumentIrds.forEach(e->outilPedagogiqueInstrumentIrdDao.delete(e));
        }
}
@Override
public void update(List<OutilPedagogiqueInstrumentIrd> outilPedagogiqueInstrumentIrds){
if(ListUtil.isNotEmpty(outilPedagogiqueInstrumentIrds)){
outilPedagogiqueInstrumentIrds.forEach(e->outilPedagogiqueInstrumentIrdDao.save(e));
}
}



}
