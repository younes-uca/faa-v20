package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ProjetActiviteRechercheDetail;


@Repository
public interface ProjetActiviteRechercheDetailDao extends JpaRepository<ProjetActiviteRechercheDetail,Long> {





    List<ProjetActiviteRechercheDetail> findByStatusProjetCode(String code);
    int deleteByStatusProjetCode(String code);

    List<ProjetActiviteRechercheDetail> findByStatusProjetId(Long id);

    int deleteByStatusProjetId(Long id);
    List<ProjetActiviteRechercheDetail> findByRoleProjetCode(String code);
    int deleteByRoleProjetCode(String code);

    List<ProjetActiviteRechercheDetail> findByRoleProjetId(Long id);

    int deleteByRoleProjetId(Long id);
    List<ProjetActiviteRechercheDetail> findByEtablissementCode(String code);
    int deleteByEtablissementCode(String code);

    List<ProjetActiviteRechercheDetail> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);
    List<ProjetActiviteRechercheDetail> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<ProjetActiviteRechercheDetail> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<ProjetActiviteRechercheDetail> findByProjetActiviteRechercheId(Long id);

    int deleteByProjetActiviteRechercheId(Long id);
    List<ProjetActiviteRechercheDetail> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<ProjetActiviteRechercheDetail> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);


}
