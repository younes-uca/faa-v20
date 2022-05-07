package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ChercheurEmail;
import com.ird.faa.bean.Chercheur;
import com.ird.faa.dao.ChercheurEmailDao;
import com.ird.faa.service.admin.facade.ChercheurEmailAdminService;
import com.ird.faa.service.admin.facade.ChercheurAdminService;

import com.ird.faa.ws.rest.provided.vo.ChercheurEmailVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ChercheurEmailAdminServiceImpl extends AbstractServiceImpl<ChercheurEmail> implements ChercheurEmailAdminService {

@Autowired
private ChercheurEmailDao chercheurEmailDao;

        @Autowired
        private ChercheurAdminService chercheurService ;


@Autowired
private EntityManager entityManager;


@Override
public List<ChercheurEmail> findAll(){
        return chercheurEmailDao.findAll();
}

        @Override
        public List<ChercheurEmail> findByChercheurNumeroMatricule(String numeroMatricule){
        return chercheurEmailDao.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        @Transactional
        public int deleteByChercheurNumeroMatricule(String numeroMatricule){
        return chercheurEmailDao.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        public List<ChercheurEmail> findByChercheurId(Long id){
        return chercheurEmailDao.findByChercheurId(id);
        }

        @Override
        @Transactional
        public int deleteByChercheurId(Long id){
        return chercheurEmailDao.deleteByChercheurId(id);
        }


@Override
public ChercheurEmail findById(Long id){
if(id==null) return null;
return chercheurEmailDao.getOne(id);
}

@Override
public ChercheurEmail findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(chercheurEmailDao.findById(id).isPresent())  {
chercheurEmailDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ChercheurEmail update(ChercheurEmail chercheurEmail){
ChercheurEmail foundedChercheurEmail = findById(chercheurEmail.getId());
if(foundedChercheurEmail==null) return null;
else{
return  chercheurEmailDao.save(chercheurEmail);
}
}
private void prepareSave(ChercheurEmail chercheurEmail){
if(chercheurEmail.getPrincipale() == null)
  chercheurEmail.setPrincipale(false);



}

@Override
public ChercheurEmail save (ChercheurEmail chercheurEmail){
prepareSave(chercheurEmail);



    findChercheur(chercheurEmail);

return chercheurEmailDao.save(chercheurEmail);


}

@Override
public List<ChercheurEmail> save(List<ChercheurEmail> chercheurEmails){
List<ChercheurEmail> list = new ArrayList<>();
for(ChercheurEmail chercheurEmail: chercheurEmails){
list.add(save(chercheurEmail));
}
return list;
}



@Override
@Transactional
public int delete(ChercheurEmail chercheurEmail){
    if(chercheurEmail.getId()==null) return -1;
    ChercheurEmail foundedChercheurEmail = findById(chercheurEmail.getId());
    if(foundedChercheurEmail==null) return -1;
chercheurEmailDao.delete(foundedChercheurEmail);
return 1;
}


public List<ChercheurEmail> findByCriteria(ChercheurEmailVo chercheurEmailVo){

String query = "SELECT o FROM ChercheurEmail o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",chercheurEmailVo.getId());
            query += SearchUtil.addConstraint( "o", "email","LIKE",chercheurEmailVo.getEmail());
            query += SearchUtil.addConstraint( "o", "principale","=",chercheurEmailVo.getPrincipale());
    if(chercheurEmailVo.getChercheurVo()!=null){
        query += SearchUtil.addConstraint( "o", "chercheur.id","=",chercheurEmailVo.getChercheurVo().getId());
            query += SearchUtil.addConstraint( "o", "chercheur.numeroMatricule","LIKE",chercheurEmailVo.getChercheurVo().getNumeroMatricule());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findChercheur(ChercheurEmail chercheurEmail){
        Chercheur loadedChercheur =chercheurService.findByIdOrNumeroMatricule(chercheurEmail.getChercheur());

    if(loadedChercheur==null ) {
        return;
    }
    chercheurEmail.setChercheur(loadedChercheur);
    }

@Override
@Transactional
public void delete(List<ChercheurEmail> chercheurEmails){
        if(ListUtil.isNotEmpty(chercheurEmails)){
        chercheurEmails.forEach(e->chercheurEmailDao.delete(e));
        }
}
@Override
public void update(List<ChercheurEmail> chercheurEmails){
if(ListUtil.isNotEmpty(chercheurEmails)){
chercheurEmails.forEach(e->chercheurEmailDao.save(e));
}
}



}
