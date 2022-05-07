package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TypeOutilPedagogique;
import com.ird.faa.bean.TypeOutil;
import com.ird.faa.bean.OutilPedagogique;
import com.ird.faa.dao.TypeOutilPedagogiqueDao;
import com.ird.faa.service.admin.facade.TypeOutilPedagogiqueAdminService;
import com.ird.faa.service.admin.facade.TypeOutilAdminService;
import com.ird.faa.service.admin.facade.OutilPedagogiqueAdminService;

import com.ird.faa.ws.rest.provided.vo.TypeOutilPedagogiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypeOutilPedagogiqueAdminServiceImpl extends AbstractServiceImpl<TypeOutilPedagogique> implements TypeOutilPedagogiqueAdminService {

@Autowired
private TypeOutilPedagogiqueDao typeOutilPedagogiqueDao;

        @Autowired
        private TypeOutilAdminService typeOutilService ;
        @Autowired
        private OutilPedagogiqueAdminService outilPedagogiqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<TypeOutilPedagogique> findAll(){
        return typeOutilPedagogiqueDao.findAll();
}

        @Override
        public List<TypeOutilPedagogique> findByTypeOutilCode(String code){
        return typeOutilPedagogiqueDao.findByTypeOutilCode(code);
        }

        @Override
        @Transactional
        public int deleteByTypeOutilCode(String code){
        return typeOutilPedagogiqueDao.deleteByTypeOutilCode(code);
        }

        @Override
        public List<TypeOutilPedagogique> findByTypeOutilId(Long id){
        return typeOutilPedagogiqueDao.findByTypeOutilId(id);
        }

        @Override
        @Transactional
        public int deleteByTypeOutilId(Long id){
        return typeOutilPedagogiqueDao.deleteByTypeOutilId(id);
        }

        @Override
        public List<TypeOutilPedagogique> findByOutilPedagogiqueId(Long id){
        return typeOutilPedagogiqueDao.findByOutilPedagogiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByOutilPedagogiqueId(Long id){
        return typeOutilPedagogiqueDao.deleteByOutilPedagogiqueId(id);
        }


@Override
public TypeOutilPedagogique findById(Long id){
if(id==null) return null;
return typeOutilPedagogiqueDao.getOne(id);
}

@Override
public TypeOutilPedagogique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(typeOutilPedagogiqueDao.findById(id).isPresent())  {
typeOutilPedagogiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypeOutilPedagogique update(TypeOutilPedagogique typeOutilPedagogique){
TypeOutilPedagogique foundedTypeOutilPedagogique = findById(typeOutilPedagogique.getId());
if(foundedTypeOutilPedagogique==null) return null;
else{
return  typeOutilPedagogiqueDao.save(typeOutilPedagogique);
}
}

@Override
public TypeOutilPedagogique save (TypeOutilPedagogique typeOutilPedagogique){



    findTypeOutil(typeOutilPedagogique);
    findOutilPedagogique(typeOutilPedagogique);

return typeOutilPedagogiqueDao.save(typeOutilPedagogique);


}

@Override
public List<TypeOutilPedagogique> save(List<TypeOutilPedagogique> typeOutilPedagogiques){
List<TypeOutilPedagogique> list = new ArrayList<>();
for(TypeOutilPedagogique typeOutilPedagogique: typeOutilPedagogiques){
list.add(save(typeOutilPedagogique));
}
return list;
}



@Override
@Transactional
public int delete(TypeOutilPedagogique typeOutilPedagogique){
    if(typeOutilPedagogique.getId()==null) return -1;
    TypeOutilPedagogique foundedTypeOutilPedagogique = findById(typeOutilPedagogique.getId());
    if(foundedTypeOutilPedagogique==null) return -1;
typeOutilPedagogiqueDao.delete(foundedTypeOutilPedagogique);
return 1;
}


public List<TypeOutilPedagogique> findByCriteria(TypeOutilPedagogiqueVo typeOutilPedagogiqueVo){

String query = "SELECT o FROM TypeOutilPedagogique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typeOutilPedagogiqueVo.getId());
    if(typeOutilPedagogiqueVo.getTypeOutilVo()!=null){
        query += SearchUtil.addConstraint( "o", "typeOutil.id","=",typeOutilPedagogiqueVo.getTypeOutilVo().getId());
            query += SearchUtil.addConstraint( "o", "typeOutil.code","LIKE",typeOutilPedagogiqueVo.getTypeOutilVo().getCode());
    }

    if(typeOutilPedagogiqueVo.getOutilPedagogiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "outilPedagogique.id","=",typeOutilPedagogiqueVo.getOutilPedagogiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findTypeOutil(TypeOutilPedagogique typeOutilPedagogique){
        TypeOutil loadedTypeOutil =typeOutilService.findByIdOrCode(typeOutilPedagogique.getTypeOutil());

    if(loadedTypeOutil==null ) {
        return;
    }
    typeOutilPedagogique.setTypeOutil(loadedTypeOutil);
    }
    private void findOutilPedagogique(TypeOutilPedagogique typeOutilPedagogique){
        OutilPedagogique loadedOutilPedagogique = null;
        if(typeOutilPedagogique.getOutilPedagogique() != null && typeOutilPedagogique.getOutilPedagogique().getId() !=null)
        loadedOutilPedagogique =outilPedagogiqueService.findById(typeOutilPedagogique.getOutilPedagogique().getId());

    if(loadedOutilPedagogique==null ) {
        return;
    }
    typeOutilPedagogique.setOutilPedagogique(loadedOutilPedagogique);
    }

@Override
@Transactional
public void delete(List<TypeOutilPedagogique> typeOutilPedagogiques){
        if(ListUtil.isNotEmpty(typeOutilPedagogiques)){
        typeOutilPedagogiques.forEach(e->typeOutilPedagogiqueDao.delete(e));
        }
}
@Override
public void update(List<TypeOutilPedagogique> typeOutilPedagogiques){
if(ListUtil.isNotEmpty(typeOutilPedagogiques)){
typeOutilPedagogiques.forEach(e->typeOutilPedagogiqueDao.save(e));
}
}



}
