package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EncadrementEtudiantEnjeuxIrd;
import com.ird.faa.bean.EncadrementEtudiant;
import com.ird.faa.bean.EnjeuxIrd;
import com.ird.faa.dao.EncadrementEtudiantEnjeuxIrdDao;
import com.ird.faa.service.chercheur.facade.EncadrementEtudiantEnjeuxIrdChercheurService;
import com.ird.faa.service.chercheur.facade.EncadrementEtudiantChercheurService;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdChercheurService;

import com.ird.faa.ws.rest.provided.vo.EncadrementEtudiantEnjeuxIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EncadrementEtudiantEnjeuxIrdChercheurServiceImpl extends AbstractServiceImpl<EncadrementEtudiantEnjeuxIrd> implements EncadrementEtudiantEnjeuxIrdChercheurService {

@Autowired
private EncadrementEtudiantEnjeuxIrdDao encadrementEtudiantEnjeuxIrdDao;

        @Autowired
        private EncadrementEtudiantChercheurService encadrementEtudiantService ;
        @Autowired
        private EnjeuxIrdChercheurService enjeuxIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<EncadrementEtudiantEnjeuxIrd> findAll(){
        return encadrementEtudiantEnjeuxIrdDao.findAll();
}
        @Override
        public List<EncadrementEtudiantEnjeuxIrd> findByEncadrementEtudiantId(Long id){
        return encadrementEtudiantEnjeuxIrdDao.findByEncadrementEtudiantId(id);
        }

        @Override
        @Transactional
        public int deleteByEncadrementEtudiantId(Long id){
        return encadrementEtudiantEnjeuxIrdDao.deleteByEncadrementEtudiantId(id);
        }


        @Override
        public List<EncadrementEtudiantEnjeuxIrd> findByEnjeuxIrdCode(String code){
        return encadrementEtudiantEnjeuxIrdDao.findByEnjeuxIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdCode(String code){
        return encadrementEtudiantEnjeuxIrdDao.deleteByEnjeuxIrdCode(code);
        }

        @Override
        public List<EncadrementEtudiantEnjeuxIrd> findByEnjeuxIrdId(Long id){
        return encadrementEtudiantEnjeuxIrdDao.findByEnjeuxIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdId(Long id){
        return encadrementEtudiantEnjeuxIrdDao.deleteByEnjeuxIrdId(id);
        }


@Override
public EncadrementEtudiantEnjeuxIrd findById(Long id){
if(id==null) return null;
return encadrementEtudiantEnjeuxIrdDao.getOne(id);
}

@Override
public EncadrementEtudiantEnjeuxIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(encadrementEtudiantEnjeuxIrdDao.findById(id).isPresent())  {
encadrementEtudiantEnjeuxIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EncadrementEtudiantEnjeuxIrd update(EncadrementEtudiantEnjeuxIrd encadrementEtudiantEnjeuxIrd){
EncadrementEtudiantEnjeuxIrd foundedEncadrementEtudiantEnjeuxIrd = findById(encadrementEtudiantEnjeuxIrd.getId());
if(foundedEncadrementEtudiantEnjeuxIrd==null) return null;
else{
return  encadrementEtudiantEnjeuxIrdDao.save(encadrementEtudiantEnjeuxIrd);
}
}

@Override
public EncadrementEtudiantEnjeuxIrd save (EncadrementEtudiantEnjeuxIrd encadrementEtudiantEnjeuxIrd){



    findEncadrementEtudiant(encadrementEtudiantEnjeuxIrd);
    findEnjeuxIrd(encadrementEtudiantEnjeuxIrd);

return encadrementEtudiantEnjeuxIrdDao.save(encadrementEtudiantEnjeuxIrd);


}

@Override
public List<EncadrementEtudiantEnjeuxIrd> save(List<EncadrementEtudiantEnjeuxIrd> encadrementEtudiantEnjeuxIrds){
List<EncadrementEtudiantEnjeuxIrd> list = new ArrayList<>();
for(EncadrementEtudiantEnjeuxIrd encadrementEtudiantEnjeuxIrd: encadrementEtudiantEnjeuxIrds){
list.add(save(encadrementEtudiantEnjeuxIrd));
}
return list;
}



@Override
@Transactional
public int delete(EncadrementEtudiantEnjeuxIrd encadrementEtudiantEnjeuxIrd){
    if(encadrementEtudiantEnjeuxIrd.getId()==null) return -1;
    EncadrementEtudiantEnjeuxIrd foundedEncadrementEtudiantEnjeuxIrd = findById(encadrementEtudiantEnjeuxIrd.getId());
    if(foundedEncadrementEtudiantEnjeuxIrd==null) return -1;
encadrementEtudiantEnjeuxIrdDao.delete(foundedEncadrementEtudiantEnjeuxIrd);
return 1;
}


public List<EncadrementEtudiantEnjeuxIrd> findByCriteria(EncadrementEtudiantEnjeuxIrdVo encadrementEtudiantEnjeuxIrdVo){

String query = "SELECT o FROM EncadrementEtudiantEnjeuxIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",encadrementEtudiantEnjeuxIrdVo.getId());
    if(encadrementEtudiantEnjeuxIrdVo.getEncadrementEtudiantVo()!=null){
        query += SearchUtil.addConstraint( "o", "encadrementEtudiant.id","=",encadrementEtudiantEnjeuxIrdVo.getEncadrementEtudiantVo().getId());
    }

    if(encadrementEtudiantEnjeuxIrdVo.getEnjeuxIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "enjeuxIrd.id","=",encadrementEtudiantEnjeuxIrdVo.getEnjeuxIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "enjeuxIrd.code","LIKE",encadrementEtudiantEnjeuxIrdVo.getEnjeuxIrdVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findEncadrementEtudiant(EncadrementEtudiantEnjeuxIrd encadrementEtudiantEnjeuxIrd){
        EncadrementEtudiant loadedEncadrementEtudiant = null;
        if(encadrementEtudiantEnjeuxIrd.getEncadrementEtudiant() != null && encadrementEtudiantEnjeuxIrd.getEncadrementEtudiant().getId() !=null)
        loadedEncadrementEtudiant =encadrementEtudiantService.findById(encadrementEtudiantEnjeuxIrd.getEncadrementEtudiant().getId());

    if(loadedEncadrementEtudiant==null ) {
        return;
    }
    encadrementEtudiantEnjeuxIrd.setEncadrementEtudiant(loadedEncadrementEtudiant);
    }
    private void findEnjeuxIrd(EncadrementEtudiantEnjeuxIrd encadrementEtudiantEnjeuxIrd){
        EnjeuxIrd loadedEnjeuxIrd =enjeuxIrdService.findByIdOrCode(encadrementEtudiantEnjeuxIrd.getEnjeuxIrd());

    if(loadedEnjeuxIrd==null ) {
        return;
    }
    encadrementEtudiantEnjeuxIrd.setEnjeuxIrd(loadedEnjeuxIrd);
    }

@Override
@Transactional
public void delete(List<EncadrementEtudiantEnjeuxIrd> encadrementEtudiantEnjeuxIrds){
        if(ListUtil.isNotEmpty(encadrementEtudiantEnjeuxIrds)){
        encadrementEtudiantEnjeuxIrds.forEach(e->encadrementEtudiantEnjeuxIrdDao.delete(e));
        }
}
@Override
public void update(List<EncadrementEtudiantEnjeuxIrd> encadrementEtudiantEnjeuxIrds){
if(ListUtil.isNotEmpty(encadrementEtudiantEnjeuxIrds)){
encadrementEtudiantEnjeuxIrds.forEach(e->encadrementEtudiantEnjeuxIrdDao.save(e));
}
}



}
