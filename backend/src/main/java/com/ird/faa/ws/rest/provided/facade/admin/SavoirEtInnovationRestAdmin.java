package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.SavoirEtInnovationAdminService;

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
import com.ird.faa.bean.SavoirEtInnovation;
import com.ird.faa.ws.rest.provided.converter.SavoirEtInnovationConverter;
import com.ird.faa.ws.rest.provided.vo.SavoirEtInnovationVo;

@Api("Manages savoirEtInnovation services")
@RestController
@RequestMapping("api/admin/savoirEtInnovation")
public class SavoirEtInnovationRestAdmin {

@Autowired
private SavoirEtInnovationAdminService savoirEtInnovationService;

@Autowired
private SavoirEtInnovationConverter savoirEtInnovationConverter;


            @ApiOperation("Updates the specified  savoirEtInnovation")
            @PutMapping("/")
            public  SavoirEtInnovationVo update(@RequestBody  SavoirEtInnovationVo  savoirEtInnovationVo){
            SavoirEtInnovation savoirEtInnovation = savoirEtInnovationConverter.toItem(savoirEtInnovationVo);
            savoirEtInnovation = savoirEtInnovationService.update(savoirEtInnovation);
            return savoirEtInnovationConverter.toVo(savoirEtInnovation);
            }

    @ApiOperation("Finds a list of all savoirEtInnovations")
    @GetMapping("/")
    public List<SavoirEtInnovationVo> findAll(){
        return savoirEtInnovationConverter.toVo(savoirEtInnovationService.findAll());
    }

    @ApiOperation("Finds a savoirEtInnovation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public SavoirEtInnovationVo findByIdWithAssociatedList(@PathVariable Long id){
    return savoirEtInnovationConverter.toVo(savoirEtInnovationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search savoirEtInnovation by a specific criteria")
    @PostMapping("/search")
    public List<SavoirEtInnovationVo> findByCriteria(@RequestBody SavoirEtInnovationVo savoirEtInnovationVo){
        return savoirEtInnovationConverter.toVo(savoirEtInnovationService.findByCriteria(savoirEtInnovationVo));
        }

            @ApiOperation("Finds a savoirEtInnovation by id")
            @GetMapping("/id/{id}")
            public SavoirEtInnovationVo findById(@PathVariable Long id){
            return savoirEtInnovationConverter.toVo(savoirEtInnovationService.findById(id));
            }

            @ApiOperation("Saves the specified  savoirEtInnovation")
            @PostMapping("/")
            public SavoirEtInnovationVo save(@RequestBody SavoirEtInnovationVo savoirEtInnovationVo){
            SavoirEtInnovation savoirEtInnovation = savoirEtInnovationConverter.toItem(savoirEtInnovationVo);
            savoirEtInnovation = savoirEtInnovationService.save(savoirEtInnovation);
            return savoirEtInnovationConverter.toVo(savoirEtInnovation);
            }

            @ApiOperation("Delete the specified savoirEtInnovation")
            @DeleteMapping("/")
            public int delete(@RequestBody SavoirEtInnovationVo savoirEtInnovationVo){
            SavoirEtInnovation savoirEtInnovation = savoirEtInnovationConverter.toItem(savoirEtInnovationVo);
            return savoirEtInnovationService.delete(savoirEtInnovation);
            }

            @ApiOperation("Deletes a savoirEtInnovation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return savoirEtInnovationService.deleteById(id);
            }
        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<SavoirEtInnovation> findByCampagneCode(@PathVariable String code){
        return savoirEtInnovationService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return savoirEtInnovationService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<SavoirEtInnovation> findByCampagneId(@PathVariable Long id){
        return savoirEtInnovationService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return savoirEtInnovationService.deleteByCampagneId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<SavoirEtInnovation> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return savoirEtInnovationService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return savoirEtInnovationService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<SavoirEtInnovation> findByChercheurId(@PathVariable Long id){
        return savoirEtInnovationService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return savoirEtInnovationService.deleteByChercheurId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<SavoirEtInnovation> findByEtatEtapeCampagneCode(@PathVariable String code){
        return savoirEtInnovationService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return savoirEtInnovationService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<SavoirEtInnovation> findByEtatEtapeCampagneId(@PathVariable Long id){
        return savoirEtInnovationService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return savoirEtInnovationService.deleteByEtatEtapeCampagneId(id);
        }



            }
