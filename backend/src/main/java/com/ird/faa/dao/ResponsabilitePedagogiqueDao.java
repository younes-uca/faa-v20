package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ResponsabilitePedagogique;


@Repository
public interface ResponsabilitePedagogiqueDao extends JpaRepository<ResponsabilitePedagogique,Long> {





    List<ResponsabilitePedagogique> findByNiveauResponsabilitePedagogiqueCode(String code);
    int deleteByNiveauResponsabilitePedagogiqueCode(String code);

    List<ResponsabilitePedagogique> findByNiveauResponsabilitePedagogiqueId(Long id);

    int deleteByNiveauResponsabilitePedagogiqueId(Long id);
    List<ResponsabilitePedagogique> findByStatusCursusCode(String code);
    int deleteByStatusCursusCode(String code);

    List<ResponsabilitePedagogique> findByStatusCursusId(Long id);

    int deleteByStatusCursusId(Long id);
    List<ResponsabilitePedagogique> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<ResponsabilitePedagogique> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);

    List<ResponsabilitePedagogique> findByEnseignementEtFormationId(Long id);

    int deleteByEnseignementEtFormationId(Long id);


}
