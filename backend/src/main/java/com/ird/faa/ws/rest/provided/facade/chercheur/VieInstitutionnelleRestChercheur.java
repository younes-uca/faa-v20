package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.VieInstitutionnelleChercheurService;

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
import com.ird.faa.bean.VieInstitutionnelle;
import com.ird.faa.ws.rest.provided.converter.VieInstitutionnelleConverter;
import com.ird.faa.ws.rest.provided.vo.VieInstitutionnelleVo;

@Api("Manages vieInstitutionnelle services")
@RestController
@RequestMapping("api/chercheur/vieInstitutionnelle")
public class VieInstitutionnelleRestChercheur {

@Autowired
private VieInstitutionnelleChercheurService vieInstitutionnelleService;

@Autowired
private VieInstitutionnelleConverter vieInstitutionnelleConverter;


            @ApiOperation("Updates the specified  vieInstitutionnelle")
            @PutMapping("/")
            public  VieInstitutionnelleVo update(@RequestBody  VieInstitutionnelleVo  vieInstitutionnelleVo){
            VieInstitutionnelle vieInstitutionnelle = vieInstitutionnelleConverter.toItem(vieInstitutionnelleVo);
            vieInstitutionnelle = vieInstitutionnelleService.update(vieInstitutionnelle);
            return vieInstitutionnelleConverter.toVo(vieInstitutionnelle);
            }

    @ApiOperation("Finds a list of all vieInstitutionnelles")
    @GetMapping("/")
    public List<VieInstitutionnelleVo> findAll(){
        return vieInstitutionnelleConverter.toVo(vieInstitutionnelleService.findAll());
    }

    @ApiOperation("Finds a vieInstitutionnelle with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public VieInstitutionnelleVo findByIdWithAssociatedList(@PathVariable Long id){
    return vieInstitutionnelleConverter.toVo(vieInstitutionnelleService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search vieInstitutionnelle by a specific criteria")
    @PostMapping("/search")
    public List<VieInstitutionnelleVo> findByCriteria(@RequestBody VieInstitutionnelleVo vieInstitutionnelleVo){
        return vieInstitutionnelleConverter.toVo(vieInstitutionnelleService.findByCriteria(vieInstitutionnelleVo));
        }

            @ApiOperation("Finds a vieInstitutionnelle by id")
            @GetMapping("/id/{id}")
            public VieInstitutionnelleVo findById(@PathVariable Long id){
            return vieInstitutionnelleConverter.toVo(vieInstitutionnelleService.findById(id));
            }

            @ApiOperation("Saves the specified  vieInstitutionnelle")
            @PostMapping("/")
            public VieInstitutionnelleVo save(@RequestBody VieInstitutionnelleVo vieInstitutionnelleVo){
            VieInstitutionnelle vieInstitutionnelle = vieInstitutionnelleConverter.toItem(vieInstitutionnelleVo);
            vieInstitutionnelle = vieInstitutionnelleService.save(vieInstitutionnelle);
            return vieInstitutionnelleConverter.toVo(vieInstitutionnelle);
            }

            @ApiOperation("Delete the specified vieInstitutionnelle")
            @DeleteMapping("/")
            public int delete(@RequestBody VieInstitutionnelleVo vieInstitutionnelleVo){
            VieInstitutionnelle vieInstitutionnelle = vieInstitutionnelleConverter.toItem(vieInstitutionnelleVo);
            return vieInstitutionnelleService.delete(vieInstitutionnelle);
            }

            @ApiOperation("Deletes a vieInstitutionnelle by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return vieInstitutionnelleService.deleteById(id);
            }
        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<VieInstitutionnelle> findByCampagneCode(@PathVariable String code){
        return vieInstitutionnelleService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return vieInstitutionnelleService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<VieInstitutionnelle> findByCampagneId(@PathVariable Long id){
        return vieInstitutionnelleService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return vieInstitutionnelleService.deleteByCampagneId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<VieInstitutionnelle> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return vieInstitutionnelleService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return vieInstitutionnelleService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<VieInstitutionnelle> findByChercheurId(@PathVariable Long id){
        return vieInstitutionnelleService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return vieInstitutionnelleService.deleteByChercheurId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<VieInstitutionnelle> findByEtatEtapeCampagneCode(@PathVariable String code){
        return vieInstitutionnelleService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return vieInstitutionnelleService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<VieInstitutionnelle> findByEtatEtapeCampagneId(@PathVariable Long id){
        return vieInstitutionnelleService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return vieInstitutionnelleService.deleteByEtatEtapeCampagneId(id);
        }


            @GetMapping("/username/{username}/id/{compagneId}")
            public List<VieInstitutionnelleVo> findByChercheurUsernameAndCampagneId(@PathVariable String username,@PathVariable Long compagneId){
            return vieInstitutionnelleConverter.toVo(vieInstitutionnelleService.findByChercheurUsernameAndCampagneId(username,compagneId));
            }

            }
