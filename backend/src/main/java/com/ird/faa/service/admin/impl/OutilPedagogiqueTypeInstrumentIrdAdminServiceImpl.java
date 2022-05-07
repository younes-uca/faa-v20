package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.OutilPedagogiqueTypeInstrumentIrd;
import com.ird.faa.bean.TypeInstrumentIrd;
import com.ird.faa.bean.OutilPedagogique;
import com.ird.faa.dao.OutilPedagogiqueTypeInstrumentIrdDao;
import com.ird.faa.service.admin.facade.OutilPedagogiqueTypeInstrumentIrdAdminService;
import com.ird.faa.service.admin.facade.OutilPedagogiqueAdminService;
import com.ird.faa.service.admin.facade.TypeInstrumentIrdAdminService;

import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueTypeInstrumentIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class OutilPedagogiqueTypeInstrumentIrdAdminServiceImpl extends AbstractServiceImpl<OutilPedagogiqueTypeInstrumentIrd> implements OutilPedagogiqueTypeInstrumentIrdAdminService {

@Autowired
private OutilPedagogiqueTypeInstrumentIrdDao outilPedagogiqueTypeInstrumentIrdDao;

        @Autowired
        private OutilPedagogiqueAdminService outilPedagogiqueService ;
        @Autowired
        private TypeInstrumentIrdAdminService typeInstrumentIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<OutilPedagogiqueTypeInstrumentIrd> findAll(){
        return outilPedagogiqueTypeInstrumentIrdDao.findAll();
}

        @Override
        public List<OutilPedagogiqueTypeInstrumentIrd> findByTypeInstrumentIrdCode(String code){
        return outilPedagogiqueTypeInstrumentIrdDao.findByTypeInstrumentIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByTypeInstrumentIrdCode(String code){
        return outilPedagogiqueTypeInstrumentIrdDao.deleteByTypeInstrumentIrdCode(code);
        }

        @Override
        public List<OutilPedagogiqueTypeInstrumentIrd> findByTypeInstrumentIrdId(Long id){
        return outilPedagogiqueTypeInstrumentIrdDao.findByTypeInstrumentIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByTypeInstrumentIrdId(Long id){
        return outilPedagogiqueTypeInstrumentIrdDao.deleteByTypeInstrumentIrdId(id);
        }

        @Override
        public List<OutilPedagogiqueTypeInstrumentIrd> findByOutilPedagogiqueId(Long id){
        return outilPedagogiqueTypeInstrumentIrdDao.findByOutilPedagogiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByOutilPedagogiqueId(Long id){
        return outilPedagogiqueTypeInstrumentIrdDao.deleteByOutilPedagogiqueId(id);
        }


@Override
public OutilPedagogiqueTypeInstrumentIrd findById(Long id){
if(id==null) return null;
return outilPedagogiqueTypeInstrumentIrdDao.getOne(id);
}

@Override
public OutilPedagogiqueTypeInstrumentIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(outilPedagogiqueTypeInstrumentIrdDao.findById(id).isPresent())  {
outilPedagogiqueTypeInstrumentIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public OutilPedagogiqueTypeInstrumentIrd update(OutilPedagogiqueTypeInstrumentIrd outilPedagogiqueTypeInstrumentIrd){
OutilPedagogiqueTypeInstrumentIrd foundedOutilPedagogiqueTypeInstrumentIrd = findById(outilPedagogiqueTypeInstrumentIrd.getId());
if(foundedOutilPedagogiqueTypeInstrumentIrd==null) return null;
else{
return  outilPedagogiqueTypeInstrumentIrdDao.save(outilPedagogiqueTypeInstrumentIrd);
}
}

@Override
public OutilPedagogiqueTypeInstrumentIrd save (OutilPedagogiqueTypeInstrumentIrd outilPedagogiqueTypeInstrumentIrd){



    findTypeInstrumentIrd(outilPedagogiqueTypeInstrumentIrd);
    findOutilPedagogique(outilPedagogiqueTypeInstrumentIrd);

return outilPedagogiqueTypeInstrumentIrdDao.save(outilPedagogiqueTypeInstrumentIrd);


}

@Override
public List<OutilPedagogiqueTypeInstrumentIrd> save(List<OutilPedagogiqueTypeInstrumentIrd> outilPedagogiqueTypeInstrumentIrds){
List<OutilPedagogiqueTypeInstrumentIrd> list = new ArrayList<>();
for(OutilPedagogiqueTypeInstrumentIrd outilPedagogiqueTypeInstrumentIrd: outilPedagogiqueTypeInstrumentIrds){
list.add(save(outilPedagogiqueTypeInstrumentIrd));
}
return list;
}



@Override
@Transactional
public int delete(OutilPedagogiqueTypeInstrumentIrd outilPedagogiqueTypeInstrumentIrd){
    if(outilPedagogiqueTypeInstrumentIrd.getId()==null) return -1;
    OutilPedagogiqueTypeInstrumentIrd foundedOutilPedagogiqueTypeInstrumentIrd = findById(outilPedagogiqueTypeInstrumentIrd.getId());
    if(foundedOutilPedagogiqueTypeInstrumentIrd==null) return -1;
outilPedagogiqueTypeInstrumentIrdDao.delete(foundedOutilPedagogiqueTypeInstrumentIrd);
return 1;
}


public List<OutilPedagogiqueTypeInstrumentIrd> findByCriteria(OutilPedagogiqueTypeInstrumentIrdVo outilPedagogiqueTypeInstrumentIrdVo){

String query = "SELECT o FROM OutilPedagogiqueTypeInstrumentIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",outilPedagogiqueTypeInstrumentIrdVo.getId());
    if(outilPedagogiqueTypeInstrumentIrdVo.getTypeInstrumentIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "typeInstrumentIrd.id","=",outilPedagogiqueTypeInstrumentIrdVo.getTypeInstrumentIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "typeInstrumentIrd.code","LIKE",outilPedagogiqueTypeInstrumentIrdVo.getTypeInstrumentIrdVo().getCode());
    }

    if(outilPedagogiqueTypeInstrumentIrdVo.getOutilPedagogiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "outilPedagogique.id","=",outilPedagogiqueTypeInstrumentIrdVo.getOutilPedagogiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findTypeInstrumentIrd(OutilPedagogiqueTypeInstrumentIrd outilPedagogiqueTypeInstrumentIrd){
        TypeInstrumentIrd loadedTypeInstrumentIrd =typeInstrumentIrdService.findByIdOrCode(outilPedagogiqueTypeInstrumentIrd.getTypeInstrumentIrd());

    if(loadedTypeInstrumentIrd==null ) {
        return;
    }
    outilPedagogiqueTypeInstrumentIrd.setTypeInstrumentIrd(loadedTypeInstrumentIrd);
    }
    private void findOutilPedagogique(OutilPedagogiqueTypeInstrumentIrd outilPedagogiqueTypeInstrumentIrd){
        OutilPedagogique loadedOutilPedagogique = null;
        if(outilPedagogiqueTypeInstrumentIrd.getOutilPedagogique() != null && outilPedagogiqueTypeInstrumentIrd.getOutilPedagogique().getId() !=null)
        loadedOutilPedagogique =outilPedagogiqueService.findById(outilPedagogiqueTypeInstrumentIrd.getOutilPedagogique().getId());

    if(loadedOutilPedagogique==null ) {
        return;
    }
    outilPedagogiqueTypeInstrumentIrd.setOutilPedagogique(loadedOutilPedagogique);
    }

@Override
@Transactional
public void delete(List<OutilPedagogiqueTypeInstrumentIrd> outilPedagogiqueTypeInstrumentIrds){
        if(ListUtil.isNotEmpty(outilPedagogiqueTypeInstrumentIrds)){
        outilPedagogiqueTypeInstrumentIrds.forEach(e->outilPedagogiqueTypeInstrumentIrdDao.delete(e));
        }
}
@Override
public void update(List<OutilPedagogiqueTypeInstrumentIrd> outilPedagogiqueTypeInstrumentIrds){
if(ListUtil.isNotEmpty(outilPedagogiqueTypeInstrumentIrds)){
outilPedagogiqueTypeInstrumentIrds.forEach(e->outilPedagogiqueTypeInstrumentIrdDao.save(e));
}
}



}
