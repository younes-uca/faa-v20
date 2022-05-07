package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueEnjeuxIrd;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePublique;
import com.ird.faa.bean.EnjeuxIrd;
import com.ird.faa.dao.RencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao;
import com.ird.faa.service.chercheur.facade.RencontreGrandPubliqueJeunePubliqueEnjeuxIrdChercheurService;
import com.ird.faa.service.chercheur.facade.RencontreGrandPubliqueJeunePubliqueChercheurService;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdChercheurService;

import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class RencontreGrandPubliqueJeunePubliqueEnjeuxIrdChercheurServiceImpl extends AbstractServiceImpl<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> implements RencontreGrandPubliqueJeunePubliqueEnjeuxIrdChercheurService {

@Autowired
private RencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao;

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueChercheurService rencontreGrandPubliqueJeunePubliqueService ;
        @Autowired
        private EnjeuxIrdChercheurService enjeuxIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findAll(){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.findAll();
}
        @Override
        public List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @Override
        @Transactional
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }


        @Override
        public List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findByEnjeuxIrdCode(String code){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.findByEnjeuxIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdCode(String code){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.deleteByEnjeuxIrdCode(code);
        }

        @Override
        public List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findByEnjeuxIrdId(Long id){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.findByEnjeuxIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdId(Long id){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.deleteByEnjeuxIrdId(id);
        }


@Override
public RencontreGrandPubliqueJeunePubliqueEnjeuxIrd findById(Long id){
if(id==null) return null;
return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.getOne(id);
}

@Override
public RencontreGrandPubliqueJeunePubliqueEnjeuxIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.findById(id).isPresent())  {
rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public RencontreGrandPubliqueJeunePubliqueEnjeuxIrd update(RencontreGrandPubliqueJeunePubliqueEnjeuxIrd rencontreGrandPubliqueJeunePubliqueEnjeuxIrd){
RencontreGrandPubliqueJeunePubliqueEnjeuxIrd foundedRencontreGrandPubliqueJeunePubliqueEnjeuxIrd = findById(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd.getId());
if(foundedRencontreGrandPubliqueJeunePubliqueEnjeuxIrd==null) return null;
else{
return  rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.save(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd);
}
}

@Override
public RencontreGrandPubliqueJeunePubliqueEnjeuxIrd save (RencontreGrandPubliqueJeunePubliqueEnjeuxIrd rencontreGrandPubliqueJeunePubliqueEnjeuxIrd){



    findRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd);
    findEnjeuxIrd(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd);

return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.save(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd);


}

@Override
public List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> save(List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> rencontreGrandPubliqueJeunePubliqueEnjeuxIrds){
List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> list = new ArrayList<>();
for(RencontreGrandPubliqueJeunePubliqueEnjeuxIrd rencontreGrandPubliqueJeunePubliqueEnjeuxIrd: rencontreGrandPubliqueJeunePubliqueEnjeuxIrds){
list.add(save(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd));
}
return list;
}



@Override
@Transactional
public int delete(RencontreGrandPubliqueJeunePubliqueEnjeuxIrd rencontreGrandPubliqueJeunePubliqueEnjeuxIrd){
    if(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd.getId()==null) return -1;
    RencontreGrandPubliqueJeunePubliqueEnjeuxIrd foundedRencontreGrandPubliqueJeunePubliqueEnjeuxIrd = findById(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd.getId());
    if(foundedRencontreGrandPubliqueJeunePubliqueEnjeuxIrd==null) return -1;
rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.delete(foundedRencontreGrandPubliqueJeunePubliqueEnjeuxIrd);
return 1;
}


public List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findByCriteria(RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo){

String query = "SELECT o FROM RencontreGrandPubliqueJeunePubliqueEnjeuxIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo.getId());
    if(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo.getRencontreGrandPubliqueJeunePubliqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "rencontreGrandPubliqueJeunePublique.id","=",rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo.getRencontreGrandPubliqueJeunePubliqueVo().getId());
    }

    if(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo.getEnjeuxIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "enjeuxIrd.id","=",rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo.getEnjeuxIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "enjeuxIrd.code","LIKE",rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo.getEnjeuxIrdVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findRencontreGrandPubliqueJeunePublique(RencontreGrandPubliqueJeunePubliqueEnjeuxIrd rencontreGrandPubliqueJeunePubliqueEnjeuxIrd){
        RencontreGrandPubliqueJeunePublique loadedRencontreGrandPubliqueJeunePublique = null;
        if(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd.getRencontreGrandPubliqueJeunePublique() != null && rencontreGrandPubliqueJeunePubliqueEnjeuxIrd.getRencontreGrandPubliqueJeunePublique().getId() !=null)
        loadedRencontreGrandPubliqueJeunePublique =rencontreGrandPubliqueJeunePubliqueService.findById(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd.getRencontreGrandPubliqueJeunePublique().getId());

    if(loadedRencontreGrandPubliqueJeunePublique==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePubliqueEnjeuxIrd.setRencontreGrandPubliqueJeunePublique(loadedRencontreGrandPubliqueJeunePublique);
    }
    private void findEnjeuxIrd(RencontreGrandPubliqueJeunePubliqueEnjeuxIrd rencontreGrandPubliqueJeunePubliqueEnjeuxIrd){
        EnjeuxIrd loadedEnjeuxIrd =enjeuxIrdService.findByIdOrCode(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd.getEnjeuxIrd());

    if(loadedEnjeuxIrd==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePubliqueEnjeuxIrd.setEnjeuxIrd(loadedEnjeuxIrd);
    }

@Override
@Transactional
public void delete(List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> rencontreGrandPubliqueJeunePubliqueEnjeuxIrds){
        if(ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliqueEnjeuxIrds)){
        rencontreGrandPubliqueJeunePubliqueEnjeuxIrds.forEach(e->rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.delete(e));
        }
}
@Override
public void update(List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> rencontreGrandPubliqueJeunePubliqueEnjeuxIrds){
if(ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliqueEnjeuxIrds)){
rencontreGrandPubliqueJeunePubliqueEnjeuxIrds.forEach(e->rencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao.save(e));
}
}



}
