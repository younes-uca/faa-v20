package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.FournisseurAppelProjetRecherche;
import com.ird.faa.bean.Pays;
import com.ird.faa.dao.FournisseurAppelProjetRechercheDao;
import com.ird.faa.service.admin.facade.FournisseurAppelProjetRechercheAdminService;
import com.ird.faa.service.admin.facade.PaysAdminService;

import com.ird.faa.ws.rest.provided.vo.FournisseurAppelProjetRechercheVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class FournisseurAppelProjetRechercheAdminServiceImpl extends AbstractServiceImpl<FournisseurAppelProjetRecherche> implements FournisseurAppelProjetRechercheAdminService {

@Autowired
private FournisseurAppelProjetRechercheDao fournisseurAppelProjetRechercheDao;

@Autowired
private ArchivableService<FournisseurAppelProjetRecherche> archivableService;
        @Autowired
        private PaysAdminService paysService ;


@Autowired
private EntityManager entityManager;


@Override
public List<FournisseurAppelProjetRecherche> findAll(){
        String query = "SELECT o FROM FournisseurAppelProjetRecherche o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}

        @Override
        public List<FournisseurAppelProjetRecherche> findByPaysCode(String code){
        return fournisseurAppelProjetRechercheDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return fournisseurAppelProjetRechercheDao.deleteByPaysCode(code);
        }

        @Override
        public List<FournisseurAppelProjetRecherche> findByPaysId(Long id){
        return fournisseurAppelProjetRechercheDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return fournisseurAppelProjetRechercheDao.deleteByPaysId(id);
        }

    @Override
    public FournisseurAppelProjetRecherche findByCode(String code){
    if( code==null) return null;
    return fournisseurAppelProjetRechercheDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return fournisseurAppelProjetRechercheDao.deleteByCode(code);
    }
    @Override
    public FournisseurAppelProjetRecherche findByIdOrCode(FournisseurAppelProjetRecherche fournisseurAppelProjetRecherche){
        FournisseurAppelProjetRecherche resultat=null;
        if(fournisseurAppelProjetRecherche != null){
            if(StringUtil.isNotEmpty(fournisseurAppelProjetRecherche.getId())){
            resultat= fournisseurAppelProjetRechercheDao.getOne(fournisseurAppelProjetRecherche.getId());
            }else if(StringUtil.isNotEmpty(fournisseurAppelProjetRecherche.getCode())) {
            resultat= fournisseurAppelProjetRechercheDao.findByCode(fournisseurAppelProjetRecherche.getCode());
            }
        }
    return resultat;
    }

@Override
public FournisseurAppelProjetRecherche findById(Long id){
if(id==null) return null;
return fournisseurAppelProjetRechercheDao.getOne(id);
}

@Override
public FournisseurAppelProjetRecherche findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public FournisseurAppelProjetRecherche archiver(FournisseurAppelProjetRecherche fournisseurAppelProjetRecherche) {
        if (fournisseurAppelProjetRecherche.getArchive() == null) {
        fournisseurAppelProjetRecherche.setArchive(false);
        }
        fournisseurAppelProjetRecherche.setArchive(true);
        fournisseurAppelProjetRecherche.setDateArchivage(new Date());
        fournisseurAppelProjetRechercheDao.save(fournisseurAppelProjetRecherche);
        return fournisseurAppelProjetRecherche;

    }

    @Override
    public FournisseurAppelProjetRecherche desarchiver(FournisseurAppelProjetRecherche fournisseurAppelProjetRecherche) {
    if (fournisseurAppelProjetRecherche.getArchive() == null) {
    fournisseurAppelProjetRecherche.setArchive(false);
    }
    fournisseurAppelProjetRecherche.setArchive(false);
    fournisseurAppelProjetRecherche.setDateArchivage(null);
    fournisseurAppelProjetRechercheDao.save(fournisseurAppelProjetRecherche);
    return fournisseurAppelProjetRecherche;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(fournisseurAppelProjetRechercheDao.findById(id).isPresent())  {
fournisseurAppelProjetRechercheDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public FournisseurAppelProjetRecherche update(FournisseurAppelProjetRecherche fournisseurAppelProjetRecherche){
FournisseurAppelProjetRecherche foundedFournisseurAppelProjetRecherche = findById(fournisseurAppelProjetRecherche.getId());
if(foundedFournisseurAppelProjetRecherche==null) return null;
else{
    archivableService.prepare(fournisseurAppelProjetRecherche);
return  fournisseurAppelProjetRechercheDao.save(fournisseurAppelProjetRecherche);
}
}
private void prepareSave(FournisseurAppelProjetRecherche fournisseurAppelProjetRecherche){
fournisseurAppelProjetRecherche.setDateCreation(new Date());
if(fournisseurAppelProjetRecherche.getArchive() == null)
  fournisseurAppelProjetRecherche.setArchive(false);
if(fournisseurAppelProjetRecherche.getAdmin() == null)
  fournisseurAppelProjetRecherche.setAdmin(false);
if(fournisseurAppelProjetRecherche.getVisible() == null)
  fournisseurAppelProjetRecherche.setVisible(false);



}

@Override
public FournisseurAppelProjetRecherche save (FournisseurAppelProjetRecherche fournisseurAppelProjetRecherche){
prepareSave(fournisseurAppelProjetRecherche);

FournisseurAppelProjetRecherche result =null;
    FournisseurAppelProjetRecherche foundedFournisseurAppelProjetRecherche = findByCode(fournisseurAppelProjetRecherche.getCode());
   if(foundedFournisseurAppelProjetRecherche == null){


    findPays(fournisseurAppelProjetRecherche);

FournisseurAppelProjetRecherche savedFournisseurAppelProjetRecherche = fournisseurAppelProjetRechercheDao.save(fournisseurAppelProjetRecherche);

result = savedFournisseurAppelProjetRecherche;
   }

return result;
}

@Override
public List<FournisseurAppelProjetRecherche> save(List<FournisseurAppelProjetRecherche> fournisseurAppelProjetRecherches){
List<FournisseurAppelProjetRecherche> list = new ArrayList<>();
for(FournisseurAppelProjetRecherche fournisseurAppelProjetRecherche: fournisseurAppelProjetRecherches){
list.add(save(fournisseurAppelProjetRecherche));
}
return list;
}



@Override
@Transactional
public int delete(FournisseurAppelProjetRecherche fournisseurAppelProjetRecherche){
    if(fournisseurAppelProjetRecherche.getCode()==null) return -1;

    FournisseurAppelProjetRecherche foundedFournisseurAppelProjetRecherche = findByCode(fournisseurAppelProjetRecherche.getCode());
    if(foundedFournisseurAppelProjetRecherche==null) return -1;
fournisseurAppelProjetRechercheDao.delete(foundedFournisseurAppelProjetRecherche);
return 1;
}


public List<FournisseurAppelProjetRecherche> findByCriteria(FournisseurAppelProjetRechercheVo fournisseurAppelProjetRechercheVo){

String query = "SELECT o FROM FournisseurAppelProjetRecherche o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",fournisseurAppelProjetRechercheVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",fournisseurAppelProjetRechercheVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",fournisseurAppelProjetRechercheVo.getCode());
            query += SearchUtil.addConstraint( "o", "description","LIKE",fournisseurAppelProjetRechercheVo.getDescription());
            query += SearchUtil.addConstraint( "o", "archive","=",fournisseurAppelProjetRechercheVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",fournisseurAppelProjetRechercheVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",fournisseurAppelProjetRechercheVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",fournisseurAppelProjetRechercheVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",fournisseurAppelProjetRechercheVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",fournisseurAppelProjetRechercheVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",fournisseurAppelProjetRechercheVo.getDateArchivageMin(),fournisseurAppelProjetRechercheVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",fournisseurAppelProjetRechercheVo.getDateCreationMin(),fournisseurAppelProjetRechercheVo.getDateCreationMax());
    if(fournisseurAppelProjetRechercheVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",fournisseurAppelProjetRechercheVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",fournisseurAppelProjetRechercheVo.getPaysVo().getCode());
    }

query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}

    private void findPays(FournisseurAppelProjetRecherche fournisseurAppelProjetRecherche){
        Pays loadedPays =paysService.findByIdOrCode(fournisseurAppelProjetRecherche.getPays());

    if(loadedPays==null ) {
        return;
    }
    fournisseurAppelProjetRecherche.setPays(loadedPays);
    }

@Override
@Transactional
public void delete(List<FournisseurAppelProjetRecherche> fournisseurAppelProjetRecherches){
        if(ListUtil.isNotEmpty(fournisseurAppelProjetRecherches)){
        fournisseurAppelProjetRecherches.forEach(e->fournisseurAppelProjetRechercheDao.delete(e));
        }
}
@Override
public void update(List<FournisseurAppelProjetRecherche> fournisseurAppelProjetRecherches){
if(ListUtil.isNotEmpty(fournisseurAppelProjetRecherches)){
fournisseurAppelProjetRecherches.forEach(e->fournisseurAppelProjetRechercheDao.save(e));
}
}



}
