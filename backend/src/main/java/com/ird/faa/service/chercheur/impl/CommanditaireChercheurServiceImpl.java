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
import com.ird.faa.bean.Commanditaire;
import com.ird.faa.bean.Pays;
import com.ird.faa.dao.CommanditaireDao;
import com.ird.faa.service.chercheur.facade.CommanditaireChercheurService;
import com.ird.faa.service.chercheur.facade.PaysChercheurService;

import com.ird.faa.ws.rest.provided.vo.CommanditaireVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CommanditaireChercheurServiceImpl extends AbstractServiceImpl<Commanditaire> implements CommanditaireChercheurService {

@Autowired
private CommanditaireDao commanditaireDao;

@Autowired
private ArchivableService<Commanditaire> archivableService;
        @Autowired
        private PaysChercheurService paysService ;


@Autowired
private EntityManager entityManager;


@Override
public List<Commanditaire> findAll(){
    String query = "SELECT o FROM Commanditaire o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}

        @Override
        public List<Commanditaire> findByPaysCode(String code){
        return commanditaireDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return commanditaireDao.deleteByPaysCode(code);
        }

        @Override
        public List<Commanditaire> findByPaysId(Long id){
        return commanditaireDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return commanditaireDao.deleteByPaysId(id);
        }

    @Override
    public Commanditaire findByCode(String code){
    if( code==null) return null;
    return commanditaireDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return commanditaireDao.deleteByCode(code);
    }
    @Override
    public Commanditaire findByIdOrCode(Commanditaire commanditaire){
        Commanditaire resultat=null;
        if(commanditaire != null){
            if(StringUtil.isNotEmpty(commanditaire.getId())){
            resultat= commanditaireDao.getOne(commanditaire.getId());
            }else if(StringUtil.isNotEmpty(commanditaire.getCode())) {
            resultat= commanditaireDao.findByCode(commanditaire.getCode());
            }
        }
    return resultat;
    }

@Override
public Commanditaire findById(Long id){
if(id==null) return null;
return commanditaireDao.getOne(id);
}

@Override
public Commanditaire findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(commanditaireDao.findById(id).isPresent())  {
commanditaireDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Commanditaire update(Commanditaire commanditaire){
Commanditaire foundedCommanditaire = findById(commanditaire.getId());
if(foundedCommanditaire==null) return null;
else{
    archivableService.prepare(commanditaire);
return  commanditaireDao.save(commanditaire);
}
}
private void prepareSave(Commanditaire commanditaire){
commanditaire.setDateCreation(new Date());
if(commanditaire.getArchive() == null)
  commanditaire.setArchive(false);
if(commanditaire.getAdmin() == null)
  commanditaire.setAdmin(false);
if(commanditaire.getVisible() == null)
  commanditaire.setVisible(false);



}

@Override
public Commanditaire save (Commanditaire commanditaire){
prepareSave(commanditaire);

Commanditaire result =null;
    Commanditaire foundedCommanditaire = findByCode(commanditaire.getCode());
   if(foundedCommanditaire == null){


    findPays(commanditaire);

Commanditaire savedCommanditaire = commanditaireDao.save(commanditaire);

result = savedCommanditaire;
   }

return result;
}

@Override
public List<Commanditaire> save(List<Commanditaire> commanditaires){
List<Commanditaire> list = new ArrayList<>();
for(Commanditaire commanditaire: commanditaires){
list.add(save(commanditaire));
}
return list;
}



@Override
@Transactional
public int delete(Commanditaire commanditaire){
    if(commanditaire.getCode()==null) return -1;

    Commanditaire foundedCommanditaire = findByCode(commanditaire.getCode());
    if(foundedCommanditaire==null) return -1;
commanditaireDao.delete(foundedCommanditaire);
return 1;
}


public List<Commanditaire> findByCriteria(CommanditaireVo commanditaireVo){

String query = "SELECT o FROM Commanditaire o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",commanditaireVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",commanditaireVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",commanditaireVo.getCode());
            query += SearchUtil.addConstraint( "o", "description","LIKE",commanditaireVo.getDescription());
            query += SearchUtil.addConstraint( "o", "archive","=",commanditaireVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",commanditaireVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",commanditaireVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",commanditaireVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",commanditaireVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",commanditaireVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",commanditaireVo.getDateArchivageMin(),commanditaireVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",commanditaireVo.getDateCreationMin(),commanditaireVo.getDateCreationMax());
    if(commanditaireVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",commanditaireVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",commanditaireVo.getPaysVo().getCode());
    }

query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}

    private void findPays(Commanditaire commanditaire){
        Pays loadedPays =paysService.findByIdOrCode(commanditaire.getPays());

    if(loadedPays==null ) {
        return;
    }
    commanditaire.setPays(loadedPays);
    }

@Override
@Transactional
public void delete(List<Commanditaire> commanditaires){
        if(ListUtil.isNotEmpty(commanditaires)){
        commanditaires.forEach(e->commanditaireDao.delete(e));
        }
}
@Override
public void update(List<Commanditaire> commanditaires){
if(ListUtil.isNotEmpty(commanditaires)){
commanditaires.forEach(e->commanditaireDao.save(e));
}
}



}
