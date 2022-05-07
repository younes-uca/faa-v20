package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.EtablissementComiteEtCommissionEvaluationChercheurService;

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
import com.ird.faa.bean.EtablissementComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.converter.EtablissementComiteEtCommissionEvaluationConverter;
import com.ird.faa.ws.rest.provided.vo.EtablissementComiteEtCommissionEvaluationVo;

@Api("Manages etablissementComiteEtCommissionEvaluation services")
@RestController
@RequestMapping("api/chercheur/etablissementComiteEtCommissionEvaluation")
public class EtablissementComiteEtCommissionEvaluationRestChercheur {

@Autowired
private EtablissementComiteEtCommissionEvaluationChercheurService etablissementComiteEtCommissionEvaluationService;

@Autowired
private EtablissementComiteEtCommissionEvaluationConverter etablissementComiteEtCommissionEvaluationConverter;


            @ApiOperation("Updates the specified  etablissementComiteEtCommissionEvaluation")
            @PutMapping("/")
            public  EtablissementComiteEtCommissionEvaluationVo update(@RequestBody  EtablissementComiteEtCommissionEvaluationVo  etablissementComiteEtCommissionEvaluationVo){
            EtablissementComiteEtCommissionEvaluation etablissementComiteEtCommissionEvaluation = etablissementComiteEtCommissionEvaluationConverter.toItem(etablissementComiteEtCommissionEvaluationVo);
            etablissementComiteEtCommissionEvaluation = etablissementComiteEtCommissionEvaluationService.update(etablissementComiteEtCommissionEvaluation);
            return etablissementComiteEtCommissionEvaluationConverter.toVo(etablissementComiteEtCommissionEvaluation);
            }

    @ApiOperation("Finds a list of all etablissementComiteEtCommissionEvaluations")
    @GetMapping("/")
    public List<EtablissementComiteEtCommissionEvaluationVo> findAll(){
        return etablissementComiteEtCommissionEvaluationConverter.toVo(etablissementComiteEtCommissionEvaluationService.findAll());
    }

    @ApiOperation("Finds a etablissementComiteEtCommissionEvaluation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EtablissementComiteEtCommissionEvaluationVo findByIdWithAssociatedList(@PathVariable Long id){
    return etablissementComiteEtCommissionEvaluationConverter.toVo(etablissementComiteEtCommissionEvaluationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search etablissementComiteEtCommissionEvaluation by a specific criteria")
    @PostMapping("/search")
    public List<EtablissementComiteEtCommissionEvaluationVo> findByCriteria(@RequestBody EtablissementComiteEtCommissionEvaluationVo etablissementComiteEtCommissionEvaluationVo){
        return etablissementComiteEtCommissionEvaluationConverter.toVo(etablissementComiteEtCommissionEvaluationService.findByCriteria(etablissementComiteEtCommissionEvaluationVo));
        }

            @ApiOperation("Finds a etablissementComiteEtCommissionEvaluation by id")
            @GetMapping("/id/{id}")
            public EtablissementComiteEtCommissionEvaluationVo findById(@PathVariable Long id){
            return etablissementComiteEtCommissionEvaluationConverter.toVo(etablissementComiteEtCommissionEvaluationService.findById(id));
            }

            @ApiOperation("Saves the specified  etablissementComiteEtCommissionEvaluation")
            @PostMapping("/")
            public EtablissementComiteEtCommissionEvaluationVo save(@RequestBody EtablissementComiteEtCommissionEvaluationVo etablissementComiteEtCommissionEvaluationVo){
            EtablissementComiteEtCommissionEvaluation etablissementComiteEtCommissionEvaluation = etablissementComiteEtCommissionEvaluationConverter.toItem(etablissementComiteEtCommissionEvaluationVo);
            etablissementComiteEtCommissionEvaluation = etablissementComiteEtCommissionEvaluationService.save(etablissementComiteEtCommissionEvaluation);
            return etablissementComiteEtCommissionEvaluationConverter.toVo(etablissementComiteEtCommissionEvaluation);
            }

            @ApiOperation("Delete the specified etablissementComiteEtCommissionEvaluation")
            @DeleteMapping("/")
            public int delete(@RequestBody EtablissementComiteEtCommissionEvaluationVo etablissementComiteEtCommissionEvaluationVo){
            EtablissementComiteEtCommissionEvaluation etablissementComiteEtCommissionEvaluation = etablissementComiteEtCommissionEvaluationConverter.toItem(etablissementComiteEtCommissionEvaluationVo);
            return etablissementComiteEtCommissionEvaluationService.delete(etablissementComiteEtCommissionEvaluation);
            }

            @ApiOperation("Deletes a etablissementComiteEtCommissionEvaluation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return etablissementComiteEtCommissionEvaluationService.deleteById(id);
            }
        @ApiOperation("find by etablissement code")
        @GetMapping("/etablissement/code/{code}")
        public List<EtablissementComiteEtCommissionEvaluation> findByEtablissementCode(@PathVariable String code){
        return etablissementComiteEtCommissionEvaluationService.findByEtablissementCode(code);
        }

        @ApiOperation("delete by etablissement code")
        @DeleteMapping("/etablissement/code/{code}")
        public int deleteByEtablissementCode(@PathVariable String code){
        return etablissementComiteEtCommissionEvaluationService.deleteByEtablissementCode(code);
        }

        @ApiOperation("find by etablissement id")
        @GetMapping("/etablissement/id/{id}")
        public List<EtablissementComiteEtCommissionEvaluation> findByEtablissementId(@PathVariable Long id){
        return etablissementComiteEtCommissionEvaluationService.findByEtablissementId(id);
        }

        @ApiOperation("delete by etablissement id")
        @DeleteMapping("/etablissement/id/{id}")
        public int deleteByEtablissementId(@PathVariable Long id){
        return etablissementComiteEtCommissionEvaluationService.deleteByEtablissementId(id);
        }

        @ApiOperation("find by comiteEtCommissionEvaluation id")
        @GetMapping("/comiteEtCommissionEvaluation/id/{id}")
        public List<EtablissementComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(@PathVariable Long id){
        return etablissementComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(id);
        }

        @ApiOperation("delete by comiteEtCommissionEvaluation id")
        @DeleteMapping("/comiteEtCommissionEvaluation/id/{id}")
        public int deleteByComiteEtCommissionEvaluationId(@PathVariable Long id){
        return etablissementComiteEtCommissionEvaluationService.deleteByComiteEtCommissionEvaluationId(id);
        }



            }
