package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiquePaysChercheurService;

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
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiquePays;
import com.ird.faa.ws.rest.provided.converter.DeveloppementDeSavoirEtInnovationScientifiquePaysConverter;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiquePaysVo;

@Api("Manages developpementDeSavoirEtInnovationScientifiquePays services")
@RestController
@RequestMapping("api/chercheur/developpementDeSavoirEtInnovationScientifiquePays")
public class DeveloppementDeSavoirEtInnovationScientifiquePaysRestChercheur {

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiquePaysChercheurService developpementDeSavoirEtInnovationScientifiquePaysService;

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiquePaysConverter developpementDeSavoirEtInnovationScientifiquePaysConverter;


            @ApiOperation("Updates the specified  developpementDeSavoirEtInnovationScientifiquePays")
            @PutMapping("/")
            public  DeveloppementDeSavoirEtInnovationScientifiquePaysVo update(@RequestBody  DeveloppementDeSavoirEtInnovationScientifiquePaysVo  developpementDeSavoirEtInnovationScientifiquePaysVo){
            DeveloppementDeSavoirEtInnovationScientifiquePays developpementDeSavoirEtInnovationScientifiquePays = developpementDeSavoirEtInnovationScientifiquePaysConverter.toItem(developpementDeSavoirEtInnovationScientifiquePaysVo);
            developpementDeSavoirEtInnovationScientifiquePays = developpementDeSavoirEtInnovationScientifiquePaysService.update(developpementDeSavoirEtInnovationScientifiquePays);
            return developpementDeSavoirEtInnovationScientifiquePaysConverter.toVo(developpementDeSavoirEtInnovationScientifiquePays);
            }

    @ApiOperation("Finds a list of all developpementDeSavoirEtInnovationScientifiquePayss")
    @GetMapping("/")
    public List<DeveloppementDeSavoirEtInnovationScientifiquePaysVo> findAll(){
        return developpementDeSavoirEtInnovationScientifiquePaysConverter.toVo(developpementDeSavoirEtInnovationScientifiquePaysService.findAll());
    }

    @ApiOperation("Finds a developpementDeSavoirEtInnovationScientifiquePays with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public DeveloppementDeSavoirEtInnovationScientifiquePaysVo findByIdWithAssociatedList(@PathVariable Long id){
    return developpementDeSavoirEtInnovationScientifiquePaysConverter.toVo(developpementDeSavoirEtInnovationScientifiquePaysService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search developpementDeSavoirEtInnovationScientifiquePays by a specific criteria")
    @PostMapping("/search")
    public List<DeveloppementDeSavoirEtInnovationScientifiquePaysVo> findByCriteria(@RequestBody DeveloppementDeSavoirEtInnovationScientifiquePaysVo developpementDeSavoirEtInnovationScientifiquePaysVo){
        return developpementDeSavoirEtInnovationScientifiquePaysConverter.toVo(developpementDeSavoirEtInnovationScientifiquePaysService.findByCriteria(developpementDeSavoirEtInnovationScientifiquePaysVo));
        }

            @ApiOperation("Finds a developpementDeSavoirEtInnovationScientifiquePays by id")
            @GetMapping("/id/{id}")
            public DeveloppementDeSavoirEtInnovationScientifiquePaysVo findById(@PathVariable Long id){
            return developpementDeSavoirEtInnovationScientifiquePaysConverter.toVo(developpementDeSavoirEtInnovationScientifiquePaysService.findById(id));
            }

            @ApiOperation("Saves the specified  developpementDeSavoirEtInnovationScientifiquePays")
            @PostMapping("/")
            public DeveloppementDeSavoirEtInnovationScientifiquePaysVo save(@RequestBody DeveloppementDeSavoirEtInnovationScientifiquePaysVo developpementDeSavoirEtInnovationScientifiquePaysVo){
            DeveloppementDeSavoirEtInnovationScientifiquePays developpementDeSavoirEtInnovationScientifiquePays = developpementDeSavoirEtInnovationScientifiquePaysConverter.toItem(developpementDeSavoirEtInnovationScientifiquePaysVo);
            developpementDeSavoirEtInnovationScientifiquePays = developpementDeSavoirEtInnovationScientifiquePaysService.save(developpementDeSavoirEtInnovationScientifiquePays);
            return developpementDeSavoirEtInnovationScientifiquePaysConverter.toVo(developpementDeSavoirEtInnovationScientifiquePays);
            }

            @ApiOperation("Delete the specified developpementDeSavoirEtInnovationScientifiquePays")
            @DeleteMapping("/")
            public int delete(@RequestBody DeveloppementDeSavoirEtInnovationScientifiquePaysVo developpementDeSavoirEtInnovationScientifiquePaysVo){
            DeveloppementDeSavoirEtInnovationScientifiquePays developpementDeSavoirEtInnovationScientifiquePays = developpementDeSavoirEtInnovationScientifiquePaysConverter.toItem(developpementDeSavoirEtInnovationScientifiquePaysVo);
            return developpementDeSavoirEtInnovationScientifiquePaysService.delete(developpementDeSavoirEtInnovationScientifiquePays);
            }

            @ApiOperation("Deletes a developpementDeSavoirEtInnovationScientifiquePays by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return developpementDeSavoirEtInnovationScientifiquePaysService.deleteById(id);
            }
        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<DeveloppementDeSavoirEtInnovationScientifiquePays> findByPaysCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiquePaysService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiquePaysService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<DeveloppementDeSavoirEtInnovationScientifiquePays> findByPaysId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiquePaysService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiquePaysService.deleteByPaysId(id);
        }

        @ApiOperation("find by developpementDeSavoirEtInnovationScientifique id")
        @GetMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public List<DeveloppementDeSavoirEtInnovationScientifiquePays> findByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiquePaysService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }

        @ApiOperation("delete by developpementDeSavoirEtInnovationScientifique id")
        @DeleteMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiquePaysService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }



            }
