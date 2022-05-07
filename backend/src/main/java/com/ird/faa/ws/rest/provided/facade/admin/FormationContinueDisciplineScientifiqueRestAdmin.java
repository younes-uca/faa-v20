package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.FormationContinueDisciplineScientifiqueAdminService;

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
import com.ird.faa.bean.FormationContinueDisciplineScientifique;
import com.ird.faa.ws.rest.provided.converter.FormationContinueDisciplineScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.FormationContinueDisciplineScientifiqueVo;

@Api("Manages formationContinueDisciplineScientifique services")
@RestController
@RequestMapping("api/admin/formationContinueDisciplineScientifique")
public class FormationContinueDisciplineScientifiqueRestAdmin {

@Autowired
private FormationContinueDisciplineScientifiqueAdminService formationContinueDisciplineScientifiqueService;

@Autowired
private FormationContinueDisciplineScientifiqueConverter formationContinueDisciplineScientifiqueConverter;


            @ApiOperation("Updates the specified  formationContinueDisciplineScientifique")
            @PutMapping("/")
            public  FormationContinueDisciplineScientifiqueVo update(@RequestBody  FormationContinueDisciplineScientifiqueVo  formationContinueDisciplineScientifiqueVo){
            FormationContinueDisciplineScientifique formationContinueDisciplineScientifique = formationContinueDisciplineScientifiqueConverter.toItem(formationContinueDisciplineScientifiqueVo);
            formationContinueDisciplineScientifique = formationContinueDisciplineScientifiqueService.update(formationContinueDisciplineScientifique);
            return formationContinueDisciplineScientifiqueConverter.toVo(formationContinueDisciplineScientifique);
            }

    @ApiOperation("Finds a list of all formationContinueDisciplineScientifiques")
    @GetMapping("/")
    public List<FormationContinueDisciplineScientifiqueVo> findAll(){
        return formationContinueDisciplineScientifiqueConverter.toVo(formationContinueDisciplineScientifiqueService.findAll());
    }

    @ApiOperation("Finds a formationContinueDisciplineScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public FormationContinueDisciplineScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return formationContinueDisciplineScientifiqueConverter.toVo(formationContinueDisciplineScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search formationContinueDisciplineScientifique by a specific criteria")
    @PostMapping("/search")
    public List<FormationContinueDisciplineScientifiqueVo> findByCriteria(@RequestBody FormationContinueDisciplineScientifiqueVo formationContinueDisciplineScientifiqueVo){
        return formationContinueDisciplineScientifiqueConverter.toVo(formationContinueDisciplineScientifiqueService.findByCriteria(formationContinueDisciplineScientifiqueVo));
        }

            @ApiOperation("Finds a formationContinueDisciplineScientifique by id")
            @GetMapping("/id/{id}")
            public FormationContinueDisciplineScientifiqueVo findById(@PathVariable Long id){
            return formationContinueDisciplineScientifiqueConverter.toVo(formationContinueDisciplineScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  formationContinueDisciplineScientifique")
            @PostMapping("/")
            public FormationContinueDisciplineScientifiqueVo save(@RequestBody FormationContinueDisciplineScientifiqueVo formationContinueDisciplineScientifiqueVo){
            FormationContinueDisciplineScientifique formationContinueDisciplineScientifique = formationContinueDisciplineScientifiqueConverter.toItem(formationContinueDisciplineScientifiqueVo);
            formationContinueDisciplineScientifique = formationContinueDisciplineScientifiqueService.save(formationContinueDisciplineScientifique);
            return formationContinueDisciplineScientifiqueConverter.toVo(formationContinueDisciplineScientifique);
            }

            @ApiOperation("Delete the specified formationContinueDisciplineScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody FormationContinueDisciplineScientifiqueVo formationContinueDisciplineScientifiqueVo){
            FormationContinueDisciplineScientifique formationContinueDisciplineScientifique = formationContinueDisciplineScientifiqueConverter.toItem(formationContinueDisciplineScientifiqueVo);
            return formationContinueDisciplineScientifiqueService.delete(formationContinueDisciplineScientifique);
            }

            @ApiOperation("Deletes a formationContinueDisciplineScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return formationContinueDisciplineScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by formationContinue id")
        @GetMapping("/formationContinue/id/{id}")
        public List<FormationContinueDisciplineScientifique> findByFormationContinueId(@PathVariable Long id){
        return formationContinueDisciplineScientifiqueService.findByFormationContinueId(id);
        }

        @ApiOperation("delete by formationContinue id")
        @DeleteMapping("/formationContinue/id/{id}")
        public int deleteByFormationContinueId(@PathVariable Long id){
        return formationContinueDisciplineScientifiqueService.deleteByFormationContinueId(id);
        }

        @ApiOperation("find by disciplineScientifique code")
        @GetMapping("/disciplineScientifique/code/{code}")
        public List<FormationContinueDisciplineScientifique> findByDisciplineScientifiqueCode(@PathVariable String code){
        return formationContinueDisciplineScientifiqueService.findByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("delete by disciplineScientifique code")
        @DeleteMapping("/disciplineScientifique/code/{code}")
        public int deleteByDisciplineScientifiqueCode(@PathVariable String code){
        return formationContinueDisciplineScientifiqueService.deleteByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("find by disciplineScientifique id")
        @GetMapping("/disciplineScientifique/id/{id}")
        public List<FormationContinueDisciplineScientifique> findByDisciplineScientifiqueId(@PathVariable Long id){
        return formationContinueDisciplineScientifiqueService.findByDisciplineScientifiqueId(id);
        }

        @ApiOperation("delete by disciplineScientifique id")
        @DeleteMapping("/disciplineScientifique/id/{id}")
        public int deleteByDisciplineScientifiqueId(@PathVariable Long id){
        return formationContinueDisciplineScientifiqueService.deleteByDisciplineScientifiqueId(id);
        }



            }
