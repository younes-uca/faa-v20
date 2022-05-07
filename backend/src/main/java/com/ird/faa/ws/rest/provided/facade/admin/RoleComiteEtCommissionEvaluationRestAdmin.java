package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.RoleComiteEtCommissionEvaluationAdminService;

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
import com.ird.faa.bean.RoleComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.converter.RoleComiteEtCommissionEvaluationConverter;
import com.ird.faa.ws.rest.provided.vo.RoleComiteEtCommissionEvaluationVo;

@Api("Manages roleComiteEtCommissionEvaluation services")
@RestController
@RequestMapping("api/admin/roleComiteEtCommissionEvaluation")
public class RoleComiteEtCommissionEvaluationRestAdmin {

@Autowired
private RoleComiteEtCommissionEvaluationAdminService roleComiteEtCommissionEvaluationService;

@Autowired
private RoleComiteEtCommissionEvaluationConverter roleComiteEtCommissionEvaluationConverter;


            @ApiOperation("Updates the specified  roleComiteEtCommissionEvaluation")
            @PutMapping("/")
            public  RoleComiteEtCommissionEvaluationVo update(@RequestBody  RoleComiteEtCommissionEvaluationVo  roleComiteEtCommissionEvaluationVo){
            RoleComiteEtCommissionEvaluation roleComiteEtCommissionEvaluation = roleComiteEtCommissionEvaluationConverter.toItem(roleComiteEtCommissionEvaluationVo);
            roleComiteEtCommissionEvaluation = roleComiteEtCommissionEvaluationService.update(roleComiteEtCommissionEvaluation);
            return roleComiteEtCommissionEvaluationConverter.toVo(roleComiteEtCommissionEvaluation);
            }

    @ApiOperation("Finds a list of all roleComiteEtCommissionEvaluations")
    @GetMapping("/")
    public List<RoleComiteEtCommissionEvaluationVo> findAll(){
        return roleComiteEtCommissionEvaluationConverter.toVo(roleComiteEtCommissionEvaluationService.findAll());
    }

    @ApiOperation("Finds a roleComiteEtCommissionEvaluation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public RoleComiteEtCommissionEvaluationVo findByIdWithAssociatedList(@PathVariable Long id){
    return roleComiteEtCommissionEvaluationConverter.toVo(roleComiteEtCommissionEvaluationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search roleComiteEtCommissionEvaluation by a specific criteria")
    @PostMapping("/search")
    public List<RoleComiteEtCommissionEvaluationVo> findByCriteria(@RequestBody RoleComiteEtCommissionEvaluationVo roleComiteEtCommissionEvaluationVo){
        return roleComiteEtCommissionEvaluationConverter.toVo(roleComiteEtCommissionEvaluationService.findByCriteria(roleComiteEtCommissionEvaluationVo));
        }

            @ApiOperation("Finds a roleComiteEtCommissionEvaluation by id")
            @GetMapping("/id/{id}")
            public RoleComiteEtCommissionEvaluationVo findById(@PathVariable Long id){
            return roleComiteEtCommissionEvaluationConverter.toVo(roleComiteEtCommissionEvaluationService.findById(id));
            }

            @ApiOperation("Saves the specified  roleComiteEtCommissionEvaluation")
            @PostMapping("/")
            public RoleComiteEtCommissionEvaluationVo save(@RequestBody RoleComiteEtCommissionEvaluationVo roleComiteEtCommissionEvaluationVo){
            RoleComiteEtCommissionEvaluation roleComiteEtCommissionEvaluation = roleComiteEtCommissionEvaluationConverter.toItem(roleComiteEtCommissionEvaluationVo);
            roleComiteEtCommissionEvaluation = roleComiteEtCommissionEvaluationService.save(roleComiteEtCommissionEvaluation);
            return roleComiteEtCommissionEvaluationConverter.toVo(roleComiteEtCommissionEvaluation);
            }

            @ApiOperation("Delete the specified roleComiteEtCommissionEvaluation")
            @DeleteMapping("/")
            public int delete(@RequestBody RoleComiteEtCommissionEvaluationVo roleComiteEtCommissionEvaluationVo){
            RoleComiteEtCommissionEvaluation roleComiteEtCommissionEvaluation = roleComiteEtCommissionEvaluationConverter.toItem(roleComiteEtCommissionEvaluationVo);
            return roleComiteEtCommissionEvaluationService.delete(roleComiteEtCommissionEvaluation);
            }

            @ApiOperation("Deletes a roleComiteEtCommissionEvaluation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return roleComiteEtCommissionEvaluationService.deleteById(id);
            }
        @ApiOperation("find by roleEvaluation code")
        @GetMapping("/roleEvaluation/code/{code}")
        public List<RoleComiteEtCommissionEvaluation> findByRoleEvaluationCode(@PathVariable String code){
        return roleComiteEtCommissionEvaluationService.findByRoleEvaluationCode(code);
        }

        @ApiOperation("delete by roleEvaluation code")
        @DeleteMapping("/roleEvaluation/code/{code}")
        public int deleteByRoleEvaluationCode(@PathVariable String code){
        return roleComiteEtCommissionEvaluationService.deleteByRoleEvaluationCode(code);
        }

        @ApiOperation("find by roleEvaluation id")
        @GetMapping("/roleEvaluation/id/{id}")
        public List<RoleComiteEtCommissionEvaluation> findByRoleEvaluationId(@PathVariable Long id){
        return roleComiteEtCommissionEvaluationService.findByRoleEvaluationId(id);
        }

        @ApiOperation("delete by roleEvaluation id")
        @DeleteMapping("/roleEvaluation/id/{id}")
        public int deleteByRoleEvaluationId(@PathVariable Long id){
        return roleComiteEtCommissionEvaluationService.deleteByRoleEvaluationId(id);
        }

        @ApiOperation("find by comiteEtCommissionEvaluation id")
        @GetMapping("/comiteEtCommissionEvaluation/id/{id}")
        public List<RoleComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(@PathVariable Long id){
        return roleComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(id);
        }

        @ApiOperation("delete by comiteEtCommissionEvaluation id")
        @DeleteMapping("/comiteEtCommissionEvaluation/id/{id}")
        public int deleteByComiteEtCommissionEvaluationId(@PathVariable Long id){
        return roleComiteEtCommissionEvaluationService.deleteByComiteEtCommissionEvaluationId(id);
        }



            }
