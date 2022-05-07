package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ExpertiseScientifiqueChercheurService;

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
import com.ird.faa.bean.ExpertiseScientifique;
import com.ird.faa.ws.rest.provided.converter.ExpertiseScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.ExpertiseScientifiqueVo;

@Api("Manages expertiseScientifique services")
@RestController
@RequestMapping("api/chercheur/expertiseScientifique")
public class ExpertiseScientifiqueRestChercheur {

@Autowired
private ExpertiseScientifiqueChercheurService expertiseScientifiqueService;

@Autowired
private ExpertiseScientifiqueConverter expertiseScientifiqueConverter;


            @ApiOperation("Updates the specified  expertiseScientifique")
            @PutMapping("/")
            public  ExpertiseScientifiqueVo update(@RequestBody  ExpertiseScientifiqueVo  expertiseScientifiqueVo){
            ExpertiseScientifique expertiseScientifique = expertiseScientifiqueConverter.toItem(expertiseScientifiqueVo);
            expertiseScientifique = expertiseScientifiqueService.update(expertiseScientifique);
            return expertiseScientifiqueConverter.toVo(expertiseScientifique);
            }

    @ApiOperation("Finds a list of all expertiseScientifiques")
    @GetMapping("/")
    public List<ExpertiseScientifiqueVo> findAll(){
        return expertiseScientifiqueConverter.toVo(expertiseScientifiqueService.findAll());
    }

    @ApiOperation("Finds a expertiseScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ExpertiseScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return expertiseScientifiqueConverter.toVo(expertiseScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search expertiseScientifique by a specific criteria")
    @PostMapping("/search")
    public List<ExpertiseScientifiqueVo> findByCriteria(@RequestBody ExpertiseScientifiqueVo expertiseScientifiqueVo){
        return expertiseScientifiqueConverter.toVo(expertiseScientifiqueService.findByCriteria(expertiseScientifiqueVo));
        }

            @ApiOperation("Finds a expertiseScientifique by id")
            @GetMapping("/id/{id}")
            public ExpertiseScientifiqueVo findById(@PathVariable Long id){
            return expertiseScientifiqueConverter.toVo(expertiseScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  expertiseScientifique")
            @PostMapping("/")
            public ExpertiseScientifiqueVo save(@RequestBody ExpertiseScientifiqueVo expertiseScientifiqueVo){
            ExpertiseScientifique expertiseScientifique = expertiseScientifiqueConverter.toItem(expertiseScientifiqueVo);
            expertiseScientifique = expertiseScientifiqueService.save(expertiseScientifique);
            return expertiseScientifiqueConverter.toVo(expertiseScientifique);
            }

            @ApiOperation("Delete the specified expertiseScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody ExpertiseScientifiqueVo expertiseScientifiqueVo){
            ExpertiseScientifique expertiseScientifique = expertiseScientifiqueConverter.toItem(expertiseScientifiqueVo);
            return expertiseScientifiqueService.delete(expertiseScientifique);
            }

            @ApiOperation("Deletes a expertiseScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return expertiseScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by typeExpertise code")
        @GetMapping("/typeExpertise/code/{code}")
        public List<ExpertiseScientifique> findByTypeExpertiseCode(@PathVariable String code){
        return expertiseScientifiqueService.findByTypeExpertiseCode(code);
        }

        @ApiOperation("delete by typeExpertise code")
        @DeleteMapping("/typeExpertise/code/{code}")
        public int deleteByTypeExpertiseCode(@PathVariable String code){
        return expertiseScientifiqueService.deleteByTypeExpertiseCode(code);
        }

        @ApiOperation("find by typeExpertise id")
        @GetMapping("/typeExpertise/id/{id}")
        public List<ExpertiseScientifique> findByTypeExpertiseId(@PathVariable Long id){
        return expertiseScientifiqueService.findByTypeExpertiseId(id);
        }

        @ApiOperation("delete by typeExpertise id")
        @DeleteMapping("/typeExpertise/id/{id}")
        public int deleteByTypeExpertiseId(@PathVariable Long id){
        return expertiseScientifiqueService.deleteByTypeExpertiseId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<ExpertiseScientifique> findByPaysCode(@PathVariable String code){
        return expertiseScientifiqueService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return expertiseScientifiqueService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<ExpertiseScientifique> findByPaysId(@PathVariable Long id){
        return expertiseScientifiqueService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return expertiseScientifiqueService.deleteByPaysId(id);
        }

        @ApiOperation("find by etablissement code")
        @GetMapping("/etablissement/code/{code}")
        public List<ExpertiseScientifique> findByEtablissementCode(@PathVariable String code){
        return expertiseScientifiqueService.findByEtablissementCode(code);
        }

        @ApiOperation("delete by etablissement code")
        @DeleteMapping("/etablissement/code/{code}")
        public int deleteByEtablissementCode(@PathVariable String code){
        return expertiseScientifiqueService.deleteByEtablissementCode(code);
        }

        @ApiOperation("find by etablissement id")
        @GetMapping("/etablissement/id/{id}")
        public List<ExpertiseScientifique> findByEtablissementId(@PathVariable Long id){
        return expertiseScientifiqueService.findByEtablissementId(id);
        }

        @ApiOperation("delete by etablissement id")
        @DeleteMapping("/etablissement/id/{id}")
        public int deleteByEtablissementId(@PathVariable Long id){
        return expertiseScientifiqueService.deleteByEtablissementId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<ExpertiseScientifique> findByEtatEtapeCampagneCode(@PathVariable String code){
        return expertiseScientifiqueService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return expertiseScientifiqueService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<ExpertiseScientifique> findByEtatEtapeCampagneId(@PathVariable Long id){
        return expertiseScientifiqueService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return expertiseScientifiqueService.deleteByEtatEtapeCampagneId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<ExpertiseScientifique> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return expertiseScientifiqueService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return expertiseScientifiqueService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<ExpertiseScientifique> findByChercheurId(@PathVariable Long id){
        return expertiseScientifiqueService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return expertiseScientifiqueService.deleteByChercheurId(id);
        }

        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<ExpertiseScientifique> findByCampagneCode(@PathVariable String code){
        return expertiseScientifiqueService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return expertiseScientifiqueService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<ExpertiseScientifique> findByCampagneId(@PathVariable Long id){
        return expertiseScientifiqueService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return expertiseScientifiqueService.deleteByCampagneId(id);
        }


            @GetMapping("/username/{username}/id/{compagneId}")
            public List<ExpertiseScientifiqueVo> findByChercheurUsernameAndCampagneId(@PathVariable String username,@PathVariable Long compagneId){
            return expertiseScientifiqueConverter.toVo(expertiseScientifiqueService.findByChercheurUsernameAndCampagneId(username,compagneId));
            }

            }
