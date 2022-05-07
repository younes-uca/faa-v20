package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Faq;


@Repository
public interface FaqDao extends JpaRepository<Faq,Long> {




    Faq findByOrdre(Integer ordre);

    int deleteByOrdre(Integer ordre);

    List<Faq> findByCategorieFaqOrdre(Integer ordre);
    int deleteByCategorieFaqOrdre(Integer ordre);

    List<Faq> findByCategorieFaqId(Long id);

    int deleteByCategorieFaqId(Long id);


}
