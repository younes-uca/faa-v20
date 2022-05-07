package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.CaracterisationDeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.bean.Caracterisation;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.dao.CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao;
import com.ird.faa.service.chercheur.facade.CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.CaracterisationChercheurService;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueChercheurService;

import com.ird.faa.ws.rest.provided.vo.CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueChercheurServiceImpl extends AbstractServiceImpl<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> implements CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueChercheurService {

@Autowired
private CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao;

        @Autowired
        private CaracterisationChercheurService caracterisationService ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueChercheurService developpementDeSavoirEtInnovationScientifiqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> findAll(){
        return caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.findAll();
}

        @Override
        public List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> findByCaracterisationCode(String code){
        return caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.findByCaracterisationCode(code);
        }

        @Override
        @Transactional
        public int deleteByCaracterisationCode(String code){
        return caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.deleteByCaracterisationCode(code);
        }

        @Override
        public List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> findByCaracterisationId(Long id){
        return caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.findByCaracterisationId(id);
        }

        @Override
        @Transactional
        public int deleteByCaracterisationId(Long id){
        return caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.deleteByCaracterisationId(id);
        }

        @Override
        public List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id){
        return caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.findByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id){
        return caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }


@Override
public CaracterisationDeveloppementDeSavoirEtInnovationScientifique findById(Long id){
if(id==null) return null;
return caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.getOne(id);
}

@Override
public CaracterisationDeveloppementDeSavoirEtInnovationScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.findById(id).isPresent())  {
caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public CaracterisationDeveloppementDeSavoirEtInnovationScientifique update(CaracterisationDeveloppementDeSavoirEtInnovationScientifique caracterisationDeveloppementDeSavoirEtInnovationScientifique){
CaracterisationDeveloppementDeSavoirEtInnovationScientifique foundedCaracterisationDeveloppementDeSavoirEtInnovationScientifique = findById(caracterisationDeveloppementDeSavoirEtInnovationScientifique.getId());
if(foundedCaracterisationDeveloppementDeSavoirEtInnovationScientifique==null) return null;
else{
return  caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.save(caracterisationDeveloppementDeSavoirEtInnovationScientifique);
}
}

@Override
public CaracterisationDeveloppementDeSavoirEtInnovationScientifique save (CaracterisationDeveloppementDeSavoirEtInnovationScientifique caracterisationDeveloppementDeSavoirEtInnovationScientifique){



    findCaracterisation(caracterisationDeveloppementDeSavoirEtInnovationScientifique);
    findDeveloppementDeSavoirEtInnovationScientifique(caracterisationDeveloppementDeSavoirEtInnovationScientifique);

return caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.save(caracterisationDeveloppementDeSavoirEtInnovationScientifique);


}

@Override
public List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> save(List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> caracterisationDeveloppementDeSavoirEtInnovationScientifiques){
List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> list = new ArrayList<>();
for(CaracterisationDeveloppementDeSavoirEtInnovationScientifique caracterisationDeveloppementDeSavoirEtInnovationScientifique: caracterisationDeveloppementDeSavoirEtInnovationScientifiques){
list.add(save(caracterisationDeveloppementDeSavoirEtInnovationScientifique));
}
return list;
}



@Override
@Transactional
public int delete(CaracterisationDeveloppementDeSavoirEtInnovationScientifique caracterisationDeveloppementDeSavoirEtInnovationScientifique){
    if(caracterisationDeveloppementDeSavoirEtInnovationScientifique.getId()==null) return -1;
    CaracterisationDeveloppementDeSavoirEtInnovationScientifique foundedCaracterisationDeveloppementDeSavoirEtInnovationScientifique = findById(caracterisationDeveloppementDeSavoirEtInnovationScientifique.getId());
    if(foundedCaracterisationDeveloppementDeSavoirEtInnovationScientifique==null) return -1;
caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.delete(foundedCaracterisationDeveloppementDeSavoirEtInnovationScientifique);
return 1;
}


public List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> findByCriteria(CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo caracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo){

String query = "SELECT o FROM CaracterisationDeveloppementDeSavoirEtInnovationScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",caracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo.getId());
    if(caracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo.getCaracterisationVo()!=null){
        query += SearchUtil.addConstraint( "o", "caracterisation.id","=",caracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo.getCaracterisationVo().getId());
            query += SearchUtil.addConstraint( "o", "caracterisation.code","LIKE",caracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo.getCaracterisationVo().getCode());
    }

    if(caracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo.getDeveloppementDeSavoirEtInnovationScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "developpementDeSavoirEtInnovationScientifique.id","=",caracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo.getDeveloppementDeSavoirEtInnovationScientifiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findCaracterisation(CaracterisationDeveloppementDeSavoirEtInnovationScientifique caracterisationDeveloppementDeSavoirEtInnovationScientifique){
        Caracterisation loadedCaracterisation =caracterisationService.findByIdOrCode(caracterisationDeveloppementDeSavoirEtInnovationScientifique.getCaracterisation());

    if(loadedCaracterisation==null ) {
        return;
    }
    caracterisationDeveloppementDeSavoirEtInnovationScientifique.setCaracterisation(loadedCaracterisation);
    }
    private void findDeveloppementDeSavoirEtInnovationScientifique(CaracterisationDeveloppementDeSavoirEtInnovationScientifique caracterisationDeveloppementDeSavoirEtInnovationScientifique){
        DeveloppementDeSavoirEtInnovationScientifique loadedDeveloppementDeSavoirEtInnovationScientifique = null;
        if(caracterisationDeveloppementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifique() != null && caracterisationDeveloppementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifique().getId() !=null)
        loadedDeveloppementDeSavoirEtInnovationScientifique =developpementDeSavoirEtInnovationScientifiqueService.findById(caracterisationDeveloppementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifique().getId());

    if(loadedDeveloppementDeSavoirEtInnovationScientifique==null ) {
        return;
    }
    caracterisationDeveloppementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifique(loadedDeveloppementDeSavoirEtInnovationScientifique);
    }

@Override
@Transactional
public void delete(List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> caracterisationDeveloppementDeSavoirEtInnovationScientifiques){
        if(ListUtil.isNotEmpty(caracterisationDeveloppementDeSavoirEtInnovationScientifiques)){
        caracterisationDeveloppementDeSavoirEtInnovationScientifiques.forEach(e->caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> caracterisationDeveloppementDeSavoirEtInnovationScientifiques){
if(ListUtil.isNotEmpty(caracterisationDeveloppementDeSavoirEtInnovationScientifiques)){
caracterisationDeveloppementDeSavoirEtInnovationScientifiques.forEach(e->caracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao.save(e));
}
}



}
