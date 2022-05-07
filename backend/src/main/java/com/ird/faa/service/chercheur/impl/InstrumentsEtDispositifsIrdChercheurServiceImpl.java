package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.InstrumentsEtDispositifsIrd;
import com.ird.faa.bean.Campagne;
import com.ird.faa.bean.Chercheur;
import com.ird.faa.dao.InstrumentsEtDispositifsIrdDao;
import com.ird.faa.service.chercheur.facade.InstrumentsEtDispositifsIrdChercheurService;
import com.ird.faa.service.chercheur.facade.CampagneChercheurService;
import com.ird.faa.service.chercheur.facade.ChercheurChercheurService;

import com.ird.faa.ws.rest.provided.vo.InstrumentsEtDispositifsIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class InstrumentsEtDispositifsIrdChercheurServiceImpl extends AbstractServiceImpl<InstrumentsEtDispositifsIrd> implements InstrumentsEtDispositifsIrdChercheurService {

@Autowired
private InstrumentsEtDispositifsIrdDao instrumentsEtDispositifsIrdDao;

        @Autowired
        private CampagneChercheurService campagneService ;
        @Autowired
        private ChercheurChercheurService chercheurService ;


@Autowired
private EntityManager entityManager;


@Override
public List<InstrumentsEtDispositifsIrd> findAll(){
        return instrumentsEtDispositifsIrdDao.findAll();
}

        @Override
        public List<InstrumentsEtDispositifsIrd> findByCampagneCode(String code){
        return instrumentsEtDispositifsIrdDao.findByCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByCampagneCode(String code){
        return instrumentsEtDispositifsIrdDao.deleteByCampagneCode(code);
        }

        @Override
        public List<InstrumentsEtDispositifsIrd> findByCampagneId(Long id){
        return instrumentsEtDispositifsIrdDao.findByCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByCampagneId(Long id){
        return instrumentsEtDispositifsIrdDao.deleteByCampagneId(id);
        }


        @Override
        public List<InstrumentsEtDispositifsIrd> findByChercheurNumeroMatricule(String numeroMatricule){
        return instrumentsEtDispositifsIrdDao.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        @Transactional
        public int deleteByChercheurNumeroMatricule(String numeroMatricule){
        return instrumentsEtDispositifsIrdDao.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        public List<InstrumentsEtDispositifsIrd> findByChercheurId(Long id){
        return instrumentsEtDispositifsIrdDao.findByChercheurId(id);
        }

        @Override
        @Transactional
        public int deleteByChercheurId(Long id){
        return instrumentsEtDispositifsIrdDao.deleteByChercheurId(id);
        }

    @Override
    public InstrumentsEtDispositifsIrd findByCode(String code){
    if( code==null) return null;
    return instrumentsEtDispositifsIrdDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return instrumentsEtDispositifsIrdDao.deleteByCode(code);
    }
    @Override
    public InstrumentsEtDispositifsIrd findByIdOrCode(InstrumentsEtDispositifsIrd instrumentsEtDispositifsIrd){
        InstrumentsEtDispositifsIrd resultat=null;
        if(instrumentsEtDispositifsIrd != null){
            if(StringUtil.isNotEmpty(instrumentsEtDispositifsIrd.getId())){
            resultat= instrumentsEtDispositifsIrdDao.getOne(instrumentsEtDispositifsIrd.getId());
            }else if(StringUtil.isNotEmpty(instrumentsEtDispositifsIrd.getCode())) {
            resultat= instrumentsEtDispositifsIrdDao.findByCode(instrumentsEtDispositifsIrd.getCode());
            }
        }
    return resultat;
    }

@Override
public InstrumentsEtDispositifsIrd findById(Long id){
if(id==null) return null;
return instrumentsEtDispositifsIrdDao.getOne(id);
}

@Override
public InstrumentsEtDispositifsIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(instrumentsEtDispositifsIrdDao.findById(id).isPresent())  {
instrumentsEtDispositifsIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public InstrumentsEtDispositifsIrd update(InstrumentsEtDispositifsIrd instrumentsEtDispositifsIrd){
InstrumentsEtDispositifsIrd foundedInstrumentsEtDispositifsIrd = findById(instrumentsEtDispositifsIrd.getId());
if(foundedInstrumentsEtDispositifsIrd==null) return null;
else{
return  instrumentsEtDispositifsIrdDao.save(instrumentsEtDispositifsIrd);
}
}
private void prepareSave(InstrumentsEtDispositifsIrd instrumentsEtDispositifsIrd){
if(instrumentsEtDispositifsIrd.getNumerique() == null)
  instrumentsEtDispositifsIrd.setNumerique(false);



}

@Override
public InstrumentsEtDispositifsIrd save (InstrumentsEtDispositifsIrd instrumentsEtDispositifsIrd){
prepareSave(instrumentsEtDispositifsIrd);

InstrumentsEtDispositifsIrd result =null;
    InstrumentsEtDispositifsIrd foundedInstrumentsEtDispositifsIrd = findByCode(instrumentsEtDispositifsIrd.getCode());
   if(foundedInstrumentsEtDispositifsIrd == null){


    findCampagne(instrumentsEtDispositifsIrd);
    findChercheur(instrumentsEtDispositifsIrd);

InstrumentsEtDispositifsIrd savedInstrumentsEtDispositifsIrd = instrumentsEtDispositifsIrdDao.save(instrumentsEtDispositifsIrd);

result = savedInstrumentsEtDispositifsIrd;
   }

return result;
}

@Override
public List<InstrumentsEtDispositifsIrd> save(List<InstrumentsEtDispositifsIrd> instrumentsEtDispositifsIrds){
List<InstrumentsEtDispositifsIrd> list = new ArrayList<>();
for(InstrumentsEtDispositifsIrd instrumentsEtDispositifsIrd: instrumentsEtDispositifsIrds){
list.add(save(instrumentsEtDispositifsIrd));
}
return list;
}



@Override
@Transactional
public int delete(InstrumentsEtDispositifsIrd instrumentsEtDispositifsIrd){
    if(instrumentsEtDispositifsIrd.getCode()==null) return -1;

    InstrumentsEtDispositifsIrd foundedInstrumentsEtDispositifsIrd = findByCode(instrumentsEtDispositifsIrd.getCode());
    if(foundedInstrumentsEtDispositifsIrd==null) return -1;
instrumentsEtDispositifsIrdDao.delete(foundedInstrumentsEtDispositifsIrd);
return 1;
}


public List<InstrumentsEtDispositifsIrd> findByCriteria(InstrumentsEtDispositifsIrdVo instrumentsEtDispositifsIrdVo){

String query = "SELECT o FROM InstrumentsEtDispositifsIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",instrumentsEtDispositifsIrdVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",instrumentsEtDispositifsIrdVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",instrumentsEtDispositifsIrdVo.getCode());
            query += SearchUtil.addConstraint( "o", "description","LIKE",instrumentsEtDispositifsIrdVo.getDescription());
            query += SearchUtil.addConstraint( "o", "numerique","=",instrumentsEtDispositifsIrdVo.getNumerique());
    if(instrumentsEtDispositifsIrdVo.getCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "campagne.id","=",instrumentsEtDispositifsIrdVo.getCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "campagne.code","LIKE",instrumentsEtDispositifsIrdVo.getCampagneVo().getCode());
    }

    if(instrumentsEtDispositifsIrdVo.getChercheurVo()!=null){
        query += SearchUtil.addConstraint( "o", "chercheur.id","=",instrumentsEtDispositifsIrdVo.getChercheurVo().getId());
            query += SearchUtil.addConstraint( "o", "chercheur.numeroMatricule","LIKE",instrumentsEtDispositifsIrdVo.getChercheurVo().getNumeroMatricule());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findCampagne(InstrumentsEtDispositifsIrd instrumentsEtDispositifsIrd){
        Campagne loadedCampagne =campagneService.findByIdOrCode(instrumentsEtDispositifsIrd.getCampagne());

    if(loadedCampagne==null ) {
        return;
    }
    instrumentsEtDispositifsIrd.setCampagne(loadedCampagne);
    }
    private void findChercheur(InstrumentsEtDispositifsIrd instrumentsEtDispositifsIrd){
        Chercheur loadedChercheur =chercheurService.findByIdOrNumeroMatricule(instrumentsEtDispositifsIrd.getChercheur());

    if(loadedChercheur==null ) {
        return;
    }
    instrumentsEtDispositifsIrd.setChercheur(loadedChercheur);
    }

@Override
@Transactional
public void delete(List<InstrumentsEtDispositifsIrd> instrumentsEtDispositifsIrds){
        if(ListUtil.isNotEmpty(instrumentsEtDispositifsIrds)){
        instrumentsEtDispositifsIrds.forEach(e->instrumentsEtDispositifsIrdDao.delete(e));
        }
}
@Override
public void update(List<InstrumentsEtDispositifsIrd> instrumentsEtDispositifsIrds){
if(ListUtil.isNotEmpty(instrumentsEtDispositifsIrds)){
instrumentsEtDispositifsIrds.forEach(e->instrumentsEtDispositifsIrdDao.save(e));
}
}



}
