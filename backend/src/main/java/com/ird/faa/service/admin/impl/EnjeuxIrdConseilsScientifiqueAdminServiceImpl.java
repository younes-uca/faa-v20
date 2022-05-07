package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EnjeuxIrdConseilsScientifique;
import com.ird.faa.bean.EnjeuxIrd;
import com.ird.faa.bean.ConseilsScientifique;
import com.ird.faa.dao.EnjeuxIrdConseilsScientifiqueDao;
import com.ird.faa.service.admin.facade.EnjeuxIrdConseilsScientifiqueAdminService;
import com.ird.faa.service.admin.facade.ConseilsScientifiqueAdminService;
import com.ird.faa.service.admin.facade.EnjeuxIrdAdminService;

import com.ird.faa.ws.rest.provided.vo.EnjeuxIrdConseilsScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EnjeuxIrdConseilsScientifiqueAdminServiceImpl extends AbstractServiceImpl<EnjeuxIrdConseilsScientifique> implements EnjeuxIrdConseilsScientifiqueAdminService {

@Autowired
private EnjeuxIrdConseilsScientifiqueDao enjeuxIrdConseilsScientifiqueDao;

        @Autowired
        private ConseilsScientifiqueAdminService conseilsScientifiqueService ;
        @Autowired
        private EnjeuxIrdAdminService enjeuxIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<EnjeuxIrdConseilsScientifique> findAll(){
        return enjeuxIrdConseilsScientifiqueDao.findAll();
}

        @Override
        public List<EnjeuxIrdConseilsScientifique> findByEnjeuxIrdCode(String code){
        return enjeuxIrdConseilsScientifiqueDao.findByEnjeuxIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdCode(String code){
        return enjeuxIrdConseilsScientifiqueDao.deleteByEnjeuxIrdCode(code);
        }

        @Override
        public List<EnjeuxIrdConseilsScientifique> findByEnjeuxIrdId(Long id){
        return enjeuxIrdConseilsScientifiqueDao.findByEnjeuxIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdId(Long id){
        return enjeuxIrdConseilsScientifiqueDao.deleteByEnjeuxIrdId(id);
        }

        @Override
        public List<EnjeuxIrdConseilsScientifique> findByConseilsScientifiqueId(Long id){
        return enjeuxIrdConseilsScientifiqueDao.findByConseilsScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByConseilsScientifiqueId(Long id){
        return enjeuxIrdConseilsScientifiqueDao.deleteByConseilsScientifiqueId(id);
        }


@Override
public EnjeuxIrdConseilsScientifique findById(Long id){
if(id==null) return null;
return enjeuxIrdConseilsScientifiqueDao.getOne(id);
}

@Override
public EnjeuxIrdConseilsScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(enjeuxIrdConseilsScientifiqueDao.findById(id).isPresent())  {
enjeuxIrdConseilsScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EnjeuxIrdConseilsScientifique update(EnjeuxIrdConseilsScientifique enjeuxIrdConseilsScientifique){
EnjeuxIrdConseilsScientifique foundedEnjeuxIrdConseilsScientifique = findById(enjeuxIrdConseilsScientifique.getId());
if(foundedEnjeuxIrdConseilsScientifique==null) return null;
else{
return  enjeuxIrdConseilsScientifiqueDao.save(enjeuxIrdConseilsScientifique);
}
}

@Override
public EnjeuxIrdConseilsScientifique save (EnjeuxIrdConseilsScientifique enjeuxIrdConseilsScientifique){



    findEnjeuxIrd(enjeuxIrdConseilsScientifique);
    findConseilsScientifique(enjeuxIrdConseilsScientifique);

return enjeuxIrdConseilsScientifiqueDao.save(enjeuxIrdConseilsScientifique);


}

@Override
public List<EnjeuxIrdConseilsScientifique> save(List<EnjeuxIrdConseilsScientifique> enjeuxIrdConseilsScientifiques){
List<EnjeuxIrdConseilsScientifique> list = new ArrayList<>();
for(EnjeuxIrdConseilsScientifique enjeuxIrdConseilsScientifique: enjeuxIrdConseilsScientifiques){
list.add(save(enjeuxIrdConseilsScientifique));
}
return list;
}



@Override
@Transactional
public int delete(EnjeuxIrdConseilsScientifique enjeuxIrdConseilsScientifique){
    if(enjeuxIrdConseilsScientifique.getId()==null) return -1;
    EnjeuxIrdConseilsScientifique foundedEnjeuxIrdConseilsScientifique = findById(enjeuxIrdConseilsScientifique.getId());
    if(foundedEnjeuxIrdConseilsScientifique==null) return -1;
enjeuxIrdConseilsScientifiqueDao.delete(foundedEnjeuxIrdConseilsScientifique);
return 1;
}


public List<EnjeuxIrdConseilsScientifique> findByCriteria(EnjeuxIrdConseilsScientifiqueVo enjeuxIrdConseilsScientifiqueVo){

String query = "SELECT o FROM EnjeuxIrdConseilsScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",enjeuxIrdConseilsScientifiqueVo.getId());
    if(enjeuxIrdConseilsScientifiqueVo.getEnjeuxIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "enjeuxIrd.id","=",enjeuxIrdConseilsScientifiqueVo.getEnjeuxIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "enjeuxIrd.code","LIKE",enjeuxIrdConseilsScientifiqueVo.getEnjeuxIrdVo().getCode());
    }

    if(enjeuxIrdConseilsScientifiqueVo.getConseilsScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "conseilsScientifique.id","=",enjeuxIrdConseilsScientifiqueVo.getConseilsScientifiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findEnjeuxIrd(EnjeuxIrdConseilsScientifique enjeuxIrdConseilsScientifique){
        EnjeuxIrd loadedEnjeuxIrd =enjeuxIrdService.findByIdOrCode(enjeuxIrdConseilsScientifique.getEnjeuxIrd());

    if(loadedEnjeuxIrd==null ) {
        return;
    }
    enjeuxIrdConseilsScientifique.setEnjeuxIrd(loadedEnjeuxIrd);
    }
    private void findConseilsScientifique(EnjeuxIrdConseilsScientifique enjeuxIrdConseilsScientifique){
        ConseilsScientifique loadedConseilsScientifique = null;
        if(enjeuxIrdConseilsScientifique.getConseilsScientifique() != null && enjeuxIrdConseilsScientifique.getConseilsScientifique().getId() !=null)
        loadedConseilsScientifique =conseilsScientifiqueService.findById(enjeuxIrdConseilsScientifique.getConseilsScientifique().getId());

    if(loadedConseilsScientifique==null ) {
        return;
    }
    enjeuxIrdConseilsScientifique.setConseilsScientifique(loadedConseilsScientifique);
    }

@Override
@Transactional
public void delete(List<EnjeuxIrdConseilsScientifique> enjeuxIrdConseilsScientifiques){
        if(ListUtil.isNotEmpty(enjeuxIrdConseilsScientifiques)){
        enjeuxIrdConseilsScientifiques.forEach(e->enjeuxIrdConseilsScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<EnjeuxIrdConseilsScientifique> enjeuxIrdConseilsScientifiques){
if(ListUtil.isNotEmpty(enjeuxIrdConseilsScientifiques)){
enjeuxIrdConseilsScientifiques.forEach(e->enjeuxIrdConseilsScientifiqueDao.save(e));
}
}



}
