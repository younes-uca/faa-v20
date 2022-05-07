package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionChercheurService;

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
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion;
import com.ird.faa.ws.rest.provided.converter.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionConverter;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo;

@Api("Manages developpementDeSavoirEtInnovationScientifiqueModeDiffusion services")
@RestController
@RequestMapping("api/chercheur/developpementDeSavoirEtInnovationScientifiqueModeDiffusion")
public class DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionRestChercheur {

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionChercheurService developpementDeSavoirEtInnovationScientifiqueModeDiffusionService;

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionConverter developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter;


            @ApiOperation("Updates the specified  developpementDeSavoirEtInnovationScientifiqueModeDiffusion")
            @PutMapping("/")
            public  DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo update(@RequestBody  DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo  developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo){
            DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion developpementDeSavoirEtInnovationScientifiqueModeDiffusion = developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.toItem(developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo);
            developpementDeSavoirEtInnovationScientifiqueModeDiffusion = developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.update(developpementDeSavoirEtInnovationScientifiqueModeDiffusion);
            return developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.toVo(developpementDeSavoirEtInnovationScientifiqueModeDiffusion);
            }

    @ApiOperation("Finds a list of all developpementDeSavoirEtInnovationScientifiqueModeDiffusions")
    @GetMapping("/")
    public List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo> findAll(){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.toVo(developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.findAll());
    }

    @ApiOperation("Finds a developpementDeSavoirEtInnovationScientifiqueModeDiffusion with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo findByIdWithAssociatedList(@PathVariable Long id){
    return developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.toVo(developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search developpementDeSavoirEtInnovationScientifiqueModeDiffusion by a specific criteria")
    @PostMapping("/search")
    public List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo> findByCriteria(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.toVo(developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.findByCriteria(developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo));
        }

            @ApiOperation("Finds a developpementDeSavoirEtInnovationScientifiqueModeDiffusion by id")
            @GetMapping("/id/{id}")
            public DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo findById(@PathVariable Long id){
            return developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.toVo(developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.findById(id));
            }

            @ApiOperation("Saves the specified  developpementDeSavoirEtInnovationScientifiqueModeDiffusion")
            @PostMapping("/")
            public DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo save(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo){
            DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion developpementDeSavoirEtInnovationScientifiqueModeDiffusion = developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.toItem(developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo);
            developpementDeSavoirEtInnovationScientifiqueModeDiffusion = developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.save(developpementDeSavoirEtInnovationScientifiqueModeDiffusion);
            return developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.toVo(developpementDeSavoirEtInnovationScientifiqueModeDiffusion);
            }

            @ApiOperation("Delete the specified developpementDeSavoirEtInnovationScientifiqueModeDiffusion")
            @DeleteMapping("/")
            public int delete(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo){
            DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion developpementDeSavoirEtInnovationScientifiqueModeDiffusion = developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.toItem(developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo);
            return developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.delete(developpementDeSavoirEtInnovationScientifiqueModeDiffusion);
            }

            @ApiOperation("Deletes a developpementDeSavoirEtInnovationScientifiqueModeDiffusion by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.deleteById(id);
            }
        @ApiOperation("find by modeDiffusion code")
        @GetMapping("/modeDiffusion/code/{code}")
        public List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findByModeDiffusionCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.findByModeDiffusionCode(code);
        }

        @ApiOperation("delete by modeDiffusion code")
        @DeleteMapping("/modeDiffusion/code/{code}")
        public int deleteByModeDiffusionCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.deleteByModeDiffusionCode(code);
        }

        @ApiOperation("find by modeDiffusion id")
        @GetMapping("/modeDiffusion/id/{id}")
        public List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findByModeDiffusionId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.findByModeDiffusionId(id);
        }

        @ApiOperation("delete by modeDiffusion id")
        @DeleteMapping("/modeDiffusion/id/{id}")
        public int deleteByModeDiffusionId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.deleteByModeDiffusionId(id);
        }

        @ApiOperation("find by developpementDeSavoirEtInnovationScientifique id")
        @GetMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }

        @ApiOperation("delete by developpementDeSavoirEtInnovationScientifique id")
        @DeleteMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }



            }
