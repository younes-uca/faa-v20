package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ProjetActiviteRechercheDetailPays;


@Repository
public interface ProjetActiviteRechercheDetailPaysDao extends JpaRepository<ProjetActiviteRechercheDetailPays,Long> {





    List<ProjetActiviteRechercheDetailPays> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<ProjetActiviteRechercheDetailPays> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<ProjetActiviteRechercheDetailPays> findByProjetActiviteRechercheDetailId(Long id);

    int deleteByProjetActiviteRechercheDetailId(Long id);


}
