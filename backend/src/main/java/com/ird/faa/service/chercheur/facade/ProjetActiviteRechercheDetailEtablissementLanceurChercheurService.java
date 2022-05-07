package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.ProjetActiviteRechercheDetailEtablissementLanceur;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailEtablissementLanceurVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ProjetActiviteRechercheDetailEtablissementLanceurChercheurService extends AbstractService<ProjetActiviteRechercheDetailEtablissementLanceur,Long,ProjetActiviteRechercheDetailEtablissementLanceurVo>{




/**
    * delete ProjetActiviteRechercheDetailEtablissementLanceur from database
    * @param id - id of ProjetActiviteRechercheDetailEtablissementLanceur to be deleted
    *
    */
    int deleteById(Long id);


    List<ProjetActiviteRechercheDetailEtablissementLanceur> findByEtablissementCode(String code);

    int deleteByEtablissementCode(String code);

    List<ProjetActiviteRechercheDetailEtablissementLanceur> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);

    List<ProjetActiviteRechercheDetailEtablissementLanceur> findByProjetActiviteRechercheDetailId(Long id);

    int deleteByProjetActiviteRechercheDetailId(Long id);







}
