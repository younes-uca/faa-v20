package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.PaysRencontreMedia;


@Repository
public interface PaysRencontreMediaDao extends JpaRepository<PaysRencontreMedia,Long> {





    List<PaysRencontreMedia> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<PaysRencontreMedia> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<PaysRencontreMedia> findByRencontreMediaId(Long id);

    int deleteByRencontreMediaId(Long id);


}
