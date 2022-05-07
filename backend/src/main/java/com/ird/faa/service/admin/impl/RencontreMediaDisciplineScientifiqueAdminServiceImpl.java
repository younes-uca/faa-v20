package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.RencontreMediaDisciplineScientifique;
import com.ird.faa.bean.RencontreMedia;
import com.ird.faa.bean.DisciplineScientifique;
import com.ird.faa.dao.RencontreMediaDisciplineScientifiqueDao;
import com.ird.faa.service.admin.facade.RencontreMediaDisciplineScientifiqueAdminService;
import com.ird.faa.service.admin.facade.RencontreMediaAdminService;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueAdminService;

import com.ird.faa.ws.rest.provided.vo.RencontreMediaDisciplineScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class RencontreMediaDisciplineScientifiqueAdminServiceImpl extends AbstractServiceImpl<RencontreMediaDisciplineScientifique> implements RencontreMediaDisciplineScientifiqueAdminService {

@Autowired
private RencontreMediaDisciplineScientifiqueDao rencontreMediaDisciplineScientifiqueDao;

        @Autowired
        private RencontreMediaAdminService rencontreMediaService ;
        @Autowired
        private DisciplineScientifiqueAdminService disciplineScientifiqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<RencontreMediaDisciplineScientifique> findAll(){
        return rencontreMediaDisciplineScientifiqueDao.findAll();
}
        @Override
        public List<RencontreMediaDisciplineScientifique> findByRencontreMediaId(Long id){
        return rencontreMediaDisciplineScientifiqueDao.findByRencontreMediaId(id);
        }

        @Override
        @Transactional
        public int deleteByRencontreMediaId(Long id){
        return rencontreMediaDisciplineScientifiqueDao.deleteByRencontreMediaId(id);
        }


        @Override
        public List<RencontreMediaDisciplineScientifique> findByDisciplineScientifiqueCode(String code){
        return rencontreMediaDisciplineScientifiqueDao.findByDisciplineScientifiqueCode(code);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueCode(String code){
        return rencontreMediaDisciplineScientifiqueDao.deleteByDisciplineScientifiqueCode(code);
        }

        @Override
        public List<RencontreMediaDisciplineScientifique> findByDisciplineScientifiqueId(Long id){
        return rencontreMediaDisciplineScientifiqueDao.findByDisciplineScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueId(Long id){
        return rencontreMediaDisciplineScientifiqueDao.deleteByDisciplineScientifiqueId(id);
        }


@Override
public RencontreMediaDisciplineScientifique findById(Long id){
if(id==null) return null;
return rencontreMediaDisciplineScientifiqueDao.getOne(id);
}

@Override
public RencontreMediaDisciplineScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(rencontreMediaDisciplineScientifiqueDao.findById(id).isPresent())  {
rencontreMediaDisciplineScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public RencontreMediaDisciplineScientifique update(RencontreMediaDisciplineScientifique rencontreMediaDisciplineScientifique){
RencontreMediaDisciplineScientifique foundedRencontreMediaDisciplineScientifique = findById(rencontreMediaDisciplineScientifique.getId());
if(foundedRencontreMediaDisciplineScientifique==null) return null;
else{
return  rencontreMediaDisciplineScientifiqueDao.save(rencontreMediaDisciplineScientifique);
}
}

@Override
public RencontreMediaDisciplineScientifique save (RencontreMediaDisciplineScientifique rencontreMediaDisciplineScientifique){



    findRencontreMedia(rencontreMediaDisciplineScientifique);
    findDisciplineScientifique(rencontreMediaDisciplineScientifique);

return rencontreMediaDisciplineScientifiqueDao.save(rencontreMediaDisciplineScientifique);


}

@Override
public List<RencontreMediaDisciplineScientifique> save(List<RencontreMediaDisciplineScientifique> rencontreMediaDisciplineScientifiques){
List<RencontreMediaDisciplineScientifique> list = new ArrayList<>();
for(RencontreMediaDisciplineScientifique rencontreMediaDisciplineScientifique: rencontreMediaDisciplineScientifiques){
list.add(save(rencontreMediaDisciplineScientifique));
}
return list;
}



@Override
@Transactional
public int delete(RencontreMediaDisciplineScientifique rencontreMediaDisciplineScientifique){
    if(rencontreMediaDisciplineScientifique.getId()==null) return -1;
    RencontreMediaDisciplineScientifique foundedRencontreMediaDisciplineScientifique = findById(rencontreMediaDisciplineScientifique.getId());
    if(foundedRencontreMediaDisciplineScientifique==null) return -1;
rencontreMediaDisciplineScientifiqueDao.delete(foundedRencontreMediaDisciplineScientifique);
return 1;
}


public List<RencontreMediaDisciplineScientifique> findByCriteria(RencontreMediaDisciplineScientifiqueVo rencontreMediaDisciplineScientifiqueVo){

String query = "SELECT o FROM RencontreMediaDisciplineScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",rencontreMediaDisciplineScientifiqueVo.getId());
    if(rencontreMediaDisciplineScientifiqueVo.getRencontreMediaVo()!=null){
        query += SearchUtil.addConstraint( "o", "rencontreMedia.id","=",rencontreMediaDisciplineScientifiqueVo.getRencontreMediaVo().getId());
    }

    if(rencontreMediaDisciplineScientifiqueVo.getDisciplineScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "disciplineScientifique.id","=",rencontreMediaDisciplineScientifiqueVo.getDisciplineScientifiqueVo().getId());
            query += SearchUtil.addConstraint( "o", "disciplineScientifique.code","LIKE",rencontreMediaDisciplineScientifiqueVo.getDisciplineScientifiqueVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findRencontreMedia(RencontreMediaDisciplineScientifique rencontreMediaDisciplineScientifique){
        RencontreMedia loadedRencontreMedia = null;
        if(rencontreMediaDisciplineScientifique.getRencontreMedia() != null && rencontreMediaDisciplineScientifique.getRencontreMedia().getId() !=null)
        loadedRencontreMedia =rencontreMediaService.findById(rencontreMediaDisciplineScientifique.getRencontreMedia().getId());

    if(loadedRencontreMedia==null ) {
        return;
    }
    rencontreMediaDisciplineScientifique.setRencontreMedia(loadedRencontreMedia);
    }
    private void findDisciplineScientifique(RencontreMediaDisciplineScientifique rencontreMediaDisciplineScientifique){
        DisciplineScientifique loadedDisciplineScientifique =disciplineScientifiqueService.findByIdOrCode(rencontreMediaDisciplineScientifique.getDisciplineScientifique());

    if(loadedDisciplineScientifique==null ) {
        return;
    }
    rencontreMediaDisciplineScientifique.setDisciplineScientifique(loadedDisciplineScientifique);
    }

@Override
@Transactional
public void delete(List<RencontreMediaDisciplineScientifique> rencontreMediaDisciplineScientifiques){
        if(ListUtil.isNotEmpty(rencontreMediaDisciplineScientifiques)){
        rencontreMediaDisciplineScientifiques.forEach(e->rencontreMediaDisciplineScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<RencontreMediaDisciplineScientifique> rencontreMediaDisciplineScientifiques){
if(ListUtil.isNotEmpty(rencontreMediaDisciplineScientifiques)){
rencontreMediaDisciplineScientifiques.forEach(e->rencontreMediaDisciplineScientifiqueDao.save(e));
}
}



}
