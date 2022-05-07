package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.Doctorant;
import com.ird.faa.bean.Sexe;
import com.ird.faa.bean.Pays;
import com.ird.faa.dao.DoctorantDao;
import com.ird.faa.service.admin.facade.DoctorantAdminService;
import com.ird.faa.service.admin.facade.SexeAdminService;
import com.ird.faa.service.admin.facade.PaysAdminService;

import com.ird.faa.ws.rest.provided.vo.DoctorantVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class DoctorantAdminServiceImpl extends AbstractServiceImpl<Doctorant> implements DoctorantAdminService {

@Autowired
private DoctorantDao doctorantDao;

@Autowired
private ArchivableService<Doctorant> archivableService;
        @Autowired
        private SexeAdminService sexeService ;
        @Autowired
        private PaysAdminService paysService ;


@Autowired
private EntityManager entityManager;


@Override
public List<Doctorant> findAll(){
        return doctorantDao.findAll();
}

        @Override
        public List<Doctorant> findBySexeCode(String code){
        return doctorantDao.findBySexeCode(code);
        }

        @Override
        @Transactional
        public int deleteBySexeCode(String code){
        return doctorantDao.deleteBySexeCode(code);
        }

        @Override
        public List<Doctorant> findBySexeId(Long id){
        return doctorantDao.findBySexeId(id);
        }

        @Override
        @Transactional
        public int deleteBySexeId(Long id){
        return doctorantDao.deleteBySexeId(id);
        }


        @Override
        public List<Doctorant> findByPaysCode(String code){
        return doctorantDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return doctorantDao.deleteByPaysCode(code);
        }

        @Override
        public List<Doctorant> findByPaysId(Long id){
        return doctorantDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return doctorantDao.deleteByPaysId(id);
        }


@Override
public Doctorant findById(Long id){
if(id==null) return null;
return doctorantDao.getOne(id);
}

@Override
public Doctorant findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public Doctorant archiver(Doctorant doctorant) {
        if (doctorant.getArchive() == null) {
        doctorant.setArchive(false);
        }
        doctorant.setArchive(true);
        doctorant.setDateArchivage(new Date());
        doctorantDao.save(doctorant);
        return doctorant;

    }

    @Override
    public Doctorant desarchiver(Doctorant doctorant) {
    if (doctorant.getArchive() == null) {
    doctorant.setArchive(false);
    }
    doctorant.setArchive(false);
    doctorant.setDateArchivage(null);
    doctorantDao.save(doctorant);
    return doctorant;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(doctorantDao.findById(id).isPresent())  {
doctorantDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Doctorant update(Doctorant doctorant){
Doctorant foundedDoctorant = findById(doctorant.getId());
if(foundedDoctorant==null) return null;
else{
    archivableService.prepare(doctorant);
return  doctorantDao.save(doctorant);
}
}
private void prepareSave(Doctorant doctorant){
doctorant.setDateCreation(new Date());
if(doctorant.getArchive() == null)
  doctorant.setArchive(false);
if(doctorant.getAdmin() == null)
  doctorant.setAdmin(false);
if(doctorant.getVisible() == null)
  doctorant.setVisible(false);



}

@Override
public Doctorant save (Doctorant doctorant){
prepareSave(doctorant);



    findSexe(doctorant);
    findPays(doctorant);

return doctorantDao.save(doctorant);


}

@Override
public List<Doctorant> save(List<Doctorant> doctorants){
List<Doctorant> list = new ArrayList<>();
for(Doctorant doctorant: doctorants){
list.add(save(doctorant));
}
return list;
}



@Override
@Transactional
public int delete(Doctorant doctorant){
    if(doctorant.getId()==null) return -1;
    Doctorant foundedDoctorant = findById(doctorant.getId());
    if(foundedDoctorant==null) return -1;
doctorantDao.delete(foundedDoctorant);
return 1;
}


public List<Doctorant> findByCriteria(DoctorantVo doctorantVo){

String query = "SELECT o FROM Doctorant o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",doctorantVo.getId());
            query += SearchUtil.addConstraint( "o", "nom","LIKE",doctorantVo.getNom());
            query += SearchUtil.addConstraint( "o", "prenom","LIKE",doctorantVo.getPrenom());
            query += SearchUtil.addConstraint( "o", "civilite","LIKE",doctorantVo.getCivilite());
            query += SearchUtil.addConstraint( "o", "anneeNaissance","=",doctorantVo.getAnneeNaissance());
            query += SearchUtil.addConstraint( "o", "archive","=",doctorantVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",doctorantVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",doctorantVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",doctorantVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",doctorantVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",doctorantVo.getUsername());
            query += SearchUtil.addConstraintMinMax("o","anneeNaissance",doctorantVo.getAnneeNaissanceMin(),doctorantVo.getAnneeNaissanceMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",doctorantVo.getDateArchivageMin(),doctorantVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",doctorantVo.getDateCreationMin(),doctorantVo.getDateCreationMax());
    if(doctorantVo.getSexeVo()!=null){
        query += SearchUtil.addConstraint( "o", "sexe.id","=",doctorantVo.getSexeVo().getId());
            query += SearchUtil.addConstraint( "o", "sexe.code","LIKE",doctorantVo.getSexeVo().getCode());
    }

    if(doctorantVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",doctorantVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",doctorantVo.getPaysVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findSexe(Doctorant doctorant){
        Sexe loadedSexe =sexeService.findByIdOrCode(doctorant.getSexe());

    if(loadedSexe==null ) {
        return;
    }
    doctorant.setSexe(loadedSexe);
    }
    private void findPays(Doctorant doctorant){
        Pays loadedPays =paysService.findByIdOrCode(doctorant.getPays());

    if(loadedPays==null ) {
        return;
    }
    doctorant.setPays(loadedPays);
    }

@Override
@Transactional
public void delete(List<Doctorant> doctorants){
        if(ListUtil.isNotEmpty(doctorants)){
        doctorants.forEach(e->doctorantDao.delete(e));
        }
}
@Override
public void update(List<Doctorant> doctorants){
if(ListUtil.isNotEmpty(doctorants)){
doctorants.forEach(e->doctorantDao.save(e));
}
}



}
