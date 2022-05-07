package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueInstrumentIrd;
import com.ird.faa.bean.InstrumentIrd;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePublique;
import com.ird.faa.dao.RencontreGrandPubliqueJeunePubliqueInstrumentIrdDao;
import com.ird.faa.service.chercheur.facade.RencontreGrandPubliqueJeunePubliqueInstrumentIrdChercheurService;
import com.ird.faa.service.chercheur.facade.RencontreGrandPubliqueJeunePubliqueChercheurService;
import com.ird.faa.service.chercheur.facade.InstrumentIrdChercheurService;

import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class RencontreGrandPubliqueJeunePubliqueInstrumentIrdChercheurServiceImpl extends AbstractServiceImpl<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> implements RencontreGrandPubliqueJeunePubliqueInstrumentIrdChercheurService {

@Autowired
private RencontreGrandPubliqueJeunePubliqueInstrumentIrdDao rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao;

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueChercheurService rencontreGrandPubliqueJeunePubliqueService ;
        @Autowired
        private InstrumentIrdChercheurService instrumentIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findAll(){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.findAll();
}

        @Override
        public List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findByInstrumentIrdCode(String code){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.findByInstrumentIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByInstrumentIrdCode(String code){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.deleteByInstrumentIrdCode(code);
        }

        @Override
        public List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findByInstrumentIrdId(Long id){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.findByInstrumentIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByInstrumentIrdId(Long id){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.deleteByInstrumentIrdId(id);
        }

        @Override
        public List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @Override
        @Transactional
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }


@Override
public RencontreGrandPubliqueJeunePubliqueInstrumentIrd findById(Long id){
if(id==null) return null;
return rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.getOne(id);
}

@Override
public RencontreGrandPubliqueJeunePubliqueInstrumentIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.findById(id).isPresent())  {
rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public RencontreGrandPubliqueJeunePubliqueInstrumentIrd update(RencontreGrandPubliqueJeunePubliqueInstrumentIrd rencontreGrandPubliqueJeunePubliqueInstrumentIrd){
RencontreGrandPubliqueJeunePubliqueInstrumentIrd foundedRencontreGrandPubliqueJeunePubliqueInstrumentIrd = findById(rencontreGrandPubliqueJeunePubliqueInstrumentIrd.getId());
if(foundedRencontreGrandPubliqueJeunePubliqueInstrumentIrd==null) return null;
else{
return  rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.save(rencontreGrandPubliqueJeunePubliqueInstrumentIrd);
}
}

@Override
public RencontreGrandPubliqueJeunePubliqueInstrumentIrd save (RencontreGrandPubliqueJeunePubliqueInstrumentIrd rencontreGrandPubliqueJeunePubliqueInstrumentIrd){



    findInstrumentIrd(rencontreGrandPubliqueJeunePubliqueInstrumentIrd);
    findRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePubliqueInstrumentIrd);

return rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.save(rencontreGrandPubliqueJeunePubliqueInstrumentIrd);


}

@Override
public List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> save(List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> rencontreGrandPubliqueJeunePubliqueInstrumentIrds){
List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> list = new ArrayList<>();
for(RencontreGrandPubliqueJeunePubliqueInstrumentIrd rencontreGrandPubliqueJeunePubliqueInstrumentIrd: rencontreGrandPubliqueJeunePubliqueInstrumentIrds){
list.add(save(rencontreGrandPubliqueJeunePubliqueInstrumentIrd));
}
return list;
}



@Override
@Transactional
public int delete(RencontreGrandPubliqueJeunePubliqueInstrumentIrd rencontreGrandPubliqueJeunePubliqueInstrumentIrd){
    if(rencontreGrandPubliqueJeunePubliqueInstrumentIrd.getId()==null) return -1;
    RencontreGrandPubliqueJeunePubliqueInstrumentIrd foundedRencontreGrandPubliqueJeunePubliqueInstrumentIrd = findById(rencontreGrandPubliqueJeunePubliqueInstrumentIrd.getId());
    if(foundedRencontreGrandPubliqueJeunePubliqueInstrumentIrd==null) return -1;
rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.delete(foundedRencontreGrandPubliqueJeunePubliqueInstrumentIrd);
return 1;
}


public List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findByCriteria(RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo){

String query = "SELECT o FROM RencontreGrandPubliqueJeunePubliqueInstrumentIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo.getId());
    if(rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo.getInstrumentIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "instrumentIrd.id","=",rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo.getInstrumentIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "instrumentIrd.code","LIKE",rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo.getInstrumentIrdVo().getCode());
    }

    if(rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo.getRencontreGrandPubliqueJeunePubliqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "rencontreGrandPubliqueJeunePublique.id","=",rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo.getRencontreGrandPubliqueJeunePubliqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findInstrumentIrd(RencontreGrandPubliqueJeunePubliqueInstrumentIrd rencontreGrandPubliqueJeunePubliqueInstrumentIrd){
        InstrumentIrd loadedInstrumentIrd =instrumentIrdService.findByIdOrCode(rencontreGrandPubliqueJeunePubliqueInstrumentIrd.getInstrumentIrd());

    if(loadedInstrumentIrd==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePubliqueInstrumentIrd.setInstrumentIrd(loadedInstrumentIrd);
    }
    private void findRencontreGrandPubliqueJeunePublique(RencontreGrandPubliqueJeunePubliqueInstrumentIrd rencontreGrandPubliqueJeunePubliqueInstrumentIrd){
        RencontreGrandPubliqueJeunePublique loadedRencontreGrandPubliqueJeunePublique = null;
        if(rencontreGrandPubliqueJeunePubliqueInstrumentIrd.getRencontreGrandPubliqueJeunePublique() != null && rencontreGrandPubliqueJeunePubliqueInstrumentIrd.getRencontreGrandPubliqueJeunePublique().getId() !=null)
        loadedRencontreGrandPubliqueJeunePublique =rencontreGrandPubliqueJeunePubliqueService.findById(rencontreGrandPubliqueJeunePubliqueInstrumentIrd.getRencontreGrandPubliqueJeunePublique().getId());

    if(loadedRencontreGrandPubliqueJeunePublique==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePubliqueInstrumentIrd.setRencontreGrandPubliqueJeunePublique(loadedRencontreGrandPubliqueJeunePublique);
    }

@Override
@Transactional
public void delete(List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> rencontreGrandPubliqueJeunePubliqueInstrumentIrds){
        if(ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliqueInstrumentIrds)){
        rencontreGrandPubliqueJeunePubliqueInstrumentIrds.forEach(e->rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.delete(e));
        }
}
@Override
public void update(List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> rencontreGrandPubliqueJeunePubliqueInstrumentIrds){
if(ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliqueInstrumentIrds)){
rencontreGrandPubliqueJeunePubliqueInstrumentIrds.forEach(e->rencontreGrandPubliqueJeunePubliqueInstrumentIrdDao.save(e));
}
}



}
