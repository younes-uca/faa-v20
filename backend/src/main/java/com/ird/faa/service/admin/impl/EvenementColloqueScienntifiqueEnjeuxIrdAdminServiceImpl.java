package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EvenementColloqueScienntifiqueEnjeuxIrd;
import com.ird.faa.bean.EvenementColloqueScienntifique;
import com.ird.faa.bean.EnjeuxIrd;
import com.ird.faa.dao.EvenementColloqueScienntifiqueEnjeuxIrdDao;
import com.ird.faa.service.admin.facade.EvenementColloqueScienntifiqueEnjeuxIrdAdminService;
import com.ird.faa.service.admin.facade.EnjeuxIrdAdminService;
import com.ird.faa.service.admin.facade.EvenementColloqueScienntifiqueAdminService;

import com.ird.faa.ws.rest.provided.vo.EvenementColloqueScienntifiqueEnjeuxIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EvenementColloqueScienntifiqueEnjeuxIrdAdminServiceImpl extends AbstractServiceImpl<EvenementColloqueScienntifiqueEnjeuxIrd> implements EvenementColloqueScienntifiqueEnjeuxIrdAdminService {

@Autowired
private EvenementColloqueScienntifiqueEnjeuxIrdDao evenementColloqueScienntifiqueEnjeuxIrdDao;

        @Autowired
        private EnjeuxIrdAdminService enjeuxIrdService ;
        @Autowired
        private EvenementColloqueScienntifiqueAdminService evenementColloqueScienntifiqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<EvenementColloqueScienntifiqueEnjeuxIrd> findAll(){
        return evenementColloqueScienntifiqueEnjeuxIrdDao.findAll();
}
        @Override
        public List<EvenementColloqueScienntifiqueEnjeuxIrd> findByEvenementColloqueScienntifiqueId(Long id){
        return evenementColloqueScienntifiqueEnjeuxIrdDao.findByEvenementColloqueScienntifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByEvenementColloqueScienntifiqueId(Long id){
        return evenementColloqueScienntifiqueEnjeuxIrdDao.deleteByEvenementColloqueScienntifiqueId(id);
        }


        @Override
        public List<EvenementColloqueScienntifiqueEnjeuxIrd> findByEnjeuxIrdCode(String code){
        return evenementColloqueScienntifiqueEnjeuxIrdDao.findByEnjeuxIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdCode(String code){
        return evenementColloqueScienntifiqueEnjeuxIrdDao.deleteByEnjeuxIrdCode(code);
        }

        @Override
        public List<EvenementColloqueScienntifiqueEnjeuxIrd> findByEnjeuxIrdId(Long id){
        return evenementColloqueScienntifiqueEnjeuxIrdDao.findByEnjeuxIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdId(Long id){
        return evenementColloqueScienntifiqueEnjeuxIrdDao.deleteByEnjeuxIrdId(id);
        }


@Override
public EvenementColloqueScienntifiqueEnjeuxIrd findById(Long id){
if(id==null) return null;
return evenementColloqueScienntifiqueEnjeuxIrdDao.getOne(id);
}

@Override
public EvenementColloqueScienntifiqueEnjeuxIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(evenementColloqueScienntifiqueEnjeuxIrdDao.findById(id).isPresent())  {
evenementColloqueScienntifiqueEnjeuxIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EvenementColloqueScienntifiqueEnjeuxIrd update(EvenementColloqueScienntifiqueEnjeuxIrd evenementColloqueScienntifiqueEnjeuxIrd){
EvenementColloqueScienntifiqueEnjeuxIrd foundedEvenementColloqueScienntifiqueEnjeuxIrd = findById(evenementColloqueScienntifiqueEnjeuxIrd.getId());
if(foundedEvenementColloqueScienntifiqueEnjeuxIrd==null) return null;
else{
return  evenementColloqueScienntifiqueEnjeuxIrdDao.save(evenementColloqueScienntifiqueEnjeuxIrd);
}
}

@Override
public EvenementColloqueScienntifiqueEnjeuxIrd save (EvenementColloqueScienntifiqueEnjeuxIrd evenementColloqueScienntifiqueEnjeuxIrd){



    findEvenementColloqueScienntifique(evenementColloqueScienntifiqueEnjeuxIrd);
    findEnjeuxIrd(evenementColloqueScienntifiqueEnjeuxIrd);

return evenementColloqueScienntifiqueEnjeuxIrdDao.save(evenementColloqueScienntifiqueEnjeuxIrd);


}

@Override
public List<EvenementColloqueScienntifiqueEnjeuxIrd> save(List<EvenementColloqueScienntifiqueEnjeuxIrd> evenementColloqueScienntifiqueEnjeuxIrds){
List<EvenementColloqueScienntifiqueEnjeuxIrd> list = new ArrayList<>();
for(EvenementColloqueScienntifiqueEnjeuxIrd evenementColloqueScienntifiqueEnjeuxIrd: evenementColloqueScienntifiqueEnjeuxIrds){
list.add(save(evenementColloqueScienntifiqueEnjeuxIrd));
}
return list;
}



@Override
@Transactional
public int delete(EvenementColloqueScienntifiqueEnjeuxIrd evenementColloqueScienntifiqueEnjeuxIrd){
    if(evenementColloqueScienntifiqueEnjeuxIrd.getId()==null) return -1;
    EvenementColloqueScienntifiqueEnjeuxIrd foundedEvenementColloqueScienntifiqueEnjeuxIrd = findById(evenementColloqueScienntifiqueEnjeuxIrd.getId());
    if(foundedEvenementColloqueScienntifiqueEnjeuxIrd==null) return -1;
evenementColloqueScienntifiqueEnjeuxIrdDao.delete(foundedEvenementColloqueScienntifiqueEnjeuxIrd);
return 1;
}


public List<EvenementColloqueScienntifiqueEnjeuxIrd> findByCriteria(EvenementColloqueScienntifiqueEnjeuxIrdVo evenementColloqueScienntifiqueEnjeuxIrdVo){

String query = "SELECT o FROM EvenementColloqueScienntifiqueEnjeuxIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",evenementColloqueScienntifiqueEnjeuxIrdVo.getId());
    if(evenementColloqueScienntifiqueEnjeuxIrdVo.getEvenementColloqueScienntifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "evenementColloqueScienntifique.id","=",evenementColloqueScienntifiqueEnjeuxIrdVo.getEvenementColloqueScienntifiqueVo().getId());
    }

    if(evenementColloqueScienntifiqueEnjeuxIrdVo.getEnjeuxIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "enjeuxIrd.id","=",evenementColloqueScienntifiqueEnjeuxIrdVo.getEnjeuxIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "enjeuxIrd.code","LIKE",evenementColloqueScienntifiqueEnjeuxIrdVo.getEnjeuxIrdVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findEvenementColloqueScienntifique(EvenementColloqueScienntifiqueEnjeuxIrd evenementColloqueScienntifiqueEnjeuxIrd){
        EvenementColloqueScienntifique loadedEvenementColloqueScienntifique = null;
        if(evenementColloqueScienntifiqueEnjeuxIrd.getEvenementColloqueScienntifique() != null && evenementColloqueScienntifiqueEnjeuxIrd.getEvenementColloqueScienntifique().getId() !=null)
        loadedEvenementColloqueScienntifique =evenementColloqueScienntifiqueService.findById(evenementColloqueScienntifiqueEnjeuxIrd.getEvenementColloqueScienntifique().getId());

    if(loadedEvenementColloqueScienntifique==null ) {
        return;
    }
    evenementColloqueScienntifiqueEnjeuxIrd.setEvenementColloqueScienntifique(loadedEvenementColloqueScienntifique);
    }
    private void findEnjeuxIrd(EvenementColloqueScienntifiqueEnjeuxIrd evenementColloqueScienntifiqueEnjeuxIrd){
        EnjeuxIrd loadedEnjeuxIrd =enjeuxIrdService.findByIdOrCode(evenementColloqueScienntifiqueEnjeuxIrd.getEnjeuxIrd());

    if(loadedEnjeuxIrd==null ) {
        return;
    }
    evenementColloqueScienntifiqueEnjeuxIrd.setEnjeuxIrd(loadedEnjeuxIrd);
    }

@Override
@Transactional
public void delete(List<EvenementColloqueScienntifiqueEnjeuxIrd> evenementColloqueScienntifiqueEnjeuxIrds){
        if(ListUtil.isNotEmpty(evenementColloqueScienntifiqueEnjeuxIrds)){
        evenementColloqueScienntifiqueEnjeuxIrds.forEach(e->evenementColloqueScienntifiqueEnjeuxIrdDao.delete(e));
        }
}
@Override
public void update(List<EvenementColloqueScienntifiqueEnjeuxIrd> evenementColloqueScienntifiqueEnjeuxIrds){
if(ListUtil.isNotEmpty(evenementColloqueScienntifiqueEnjeuxIrds)){
evenementColloqueScienntifiqueEnjeuxIrds.forEach(e->evenementColloqueScienntifiqueEnjeuxIrdDao.save(e));
}
}



}
