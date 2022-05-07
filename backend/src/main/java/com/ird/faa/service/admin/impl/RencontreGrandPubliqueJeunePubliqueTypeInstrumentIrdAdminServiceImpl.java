package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd;
import com.ird.faa.bean.TypeInstrumentIrd;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePublique;
import com.ird.faa.dao.RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdAdminService;
import com.ird.faa.service.admin.facade.TypeInstrumentIrdAdminService;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueAdminService;

import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdAdminServiceImpl extends AbstractServiceImpl<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> implements RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdAdminService {

@Autowired
private RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao;

        @Autowired
        private TypeInstrumentIrdAdminService typeInstrumentIrdService ;
        @Autowired
        private RencontreGrandPubliqueJeunePubliqueAdminService rencontreGrandPubliqueJeunePubliqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> findAll(){
        return rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.findAll();
}

        @Override
        public List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> findByTypeInstrumentIrdCode(String code){
        return rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.findByTypeInstrumentIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByTypeInstrumentIrdCode(String code){
        return rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.deleteByTypeInstrumentIrdCode(code);
        }

        @Override
        public List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> findByTypeInstrumentIrdId(Long id){
        return rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.findByTypeInstrumentIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByTypeInstrumentIrdId(Long id){
        return rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.deleteByTypeInstrumentIrdId(id);
        }

        @Override
        public List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> findByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @Override
        @Transactional
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }


@Override
public RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd findById(Long id){
if(id==null) return null;
return rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.getOne(id);
}

@Override
public RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.findById(id).isPresent())  {
rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd update(RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd){
RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd foundedRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd = findById(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd.getId());
if(foundedRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd==null) return null;
else{
return  rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.save(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd);
}
}

@Override
public RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd save (RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd){



    findTypeInstrumentIrd(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd);
    findRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd);

return rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.save(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd);


}

@Override
public List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> save(List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds){
List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> list = new ArrayList<>();
for(RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd: rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds){
list.add(save(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd));
}
return list;
}



@Override
@Transactional
public int delete(RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd){
    if(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd.getId()==null) return -1;
    RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd foundedRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd = findById(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd.getId());
    if(foundedRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd==null) return -1;
rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.delete(foundedRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd);
return 1;
}


public List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> findByCriteria(RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo){

String query = "SELECT o FROM RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo.getId());
    if(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo.getTypeInstrumentIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "typeInstrumentIrd.id","=",rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo.getTypeInstrumentIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "typeInstrumentIrd.code","LIKE",rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo.getTypeInstrumentIrdVo().getCode());
    }

    if(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo.getRencontreGrandPubliqueJeunePubliqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "rencontreGrandPubliqueJeunePublique.id","=",rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo.getRencontreGrandPubliqueJeunePubliqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findTypeInstrumentIrd(RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd){
        TypeInstrumentIrd loadedTypeInstrumentIrd =typeInstrumentIrdService.findByIdOrCode(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd.getTypeInstrumentIrd());

    if(loadedTypeInstrumentIrd==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd.setTypeInstrumentIrd(loadedTypeInstrumentIrd);
    }
    private void findRencontreGrandPubliqueJeunePublique(RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd){
        RencontreGrandPubliqueJeunePublique loadedRencontreGrandPubliqueJeunePublique = null;
        if(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd.getRencontreGrandPubliqueJeunePublique() != null && rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd.getRencontreGrandPubliqueJeunePublique().getId() !=null)
        loadedRencontreGrandPubliqueJeunePublique =rencontreGrandPubliqueJeunePubliqueService.findById(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd.getRencontreGrandPubliqueJeunePublique().getId());

    if(loadedRencontreGrandPubliqueJeunePublique==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd.setRencontreGrandPubliqueJeunePublique(loadedRencontreGrandPubliqueJeunePublique);
    }

@Override
@Transactional
public void delete(List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds){
        if(ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds)){
        rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds.forEach(e->rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.delete(e));
        }
}
@Override
public void update(List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds){
if(ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds)){
rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds.forEach(e->rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao.save(e));
}
}



}
