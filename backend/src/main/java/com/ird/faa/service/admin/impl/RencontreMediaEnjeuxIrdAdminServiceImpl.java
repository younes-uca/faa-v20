package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.RencontreMediaEnjeuxIrd;
import com.ird.faa.bean.RencontreMedia;
import com.ird.faa.bean.EnjeuxIrd;
import com.ird.faa.dao.RencontreMediaEnjeuxIrdDao;
import com.ird.faa.service.admin.facade.RencontreMediaEnjeuxIrdAdminService;
import com.ird.faa.service.admin.facade.RencontreMediaAdminService;
import com.ird.faa.service.admin.facade.EnjeuxIrdAdminService;

import com.ird.faa.ws.rest.provided.vo.RencontreMediaEnjeuxIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class RencontreMediaEnjeuxIrdAdminServiceImpl extends AbstractServiceImpl<RencontreMediaEnjeuxIrd> implements RencontreMediaEnjeuxIrdAdminService {

@Autowired
private RencontreMediaEnjeuxIrdDao rencontreMediaEnjeuxIrdDao;

        @Autowired
        private RencontreMediaAdminService rencontreMediaService ;
        @Autowired
        private EnjeuxIrdAdminService enjeuxIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<RencontreMediaEnjeuxIrd> findAll(){
        return rencontreMediaEnjeuxIrdDao.findAll();
}
        @Override
        public List<RencontreMediaEnjeuxIrd> findByRencontreMediaId(Long id){
        return rencontreMediaEnjeuxIrdDao.findByRencontreMediaId(id);
        }

        @Override
        @Transactional
        public int deleteByRencontreMediaId(Long id){
        return rencontreMediaEnjeuxIrdDao.deleteByRencontreMediaId(id);
        }


        @Override
        public List<RencontreMediaEnjeuxIrd> findByEnjeuxIrdCode(String code){
        return rencontreMediaEnjeuxIrdDao.findByEnjeuxIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdCode(String code){
        return rencontreMediaEnjeuxIrdDao.deleteByEnjeuxIrdCode(code);
        }

        @Override
        public List<RencontreMediaEnjeuxIrd> findByEnjeuxIrdId(Long id){
        return rencontreMediaEnjeuxIrdDao.findByEnjeuxIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdId(Long id){
        return rencontreMediaEnjeuxIrdDao.deleteByEnjeuxIrdId(id);
        }


@Override
public RencontreMediaEnjeuxIrd findById(Long id){
if(id==null) return null;
return rencontreMediaEnjeuxIrdDao.getOne(id);
}

@Override
public RencontreMediaEnjeuxIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(rencontreMediaEnjeuxIrdDao.findById(id).isPresent())  {
rencontreMediaEnjeuxIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public RencontreMediaEnjeuxIrd update(RencontreMediaEnjeuxIrd rencontreMediaEnjeuxIrd){
RencontreMediaEnjeuxIrd foundedRencontreMediaEnjeuxIrd = findById(rencontreMediaEnjeuxIrd.getId());
if(foundedRencontreMediaEnjeuxIrd==null) return null;
else{
return  rencontreMediaEnjeuxIrdDao.save(rencontreMediaEnjeuxIrd);
}
}

@Override
public RencontreMediaEnjeuxIrd save (RencontreMediaEnjeuxIrd rencontreMediaEnjeuxIrd){



    findRencontreMedia(rencontreMediaEnjeuxIrd);
    findEnjeuxIrd(rencontreMediaEnjeuxIrd);

return rencontreMediaEnjeuxIrdDao.save(rencontreMediaEnjeuxIrd);


}

@Override
public List<RencontreMediaEnjeuxIrd> save(List<RencontreMediaEnjeuxIrd> rencontreMediaEnjeuxIrds){
List<RencontreMediaEnjeuxIrd> list = new ArrayList<>();
for(RencontreMediaEnjeuxIrd rencontreMediaEnjeuxIrd: rencontreMediaEnjeuxIrds){
list.add(save(rencontreMediaEnjeuxIrd));
}
return list;
}



@Override
@Transactional
public int delete(RencontreMediaEnjeuxIrd rencontreMediaEnjeuxIrd){
    if(rencontreMediaEnjeuxIrd.getId()==null) return -1;
    RencontreMediaEnjeuxIrd foundedRencontreMediaEnjeuxIrd = findById(rencontreMediaEnjeuxIrd.getId());
    if(foundedRencontreMediaEnjeuxIrd==null) return -1;
rencontreMediaEnjeuxIrdDao.delete(foundedRencontreMediaEnjeuxIrd);
return 1;
}


public List<RencontreMediaEnjeuxIrd> findByCriteria(RencontreMediaEnjeuxIrdVo rencontreMediaEnjeuxIrdVo){

String query = "SELECT o FROM RencontreMediaEnjeuxIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",rencontreMediaEnjeuxIrdVo.getId());
    if(rencontreMediaEnjeuxIrdVo.getRencontreMediaVo()!=null){
        query += SearchUtil.addConstraint( "o", "rencontreMedia.id","=",rencontreMediaEnjeuxIrdVo.getRencontreMediaVo().getId());
    }

    if(rencontreMediaEnjeuxIrdVo.getEnjeuxIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "enjeuxIrd.id","=",rencontreMediaEnjeuxIrdVo.getEnjeuxIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "enjeuxIrd.code","LIKE",rencontreMediaEnjeuxIrdVo.getEnjeuxIrdVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findRencontreMedia(RencontreMediaEnjeuxIrd rencontreMediaEnjeuxIrd){
        RencontreMedia loadedRencontreMedia = null;
        if(rencontreMediaEnjeuxIrd.getRencontreMedia() != null && rencontreMediaEnjeuxIrd.getRencontreMedia().getId() !=null)
        loadedRencontreMedia =rencontreMediaService.findById(rencontreMediaEnjeuxIrd.getRencontreMedia().getId());

    if(loadedRencontreMedia==null ) {
        return;
    }
    rencontreMediaEnjeuxIrd.setRencontreMedia(loadedRencontreMedia);
    }
    private void findEnjeuxIrd(RencontreMediaEnjeuxIrd rencontreMediaEnjeuxIrd){
        EnjeuxIrd loadedEnjeuxIrd =enjeuxIrdService.findByIdOrCode(rencontreMediaEnjeuxIrd.getEnjeuxIrd());

    if(loadedEnjeuxIrd==null ) {
        return;
    }
    rencontreMediaEnjeuxIrd.setEnjeuxIrd(loadedEnjeuxIrd);
    }

@Override
@Transactional
public void delete(List<RencontreMediaEnjeuxIrd> rencontreMediaEnjeuxIrds){
        if(ListUtil.isNotEmpty(rencontreMediaEnjeuxIrds)){
        rencontreMediaEnjeuxIrds.forEach(e->rencontreMediaEnjeuxIrdDao.delete(e));
        }
}
@Override
public void update(List<RencontreMediaEnjeuxIrd> rencontreMediaEnjeuxIrds){
if(ListUtil.isNotEmpty(rencontreMediaEnjeuxIrds)){
rencontreMediaEnjeuxIrds.forEach(e->rencontreMediaEnjeuxIrdDao.save(e));
}
}



}
