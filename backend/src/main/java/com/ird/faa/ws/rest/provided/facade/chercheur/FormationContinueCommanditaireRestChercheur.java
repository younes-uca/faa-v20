package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.FormationContinueCommanditaireChercheurService;

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
import com.ird.faa.bean.FormationContinueCommanditaire;
import com.ird.faa.ws.rest.provided.converter.FormationContinueCommanditaireConverter;
import com.ird.faa.ws.rest.provided.vo.FormationContinueCommanditaireVo;

@Api("Manages formationContinueCommanditaire services")
@RestController
@RequestMapping("api/chercheur/formationContinueCommanditaire")
public class FormationContinueCommanditaireRestChercheur {

@Autowired
private FormationContinueCommanditaireChercheurService formationContinueCommanditaireService;

@Autowired
private FormationContinueCommanditaireConverter formationContinueCommanditaireConverter;


            @ApiOperation("Updates the specified  formationContinueCommanditaire")
            @PutMapping("/")
            public  FormationContinueCommanditaireVo update(@RequestBody  FormationContinueCommanditaireVo  formationContinueCommanditaireVo){
            FormationContinueCommanditaire formationContinueCommanditaire = formationContinueCommanditaireConverter.toItem(formationContinueCommanditaireVo);
            formationContinueCommanditaire = formationContinueCommanditaireService.update(formationContinueCommanditaire);
            return formationContinueCommanditaireConverter.toVo(formationContinueCommanditaire);
            }

    @ApiOperation("Finds a list of all formationContinueCommanditaires")
    @GetMapping("/")
    public List<FormationContinueCommanditaireVo> findAll(){
        return formationContinueCommanditaireConverter.toVo(formationContinueCommanditaireService.findAll());
    }

    @ApiOperation("Finds a formationContinueCommanditaire with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public FormationContinueCommanditaireVo findByIdWithAssociatedList(@PathVariable Long id){
    return formationContinueCommanditaireConverter.toVo(formationContinueCommanditaireService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search formationContinueCommanditaire by a specific criteria")
    @PostMapping("/search")
    public List<FormationContinueCommanditaireVo> findByCriteria(@RequestBody FormationContinueCommanditaireVo formationContinueCommanditaireVo){
        return formationContinueCommanditaireConverter.toVo(formationContinueCommanditaireService.findByCriteria(formationContinueCommanditaireVo));
        }

            @ApiOperation("Finds a formationContinueCommanditaire by id")
            @GetMapping("/id/{id}")
            public FormationContinueCommanditaireVo findById(@PathVariable Long id){
            return formationContinueCommanditaireConverter.toVo(formationContinueCommanditaireService.findById(id));
            }

            @ApiOperation("Saves the specified  formationContinueCommanditaire")
            @PostMapping("/")
            public FormationContinueCommanditaireVo save(@RequestBody FormationContinueCommanditaireVo formationContinueCommanditaireVo){
            FormationContinueCommanditaire formationContinueCommanditaire = formationContinueCommanditaireConverter.toItem(formationContinueCommanditaireVo);
            formationContinueCommanditaire = formationContinueCommanditaireService.save(formationContinueCommanditaire);
            return formationContinueCommanditaireConverter.toVo(formationContinueCommanditaire);
            }

            @ApiOperation("Delete the specified formationContinueCommanditaire")
            @DeleteMapping("/")
            public int delete(@RequestBody FormationContinueCommanditaireVo formationContinueCommanditaireVo){
            FormationContinueCommanditaire formationContinueCommanditaire = formationContinueCommanditaireConverter.toItem(formationContinueCommanditaireVo);
            return formationContinueCommanditaireService.delete(formationContinueCommanditaire);
            }

            @ApiOperation("Deletes a formationContinueCommanditaire by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return formationContinueCommanditaireService.deleteById(id);
            }
        @ApiOperation("find by commanditaire code")
        @GetMapping("/commanditaire/code/{code}")
        public List<FormationContinueCommanditaire> findByCommanditaireCode(@PathVariable String code){
        return formationContinueCommanditaireService.findByCommanditaireCode(code);
        }

        @ApiOperation("delete by commanditaire code")
        @DeleteMapping("/commanditaire/code/{code}")
        public int deleteByCommanditaireCode(@PathVariable String code){
        return formationContinueCommanditaireService.deleteByCommanditaireCode(code);
        }

        @ApiOperation("find by commanditaire id")
        @GetMapping("/commanditaire/id/{id}")
        public List<FormationContinueCommanditaire> findByCommanditaireId(@PathVariable Long id){
        return formationContinueCommanditaireService.findByCommanditaireId(id);
        }

        @ApiOperation("delete by commanditaire id")
        @DeleteMapping("/commanditaire/id/{id}")
        public int deleteByCommanditaireId(@PathVariable Long id){
        return formationContinueCommanditaireService.deleteByCommanditaireId(id);
        }

        @ApiOperation("find by formationContinue id")
        @GetMapping("/formationContinue/id/{id}")
        public List<FormationContinueCommanditaire> findByFormationContinueId(@PathVariable Long id){
        return formationContinueCommanditaireService.findByFormationContinueId(id);
        }

        @ApiOperation("delete by formationContinue id")
        @DeleteMapping("/formationContinue/id/{id}")
        public int deleteByFormationContinueId(@PathVariable Long id){
        return formationContinueCommanditaireService.deleteByFormationContinueId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<FormationContinueCommanditaire> findByPaysCode(@PathVariable String code){
        return formationContinueCommanditaireService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return formationContinueCommanditaireService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<FormationContinueCommanditaire> findByPaysId(@PathVariable Long id){
        return formationContinueCommanditaireService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return formationContinueCommanditaireService.deleteByPaysId(id);
        }



            }
