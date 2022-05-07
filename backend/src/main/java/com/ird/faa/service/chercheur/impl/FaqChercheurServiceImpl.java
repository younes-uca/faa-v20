package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.Faq;
import com.ird.faa.bean.CategorieFaq;
import com.ird.faa.dao.FaqDao;
import com.ird.faa.service.chercheur.facade.FaqChercheurService;
import com.ird.faa.service.chercheur.facade.CategorieFaqChercheurService;

import com.ird.faa.ws.rest.provided.vo.FaqVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class FaqChercheurServiceImpl extends AbstractServiceImpl<Faq> implements FaqChercheurService {

@Autowired
private FaqDao faqDao;

        @Autowired
        private CategorieFaqChercheurService categorieFaqService ;


@Autowired
private EntityManager entityManager;


@Override
public List<Faq> findAll(){
        return faqDao.findAll();
}

        @Override
        public List<Faq> findByCategorieFaqOrdre(Integer ordre){
        return faqDao.findByCategorieFaqOrdre(ordre);
        }

        @Override
        @Transactional
        public int deleteByCategorieFaqOrdre(Integer ordre){
        return faqDao.deleteByCategorieFaqOrdre(ordre);
        }

        @Override
        public List<Faq> findByCategorieFaqId(Long id){
        return faqDao.findByCategorieFaqId(id);
        }

        @Override
        @Transactional
        public int deleteByCategorieFaqId(Long id){
        return faqDao.deleteByCategorieFaqId(id);
        }

    @Override
    public Faq findByOrdre(Integer ordre){
    if( ordre==null) return null;
    return faqDao.findByOrdre(ordre);
    }

    @Override
    @Transactional
    public int deleteByOrdre(Integer  ordre) {
    return faqDao.deleteByOrdre(ordre);
    }
    @Override
    public Faq findByIdOrOrdre(Faq faq){
        Faq resultat=null;
        if(faq != null){
            if(StringUtil.isNotEmpty(faq.getId())){
            resultat= faqDao.getOne(faq.getId());
            }else if(StringUtil.isNotEmpty(faq.getOrdre())) {
            resultat= faqDao.findByOrdre(faq.getOrdre());
            }
        }
    return resultat;
    }

@Override
public Faq findById(Long id){
if(id==null) return null;
return faqDao.getOne(id);
}

@Override
public Faq findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(faqDao.findById(id).isPresent())  {
faqDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Faq update(Faq faq){
Faq foundedFaq = findById(faq.getId());
if(foundedFaq==null) return null;
else{
return  faqDao.save(faq);
}
}
private void prepareSave(Faq faq){
if(faq.getArchive() == null)
  faq.setArchive(false);



}

@Override
public Faq save (Faq faq){
prepareSave(faq);

Faq result =null;
    Faq foundedFaq = findByOrdre(faq.getOrdre());
   if(foundedFaq == null){


    findCategorieFaq(faq);

Faq savedFaq = faqDao.save(faq);

result = savedFaq;
   }

return result;
}

@Override
public List<Faq> save(List<Faq> faqs){
List<Faq> list = new ArrayList<>();
for(Faq faq: faqs){
list.add(save(faq));
}
return list;
}



@Override
@Transactional
public int delete(Faq faq){
    if(faq.getOrdre()==null) return -1;

    Faq foundedFaq = findByOrdre(faq.getOrdre());
    if(foundedFaq==null) return -1;
faqDao.delete(foundedFaq);
return 1;
}


public List<Faq> findByCriteria(FaqVo faqVo){

String query = "SELECT o FROM Faq o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",faqVo.getId());
            query += SearchUtil.addConstraint( "o", "question","LIKE",faqVo.getQuestion());
            query += SearchUtil.addConstraint( "o", "reponse","LIKE",faqVo.getReponse());
            query += SearchUtil.addConstraint( "o", "contact","LIKE",faqVo.getContact());
            query += SearchUtil.addConstraint( "o", "ordre","=",faqVo.getOrdre());
            query += SearchUtil.addConstraint( "o", "archive","=",faqVo.getArchive());
            query += SearchUtil.addConstraint( "o", "lien","LIKE",faqVo.getLien());
        query += SearchUtil.addConstraintDate( "o", "dernierMisAJour","=",faqVo.getDernierMisAJour());
            query += SearchUtil.addConstraintMinMax("o","ordre",faqVo.getOrdreMin(),faqVo.getOrdreMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dernierMisAJour",faqVo.getDernierMisAJourMin(),faqVo.getDernierMisAJourMax());
    if(faqVo.getCategorieFaqVo()!=null){
        query += SearchUtil.addConstraint( "o", "categorieFaq.id","=",faqVo.getCategorieFaqVo().getId());
            query += SearchUtil.addConstraint( "o", "categorieFaq.ordre","=",faqVo.getCategorieFaqVo().getOrdre());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findCategorieFaq(Faq faq){
        CategorieFaq loadedCategorieFaq =categorieFaqService.findByIdOrOrdre(faq.getCategorieFaq());

    if(loadedCategorieFaq==null ) {
        return;
    }
    faq.setCategorieFaq(loadedCategorieFaq);
    }

@Override
@Transactional
public void delete(List<Faq> faqs){
        if(ListUtil.isNotEmpty(faqs)){
        faqs.forEach(e->faqDao.delete(e));
        }
}
@Override
public void update(List<Faq> faqs){
if(ListUtil.isNotEmpty(faqs)){
faqs.forEach(e->faqDao.save(e));
}
}



}
