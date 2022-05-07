package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueDisciplineScientifique;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePublique;
import com.ird.faa.bean.DisciplineScientifique;
import com.ird.faa.dao.RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueAdminService;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueAdminService;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueAdminService;

import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueAdminServiceImpl extends AbstractServiceImpl<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> implements RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueAdminService {

@Autowired
private RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao;

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueAdminService rencontreGrandPubliqueJeunePubliqueService ;
        @Autowired
        private DisciplineScientifiqueAdminService disciplineScientifiqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findAll(){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.findAll();
}
        @Override
        public List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @Override
        @Transactional
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }


        @Override
        public List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findByDisciplineScientifiqueCode(String code){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.findByDisciplineScientifiqueCode(code);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueCode(String code){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.deleteByDisciplineScientifiqueCode(code);
        }

        @Override
        public List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findByDisciplineScientifiqueId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.findByDisciplineScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.deleteByDisciplineScientifiqueId(id);
        }


@Override
public RencontreGrandPubliqueJeunePubliqueDisciplineScientifique findById(Long id){
if(id==null) return null;
return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.getOne(id);
}

@Override
public RencontreGrandPubliqueJeunePubliqueDisciplineScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.findById(id).isPresent())  {
rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public RencontreGrandPubliqueJeunePubliqueDisciplineScientifique update(RencontreGrandPubliqueJeunePubliqueDisciplineScientifique rencontreGrandPubliqueJeunePubliqueDisciplineScientifique){
RencontreGrandPubliqueJeunePubliqueDisciplineScientifique foundedRencontreGrandPubliqueJeunePubliqueDisciplineScientifique = findById(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique.getId());
if(foundedRencontreGrandPubliqueJeunePubliqueDisciplineScientifique==null) return null;
else{
return  rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.save(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique);
}
}

@Override
public RencontreGrandPubliqueJeunePubliqueDisciplineScientifique save (RencontreGrandPubliqueJeunePubliqueDisciplineScientifique rencontreGrandPubliqueJeunePubliqueDisciplineScientifique){



    findRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique);
    findDisciplineScientifique(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique);

return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.save(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique);


}

@Override
public List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> save(List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques){
List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> list = new ArrayList<>();
for(RencontreGrandPubliqueJeunePubliqueDisciplineScientifique rencontreGrandPubliqueJeunePubliqueDisciplineScientifique: rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques){
list.add(save(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique));
}
return list;
}



@Override
@Transactional
public int delete(RencontreGrandPubliqueJeunePubliqueDisciplineScientifique rencontreGrandPubliqueJeunePubliqueDisciplineScientifique){
    if(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique.getId()==null) return -1;
    RencontreGrandPubliqueJeunePubliqueDisciplineScientifique foundedRencontreGrandPubliqueJeunePubliqueDisciplineScientifique = findById(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique.getId());
    if(foundedRencontreGrandPubliqueJeunePubliqueDisciplineScientifique==null) return -1;
rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.delete(foundedRencontreGrandPubliqueJeunePubliqueDisciplineScientifique);
return 1;
}


public List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findByCriteria(RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo){

String query = "SELECT o FROM RencontreGrandPubliqueJeunePubliqueDisciplineScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo.getId());
    if(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo.getRencontreGrandPubliqueJeunePubliqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "rencontreGrandPubliqueJeunePublique.id","=",rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo.getRencontreGrandPubliqueJeunePubliqueVo().getId());
    }

    if(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo.getDisciplineScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "disciplineScientifique.id","=",rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo.getDisciplineScientifiqueVo().getId());
            query += SearchUtil.addConstraint( "o", "disciplineScientifique.code","LIKE",rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo.getDisciplineScientifiqueVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findRencontreGrandPubliqueJeunePublique(RencontreGrandPubliqueJeunePubliqueDisciplineScientifique rencontreGrandPubliqueJeunePubliqueDisciplineScientifique){
        RencontreGrandPubliqueJeunePublique loadedRencontreGrandPubliqueJeunePublique = null;
        if(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique.getRencontreGrandPubliqueJeunePublique() != null && rencontreGrandPubliqueJeunePubliqueDisciplineScientifique.getRencontreGrandPubliqueJeunePublique().getId() !=null)
        loadedRencontreGrandPubliqueJeunePublique =rencontreGrandPubliqueJeunePubliqueService.findById(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique.getRencontreGrandPubliqueJeunePublique().getId());

    if(loadedRencontreGrandPubliqueJeunePublique==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePubliqueDisciplineScientifique.setRencontreGrandPubliqueJeunePublique(loadedRencontreGrandPubliqueJeunePublique);
    }
    private void findDisciplineScientifique(RencontreGrandPubliqueJeunePubliqueDisciplineScientifique rencontreGrandPubliqueJeunePubliqueDisciplineScientifique){
        DisciplineScientifique loadedDisciplineScientifique =disciplineScientifiqueService.findByIdOrCode(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique.getDisciplineScientifique());

    if(loadedDisciplineScientifique==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePubliqueDisciplineScientifique.setDisciplineScientifique(loadedDisciplineScientifique);
    }

@Override
@Transactional
public void delete(List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques){
        if(ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques)){
        rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques.forEach(e->rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques){
if(ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques)){
rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques.forEach(e->rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao.save(e));
}
}



}
