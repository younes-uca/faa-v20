package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.EnseignementEtFormationChercheurService;

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
import com.ird.faa.bean.EnseignementEtFormation;
import com.ird.faa.ws.rest.provided.converter.EnseignementEtFormationConverter;
import com.ird.faa.ws.rest.provided.vo.EnseignementEtFormationVo;

@Api("Manages enseignementEtFormation services")
@RestController
@RequestMapping("api/chercheur/enseignementEtFormation")
public class EnseignementEtFormationRestChercheur {

@Autowired
private EnseignementEtFormationChercheurService enseignementEtFormationService;

@Autowired
private EnseignementEtFormationConverter enseignementEtFormationConverter;


            @ApiOperation("Updates the specified  enseignementEtFormation")
            @PutMapping("/")
            public  EnseignementEtFormationVo update(@RequestBody  EnseignementEtFormationVo  enseignementEtFormationVo){
            EnseignementEtFormation enseignementEtFormation = enseignementEtFormationConverter.toItem(enseignementEtFormationVo);
            enseignementEtFormation = enseignementEtFormationService.update(enseignementEtFormation);
            return enseignementEtFormationConverter.toVo(enseignementEtFormation);
            }

    @ApiOperation("Finds a list of all enseignementEtFormations")
    @GetMapping("/")
    public List<EnseignementEtFormationVo> findAll(){
        return enseignementEtFormationConverter.toVo(enseignementEtFormationService.findAll());
    }

    @ApiOperation("Finds a enseignementEtFormation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EnseignementEtFormationVo findByIdWithAssociatedList(@PathVariable Long id){
    return enseignementEtFormationConverter.toVo(enseignementEtFormationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search enseignementEtFormation by a specific criteria")
    @PostMapping("/search")
    public List<EnseignementEtFormationVo> findByCriteria(@RequestBody EnseignementEtFormationVo enseignementEtFormationVo){
        return enseignementEtFormationConverter.toVo(enseignementEtFormationService.findByCriteria(enseignementEtFormationVo));
        }

            @ApiOperation("Finds a enseignementEtFormation by id")
            @GetMapping("/id/{id}")
            public EnseignementEtFormationVo findById(@PathVariable Long id){
            return enseignementEtFormationConverter.toVo(enseignementEtFormationService.findById(id));
            }

            @ApiOperation("Saves the specified  enseignementEtFormation")
            @PostMapping("/")
            public EnseignementEtFormationVo save(@RequestBody EnseignementEtFormationVo enseignementEtFormationVo){
            EnseignementEtFormation enseignementEtFormation = enseignementEtFormationConverter.toItem(enseignementEtFormationVo);
            enseignementEtFormation = enseignementEtFormationService.save(enseignementEtFormation);
            return enseignementEtFormationConverter.toVo(enseignementEtFormation);
            }

            @ApiOperation("Delete the specified enseignementEtFormation")
            @DeleteMapping("/")
            public int delete(@RequestBody EnseignementEtFormationVo enseignementEtFormationVo){
            EnseignementEtFormation enseignementEtFormation = enseignementEtFormationConverter.toItem(enseignementEtFormationVo);
            return enseignementEtFormationService.delete(enseignementEtFormation);
            }

            @ApiOperation("Deletes a enseignementEtFormation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return enseignementEtFormationService.deleteById(id);
            }
        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<EnseignementEtFormation> findByEtatEtapeCampagneCode(@PathVariable String code){
        return enseignementEtFormationService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return enseignementEtFormationService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<EnseignementEtFormation> findByEtatEtapeCampagneId(@PathVariable Long id){
        return enseignementEtFormationService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return enseignementEtFormationService.deleteByEtatEtapeCampagneId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<EnseignementEtFormation> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return enseignementEtFormationService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return enseignementEtFormationService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<EnseignementEtFormation> findByChercheurId(@PathVariable Long id){
        return enseignementEtFormationService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return enseignementEtFormationService.deleteByChercheurId(id);
        }

        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<EnseignementEtFormation> findByCampagneCode(@PathVariable String code){
        return enseignementEtFormationService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return enseignementEtFormationService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<EnseignementEtFormation> findByCampagneId(@PathVariable Long id){
        return enseignementEtFormationService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return enseignementEtFormationService.deleteByCampagneId(id);
        }


            @GetMapping("/username/{username}/id/{compagneId}")
            public List<EnseignementEtFormationVo> findByChercheurUsernameAndCampagneId(@PathVariable String username,@PathVariable Long compagneId){
            return enseignementEtFormationConverter.toVo(enseignementEtFormationService.findByChercheurUsernameAndCampagneId(username,compagneId));
            }

            }
