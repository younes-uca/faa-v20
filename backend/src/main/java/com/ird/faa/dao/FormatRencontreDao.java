package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.FormatRencontre;


@Repository
public interface FormatRencontreDao extends JpaRepository<FormatRencontre,Long> {




    FormatRencontre findByCode(String code);

    int deleteByCode(String code);



}
