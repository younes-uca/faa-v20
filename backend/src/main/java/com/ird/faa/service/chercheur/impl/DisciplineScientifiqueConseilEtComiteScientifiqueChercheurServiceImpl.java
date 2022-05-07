package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.DisciplineScientifiqueConseilEtComiteScientifique;
import com.ird.faa.bean.DisciplineScientifique;
import com.ird.faa.bean.ConseilEtComiteScientifique;
import com.ird.faa.dao.DisciplineScientifiqueConseilEtComiteScientifiqueDao;
import com.ird.faa.service.chercheur.facade.DisciplineScientifiqueConseilEtComiteScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.ConseilEtComiteScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.DisciplineScientifiqueChercheurService;

import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueConseilEtComiteScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class DisciplineScientifiqueConseilEtComiteScientifiqueChercheurServiceImpl extends AbstractServiceImpl<DisciplineScientifiqueConseilEtComiteScientifique> implements DisciplineScientifiqueConseilEtComiteScientifiqueChercheurService {

@Autowired
private DisciplineScientifiqueConseilEtComiteScientifiqueDao disciplineScientifiqueConseilEtComiteScientifiqueDao;

        @Autowired
        private ConseilEtComiteScientifiqueChercheurService conseilEtComiteScientifiqueService ;
        @Autowired
        private DisciplineScientifiqueChercheurService disciplineScientifiqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<DisciplineScientifiqueConseilEtComiteScientifique> findAll(){
        return disciplineScientifiqueConseilEtComiteScientifiqueDao.findAll();
}

        @Override
        public List<DisciplineScientifiqueConseilEtComiteScientifique> findByDisciplineScientifiqueCode(String code){
        return disciplineScientifiqueConseilEtComiteScientifiqueDao.findByDisciplineScientifiqueCode(code);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueCode(String code){
        return disciplineScientifiqueConseilEtComiteScientifiqueDao.deleteByDisciplineScientifiqueCode(code);
        }

        @Override
        public List<DisciplineScientifiqueConseilEtComiteScientifique> findByDisciplineScientifiqueId(Long id){
        return disciplineScientifiqueConseilEtComiteScientifiqueDao.findByDisciplineScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueId(Long id){
        return disciplineScientifiqueConseilEtComiteScientifiqueDao.deleteByDisciplineScientifiqueId(id);
        }

        @Override
        public List<DisciplineScientifiqueConseilEtComiteScientifique> findByConseilEtComiteScientifiqueId(Long id){
        return disciplineScientifiqueConseilEtComiteScientifiqueDao.findByConseilEtComiteScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByConseilEtComiteScientifiqueId(Long id){
        return disciplineScientifiqueConseilEtComiteScientifiqueDao.deleteByConseilEtComiteScientifiqueId(id);
        }


@Override
public DisciplineScientifiqueConseilEtComiteScientifique findById(Long id){
if(id==null) return null;
return disciplineScientifiqueConseilEtComiteScientifiqueDao.getOne(id);
}

@Override
public DisciplineScientifiqueConseilEtComiteScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(disciplineScientifiqueConseilEtComiteScientifiqueDao.findById(id).isPresent())  {
disciplineScientifiqueConseilEtComiteScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public DisciplineScientifiqueConseilEtComiteScientifique update(DisciplineScientifiqueConseilEtComiteScientifique disciplineScientifiqueConseilEtComiteScientifique){
DisciplineScientifiqueConseilEtComiteScientifique foundedDisciplineScientifiqueConseilEtComiteScientifique = findById(disciplineScientifiqueConseilEtComiteScientifique.getId());
if(foundedDisciplineScientifiqueConseilEtComiteScientifique==null) return null;
else{
return  disciplineScientifiqueConseilEtComiteScientifiqueDao.save(disciplineScientifiqueConseilEtComiteScientifique);
}
}

@Override
public DisciplineScientifiqueConseilEtComiteScientifique save (DisciplineScientifiqueConseilEtComiteScientifique disciplineScientifiqueConseilEtComiteScientifique){



    findDisciplineScientifique(disciplineScientifiqueConseilEtComiteScientifique);
    findConseilEtComiteScientifique(disciplineScientifiqueConseilEtComiteScientifique);

return disciplineScientifiqueConseilEtComiteScientifiqueDao.save(disciplineScientifiqueConseilEtComiteScientifique);


}

@Override
public List<DisciplineScientifiqueConseilEtComiteScientifique> save(List<DisciplineScientifiqueConseilEtComiteScientifique> disciplineScientifiqueConseilEtComiteScientifiques){
List<DisciplineScientifiqueConseilEtComiteScientifique> list = new ArrayList<>();
for(DisciplineScientifiqueConseilEtComiteScientifique disciplineScientifiqueConseilEtComiteScientifique: disciplineScientifiqueConseilEtComiteScientifiques){
list.add(save(disciplineScientifiqueConseilEtComiteScientifique));
}
return list;
}



@Override
@Transactional
public int delete(DisciplineScientifiqueConseilEtComiteScientifique disciplineScientifiqueConseilEtComiteScientifique){
    if(disciplineScientifiqueConseilEtComiteScientifique.getId()==null) return -1;
    DisciplineScientifiqueConseilEtComiteScientifique foundedDisciplineScientifiqueConseilEtComiteScientifique = findById(disciplineScientifiqueConseilEtComiteScientifique.getId());
    if(foundedDisciplineScientifiqueConseilEtComiteScientifique==null) return -1;
disciplineScientifiqueConseilEtComiteScientifiqueDao.delete(foundedDisciplineScientifiqueConseilEtComiteScientifique);
return 1;
}


public List<DisciplineScientifiqueConseilEtComiteScientifique> findByCriteria(DisciplineScientifiqueConseilEtComiteScientifiqueVo disciplineScientifiqueConseilEtComiteScientifiqueVo){

String query = "SELECT o FROM DisciplineScientifiqueConseilEtComiteScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",disciplineScientifiqueConseilEtComiteScientifiqueVo.getId());
    if(disciplineScientifiqueConseilEtComiteScientifiqueVo.getDisciplineScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "disciplineScientifique.id","=",disciplineScientifiqueConseilEtComiteScientifiqueVo.getDisciplineScientifiqueVo().getId());
            query += SearchUtil.addConstraint( "o", "disciplineScientifique.code","LIKE",disciplineScientifiqueConseilEtComiteScientifiqueVo.getDisciplineScientifiqueVo().getCode());
    }

    if(disciplineScientifiqueConseilEtComiteScientifiqueVo.getConseilEtComiteScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "conseilEtComiteScientifique.id","=",disciplineScientifiqueConseilEtComiteScientifiqueVo.getConseilEtComiteScientifiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findDisciplineScientifique(DisciplineScientifiqueConseilEtComiteScientifique disciplineScientifiqueConseilEtComiteScientifique){
        DisciplineScientifique loadedDisciplineScientifique =disciplineScientifiqueService.findByIdOrCode(disciplineScientifiqueConseilEtComiteScientifique.getDisciplineScientifique());

    if(loadedDisciplineScientifique==null ) {
        return;
    }
    disciplineScientifiqueConseilEtComiteScientifique.setDisciplineScientifique(loadedDisciplineScientifique);
    }
    private void findConseilEtComiteScientifique(DisciplineScientifiqueConseilEtComiteScientifique disciplineScientifiqueConseilEtComiteScientifique){
        ConseilEtComiteScientifique loadedConseilEtComiteScientifique = null;
        if(disciplineScientifiqueConseilEtComiteScientifique.getConseilEtComiteScientifique() != null && disciplineScientifiqueConseilEtComiteScientifique.getConseilEtComiteScientifique().getId() !=null)
        loadedConseilEtComiteScientifique =conseilEtComiteScientifiqueService.findById(disciplineScientifiqueConseilEtComiteScientifique.getConseilEtComiteScientifique().getId());

    if(loadedConseilEtComiteScientifique==null ) {
        return;
    }
    disciplineScientifiqueConseilEtComiteScientifique.setConseilEtComiteScientifique(loadedConseilEtComiteScientifique);
    }

@Override
@Transactional
public void delete(List<DisciplineScientifiqueConseilEtComiteScientifique> disciplineScientifiqueConseilEtComiteScientifiques){
        if(ListUtil.isNotEmpty(disciplineScientifiqueConseilEtComiteScientifiques)){
        disciplineScientifiqueConseilEtComiteScientifiques.forEach(e->disciplineScientifiqueConseilEtComiteScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<DisciplineScientifiqueConseilEtComiteScientifique> disciplineScientifiqueConseilEtComiteScientifiques){
if(ListUtil.isNotEmpty(disciplineScientifiqueConseilEtComiteScientifiques)){
disciplineScientifiqueConseilEtComiteScientifiques.forEach(e->disciplineScientifiqueConseilEtComiteScientifiqueDao.save(e));
}
}



}
