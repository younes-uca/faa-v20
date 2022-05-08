package com.ird.faa.service.admin.impl;

import com.ird.faa.bean.DisciplineScientifique;
import com.ird.faa.bean.DisciplineScientifiqueErc;
import com.ird.faa.bean.KeyWord;
import com.ird.faa.dao.DisciplineScientifiqueErcAssociationDao;
import com.ird.faa.dao.DisciplineScientifiqueErcDao;
import com.ird.faa.dao.KeyWordDao;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueAdminService;
import com.ird.faa.service.admin.facade.KeyWordProviderAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KeyWordProviderAdminServiceImpl implements KeyWordProviderAdminService {
    @Autowired
    private DisciplineScientifiqueAdminService disciplineScientifiqueAdminService;

    @Autowired
    private DisciplineScientifiqueErcAssociationDao disciplineScientifiqueErcAssociationDao;

    @Autowired
    private DisciplineScientifiqueErcDao disciplineScientifiqueErcDao;
    @Autowired
    private KeyWordDao keyWordDao;

    /*
     * telecharger la listes disciplineScientifique qui existent
     */
    @Override
    public List<DisciplineScientifique> findAllDS() {
        return disciplineScientifiqueAdminService.findAll();
    }

    /*
     * telecharger la liste de disciplineScientifiqueErc qui correspond a un disciplineScientifique
     */
    @Override
    public List<DisciplineScientifiqueErc> findAllDSErc(Long id) {
        List<Long> rest = disciplineScientifiqueErcAssociationDao.findByDisciplineScientifiqueid(id);
        return disciplineScientifiqueErcDao.findAllById(rest);

    }


    /*
     * telecharger la liste de KeyWords qui correspond a un disciplineScientifiqueErc
     */
    @Override
    public List<KeyWord> findKeyWords(Long idErc) {
        List<Long> rest = keyWordDao.findAllDSErc(idErc);
          return keyWordDao.findAllById(rest);
    }

}
