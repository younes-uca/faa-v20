package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EntiteAdministrative;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface EntiteAdministrativeDao extends JpaRepository<EntiteAdministrative,Long> {



    @Query("SELECT item FROM EntiteAdministrative item ORDER BY item.code ASC")
    List<EntiteAdministrative> findAll();

    EntiteAdministrative findByCode(String code);

    int deleteByCode(String code);

    List<EntiteAdministrative> findByTypeEntiteAdministrativeCode(String code);
    int deleteByTypeEntiteAdministrativeCode(String code);

    List<EntiteAdministrative> findByTypeEntiteAdministrativeId(Long id);

    int deleteByTypeEntiteAdministrativeId(Long id);


}
