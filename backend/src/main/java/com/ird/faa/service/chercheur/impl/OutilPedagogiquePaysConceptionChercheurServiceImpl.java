package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.OutilPedagogiquePaysConception;
import com.ird.faa.bean.Pays;
import com.ird.faa.bean.OutilPedagogique;
import com.ird.faa.dao.OutilPedagogiquePaysConceptionDao;
import com.ird.faa.service.chercheur.facade.OutilPedagogiquePaysConceptionChercheurService;
import com.ird.faa.service.chercheur.facade.OutilPedagogiqueChercheurService;
import com.ird.faa.service.chercheur.facade.PaysChercheurService;

import com.ird.faa.ws.rest.provided.vo.OutilPedagogiquePaysConceptionVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class OutilPedagogiquePaysConceptionChercheurServiceImpl extends AbstractServiceImpl<OutilPedagogiquePaysConception> implements OutilPedagogiquePaysConceptionChercheurService {

@Autowired
private OutilPedagogiquePaysConceptionDao outilPedagogiquePaysConceptionDao;

        @Autowired
        private OutilPedagogiqueChercheurService outilPedagogiqueService ;
        @Autowired
        private PaysChercheurService paysService ;


@Autowired
private EntityManager entityManager;


@Override
public List<OutilPedagogiquePaysConception> findAll(){
        return outilPedagogiquePaysConceptionDao.findAll();
}

        @Override
        public List<OutilPedagogiquePaysConception> findByPaysCode(String code){
        return outilPedagogiquePaysConceptionDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return outilPedagogiquePaysConceptionDao.deleteByPaysCode(code);
        }

        @Override
        public List<OutilPedagogiquePaysConception> findByPaysId(Long id){
        return outilPedagogiquePaysConceptionDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return outilPedagogiquePaysConceptionDao.deleteByPaysId(id);
        }

        @Override
        public List<OutilPedagogiquePaysConception> findByOutilPedagogiqueId(Long id){
        return outilPedagogiquePaysConceptionDao.findByOutilPedagogiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByOutilPedagogiqueId(Long id){
        return outilPedagogiquePaysConceptionDao.deleteByOutilPedagogiqueId(id);
        }


@Override
public OutilPedagogiquePaysConception findById(Long id){
if(id==null) return null;
return outilPedagogiquePaysConceptionDao.getOne(id);
}

@Override
public OutilPedagogiquePaysConception findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(outilPedagogiquePaysConceptionDao.findById(id).isPresent())  {
outilPedagogiquePaysConceptionDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public OutilPedagogiquePaysConception update(OutilPedagogiquePaysConception outilPedagogiquePaysConception){
OutilPedagogiquePaysConception foundedOutilPedagogiquePaysConception = findById(outilPedagogiquePaysConception.getId());
if(foundedOutilPedagogiquePaysConception==null) return null;
else{
return  outilPedagogiquePaysConceptionDao.save(outilPedagogiquePaysConception);
}
}

@Override
public OutilPedagogiquePaysConception save (OutilPedagogiquePaysConception outilPedagogiquePaysConception){



    findPays(outilPedagogiquePaysConception);
    findOutilPedagogique(outilPedagogiquePaysConception);

return outilPedagogiquePaysConceptionDao.save(outilPedagogiquePaysConception);


}

@Override
public List<OutilPedagogiquePaysConception> save(List<OutilPedagogiquePaysConception> outilPedagogiquePaysConceptions){
List<OutilPedagogiquePaysConception> list = new ArrayList<>();
for(OutilPedagogiquePaysConception outilPedagogiquePaysConception: outilPedagogiquePaysConceptions){
list.add(save(outilPedagogiquePaysConception));
}
return list;
}



@Override
@Transactional
public int delete(OutilPedagogiquePaysConception outilPedagogiquePaysConception){
    if(outilPedagogiquePaysConception.getId()==null) return -1;
    OutilPedagogiquePaysConception foundedOutilPedagogiquePaysConception = findById(outilPedagogiquePaysConception.getId());
    if(foundedOutilPedagogiquePaysConception==null) return -1;
outilPedagogiquePaysConceptionDao.delete(foundedOutilPedagogiquePaysConception);
return 1;
}


public List<OutilPedagogiquePaysConception> findByCriteria(OutilPedagogiquePaysConceptionVo outilPedagogiquePaysConceptionVo){

String query = "SELECT o FROM OutilPedagogiquePaysConception o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",outilPedagogiquePaysConceptionVo.getId());
    if(outilPedagogiquePaysConceptionVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",outilPedagogiquePaysConceptionVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",outilPedagogiquePaysConceptionVo.getPaysVo().getCode());
    }

    if(outilPedagogiquePaysConceptionVo.getOutilPedagogiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "outilPedagogique.id","=",outilPedagogiquePaysConceptionVo.getOutilPedagogiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findPays(OutilPedagogiquePaysConception outilPedagogiquePaysConception){
        Pays loadedPays =paysService.findByIdOrCode(outilPedagogiquePaysConception.getPays());

    if(loadedPays==null ) {
        return;
    }
    outilPedagogiquePaysConception.setPays(loadedPays);
    }
    private void findOutilPedagogique(OutilPedagogiquePaysConception outilPedagogiquePaysConception){
        OutilPedagogique loadedOutilPedagogique = null;
        if(outilPedagogiquePaysConception.getOutilPedagogique() != null && outilPedagogiquePaysConception.getOutilPedagogique().getId() !=null)
        loadedOutilPedagogique =outilPedagogiqueService.findById(outilPedagogiquePaysConception.getOutilPedagogique().getId());

    if(loadedOutilPedagogique==null ) {
        return;
    }
    outilPedagogiquePaysConception.setOutilPedagogique(loadedOutilPedagogique);
    }

@Override
@Transactional
public void delete(List<OutilPedagogiquePaysConception> outilPedagogiquePaysConceptions){
        if(ListUtil.isNotEmpty(outilPedagogiquePaysConceptions)){
        outilPedagogiquePaysConceptions.forEach(e->outilPedagogiquePaysConceptionDao.delete(e));
        }
}
@Override
public void update(List<OutilPedagogiquePaysConception> outilPedagogiquePaysConceptions){
if(ListUtil.isNotEmpty(outilPedagogiquePaysConceptions)){
outilPedagogiquePaysConceptions.forEach(e->outilPedagogiquePaysConceptionDao.save(e));
}
}



}
