package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.CultureScientifiqueChercheurService;

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
import com.ird.faa.bean.CultureScientifique;
import com.ird.faa.ws.rest.provided.converter.CultureScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.CultureScientifiqueVo;

@Api("Manages cultureScientifique services")
@RestController
@RequestMapping("api/chercheur/cultureScientifique")
public class CultureScientifiqueRestChercheur {

@Autowired
private CultureScientifiqueChercheurService cultureScientifiqueService;

@Autowired
private CultureScientifiqueConverter cultureScientifiqueConverter;


            @ApiOperation("Updates the specified  cultureScientifique")
            @PutMapping("/")
            public  CultureScientifiqueVo update(@RequestBody  CultureScientifiqueVo  cultureScientifiqueVo){
            CultureScientifique cultureScientifique = cultureScientifiqueConverter.toItem(cultureScientifiqueVo);
            cultureScientifique = cultureScientifiqueService.update(cultureScientifique);
            return cultureScientifiqueConverter.toVo(cultureScientifique);
            }

    @ApiOperation("Finds a list of all cultureScientifiques")
    @GetMapping("/")
    public List<CultureScientifiqueVo> findAll(){
        return cultureScientifiqueConverter.toVo(cultureScientifiqueService.findAll());
    }

    @ApiOperation("Finds a cultureScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CultureScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return cultureScientifiqueConverter.toVo(cultureScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search cultureScientifique by a specific criteria")
    @PostMapping("/search")
    public List<CultureScientifiqueVo> findByCriteria(@RequestBody CultureScientifiqueVo cultureScientifiqueVo){
        return cultureScientifiqueConverter.toVo(cultureScientifiqueService.findByCriteria(cultureScientifiqueVo));
        }

            @ApiOperation("Finds a cultureScientifique by id")
            @GetMapping("/id/{id}")
            public CultureScientifiqueVo findById(@PathVariable Long id){
            return cultureScientifiqueConverter.toVo(cultureScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  cultureScientifique")
            @PostMapping("/")
            public CultureScientifiqueVo save(@RequestBody CultureScientifiqueVo cultureScientifiqueVo){
            CultureScientifique cultureScientifique = cultureScientifiqueConverter.toItem(cultureScientifiqueVo);
            cultureScientifique = cultureScientifiqueService.save(cultureScientifique);
            return cultureScientifiqueConverter.toVo(cultureScientifique);
            }

            @ApiOperation("Delete the specified cultureScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody CultureScientifiqueVo cultureScientifiqueVo){
            CultureScientifique cultureScientifique = cultureScientifiqueConverter.toItem(cultureScientifiqueVo);
            return cultureScientifiqueService.delete(cultureScientifique);
            }

            @ApiOperation("Deletes a cultureScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return cultureScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<CultureScientifique> findByCampagneCode(@PathVariable String code){
        return cultureScientifiqueService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return cultureScientifiqueService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<CultureScientifique> findByCampagneId(@PathVariable Long id){
        return cultureScientifiqueService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return cultureScientifiqueService.deleteByCampagneId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<CultureScientifique> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return cultureScientifiqueService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return cultureScientifiqueService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<CultureScientifique> findByChercheurId(@PathVariable Long id){
        return cultureScientifiqueService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return cultureScientifiqueService.deleteByChercheurId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<CultureScientifique> findByEtatEtapeCampagneCode(@PathVariable String code){
        return cultureScientifiqueService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return cultureScientifiqueService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<CultureScientifique> findByEtatEtapeCampagneId(@PathVariable Long id){
        return cultureScientifiqueService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return cultureScientifiqueService.deleteByEtatEtapeCampagneId(id);
        }

        @ApiOperation("find by natureActiviteGrandPublique code")
        @GetMapping("/natureActiviteGrandPublique/code/{code}")
        public List<CultureScientifique> findByNatureActiviteGrandPubliqueCode(@PathVariable String code){
        return cultureScientifiqueService.findByNatureActiviteGrandPubliqueCode(code);
        }

        @ApiOperation("delete by natureActiviteGrandPublique code")
        @DeleteMapping("/natureActiviteGrandPublique/code/{code}")
        public int deleteByNatureActiviteGrandPubliqueCode(@PathVariable String code){
        return cultureScientifiqueService.deleteByNatureActiviteGrandPubliqueCode(code);
        }

        @ApiOperation("find by natureActiviteGrandPublique id")
        @GetMapping("/natureActiviteGrandPublique/id/{id}")
        public List<CultureScientifique> findByNatureActiviteGrandPubliqueId(@PathVariable Long id){
        return cultureScientifiqueService.findByNatureActiviteGrandPubliqueId(id);
        }

        @ApiOperation("delete by natureActiviteGrandPublique id")
        @DeleteMapping("/natureActiviteGrandPublique/id/{id}")
        public int deleteByNatureActiviteGrandPubliqueId(@PathVariable Long id){
        return cultureScientifiqueService.deleteByNatureActiviteGrandPubliqueId(id);
        }


            @GetMapping("/username/{username}/id/{compagneId}")
            public List<CultureScientifiqueVo> findByChercheurUsernameAndCampagneId(@PathVariable String username,@PathVariable Long compagneId){
            return cultureScientifiqueConverter.toVo(cultureScientifiqueService.findByChercheurUsernameAndCampagneId(username,compagneId));
            }

            }
