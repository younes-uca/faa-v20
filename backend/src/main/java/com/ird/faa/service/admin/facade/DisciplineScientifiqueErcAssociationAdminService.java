package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.DisciplineScientifiqueErcAssociation;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueErcAssociationVo;
import com.ird.faa.service.core.facade.AbstractService;
import org.springframework.data.jpa.repository.Query;

public interface DisciplineScientifiqueErcAssociationAdminService extends AbstractService<DisciplineScientifiqueErcAssociation,Long,DisciplineScientifiqueErcAssociationVo>{




/**
    * delete DisciplineScientifiqueErcAssociation from database
    * @param id - id of DisciplineScientifiqueErcAssociation to be deleted
    *
    */
    int deleteById(Long id);

//    @Query("SELECT ")


    List<DisciplineScientifiqueErcAssociation> findByDisciplineScientifiqueErcCode(String code);

    int deleteByDisciplineScientifiqueErcCode(String code);

    List<DisciplineScientifiqueErcAssociation> findByDisciplineScientifiqueErcId(Long id);

    int deleteByDisciplineScientifiqueErcId(Long id);
    List<DisciplineScientifiqueErcAssociation> findByDisciplineScientifiqueCode(String code);

    int deleteByDisciplineScientifiqueCode(String code);

    List<DisciplineScientifiqueErcAssociation> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);
    List<DisciplineScientifiqueErcAssociation> findBySemanticRelationshipCode(String code);

    int deleteBySemanticRelationshipCode(String code);

    List<DisciplineScientifiqueErcAssociation> findBySemanticRelationshipId(Long id);

    int deleteBySemanticRelationshipId(Long id);






    DisciplineScientifiqueErcAssociation archiver(DisciplineScientifiqueErcAssociation disciplineScientifiqueErcAssociation) ;
    DisciplineScientifiqueErcAssociation desarchiver(DisciplineScientifiqueErcAssociation disciplineScientifiqueErcAssociation);

}
