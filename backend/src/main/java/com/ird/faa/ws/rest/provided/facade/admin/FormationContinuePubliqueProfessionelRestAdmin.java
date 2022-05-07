package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.FormationContinuePubliqueProfessionelAdminService;

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
import com.ird.faa.bean.FormationContinuePubliqueProfessionel;
import com.ird.faa.ws.rest.provided.converter.FormationContinuePubliqueProfessionelConverter;
import com.ird.faa.ws.rest.provided.vo.FormationContinuePubliqueProfessionelVo;

@Api("Manages formationContinuePubliqueProfessionel services")
@RestController
@RequestMapping("api/admin/formationContinuePubliqueProfessionel")
public class FormationContinuePubliqueProfessionelRestAdmin {

@Autowired
private FormationContinuePubliqueProfessionelAdminService formationContinuePubliqueProfessionelService;

@Autowired
private FormationContinuePubliqueProfessionelConverter formationContinuePubliqueProfessionelConverter;


            @ApiOperation("Updates the specified  formationContinuePubliqueProfessionel")
            @PutMapping("/")
            public  FormationContinuePubliqueProfessionelVo update(@RequestBody  FormationContinuePubliqueProfessionelVo  formationContinuePubliqueProfessionelVo){
            FormationContinuePubliqueProfessionel formationContinuePubliqueProfessionel = formationContinuePubliqueProfessionelConverter.toItem(formationContinuePubliqueProfessionelVo);
            formationContinuePubliqueProfessionel = formationContinuePubliqueProfessionelService.update(formationContinuePubliqueProfessionel);
            return formationContinuePubliqueProfessionelConverter.toVo(formationContinuePubliqueProfessionel);
            }

    @ApiOperation("Finds a list of all formationContinuePubliqueProfessionels")
    @GetMapping("/")
    public List<FormationContinuePubliqueProfessionelVo> findAll(){
        return formationContinuePubliqueProfessionelConverter.toVo(formationContinuePubliqueProfessionelService.findAll());
    }

    @ApiOperation("Finds a formationContinuePubliqueProfessionel with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public FormationContinuePubliqueProfessionelVo findByIdWithAssociatedList(@PathVariable Long id){
    return formationContinuePubliqueProfessionelConverter.toVo(formationContinuePubliqueProfessionelService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search formationContinuePubliqueProfessionel by a specific criteria")
    @PostMapping("/search")
    public List<FormationContinuePubliqueProfessionelVo> findByCriteria(@RequestBody FormationContinuePubliqueProfessionelVo formationContinuePubliqueProfessionelVo){
        return formationContinuePubliqueProfessionelConverter.toVo(formationContinuePubliqueProfessionelService.findByCriteria(formationContinuePubliqueProfessionelVo));
        }

            @ApiOperation("Finds a formationContinuePubliqueProfessionel by id")
            @GetMapping("/id/{id}")
            public FormationContinuePubliqueProfessionelVo findById(@PathVariable Long id){
            return formationContinuePubliqueProfessionelConverter.toVo(formationContinuePubliqueProfessionelService.findById(id));
            }

            @ApiOperation("Saves the specified  formationContinuePubliqueProfessionel")
            @PostMapping("/")
            public FormationContinuePubliqueProfessionelVo save(@RequestBody FormationContinuePubliqueProfessionelVo formationContinuePubliqueProfessionelVo){
            FormationContinuePubliqueProfessionel formationContinuePubliqueProfessionel = formationContinuePubliqueProfessionelConverter.toItem(formationContinuePubliqueProfessionelVo);
            formationContinuePubliqueProfessionel = formationContinuePubliqueProfessionelService.save(formationContinuePubliqueProfessionel);
            return formationContinuePubliqueProfessionelConverter.toVo(formationContinuePubliqueProfessionel);
            }

            @ApiOperation("Delete the specified formationContinuePubliqueProfessionel")
            @DeleteMapping("/")
            public int delete(@RequestBody FormationContinuePubliqueProfessionelVo formationContinuePubliqueProfessionelVo){
            FormationContinuePubliqueProfessionel formationContinuePubliqueProfessionel = formationContinuePubliqueProfessionelConverter.toItem(formationContinuePubliqueProfessionelVo);
            return formationContinuePubliqueProfessionelService.delete(formationContinuePubliqueProfessionel);
            }

            @ApiOperation("Deletes a formationContinuePubliqueProfessionel by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return formationContinuePubliqueProfessionelService.deleteById(id);
            }
        @ApiOperation("find by formationContinue id")
        @GetMapping("/formationContinue/id/{id}")
        public List<FormationContinuePubliqueProfessionel> findByFormationContinueId(@PathVariable Long id){
        return formationContinuePubliqueProfessionelService.findByFormationContinueId(id);
        }

        @ApiOperation("delete by formationContinue id")
        @DeleteMapping("/formationContinue/id/{id}")
        public int deleteByFormationContinueId(@PathVariable Long id){
        return formationContinuePubliqueProfessionelService.deleteByFormationContinueId(id);
        }

        @ApiOperation("find by publiqueProfessionel id")
        @GetMapping("/publiqueProfessionel/id/{id}")
        public List<FormationContinuePubliqueProfessionel> findByPubliqueProfessionelId(@PathVariable Long id){
        return formationContinuePubliqueProfessionelService.findByPubliqueProfessionelId(id);
        }

        @ApiOperation("delete by publiqueProfessionel id")
        @DeleteMapping("/publiqueProfessionel/id/{id}")
        public int deleteByPubliqueProfessionelId(@PathVariable Long id){
        return formationContinuePubliqueProfessionelService.deleteByPubliqueProfessionelId(id);
        }



            }
