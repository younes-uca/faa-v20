package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TypePublique;
import com.ird.faa.dao.TypePubliqueDao;
import com.ird.faa.service.chercheur.facade.TypePubliqueChercheurService;

import com.ird.faa.ws.rest.provided.vo.TypePubliqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypePubliqueChercheurServiceImpl extends AbstractServiceImpl<TypePublique> implements TypePubliqueChercheurService {

@Autowired
private TypePubliqueDao typePubliqueDao;



@Autowired
private EntityManager entityManager;


@Override
public List<TypePublique> findAll(){
        String query = "SELECT o FROM TypePublique o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public TypePublique findByCode(String code){
    if( code==null) return null;
    return typePubliqueDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return typePubliqueDao.deleteByCode(code);
    }
    @Override
    public TypePublique findByIdOrCode(TypePublique typePublique){
        TypePublique resultat=null;
        if(typePublique != null){
            if(StringUtil.isNotEmpty(typePublique.getId())){
            resultat= typePubliqueDao.getOne(typePublique.getId());
            }else if(StringUtil.isNotEmpty(typePublique.getCode())) {
            resultat= typePubliqueDao.findByCode(typePublique.getCode());
            }
        }
    return resultat;
    }

@Override
public TypePublique findById(Long id){
if(id==null) return null;
return typePubliqueDao.getOne(id);
}

@Override
public TypePublique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(typePubliqueDao.findById(id).isPresent())  {
typePubliqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypePublique update(TypePublique typePublique){
TypePublique foundedTypePublique = findById(typePublique.getId());
if(foundedTypePublique==null) return null;
else{
return  typePubliqueDao.save(typePublique);
}
}

@Override
public TypePublique save (TypePublique typePublique){

TypePublique result =null;
    TypePublique foundedTypePublique = findByCode(typePublique.getCode());
   if(foundedTypePublique == null){



TypePublique savedTypePublique = typePubliqueDao.save(typePublique);

result = savedTypePublique;
   }

return result;
}

@Override
public List<TypePublique> save(List<TypePublique> typePubliques){
List<TypePublique> list = new ArrayList<>();
for(TypePublique typePublique: typePubliques){
list.add(save(typePublique));
}
return list;
}



@Override
@Transactional
public int delete(TypePublique typePublique){
    if(typePublique.getCode()==null) return -1;

    TypePublique foundedTypePublique = findByCode(typePublique.getCode());
    if(foundedTypePublique==null) return -1;
typePubliqueDao.delete(foundedTypePublique);
return 1;
}


public List<TypePublique> findByCriteria(TypePubliqueVo typePubliqueVo){

String query = "SELECT o FROM TypePublique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typePubliqueVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",typePubliqueVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",typePubliqueVo.getCode());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TypePublique> typePubliques){
        if(ListUtil.isNotEmpty(typePubliques)){
        typePubliques.forEach(e->typePubliqueDao.delete(e));
        }
}
@Override
public void update(List<TypePublique> typePubliques){
if(ListUtil.isNotEmpty(typePubliques)){
typePubliques.forEach(e->typePubliqueDao.save(e));
}
}



}
