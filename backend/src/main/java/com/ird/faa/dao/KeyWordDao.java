package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.KeyWord;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface KeyWordDao extends JpaRepository<KeyWord,Long> {

    /*
     * cette methode permet de retourner une liste des id de KeyWords qui correspond a un disciplineSientifiqueErc
     */
    @Query("SELECT asso.keyWord.id FROM  KeyWordDisciplineScientifiqueErc asso WHERE asso.disciplineScientifiqueErc.id=:idErc")
    List<Long> findAllDSErc(@Param("idErc") Long idErc);

    @Query("SELECT item FROM KeyWord item ORDER BY item.code ASC")
    List<KeyWord> findAll();

    KeyWord findByCode(String code);

    int deleteByCode(String code);



}
