package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.OutilPedagogiqueLangue;
import com.ird.faa.bean.Langue;
import com.ird.faa.bean.OutilPedagogique;
import com.ird.faa.dao.OutilPedagogiqueLangueDao;
import com.ird.faa.service.chercheur.facade.OutilPedagogiqueLangueChercheurService;
import com.ird.faa.service.chercheur.facade.OutilPedagogiqueChercheurService;
import com.ird.faa.service.chercheur.facade.LangueChercheurService;

import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueLangueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class OutilPedagogiqueLangueChercheurServiceImpl extends AbstractServiceImpl<OutilPedagogiqueLangue> implements OutilPedagogiqueLangueChercheurService {

@Autowired
private OutilPedagogiqueLangueDao outilPedagogiqueLangueDao;

        @Autowired
        private OutilPedagogiqueChercheurService outilPedagogiqueService ;
        @Autowired
        private LangueChercheurService langueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<OutilPedagogiqueLangue> findAll(){
        return outilPedagogiqueLangueDao.findAll();
}

        @Override
        public List<OutilPedagogiqueLangue> findByLangueCode(String code){
        return outilPedagogiqueLangueDao.findByLangueCode(code);
        }

        @Override
        @Transactional
        public int deleteByLangueCode(String code){
        return outilPedagogiqueLangueDao.deleteByLangueCode(code);
        }

        @Override
        public List<OutilPedagogiqueLangue> findByLangueId(Long id){
        return outilPedagogiqueLangueDao.findByLangueId(id);
        }

        @Override
        @Transactional
        public int deleteByLangueId(Long id){
        return outilPedagogiqueLangueDao.deleteByLangueId(id);
        }

        @Override
        public List<OutilPedagogiqueLangue> findByOutilPedagogiqueId(Long id){
        return outilPedagogiqueLangueDao.findByOutilPedagogiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByOutilPedagogiqueId(Long id){
        return outilPedagogiqueLangueDao.deleteByOutilPedagogiqueId(id);
        }


@Override
public OutilPedagogiqueLangue findById(Long id){
if(id==null) return null;
return outilPedagogiqueLangueDao.getOne(id);
}

@Override
public OutilPedagogiqueLangue findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(outilPedagogiqueLangueDao.findById(id).isPresent())  {
outilPedagogiqueLangueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public OutilPedagogiqueLangue update(OutilPedagogiqueLangue outilPedagogiqueLangue){
OutilPedagogiqueLangue foundedOutilPedagogiqueLangue = findById(outilPedagogiqueLangue.getId());
if(foundedOutilPedagogiqueLangue==null) return null;
else{
return  outilPedagogiqueLangueDao.save(outilPedagogiqueLangue);
}
}

@Override
public OutilPedagogiqueLangue save (OutilPedagogiqueLangue outilPedagogiqueLangue){



    findLangue(outilPedagogiqueLangue);
    findOutilPedagogique(outilPedagogiqueLangue);

return outilPedagogiqueLangueDao.save(outilPedagogiqueLangue);


}

@Override
public List<OutilPedagogiqueLangue> save(List<OutilPedagogiqueLangue> outilPedagogiqueLangues){
List<OutilPedagogiqueLangue> list = new ArrayList<>();
for(OutilPedagogiqueLangue outilPedagogiqueLangue: outilPedagogiqueLangues){
list.add(save(outilPedagogiqueLangue));
}
return list;
}



@Override
@Transactional
public int delete(OutilPedagogiqueLangue outilPedagogiqueLangue){
    if(outilPedagogiqueLangue.getId()==null) return -1;
    OutilPedagogiqueLangue foundedOutilPedagogiqueLangue = findById(outilPedagogiqueLangue.getId());
    if(foundedOutilPedagogiqueLangue==null) return -1;
outilPedagogiqueLangueDao.delete(foundedOutilPedagogiqueLangue);
return 1;
}


public List<OutilPedagogiqueLangue> findByCriteria(OutilPedagogiqueLangueVo outilPedagogiqueLangueVo){

String query = "SELECT o FROM OutilPedagogiqueLangue o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",outilPedagogiqueLangueVo.getId());
    if(outilPedagogiqueLangueVo.getLangueVo()!=null){
        query += SearchUtil.addConstraint( "o", "langue.id","=",outilPedagogiqueLangueVo.getLangueVo().getId());
            query += SearchUtil.addConstraint( "o", "langue.code","LIKE",outilPedagogiqueLangueVo.getLangueVo().getCode());
    }

    if(outilPedagogiqueLangueVo.getOutilPedagogiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "outilPedagogique.id","=",outilPedagogiqueLangueVo.getOutilPedagogiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findLangue(OutilPedagogiqueLangue outilPedagogiqueLangue){
        Langue loadedLangue =langueService.findByIdOrCode(outilPedagogiqueLangue.getLangue());

    if(loadedLangue==null ) {
        return;
    }
    outilPedagogiqueLangue.setLangue(loadedLangue);
    }
    private void findOutilPedagogique(OutilPedagogiqueLangue outilPedagogiqueLangue){
        OutilPedagogique loadedOutilPedagogique = null;
        if(outilPedagogiqueLangue.getOutilPedagogique() != null && outilPedagogiqueLangue.getOutilPedagogique().getId() !=null)
        loadedOutilPedagogique =outilPedagogiqueService.findById(outilPedagogiqueLangue.getOutilPedagogique().getId());

    if(loadedOutilPedagogique==null ) {
        return;
    }
    outilPedagogiqueLangue.setOutilPedagogique(loadedOutilPedagogique);
    }

@Override
@Transactional
public void delete(List<OutilPedagogiqueLangue> outilPedagogiqueLangues){
        if(ListUtil.isNotEmpty(outilPedagogiqueLangues)){
        outilPedagogiqueLangues.forEach(e->outilPedagogiqueLangueDao.delete(e));
        }
}
@Override
public void update(List<OutilPedagogiqueLangue> outilPedagogiqueLangues){
if(ListUtil.isNotEmpty(outilPedagogiqueLangues)){
outilPedagogiqueLangues.forEach(e->outilPedagogiqueLangueDao.save(e));
}
}



}
