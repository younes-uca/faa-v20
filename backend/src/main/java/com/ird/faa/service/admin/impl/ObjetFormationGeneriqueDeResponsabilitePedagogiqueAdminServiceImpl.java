package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ObjetFormationGeneriqueDeResponsabilitePedagogique;
import com.ird.faa.bean.ObjetFormationGenerique;
import com.ird.faa.bean.ResponsabilitePedagogique;
import com.ird.faa.dao.ObjetFormationGeneriqueDeResponsabilitePedagogiqueDao;
import com.ird.faa.service.admin.facade.ObjetFormationGeneriqueDeResponsabilitePedagogiqueAdminService;
import com.ird.faa.service.admin.facade.ObjetFormationGeneriqueAdminService;
import com.ird.faa.service.admin.facade.ResponsabilitePedagogiqueAdminService;

import com.ird.faa.ws.rest.provided.vo.ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ObjetFormationGeneriqueDeResponsabilitePedagogiqueAdminServiceImpl extends AbstractServiceImpl<ObjetFormationGeneriqueDeResponsabilitePedagogique> implements ObjetFormationGeneriqueDeResponsabilitePedagogiqueAdminService {

@Autowired
private ObjetFormationGeneriqueDeResponsabilitePedagogiqueDao objetFormationGeneriqueDeResponsabilitePedagogiqueDao;

        @Autowired
        private ObjetFormationGeneriqueAdminService objetFormationGeneriqueService ;
        @Autowired
        private ResponsabilitePedagogiqueAdminService responsabilitePedagogiqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<ObjetFormationGeneriqueDeResponsabilitePedagogique> findAll(){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueDao.findAll();
}

        @Override
        public List<ObjetFormationGeneriqueDeResponsabilitePedagogique> findByObjetFormationGeneriqueCode(String code){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueDao.findByObjetFormationGeneriqueCode(code);
        }

        @Override
        @Transactional
        public int deleteByObjetFormationGeneriqueCode(String code){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueDao.deleteByObjetFormationGeneriqueCode(code);
        }

        @Override
        public List<ObjetFormationGeneriqueDeResponsabilitePedagogique> findByObjetFormationGeneriqueId(Long id){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueDao.findByObjetFormationGeneriqueId(id);
        }

        @Override
        @Transactional
        public int deleteByObjetFormationGeneriqueId(Long id){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueDao.deleteByObjetFormationGeneriqueId(id);
        }

        @Override
        public List<ObjetFormationGeneriqueDeResponsabilitePedagogique> findByResponsabilitePedagogiqueId(Long id){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueDao.findByResponsabilitePedagogiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByResponsabilitePedagogiqueId(Long id){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueDao.deleteByResponsabilitePedagogiqueId(id);
        }


@Override
public ObjetFormationGeneriqueDeResponsabilitePedagogique findById(Long id){
if(id==null) return null;
return objetFormationGeneriqueDeResponsabilitePedagogiqueDao.getOne(id);
}

@Override
public ObjetFormationGeneriqueDeResponsabilitePedagogique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(objetFormationGeneriqueDeResponsabilitePedagogiqueDao.findById(id).isPresent())  {
objetFormationGeneriqueDeResponsabilitePedagogiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ObjetFormationGeneriqueDeResponsabilitePedagogique update(ObjetFormationGeneriqueDeResponsabilitePedagogique objetFormationGeneriqueDeResponsabilitePedagogique){
ObjetFormationGeneriqueDeResponsabilitePedagogique foundedObjetFormationGeneriqueDeResponsabilitePedagogique = findById(objetFormationGeneriqueDeResponsabilitePedagogique.getId());
if(foundedObjetFormationGeneriqueDeResponsabilitePedagogique==null) return null;
else{
return  objetFormationGeneriqueDeResponsabilitePedagogiqueDao.save(objetFormationGeneriqueDeResponsabilitePedagogique);
}
}

@Override
public ObjetFormationGeneriqueDeResponsabilitePedagogique save (ObjetFormationGeneriqueDeResponsabilitePedagogique objetFormationGeneriqueDeResponsabilitePedagogique){



    findObjetFormationGenerique(objetFormationGeneriqueDeResponsabilitePedagogique);
    findResponsabilitePedagogique(objetFormationGeneriqueDeResponsabilitePedagogique);

return objetFormationGeneriqueDeResponsabilitePedagogiqueDao.save(objetFormationGeneriqueDeResponsabilitePedagogique);


}

@Override
public List<ObjetFormationGeneriqueDeResponsabilitePedagogique> save(List<ObjetFormationGeneriqueDeResponsabilitePedagogique> objetFormationGeneriqueDeResponsabilitePedagogiques){
List<ObjetFormationGeneriqueDeResponsabilitePedagogique> list = new ArrayList<>();
for(ObjetFormationGeneriqueDeResponsabilitePedagogique objetFormationGeneriqueDeResponsabilitePedagogique: objetFormationGeneriqueDeResponsabilitePedagogiques){
list.add(save(objetFormationGeneriqueDeResponsabilitePedagogique));
}
return list;
}



@Override
@Transactional
public int delete(ObjetFormationGeneriqueDeResponsabilitePedagogique objetFormationGeneriqueDeResponsabilitePedagogique){
    if(objetFormationGeneriqueDeResponsabilitePedagogique.getId()==null) return -1;
    ObjetFormationGeneriqueDeResponsabilitePedagogique foundedObjetFormationGeneriqueDeResponsabilitePedagogique = findById(objetFormationGeneriqueDeResponsabilitePedagogique.getId());
    if(foundedObjetFormationGeneriqueDeResponsabilitePedagogique==null) return -1;
objetFormationGeneriqueDeResponsabilitePedagogiqueDao.delete(foundedObjetFormationGeneriqueDeResponsabilitePedagogique);
return 1;
}


public List<ObjetFormationGeneriqueDeResponsabilitePedagogique> findByCriteria(ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo objetFormationGeneriqueDeResponsabilitePedagogiqueVo){

String query = "SELECT o FROM ObjetFormationGeneriqueDeResponsabilitePedagogique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",objetFormationGeneriqueDeResponsabilitePedagogiqueVo.getId());
    if(objetFormationGeneriqueDeResponsabilitePedagogiqueVo.getObjetFormationGeneriqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "objetFormationGenerique.id","=",objetFormationGeneriqueDeResponsabilitePedagogiqueVo.getObjetFormationGeneriqueVo().getId());
            query += SearchUtil.addConstraint( "o", "objetFormationGenerique.code","LIKE",objetFormationGeneriqueDeResponsabilitePedagogiqueVo.getObjetFormationGeneriqueVo().getCode());
    }

    if(objetFormationGeneriqueDeResponsabilitePedagogiqueVo.getResponsabilitePedagogiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "responsabilitePedagogique.id","=",objetFormationGeneriqueDeResponsabilitePedagogiqueVo.getResponsabilitePedagogiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findObjetFormationGenerique(ObjetFormationGeneriqueDeResponsabilitePedagogique objetFormationGeneriqueDeResponsabilitePedagogique){
        ObjetFormationGenerique loadedObjetFormationGenerique =objetFormationGeneriqueService.findByIdOrCode(objetFormationGeneriqueDeResponsabilitePedagogique.getObjetFormationGenerique());

    if(loadedObjetFormationGenerique==null ) {
        return;
    }
    objetFormationGeneriqueDeResponsabilitePedagogique.setObjetFormationGenerique(loadedObjetFormationGenerique);
    }
    private void findResponsabilitePedagogique(ObjetFormationGeneriqueDeResponsabilitePedagogique objetFormationGeneriqueDeResponsabilitePedagogique){
        ResponsabilitePedagogique loadedResponsabilitePedagogique = null;
        if(objetFormationGeneriqueDeResponsabilitePedagogique.getResponsabilitePedagogique() != null && objetFormationGeneriqueDeResponsabilitePedagogique.getResponsabilitePedagogique().getId() !=null)
        loadedResponsabilitePedagogique =responsabilitePedagogiqueService.findById(objetFormationGeneriqueDeResponsabilitePedagogique.getResponsabilitePedagogique().getId());

    if(loadedResponsabilitePedagogique==null ) {
        return;
    }
    objetFormationGeneriqueDeResponsabilitePedagogique.setResponsabilitePedagogique(loadedResponsabilitePedagogique);
    }

@Override
@Transactional
public void delete(List<ObjetFormationGeneriqueDeResponsabilitePedagogique> objetFormationGeneriqueDeResponsabilitePedagogiques){
        if(ListUtil.isNotEmpty(objetFormationGeneriqueDeResponsabilitePedagogiques)){
        objetFormationGeneriqueDeResponsabilitePedagogiques.forEach(e->objetFormationGeneriqueDeResponsabilitePedagogiqueDao.delete(e));
        }
}
@Override
public void update(List<ObjetFormationGeneriqueDeResponsabilitePedagogique> objetFormationGeneriqueDeResponsabilitePedagogiques){
if(ListUtil.isNotEmpty(objetFormationGeneriqueDeResponsabilitePedagogiques)){
objetFormationGeneriqueDeResponsabilitePedagogiques.forEach(e->objetFormationGeneriqueDeResponsabilitePedagogiqueDao.save(e));
}
}



}
