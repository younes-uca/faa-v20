package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeParticipation;


@Repository
public interface TypeParticipationDao extends JpaRepository<TypeParticipation,Long> {




    TypeParticipation findByCode(String code);

    int deleteByCode(String code);



}
