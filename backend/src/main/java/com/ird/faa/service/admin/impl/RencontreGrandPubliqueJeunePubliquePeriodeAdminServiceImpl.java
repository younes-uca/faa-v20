package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliquePeriode;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePublique;
import com.ird.faa.dao.RencontreGrandPubliqueJeunePubliquePeriodeDao;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliquePeriodeAdminService;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueAdminService;

import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliquePeriodeVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class RencontreGrandPubliqueJeunePubliquePeriodeAdminServiceImpl extends AbstractServiceImpl<RencontreGrandPubliqueJeunePubliquePeriode> implements RencontreGrandPubliqueJeunePubliquePeriodeAdminService {

@Autowired
private RencontreGrandPubliqueJeunePubliquePeriodeDao rencontreGrandPubliqueJeunePubliquePeriodeDao;

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueAdminService rencontreGrandPubliqueJeunePubliqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<RencontreGrandPubliqueJeunePubliquePeriode> findAll(){
        return rencontreGrandPubliqueJeunePubliquePeriodeDao.findAll();
}
        @Override
        public List<RencontreGrandPubliqueJeunePubliquePeriode> findByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return rencontreGrandPubliqueJeunePubliquePeriodeDao.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @Override
        @Transactional
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return rencontreGrandPubliqueJeunePubliquePeriodeDao.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }


@Override
public RencontreGrandPubliqueJeunePubliquePeriode findById(Long id){
if(id==null) return null;
return rencontreGrandPubliqueJeunePubliquePeriodeDao.getOne(id);
}

@Override
public RencontreGrandPubliqueJeunePubliquePeriode findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(rencontreGrandPubliqueJeunePubliquePeriodeDao.findById(id).isPresent())  {
rencontreGrandPubliqueJeunePubliquePeriodeDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public RencontreGrandPubliqueJeunePubliquePeriode update(RencontreGrandPubliqueJeunePubliquePeriode rencontreGrandPubliqueJeunePubliquePeriode){
RencontreGrandPubliqueJeunePubliquePeriode foundedRencontreGrandPubliqueJeunePubliquePeriode = findById(rencontreGrandPubliqueJeunePubliquePeriode.getId());
if(foundedRencontreGrandPubliqueJeunePubliquePeriode==null) return null;
else{
return  rencontreGrandPubliqueJeunePubliquePeriodeDao.save(rencontreGrandPubliqueJeunePubliquePeriode);
}
}

@Override
public RencontreGrandPubliqueJeunePubliquePeriode save (RencontreGrandPubliqueJeunePubliquePeriode rencontreGrandPubliqueJeunePubliquePeriode){



    findRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePubliquePeriode);

return rencontreGrandPubliqueJeunePubliquePeriodeDao.save(rencontreGrandPubliqueJeunePubliquePeriode);


}

@Override
public List<RencontreGrandPubliqueJeunePubliquePeriode> save(List<RencontreGrandPubliqueJeunePubliquePeriode> rencontreGrandPubliqueJeunePubliquePeriodes){
List<RencontreGrandPubliqueJeunePubliquePeriode> list = new ArrayList<>();
for(RencontreGrandPubliqueJeunePubliquePeriode rencontreGrandPubliqueJeunePubliquePeriode: rencontreGrandPubliqueJeunePubliquePeriodes){
list.add(save(rencontreGrandPubliqueJeunePubliquePeriode));
}
return list;
}



@Override
@Transactional
public int delete(RencontreGrandPubliqueJeunePubliquePeriode rencontreGrandPubliqueJeunePubliquePeriode){
    if(rencontreGrandPubliqueJeunePubliquePeriode.getId()==null) return -1;
    RencontreGrandPubliqueJeunePubliquePeriode foundedRencontreGrandPubliqueJeunePubliquePeriode = findById(rencontreGrandPubliqueJeunePubliquePeriode.getId());
    if(foundedRencontreGrandPubliqueJeunePubliquePeriode==null) return -1;
rencontreGrandPubliqueJeunePubliquePeriodeDao.delete(foundedRencontreGrandPubliqueJeunePubliquePeriode);
return 1;
}


public List<RencontreGrandPubliqueJeunePubliquePeriode> findByCriteria(RencontreGrandPubliqueJeunePubliquePeriodeVo rencontreGrandPubliqueJeunePubliquePeriodeVo){

String query = "SELECT o FROM RencontreGrandPubliqueJeunePubliquePeriode o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",rencontreGrandPubliqueJeunePubliquePeriodeVo.getId());
        query += SearchUtil.addConstraintDate( "o", "dateRencontre","=",rencontreGrandPubliqueJeunePubliquePeriodeVo.getDateRencontre());
            query += SearchUtil.addConstraintMinMaxDate("o","dateRencontre",rencontreGrandPubliqueJeunePubliquePeriodeVo.getDateRencontreMin(),rencontreGrandPubliqueJeunePubliquePeriodeVo.getDateRencontreMax());
    if(rencontreGrandPubliqueJeunePubliquePeriodeVo.getRencontreGrandPubliqueJeunePubliqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "rencontreGrandPubliqueJeunePublique.id","=",rencontreGrandPubliqueJeunePubliquePeriodeVo.getRencontreGrandPubliqueJeunePubliqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findRencontreGrandPubliqueJeunePublique(RencontreGrandPubliqueJeunePubliquePeriode rencontreGrandPubliqueJeunePubliquePeriode){
        RencontreGrandPubliqueJeunePublique loadedRencontreGrandPubliqueJeunePublique = null;
        if(rencontreGrandPubliqueJeunePubliquePeriode.getRencontreGrandPubliqueJeunePublique() != null && rencontreGrandPubliqueJeunePubliquePeriode.getRencontreGrandPubliqueJeunePublique().getId() !=null)
        loadedRencontreGrandPubliqueJeunePublique =rencontreGrandPubliqueJeunePubliqueService.findById(rencontreGrandPubliqueJeunePubliquePeriode.getRencontreGrandPubliqueJeunePublique().getId());

    if(loadedRencontreGrandPubliqueJeunePublique==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePubliquePeriode.setRencontreGrandPubliqueJeunePublique(loadedRencontreGrandPubliqueJeunePublique);
    }

@Override
@Transactional
public void delete(List<RencontreGrandPubliqueJeunePubliquePeriode> rencontreGrandPubliqueJeunePubliquePeriodes){
        if(ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliquePeriodes)){
        rencontreGrandPubliqueJeunePubliquePeriodes.forEach(e->rencontreGrandPubliqueJeunePubliquePeriodeDao.delete(e));
        }
}
@Override
public void update(List<RencontreGrandPubliqueJeunePubliquePeriode> rencontreGrandPubliqueJeunePubliquePeriodes){
if(ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliquePeriodes)){
rencontreGrandPubliqueJeunePubliquePeriodes.forEach(e->rencontreGrandPubliqueJeunePubliquePeriodeDao.save(e));
}
}



}
