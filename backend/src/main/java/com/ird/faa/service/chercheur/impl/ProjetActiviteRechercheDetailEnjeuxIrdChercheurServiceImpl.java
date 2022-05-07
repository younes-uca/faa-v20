package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ProjetActiviteRechercheDetailEnjeuxIrd;
import com.ird.faa.bean.EnjeuxIrd;
import com.ird.faa.bean.ProjetActiviteRechercheDetail;
import com.ird.faa.dao.ProjetActiviteRechercheDetailEnjeuxIrdDao;
import com.ird.faa.service.chercheur.facade.ProjetActiviteRechercheDetailEnjeuxIrdChercheurService;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdChercheurService;
import com.ird.faa.service.chercheur.facade.ProjetActiviteRechercheDetailChercheurService;

import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailEnjeuxIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ProjetActiviteRechercheDetailEnjeuxIrdChercheurServiceImpl extends AbstractServiceImpl<ProjetActiviteRechercheDetailEnjeuxIrd> implements ProjetActiviteRechercheDetailEnjeuxIrdChercheurService {

@Autowired
private ProjetActiviteRechercheDetailEnjeuxIrdDao projetActiviteRechercheDetailEnjeuxIrdDao;

        @Autowired
        private EnjeuxIrdChercheurService enjeuxIrdService ;
        @Autowired
        private ProjetActiviteRechercheDetailChercheurService projetActiviteRechercheDetailService ;


@Autowired
private EntityManager entityManager;


@Override
public List<ProjetActiviteRechercheDetailEnjeuxIrd> findAll(){
        return projetActiviteRechercheDetailEnjeuxIrdDao.findAll();
}

        @Override
        public List<ProjetActiviteRechercheDetailEnjeuxIrd> findByEnjeuxIrdCode(String code){
        return projetActiviteRechercheDetailEnjeuxIrdDao.findByEnjeuxIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdCode(String code){
        return projetActiviteRechercheDetailEnjeuxIrdDao.deleteByEnjeuxIrdCode(code);
        }

        @Override
        public List<ProjetActiviteRechercheDetailEnjeuxIrd> findByEnjeuxIrdId(Long id){
        return projetActiviteRechercheDetailEnjeuxIrdDao.findByEnjeuxIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdId(Long id){
        return projetActiviteRechercheDetailEnjeuxIrdDao.deleteByEnjeuxIrdId(id);
        }

        @Override
        public List<ProjetActiviteRechercheDetailEnjeuxIrd> findByProjetActiviteRechercheDetailId(Long id){
        return projetActiviteRechercheDetailEnjeuxIrdDao.findByProjetActiviteRechercheDetailId(id);
        }

        @Override
        @Transactional
        public int deleteByProjetActiviteRechercheDetailId(Long id){
        return projetActiviteRechercheDetailEnjeuxIrdDao.deleteByProjetActiviteRechercheDetailId(id);
        }


@Override
public ProjetActiviteRechercheDetailEnjeuxIrd findById(Long id){
if(id==null) return null;
return projetActiviteRechercheDetailEnjeuxIrdDao.getOne(id);
}

@Override
public ProjetActiviteRechercheDetailEnjeuxIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(projetActiviteRechercheDetailEnjeuxIrdDao.findById(id).isPresent())  {
projetActiviteRechercheDetailEnjeuxIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ProjetActiviteRechercheDetailEnjeuxIrd update(ProjetActiviteRechercheDetailEnjeuxIrd projetActiviteRechercheDetailEnjeuxIrd){
ProjetActiviteRechercheDetailEnjeuxIrd foundedProjetActiviteRechercheDetailEnjeuxIrd = findById(projetActiviteRechercheDetailEnjeuxIrd.getId());
if(foundedProjetActiviteRechercheDetailEnjeuxIrd==null) return null;
else{
return  projetActiviteRechercheDetailEnjeuxIrdDao.save(projetActiviteRechercheDetailEnjeuxIrd);
}
}

@Override
public ProjetActiviteRechercheDetailEnjeuxIrd save (ProjetActiviteRechercheDetailEnjeuxIrd projetActiviteRechercheDetailEnjeuxIrd){



    findEnjeuxIrd(projetActiviteRechercheDetailEnjeuxIrd);
    findProjetActiviteRechercheDetail(projetActiviteRechercheDetailEnjeuxIrd);

return projetActiviteRechercheDetailEnjeuxIrdDao.save(projetActiviteRechercheDetailEnjeuxIrd);


}

@Override
public List<ProjetActiviteRechercheDetailEnjeuxIrd> save(List<ProjetActiviteRechercheDetailEnjeuxIrd> projetActiviteRechercheDetailEnjeuxIrds){
List<ProjetActiviteRechercheDetailEnjeuxIrd> list = new ArrayList<>();
for(ProjetActiviteRechercheDetailEnjeuxIrd projetActiviteRechercheDetailEnjeuxIrd: projetActiviteRechercheDetailEnjeuxIrds){
list.add(save(projetActiviteRechercheDetailEnjeuxIrd));
}
return list;
}



@Override
@Transactional
public int delete(ProjetActiviteRechercheDetailEnjeuxIrd projetActiviteRechercheDetailEnjeuxIrd){
    if(projetActiviteRechercheDetailEnjeuxIrd.getId()==null) return -1;
    ProjetActiviteRechercheDetailEnjeuxIrd foundedProjetActiviteRechercheDetailEnjeuxIrd = findById(projetActiviteRechercheDetailEnjeuxIrd.getId());
    if(foundedProjetActiviteRechercheDetailEnjeuxIrd==null) return -1;
projetActiviteRechercheDetailEnjeuxIrdDao.delete(foundedProjetActiviteRechercheDetailEnjeuxIrd);
return 1;
}


public List<ProjetActiviteRechercheDetailEnjeuxIrd> findByCriteria(ProjetActiviteRechercheDetailEnjeuxIrdVo projetActiviteRechercheDetailEnjeuxIrdVo){

String query = "SELECT o FROM ProjetActiviteRechercheDetailEnjeuxIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",projetActiviteRechercheDetailEnjeuxIrdVo.getId());
    if(projetActiviteRechercheDetailEnjeuxIrdVo.getEnjeuxIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "enjeuxIrd.id","=",projetActiviteRechercheDetailEnjeuxIrdVo.getEnjeuxIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "enjeuxIrd.code","LIKE",projetActiviteRechercheDetailEnjeuxIrdVo.getEnjeuxIrdVo().getCode());
    }

    if(projetActiviteRechercheDetailEnjeuxIrdVo.getProjetActiviteRechercheDetailVo()!=null){
        query += SearchUtil.addConstraint( "o", "projetActiviteRechercheDetail.id","=",projetActiviteRechercheDetailEnjeuxIrdVo.getProjetActiviteRechercheDetailVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findEnjeuxIrd(ProjetActiviteRechercheDetailEnjeuxIrd projetActiviteRechercheDetailEnjeuxIrd){
        EnjeuxIrd loadedEnjeuxIrd =enjeuxIrdService.findByIdOrCode(projetActiviteRechercheDetailEnjeuxIrd.getEnjeuxIrd());

    if(loadedEnjeuxIrd==null ) {
        return;
    }
    projetActiviteRechercheDetailEnjeuxIrd.setEnjeuxIrd(loadedEnjeuxIrd);
    }
    private void findProjetActiviteRechercheDetail(ProjetActiviteRechercheDetailEnjeuxIrd projetActiviteRechercheDetailEnjeuxIrd){
        ProjetActiviteRechercheDetail loadedProjetActiviteRechercheDetail = null;
        if(projetActiviteRechercheDetailEnjeuxIrd.getProjetActiviteRechercheDetail() != null && projetActiviteRechercheDetailEnjeuxIrd.getProjetActiviteRechercheDetail().getId() !=null)
        loadedProjetActiviteRechercheDetail =projetActiviteRechercheDetailService.findById(projetActiviteRechercheDetailEnjeuxIrd.getProjetActiviteRechercheDetail().getId());

    if(loadedProjetActiviteRechercheDetail==null ) {
        return;
    }
    projetActiviteRechercheDetailEnjeuxIrd.setProjetActiviteRechercheDetail(loadedProjetActiviteRechercheDetail);
    }

@Override
@Transactional
public void delete(List<ProjetActiviteRechercheDetailEnjeuxIrd> projetActiviteRechercheDetailEnjeuxIrds){
        if(ListUtil.isNotEmpty(projetActiviteRechercheDetailEnjeuxIrds)){
        projetActiviteRechercheDetailEnjeuxIrds.forEach(e->projetActiviteRechercheDetailEnjeuxIrdDao.delete(e));
        }
}
@Override
public void update(List<ProjetActiviteRechercheDetailEnjeuxIrd> projetActiviteRechercheDetailEnjeuxIrds){
if(ListUtil.isNotEmpty(projetActiviteRechercheDetailEnjeuxIrds)){
projetActiviteRechercheDetailEnjeuxIrds.forEach(e->projetActiviteRechercheDetailEnjeuxIrdDao.save(e));
}
}



}
