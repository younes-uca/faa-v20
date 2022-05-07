package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.PaysRencontreMedia;
import com.ird.faa.bean.Pays;
import com.ird.faa.bean.RencontreMedia;
import com.ird.faa.dao.PaysRencontreMediaDao;
import com.ird.faa.service.admin.facade.PaysRencontreMediaAdminService;
import com.ird.faa.service.admin.facade.RencontreMediaAdminService;
import com.ird.faa.service.admin.facade.PaysAdminService;

import com.ird.faa.ws.rest.provided.vo.PaysRencontreMediaVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class PaysRencontreMediaAdminServiceImpl extends AbstractServiceImpl<PaysRencontreMedia> implements PaysRencontreMediaAdminService {

@Autowired
private PaysRencontreMediaDao paysRencontreMediaDao;

        @Autowired
        private RencontreMediaAdminService rencontreMediaService ;
        @Autowired
        private PaysAdminService paysService ;


@Autowired
private EntityManager entityManager;


@Override
public List<PaysRencontreMedia> findAll(){
        return paysRencontreMediaDao.findAll();
}

        @Override
        public List<PaysRencontreMedia> findByPaysCode(String code){
        return paysRencontreMediaDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return paysRencontreMediaDao.deleteByPaysCode(code);
        }

        @Override
        public List<PaysRencontreMedia> findByPaysId(Long id){
        return paysRencontreMediaDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return paysRencontreMediaDao.deleteByPaysId(id);
        }

        @Override
        public List<PaysRencontreMedia> findByRencontreMediaId(Long id){
        return paysRencontreMediaDao.findByRencontreMediaId(id);
        }

        @Override
        @Transactional
        public int deleteByRencontreMediaId(Long id){
        return paysRencontreMediaDao.deleteByRencontreMediaId(id);
        }


@Override
public PaysRencontreMedia findById(Long id){
if(id==null) return null;
return paysRencontreMediaDao.getOne(id);
}

@Override
public PaysRencontreMedia findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(paysRencontreMediaDao.findById(id).isPresent())  {
paysRencontreMediaDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public PaysRencontreMedia update(PaysRencontreMedia paysRencontreMedia){
PaysRencontreMedia foundedPaysRencontreMedia = findById(paysRencontreMedia.getId());
if(foundedPaysRencontreMedia==null) return null;
else{
return  paysRencontreMediaDao.save(paysRencontreMedia);
}
}

@Override
public PaysRencontreMedia save (PaysRencontreMedia paysRencontreMedia){



    findPays(paysRencontreMedia);
    findRencontreMedia(paysRencontreMedia);

return paysRencontreMediaDao.save(paysRencontreMedia);


}

@Override
public List<PaysRencontreMedia> save(List<PaysRencontreMedia> paysRencontreMedias){
List<PaysRencontreMedia> list = new ArrayList<>();
for(PaysRencontreMedia paysRencontreMedia: paysRencontreMedias){
list.add(save(paysRencontreMedia));
}
return list;
}



@Override
@Transactional
public int delete(PaysRencontreMedia paysRencontreMedia){
    if(paysRencontreMedia.getId()==null) return -1;
    PaysRencontreMedia foundedPaysRencontreMedia = findById(paysRencontreMedia.getId());
    if(foundedPaysRencontreMedia==null) return -1;
paysRencontreMediaDao.delete(foundedPaysRencontreMedia);
return 1;
}


public List<PaysRencontreMedia> findByCriteria(PaysRencontreMediaVo paysRencontreMediaVo){

String query = "SELECT o FROM PaysRencontreMedia o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",paysRencontreMediaVo.getId());
    if(paysRencontreMediaVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",paysRencontreMediaVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",paysRencontreMediaVo.getPaysVo().getCode());
    }

    if(paysRencontreMediaVo.getRencontreMediaVo()!=null){
        query += SearchUtil.addConstraint( "o", "rencontreMedia.id","=",paysRencontreMediaVo.getRencontreMediaVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findPays(PaysRencontreMedia paysRencontreMedia){
        Pays loadedPays =paysService.findByIdOrCode(paysRencontreMedia.getPays());

    if(loadedPays==null ) {
        return;
    }
    paysRencontreMedia.setPays(loadedPays);
    }
    private void findRencontreMedia(PaysRencontreMedia paysRencontreMedia){
        RencontreMedia loadedRencontreMedia = null;
        if(paysRencontreMedia.getRencontreMedia() != null && paysRencontreMedia.getRencontreMedia().getId() !=null)
        loadedRencontreMedia =rencontreMediaService.findById(paysRencontreMedia.getRencontreMedia().getId());

    if(loadedRencontreMedia==null ) {
        return;
    }
    paysRencontreMedia.setRencontreMedia(loadedRencontreMedia);
    }

@Override
@Transactional
public void delete(List<PaysRencontreMedia> paysRencontreMedias){
        if(ListUtil.isNotEmpty(paysRencontreMedias)){
        paysRencontreMedias.forEach(e->paysRencontreMediaDao.delete(e));
        }
}
@Override
public void update(List<PaysRencontreMedia> paysRencontreMedias){
if(ListUtil.isNotEmpty(paysRencontreMedias)){
paysRencontreMedias.forEach(e->paysRencontreMediaDao.save(e));
}
}



}
