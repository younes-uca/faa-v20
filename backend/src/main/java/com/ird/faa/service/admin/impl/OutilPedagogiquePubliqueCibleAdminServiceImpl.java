package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.OutilPedagogiquePubliqueCible;
import com.ird.faa.bean.PubliqueCible;
import com.ird.faa.bean.OutilPedagogique;
import com.ird.faa.dao.OutilPedagogiquePubliqueCibleDao;
import com.ird.faa.service.admin.facade.OutilPedagogiquePubliqueCibleAdminService;
import com.ird.faa.service.admin.facade.OutilPedagogiqueAdminService;
import com.ird.faa.service.admin.facade.PubliqueCibleAdminService;

import com.ird.faa.ws.rest.provided.vo.OutilPedagogiquePubliqueCibleVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class OutilPedagogiquePubliqueCibleAdminServiceImpl extends AbstractServiceImpl<OutilPedagogiquePubliqueCible> implements OutilPedagogiquePubliqueCibleAdminService {

@Autowired
private OutilPedagogiquePubliqueCibleDao outilPedagogiquePubliqueCibleDao;

        @Autowired
        private OutilPedagogiqueAdminService outilPedagogiqueService ;
        @Autowired
        private PubliqueCibleAdminService publiqueCibleService ;


@Autowired
private EntityManager entityManager;


@Override
public List<OutilPedagogiquePubliqueCible> findAll(){
        return outilPedagogiquePubliqueCibleDao.findAll();
}

        @Override
        public List<OutilPedagogiquePubliqueCible> findByPubliqueCibleCode(String code){
        return outilPedagogiquePubliqueCibleDao.findByPubliqueCibleCode(code);
        }

        @Override
        @Transactional
        public int deleteByPubliqueCibleCode(String code){
        return outilPedagogiquePubliqueCibleDao.deleteByPubliqueCibleCode(code);
        }

        @Override
        public List<OutilPedagogiquePubliqueCible> findByPubliqueCibleId(Long id){
        return outilPedagogiquePubliqueCibleDao.findByPubliqueCibleId(id);
        }

        @Override
        @Transactional
        public int deleteByPubliqueCibleId(Long id){
        return outilPedagogiquePubliqueCibleDao.deleteByPubliqueCibleId(id);
        }

        @Override
        public List<OutilPedagogiquePubliqueCible> findByOutilPedagogiqueId(Long id){
        return outilPedagogiquePubliqueCibleDao.findByOutilPedagogiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByOutilPedagogiqueId(Long id){
        return outilPedagogiquePubliqueCibleDao.deleteByOutilPedagogiqueId(id);
        }


@Override
public OutilPedagogiquePubliqueCible findById(Long id){
if(id==null) return null;
return outilPedagogiquePubliqueCibleDao.getOne(id);
}

@Override
public OutilPedagogiquePubliqueCible findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(outilPedagogiquePubliqueCibleDao.findById(id).isPresent())  {
outilPedagogiquePubliqueCibleDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public OutilPedagogiquePubliqueCible update(OutilPedagogiquePubliqueCible outilPedagogiquePubliqueCible){
OutilPedagogiquePubliqueCible foundedOutilPedagogiquePubliqueCible = findById(outilPedagogiquePubliqueCible.getId());
if(foundedOutilPedagogiquePubliqueCible==null) return null;
else{
return  outilPedagogiquePubliqueCibleDao.save(outilPedagogiquePubliqueCible);
}
}

@Override
public OutilPedagogiquePubliqueCible save (OutilPedagogiquePubliqueCible outilPedagogiquePubliqueCible){



    findPubliqueCible(outilPedagogiquePubliqueCible);
    findOutilPedagogique(outilPedagogiquePubliqueCible);

return outilPedagogiquePubliqueCibleDao.save(outilPedagogiquePubliqueCible);


}

@Override
public List<OutilPedagogiquePubliqueCible> save(List<OutilPedagogiquePubliqueCible> outilPedagogiquePubliqueCibles){
List<OutilPedagogiquePubliqueCible> list = new ArrayList<>();
for(OutilPedagogiquePubliqueCible outilPedagogiquePubliqueCible: outilPedagogiquePubliqueCibles){
list.add(save(outilPedagogiquePubliqueCible));
}
return list;
}



@Override
@Transactional
public int delete(OutilPedagogiquePubliqueCible outilPedagogiquePubliqueCible){
    if(outilPedagogiquePubliqueCible.getId()==null) return -1;
    OutilPedagogiquePubliqueCible foundedOutilPedagogiquePubliqueCible = findById(outilPedagogiquePubliqueCible.getId());
    if(foundedOutilPedagogiquePubliqueCible==null) return -1;
outilPedagogiquePubliqueCibleDao.delete(foundedOutilPedagogiquePubliqueCible);
return 1;
}


public List<OutilPedagogiquePubliqueCible> findByCriteria(OutilPedagogiquePubliqueCibleVo outilPedagogiquePubliqueCibleVo){

String query = "SELECT o FROM OutilPedagogiquePubliqueCible o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",outilPedagogiquePubliqueCibleVo.getId());
    if(outilPedagogiquePubliqueCibleVo.getPubliqueCibleVo()!=null){
        query += SearchUtil.addConstraint( "o", "publiqueCible.id","=",outilPedagogiquePubliqueCibleVo.getPubliqueCibleVo().getId());
            query += SearchUtil.addConstraint( "o", "publiqueCible.code","LIKE",outilPedagogiquePubliqueCibleVo.getPubliqueCibleVo().getCode());
    }

    if(outilPedagogiquePubliqueCibleVo.getOutilPedagogiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "outilPedagogique.id","=",outilPedagogiquePubliqueCibleVo.getOutilPedagogiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findPubliqueCible(OutilPedagogiquePubliqueCible outilPedagogiquePubliqueCible){
        PubliqueCible loadedPubliqueCible =publiqueCibleService.findByIdOrCode(outilPedagogiquePubliqueCible.getPubliqueCible());

    if(loadedPubliqueCible==null ) {
        return;
    }
    outilPedagogiquePubliqueCible.setPubliqueCible(loadedPubliqueCible);
    }
    private void findOutilPedagogique(OutilPedagogiquePubliqueCible outilPedagogiquePubliqueCible){
        OutilPedagogique loadedOutilPedagogique = null;
        if(outilPedagogiquePubliqueCible.getOutilPedagogique() != null && outilPedagogiquePubliqueCible.getOutilPedagogique().getId() !=null)
        loadedOutilPedagogique =outilPedagogiqueService.findById(outilPedagogiquePubliqueCible.getOutilPedagogique().getId());

    if(loadedOutilPedagogique==null ) {
        return;
    }
    outilPedagogiquePubliqueCible.setOutilPedagogique(loadedOutilPedagogique);
    }

@Override
@Transactional
public void delete(List<OutilPedagogiquePubliqueCible> outilPedagogiquePubliqueCibles){
        if(ListUtil.isNotEmpty(outilPedagogiquePubliqueCibles)){
        outilPedagogiquePubliqueCibles.forEach(e->outilPedagogiquePubliqueCibleDao.delete(e));
        }
}
@Override
public void update(List<OutilPedagogiquePubliqueCible> outilPedagogiquePubliqueCibles){
if(ListUtil.isNotEmpty(outilPedagogiquePubliqueCibles)){
outilPedagogiquePubliqueCibles.forEach(e->outilPedagogiquePubliqueCibleDao.save(e));
}
}



}
