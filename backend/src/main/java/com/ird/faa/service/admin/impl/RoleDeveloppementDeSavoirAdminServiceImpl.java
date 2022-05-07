package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.RoleDeveloppementDeSavoir;
import com.ird.faa.dao.RoleDeveloppementDeSavoirDao;
import com.ird.faa.service.admin.facade.RoleDeveloppementDeSavoirAdminService;

import com.ird.faa.ws.rest.provided.vo.RoleDeveloppementDeSavoirVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class RoleDeveloppementDeSavoirAdminServiceImpl extends AbstractServiceImpl<RoleDeveloppementDeSavoir> implements RoleDeveloppementDeSavoirAdminService {

@Autowired
private RoleDeveloppementDeSavoirDao roleDeveloppementDeSavoirDao;



@Autowired
private EntityManager entityManager;


@Override
public List<RoleDeveloppementDeSavoir> findAll(){
        String query = "SELECT o FROM RoleDeveloppementDeSavoir o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public RoleDeveloppementDeSavoir findByCode(String code){
    if( code==null) return null;
    return roleDeveloppementDeSavoirDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return roleDeveloppementDeSavoirDao.deleteByCode(code);
    }
    @Override
    public RoleDeveloppementDeSavoir findByIdOrCode(RoleDeveloppementDeSavoir roleDeveloppementDeSavoir){
        RoleDeveloppementDeSavoir resultat=null;
        if(roleDeveloppementDeSavoir != null){
            if(StringUtil.isNotEmpty(roleDeveloppementDeSavoir.getId())){
            resultat= roleDeveloppementDeSavoirDao.getOne(roleDeveloppementDeSavoir.getId());
            }else if(StringUtil.isNotEmpty(roleDeveloppementDeSavoir.getCode())) {
            resultat= roleDeveloppementDeSavoirDao.findByCode(roleDeveloppementDeSavoir.getCode());
            }
        }
    return resultat;
    }

@Override
public RoleDeveloppementDeSavoir findById(Long id){
if(id==null) return null;
return roleDeveloppementDeSavoirDao.getOne(id);
}

@Override
public RoleDeveloppementDeSavoir findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(roleDeveloppementDeSavoirDao.findById(id).isPresent())  {
roleDeveloppementDeSavoirDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public RoleDeveloppementDeSavoir update(RoleDeveloppementDeSavoir roleDeveloppementDeSavoir){
RoleDeveloppementDeSavoir foundedRoleDeveloppementDeSavoir = findById(roleDeveloppementDeSavoir.getId());
if(foundedRoleDeveloppementDeSavoir==null) return null;
else{
return  roleDeveloppementDeSavoirDao.save(roleDeveloppementDeSavoir);
}
}

@Override
public RoleDeveloppementDeSavoir save (RoleDeveloppementDeSavoir roleDeveloppementDeSavoir){

RoleDeveloppementDeSavoir result =null;
    RoleDeveloppementDeSavoir foundedRoleDeveloppementDeSavoir = findByCode(roleDeveloppementDeSavoir.getCode());
   if(foundedRoleDeveloppementDeSavoir == null){



RoleDeveloppementDeSavoir savedRoleDeveloppementDeSavoir = roleDeveloppementDeSavoirDao.save(roleDeveloppementDeSavoir);

result = savedRoleDeveloppementDeSavoir;
   }

return result;
}

@Override
public List<RoleDeveloppementDeSavoir> save(List<RoleDeveloppementDeSavoir> roleDeveloppementDeSavoirs){
List<RoleDeveloppementDeSavoir> list = new ArrayList<>();
for(RoleDeveloppementDeSavoir roleDeveloppementDeSavoir: roleDeveloppementDeSavoirs){
list.add(save(roleDeveloppementDeSavoir));
}
return list;
}



@Override
@Transactional
public int delete(RoleDeveloppementDeSavoir roleDeveloppementDeSavoir){
    if(roleDeveloppementDeSavoir.getCode()==null) return -1;

    RoleDeveloppementDeSavoir foundedRoleDeveloppementDeSavoir = findByCode(roleDeveloppementDeSavoir.getCode());
    if(foundedRoleDeveloppementDeSavoir==null) return -1;
roleDeveloppementDeSavoirDao.delete(foundedRoleDeveloppementDeSavoir);
return 1;
}


public List<RoleDeveloppementDeSavoir> findByCriteria(RoleDeveloppementDeSavoirVo roleDeveloppementDeSavoirVo){

String query = "SELECT o FROM RoleDeveloppementDeSavoir o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",roleDeveloppementDeSavoirVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",roleDeveloppementDeSavoirVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",roleDeveloppementDeSavoirVo.getCode());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<RoleDeveloppementDeSavoir> roleDeveloppementDeSavoirs){
        if(ListUtil.isNotEmpty(roleDeveloppementDeSavoirs)){
        roleDeveloppementDeSavoirs.forEach(e->roleDeveloppementDeSavoirDao.delete(e));
        }
}
@Override
public void update(List<RoleDeveloppementDeSavoir> roleDeveloppementDeSavoirs){
if(ListUtil.isNotEmpty(roleDeveloppementDeSavoirs)){
roleDeveloppementDeSavoirs.forEach(e->roleDeveloppementDeSavoirDao.save(e));
}
}



}
