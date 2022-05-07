package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueEtablissementChercheurService;

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
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueEtablissement;
import com.ird.faa.ws.rest.provided.converter.DeveloppementDeSavoirEtInnovationScientifiqueEtablissementConverter;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo;

@Api("Manages developpementDeSavoirEtInnovationScientifiqueEtablissement services")
@RestController
@RequestMapping("api/chercheur/developpementDeSavoirEtInnovationScientifiqueEtablissement")
public class DeveloppementDeSavoirEtInnovationScientifiqueEtablissementRestChercheur {

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueEtablissementChercheurService developpementDeSavoirEtInnovationScientifiqueEtablissementService;

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueEtablissementConverter developpementDeSavoirEtInnovationScientifiqueEtablissementConverter;


            @ApiOperation("Updates the specified  developpementDeSavoirEtInnovationScientifiqueEtablissement")
            @PutMapping("/")
            public  DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo update(@RequestBody  DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo  developpementDeSavoirEtInnovationScientifiqueEtablissementVo){
            DeveloppementDeSavoirEtInnovationScientifiqueEtablissement developpementDeSavoirEtInnovationScientifiqueEtablissement = developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.toItem(developpementDeSavoirEtInnovationScientifiqueEtablissementVo);
            developpementDeSavoirEtInnovationScientifiqueEtablissement = developpementDeSavoirEtInnovationScientifiqueEtablissementService.update(developpementDeSavoirEtInnovationScientifiqueEtablissement);
            return developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.toVo(developpementDeSavoirEtInnovationScientifiqueEtablissement);
            }

    @ApiOperation("Finds a list of all developpementDeSavoirEtInnovationScientifiqueEtablissements")
    @GetMapping("/")
    public List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo> findAll(){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.toVo(developpementDeSavoirEtInnovationScientifiqueEtablissementService.findAll());
    }

    @ApiOperation("Finds a developpementDeSavoirEtInnovationScientifiqueEtablissement with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo findByIdWithAssociatedList(@PathVariable Long id){
    return developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.toVo(developpementDeSavoirEtInnovationScientifiqueEtablissementService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search developpementDeSavoirEtInnovationScientifiqueEtablissement by a specific criteria")
    @PostMapping("/search")
    public List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo> findByCriteria(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo developpementDeSavoirEtInnovationScientifiqueEtablissementVo){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.toVo(developpementDeSavoirEtInnovationScientifiqueEtablissementService.findByCriteria(developpementDeSavoirEtInnovationScientifiqueEtablissementVo));
        }

            @ApiOperation("Finds a developpementDeSavoirEtInnovationScientifiqueEtablissement by id")
            @GetMapping("/id/{id}")
            public DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo findById(@PathVariable Long id){
            return developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.toVo(developpementDeSavoirEtInnovationScientifiqueEtablissementService.findById(id));
            }

            @ApiOperation("Saves the specified  developpementDeSavoirEtInnovationScientifiqueEtablissement")
            @PostMapping("/")
            public DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo save(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo developpementDeSavoirEtInnovationScientifiqueEtablissementVo){
            DeveloppementDeSavoirEtInnovationScientifiqueEtablissement developpementDeSavoirEtInnovationScientifiqueEtablissement = developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.toItem(developpementDeSavoirEtInnovationScientifiqueEtablissementVo);
            developpementDeSavoirEtInnovationScientifiqueEtablissement = developpementDeSavoirEtInnovationScientifiqueEtablissementService.save(developpementDeSavoirEtInnovationScientifiqueEtablissement);
            return developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.toVo(developpementDeSavoirEtInnovationScientifiqueEtablissement);
            }

            @ApiOperation("Delete the specified developpementDeSavoirEtInnovationScientifiqueEtablissement")
            @DeleteMapping("/")
            public int delete(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo developpementDeSavoirEtInnovationScientifiqueEtablissementVo){
            DeveloppementDeSavoirEtInnovationScientifiqueEtablissement developpementDeSavoirEtInnovationScientifiqueEtablissement = developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.toItem(developpementDeSavoirEtInnovationScientifiqueEtablissementVo);
            return developpementDeSavoirEtInnovationScientifiqueEtablissementService.delete(developpementDeSavoirEtInnovationScientifiqueEtablissement);
            }

            @ApiOperation("Deletes a developpementDeSavoirEtInnovationScientifiqueEtablissement by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return developpementDeSavoirEtInnovationScientifiqueEtablissementService.deleteById(id);
            }
        @ApiOperation("find by etablissement code")
        @GetMapping("/etablissement/code/{code}")
        public List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> findByEtablissementCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementService.findByEtablissementCode(code);
        }

        @ApiOperation("delete by etablissement code")
        @DeleteMapping("/etablissement/code/{code}")
        public int deleteByEtablissementCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementService.deleteByEtablissementCode(code);
        }

        @ApiOperation("find by etablissement id")
        @GetMapping("/etablissement/id/{id}")
        public List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> findByEtablissementId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementService.findByEtablissementId(id);
        }

        @ApiOperation("delete by etablissement id")
        @DeleteMapping("/etablissement/id/{id}")
        public int deleteByEtablissementId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementService.deleteByEtablissementId(id);
        }

        @ApiOperation("find by developpementDeSavoirEtInnovationScientifique id")
        @GetMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> findByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }

        @ApiOperation("delete by developpementDeSavoirEtInnovationScientifique id")
        @DeleteMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }



            }
