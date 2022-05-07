package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.DisciplineScientifiqueEvenementColloqueScientifique;
import com.ird.faa.bean.EvenementColloqueScienntifique;
import com.ird.faa.bean.DisciplineScientifique;
import com.ird.faa.dao.DisciplineScientifiqueEvenementColloqueScientifiqueDao;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueEvenementColloqueScientifiqueAdminService;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueAdminService;
import com.ird.faa.service.admin.facade.EvenementColloqueScienntifiqueAdminService;

import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueEvenementColloqueScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class DisciplineScientifiqueEvenementColloqueScientifiqueAdminServiceImpl extends AbstractServiceImpl<DisciplineScientifiqueEvenementColloqueScientifique> implements DisciplineScientifiqueEvenementColloqueScientifiqueAdminService {

@Autowired
private DisciplineScientifiqueEvenementColloqueScientifiqueDao disciplineScientifiqueEvenementColloqueScientifiqueDao;

        @Autowired
        private DisciplineScientifiqueAdminService disciplineScientifiqueService ;
        @Autowired
        private EvenementColloqueScienntifiqueAdminService evenementColloqueScienntifiqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<DisciplineScientifiqueEvenementColloqueScientifique> findAll(){
        return disciplineScientifiqueEvenementColloqueScientifiqueDao.findAll();
}
        @Override
        public List<DisciplineScientifiqueEvenementColloqueScientifique> findByEvenementColloqueScienntifiqueId(Long id){
        return disciplineScientifiqueEvenementColloqueScientifiqueDao.findByEvenementColloqueScienntifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByEvenementColloqueScienntifiqueId(Long id){
        return disciplineScientifiqueEvenementColloqueScientifiqueDao.deleteByEvenementColloqueScienntifiqueId(id);
        }


        @Override
        public List<DisciplineScientifiqueEvenementColloqueScientifique> findByDisciplineScientifiqueCode(String code){
        return disciplineScientifiqueEvenementColloqueScientifiqueDao.findByDisciplineScientifiqueCode(code);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueCode(String code){
        return disciplineScientifiqueEvenementColloqueScientifiqueDao.deleteByDisciplineScientifiqueCode(code);
        }

        @Override
        public List<DisciplineScientifiqueEvenementColloqueScientifique> findByDisciplineScientifiqueId(Long id){
        return disciplineScientifiqueEvenementColloqueScientifiqueDao.findByDisciplineScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueId(Long id){
        return disciplineScientifiqueEvenementColloqueScientifiqueDao.deleteByDisciplineScientifiqueId(id);
        }


@Override
public DisciplineScientifiqueEvenementColloqueScientifique findById(Long id){
if(id==null) return null;
return disciplineScientifiqueEvenementColloqueScientifiqueDao.getOne(id);
}

@Override
public DisciplineScientifiqueEvenementColloqueScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(disciplineScientifiqueEvenementColloqueScientifiqueDao.findById(id).isPresent())  {
disciplineScientifiqueEvenementColloqueScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public DisciplineScientifiqueEvenementColloqueScientifique update(DisciplineScientifiqueEvenementColloqueScientifique disciplineScientifiqueEvenementColloqueScientifique){
DisciplineScientifiqueEvenementColloqueScientifique foundedDisciplineScientifiqueEvenementColloqueScientifique = findById(disciplineScientifiqueEvenementColloqueScientifique.getId());
if(foundedDisciplineScientifiqueEvenementColloqueScientifique==null) return null;
else{
return  disciplineScientifiqueEvenementColloqueScientifiqueDao.save(disciplineScientifiqueEvenementColloqueScientifique);
}
}

@Override
public DisciplineScientifiqueEvenementColloqueScientifique save (DisciplineScientifiqueEvenementColloqueScientifique disciplineScientifiqueEvenementColloqueScientifique){



    findEvenementColloqueScienntifique(disciplineScientifiqueEvenementColloqueScientifique);
    findDisciplineScientifique(disciplineScientifiqueEvenementColloqueScientifique);

return disciplineScientifiqueEvenementColloqueScientifiqueDao.save(disciplineScientifiqueEvenementColloqueScientifique);


}

@Override
public List<DisciplineScientifiqueEvenementColloqueScientifique> save(List<DisciplineScientifiqueEvenementColloqueScientifique> disciplineScientifiqueEvenementColloqueScientifiques){
List<DisciplineScientifiqueEvenementColloqueScientifique> list = new ArrayList<>();
for(DisciplineScientifiqueEvenementColloqueScientifique disciplineScientifiqueEvenementColloqueScientifique: disciplineScientifiqueEvenementColloqueScientifiques){
list.add(save(disciplineScientifiqueEvenementColloqueScientifique));
}
return list;
}



@Override
@Transactional
public int delete(DisciplineScientifiqueEvenementColloqueScientifique disciplineScientifiqueEvenementColloqueScientifique){
    if(disciplineScientifiqueEvenementColloqueScientifique.getId()==null) return -1;
    DisciplineScientifiqueEvenementColloqueScientifique foundedDisciplineScientifiqueEvenementColloqueScientifique = findById(disciplineScientifiqueEvenementColloqueScientifique.getId());
    if(foundedDisciplineScientifiqueEvenementColloqueScientifique==null) return -1;
disciplineScientifiqueEvenementColloqueScientifiqueDao.delete(foundedDisciplineScientifiqueEvenementColloqueScientifique);
return 1;
}


public List<DisciplineScientifiqueEvenementColloqueScientifique> findByCriteria(DisciplineScientifiqueEvenementColloqueScientifiqueVo disciplineScientifiqueEvenementColloqueScientifiqueVo){

String query = "SELECT o FROM DisciplineScientifiqueEvenementColloqueScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",disciplineScientifiqueEvenementColloqueScientifiqueVo.getId());
    if(disciplineScientifiqueEvenementColloqueScientifiqueVo.getEvenementColloqueScienntifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "evenementColloqueScienntifique.id","=",disciplineScientifiqueEvenementColloqueScientifiqueVo.getEvenementColloqueScienntifiqueVo().getId());
    }

    if(disciplineScientifiqueEvenementColloqueScientifiqueVo.getDisciplineScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "disciplineScientifique.id","=",disciplineScientifiqueEvenementColloqueScientifiqueVo.getDisciplineScientifiqueVo().getId());
            query += SearchUtil.addConstraint( "o", "disciplineScientifique.code","LIKE",disciplineScientifiqueEvenementColloqueScientifiqueVo.getDisciplineScientifiqueVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findEvenementColloqueScienntifique(DisciplineScientifiqueEvenementColloqueScientifique disciplineScientifiqueEvenementColloqueScientifique){
        EvenementColloqueScienntifique loadedEvenementColloqueScienntifique = null;
        if(disciplineScientifiqueEvenementColloqueScientifique.getEvenementColloqueScienntifique() != null && disciplineScientifiqueEvenementColloqueScientifique.getEvenementColloqueScienntifique().getId() !=null)
        loadedEvenementColloqueScienntifique =evenementColloqueScienntifiqueService.findById(disciplineScientifiqueEvenementColloqueScientifique.getEvenementColloqueScienntifique().getId());

    if(loadedEvenementColloqueScienntifique==null ) {
        return;
    }
    disciplineScientifiqueEvenementColloqueScientifique.setEvenementColloqueScienntifique(loadedEvenementColloqueScienntifique);
    }
    private void findDisciplineScientifique(DisciplineScientifiqueEvenementColloqueScientifique disciplineScientifiqueEvenementColloqueScientifique){
        DisciplineScientifique loadedDisciplineScientifique =disciplineScientifiqueService.findByIdOrCode(disciplineScientifiqueEvenementColloqueScientifique.getDisciplineScientifique());

    if(loadedDisciplineScientifique==null ) {
        return;
    }
    disciplineScientifiqueEvenementColloqueScientifique.setDisciplineScientifique(loadedDisciplineScientifique);
    }

@Override
@Transactional
public void delete(List<DisciplineScientifiqueEvenementColloqueScientifique> disciplineScientifiqueEvenementColloqueScientifiques){
        if(ListUtil.isNotEmpty(disciplineScientifiqueEvenementColloqueScientifiques)){
        disciplineScientifiqueEvenementColloqueScientifiques.forEach(e->disciplineScientifiqueEvenementColloqueScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<DisciplineScientifiqueEvenementColloqueScientifique> disciplineScientifiqueEvenementColloqueScientifiques){
if(ListUtil.isNotEmpty(disciplineScientifiqueEvenementColloqueScientifiques)){
disciplineScientifiqueEvenementColloqueScientifiques.forEach(e->disciplineScientifiqueEvenementColloqueScientifiqueDao.save(e));
}
}



}
