package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.PaysRencontreGrandPubliqueJeunePublique;
import com.ird.faa.bean.Pays;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePublique;
import com.ird.faa.dao.PaysRencontreGrandPubliqueJeunePubliqueDao;
import com.ird.faa.service.admin.facade.PaysRencontreGrandPubliqueJeunePubliqueAdminService;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueAdminService;
import com.ird.faa.service.admin.facade.PaysAdminService;

import com.ird.faa.ws.rest.provided.vo.PaysRencontreGrandPubliqueJeunePubliqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class PaysRencontreGrandPubliqueJeunePubliqueAdminServiceImpl extends AbstractServiceImpl<PaysRencontreGrandPubliqueJeunePublique> implements PaysRencontreGrandPubliqueJeunePubliqueAdminService {

@Autowired
private PaysRencontreGrandPubliqueJeunePubliqueDao paysRencontreGrandPubliqueJeunePubliqueDao;

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueAdminService rencontreGrandPubliqueJeunePubliqueService ;
        @Autowired
        private PaysAdminService paysService ;


@Autowired
private EntityManager entityManager;


@Override
public List<PaysRencontreGrandPubliqueJeunePublique> findAll(){
        return paysRencontreGrandPubliqueJeunePubliqueDao.findAll();
}

        @Override
        public List<PaysRencontreGrandPubliqueJeunePublique> findByPaysCode(String code){
        return paysRencontreGrandPubliqueJeunePubliqueDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return paysRencontreGrandPubliqueJeunePubliqueDao.deleteByPaysCode(code);
        }

        @Override
        public List<PaysRencontreGrandPubliqueJeunePublique> findByPaysId(Long id){
        return paysRencontreGrandPubliqueJeunePubliqueDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return paysRencontreGrandPubliqueJeunePubliqueDao.deleteByPaysId(id);
        }

        @Override
        public List<PaysRencontreGrandPubliqueJeunePublique> findByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return paysRencontreGrandPubliqueJeunePubliqueDao.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @Override
        @Transactional
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return paysRencontreGrandPubliqueJeunePubliqueDao.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }


@Override
public PaysRencontreGrandPubliqueJeunePublique findById(Long id){
if(id==null) return null;
return paysRencontreGrandPubliqueJeunePubliqueDao.getOne(id);
}

@Override
public PaysRencontreGrandPubliqueJeunePublique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(paysRencontreGrandPubliqueJeunePubliqueDao.findById(id).isPresent())  {
paysRencontreGrandPubliqueJeunePubliqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public PaysRencontreGrandPubliqueJeunePublique update(PaysRencontreGrandPubliqueJeunePublique paysRencontreGrandPubliqueJeunePublique){
PaysRencontreGrandPubliqueJeunePublique foundedPaysRencontreGrandPubliqueJeunePublique = findById(paysRencontreGrandPubliqueJeunePublique.getId());
if(foundedPaysRencontreGrandPubliqueJeunePublique==null) return null;
else{
return  paysRencontreGrandPubliqueJeunePubliqueDao.save(paysRencontreGrandPubliqueJeunePublique);
}
}

@Override
public PaysRencontreGrandPubliqueJeunePublique save (PaysRencontreGrandPubliqueJeunePublique paysRencontreGrandPubliqueJeunePublique){



    findPays(paysRencontreGrandPubliqueJeunePublique);
    findRencontreGrandPubliqueJeunePublique(paysRencontreGrandPubliqueJeunePublique);

return paysRencontreGrandPubliqueJeunePubliqueDao.save(paysRencontreGrandPubliqueJeunePublique);


}

@Override
public List<PaysRencontreGrandPubliqueJeunePublique> save(List<PaysRencontreGrandPubliqueJeunePublique> paysRencontreGrandPubliqueJeunePubliques){
List<PaysRencontreGrandPubliqueJeunePublique> list = new ArrayList<>();
for(PaysRencontreGrandPubliqueJeunePublique paysRencontreGrandPubliqueJeunePublique: paysRencontreGrandPubliqueJeunePubliques){
list.add(save(paysRencontreGrandPubliqueJeunePublique));
}
return list;
}



@Override
@Transactional
public int delete(PaysRencontreGrandPubliqueJeunePublique paysRencontreGrandPubliqueJeunePublique){
    if(paysRencontreGrandPubliqueJeunePublique.getId()==null) return -1;
    PaysRencontreGrandPubliqueJeunePublique foundedPaysRencontreGrandPubliqueJeunePublique = findById(paysRencontreGrandPubliqueJeunePublique.getId());
    if(foundedPaysRencontreGrandPubliqueJeunePublique==null) return -1;
paysRencontreGrandPubliqueJeunePubliqueDao.delete(foundedPaysRencontreGrandPubliqueJeunePublique);
return 1;
}


public List<PaysRencontreGrandPubliqueJeunePublique> findByCriteria(PaysRencontreGrandPubliqueJeunePubliqueVo paysRencontreGrandPubliqueJeunePubliqueVo){

String query = "SELECT o FROM PaysRencontreGrandPubliqueJeunePublique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",paysRencontreGrandPubliqueJeunePubliqueVo.getId());
    if(paysRencontreGrandPubliqueJeunePubliqueVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",paysRencontreGrandPubliqueJeunePubliqueVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",paysRencontreGrandPubliqueJeunePubliqueVo.getPaysVo().getCode());
    }

    if(paysRencontreGrandPubliqueJeunePubliqueVo.getRencontreGrandPubliqueJeunePubliqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "rencontreGrandPubliqueJeunePublique.id","=",paysRencontreGrandPubliqueJeunePubliqueVo.getRencontreGrandPubliqueJeunePubliqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findPays(PaysRencontreGrandPubliqueJeunePublique paysRencontreGrandPubliqueJeunePublique){
        Pays loadedPays =paysService.findByIdOrCode(paysRencontreGrandPubliqueJeunePublique.getPays());

    if(loadedPays==null ) {
        return;
    }
    paysRencontreGrandPubliqueJeunePublique.setPays(loadedPays);
    }
    private void findRencontreGrandPubliqueJeunePublique(PaysRencontreGrandPubliqueJeunePublique paysRencontreGrandPubliqueJeunePublique){
        RencontreGrandPubliqueJeunePublique loadedRencontreGrandPubliqueJeunePublique = null;
        if(paysRencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePublique() != null && paysRencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePublique().getId() !=null)
        loadedRencontreGrandPubliqueJeunePublique =rencontreGrandPubliqueJeunePubliqueService.findById(paysRencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePublique().getId());

    if(loadedRencontreGrandPubliqueJeunePublique==null ) {
        return;
    }
    paysRencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePublique(loadedRencontreGrandPubliqueJeunePublique);
    }

@Override
@Transactional
public void delete(List<PaysRencontreGrandPubliqueJeunePublique> paysRencontreGrandPubliqueJeunePubliques){
        if(ListUtil.isNotEmpty(paysRencontreGrandPubliqueJeunePubliques)){
        paysRencontreGrandPubliqueJeunePubliques.forEach(e->paysRencontreGrandPubliqueJeunePubliqueDao.delete(e));
        }
}
@Override
public void update(List<PaysRencontreGrandPubliqueJeunePublique> paysRencontreGrandPubliqueJeunePubliques){
if(ListUtil.isNotEmpty(paysRencontreGrandPubliqueJeunePubliques)){
paysRencontreGrandPubliqueJeunePubliques.forEach(e->paysRencontreGrandPubliqueJeunePubliqueDao.save(e));
}
}



}
