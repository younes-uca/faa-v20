package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RencontreMediaEnjeuxIrd;


@Repository
public interface RencontreMediaEnjeuxIrdDao extends JpaRepository<RencontreMediaEnjeuxIrd,Long> {






    List<RencontreMediaEnjeuxIrd> findByRencontreMediaId(Long id);

    int deleteByRencontreMediaId(Long id);
    List<RencontreMediaEnjeuxIrd> findByEnjeuxIrdCode(String code);
    int deleteByEnjeuxIrdCode(String code);

    List<RencontreMediaEnjeuxIrd> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);


}
