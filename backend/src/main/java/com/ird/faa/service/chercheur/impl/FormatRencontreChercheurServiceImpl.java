package com.ird.faa.service.chercheur.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ird.faa.service.util.StringUtil;
import com.ird.faa.security.common.SecurityUtil;
import com.ird.faa.security.bean.User;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.FormatRencontre;
import com.ird.faa.dao.FormatRencontreDao;
import com.ird.faa.service.chercheur.facade.FormatRencontreChercheurService;

import com.ird.faa.ws.rest.provided.vo.FormatRencontreVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class FormatRencontreChercheurServiceImpl extends AbstractServiceImpl<FormatRencontre> implements FormatRencontreChercheurService {

@Autowired
private FormatRencontreDao formatRencontreDao;

@Autowired
private ArchivableService<FormatRencontre> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<FormatRencontre> findAll(){
    String query = "SELECT o FROM FormatRencontre o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public FormatRencontre findByCode(String code){
    if( code==null) return null;
    return formatRencontreDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return formatRencontreDao.deleteByCode(code);
    }
    @Override
    public FormatRencontre findByIdOrCode(FormatRencontre formatRencontre){
        FormatRencontre resultat=null;
        if(formatRencontre != null){
            if(StringUtil.isNotEmpty(formatRencontre.getId())){
            resultat= formatRencontreDao.getOne(formatRencontre.getId());
            }else if(StringUtil.isNotEmpty(formatRencontre.getCode())) {
            resultat= formatRencontreDao.findByCode(formatRencontre.getCode());
            }
        }
    return resultat;
    }

@Override
public FormatRencontre findById(Long id){
if(id==null) return null;
return formatRencontreDao.getOne(id);
}

@Override
public FormatRencontre findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(formatRencontreDao.findById(id).isPresent())  {
formatRencontreDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public FormatRencontre update(FormatRencontre formatRencontre){
FormatRencontre foundedFormatRencontre = findById(formatRencontre.getId());
if(foundedFormatRencontre==null) return null;
else{
    archivableService.prepare(formatRencontre);
return  formatRencontreDao.save(formatRencontre);
}
}
private void prepareSave(FormatRencontre formatRencontre){
formatRencontre.setDateCreation(new Date());
if(formatRencontre.getArchive() == null)
  formatRencontre.setArchive(false);
if(formatRencontre.getAdmin() == null)
  formatRencontre.setAdmin(false);
if(formatRencontre.getVisible() == null)
  formatRencontre.setVisible(false);



}

@Override
public FormatRencontre save (FormatRencontre formatRencontre){
prepareSave(formatRencontre);

FormatRencontre result =null;
    FormatRencontre foundedFormatRencontre = findByCode(formatRencontre.getCode());
   if(foundedFormatRencontre == null){



FormatRencontre savedFormatRencontre = formatRencontreDao.save(formatRencontre);

result = savedFormatRencontre;
   }

return result;
}

@Override
public List<FormatRencontre> save(List<FormatRencontre> formatRencontres){
List<FormatRencontre> list = new ArrayList<>();
for(FormatRencontre formatRencontre: formatRencontres){
list.add(save(formatRencontre));
}
return list;
}



@Override
@Transactional
public int delete(FormatRencontre formatRencontre){
    if(formatRencontre.getCode()==null) return -1;

    FormatRencontre foundedFormatRencontre = findByCode(formatRencontre.getCode());
    if(foundedFormatRencontre==null) return -1;
formatRencontreDao.delete(foundedFormatRencontre);
return 1;
}


public List<FormatRencontre> findByCriteria(FormatRencontreVo formatRencontreVo){

String query = "SELECT o FROM FormatRencontre o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",formatRencontreVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",formatRencontreVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",formatRencontreVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",formatRencontreVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",formatRencontreVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",formatRencontreVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",formatRencontreVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",formatRencontreVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",formatRencontreVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",formatRencontreVo.getDateArchivageMin(),formatRencontreVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",formatRencontreVo.getDateCreationMin(),formatRencontreVo.getDateCreationMax());
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<FormatRencontre> formatRencontres){
        if(ListUtil.isNotEmpty(formatRencontres)){
        formatRencontres.forEach(e->formatRencontreDao.delete(e));
        }
}
@Override
public void update(List<FormatRencontre> formatRencontres){
if(ListUtil.isNotEmpty(formatRencontres)){
formatRencontres.forEach(e->formatRencontreDao.save(e));
}
}



}
