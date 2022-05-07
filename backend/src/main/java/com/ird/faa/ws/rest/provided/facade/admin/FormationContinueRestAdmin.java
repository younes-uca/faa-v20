package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.FormationContinueAdminService;

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
import com.ird.faa.bean.FormationContinue;
import com.ird.faa.ws.rest.provided.converter.FormationContinueConverter;
import com.ird.faa.ws.rest.provided.vo.FormationContinueVo;

@Api("Manages formationContinue services")
@RestController
@RequestMapping("api/admin/formationContinue")
public class FormationContinueRestAdmin {

@Autowired
private FormationContinueAdminService formationContinueService;

@Autowired
private FormationContinueConverter formationContinueConverter;


            @ApiOperation("Updates the specified  formationContinue")
            @PutMapping("/")
            public  FormationContinueVo update(@RequestBody  FormationContinueVo  formationContinueVo){
            FormationContinue formationContinue = formationContinueConverter.toItem(formationContinueVo);
            formationContinue = formationContinueService.update(formationContinue);
            return formationContinueConverter.toVo(formationContinue);
            }

    @ApiOperation("Finds a list of all formationContinues")
    @GetMapping("/")
    public List<FormationContinueVo> findAll(){
        return formationContinueConverter.toVo(formationContinueService.findAll());
    }

    @ApiOperation("Finds a formationContinue with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public FormationContinueVo findByIdWithAssociatedList(@PathVariable Long id){
    return formationContinueConverter.toVo(formationContinueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search formationContinue by a specific criteria")
    @PostMapping("/search")
    public List<FormationContinueVo> findByCriteria(@RequestBody FormationContinueVo formationContinueVo){
        return formationContinueConverter.toVo(formationContinueService.findByCriteria(formationContinueVo));
        }

            @ApiOperation("Finds a formationContinue by id")
            @GetMapping("/id/{id}")
            public FormationContinueVo findById(@PathVariable Long id){
            return formationContinueConverter.toVo(formationContinueService.findById(id));
            }

            @ApiOperation("Saves the specified  formationContinue")
            @PostMapping("/")
            public FormationContinueVo save(@RequestBody FormationContinueVo formationContinueVo){
            FormationContinue formationContinue = formationContinueConverter.toItem(formationContinueVo);
            formationContinue = formationContinueService.save(formationContinue);
            return formationContinueConverter.toVo(formationContinue);
            }

            @ApiOperation("Delete the specified formationContinue")
            @DeleteMapping("/")
            public int delete(@RequestBody FormationContinueVo formationContinueVo){
            FormationContinue formationContinue = formationContinueConverter.toItem(formationContinueVo);
            return formationContinueService.delete(formationContinue);
            }

            @ApiOperation("Deletes a formationContinue by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return formationContinueService.deleteById(id);
            }
        @ApiOperation("find by modaliteFormationContinue code")
        @GetMapping("/modaliteFormationContinue/code/{code}")
        public List<FormationContinue> findByModaliteFormationContinueCode(@PathVariable String code){
        return formationContinueService.findByModaliteFormationContinueCode(code);
        }

        @ApiOperation("delete by modaliteFormationContinue code")
        @DeleteMapping("/modaliteFormationContinue/code/{code}")
        public int deleteByModaliteFormationContinueCode(@PathVariable String code){
        return formationContinueService.deleteByModaliteFormationContinueCode(code);
        }

        @ApiOperation("find by modaliteFormationContinue id")
        @GetMapping("/modaliteFormationContinue/id/{id}")
        public List<FormationContinue> findByModaliteFormationContinueId(@PathVariable Long id){
        return formationContinueService.findByModaliteFormationContinueId(id);
        }

        @ApiOperation("delete by modaliteFormationContinue id")
        @DeleteMapping("/modaliteFormationContinue/id/{id}")
        public int deleteByModaliteFormationContinueId(@PathVariable Long id){
        return formationContinueService.deleteByModaliteFormationContinueId(id);
        }

        @ApiOperation("find by enseignementEtFormation id")
        @GetMapping("/enseignementEtFormation/id/{id}")
        public List<FormationContinue> findByEnseignementEtFormationId(@PathVariable Long id){
        return formationContinueService.findByEnseignementEtFormationId(id);
        }

        @ApiOperation("delete by enseignementEtFormation id")
        @DeleteMapping("/enseignementEtFormation/id/{id}")
        public int deleteByEnseignementEtFormationId(@PathVariable Long id){
        return formationContinueService.deleteByEnseignementEtFormationId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<FormationContinue> findByEtatEtapeCampagneCode(@PathVariable String code){
        return formationContinueService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return formationContinueService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<FormationContinue> findByEtatEtapeCampagneId(@PathVariable Long id){
        return formationContinueService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return formationContinueService.deleteByEtatEtapeCampagneId(id);
        }



            }
