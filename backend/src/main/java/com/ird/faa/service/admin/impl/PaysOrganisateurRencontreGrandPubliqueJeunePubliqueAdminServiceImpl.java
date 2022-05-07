package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.PaysOrganisateurRencontreGrandPubliqueJeunePublique;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePublique;
import com.ird.faa.bean.Pays;
import com.ird.faa.dao.PaysOrganisateurRencontreGrandPubliqueJeunePubliqueDao;
import com.ird.faa.service.admin.facade.PaysOrganisateurRencontreGrandPubliqueJeunePubliqueAdminService;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueAdminService;
import com.ird.faa.service.admin.facade.PaysAdminService;

import com.ird.faa.ws.rest.provided.vo.PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class PaysOrganisateurRencontreGrandPubliqueJeunePubliqueAdminServiceImpl extends AbstractServiceImpl<PaysOrganisateurRencontreGrandPubliqueJeunePublique> implements PaysOrganisateurRencontreGrandPubliqueJeunePubliqueAdminService {

@Autowired
private PaysOrganisateurRencontreGrandPubliqueJeunePubliqueDao paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao;

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueAdminService rencontreGrandPubliqueJeunePubliqueService ;
        @Autowired
        private PaysAdminService paysService ;


@Autowired
private EntityManager entityManager;


@Override
public List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findAll(){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.findAll();
}
        @Override
        public List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @Override
        @Transactional
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }


        @Override
        public List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findByPaysCode(String code){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.deleteByPaysCode(code);
        }

        @Override
        public List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findByPaysId(Long id){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.deleteByPaysId(id);
        }


@Override
public PaysOrganisateurRencontreGrandPubliqueJeunePublique findById(Long id){
if(id==null) return null;
return paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.getOne(id);
}

@Override
public PaysOrganisateurRencontreGrandPubliqueJeunePublique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.findById(id).isPresent())  {
paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public PaysOrganisateurRencontreGrandPubliqueJeunePublique update(PaysOrganisateurRencontreGrandPubliqueJeunePublique paysOrganisateurRencontreGrandPubliqueJeunePublique){
PaysOrganisateurRencontreGrandPubliqueJeunePublique foundedPaysOrganisateurRencontreGrandPubliqueJeunePublique = findById(paysOrganisateurRencontreGrandPubliqueJeunePublique.getId());
if(foundedPaysOrganisateurRencontreGrandPubliqueJeunePublique==null) return null;
else{
return  paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.save(paysOrganisateurRencontreGrandPubliqueJeunePublique);
}
}

@Override
public PaysOrganisateurRencontreGrandPubliqueJeunePublique save (PaysOrganisateurRencontreGrandPubliqueJeunePublique paysOrganisateurRencontreGrandPubliqueJeunePublique){



    findRencontreGrandPubliqueJeunePublique(paysOrganisateurRencontreGrandPubliqueJeunePublique);
    findPays(paysOrganisateurRencontreGrandPubliqueJeunePublique);

return paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.save(paysOrganisateurRencontreGrandPubliqueJeunePublique);


}

@Override
public List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> save(List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> paysOrganisateurRencontreGrandPubliqueJeunePubliques){
List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> list = new ArrayList<>();
for(PaysOrganisateurRencontreGrandPubliqueJeunePublique paysOrganisateurRencontreGrandPubliqueJeunePublique: paysOrganisateurRencontreGrandPubliqueJeunePubliques){
list.add(save(paysOrganisateurRencontreGrandPubliqueJeunePublique));
}
return list;
}



@Override
@Transactional
public int delete(PaysOrganisateurRencontreGrandPubliqueJeunePublique paysOrganisateurRencontreGrandPubliqueJeunePublique){
    if(paysOrganisateurRencontreGrandPubliqueJeunePublique.getId()==null) return -1;
    PaysOrganisateurRencontreGrandPubliqueJeunePublique foundedPaysOrganisateurRencontreGrandPubliqueJeunePublique = findById(paysOrganisateurRencontreGrandPubliqueJeunePublique.getId());
    if(foundedPaysOrganisateurRencontreGrandPubliqueJeunePublique==null) return -1;
paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.delete(foundedPaysOrganisateurRencontreGrandPubliqueJeunePublique);
return 1;
}


public List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findByCriteria(PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo){

String query = "SELECT o FROM PaysOrganisateurRencontreGrandPubliqueJeunePublique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo.getId());
    if(paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo.getRencontreGrandPubliqueJeunePubliqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "rencontreGrandPubliqueJeunePublique.id","=",paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo.getRencontreGrandPubliqueJeunePubliqueVo().getId());
    }

    if(paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo.getPaysVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findRencontreGrandPubliqueJeunePublique(PaysOrganisateurRencontreGrandPubliqueJeunePublique paysOrganisateurRencontreGrandPubliqueJeunePublique){
        RencontreGrandPubliqueJeunePublique loadedRencontreGrandPubliqueJeunePublique = null;
        if(paysOrganisateurRencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePublique() != null && paysOrganisateurRencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePublique().getId() !=null)
        loadedRencontreGrandPubliqueJeunePublique =rencontreGrandPubliqueJeunePubliqueService.findById(paysOrganisateurRencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePublique().getId());

    if(loadedRencontreGrandPubliqueJeunePublique==null ) {
        return;
    }
    paysOrganisateurRencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePublique(loadedRencontreGrandPubliqueJeunePublique);
    }
    private void findPays(PaysOrganisateurRencontreGrandPubliqueJeunePublique paysOrganisateurRencontreGrandPubliqueJeunePublique){
        Pays loadedPays =paysService.findByIdOrCode(paysOrganisateurRencontreGrandPubliqueJeunePublique.getPays());

    if(loadedPays==null ) {
        return;
    }
    paysOrganisateurRencontreGrandPubliqueJeunePublique.setPays(loadedPays);
    }

@Override
@Transactional
public void delete(List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> paysOrganisateurRencontreGrandPubliqueJeunePubliques){
        if(ListUtil.isNotEmpty(paysOrganisateurRencontreGrandPubliqueJeunePubliques)){
        paysOrganisateurRencontreGrandPubliqueJeunePubliques.forEach(e->paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.delete(e));
        }
}
@Override
public void update(List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> paysOrganisateurRencontreGrandPubliqueJeunePubliques){
if(ListUtil.isNotEmpty(paysOrganisateurRencontreGrandPubliqueJeunePubliques)){
paysOrganisateurRencontreGrandPubliqueJeunePubliques.forEach(e->paysOrganisateurRencontreGrandPubliqueJeunePubliqueDao.save(e));
}
}



}
