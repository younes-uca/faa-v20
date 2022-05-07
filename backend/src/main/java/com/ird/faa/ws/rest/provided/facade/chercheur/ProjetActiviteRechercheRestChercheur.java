package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ProjetActiviteRechercheChercheurService;

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
import com.ird.faa.bean.ProjetActiviteRecherche;
import com.ird.faa.ws.rest.provided.converter.ProjetActiviteRechercheConverter;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheVo;

@Api("Manages projetActiviteRecherche services")
@RestController
@RequestMapping("api/chercheur/projetActiviteRecherche")
public class ProjetActiviteRechercheRestChercheur {

@Autowired
private ProjetActiviteRechercheChercheurService projetActiviteRechercheService;

@Autowired
private ProjetActiviteRechercheConverter projetActiviteRechercheConverter;


            @ApiOperation("Updates the specified  projetActiviteRecherche")
            @PutMapping("/")
            public  ProjetActiviteRechercheVo update(@RequestBody  ProjetActiviteRechercheVo  projetActiviteRechercheVo){
            ProjetActiviteRecherche projetActiviteRecherche = projetActiviteRechercheConverter.toItem(projetActiviteRechercheVo);
            projetActiviteRecherche = projetActiviteRechercheService.update(projetActiviteRecherche);
            return projetActiviteRechercheConverter.toVo(projetActiviteRecherche);
            }

    @ApiOperation("Finds a list of all projetActiviteRecherches")
    @GetMapping("/")
    public List<ProjetActiviteRechercheVo> findAll(){
        return projetActiviteRechercheConverter.toVo(projetActiviteRechercheService.findAll());
    }

    @ApiOperation("Finds a projetActiviteRecherche with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ProjetActiviteRechercheVo findByIdWithAssociatedList(@PathVariable Long id){
    return projetActiviteRechercheConverter.toVo(projetActiviteRechercheService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search projetActiviteRecherche by a specific criteria")
    @PostMapping("/search")
    public List<ProjetActiviteRechercheVo> findByCriteria(@RequestBody ProjetActiviteRechercheVo projetActiviteRechercheVo){
        return projetActiviteRechercheConverter.toVo(projetActiviteRechercheService.findByCriteria(projetActiviteRechercheVo));
        }

            @ApiOperation("Finds a projetActiviteRecherche by id")
            @GetMapping("/id/{id}")
            public ProjetActiviteRechercheVo findById(@PathVariable Long id){
            return projetActiviteRechercheConverter.toVo(projetActiviteRechercheService.findById(id));
            }

            @ApiOperation("Saves the specified  projetActiviteRecherche")
            @PostMapping("/")
            public ProjetActiviteRechercheVo save(@RequestBody ProjetActiviteRechercheVo projetActiviteRechercheVo){
            ProjetActiviteRecherche projetActiviteRecherche = projetActiviteRechercheConverter.toItem(projetActiviteRechercheVo);
            projetActiviteRecherche = projetActiviteRechercheService.save(projetActiviteRecherche);
            return projetActiviteRechercheConverter.toVo(projetActiviteRecherche);
            }

            @ApiOperation("Delete the specified projetActiviteRecherche")
            @DeleteMapping("/")
            public int delete(@RequestBody ProjetActiviteRechercheVo projetActiviteRechercheVo){
            ProjetActiviteRecherche projetActiviteRecherche = projetActiviteRechercheConverter.toItem(projetActiviteRechercheVo);
            return projetActiviteRechercheService.delete(projetActiviteRecherche);
            }

            @ApiOperation("Deletes a projetActiviteRecherche by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return projetActiviteRechercheService.deleteById(id);
            }
        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<ProjetActiviteRecherche> findByEtatEtapeCampagneCode(@PathVariable String code){
        return projetActiviteRechercheService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return projetActiviteRechercheService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<ProjetActiviteRecherche> findByEtatEtapeCampagneId(@PathVariable Long id){
        return projetActiviteRechercheService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return projetActiviteRechercheService.deleteByEtatEtapeCampagneId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<ProjetActiviteRecherche> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return projetActiviteRechercheService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return projetActiviteRechercheService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<ProjetActiviteRecherche> findByChercheurId(@PathVariable Long id){
        return projetActiviteRechercheService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return projetActiviteRechercheService.deleteByChercheurId(id);
        }

        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<ProjetActiviteRecherche> findByCampagneCode(@PathVariable String code){
        return projetActiviteRechercheService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return projetActiviteRechercheService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<ProjetActiviteRecherche> findByCampagneId(@PathVariable Long id){
        return projetActiviteRechercheService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return projetActiviteRechercheService.deleteByCampagneId(id);
        }


            @GetMapping("/username/{username}/id/{compagneId}")
            public List<ProjetActiviteRechercheVo> findByChercheurUsernameAndCampagneId(@PathVariable String username,@PathVariable Long compagneId){
            return projetActiviteRechercheConverter.toVo(projetActiviteRechercheService.findByChercheurUsernameAndCampagneId(username,compagneId));
            }

            }
