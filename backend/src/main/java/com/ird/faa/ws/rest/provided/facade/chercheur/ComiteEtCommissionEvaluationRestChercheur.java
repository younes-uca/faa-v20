package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ComiteEtCommissionEvaluationChercheurService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.ird.faa.bean.ComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.converter.ComiteEtCommissionEvaluationConverter;
import com.ird.faa.ws.rest.provided.vo.ComiteEtCommissionEvaluationVo;

@Api("Manages comiteEtCommissionEvaluation services")
@RestController
@RequestMapping("api/chercheur/comiteEtCommissionEvaluation")
public class ComiteEtCommissionEvaluationRestChercheur {

@Autowired
private ComiteEtCommissionEvaluationChercheurService comiteEtCommissionEvaluationService;

@Autowired
private ComiteEtCommissionEvaluationConverter comiteEtCommissionEvaluationConverter;


            @ApiOperation("Updates the specified  comiteEtCommissionEvaluation")
            @PutMapping("/")
            public  ComiteEtCommissionEvaluationVo update(@RequestBody  ComiteEtCommissionEvaluationVo  comiteEtCommissionEvaluationVo){
            ComiteEtCommissionEvaluation comiteEtCommissionEvaluation = comiteEtCommissionEvaluationConverter.toItem(comiteEtCommissionEvaluationVo);
            comiteEtCommissionEvaluation = comiteEtCommissionEvaluationService.update(comiteEtCommissionEvaluation);
            return comiteEtCommissionEvaluationConverter.toVo(comiteEtCommissionEvaluation);
            }

    @ApiOperation("Finds a list of all comiteEtCommissionEvaluations")
    @GetMapping("/")
    public List<ComiteEtCommissionEvaluationVo> findAll(){
        return comiteEtCommissionEvaluationConverter.toVo(comiteEtCommissionEvaluationService.findAll());
    }

    @ApiOperation("Finds a comiteEtCommissionEvaluation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ComiteEtCommissionEvaluationVo findByIdWithAssociatedList(@PathVariable Long id){
    return comiteEtCommissionEvaluationConverter.toVo(comiteEtCommissionEvaluationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search comiteEtCommissionEvaluation by a specific criteria")
    @PostMapping("/search")
    public List<ComiteEtCommissionEvaluationVo> findByCriteria(@RequestBody ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo){
        return comiteEtCommissionEvaluationConverter.toVo(comiteEtCommissionEvaluationService.findByCriteria(comiteEtCommissionEvaluationVo));
        }

            @ApiOperation("Finds a comiteEtCommissionEvaluation by id")
            @GetMapping("/id/{id}")
            public ComiteEtCommissionEvaluationVo findById(@PathVariable Long id){
            return comiteEtCommissionEvaluationConverter.toVo(comiteEtCommissionEvaluationService.findById(id));
            }

            @ApiOperation("Saves the specified  comiteEtCommissionEvaluation")
            @PostMapping("/")
            public ComiteEtCommissionEvaluationVo save(@RequestBody ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo){
            ComiteEtCommissionEvaluation comiteEtCommissionEvaluation = comiteEtCommissionEvaluationConverter.toItem(comiteEtCommissionEvaluationVo);
            comiteEtCommissionEvaluation = comiteEtCommissionEvaluationService.save(comiteEtCommissionEvaluation);
            return comiteEtCommissionEvaluationConverter.toVo(comiteEtCommissionEvaluation);
            }

            @ApiOperation("Delete the specified comiteEtCommissionEvaluation")
            @DeleteMapping("/")
            public int delete(@RequestBody ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo){
            ComiteEtCommissionEvaluation comiteEtCommissionEvaluation = comiteEtCommissionEvaluationConverter.toItem(comiteEtCommissionEvaluationVo);
            return comiteEtCommissionEvaluationService.delete(comiteEtCommissionEvaluation);
            }

            @ApiOperation("Deletes a comiteEtCommissionEvaluation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return comiteEtCommissionEvaluationService.deleteById(id);
            }
        @ApiOperation("find by natureExpertise code")
        @GetMapping("/natureExpertise/code/{code}")
        public List<ComiteEtCommissionEvaluation> findByNatureExpertiseCode(@PathVariable String code){
        return comiteEtCommissionEvaluationService.findByNatureExpertiseCode(code);
        }

        @ApiOperation("delete by natureExpertise code")
        @DeleteMapping("/natureExpertise/code/{code}")
        public int deleteByNatureExpertiseCode(@PathVariable String code){
        return comiteEtCommissionEvaluationService.deleteByNatureExpertiseCode(code);
        }

        @ApiOperation("find by natureExpertise id")
        @GetMapping("/natureExpertise/id/{id}")
        public List<ComiteEtCommissionEvaluation> findByNatureExpertiseId(@PathVariable Long id){
        return comiteEtCommissionEvaluationService.findByNatureExpertiseId(id);
        }

        @ApiOperation("delete by natureExpertise id")
        @DeleteMapping("/natureExpertise/id/{id}")
        public int deleteByNatureExpertiseId(@PathVariable Long id){
        return comiteEtCommissionEvaluationService.deleteByNatureExpertiseId(id);
        }

        @ApiOperation("find by expertise id")
        @GetMapping("/expertise/id/{id}")
        public List<ComiteEtCommissionEvaluation> findByExpertiseId(@PathVariable Long id){
        return comiteEtCommissionEvaluationService.findByExpertiseId(id);
        }

        @ApiOperation("delete by expertise id")
        @DeleteMapping("/expertise/id/{id}")
        public int deleteByExpertiseId(@PathVariable Long id){
        return comiteEtCommissionEvaluationService.deleteByExpertiseId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<ComiteEtCommissionEvaluation> findByEtatEtapeCampagneCode(@PathVariable String code){
        return comiteEtCommissionEvaluationService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return comiteEtCommissionEvaluationService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<ComiteEtCommissionEvaluation> findByEtatEtapeCampagneId(@PathVariable Long id){
        return comiteEtCommissionEvaluationService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return comiteEtCommissionEvaluationService.deleteByEtatEtapeCampagneId(id);
        }


            @GetMapping("/username/{username}/id/{compagneId}")
            public List<ComiteEtCommissionEvaluationVo> findByChercheurUsernameAndCampagneId(@PathVariable String username,@PathVariable Long compagneId){
            return comiteEtCommissionEvaluationConverter.toVo(comiteEtCommissionEvaluationService.findByChercheurUsernameAndCampagneId(username,compagneId));
            }

            }
