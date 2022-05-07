package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.Langue;
import com.ird.faa.dao.LangueDao;
import com.ird.faa.service.admin.facade.LangueAdminService;

import com.ird.faa.ws.rest.provided.vo.LangueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class LangueAdminServiceImpl extends AbstractServiceImpl<Langue> implements LangueAdminService {

@Autowired
private LangueDao langueDao;



@Autowired
private EntityManager entityManager;


@Override
public List<Langue> findAll(){
        String query = "SELECT o FROM Langue o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public Langue findByCode(String code){
    if( code==null) return null;
    return langueDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return langueDao.deleteByCode(code);
    }
    @Override
    public Langue findByIdOrCode(Langue langue){
        Langue resultat=null;
        if(langue != null){
            if(StringUtil.isNotEmpty(langue.getId())){
            resultat= langueDao.getOne(langue.getId());
            }else if(StringUtil.isNotEmpty(langue.getCode())) {
            resultat= langueDao.findByCode(langue.getCode());
            }
        }
    return resultat;
    }

@Override
public Langue findById(Long id){
if(id==null) return null;
return langueDao.getOne(id);
}

@Override
public Langue findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(langueDao.findById(id).isPresent())  {
langueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Langue update(Langue langue){
Langue foundedLangue = findById(langue.getId());
if(foundedLangue==null) return null;
else{
return  langueDao.save(langue);
}
}

@Override
public Langue save (Langue langue){

Langue result =null;
    Langue foundedLangue = findByCode(langue.getCode());
   if(foundedLangue == null){



Langue savedLangue = langueDao.save(langue);

result = savedLangue;
   }

return result;
}

@Override
public List<Langue> save(List<Langue> langues){
List<Langue> list = new ArrayList<>();
for(Langue langue: langues){
list.add(save(langue));
}
return list;
}



@Override
@Transactional
public int delete(Langue langue){
    if(langue.getCode()==null) return -1;

    Langue foundedLangue = findByCode(langue.getCode());
    if(foundedLangue==null) return -1;
langueDao.delete(foundedLangue);
return 1;
}


public List<Langue> findByCriteria(LangueVo langueVo){

String query = "SELECT o FROM Langue o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",langueVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",langueVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",langueVo.getCode());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<Langue> langues){
        if(ListUtil.isNotEmpty(langues)){
        langues.forEach(e->langueDao.delete(e));
        }
}
@Override
public void update(List<Langue> langues){
if(ListUtil.isNotEmpty(langues)){
langues.forEach(e->langueDao.save(e));
}
}



}
