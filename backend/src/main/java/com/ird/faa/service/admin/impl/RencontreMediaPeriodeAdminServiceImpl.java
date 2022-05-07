package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.RencontreMediaPeriode;
import com.ird.faa.bean.RencontreMedia;
import com.ird.faa.dao.RencontreMediaPeriodeDao;
import com.ird.faa.service.admin.facade.RencontreMediaPeriodeAdminService;
import com.ird.faa.service.admin.facade.RencontreMediaAdminService;

import com.ird.faa.ws.rest.provided.vo.RencontreMediaPeriodeVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class RencontreMediaPeriodeAdminServiceImpl extends AbstractServiceImpl<RencontreMediaPeriode> implements RencontreMediaPeriodeAdminService {

@Autowired
private RencontreMediaPeriodeDao rencontreMediaPeriodeDao;

        @Autowired
        private RencontreMediaAdminService rencontreMediaService ;


@Autowired
private EntityManager entityManager;


@Override
public List<RencontreMediaPeriode> findAll(){
        return rencontreMediaPeriodeDao.findAll();
}
        @Override
        public List<RencontreMediaPeriode> findByRencontreMediaId(Long id){
        return rencontreMediaPeriodeDao.findByRencontreMediaId(id);
        }

        @Override
        @Transactional
        public int deleteByRencontreMediaId(Long id){
        return rencontreMediaPeriodeDao.deleteByRencontreMediaId(id);
        }


@Override
public RencontreMediaPeriode findById(Long id){
if(id==null) return null;
return rencontreMediaPeriodeDao.getOne(id);
}

@Override
public RencontreMediaPeriode findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(rencontreMediaPeriodeDao.findById(id).isPresent())  {
rencontreMediaPeriodeDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public RencontreMediaPeriode update(RencontreMediaPeriode rencontreMediaPeriode){
RencontreMediaPeriode foundedRencontreMediaPeriode = findById(rencontreMediaPeriode.getId());
if(foundedRencontreMediaPeriode==null) return null;
else{
return  rencontreMediaPeriodeDao.save(rencontreMediaPeriode);
}
}

@Override
public RencontreMediaPeriode save (RencontreMediaPeriode rencontreMediaPeriode){



    findRencontreMedia(rencontreMediaPeriode);

return rencontreMediaPeriodeDao.save(rencontreMediaPeriode);


}

@Override
public List<RencontreMediaPeriode> save(List<RencontreMediaPeriode> rencontreMediaPeriodes){
List<RencontreMediaPeriode> list = new ArrayList<>();
for(RencontreMediaPeriode rencontreMediaPeriode: rencontreMediaPeriodes){
list.add(save(rencontreMediaPeriode));
}
return list;
}



@Override
@Transactional
public int delete(RencontreMediaPeriode rencontreMediaPeriode){
    if(rencontreMediaPeriode.getId()==null) return -1;
    RencontreMediaPeriode foundedRencontreMediaPeriode = findById(rencontreMediaPeriode.getId());
    if(foundedRencontreMediaPeriode==null) return -1;
rencontreMediaPeriodeDao.delete(foundedRencontreMediaPeriode);
return 1;
}


public List<RencontreMediaPeriode> findByCriteria(RencontreMediaPeriodeVo rencontreMediaPeriodeVo){

String query = "SELECT o FROM RencontreMediaPeriode o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",rencontreMediaPeriodeVo.getId());
        query += SearchUtil.addConstraintDate( "o", "dateRencontre","=",rencontreMediaPeriodeVo.getDateRencontre());
            query += SearchUtil.addConstraintMinMaxDate("o","dateRencontre",rencontreMediaPeriodeVo.getDateRencontreMin(),rencontreMediaPeriodeVo.getDateRencontreMax());
    if(rencontreMediaPeriodeVo.getRencontreMediaVo()!=null){
        query += SearchUtil.addConstraint( "o", "rencontreMedia.id","=",rencontreMediaPeriodeVo.getRencontreMediaVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findRencontreMedia(RencontreMediaPeriode rencontreMediaPeriode){
        RencontreMedia loadedRencontreMedia = null;
        if(rencontreMediaPeriode.getRencontreMedia() != null && rencontreMediaPeriode.getRencontreMedia().getId() !=null)
        loadedRencontreMedia =rencontreMediaService.findById(rencontreMediaPeriode.getRencontreMedia().getId());

    if(loadedRencontreMedia==null ) {
        return;
    }
    rencontreMediaPeriode.setRencontreMedia(loadedRencontreMedia);
    }

@Override
@Transactional
public void delete(List<RencontreMediaPeriode> rencontreMediaPeriodes){
        if(ListUtil.isNotEmpty(rencontreMediaPeriodes)){
        rencontreMediaPeriodes.forEach(e->rencontreMediaPeriodeDao.delete(e));
        }
}
@Override
public void update(List<RencontreMediaPeriode> rencontreMediaPeriodes){
if(ListUtil.isNotEmpty(rencontreMediaPeriodes)){
rencontreMediaPeriodes.forEach(e->rencontreMediaPeriodeDao.save(e));
}
}



}
