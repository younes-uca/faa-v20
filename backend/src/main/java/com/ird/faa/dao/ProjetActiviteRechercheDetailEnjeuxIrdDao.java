package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ProjetActiviteRechercheDetailEnjeuxIrd;


@Repository
public interface ProjetActiviteRechercheDetailEnjeuxIrdDao extends JpaRepository<ProjetActiviteRechercheDetailEnjeuxIrd,Long> {





    List<ProjetActiviteRechercheDetailEnjeuxIrd> findByEnjeuxIrdCode(String code);
    int deleteByEnjeuxIrdCode(String code);

    List<ProjetActiviteRechercheDetailEnjeuxIrd> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);

    List<ProjetActiviteRechercheDetailEnjeuxIrd> findByProjetActiviteRechercheDetailId(Long id);

    int deleteByProjetActiviteRechercheDetailId(Long id);


}
