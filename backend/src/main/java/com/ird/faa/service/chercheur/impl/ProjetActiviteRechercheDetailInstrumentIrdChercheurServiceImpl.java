package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ProjetActiviteRechercheDetailInstrumentIrd;
import com.ird.faa.bean.ProjetActiviteRechercheDetail;
import com.ird.faa.bean.InstrumentIrd;
import com.ird.faa.dao.ProjetActiviteRechercheDetailInstrumentIrdDao;
import com.ird.faa.service.chercheur.facade.ProjetActiviteRechercheDetailInstrumentIrdChercheurService;
import com.ird.faa.service.chercheur.facade.ProjetActiviteRechercheDetailChercheurService;
import com.ird.faa.service.chercheur.facade.InstrumentIrdChercheurService;

import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailInstrumentIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ProjetActiviteRechercheDetailInstrumentIrdChercheurServiceImpl extends AbstractServiceImpl<ProjetActiviteRechercheDetailInstrumentIrd> implements ProjetActiviteRechercheDetailInstrumentIrdChercheurService {

@Autowired
private ProjetActiviteRechercheDetailInstrumentIrdDao projetActiviteRechercheDetailInstrumentIrdDao;

        @Autowired
        private ProjetActiviteRechercheDetailChercheurService projetActiviteRechercheDetailService ;
        @Autowired
        private InstrumentIrdChercheurService instrumentIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<ProjetActiviteRechercheDetailInstrumentIrd> findAll(){
        return projetActiviteRechercheDetailInstrumentIrdDao.findAll();
}
        @Override
        public List<ProjetActiviteRechercheDetailInstrumentIrd> findByProjetActiviteRechercheDetailId(Long id){
        return projetActiviteRechercheDetailInstrumentIrdDao.findByProjetActiviteRechercheDetailId(id);
        }

        @Override
        @Transactional
        public int deleteByProjetActiviteRechercheDetailId(Long id){
        return projetActiviteRechercheDetailInstrumentIrdDao.deleteByProjetActiviteRechercheDetailId(id);
        }


        @Override
        public List<ProjetActiviteRechercheDetailInstrumentIrd> findByInstrumentIrdCode(String code){
        return projetActiviteRechercheDetailInstrumentIrdDao.findByInstrumentIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByInstrumentIrdCode(String code){
        return projetActiviteRechercheDetailInstrumentIrdDao.deleteByInstrumentIrdCode(code);
        }

        @Override
        public List<ProjetActiviteRechercheDetailInstrumentIrd> findByInstrumentIrdId(Long id){
        return projetActiviteRechercheDetailInstrumentIrdDao.findByInstrumentIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByInstrumentIrdId(Long id){
        return projetActiviteRechercheDetailInstrumentIrdDao.deleteByInstrumentIrdId(id);
        }


@Override
public ProjetActiviteRechercheDetailInstrumentIrd findById(Long id){
if(id==null) return null;
return projetActiviteRechercheDetailInstrumentIrdDao.getOne(id);
}

@Override
public ProjetActiviteRechercheDetailInstrumentIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(projetActiviteRechercheDetailInstrumentIrdDao.findById(id).isPresent())  {
projetActiviteRechercheDetailInstrumentIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ProjetActiviteRechercheDetailInstrumentIrd update(ProjetActiviteRechercheDetailInstrumentIrd projetActiviteRechercheDetailInstrumentIrd){
ProjetActiviteRechercheDetailInstrumentIrd foundedProjetActiviteRechercheDetailInstrumentIrd = findById(projetActiviteRechercheDetailInstrumentIrd.getId());
if(foundedProjetActiviteRechercheDetailInstrumentIrd==null) return null;
else{
return  projetActiviteRechercheDetailInstrumentIrdDao.save(projetActiviteRechercheDetailInstrumentIrd);
}
}

@Override
public ProjetActiviteRechercheDetailInstrumentIrd save (ProjetActiviteRechercheDetailInstrumentIrd projetActiviteRechercheDetailInstrumentIrd){



    findProjetActiviteRechercheDetail(projetActiviteRechercheDetailInstrumentIrd);
    findInstrumentIrd(projetActiviteRechercheDetailInstrumentIrd);

return projetActiviteRechercheDetailInstrumentIrdDao.save(projetActiviteRechercheDetailInstrumentIrd);


}

@Override
public List<ProjetActiviteRechercheDetailInstrumentIrd> save(List<ProjetActiviteRechercheDetailInstrumentIrd> projetActiviteRechercheDetailInstrumentIrds){
List<ProjetActiviteRechercheDetailInstrumentIrd> list = new ArrayList<>();
for(ProjetActiviteRechercheDetailInstrumentIrd projetActiviteRechercheDetailInstrumentIrd: projetActiviteRechercheDetailInstrumentIrds){
list.add(save(projetActiviteRechercheDetailInstrumentIrd));
}
return list;
}



@Override
@Transactional
public int delete(ProjetActiviteRechercheDetailInstrumentIrd projetActiviteRechercheDetailInstrumentIrd){
    if(projetActiviteRechercheDetailInstrumentIrd.getId()==null) return -1;
    ProjetActiviteRechercheDetailInstrumentIrd foundedProjetActiviteRechercheDetailInstrumentIrd = findById(projetActiviteRechercheDetailInstrumentIrd.getId());
    if(foundedProjetActiviteRechercheDetailInstrumentIrd==null) return -1;
projetActiviteRechercheDetailInstrumentIrdDao.delete(foundedProjetActiviteRechercheDetailInstrumentIrd);
return 1;
}


public List<ProjetActiviteRechercheDetailInstrumentIrd> findByCriteria(ProjetActiviteRechercheDetailInstrumentIrdVo projetActiviteRechercheDetailInstrumentIrdVo){

String query = "SELECT o FROM ProjetActiviteRechercheDetailInstrumentIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",projetActiviteRechercheDetailInstrumentIrdVo.getId());
    if(projetActiviteRechercheDetailInstrumentIrdVo.getProjetActiviteRechercheDetailVo()!=null){
        query += SearchUtil.addConstraint( "o", "projetActiviteRechercheDetail.id","=",projetActiviteRechercheDetailInstrumentIrdVo.getProjetActiviteRechercheDetailVo().getId());
    }

    if(projetActiviteRechercheDetailInstrumentIrdVo.getInstrumentIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "instrumentIrd.id","=",projetActiviteRechercheDetailInstrumentIrdVo.getInstrumentIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "instrumentIrd.code","LIKE",projetActiviteRechercheDetailInstrumentIrdVo.getInstrumentIrdVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findProjetActiviteRechercheDetail(ProjetActiviteRechercheDetailInstrumentIrd projetActiviteRechercheDetailInstrumentIrd){
        ProjetActiviteRechercheDetail loadedProjetActiviteRechercheDetail = null;
        if(projetActiviteRechercheDetailInstrumentIrd.getProjetActiviteRechercheDetail() != null && projetActiviteRechercheDetailInstrumentIrd.getProjetActiviteRechercheDetail().getId() !=null)
        loadedProjetActiviteRechercheDetail =projetActiviteRechercheDetailService.findById(projetActiviteRechercheDetailInstrumentIrd.getProjetActiviteRechercheDetail().getId());

    if(loadedProjetActiviteRechercheDetail==null ) {
        return;
    }
    projetActiviteRechercheDetailInstrumentIrd.setProjetActiviteRechercheDetail(loadedProjetActiviteRechercheDetail);
    }
    private void findInstrumentIrd(ProjetActiviteRechercheDetailInstrumentIrd projetActiviteRechercheDetailInstrumentIrd){
        InstrumentIrd loadedInstrumentIrd =instrumentIrdService.findByIdOrCode(projetActiviteRechercheDetailInstrumentIrd.getInstrumentIrd());

    if(loadedInstrumentIrd==null ) {
        return;
    }
    projetActiviteRechercheDetailInstrumentIrd.setInstrumentIrd(loadedInstrumentIrd);
    }

@Override
@Transactional
public void delete(List<ProjetActiviteRechercheDetailInstrumentIrd> projetActiviteRechercheDetailInstrumentIrds){
        if(ListUtil.isNotEmpty(projetActiviteRechercheDetailInstrumentIrds)){
        projetActiviteRechercheDetailInstrumentIrds.forEach(e->projetActiviteRechercheDetailInstrumentIrdDao.delete(e));
        }
}
@Override
public void update(List<ProjetActiviteRechercheDetailInstrumentIrd> projetActiviteRechercheDetailInstrumentIrds){
if(ListUtil.isNotEmpty(projetActiviteRechercheDetailInstrumentIrds)){
projetActiviteRechercheDetailInstrumentIrds.forEach(e->projetActiviteRechercheDetailInstrumentIrdDao.save(e));
}
}



}
