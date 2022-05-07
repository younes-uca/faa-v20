package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ContratEtConventionIrd;
import com.ird.faa.bean.StatusContratEtConvention;
import com.ird.faa.bean.SavoirEtInnovation;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.dao.ContratEtConventionIrdDao;
import com.ird.faa.service.admin.facade.ContratEtConventionIrdAdminService;
import com.ird.faa.service.admin.facade.SavoirEtInnovationAdminService;
import com.ird.faa.service.admin.facade.EtatEtapeCampagneAdminService;
import com.ird.faa.service.admin.facade.StatusContratEtConventionAdminService;

import com.ird.faa.ws.rest.provided.vo.ContratEtConventionIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ContratEtConventionIrdAdminServiceImpl extends AbstractServiceImpl<ContratEtConventionIrd> implements ContratEtConventionIrdAdminService {

@Autowired
private ContratEtConventionIrdDao contratEtConventionIrdDao;

        @Autowired
        private SavoirEtInnovationAdminService savoirEtInnovationService ;
        @Autowired
        private EtatEtapeCampagneAdminService etatEtapeCampagneService ;
        @Autowired
        private StatusContratEtConventionAdminService statusContratEtConventionService ;


@Autowired
private EntityManager entityManager;


@Override
public List<ContratEtConventionIrd> findAll(){
        return contratEtConventionIrdDao.findAll();
}

        @Override
        public List<ContratEtConventionIrd> findByStatusContratEtConventionCode(String code){
        return contratEtConventionIrdDao.findByStatusContratEtConventionCode(code);
        }

        @Override
        @Transactional
        public int deleteByStatusContratEtConventionCode(String code){
        return contratEtConventionIrdDao.deleteByStatusContratEtConventionCode(code);
        }

        @Override
        public List<ContratEtConventionIrd> findByStatusContratEtConventionId(Long id){
        return contratEtConventionIrdDao.findByStatusContratEtConventionId(id);
        }

        @Override
        @Transactional
        public int deleteByStatusContratEtConventionId(Long id){
        return contratEtConventionIrdDao.deleteByStatusContratEtConventionId(id);
        }

        @Override
        public List<ContratEtConventionIrd> findBySavoirEtInnovationId(Long id){
        return contratEtConventionIrdDao.findBySavoirEtInnovationId(id);
        }

        @Override
        @Transactional
        public int deleteBySavoirEtInnovationId(Long id){
        return contratEtConventionIrdDao.deleteBySavoirEtInnovationId(id);
        }


        @Override
        public List<ContratEtConventionIrd> findByEtatEtapeCampagneCode(String code){
        return contratEtConventionIrdDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return contratEtConventionIrdDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<ContratEtConventionIrd> findByEtatEtapeCampagneId(Long id){
        return contratEtConventionIrdDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return contratEtConventionIrdDao.deleteByEtatEtapeCampagneId(id);
        }


@Override
public ContratEtConventionIrd findById(Long id){
if(id==null) return null;
return contratEtConventionIrdDao.getOne(id);
}

@Override
public ContratEtConventionIrd findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(contratEtConventionIrdDao.findById(id).isPresent())  {
contratEtConventionIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ContratEtConventionIrd update(ContratEtConventionIrd contratEtConventionIrd){
ContratEtConventionIrd foundedContratEtConventionIrd = findById(contratEtConventionIrd.getId());
if(foundedContratEtConventionIrd==null) return null;
else{
return  contratEtConventionIrdDao.save(contratEtConventionIrd);
}
}

@Override
public ContratEtConventionIrd save (ContratEtConventionIrd contratEtConventionIrd){



    findStatusContratEtConvention(contratEtConventionIrd);
    findSavoirEtInnovation(contratEtConventionIrd);
    findEtatEtapeCampagne(contratEtConventionIrd);

return contratEtConventionIrdDao.save(contratEtConventionIrd);


}

@Override
public List<ContratEtConventionIrd> save(List<ContratEtConventionIrd> contratEtConventionIrds){
List<ContratEtConventionIrd> list = new ArrayList<>();
for(ContratEtConventionIrd contratEtConventionIrd: contratEtConventionIrds){
list.add(save(contratEtConventionIrd));
}
return list;
}



@Override
@Transactional
public int delete(ContratEtConventionIrd contratEtConventionIrd){
    if(contratEtConventionIrd.getId()==null) return -1;
    ContratEtConventionIrd foundedContratEtConventionIrd = findById(contratEtConventionIrd.getId());
    if(foundedContratEtConventionIrd==null) return -1;
contratEtConventionIrdDao.delete(foundedContratEtConventionIrd);
return 1;
}


public List<ContratEtConventionIrd> findByCriteria(ContratEtConventionIrdVo contratEtConventionIrdVo){

String query = "SELECT o FROM ContratEtConventionIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",contratEtConventionIrdVo.getId());
            query += SearchUtil.addConstraint( "o", "numero","LIKE",contratEtConventionIrdVo.getNumero());
        query += SearchUtil.addConstraintDate( "o", "dateContrat","=",contratEtConventionIrdVo.getDateContrat());
            query += SearchUtil.addConstraint( "o", "intitule","LIKE",contratEtConventionIrdVo.getIntitule());
            query += SearchUtil.addConstraint( "o", "description","LIKE",contratEtConventionIrdVo.getDescription());
            query += SearchUtil.addConstraintMinMaxDate("o","dateContrat",contratEtConventionIrdVo.getDateContratMin(),contratEtConventionIrdVo.getDateContratMax());
    if(contratEtConventionIrdVo.getStatusContratEtConventionVo()!=null){
        query += SearchUtil.addConstraint( "o", "statusContratEtConvention.id","=",contratEtConventionIrdVo.getStatusContratEtConventionVo().getId());
            query += SearchUtil.addConstraint( "o", "statusContratEtConvention.code","LIKE",contratEtConventionIrdVo.getStatusContratEtConventionVo().getCode());
    }

    if(contratEtConventionIrdVo.getSavoirEtInnovationVo()!=null){
        query += SearchUtil.addConstraint( "o", "savoirEtInnovation.id","=",contratEtConventionIrdVo.getSavoirEtInnovationVo().getId());
    }

    if(contratEtConventionIrdVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",contratEtConventionIrdVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",contratEtConventionIrdVo.getEtatEtapeCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findStatusContratEtConvention(ContratEtConventionIrd contratEtConventionIrd){
        StatusContratEtConvention loadedStatusContratEtConvention =statusContratEtConventionService.findByIdOrCode(contratEtConventionIrd.getStatusContratEtConvention());

    if(loadedStatusContratEtConvention==null ) {
        return;
    }
    contratEtConventionIrd.setStatusContratEtConvention(loadedStatusContratEtConvention);
    }
    private void findSavoirEtInnovation(ContratEtConventionIrd contratEtConventionIrd){
        SavoirEtInnovation loadedSavoirEtInnovation = null;
        if(contratEtConventionIrd.getSavoirEtInnovation() != null && contratEtConventionIrd.getSavoirEtInnovation().getId() !=null)
        loadedSavoirEtInnovation =savoirEtInnovationService.findById(contratEtConventionIrd.getSavoirEtInnovation().getId());

    if(loadedSavoirEtInnovation==null ) {
        return;
    }
    contratEtConventionIrd.setSavoirEtInnovation(loadedSavoirEtInnovation);
    }
    private void findEtatEtapeCampagne(ContratEtConventionIrd contratEtConventionIrd){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(contratEtConventionIrd.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    contratEtConventionIrd.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }

@Override
@Transactional
public void delete(List<ContratEtConventionIrd> contratEtConventionIrds){
        if(ListUtil.isNotEmpty(contratEtConventionIrds)){
        contratEtConventionIrds.forEach(e->contratEtConventionIrdDao.delete(e));
        }
}
@Override
public void update(List<ContratEtConventionIrd> contratEtConventionIrds){
if(ListUtil.isNotEmpty(contratEtConventionIrds)){
contratEtConventionIrds.forEach(e->contratEtConventionIrdDao.save(e));
}
}



}
