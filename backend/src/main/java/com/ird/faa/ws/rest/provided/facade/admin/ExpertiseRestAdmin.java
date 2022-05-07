package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.ExpertiseAdminService;

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
import com.ird.faa.bean.Expertise;
import com.ird.faa.ws.rest.provided.converter.ExpertiseConverter;
import com.ird.faa.ws.rest.provided.vo.ExpertiseVo;

@Api("Manages expertise services")
@RestController
@RequestMapping("api/admin/expertise")
public class ExpertiseRestAdmin {

@Autowired
private ExpertiseAdminService expertiseService;

@Autowired
private ExpertiseConverter expertiseConverter;


            @ApiOperation("Updates the specified  expertise")
            @PutMapping("/")
            public  ExpertiseVo update(@RequestBody  ExpertiseVo  expertiseVo){
            Expertise expertise = expertiseConverter.toItem(expertiseVo);
            expertise = expertiseService.update(expertise);
            return expertiseConverter.toVo(expertise);
            }

    @ApiOperation("Finds a list of all expertises")
    @GetMapping("/")
    public List<ExpertiseVo> findAll(){
        return expertiseConverter.toVo(expertiseService.findAll());
    }

    @ApiOperation("Finds a expertise with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ExpertiseVo findByIdWithAssociatedList(@PathVariable Long id){
    return expertiseConverter.toVo(expertiseService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search expertise by a specific criteria")
    @PostMapping("/search")
    public List<ExpertiseVo> findByCriteria(@RequestBody ExpertiseVo expertiseVo){
        return expertiseConverter.toVo(expertiseService.findByCriteria(expertiseVo));
        }

            @ApiOperation("Finds a expertise by id")
            @GetMapping("/id/{id}")
            public ExpertiseVo findById(@PathVariable Long id){
            return expertiseConverter.toVo(expertiseService.findById(id));
            }

            @ApiOperation("Saves the specified  expertise")
            @PostMapping("/")
            public ExpertiseVo save(@RequestBody ExpertiseVo expertiseVo){
            Expertise expertise = expertiseConverter.toItem(expertiseVo);
            expertise = expertiseService.save(expertise);
            return expertiseConverter.toVo(expertise);
            }

            @ApiOperation("Delete the specified expertise")
            @DeleteMapping("/")
            public int delete(@RequestBody ExpertiseVo expertiseVo){
            Expertise expertise = expertiseConverter.toItem(expertiseVo);
            return expertiseService.delete(expertise);
            }

            @ApiOperation("Deletes a expertise by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return expertiseService.deleteById(id);
            }
        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<Expertise> findByEtatEtapeCampagneCode(@PathVariable String code){
        return expertiseService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return expertiseService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<Expertise> findByEtatEtapeCampagneId(@PathVariable Long id){
        return expertiseService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return expertiseService.deleteByEtatEtapeCampagneId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<Expertise> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return expertiseService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return expertiseService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<Expertise> findByChercheurId(@PathVariable Long id){
        return expertiseService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return expertiseService.deleteByChercheurId(id);
        }

        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<Expertise> findByCampagneCode(@PathVariable String code){
        return expertiseService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return expertiseService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<Expertise> findByCampagneId(@PathVariable Long id){
        return expertiseService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return expertiseService.deleteByCampagneId(id);
        }



            }
