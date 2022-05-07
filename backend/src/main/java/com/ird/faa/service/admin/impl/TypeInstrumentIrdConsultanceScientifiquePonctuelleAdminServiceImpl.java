package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TypeInstrumentIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.TypeInstrumentIrd;
import com.ird.faa.bean.ConsultanceScientifiquePonctuelle;
import com.ird.faa.dao.TypeInstrumentIrdConsultanceScientifiquePonctuelleDao;
import com.ird.faa.service.admin.facade.TypeInstrumentIrdConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.service.admin.facade.TypeInstrumentIrdAdminService;
import com.ird.faa.service.admin.facade.ConsultanceScientifiquePonctuelleAdminService;

import com.ird.faa.ws.rest.provided.vo.TypeInstrumentIrdConsultanceScientifiquePonctuelleVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypeInstrumentIrdConsultanceScientifiquePonctuelleAdminServiceImpl extends AbstractServiceImpl<TypeInstrumentIrdConsultanceScientifiquePonctuelle> implements TypeInstrumentIrdConsultanceScientifiquePonctuelleAdminService {

@Autowired
private TypeInstrumentIrdConsultanceScientifiquePonctuelleDao typeInstrumentIrdConsultanceScientifiquePonctuelleDao;

        @Autowired
        private TypeInstrumentIrdAdminService typeInstrumentIrdService ;
        @Autowired
        private ConsultanceScientifiquePonctuelleAdminService consultanceScientifiquePonctuelleService ;


@Autowired
private EntityManager entityManager;


@Override
public List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findAll(){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleDao.findAll();
}

        @Override
        public List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findByTypeInstrumentIrdCode(String code){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleDao.findByTypeInstrumentIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByTypeInstrumentIrdCode(String code){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleDao.deleteByTypeInstrumentIrdCode(code);
        }

        @Override
        public List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findByTypeInstrumentIrdId(Long id){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleDao.findByTypeInstrumentIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByTypeInstrumentIrdId(Long id){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleDao.deleteByTypeInstrumentIrdId(id);
        }

        @Override
        public List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(Long id){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleDao.findByConsultanceScientifiquePonctuelleId(id);
        }

        @Override
        @Transactional
        public int deleteByConsultanceScientifiquePonctuelleId(Long id){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleDao.deleteByConsultanceScientifiquePonctuelleId(id);
        }


@Override
public TypeInstrumentIrdConsultanceScientifiquePonctuelle findById(Long id){
if(id==null) return null;
return typeInstrumentIrdConsultanceScientifiquePonctuelleDao.getOne(id);
}

@Override
public TypeInstrumentIrdConsultanceScientifiquePonctuelle findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(typeInstrumentIrdConsultanceScientifiquePonctuelleDao.findById(id).isPresent())  {
typeInstrumentIrdConsultanceScientifiquePonctuelleDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypeInstrumentIrdConsultanceScientifiquePonctuelle update(TypeInstrumentIrdConsultanceScientifiquePonctuelle typeInstrumentIrdConsultanceScientifiquePonctuelle){
TypeInstrumentIrdConsultanceScientifiquePonctuelle foundedTypeInstrumentIrdConsultanceScientifiquePonctuelle = findById(typeInstrumentIrdConsultanceScientifiquePonctuelle.getId());
if(foundedTypeInstrumentIrdConsultanceScientifiquePonctuelle==null) return null;
else{
return  typeInstrumentIrdConsultanceScientifiquePonctuelleDao.save(typeInstrumentIrdConsultanceScientifiquePonctuelle);
}
}

@Override
public TypeInstrumentIrdConsultanceScientifiquePonctuelle save (TypeInstrumentIrdConsultanceScientifiquePonctuelle typeInstrumentIrdConsultanceScientifiquePonctuelle){



    findTypeInstrumentIrd(typeInstrumentIrdConsultanceScientifiquePonctuelle);
    findConsultanceScientifiquePonctuelle(typeInstrumentIrdConsultanceScientifiquePonctuelle);

return typeInstrumentIrdConsultanceScientifiquePonctuelleDao.save(typeInstrumentIrdConsultanceScientifiquePonctuelle);


}

@Override
public List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> save(List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> typeInstrumentIrdConsultanceScientifiquePonctuelles){
List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> list = new ArrayList<>();
for(TypeInstrumentIrdConsultanceScientifiquePonctuelle typeInstrumentIrdConsultanceScientifiquePonctuelle: typeInstrumentIrdConsultanceScientifiquePonctuelles){
list.add(save(typeInstrumentIrdConsultanceScientifiquePonctuelle));
}
return list;
}



@Override
@Transactional
public int delete(TypeInstrumentIrdConsultanceScientifiquePonctuelle typeInstrumentIrdConsultanceScientifiquePonctuelle){
    if(typeInstrumentIrdConsultanceScientifiquePonctuelle.getId()==null) return -1;
    TypeInstrumentIrdConsultanceScientifiquePonctuelle foundedTypeInstrumentIrdConsultanceScientifiquePonctuelle = findById(typeInstrumentIrdConsultanceScientifiquePonctuelle.getId());
    if(foundedTypeInstrumentIrdConsultanceScientifiquePonctuelle==null) return -1;
typeInstrumentIrdConsultanceScientifiquePonctuelleDao.delete(foundedTypeInstrumentIrdConsultanceScientifiquePonctuelle);
return 1;
}


public List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findByCriteria(TypeInstrumentIrdConsultanceScientifiquePonctuelleVo typeInstrumentIrdConsultanceScientifiquePonctuelleVo){

String query = "SELECT o FROM TypeInstrumentIrdConsultanceScientifiquePonctuelle o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typeInstrumentIrdConsultanceScientifiquePonctuelleVo.getId());
    if(typeInstrumentIrdConsultanceScientifiquePonctuelleVo.getTypeInstrumentIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "typeInstrumentIrd.id","=",typeInstrumentIrdConsultanceScientifiquePonctuelleVo.getTypeInstrumentIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "typeInstrumentIrd.code","LIKE",typeInstrumentIrdConsultanceScientifiquePonctuelleVo.getTypeInstrumentIrdVo().getCode());
    }

    if(typeInstrumentIrdConsultanceScientifiquePonctuelleVo.getConsultanceScientifiquePonctuelleVo()!=null){
        query += SearchUtil.addConstraint( "o", "consultanceScientifiquePonctuelle.id","=",typeInstrumentIrdConsultanceScientifiquePonctuelleVo.getConsultanceScientifiquePonctuelleVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findTypeInstrumentIrd(TypeInstrumentIrdConsultanceScientifiquePonctuelle typeInstrumentIrdConsultanceScientifiquePonctuelle){
        TypeInstrumentIrd loadedTypeInstrumentIrd =typeInstrumentIrdService.findByIdOrCode(typeInstrumentIrdConsultanceScientifiquePonctuelle.getTypeInstrumentIrd());

    if(loadedTypeInstrumentIrd==null ) {
        return;
    }
    typeInstrumentIrdConsultanceScientifiquePonctuelle.setTypeInstrumentIrd(loadedTypeInstrumentIrd);
    }
    private void findConsultanceScientifiquePonctuelle(TypeInstrumentIrdConsultanceScientifiquePonctuelle typeInstrumentIrdConsultanceScientifiquePonctuelle){
        ConsultanceScientifiquePonctuelle loadedConsultanceScientifiquePonctuelle = null;
        if(typeInstrumentIrdConsultanceScientifiquePonctuelle.getConsultanceScientifiquePonctuelle() != null && typeInstrumentIrdConsultanceScientifiquePonctuelle.getConsultanceScientifiquePonctuelle().getId() !=null)
        loadedConsultanceScientifiquePonctuelle =consultanceScientifiquePonctuelleService.findById(typeInstrumentIrdConsultanceScientifiquePonctuelle.getConsultanceScientifiquePonctuelle().getId());

    if(loadedConsultanceScientifiquePonctuelle==null ) {
        return;
    }
    typeInstrumentIrdConsultanceScientifiquePonctuelle.setConsultanceScientifiquePonctuelle(loadedConsultanceScientifiquePonctuelle);
    }

@Override
@Transactional
public void delete(List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> typeInstrumentIrdConsultanceScientifiquePonctuelles){
        if(ListUtil.isNotEmpty(typeInstrumentIrdConsultanceScientifiquePonctuelles)){
        typeInstrumentIrdConsultanceScientifiquePonctuelles.forEach(e->typeInstrumentIrdConsultanceScientifiquePonctuelleDao.delete(e));
        }
}
@Override
public void update(List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> typeInstrumentIrdConsultanceScientifiquePonctuelles){
if(ListUtil.isNotEmpty(typeInstrumentIrdConsultanceScientifiquePonctuelles)){
typeInstrumentIrdConsultanceScientifiquePonctuelles.forEach(e->typeInstrumentIrdConsultanceScientifiquePonctuelleDao.save(e));
}
}



}
