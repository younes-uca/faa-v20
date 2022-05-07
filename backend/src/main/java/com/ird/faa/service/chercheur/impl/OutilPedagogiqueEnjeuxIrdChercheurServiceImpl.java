package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.OutilPedagogiqueEnjeuxIrd;
import com.ird.faa.bean.OutilPedagogique;
import com.ird.faa.bean.EnjeuxIrd;
import com.ird.faa.dao.OutilPedagogiqueEnjeuxIrdDao;
import com.ird.faa.service.chercheur.facade.OutilPedagogiqueEnjeuxIrdChercheurService;
import com.ird.faa.service.chercheur.facade.OutilPedagogiqueChercheurService;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdChercheurService;

import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueEnjeuxIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class OutilPedagogiqueEnjeuxIrdChercheurServiceImpl extends AbstractServiceImpl<OutilPedagogiqueEnjeuxIrd> implements OutilPedagogiqueEnjeuxIrdChercheurService {

@Autowired
private OutilPedagogiqueEnjeuxIrdDao outilPedagogiqueEnjeuxIrdDao;

        @Autowired
        private OutilPedagogiqueChercheurService outilPedagogiqueService ;
        @Autowired
        private EnjeuxIrdChercheurService enjeuxIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<OutilPedagogiqueEnjeuxIrd> findAll(){
        return outilPedagogiqueEnjeuxIrdDao.findAll();
}
        @Override
        public List<OutilPedagogiqueEnjeuxIrd> findByOutilPedagogiqueId(Long id){
        return outilPedagogiqueEnjeuxIrdDao.findByOutilPedagogiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByOutilPedagogiqueId(Long id){
        return outilPedagogiqueEnjeuxIrdDao.deleteByOutilPedagogiqueId(id);
        }


        @Override
        public List<OutilPedagogiqueEnjeuxIrd> findByEnjeuxIrdCode(String code){
        return outilPedagogiqueEnjeuxIrdDao.findByEnjeuxIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdCode(String code){
        return outilPedagogiqueEnjeuxIrdDao.deleteByEnjeuxIrdCode(code);
        }

        @Override
        public List<OutilPedagogiqueEnjeuxIrd> findByEnjeuxIrdId(Long id){
        return outilPedagogiqueEnjeuxIrdDao.findByEnjeuxIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdId(Long id){
        return outilPedagogiqueEnjeuxIrdDao.deleteByEnjeuxIrdId(id);
        }


@Override
public OutilPedagogiqueEnjeuxIrd findById(Long id){
if(id==null) return null;
return outilPedagogiqueEnjeuxIrdDao.getOne(id);
}

@Override
public OutilPedagogiqueEnjeuxIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(outilPedagogiqueEnjeuxIrdDao.findById(id).isPresent())  {
outilPedagogiqueEnjeuxIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public OutilPedagogiqueEnjeuxIrd update(OutilPedagogiqueEnjeuxIrd outilPedagogiqueEnjeuxIrd){
OutilPedagogiqueEnjeuxIrd foundedOutilPedagogiqueEnjeuxIrd = findById(outilPedagogiqueEnjeuxIrd.getId());
if(foundedOutilPedagogiqueEnjeuxIrd==null) return null;
else{
return  outilPedagogiqueEnjeuxIrdDao.save(outilPedagogiqueEnjeuxIrd);
}
}

@Override
public OutilPedagogiqueEnjeuxIrd save (OutilPedagogiqueEnjeuxIrd outilPedagogiqueEnjeuxIrd){



    findOutilPedagogique(outilPedagogiqueEnjeuxIrd);
    findEnjeuxIrd(outilPedagogiqueEnjeuxIrd);

return outilPedagogiqueEnjeuxIrdDao.save(outilPedagogiqueEnjeuxIrd);


}

@Override
public List<OutilPedagogiqueEnjeuxIrd> save(List<OutilPedagogiqueEnjeuxIrd> outilPedagogiqueEnjeuxIrds){
List<OutilPedagogiqueEnjeuxIrd> list = new ArrayList<>();
for(OutilPedagogiqueEnjeuxIrd outilPedagogiqueEnjeuxIrd: outilPedagogiqueEnjeuxIrds){
list.add(save(outilPedagogiqueEnjeuxIrd));
}
return list;
}



@Override
@Transactional
public int delete(OutilPedagogiqueEnjeuxIrd outilPedagogiqueEnjeuxIrd){
    if(outilPedagogiqueEnjeuxIrd.getId()==null) return -1;
    OutilPedagogiqueEnjeuxIrd foundedOutilPedagogiqueEnjeuxIrd = findById(outilPedagogiqueEnjeuxIrd.getId());
    if(foundedOutilPedagogiqueEnjeuxIrd==null) return -1;
outilPedagogiqueEnjeuxIrdDao.delete(foundedOutilPedagogiqueEnjeuxIrd);
return 1;
}


public List<OutilPedagogiqueEnjeuxIrd> findByCriteria(OutilPedagogiqueEnjeuxIrdVo outilPedagogiqueEnjeuxIrdVo){

String query = "SELECT o FROM OutilPedagogiqueEnjeuxIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",outilPedagogiqueEnjeuxIrdVo.getId());
    if(outilPedagogiqueEnjeuxIrdVo.getOutilPedagogiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "outilPedagogique.id","=",outilPedagogiqueEnjeuxIrdVo.getOutilPedagogiqueVo().getId());
    }

    if(outilPedagogiqueEnjeuxIrdVo.getEnjeuxIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "enjeuxIrd.id","=",outilPedagogiqueEnjeuxIrdVo.getEnjeuxIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "enjeuxIrd.code","LIKE",outilPedagogiqueEnjeuxIrdVo.getEnjeuxIrdVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findOutilPedagogique(OutilPedagogiqueEnjeuxIrd outilPedagogiqueEnjeuxIrd){
        OutilPedagogique loadedOutilPedagogique = null;
        if(outilPedagogiqueEnjeuxIrd.getOutilPedagogique() != null && outilPedagogiqueEnjeuxIrd.getOutilPedagogique().getId() !=null)
        loadedOutilPedagogique =outilPedagogiqueService.findById(outilPedagogiqueEnjeuxIrd.getOutilPedagogique().getId());

    if(loadedOutilPedagogique==null ) {
        return;
    }
    outilPedagogiqueEnjeuxIrd.setOutilPedagogique(loadedOutilPedagogique);
    }
    private void findEnjeuxIrd(OutilPedagogiqueEnjeuxIrd outilPedagogiqueEnjeuxIrd){
        EnjeuxIrd loadedEnjeuxIrd =enjeuxIrdService.findByIdOrCode(outilPedagogiqueEnjeuxIrd.getEnjeuxIrd());

    if(loadedEnjeuxIrd==null ) {
        return;
    }
    outilPedagogiqueEnjeuxIrd.setEnjeuxIrd(loadedEnjeuxIrd);
    }

@Override
@Transactional
public void delete(List<OutilPedagogiqueEnjeuxIrd> outilPedagogiqueEnjeuxIrds){
        if(ListUtil.isNotEmpty(outilPedagogiqueEnjeuxIrds)){
        outilPedagogiqueEnjeuxIrds.forEach(e->outilPedagogiqueEnjeuxIrdDao.delete(e));
        }
}
@Override
public void update(List<OutilPedagogiqueEnjeuxIrd> outilPedagogiqueEnjeuxIrds){
if(ListUtil.isNotEmpty(outilPedagogiqueEnjeuxIrds)){
outilPedagogiqueEnjeuxIrds.forEach(e->outilPedagogiqueEnjeuxIrdDao.save(e));
}
}



}
