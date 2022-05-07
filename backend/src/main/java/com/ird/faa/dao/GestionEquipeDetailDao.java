package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.GestionEquipeDetail;


@Repository
public interface GestionEquipeDetailDao extends JpaRepository<GestionEquipeDetail,Long> {






    List<GestionEquipeDetail> findByGestionEquipeId(Long id);

    int deleteByGestionEquipeId(Long id);


}
