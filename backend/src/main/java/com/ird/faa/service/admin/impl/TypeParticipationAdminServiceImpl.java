package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TypeParticipation;
import com.ird.faa.dao.TypeParticipationDao;
import com.ird.faa.service.admin.facade.TypeParticipationAdminService;

import com.ird.faa.ws.rest.provided.vo.TypeParticipationVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypeParticipationAdminServiceImpl extends AbstractServiceImpl<TypeParticipation> implements TypeParticipationAdminService {

@Autowired
private TypeParticipationDao typeParticipationDao;



@Autowired
private EntityManager entityManager;


@Override
public List<TypeParticipation> findAll(){
        return typeParticipationDao.findAll();
}
    @Override
    public TypeParticipation findByCode(String code){
    if( code==null) return null;
    return typeParticipationDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return typeParticipationDao.deleteByCode(code);
    }
    @Override
    public TypeParticipation findByIdOrCode(TypeParticipation typeParticipation){
        TypeParticipation resultat=null;
        if(typeParticipation != null){
            if(StringUtil.isNotEmpty(typeParticipation.getId())){
            resultat= typeParticipationDao.getOne(typeParticipation.getId());
            }else if(StringUtil.isNotEmpty(typeParticipation.getCode())) {
            resultat= typeParticipationDao.findByCode(typeParticipation.getCode());
            }
        }
    return resultat;
    }

@Override
public TypeParticipation findById(Long id){
if(id==null) return null;
return typeParticipationDao.getOne(id);
}

@Override
public TypeParticipation findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(typeParticipationDao.findById(id).isPresent())  {
typeParticipationDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypeParticipation update(TypeParticipation typeParticipation){
TypeParticipation foundedTypeParticipation = findById(typeParticipation.getId());
if(foundedTypeParticipation==null) return null;
else{
return  typeParticipationDao.save(typeParticipation);
}
}

@Override
public TypeParticipation save (TypeParticipation typeParticipation){

TypeParticipation result =null;
    TypeParticipation foundedTypeParticipation = findByCode(typeParticipation.getCode());
   if(foundedTypeParticipation == null){



TypeParticipation savedTypeParticipation = typeParticipationDao.save(typeParticipation);

result = savedTypeParticipation;
   }

return result;
}

@Override
public List<TypeParticipation> save(List<TypeParticipation> typeParticipations){
List<TypeParticipation> list = new ArrayList<>();
for(TypeParticipation typeParticipation: typeParticipations){
list.add(save(typeParticipation));
}
return list;
}



@Override
@Transactional
public int delete(TypeParticipation typeParticipation){
    if(typeParticipation.getCode()==null) return -1;

    TypeParticipation foundedTypeParticipation = findByCode(typeParticipation.getCode());
    if(foundedTypeParticipation==null) return -1;
typeParticipationDao.delete(foundedTypeParticipation);
return 1;
}


public List<TypeParticipation> findByCriteria(TypeParticipationVo typeParticipationVo){

String query = "SELECT o FROM TypeParticipation o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typeParticipationVo.getId());
            query += SearchUtil.addConstraint( "o", "code","LIKE",typeParticipationVo.getCode());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",typeParticipationVo.getLibelle());
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TypeParticipation> typeParticipations){
        if(ListUtil.isNotEmpty(typeParticipations)){
        typeParticipations.forEach(e->typeParticipationDao.delete(e));
        }
}
@Override
public void update(List<TypeParticipation> typeParticipations){
if(ListUtil.isNotEmpty(typeParticipations)){
typeParticipations.forEach(e->typeParticipationDao.save(e));
}
}



}
