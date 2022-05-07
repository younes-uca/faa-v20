package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EnjeuxIrdEncadrementDoctorant;
import com.ird.faa.bean.EnjeuxIrd;
import com.ird.faa.bean.EncadrementDoctorant;
import com.ird.faa.dao.EnjeuxIrdEncadrementDoctorantDao;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdEncadrementDoctorantChercheurService;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdChercheurService;
import com.ird.faa.service.chercheur.facade.EncadrementDoctorantChercheurService;

import com.ird.faa.ws.rest.provided.vo.EnjeuxIrdEncadrementDoctorantVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EnjeuxIrdEncadrementDoctorantChercheurServiceImpl extends AbstractServiceImpl<EnjeuxIrdEncadrementDoctorant> implements EnjeuxIrdEncadrementDoctorantChercheurService {

@Autowired
private EnjeuxIrdEncadrementDoctorantDao enjeuxIrdEncadrementDoctorantDao;

        @Autowired
        private EnjeuxIrdChercheurService enjeuxIrdService ;
        @Autowired
        private EncadrementDoctorantChercheurService encadrementDoctorantService ;


@Autowired
private EntityManager entityManager;


@Override
public List<EnjeuxIrdEncadrementDoctorant> findAll(){
        return enjeuxIrdEncadrementDoctorantDao.findAll();
}

        @Override
        public List<EnjeuxIrdEncadrementDoctorant> findByEnjeuxIrdCode(String code){
        return enjeuxIrdEncadrementDoctorantDao.findByEnjeuxIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdCode(String code){
        return enjeuxIrdEncadrementDoctorantDao.deleteByEnjeuxIrdCode(code);
        }

        @Override
        public List<EnjeuxIrdEncadrementDoctorant> findByEnjeuxIrdId(Long id){
        return enjeuxIrdEncadrementDoctorantDao.findByEnjeuxIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdId(Long id){
        return enjeuxIrdEncadrementDoctorantDao.deleteByEnjeuxIrdId(id);
        }

        @Override
        public List<EnjeuxIrdEncadrementDoctorant> findByEncadrementDoctorantId(Long id){
        return enjeuxIrdEncadrementDoctorantDao.findByEncadrementDoctorantId(id);
        }

        @Override
        @Transactional
        public int deleteByEncadrementDoctorantId(Long id){
        return enjeuxIrdEncadrementDoctorantDao.deleteByEncadrementDoctorantId(id);
        }


@Override
public EnjeuxIrdEncadrementDoctorant findById(Long id){
if(id==null) return null;
return enjeuxIrdEncadrementDoctorantDao.getOne(id);
}

@Override
public EnjeuxIrdEncadrementDoctorant findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(enjeuxIrdEncadrementDoctorantDao.findById(id).isPresent())  {
enjeuxIrdEncadrementDoctorantDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EnjeuxIrdEncadrementDoctorant update(EnjeuxIrdEncadrementDoctorant enjeuxIrdEncadrementDoctorant){
EnjeuxIrdEncadrementDoctorant foundedEnjeuxIrdEncadrementDoctorant = findById(enjeuxIrdEncadrementDoctorant.getId());
if(foundedEnjeuxIrdEncadrementDoctorant==null) return null;
else{
return  enjeuxIrdEncadrementDoctorantDao.save(enjeuxIrdEncadrementDoctorant);
}
}

@Override
public EnjeuxIrdEncadrementDoctorant save (EnjeuxIrdEncadrementDoctorant enjeuxIrdEncadrementDoctorant){



    findEnjeuxIrd(enjeuxIrdEncadrementDoctorant);
    findEncadrementDoctorant(enjeuxIrdEncadrementDoctorant);

return enjeuxIrdEncadrementDoctorantDao.save(enjeuxIrdEncadrementDoctorant);


}

@Override
public List<EnjeuxIrdEncadrementDoctorant> save(List<EnjeuxIrdEncadrementDoctorant> enjeuxIrdEncadrementDoctorants){
List<EnjeuxIrdEncadrementDoctorant> list = new ArrayList<>();
for(EnjeuxIrdEncadrementDoctorant enjeuxIrdEncadrementDoctorant: enjeuxIrdEncadrementDoctorants){
list.add(save(enjeuxIrdEncadrementDoctorant));
}
return list;
}



@Override
@Transactional
public int delete(EnjeuxIrdEncadrementDoctorant enjeuxIrdEncadrementDoctorant){
    if(enjeuxIrdEncadrementDoctorant.getId()==null) return -1;
    EnjeuxIrdEncadrementDoctorant foundedEnjeuxIrdEncadrementDoctorant = findById(enjeuxIrdEncadrementDoctorant.getId());
    if(foundedEnjeuxIrdEncadrementDoctorant==null) return -1;
enjeuxIrdEncadrementDoctorantDao.delete(foundedEnjeuxIrdEncadrementDoctorant);
return 1;
}


public List<EnjeuxIrdEncadrementDoctorant> findByCriteria(EnjeuxIrdEncadrementDoctorantVo enjeuxIrdEncadrementDoctorantVo){

String query = "SELECT o FROM EnjeuxIrdEncadrementDoctorant o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",enjeuxIrdEncadrementDoctorantVo.getId());
    if(enjeuxIrdEncadrementDoctorantVo.getEnjeuxIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "enjeuxIrd.id","=",enjeuxIrdEncadrementDoctorantVo.getEnjeuxIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "enjeuxIrd.code","LIKE",enjeuxIrdEncadrementDoctorantVo.getEnjeuxIrdVo().getCode());
    }

    if(enjeuxIrdEncadrementDoctorantVo.getEncadrementDoctorantVo()!=null){
        query += SearchUtil.addConstraint( "o", "encadrementDoctorant.id","=",enjeuxIrdEncadrementDoctorantVo.getEncadrementDoctorantVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findEnjeuxIrd(EnjeuxIrdEncadrementDoctorant enjeuxIrdEncadrementDoctorant){
        EnjeuxIrd loadedEnjeuxIrd =enjeuxIrdService.findByIdOrCode(enjeuxIrdEncadrementDoctorant.getEnjeuxIrd());

    if(loadedEnjeuxIrd==null ) {
        return;
    }
    enjeuxIrdEncadrementDoctorant.setEnjeuxIrd(loadedEnjeuxIrd);
    }
    private void findEncadrementDoctorant(EnjeuxIrdEncadrementDoctorant enjeuxIrdEncadrementDoctorant){
        EncadrementDoctorant loadedEncadrementDoctorant = null;
        if(enjeuxIrdEncadrementDoctorant.getEncadrementDoctorant() != null && enjeuxIrdEncadrementDoctorant.getEncadrementDoctorant().getId() !=null)
        loadedEncadrementDoctorant =encadrementDoctorantService.findById(enjeuxIrdEncadrementDoctorant.getEncadrementDoctorant().getId());

    if(loadedEncadrementDoctorant==null ) {
        return;
    }
    enjeuxIrdEncadrementDoctorant.setEncadrementDoctorant(loadedEncadrementDoctorant);
    }

@Override
@Transactional
public void delete(List<EnjeuxIrdEncadrementDoctorant> enjeuxIrdEncadrementDoctorants){
        if(ListUtil.isNotEmpty(enjeuxIrdEncadrementDoctorants)){
        enjeuxIrdEncadrementDoctorants.forEach(e->enjeuxIrdEncadrementDoctorantDao.delete(e));
        }
}
@Override
public void update(List<EnjeuxIrdEncadrementDoctorant> enjeuxIrdEncadrementDoctorants){
if(ListUtil.isNotEmpty(enjeuxIrdEncadrementDoctorants)){
enjeuxIrdEncadrementDoctorants.forEach(e->enjeuxIrdEncadrementDoctorantDao.save(e));
}
}



}
