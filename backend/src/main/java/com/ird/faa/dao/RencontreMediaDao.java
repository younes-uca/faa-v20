package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RencontreMedia;


@Repository
public interface RencontreMediaDao extends JpaRepository<RencontreMedia,Long> {





    List<RencontreMedia> findByFormatRencontreCode(String code);
    int deleteByFormatRencontreCode(String code);

    List<RencontreMedia> findByFormatRencontreId(Long id);

    int deleteByFormatRencontreId(Long id);

    List<RencontreMedia> findByCultureScientifiqueId(Long id);

    int deleteByCultureScientifiqueId(Long id);
    List<RencontreMedia> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<RencontreMedia> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);


}
