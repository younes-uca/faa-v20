package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TypePubliqueRencontreMedia;
import com.ird.faa.bean.TypePublique;
import com.ird.faa.bean.RencontreMedia;
import com.ird.faa.dao.TypePubliqueRencontreMediaDao;
import com.ird.faa.service.chercheur.facade.TypePubliqueRencontreMediaChercheurService;
import com.ird.faa.service.chercheur.facade.RencontreMediaChercheurService;
import com.ird.faa.service.chercheur.facade.TypePubliqueChercheurService;

import com.ird.faa.ws.rest.provided.vo.TypePubliqueRencontreMediaVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypePubliqueRencontreMediaChercheurServiceImpl extends AbstractServiceImpl<TypePubliqueRencontreMedia> implements TypePubliqueRencontreMediaChercheurService {

@Autowired
private TypePubliqueRencontreMediaDao typePubliqueRencontreMediaDao;

        @Autowired
        private RencontreMediaChercheurService rencontreMediaService ;
        @Autowired
        private TypePubliqueChercheurService typePubliqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<TypePubliqueRencontreMedia> findAll(){
        return typePubliqueRencontreMediaDao.findAll();
}

        @Override
        public List<TypePubliqueRencontreMedia> findByTypePubliqueCode(String code){
        return typePubliqueRencontreMediaDao.findByTypePubliqueCode(code);
        }

        @Override
        @Transactional
        public int deleteByTypePubliqueCode(String code){
        return typePubliqueRencontreMediaDao.deleteByTypePubliqueCode(code);
        }

        @Override
        public List<TypePubliqueRencontreMedia> findByTypePubliqueId(Long id){
        return typePubliqueRencontreMediaDao.findByTypePubliqueId(id);
        }

        @Override
        @Transactional
        public int deleteByTypePubliqueId(Long id){
        return typePubliqueRencontreMediaDao.deleteByTypePubliqueId(id);
        }

        @Override
        public List<TypePubliqueRencontreMedia> findByRencontreMediaId(Long id){
        return typePubliqueRencontreMediaDao.findByRencontreMediaId(id);
        }

        @Override
        @Transactional
        public int deleteByRencontreMediaId(Long id){
        return typePubliqueRencontreMediaDao.deleteByRencontreMediaId(id);
        }


@Override
public TypePubliqueRencontreMedia findById(Long id){
if(id==null) return null;
return typePubliqueRencontreMediaDao.getOne(id);
}

@Override
public TypePubliqueRencontreMedia findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(typePubliqueRencontreMediaDao.findById(id).isPresent())  {
typePubliqueRencontreMediaDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypePubliqueRencontreMedia update(TypePubliqueRencontreMedia typePubliqueRencontreMedia){
TypePubliqueRencontreMedia foundedTypePubliqueRencontreMedia = findById(typePubliqueRencontreMedia.getId());
if(foundedTypePubliqueRencontreMedia==null) return null;
else{
return  typePubliqueRencontreMediaDao.save(typePubliqueRencontreMedia);
}
}

@Override
public TypePubliqueRencontreMedia save (TypePubliqueRencontreMedia typePubliqueRencontreMedia){



    findTypePublique(typePubliqueRencontreMedia);
    findRencontreMedia(typePubliqueRencontreMedia);

return typePubliqueRencontreMediaDao.save(typePubliqueRencontreMedia);


}

@Override
public List<TypePubliqueRencontreMedia> save(List<TypePubliqueRencontreMedia> typePubliqueRencontreMedias){
List<TypePubliqueRencontreMedia> list = new ArrayList<>();
for(TypePubliqueRencontreMedia typePubliqueRencontreMedia: typePubliqueRencontreMedias){
list.add(save(typePubliqueRencontreMedia));
}
return list;
}



@Override
@Transactional
public int delete(TypePubliqueRencontreMedia typePubliqueRencontreMedia){
    if(typePubliqueRencontreMedia.getId()==null) return -1;
    TypePubliqueRencontreMedia foundedTypePubliqueRencontreMedia = findById(typePubliqueRencontreMedia.getId());
    if(foundedTypePubliqueRencontreMedia==null) return -1;
typePubliqueRencontreMediaDao.delete(foundedTypePubliqueRencontreMedia);
return 1;
}


public List<TypePubliqueRencontreMedia> findByCriteria(TypePubliqueRencontreMediaVo typePubliqueRencontreMediaVo){

String query = "SELECT o FROM TypePubliqueRencontreMedia o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typePubliqueRencontreMediaVo.getId());
    if(typePubliqueRencontreMediaVo.getTypePubliqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "typePublique.id","=",typePubliqueRencontreMediaVo.getTypePubliqueVo().getId());
            query += SearchUtil.addConstraint( "o", "typePublique.code","LIKE",typePubliqueRencontreMediaVo.getTypePubliqueVo().getCode());
    }

    if(typePubliqueRencontreMediaVo.getRencontreMediaVo()!=null){
        query += SearchUtil.addConstraint( "o", "rencontreMedia.id","=",typePubliqueRencontreMediaVo.getRencontreMediaVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findTypePublique(TypePubliqueRencontreMedia typePubliqueRencontreMedia){
        TypePublique loadedTypePublique =typePubliqueService.findByIdOrCode(typePubliqueRencontreMedia.getTypePublique());

    if(loadedTypePublique==null ) {
        return;
    }
    typePubliqueRencontreMedia.setTypePublique(loadedTypePublique);
    }
    private void findRencontreMedia(TypePubliqueRencontreMedia typePubliqueRencontreMedia){
        RencontreMedia loadedRencontreMedia = null;
        if(typePubliqueRencontreMedia.getRencontreMedia() != null && typePubliqueRencontreMedia.getRencontreMedia().getId() !=null)
        loadedRencontreMedia =rencontreMediaService.findById(typePubliqueRencontreMedia.getRencontreMedia().getId());

    if(loadedRencontreMedia==null ) {
        return;
    }
    typePubliqueRencontreMedia.setRencontreMedia(loadedRencontreMedia);
    }

@Override
@Transactional
public void delete(List<TypePubliqueRencontreMedia> typePubliqueRencontreMedias){
        if(ListUtil.isNotEmpty(typePubliqueRencontreMedias)){
        typePubliqueRencontreMedias.forEach(e->typePubliqueRencontreMediaDao.delete(e));
        }
}
@Override
public void update(List<TypePubliqueRencontreMedia> typePubliqueRencontreMedias){
if(ListUtil.isNotEmpty(typePubliqueRencontreMedias)){
typePubliqueRencontreMedias.forEach(e->typePubliqueRencontreMediaDao.save(e));
}
}



}
