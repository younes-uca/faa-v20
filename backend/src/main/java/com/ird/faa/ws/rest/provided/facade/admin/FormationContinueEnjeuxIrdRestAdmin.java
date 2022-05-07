package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.FormationContinueEnjeuxIrdAdminService;

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
import com.ird.faa.bean.FormationContinueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.converter.FormationContinueEnjeuxIrdConverter;
import com.ird.faa.ws.rest.provided.vo.FormationContinueEnjeuxIrdVo;

@Api("Manages formationContinueEnjeuxIrd services")
@RestController
@RequestMapping("api/admin/formationContinueEnjeuxIrd")
public class FormationContinueEnjeuxIrdRestAdmin {

@Autowired
private FormationContinueEnjeuxIrdAdminService formationContinueEnjeuxIrdService;

@Autowired
private FormationContinueEnjeuxIrdConverter formationContinueEnjeuxIrdConverter;


            @ApiOperation("Updates the specified  formationContinueEnjeuxIrd")
            @PutMapping("/")
            public  FormationContinueEnjeuxIrdVo update(@RequestBody  FormationContinueEnjeuxIrdVo  formationContinueEnjeuxIrdVo){
            FormationContinueEnjeuxIrd formationContinueEnjeuxIrd = formationContinueEnjeuxIrdConverter.toItem(formationContinueEnjeuxIrdVo);
            formationContinueEnjeuxIrd = formationContinueEnjeuxIrdService.update(formationContinueEnjeuxIrd);
            return formationContinueEnjeuxIrdConverter.toVo(formationContinueEnjeuxIrd);
            }

    @ApiOperation("Finds a list of all formationContinueEnjeuxIrds")
    @GetMapping("/")
    public List<FormationContinueEnjeuxIrdVo> findAll(){
        return formationContinueEnjeuxIrdConverter.toVo(formationContinueEnjeuxIrdService.findAll());
    }

    @ApiOperation("Finds a formationContinueEnjeuxIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public FormationContinueEnjeuxIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return formationContinueEnjeuxIrdConverter.toVo(formationContinueEnjeuxIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search formationContinueEnjeuxIrd by a specific criteria")
    @PostMapping("/search")
    public List<FormationContinueEnjeuxIrdVo> findByCriteria(@RequestBody FormationContinueEnjeuxIrdVo formationContinueEnjeuxIrdVo){
        return formationContinueEnjeuxIrdConverter.toVo(formationContinueEnjeuxIrdService.findByCriteria(formationContinueEnjeuxIrdVo));
        }

            @ApiOperation("Finds a formationContinueEnjeuxIrd by id")
            @GetMapping("/id/{id}")
            public FormationContinueEnjeuxIrdVo findById(@PathVariable Long id){
            return formationContinueEnjeuxIrdConverter.toVo(formationContinueEnjeuxIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  formationContinueEnjeuxIrd")
            @PostMapping("/")
            public FormationContinueEnjeuxIrdVo save(@RequestBody FormationContinueEnjeuxIrdVo formationContinueEnjeuxIrdVo){
            FormationContinueEnjeuxIrd formationContinueEnjeuxIrd = formationContinueEnjeuxIrdConverter.toItem(formationContinueEnjeuxIrdVo);
            formationContinueEnjeuxIrd = formationContinueEnjeuxIrdService.save(formationContinueEnjeuxIrd);
            return formationContinueEnjeuxIrdConverter.toVo(formationContinueEnjeuxIrd);
            }

            @ApiOperation("Delete the specified formationContinueEnjeuxIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody FormationContinueEnjeuxIrdVo formationContinueEnjeuxIrdVo){
            FormationContinueEnjeuxIrd formationContinueEnjeuxIrd = formationContinueEnjeuxIrdConverter.toItem(formationContinueEnjeuxIrdVo);
            return formationContinueEnjeuxIrdService.delete(formationContinueEnjeuxIrd);
            }

            @ApiOperation("Deletes a formationContinueEnjeuxIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return formationContinueEnjeuxIrdService.deleteById(id);
            }
        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<FormationContinueEnjeuxIrd> findByEnjeuxIrdCode(@PathVariable String code){
        return formationContinueEnjeuxIrdService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return formationContinueEnjeuxIrdService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<FormationContinueEnjeuxIrd> findByEnjeuxIrdId(@PathVariable Long id){
        return formationContinueEnjeuxIrdService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return formationContinueEnjeuxIrdService.deleteByEnjeuxIrdId(id);
        }

        @ApiOperation("find by formationContinue id")
        @GetMapping("/formationContinue/id/{id}")
        public List<FormationContinueEnjeuxIrd> findByFormationContinueId(@PathVariable Long id){
        return formationContinueEnjeuxIrdService.findByFormationContinueId(id);
        }

        @ApiOperation("delete by formationContinue id")
        @DeleteMapping("/formationContinue/id/{id}")
        public int deleteByFormationContinueId(@PathVariable Long id){
        return formationContinueEnjeuxIrdService.deleteByFormationContinueId(id);
        }



            }
