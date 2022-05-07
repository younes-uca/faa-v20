package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.DisciplineScientifiqueConseilsScientifique;
import com.ird.faa.bean.ConseilsScientifique;
import com.ird.faa.bean.DisciplineScientifique;
import com.ird.faa.dao.DisciplineScientifiqueConseilsScientifiqueDao;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueConseilsScientifiqueAdminService;
import com.ird.faa.service.admin.facade.ConseilsScientifiqueAdminService;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueAdminService;

import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueConseilsScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class DisciplineScientifiqueConseilsScientifiqueAdminServiceImpl extends AbstractServiceImpl<DisciplineScientifiqueConseilsScientifique> implements DisciplineScientifiqueConseilsScientifiqueAdminService {

@Autowired
private DisciplineScientifiqueConseilsScientifiqueDao disciplineScientifiqueConseilsScientifiqueDao;

        @Autowired
        private ConseilsScientifiqueAdminService conseilsScientifiqueService ;
        @Autowired
        private DisciplineScientifiqueAdminService disciplineScientifiqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<DisciplineScientifiqueConseilsScientifique> findAll(){
        return disciplineScientifiqueConseilsScientifiqueDao.findAll();
}
        @Override
        public List<DisciplineScientifiqueConseilsScientifique> findByConseilsScientifiqueId(Long id){
        return disciplineScientifiqueConseilsScientifiqueDao.findByConseilsScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByConseilsScientifiqueId(Long id){
        return disciplineScientifiqueConseilsScientifiqueDao.deleteByConseilsScientifiqueId(id);
        }


        @Override
        public List<DisciplineScientifiqueConseilsScientifique> findByDisciplineScientifiqueCode(String code){
        return disciplineScientifiqueConseilsScientifiqueDao.findByDisciplineScientifiqueCode(code);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueCode(String code){
        return disciplineScientifiqueConseilsScientifiqueDao.deleteByDisciplineScientifiqueCode(code);
        }

        @Override
        public List<DisciplineScientifiqueConseilsScientifique> findByDisciplineScientifiqueId(Long id){
        return disciplineScientifiqueConseilsScientifiqueDao.findByDisciplineScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueId(Long id){
        return disciplineScientifiqueConseilsScientifiqueDao.deleteByDisciplineScientifiqueId(id);
        }


@Override
public DisciplineScientifiqueConseilsScientifique findById(Long id){
if(id==null) return null;
return disciplineScientifiqueConseilsScientifiqueDao.getOne(id);
}

@Override
public DisciplineScientifiqueConseilsScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(disciplineScientifiqueConseilsScientifiqueDao.findById(id).isPresent())  {
disciplineScientifiqueConseilsScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public DisciplineScientifiqueConseilsScientifique update(DisciplineScientifiqueConseilsScientifique disciplineScientifiqueConseilsScientifique){
DisciplineScientifiqueConseilsScientifique foundedDisciplineScientifiqueConseilsScientifique = findById(disciplineScientifiqueConseilsScientifique.getId());
if(foundedDisciplineScientifiqueConseilsScientifique==null) return null;
else{
return  disciplineScientifiqueConseilsScientifiqueDao.save(disciplineScientifiqueConseilsScientifique);
}
}

@Override
public DisciplineScientifiqueConseilsScientifique save (DisciplineScientifiqueConseilsScientifique disciplineScientifiqueConseilsScientifique){



    findConseilsScientifique(disciplineScientifiqueConseilsScientifique);
    findDisciplineScientifique(disciplineScientifiqueConseilsScientifique);

return disciplineScientifiqueConseilsScientifiqueDao.save(disciplineScientifiqueConseilsScientifique);


}

@Override
public List<DisciplineScientifiqueConseilsScientifique> save(List<DisciplineScientifiqueConseilsScientifique> disciplineScientifiqueConseilsScientifiques){
List<DisciplineScientifiqueConseilsScientifique> list = new ArrayList<>();
for(DisciplineScientifiqueConseilsScientifique disciplineScientifiqueConseilsScientifique: disciplineScientifiqueConseilsScientifiques){
list.add(save(disciplineScientifiqueConseilsScientifique));
}
return list;
}



@Override
@Transactional
public int delete(DisciplineScientifiqueConseilsScientifique disciplineScientifiqueConseilsScientifique){
    if(disciplineScientifiqueConseilsScientifique.getId()==null) return -1;
    DisciplineScientifiqueConseilsScientifique foundedDisciplineScientifiqueConseilsScientifique = findById(disciplineScientifiqueConseilsScientifique.getId());
    if(foundedDisciplineScientifiqueConseilsScientifique==null) return -1;
disciplineScientifiqueConseilsScientifiqueDao.delete(foundedDisciplineScientifiqueConseilsScientifique);
return 1;
}


public List<DisciplineScientifiqueConseilsScientifique> findByCriteria(DisciplineScientifiqueConseilsScientifiqueVo disciplineScientifiqueConseilsScientifiqueVo){

String query = "SELECT o FROM DisciplineScientifiqueConseilsScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",disciplineScientifiqueConseilsScientifiqueVo.getId());
    if(disciplineScientifiqueConseilsScientifiqueVo.getConseilsScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "conseilsScientifique.id","=",disciplineScientifiqueConseilsScientifiqueVo.getConseilsScientifiqueVo().getId());
    }

    if(disciplineScientifiqueConseilsScientifiqueVo.getDisciplineScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "disciplineScientifique.id","=",disciplineScientifiqueConseilsScientifiqueVo.getDisciplineScientifiqueVo().getId());
            query += SearchUtil.addConstraint( "o", "disciplineScientifique.code","LIKE",disciplineScientifiqueConseilsScientifiqueVo.getDisciplineScientifiqueVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findConseilsScientifique(DisciplineScientifiqueConseilsScientifique disciplineScientifiqueConseilsScientifique){
        ConseilsScientifique loadedConseilsScientifique = null;
        if(disciplineScientifiqueConseilsScientifique.getConseilsScientifique() != null && disciplineScientifiqueConseilsScientifique.getConseilsScientifique().getId() !=null)
        loadedConseilsScientifique =conseilsScientifiqueService.findById(disciplineScientifiqueConseilsScientifique.getConseilsScientifique().getId());

    if(loadedConseilsScientifique==null ) {
        return;
    }
    disciplineScientifiqueConseilsScientifique.setConseilsScientifique(loadedConseilsScientifique);
    }
    private void findDisciplineScientifique(DisciplineScientifiqueConseilsScientifique disciplineScientifiqueConseilsScientifique){
        DisciplineScientifique loadedDisciplineScientifique =disciplineScientifiqueService.findByIdOrCode(disciplineScientifiqueConseilsScientifique.getDisciplineScientifique());

    if(loadedDisciplineScientifique==null ) {
        return;
    }
    disciplineScientifiqueConseilsScientifique.setDisciplineScientifique(loadedDisciplineScientifique);
    }

@Override
@Transactional
public void delete(List<DisciplineScientifiqueConseilsScientifique> disciplineScientifiqueConseilsScientifiques){
        if(ListUtil.isNotEmpty(disciplineScientifiqueConseilsScientifiques)){
        disciplineScientifiqueConseilsScientifiques.forEach(e->disciplineScientifiqueConseilsScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<DisciplineScientifiqueConseilsScientifique> disciplineScientifiqueConseilsScientifiques){
if(ListUtil.isNotEmpty(disciplineScientifiqueConseilsScientifiques)){
disciplineScientifiqueConseilsScientifiques.forEach(e->disciplineScientifiqueConseilsScientifiqueDao.save(e));
}
}



}
