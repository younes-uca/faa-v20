package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.TypeExpertiseEvaluationComiteEtCommissionEvaluationChercheurService;

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
import com.ird.faa.bean.TypeExpertiseEvaluationComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.converter.TypeExpertiseEvaluationComiteEtCommissionEvaluationConverter;
import com.ird.faa.ws.rest.provided.vo.TypeExpertiseEvaluationComiteEtCommissionEvaluationVo;

@Api("Manages typeExpertiseEvaluationComiteEtCommissionEvaluation services")
@RestController
@RequestMapping("api/chercheur/typeExpertiseEvaluationComiteEtCommissionEvaluation")
public class TypeExpertiseEvaluationComiteEtCommissionEvaluationRestChercheur {

@Autowired
private TypeExpertiseEvaluationComiteEtCommissionEvaluationChercheurService typeExpertiseEvaluationComiteEtCommissionEvaluationService;

@Autowired
private TypeExpertiseEvaluationComiteEtCommissionEvaluationConverter typeExpertiseEvaluationComiteEtCommissionEvaluationConverter;


            @ApiOperation("Updates the specified  typeExpertiseEvaluationComiteEtCommissionEvaluation")
            @PutMapping("/")
            public  TypeExpertiseEvaluationComiteEtCommissionEvaluationVo update(@RequestBody  TypeExpertiseEvaluationComiteEtCommissionEvaluationVo  typeExpertiseEvaluationComiteEtCommissionEvaluationVo){
            TypeExpertiseEvaluationComiteEtCommissionEvaluation typeExpertiseEvaluationComiteEtCommissionEvaluation = typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.toItem(typeExpertiseEvaluationComiteEtCommissionEvaluationVo);
            typeExpertiseEvaluationComiteEtCommissionEvaluation = typeExpertiseEvaluationComiteEtCommissionEvaluationService.update(typeExpertiseEvaluationComiteEtCommissionEvaluation);
            return typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.toVo(typeExpertiseEvaluationComiteEtCommissionEvaluation);
            }

    @ApiOperation("Finds a list of all typeExpertiseEvaluationComiteEtCommissionEvaluations")
    @GetMapping("/")
    public List<TypeExpertiseEvaluationComiteEtCommissionEvaluationVo> findAll(){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.toVo(typeExpertiseEvaluationComiteEtCommissionEvaluationService.findAll());
    }

    @ApiOperation("Finds a typeExpertiseEvaluationComiteEtCommissionEvaluation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeExpertiseEvaluationComiteEtCommissionEvaluationVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.toVo(typeExpertiseEvaluationComiteEtCommissionEvaluationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeExpertiseEvaluationComiteEtCommissionEvaluation by a specific criteria")
    @PostMapping("/search")
    public List<TypeExpertiseEvaluationComiteEtCommissionEvaluationVo> findByCriteria(@RequestBody TypeExpertiseEvaluationComiteEtCommissionEvaluationVo typeExpertiseEvaluationComiteEtCommissionEvaluationVo){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.toVo(typeExpertiseEvaluationComiteEtCommissionEvaluationService.findByCriteria(typeExpertiseEvaluationComiteEtCommissionEvaluationVo));
        }

            @ApiOperation("Finds a typeExpertiseEvaluationComiteEtCommissionEvaluation by id")
            @GetMapping("/id/{id}")
            public TypeExpertiseEvaluationComiteEtCommissionEvaluationVo findById(@PathVariable Long id){
            return typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.toVo(typeExpertiseEvaluationComiteEtCommissionEvaluationService.findById(id));
            }

            @ApiOperation("Saves the specified  typeExpertiseEvaluationComiteEtCommissionEvaluation")
            @PostMapping("/")
            public TypeExpertiseEvaluationComiteEtCommissionEvaluationVo save(@RequestBody TypeExpertiseEvaluationComiteEtCommissionEvaluationVo typeExpertiseEvaluationComiteEtCommissionEvaluationVo){
            TypeExpertiseEvaluationComiteEtCommissionEvaluation typeExpertiseEvaluationComiteEtCommissionEvaluation = typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.toItem(typeExpertiseEvaluationComiteEtCommissionEvaluationVo);
            typeExpertiseEvaluationComiteEtCommissionEvaluation = typeExpertiseEvaluationComiteEtCommissionEvaluationService.save(typeExpertiseEvaluationComiteEtCommissionEvaluation);
            return typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.toVo(typeExpertiseEvaluationComiteEtCommissionEvaluation);
            }

            @ApiOperation("Delete the specified typeExpertiseEvaluationComiteEtCommissionEvaluation")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeExpertiseEvaluationComiteEtCommissionEvaluationVo typeExpertiseEvaluationComiteEtCommissionEvaluationVo){
            TypeExpertiseEvaluationComiteEtCommissionEvaluation typeExpertiseEvaluationComiteEtCommissionEvaluation = typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.toItem(typeExpertiseEvaluationComiteEtCommissionEvaluationVo);
            return typeExpertiseEvaluationComiteEtCommissionEvaluationService.delete(typeExpertiseEvaluationComiteEtCommissionEvaluation);
            }

            @ApiOperation("Deletes a typeExpertiseEvaluationComiteEtCommissionEvaluation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeExpertiseEvaluationComiteEtCommissionEvaluationService.deleteById(id);
            }
        @ApiOperation("find by typeExpertiseEvaluation code")
        @GetMapping("/typeExpertiseEvaluation/code/{code}")
        public List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findByTypeExpertiseEvaluationCode(@PathVariable String code){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationService.findByTypeExpertiseEvaluationCode(code);
        }

        @ApiOperation("delete by typeExpertiseEvaluation code")
        @DeleteMapping("/typeExpertiseEvaluation/code/{code}")
        public int deleteByTypeExpertiseEvaluationCode(@PathVariable String code){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationService.deleteByTypeExpertiseEvaluationCode(code);
        }

        @ApiOperation("find by typeExpertiseEvaluation id")
        @GetMapping("/typeExpertiseEvaluation/id/{id}")
        public List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findByTypeExpertiseEvaluationId(@PathVariable Long id){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationService.findByTypeExpertiseEvaluationId(id);
        }

        @ApiOperation("delete by typeExpertiseEvaluation id")
        @DeleteMapping("/typeExpertiseEvaluation/id/{id}")
        public int deleteByTypeExpertiseEvaluationId(@PathVariable Long id){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationService.deleteByTypeExpertiseEvaluationId(id);
        }

        @ApiOperation("find by comiteEtCommissionEvaluation id")
        @GetMapping("/comiteEtCommissionEvaluation/id/{id}")
        public List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(@PathVariable Long id){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(id);
        }

        @ApiOperation("delete by comiteEtCommissionEvaluation id")
        @DeleteMapping("/comiteEtCommissionEvaluation/id/{id}")
        public int deleteByComiteEtCommissionEvaluationId(@PathVariable Long id){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationService.deleteByComiteEtCommissionEvaluationId(id);
        }



            }
