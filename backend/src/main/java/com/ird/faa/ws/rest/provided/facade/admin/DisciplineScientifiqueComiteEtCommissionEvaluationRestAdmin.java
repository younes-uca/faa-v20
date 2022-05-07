package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.DisciplineScientifiqueComiteEtCommissionEvaluationAdminService;

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
import com.ird.faa.bean.DisciplineScientifiqueComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.converter.DisciplineScientifiqueComiteEtCommissionEvaluationConverter;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueComiteEtCommissionEvaluationVo;

@Api("Manages disciplineScientifiqueComiteEtCommissionEvaluation services")
@RestController
@RequestMapping("api/admin/disciplineScientifiqueComiteEtCommissionEvaluation")
public class DisciplineScientifiqueComiteEtCommissionEvaluationRestAdmin {

@Autowired
private DisciplineScientifiqueComiteEtCommissionEvaluationAdminService disciplineScientifiqueComiteEtCommissionEvaluationService;

@Autowired
private DisciplineScientifiqueComiteEtCommissionEvaluationConverter disciplineScientifiqueComiteEtCommissionEvaluationConverter;


            @ApiOperation("Updates the specified  disciplineScientifiqueComiteEtCommissionEvaluation")
            @PutMapping("/")
            public  DisciplineScientifiqueComiteEtCommissionEvaluationVo update(@RequestBody  DisciplineScientifiqueComiteEtCommissionEvaluationVo  disciplineScientifiqueComiteEtCommissionEvaluationVo){
            DisciplineScientifiqueComiteEtCommissionEvaluation disciplineScientifiqueComiteEtCommissionEvaluation = disciplineScientifiqueComiteEtCommissionEvaluationConverter.toItem(disciplineScientifiqueComiteEtCommissionEvaluationVo);
            disciplineScientifiqueComiteEtCommissionEvaluation = disciplineScientifiqueComiteEtCommissionEvaluationService.update(disciplineScientifiqueComiteEtCommissionEvaluation);
            return disciplineScientifiqueComiteEtCommissionEvaluationConverter.toVo(disciplineScientifiqueComiteEtCommissionEvaluation);
            }

    @ApiOperation("Finds a list of all disciplineScientifiqueComiteEtCommissionEvaluations")
    @GetMapping("/")
    public List<DisciplineScientifiqueComiteEtCommissionEvaluationVo> findAll(){
        return disciplineScientifiqueComiteEtCommissionEvaluationConverter.toVo(disciplineScientifiqueComiteEtCommissionEvaluationService.findAll());
    }

    @ApiOperation("Finds a disciplineScientifiqueComiteEtCommissionEvaluation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public DisciplineScientifiqueComiteEtCommissionEvaluationVo findByIdWithAssociatedList(@PathVariable Long id){
    return disciplineScientifiqueComiteEtCommissionEvaluationConverter.toVo(disciplineScientifiqueComiteEtCommissionEvaluationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search disciplineScientifiqueComiteEtCommissionEvaluation by a specific criteria")
    @PostMapping("/search")
    public List<DisciplineScientifiqueComiteEtCommissionEvaluationVo> findByCriteria(@RequestBody DisciplineScientifiqueComiteEtCommissionEvaluationVo disciplineScientifiqueComiteEtCommissionEvaluationVo){
        return disciplineScientifiqueComiteEtCommissionEvaluationConverter.toVo(disciplineScientifiqueComiteEtCommissionEvaluationService.findByCriteria(disciplineScientifiqueComiteEtCommissionEvaluationVo));
        }

            @ApiOperation("Finds a disciplineScientifiqueComiteEtCommissionEvaluation by id")
            @GetMapping("/id/{id}")
            public DisciplineScientifiqueComiteEtCommissionEvaluationVo findById(@PathVariable Long id){
            return disciplineScientifiqueComiteEtCommissionEvaluationConverter.toVo(disciplineScientifiqueComiteEtCommissionEvaluationService.findById(id));
            }

            @ApiOperation("Saves the specified  disciplineScientifiqueComiteEtCommissionEvaluation")
            @PostMapping("/")
            public DisciplineScientifiqueComiteEtCommissionEvaluationVo save(@RequestBody DisciplineScientifiqueComiteEtCommissionEvaluationVo disciplineScientifiqueComiteEtCommissionEvaluationVo){
            DisciplineScientifiqueComiteEtCommissionEvaluation disciplineScientifiqueComiteEtCommissionEvaluation = disciplineScientifiqueComiteEtCommissionEvaluationConverter.toItem(disciplineScientifiqueComiteEtCommissionEvaluationVo);
            disciplineScientifiqueComiteEtCommissionEvaluation = disciplineScientifiqueComiteEtCommissionEvaluationService.save(disciplineScientifiqueComiteEtCommissionEvaluation);
            return disciplineScientifiqueComiteEtCommissionEvaluationConverter.toVo(disciplineScientifiqueComiteEtCommissionEvaluation);
            }

            @ApiOperation("Delete the specified disciplineScientifiqueComiteEtCommissionEvaluation")
            @DeleteMapping("/")
            public int delete(@RequestBody DisciplineScientifiqueComiteEtCommissionEvaluationVo disciplineScientifiqueComiteEtCommissionEvaluationVo){
            DisciplineScientifiqueComiteEtCommissionEvaluation disciplineScientifiqueComiteEtCommissionEvaluation = disciplineScientifiqueComiteEtCommissionEvaluationConverter.toItem(disciplineScientifiqueComiteEtCommissionEvaluationVo);
            return disciplineScientifiqueComiteEtCommissionEvaluationService.delete(disciplineScientifiqueComiteEtCommissionEvaluation);
            }

            @ApiOperation("Deletes a disciplineScientifiqueComiteEtCommissionEvaluation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return disciplineScientifiqueComiteEtCommissionEvaluationService.deleteById(id);
            }
        @ApiOperation("find by disciplineScientifique code")
        @GetMapping("/disciplineScientifique/code/{code}")
        public List<DisciplineScientifiqueComiteEtCommissionEvaluation> findByDisciplineScientifiqueCode(@PathVariable String code){
        return disciplineScientifiqueComiteEtCommissionEvaluationService.findByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("delete by disciplineScientifique code")
        @DeleteMapping("/disciplineScientifique/code/{code}")
        public int deleteByDisciplineScientifiqueCode(@PathVariable String code){
        return disciplineScientifiqueComiteEtCommissionEvaluationService.deleteByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("find by disciplineScientifique id")
        @GetMapping("/disciplineScientifique/id/{id}")
        public List<DisciplineScientifiqueComiteEtCommissionEvaluation> findByDisciplineScientifiqueId(@PathVariable Long id){
        return disciplineScientifiqueComiteEtCommissionEvaluationService.findByDisciplineScientifiqueId(id);
        }

        @ApiOperation("delete by disciplineScientifique id")
        @DeleteMapping("/disciplineScientifique/id/{id}")
        public int deleteByDisciplineScientifiqueId(@PathVariable Long id){
        return disciplineScientifiqueComiteEtCommissionEvaluationService.deleteByDisciplineScientifiqueId(id);
        }

        @ApiOperation("find by comiteEtCommissionEvaluation id")
        @GetMapping("/comiteEtCommissionEvaluation/id/{id}")
        public List<DisciplineScientifiqueComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(@PathVariable Long id){
        return disciplineScientifiqueComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(id);
        }

        @ApiOperation("delete by comiteEtCommissionEvaluation id")
        @DeleteMapping("/comiteEtCommissionEvaluation/id/{id}")
        public int deleteByComiteEtCommissionEvaluationId(@PathVariable Long id){
        return disciplineScientifiqueComiteEtCommissionEvaluationService.deleteByComiteEtCommissionEvaluationId(id);
        }



            }
