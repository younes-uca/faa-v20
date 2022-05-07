package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ContratEtConventionIrdChercheurService;

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
import com.ird.faa.bean.ContratEtConventionIrd;
import com.ird.faa.ws.rest.provided.converter.ContratEtConventionIrdConverter;
import com.ird.faa.ws.rest.provided.vo.ContratEtConventionIrdVo;

@Api("Manages contratEtConventionIrd services")
@RestController
@RequestMapping("api/chercheur/contratEtConventionIrd")
public class ContratEtConventionIrdRestChercheur {

@Autowired
private ContratEtConventionIrdChercheurService contratEtConventionIrdService;

@Autowired
private ContratEtConventionIrdConverter contratEtConventionIrdConverter;


            @ApiOperation("Updates the specified  contratEtConventionIrd")
            @PutMapping("/")
            public  ContratEtConventionIrdVo update(@RequestBody  ContratEtConventionIrdVo  contratEtConventionIrdVo){
            ContratEtConventionIrd contratEtConventionIrd = contratEtConventionIrdConverter.toItem(contratEtConventionIrdVo);
            contratEtConventionIrd = contratEtConventionIrdService.update(contratEtConventionIrd);
            return contratEtConventionIrdConverter.toVo(contratEtConventionIrd);
            }

    @ApiOperation("Finds a list of all contratEtConventionIrds")
    @GetMapping("/")
    public List<ContratEtConventionIrdVo> findAll(){
        return contratEtConventionIrdConverter.toVo(contratEtConventionIrdService.findAll());
    }

    @ApiOperation("Finds a contratEtConventionIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ContratEtConventionIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return contratEtConventionIrdConverter.toVo(contratEtConventionIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search contratEtConventionIrd by a specific criteria")
    @PostMapping("/search")
    public List<ContratEtConventionIrdVo> findByCriteria(@RequestBody ContratEtConventionIrdVo contratEtConventionIrdVo){
        return contratEtConventionIrdConverter.toVo(contratEtConventionIrdService.findByCriteria(contratEtConventionIrdVo));
        }

            @ApiOperation("Finds a contratEtConventionIrd by id")
            @GetMapping("/id/{id}")
            public ContratEtConventionIrdVo findById(@PathVariable Long id){
            return contratEtConventionIrdConverter.toVo(contratEtConventionIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  contratEtConventionIrd")
            @PostMapping("/")
            public ContratEtConventionIrdVo save(@RequestBody ContratEtConventionIrdVo contratEtConventionIrdVo){
            ContratEtConventionIrd contratEtConventionIrd = contratEtConventionIrdConverter.toItem(contratEtConventionIrdVo);
            contratEtConventionIrd = contratEtConventionIrdService.save(contratEtConventionIrd);
            return contratEtConventionIrdConverter.toVo(contratEtConventionIrd);
            }

            @ApiOperation("Delete the specified contratEtConventionIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody ContratEtConventionIrdVo contratEtConventionIrdVo){
            ContratEtConventionIrd contratEtConventionIrd = contratEtConventionIrdConverter.toItem(contratEtConventionIrdVo);
            return contratEtConventionIrdService.delete(contratEtConventionIrd);
            }

            @ApiOperation("Deletes a contratEtConventionIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return contratEtConventionIrdService.deleteById(id);
            }
        @ApiOperation("find by statusContratEtConvention code")
        @GetMapping("/statusContratEtConvention/code/{code}")
        public List<ContratEtConventionIrd> findByStatusContratEtConventionCode(@PathVariable String code){
        return contratEtConventionIrdService.findByStatusContratEtConventionCode(code);
        }

        @ApiOperation("delete by statusContratEtConvention code")
        @DeleteMapping("/statusContratEtConvention/code/{code}")
        public int deleteByStatusContratEtConventionCode(@PathVariable String code){
        return contratEtConventionIrdService.deleteByStatusContratEtConventionCode(code);
        }

        @ApiOperation("find by statusContratEtConvention id")
        @GetMapping("/statusContratEtConvention/id/{id}")
        public List<ContratEtConventionIrd> findByStatusContratEtConventionId(@PathVariable Long id){
        return contratEtConventionIrdService.findByStatusContratEtConventionId(id);
        }

        @ApiOperation("delete by statusContratEtConvention id")
        @DeleteMapping("/statusContratEtConvention/id/{id}")
        public int deleteByStatusContratEtConventionId(@PathVariable Long id){
        return contratEtConventionIrdService.deleteByStatusContratEtConventionId(id);
        }

        @ApiOperation("find by savoirEtInnovation id")
        @GetMapping("/savoirEtInnovation/id/{id}")
        public List<ContratEtConventionIrd> findBySavoirEtInnovationId(@PathVariable Long id){
        return contratEtConventionIrdService.findBySavoirEtInnovationId(id);
        }

        @ApiOperation("delete by savoirEtInnovation id")
        @DeleteMapping("/savoirEtInnovation/id/{id}")
        public int deleteBySavoirEtInnovationId(@PathVariable Long id){
        return contratEtConventionIrdService.deleteBySavoirEtInnovationId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<ContratEtConventionIrd> findByEtatEtapeCampagneCode(@PathVariable String code){
        return contratEtConventionIrdService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return contratEtConventionIrdService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<ContratEtConventionIrd> findByEtatEtapeCampagneId(@PathVariable Long id){
        return contratEtConventionIrdService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return contratEtConventionIrdService.deleteByEtatEtapeCampagneId(id);
        }



            }
