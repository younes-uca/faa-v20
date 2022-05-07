package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.VieInstitutionnelleDetail;
import com.ird.faa.bean.TypeInstance;
import com.ird.faa.bean.StructureIrd;
import com.ird.faa.bean.Pays;
import com.ird.faa.bean.VieInstitutionnelle;
import com.ird.faa.bean.VieInstitutionnelleDetailInstrumentIrd;
import com.ird.faa.bean.VieInstitutionnelleDetailEtablissement;
import com.ird.faa.dao.VieInstitutionnelleDetailDao;
import com.ird.faa.service.admin.facade.VieInstitutionnelleDetailAdminService;
import com.ird.faa.service.admin.facade.TypeInstanceAdminService;
import com.ird.faa.service.admin.facade.VieInstitutionnelleAdminService;
import com.ird.faa.service.admin.facade.VieInstitutionnelleDetailInstrumentIrdAdminService;
import com.ird.faa.service.admin.facade.StructureIrdAdminService;
import com.ird.faa.service.admin.facade.PaysAdminService;
import com.ird.faa.service.admin.facade.VieInstitutionnelleDetailEtablissementAdminService;

import com.ird.faa.ws.rest.provided.vo.VieInstitutionnelleDetailVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.VieInstitutionnelleDetailInstrumentIrd;
import com.ird.faa.service.admin.facade.VieInstitutionnelleDetailInstrumentIrdAdminService;
import com.ird.faa.bean.VieInstitutionnelleDetailEtablissement;
import com.ird.faa.service.admin.facade.VieInstitutionnelleDetailEtablissementAdminService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class VieInstitutionnelleDetailAdminServiceImpl extends AbstractServiceImpl<VieInstitutionnelleDetail> implements VieInstitutionnelleDetailAdminService {

@Autowired
private VieInstitutionnelleDetailDao vieInstitutionnelleDetailDao;

        @Autowired
        private TypeInstanceAdminService typeInstanceService ;
        @Autowired
        private VieInstitutionnelleAdminService vieInstitutionnelleService ;
        @Autowired
        private VieInstitutionnelleDetailInstrumentIrdAdminService vieInstitutionnelleDetailInstrumentIrdService ;
        @Autowired
        private StructureIrdAdminService structureIrdService ;
        @Autowired
        private PaysAdminService paysService ;
        @Autowired
        private VieInstitutionnelleDetailEtablissementAdminService vieInstitutionnelleDetailEtablissementService ;


@Autowired
private EntityManager entityManager;


@Override
public List<VieInstitutionnelleDetail> findAll(){
        return vieInstitutionnelleDetailDao.findAll();
}

        @Override
        public List<VieInstitutionnelleDetail> findByTypeInstanceCode(String code){
        return vieInstitutionnelleDetailDao.findByTypeInstanceCode(code);
        }

        @Override
        @Transactional
        public int deleteByTypeInstanceCode(String code){
        return vieInstitutionnelleDetailDao.deleteByTypeInstanceCode(code);
        }

        @Override
        public List<VieInstitutionnelleDetail> findByTypeInstanceId(Long id){
        return vieInstitutionnelleDetailDao.findByTypeInstanceId(id);
        }

        @Override
        @Transactional
        public int deleteByTypeInstanceId(Long id){
        return vieInstitutionnelleDetailDao.deleteByTypeInstanceId(id);
        }


        @Override
        public List<VieInstitutionnelleDetail> findByStructureIrdCode(String code){
        return vieInstitutionnelleDetailDao.findByStructureIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByStructureIrdCode(String code){
        return vieInstitutionnelleDetailDao.deleteByStructureIrdCode(code);
        }

        @Override
        public List<VieInstitutionnelleDetail> findByStructureIrdId(Long id){
        return vieInstitutionnelleDetailDao.findByStructureIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByStructureIrdId(Long id){
        return vieInstitutionnelleDetailDao.deleteByStructureIrdId(id);
        }


        @Override
        public List<VieInstitutionnelleDetail> findByPaysCode(String code){
        return vieInstitutionnelleDetailDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return vieInstitutionnelleDetailDao.deleteByPaysCode(code);
        }

        @Override
        public List<VieInstitutionnelleDetail> findByPaysId(Long id){
        return vieInstitutionnelleDetailDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return vieInstitutionnelleDetailDao.deleteByPaysId(id);
        }

        @Override
        public List<VieInstitutionnelleDetail> findByVieInstitutionnelleId(Long id){
        return vieInstitutionnelleDetailDao.findByVieInstitutionnelleId(id);
        }

        @Override
        @Transactional
        public int deleteByVieInstitutionnelleId(Long id){
        return vieInstitutionnelleDetailDao.deleteByVieInstitutionnelleId(id);
        }


@Override
public VieInstitutionnelleDetail findById(Long id){
if(id==null) return null;
return vieInstitutionnelleDetailDao.getOne(id);
}

@Override
public VieInstitutionnelleDetail findByIdWithAssociatedList(Long id){
VieInstitutionnelleDetail vieInstitutionnelleDetail  = findById(id);
findAssociatedLists(vieInstitutionnelleDetail);
return vieInstitutionnelleDetail;
}
private void findAssociatedLists(VieInstitutionnelleDetail vieInstitutionnelleDetail){
if(vieInstitutionnelleDetail!=null && vieInstitutionnelleDetail.getId() != null) {
        List<VieInstitutionnelleDetailInstrumentIrd> vieInstitutionnelleDetailInstrumentIrds = vieInstitutionnelleDetailInstrumentIrdService.findByVieInstitutionnelleDetailId(vieInstitutionnelleDetail.getId());
        vieInstitutionnelleDetail.setVieInstitutionnelleDetailInstrumentIrds(vieInstitutionnelleDetailInstrumentIrds);
        List<VieInstitutionnelleDetailEtablissement> vieInstitutionnelleDetailEtablissements = vieInstitutionnelleDetailEtablissementService.findByVieInstitutionnelleDetailId(vieInstitutionnelleDetail.getId());
        vieInstitutionnelleDetail.setVieInstitutionnelleDetailEtablissements(vieInstitutionnelleDetailEtablissements);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        vieInstitutionnelleDetailInstrumentIrdService.deleteByVieInstitutionnelleDetailId(id);
        vieInstitutionnelleDetailEtablissementService.deleteByVieInstitutionnelleDetailId(id);
}
}

    private void updateAssociatedLists(VieInstitutionnelleDetail vieInstitutionnelleDetail){
    if(vieInstitutionnelleDetail !=null && vieInstitutionnelleDetail.getId() != null){
            List<List<VieInstitutionnelleDetailInstrumentIrd>> resultVieInstitutionnelleDetailInstrumentIrds= vieInstitutionnelleDetailInstrumentIrdService.getToBeSavedAndToBeDeleted(vieInstitutionnelleDetailInstrumentIrdService.findByVieInstitutionnelleDetailId(vieInstitutionnelleDetail.getId()),vieInstitutionnelleDetail.getVieInstitutionnelleDetailInstrumentIrds());
            vieInstitutionnelleDetailInstrumentIrdService.delete(resultVieInstitutionnelleDetailInstrumentIrds.get(1));
            associateVieInstitutionnelleDetailInstrumentIrd(vieInstitutionnelleDetail,resultVieInstitutionnelleDetailInstrumentIrds.get(0));
            vieInstitutionnelleDetailInstrumentIrdService.update(resultVieInstitutionnelleDetailInstrumentIrds.get(0));

            List<List<VieInstitutionnelleDetailEtablissement>> resultVieInstitutionnelleDetailEtablissements= vieInstitutionnelleDetailEtablissementService.getToBeSavedAndToBeDeleted(vieInstitutionnelleDetailEtablissementService.findByVieInstitutionnelleDetailId(vieInstitutionnelleDetail.getId()),vieInstitutionnelleDetail.getVieInstitutionnelleDetailEtablissements());
            vieInstitutionnelleDetailEtablissementService.delete(resultVieInstitutionnelleDetailEtablissements.get(1));
            associateVieInstitutionnelleDetailEtablissement(vieInstitutionnelleDetail,resultVieInstitutionnelleDetailEtablissements.get(0));
            vieInstitutionnelleDetailEtablissementService.update(resultVieInstitutionnelleDetailEtablissements.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(vieInstitutionnelleDetailDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
vieInstitutionnelleDetailDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public VieInstitutionnelleDetail update(VieInstitutionnelleDetail vieInstitutionnelleDetail){
VieInstitutionnelleDetail foundedVieInstitutionnelleDetail = findById(vieInstitutionnelleDetail.getId());
if(foundedVieInstitutionnelleDetail==null) return null;
else{
    updateAssociatedLists(vieInstitutionnelleDetail);
return  vieInstitutionnelleDetailDao.save(vieInstitutionnelleDetail);
}
}
private void prepareSave(VieInstitutionnelleDetail vieInstitutionnelleDetail){
if(vieInstitutionnelleDetail.getCooreleStructureIrd() == null)
  vieInstitutionnelleDetail.setCooreleStructureIrd(false);
if(vieInstitutionnelleDetail.getCooreleInstrumentIrd() == null)
  vieInstitutionnelleDetail.setCooreleInstrumentIrd(false);



}

@Override
public VieInstitutionnelleDetail save (VieInstitutionnelleDetail vieInstitutionnelleDetail){
prepareSave(vieInstitutionnelleDetail);

VieInstitutionnelleDetail result =null;


    findTypeInstance(vieInstitutionnelleDetail);
    findStructureIrd(vieInstitutionnelleDetail);
    findPays(vieInstitutionnelleDetail);
    findVieInstitutionnelle(vieInstitutionnelleDetail);

VieInstitutionnelleDetail savedVieInstitutionnelleDetail = vieInstitutionnelleDetailDao.save(vieInstitutionnelleDetail);

       saveVieInstitutionnelleDetailInstrumentIrds(savedVieInstitutionnelleDetail,vieInstitutionnelleDetail.getVieInstitutionnelleDetailInstrumentIrds());
       saveVieInstitutionnelleDetailEtablissements(savedVieInstitutionnelleDetail,vieInstitutionnelleDetail.getVieInstitutionnelleDetailEtablissements());
result = savedVieInstitutionnelleDetail;

return result;
}

@Override
public List<VieInstitutionnelleDetail> save(List<VieInstitutionnelleDetail> vieInstitutionnelleDetails){
List<VieInstitutionnelleDetail> list = new ArrayList<>();
for(VieInstitutionnelleDetail vieInstitutionnelleDetail: vieInstitutionnelleDetails){
list.add(save(vieInstitutionnelleDetail));
}
return list;
}

        private List<VieInstitutionnelleDetailInstrumentIrd> prepareVieInstitutionnelleDetailInstrumentIrds(VieInstitutionnelleDetail vieInstitutionnelleDetail,List<VieInstitutionnelleDetailInstrumentIrd> vieInstitutionnelleDetailInstrumentIrds){
        for(VieInstitutionnelleDetailInstrumentIrd vieInstitutionnelleDetailInstrumentIrd:vieInstitutionnelleDetailInstrumentIrds ){
        vieInstitutionnelleDetailInstrumentIrd.setVieInstitutionnelleDetail(vieInstitutionnelleDetail);
        }
        return vieInstitutionnelleDetailInstrumentIrds;
        }
        private List<VieInstitutionnelleDetailEtablissement> prepareVieInstitutionnelleDetailEtablissements(VieInstitutionnelleDetail vieInstitutionnelleDetail,List<VieInstitutionnelleDetailEtablissement> vieInstitutionnelleDetailEtablissements){
        for(VieInstitutionnelleDetailEtablissement vieInstitutionnelleDetailEtablissement:vieInstitutionnelleDetailEtablissements ){
        vieInstitutionnelleDetailEtablissement.setVieInstitutionnelleDetail(vieInstitutionnelleDetail);
        }
        return vieInstitutionnelleDetailEtablissements;
        }


@Override
@Transactional
public int delete(VieInstitutionnelleDetail vieInstitutionnelleDetail){
    if(vieInstitutionnelleDetail.getId()==null) return -1;
    VieInstitutionnelleDetail foundedVieInstitutionnelleDetail = findById(vieInstitutionnelleDetail.getId());
    if(foundedVieInstitutionnelleDetail==null) return -1;
vieInstitutionnelleDetailDao.delete(foundedVieInstitutionnelleDetail);
return 1;
}


public List<VieInstitutionnelleDetail> findByCriteria(VieInstitutionnelleDetailVo vieInstitutionnelleDetailVo){

String query = "SELECT o FROM VieInstitutionnelleDetail o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",vieInstitutionnelleDetailVo.getId());
            query += SearchUtil.addConstraint( "o", "cooreleStructureIrd","=",vieInstitutionnelleDetailVo.getCooreleStructureIrd());
            query += SearchUtil.addConstraint( "o", "cooreleInstrumentIrd","=",vieInstitutionnelleDetailVo.getCooreleInstrumentIrd());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",vieInstitutionnelleDetailVo.getLibelle());
    if(vieInstitutionnelleDetailVo.getTypeInstanceVo()!=null){
        query += SearchUtil.addConstraint( "o", "typeInstance.id","=",vieInstitutionnelleDetailVo.getTypeInstanceVo().getId());
            query += SearchUtil.addConstraint( "o", "typeInstance.code","LIKE",vieInstitutionnelleDetailVo.getTypeInstanceVo().getCode());
    }

    if(vieInstitutionnelleDetailVo.getStructureIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "structureIrd.id","=",vieInstitutionnelleDetailVo.getStructureIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "structureIrd.code","LIKE",vieInstitutionnelleDetailVo.getStructureIrdVo().getCode());
    }

    if(vieInstitutionnelleDetailVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",vieInstitutionnelleDetailVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",vieInstitutionnelleDetailVo.getPaysVo().getCode());
    }

    if(vieInstitutionnelleDetailVo.getVieInstitutionnelleVo()!=null){
        query += SearchUtil.addConstraint( "o", "vieInstitutionnelle.id","=",vieInstitutionnelleDetailVo.getVieInstitutionnelleVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}
        private  void saveVieInstitutionnelleDetailInstrumentIrds(VieInstitutionnelleDetail vieInstitutionnelleDetail,List<VieInstitutionnelleDetailInstrumentIrd> vieInstitutionnelleDetailInstrumentIrds){

        if (ListUtil.isNotEmpty(vieInstitutionnelleDetail.getVieInstitutionnelleDetailInstrumentIrds())) {
        List<VieInstitutionnelleDetailInstrumentIrd> savedVieInstitutionnelleDetailInstrumentIrds = new ArrayList<>();
        vieInstitutionnelleDetailInstrumentIrds.forEach(element -> {
        element.setVieInstitutionnelleDetail(vieInstitutionnelleDetail);
         vieInstitutionnelleDetailInstrumentIrdService.save(element);
        });
        vieInstitutionnelleDetail.setVieInstitutionnelleDetailInstrumentIrds(savedVieInstitutionnelleDetailInstrumentIrds);
        }
        }
        private  void saveVieInstitutionnelleDetailEtablissements(VieInstitutionnelleDetail vieInstitutionnelleDetail,List<VieInstitutionnelleDetailEtablissement> vieInstitutionnelleDetailEtablissements){

        if (ListUtil.isNotEmpty(vieInstitutionnelleDetail.getVieInstitutionnelleDetailEtablissements())) {
        List<VieInstitutionnelleDetailEtablissement> savedVieInstitutionnelleDetailEtablissements = new ArrayList<>();
        vieInstitutionnelleDetailEtablissements.forEach(element -> {
        element.setVieInstitutionnelleDetail(vieInstitutionnelleDetail);
         vieInstitutionnelleDetailEtablissementService.save(element);
        });
        vieInstitutionnelleDetail.setVieInstitutionnelleDetailEtablissements(savedVieInstitutionnelleDetailEtablissements);
        }
        }

    private void findTypeInstance(VieInstitutionnelleDetail vieInstitutionnelleDetail){
        TypeInstance loadedTypeInstance =typeInstanceService.findByIdOrCode(vieInstitutionnelleDetail.getTypeInstance());

    if(loadedTypeInstance==null ) {
        return;
    }
    vieInstitutionnelleDetail.setTypeInstance(loadedTypeInstance);
    }
    private void findStructureIrd(VieInstitutionnelleDetail vieInstitutionnelleDetail){
        StructureIrd loadedStructureIrd =structureIrdService.findByIdOrCode(vieInstitutionnelleDetail.getStructureIrd());

    if(loadedStructureIrd==null ) {
        return;
    }
    vieInstitutionnelleDetail.setStructureIrd(loadedStructureIrd);
    }
    private void findPays(VieInstitutionnelleDetail vieInstitutionnelleDetail){
        Pays loadedPays =paysService.findByIdOrCode(vieInstitutionnelleDetail.getPays());

    if(loadedPays==null ) {
        return;
    }
    vieInstitutionnelleDetail.setPays(loadedPays);
    }
    private void findVieInstitutionnelle(VieInstitutionnelleDetail vieInstitutionnelleDetail){
        VieInstitutionnelle loadedVieInstitutionnelle = null;
        if(vieInstitutionnelleDetail.getVieInstitutionnelle() != null && vieInstitutionnelleDetail.getVieInstitutionnelle().getId() !=null)
        loadedVieInstitutionnelle =vieInstitutionnelleService.findById(vieInstitutionnelleDetail.getVieInstitutionnelle().getId());

    if(loadedVieInstitutionnelle==null ) {
        return;
    }
    vieInstitutionnelleDetail.setVieInstitutionnelle(loadedVieInstitutionnelle);
    }

@Override
@Transactional
public void delete(List<VieInstitutionnelleDetail> vieInstitutionnelleDetails){
        if(ListUtil.isNotEmpty(vieInstitutionnelleDetails)){
        vieInstitutionnelleDetails.forEach(e->vieInstitutionnelleDetailDao.delete(e));
        }
}
@Override
public void update(List<VieInstitutionnelleDetail> vieInstitutionnelleDetails){
if(ListUtil.isNotEmpty(vieInstitutionnelleDetails)){
vieInstitutionnelleDetails.forEach(e->vieInstitutionnelleDetailDao.save(e));
}
}

private void associateVieInstitutionnelleDetailInstrumentIrd(VieInstitutionnelleDetail vieInstitutionnelleDetail, List<VieInstitutionnelleDetailInstrumentIrd> vieInstitutionnelleDetailInstrumentIrd) {
    if (ListUtil.isNotEmpty(vieInstitutionnelleDetailInstrumentIrd)) {
        vieInstitutionnelleDetailInstrumentIrd.forEach(e -> e.setVieInstitutionnelleDetail(vieInstitutionnelleDetail));
    }
    }
private void associateVieInstitutionnelleDetailEtablissement(VieInstitutionnelleDetail vieInstitutionnelleDetail, List<VieInstitutionnelleDetailEtablissement> vieInstitutionnelleDetailEtablissement) {
    if (ListUtil.isNotEmpty(vieInstitutionnelleDetailEtablissement)) {
        vieInstitutionnelleDetailEtablissement.forEach(e -> e.setVieInstitutionnelleDetail(vieInstitutionnelleDetail));
    }
    }


}
