package com.ird.faa.service.admin.facade;

import com.ird.faa.bean.DisciplineScientifique;
import com.ird.faa.bean.DisciplineScientifiqueErc;
import com.ird.faa.bean.KeyWord;

import java.util.List;

public interface KeyWordProviderAdminService {

    /*
     * cette methode permet de retourner la liste DisciplineScientifique
     */
    List<DisciplineScientifique> findAllDS();

    /*
     * the id is the DisciplineScientifique id Not the DisciplineScientifiqueErc
     */
    List<DisciplineScientifiqueErc> findAllDSErc(Long id);

    /*
     * the idDS is the DisciplineScientifique id
     * the idDS_Erc is the DisciplineScientifiqueErc id
     */
     List<KeyWord> findKeyWords(Long idErc);

}
