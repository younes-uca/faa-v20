package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EnjeuxIrdComiteEtCommissionEvaluationAdminService;

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
import com.ird.faa.bean.EnjeuxIrdComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.converter.EnjeuxIrdComiteEtCommissionEvaluationConverter;
import com.ird.faa.ws.rest.provided.vo.EnjeuxIrdComiteEtCommissionEvaluationVo;

@Api("Manages enjeuxIrdComiteEtCommissionEvaluation services")
@RestController
@RequestMapping("api/admin/enjeuxIrdComiteEtCommissionEvaluation")
public class EnjeuxIrdComiteEtCommissionEvaluationRestAdmin {

@Autowired
private EnjeuxIrdComiteEtCommissionEvaluationAdminService enjeuxIrdComiteEtCommissionEvaluationService;

@Autowired
private EnjeuxIrdComiteEtCommissionEvaluationConverter enjeuxIrdComiteEtCommissionEvaluationConverter;


            @ApiOperation("Updates the specified  enjeuxIrdComiteEtCommissionEvaluation")
            @PutMapping("/")
            public  EnjeuxIrdComiteEtCommissionEvaluationVo update(@RequestBody  EnjeuxIrdComiteEtCommissionEvaluationVo  enjeuxIrdComiteEtCommissionEvaluationVo){
            EnjeuxIrdComiteEtCommissionEvaluation enjeuxIrdComiteEtCommissionEvaluation = enjeuxIrdComiteEtCommissionEvaluationConverter.toItem(enjeuxIrdComiteEtCommissionEvaluationVo);
            enjeuxIrdComiteEtCommissionEvaluation = enjeuxIrdComiteEtCommissionEvaluationService.update(enjeuxIrdComiteEtCommissionEvaluation);
            return enjeuxIrdComiteEtCommissionEvaluationConverter.toVo(enjeuxIrdComiteEtCommissionEvaluation);
            }

    @ApiOperation("Finds a list of all enjeuxIrdComiteEtCommissionEvaluations")
    @GetMapping("/")
    public List<EnjeuxIrdComiteEtCommissionEvaluationVo> findAll(){
        return enjeuxIrdComiteEtCommissionEvaluationConverter.toVo(enjeuxIrdComiteEtCommissionEvaluationService.findAll());
    }

    @ApiOperation("Finds a enjeuxIrdComiteEtCommissionEvaluation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EnjeuxIrdComiteEtCommissionEvaluationVo findByIdWithAssociatedList(@PathVariable Long id){
    return enjeuxIrdComiteEtCommissionEvaluationConverter.toVo(enjeuxIrdComiteEtCommissionEvaluationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search enjeuxIrdComiteEtCommissionEvaluation by a specific criteria")
    @PostMapping("/search")
    public List<EnjeuxIrdComiteEtCommissionEvaluationVo> findByCriteria(@RequestBody EnjeuxIrdComiteEtCommissionEvaluationVo enjeuxIrdComiteEtCommissionEvaluationVo){
        return enjeuxIrdComiteEtCommissionEvaluationConverter.toVo(enjeuxIrdComiteEtCommissionEvaluationService.findByCriteria(enjeuxIrdComiteEtCommissionEvaluationVo));
        }

            @ApiOperation("Finds a enjeuxIrdComiteEtCommissionEvaluation by id")
            @GetMapping("/id/{id}")
            public EnjeuxIrdComiteEtCommissionEvaluationVo findById(@PathVariable Long id){
            return enjeuxIrdComiteEtCommissionEvaluationConverter.toVo(enjeuxIrdComiteEtCommissionEvaluationService.findById(id));
            }

            @ApiOperation("Saves the specified  enjeuxIrdComiteEtCommissionEvaluation")
            @PostMapping("/")
            public EnjeuxIrdComiteEtCommissionEvaluationVo save(@RequestBody EnjeuxIrdComiteEtCommissionEvaluationVo enjeuxIrdComiteEtCommissionEvaluationVo){
            EnjeuxIrdComiteEtCommissionEvaluation enjeuxIrdComiteEtCommissionEvaluation = enjeuxIrdComiteEtCommissionEvaluationConverter.toItem(enjeuxIrdComiteEtCommissionEvaluationVo);
            enjeuxIrdComiteEtCommissionEvaluation = enjeuxIrdComiteEtCommissionEvaluationService.save(enjeuxIrdComiteEtCommissionEvaluation);
            return enjeuxIrdComiteEtCommissionEvaluationConverter.toVo(enjeuxIrdComiteEtCommissionEvaluation);
            }

            @ApiOperation("Delete the specified enjeuxIrdComiteEtCommissionEvaluation")
            @DeleteMapping("/")
            public int delete(@RequestBody EnjeuxIrdComiteEtCommissionEvaluationVo enjeuxIrdComiteEtCommissionEvaluationVo){
            EnjeuxIrdComiteEtCommissionEvaluation enjeuxIrdComiteEtCommissionEvaluation = enjeuxIrdComiteEtCommissionEvaluationConverter.toItem(enjeuxIrdComiteEtCommissionEvaluationVo);
            return enjeuxIrdComiteEtCommissionEvaluationService.delete(enjeuxIrdComiteEtCommissionEvaluation);
            }

            @ApiOperation("Deletes a enjeuxIrdComiteEtCommissionEvaluation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return enjeuxIrdComiteEtCommissionEvaluationService.deleteById(id);
            }
        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<EnjeuxIrdComiteEtCommissionEvaluation> findByEnjeuxIrdCode(@PathVariable String code){
        return enjeuxIrdComiteEtCommissionEvaluationService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return enjeuxIrdComiteEtCommissionEvaluationService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<EnjeuxIrdComiteEtCommissionEvaluation> findByEnjeuxIrdId(@PathVariable Long id){
        return enjeuxIrdComiteEtCommissionEvaluationService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return enjeuxIrdComiteEtCommissionEvaluationService.deleteByEnjeuxIrdId(id);
        }

        @ApiOperation("find by comiteEtCommissionEvaluation id")
        @GetMapping("/comiteEtCommissionEvaluation/id/{id}")
        public List<EnjeuxIrdComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(@PathVariable Long id){
        return enjeuxIrdComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(id);
        }

        @ApiOperation("delete by comiteEtCommissionEvaluation id")
        @DeleteMapping("/comiteEtCommissionEvaluation/id/{id}")
        public int deleteByComiteEtCommissionEvaluationId(@PathVariable Long id){
        return enjeuxIrdComiteEtCommissionEvaluationService.deleteByComiteEtCommissionEvaluationId(id);
        }



            }
