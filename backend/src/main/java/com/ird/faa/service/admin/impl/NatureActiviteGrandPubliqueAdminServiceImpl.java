package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.NatureActiviteGrandPublique;
import com.ird.faa.dao.NatureActiviteGrandPubliqueDao;
import com.ird.faa.service.admin.facade.NatureActiviteGrandPubliqueAdminService;

import com.ird.faa.ws.rest.provided.vo.NatureActiviteGrandPubliqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class NatureActiviteGrandPubliqueAdminServiceImpl extends AbstractServiceImpl<NatureActiviteGrandPublique> implements NatureActiviteGrandPubliqueAdminService {

@Autowired
private NatureActiviteGrandPubliqueDao natureActiviteGrandPubliqueDao;



@Autowired
private EntityManager entityManager;


@Override
public List<NatureActiviteGrandPublique> findAll(){
        String query = "SELECT o FROM NatureActiviteGrandPublique o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public NatureActiviteGrandPublique findByCode(String code){
    if( code==null) return null;
    return natureActiviteGrandPubliqueDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return natureActiviteGrandPubliqueDao.deleteByCode(code);
    }
    @Override
    public NatureActiviteGrandPublique findByIdOrCode(NatureActiviteGrandPublique natureActiviteGrandPublique){
        NatureActiviteGrandPublique resultat=null;
        if(natureActiviteGrandPublique != null){
            if(StringUtil.isNotEmpty(natureActiviteGrandPublique.getId())){
            resultat= natureActiviteGrandPubliqueDao.getOne(natureActiviteGrandPublique.getId());
            }else if(StringUtil.isNotEmpty(natureActiviteGrandPublique.getCode())) {
            resultat= natureActiviteGrandPubliqueDao.findByCode(natureActiviteGrandPublique.getCode());
            }
        }
    return resultat;
    }

@Override
public NatureActiviteGrandPublique findById(Long id){
if(id==null) return null;
return natureActiviteGrandPubliqueDao.getOne(id);
}

@Override
public NatureActiviteGrandPublique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(natureActiviteGrandPubliqueDao.findById(id).isPresent())  {
natureActiviteGrandPubliqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public NatureActiviteGrandPublique update(NatureActiviteGrandPublique natureActiviteGrandPublique){
NatureActiviteGrandPublique foundedNatureActiviteGrandPublique = findById(natureActiviteGrandPublique.getId());
if(foundedNatureActiviteGrandPublique==null) return null;
else{
return  natureActiviteGrandPubliqueDao.save(natureActiviteGrandPublique);
}
}

@Override
public NatureActiviteGrandPublique save (NatureActiviteGrandPublique natureActiviteGrandPublique){

NatureActiviteGrandPublique result =null;
    NatureActiviteGrandPublique foundedNatureActiviteGrandPublique = findByCode(natureActiviteGrandPublique.getCode());
   if(foundedNatureActiviteGrandPublique == null){



NatureActiviteGrandPublique savedNatureActiviteGrandPublique = natureActiviteGrandPubliqueDao.save(natureActiviteGrandPublique);

result = savedNatureActiviteGrandPublique;
   }

return result;
}

@Override
public List<NatureActiviteGrandPublique> save(List<NatureActiviteGrandPublique> natureActiviteGrandPubliques){
List<NatureActiviteGrandPublique> list = new ArrayList<>();
for(NatureActiviteGrandPublique natureActiviteGrandPublique: natureActiviteGrandPubliques){
list.add(save(natureActiviteGrandPublique));
}
return list;
}



@Override
@Transactional
public int delete(NatureActiviteGrandPublique natureActiviteGrandPublique){
    if(natureActiviteGrandPublique.getCode()==null) return -1;

    NatureActiviteGrandPublique foundedNatureActiviteGrandPublique = findByCode(natureActiviteGrandPublique.getCode());
    if(foundedNatureActiviteGrandPublique==null) return -1;
natureActiviteGrandPubliqueDao.delete(foundedNatureActiviteGrandPublique);
return 1;
}


public List<NatureActiviteGrandPublique> findByCriteria(NatureActiviteGrandPubliqueVo natureActiviteGrandPubliqueVo){

String query = "SELECT o FROM NatureActiviteGrandPublique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",natureActiviteGrandPubliqueVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",natureActiviteGrandPubliqueVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",natureActiviteGrandPubliqueVo.getCode());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<NatureActiviteGrandPublique> natureActiviteGrandPubliques){
        if(ListUtil.isNotEmpty(natureActiviteGrandPubliques)){
        natureActiviteGrandPubliques.forEach(e->natureActiviteGrandPubliqueDao.delete(e));
        }
}
@Override
public void update(List<NatureActiviteGrandPublique> natureActiviteGrandPubliques){
if(ListUtil.isNotEmpty(natureActiviteGrandPubliques)){
natureActiviteGrandPubliques.forEach(e->natureActiviteGrandPubliqueDao.save(e));
}
}



}
