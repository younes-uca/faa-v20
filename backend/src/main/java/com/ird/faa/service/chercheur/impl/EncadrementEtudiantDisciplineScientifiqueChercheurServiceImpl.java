package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EncadrementEtudiantDisciplineScientifique;
import com.ird.faa.bean.EncadrementEtudiant;
import com.ird.faa.bean.DisciplineScientifique;
import com.ird.faa.dao.EncadrementEtudiantDisciplineScientifiqueDao;
import com.ird.faa.service.chercheur.facade.EncadrementEtudiantDisciplineScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.EncadrementEtudiantChercheurService;
import com.ird.faa.service.chercheur.facade.DisciplineScientifiqueChercheurService;

import com.ird.faa.ws.rest.provided.vo.EncadrementEtudiantDisciplineScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EncadrementEtudiantDisciplineScientifiqueChercheurServiceImpl extends AbstractServiceImpl<EncadrementEtudiantDisciplineScientifique> implements EncadrementEtudiantDisciplineScientifiqueChercheurService {

@Autowired
private EncadrementEtudiantDisciplineScientifiqueDao encadrementEtudiantDisciplineScientifiqueDao;

        @Autowired
        private EncadrementEtudiantChercheurService encadrementEtudiantService ;
        @Autowired
        private DisciplineScientifiqueChercheurService disciplineScientifiqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<EncadrementEtudiantDisciplineScientifique> findAll(){
        return encadrementEtudiantDisciplineScientifiqueDao.findAll();
}
        @Override
        public List<EncadrementEtudiantDisciplineScientifique> findByEncadrementEtudiantId(Long id){
        return encadrementEtudiantDisciplineScientifiqueDao.findByEncadrementEtudiantId(id);
        }

        @Override
        @Transactional
        public int deleteByEncadrementEtudiantId(Long id){
        return encadrementEtudiantDisciplineScientifiqueDao.deleteByEncadrementEtudiantId(id);
        }


        @Override
        public List<EncadrementEtudiantDisciplineScientifique> findByDisciplineScientifiqueCode(String code){
        return encadrementEtudiantDisciplineScientifiqueDao.findByDisciplineScientifiqueCode(code);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueCode(String code){
        return encadrementEtudiantDisciplineScientifiqueDao.deleteByDisciplineScientifiqueCode(code);
        }

        @Override
        public List<EncadrementEtudiantDisciplineScientifique> findByDisciplineScientifiqueId(Long id){
        return encadrementEtudiantDisciplineScientifiqueDao.findByDisciplineScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueId(Long id){
        return encadrementEtudiantDisciplineScientifiqueDao.deleteByDisciplineScientifiqueId(id);
        }


@Override
public EncadrementEtudiantDisciplineScientifique findById(Long id){
if(id==null) return null;
return encadrementEtudiantDisciplineScientifiqueDao.getOne(id);
}

@Override
public EncadrementEtudiantDisciplineScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(encadrementEtudiantDisciplineScientifiqueDao.findById(id).isPresent())  {
encadrementEtudiantDisciplineScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EncadrementEtudiantDisciplineScientifique update(EncadrementEtudiantDisciplineScientifique encadrementEtudiantDisciplineScientifique){
EncadrementEtudiantDisciplineScientifique foundedEncadrementEtudiantDisciplineScientifique = findById(encadrementEtudiantDisciplineScientifique.getId());
if(foundedEncadrementEtudiantDisciplineScientifique==null) return null;
else{
return  encadrementEtudiantDisciplineScientifiqueDao.save(encadrementEtudiantDisciplineScientifique);
}
}

@Override
public EncadrementEtudiantDisciplineScientifique save (EncadrementEtudiantDisciplineScientifique encadrementEtudiantDisciplineScientifique){



    findEncadrementEtudiant(encadrementEtudiantDisciplineScientifique);
    findDisciplineScientifique(encadrementEtudiantDisciplineScientifique);

return encadrementEtudiantDisciplineScientifiqueDao.save(encadrementEtudiantDisciplineScientifique);


}

@Override
public List<EncadrementEtudiantDisciplineScientifique> save(List<EncadrementEtudiantDisciplineScientifique> encadrementEtudiantDisciplineScientifiques){
List<EncadrementEtudiantDisciplineScientifique> list = new ArrayList<>();
for(EncadrementEtudiantDisciplineScientifique encadrementEtudiantDisciplineScientifique: encadrementEtudiantDisciplineScientifiques){
list.add(save(encadrementEtudiantDisciplineScientifique));
}
return list;
}



@Override
@Transactional
public int delete(EncadrementEtudiantDisciplineScientifique encadrementEtudiantDisciplineScientifique){
    if(encadrementEtudiantDisciplineScientifique.getId()==null) return -1;
    EncadrementEtudiantDisciplineScientifique foundedEncadrementEtudiantDisciplineScientifique = findById(encadrementEtudiantDisciplineScientifique.getId());
    if(foundedEncadrementEtudiantDisciplineScientifique==null) return -1;
encadrementEtudiantDisciplineScientifiqueDao.delete(foundedEncadrementEtudiantDisciplineScientifique);
return 1;
}


public List<EncadrementEtudiantDisciplineScientifique> findByCriteria(EncadrementEtudiantDisciplineScientifiqueVo encadrementEtudiantDisciplineScientifiqueVo){

String query = "SELECT o FROM EncadrementEtudiantDisciplineScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",encadrementEtudiantDisciplineScientifiqueVo.getId());
    if(encadrementEtudiantDisciplineScientifiqueVo.getEncadrementEtudiantVo()!=null){
        query += SearchUtil.addConstraint( "o", "encadrementEtudiant.id","=",encadrementEtudiantDisciplineScientifiqueVo.getEncadrementEtudiantVo().getId());
    }

    if(encadrementEtudiantDisciplineScientifiqueVo.getDisciplineScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "disciplineScientifique.id","=",encadrementEtudiantDisciplineScientifiqueVo.getDisciplineScientifiqueVo().getId());
            query += SearchUtil.addConstraint( "o", "disciplineScientifique.code","LIKE",encadrementEtudiantDisciplineScientifiqueVo.getDisciplineScientifiqueVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findEncadrementEtudiant(EncadrementEtudiantDisciplineScientifique encadrementEtudiantDisciplineScientifique){
        EncadrementEtudiant loadedEncadrementEtudiant = null;
        if(encadrementEtudiantDisciplineScientifique.getEncadrementEtudiant() != null && encadrementEtudiantDisciplineScientifique.getEncadrementEtudiant().getId() !=null)
        loadedEncadrementEtudiant =encadrementEtudiantService.findById(encadrementEtudiantDisciplineScientifique.getEncadrementEtudiant().getId());

    if(loadedEncadrementEtudiant==null ) {
        return;
    }
    encadrementEtudiantDisciplineScientifique.setEncadrementEtudiant(loadedEncadrementEtudiant);
    }
    private void findDisciplineScientifique(EncadrementEtudiantDisciplineScientifique encadrementEtudiantDisciplineScientifique){
        DisciplineScientifique loadedDisciplineScientifique =disciplineScientifiqueService.findByIdOrCode(encadrementEtudiantDisciplineScientifique.getDisciplineScientifique());

    if(loadedDisciplineScientifique==null ) {
        return;
    }
    encadrementEtudiantDisciplineScientifique.setDisciplineScientifique(loadedDisciplineScientifique);
    }

@Override
@Transactional
public void delete(List<EncadrementEtudiantDisciplineScientifique> encadrementEtudiantDisciplineScientifiques){
        if(ListUtil.isNotEmpty(encadrementEtudiantDisciplineScientifiques)){
        encadrementEtudiantDisciplineScientifiques.forEach(e->encadrementEtudiantDisciplineScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<EncadrementEtudiantDisciplineScientifique> encadrementEtudiantDisciplineScientifiques){
if(ListUtil.isNotEmpty(encadrementEtudiantDisciplineScientifiques)){
encadrementEtudiantDisciplineScientifiques.forEach(e->encadrementEtudiantDisciplineScientifiqueDao.save(e));
}
}



}
