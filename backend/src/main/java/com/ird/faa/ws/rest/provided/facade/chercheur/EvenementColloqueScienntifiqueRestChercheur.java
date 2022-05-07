package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.EvenementColloqueScienntifiqueChercheurService;

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
import com.ird.faa.bean.EvenementColloqueScienntifique;
import com.ird.faa.ws.rest.provided.converter.EvenementColloqueScienntifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.EvenementColloqueScienntifiqueVo;

@Api("Manages evenementColloqueScienntifique services")
@RestController
@RequestMapping("api/chercheur/evenementColloqueScienntifique")
public class EvenementColloqueScienntifiqueRestChercheur {

@Autowired
private EvenementColloqueScienntifiqueChercheurService evenementColloqueScienntifiqueService;

@Autowired
private EvenementColloqueScienntifiqueConverter evenementColloqueScienntifiqueConverter;


            @ApiOperation("Updates the specified  evenementColloqueScienntifique")
            @PutMapping("/")
            public  EvenementColloqueScienntifiqueVo update(@RequestBody  EvenementColloqueScienntifiqueVo  evenementColloqueScienntifiqueVo){
            EvenementColloqueScienntifique evenementColloqueScienntifique = evenementColloqueScienntifiqueConverter.toItem(evenementColloqueScienntifiqueVo);
            evenementColloqueScienntifique = evenementColloqueScienntifiqueService.update(evenementColloqueScienntifique);
            return evenementColloqueScienntifiqueConverter.toVo(evenementColloqueScienntifique);
            }

    @ApiOperation("Finds a list of all evenementColloqueScienntifiques")
    @GetMapping("/")
    public List<EvenementColloqueScienntifiqueVo> findAll(){
        return evenementColloqueScienntifiqueConverter.toVo(evenementColloqueScienntifiqueService.findAll());
    }

    @ApiOperation("Finds a evenementColloqueScienntifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EvenementColloqueScienntifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return evenementColloqueScienntifiqueConverter.toVo(evenementColloqueScienntifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search evenementColloqueScienntifique by a specific criteria")
    @PostMapping("/search")
    public List<EvenementColloqueScienntifiqueVo> findByCriteria(@RequestBody EvenementColloqueScienntifiqueVo evenementColloqueScienntifiqueVo){
        return evenementColloqueScienntifiqueConverter.toVo(evenementColloqueScienntifiqueService.findByCriteria(evenementColloqueScienntifiqueVo));
        }

            @ApiOperation("Finds a evenementColloqueScienntifique by id")
            @GetMapping("/id/{id}")
            public EvenementColloqueScienntifiqueVo findById(@PathVariable Long id){
            return evenementColloqueScienntifiqueConverter.toVo(evenementColloqueScienntifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  evenementColloqueScienntifique")
            @PostMapping("/")
            public EvenementColloqueScienntifiqueVo save(@RequestBody EvenementColloqueScienntifiqueVo evenementColloqueScienntifiqueVo){
            EvenementColloqueScienntifique evenementColloqueScienntifique = evenementColloqueScienntifiqueConverter.toItem(evenementColloqueScienntifiqueVo);
            evenementColloqueScienntifique = evenementColloqueScienntifiqueService.save(evenementColloqueScienntifique);
            return evenementColloqueScienntifiqueConverter.toVo(evenementColloqueScienntifique);
            }

            @ApiOperation("Delete the specified evenementColloqueScienntifique")
            @DeleteMapping("/")
            public int delete(@RequestBody EvenementColloqueScienntifiqueVo evenementColloqueScienntifiqueVo){
            EvenementColloqueScienntifique evenementColloqueScienntifique = evenementColloqueScienntifiqueConverter.toItem(evenementColloqueScienntifiqueVo);
            return evenementColloqueScienntifiqueService.delete(evenementColloqueScienntifique);
            }

            @ApiOperation("Deletes a evenementColloqueScienntifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return evenementColloqueScienntifiqueService.deleteById(id);
            }
        @ApiOperation("find by modalite code")
        @GetMapping("/modalite/code/{code}")
        public List<EvenementColloqueScienntifique> findByModaliteCode(@PathVariable String code){
        return evenementColloqueScienntifiqueService.findByModaliteCode(code);
        }

        @ApiOperation("delete by modalite code")
        @DeleteMapping("/modalite/code/{code}")
        public int deleteByModaliteCode(@PathVariable String code){
        return evenementColloqueScienntifiqueService.deleteByModaliteCode(code);
        }

        @ApiOperation("find by modalite id")
        @GetMapping("/modalite/id/{id}")
        public List<EvenementColloqueScienntifique> findByModaliteId(@PathVariable Long id){
        return evenementColloqueScienntifiqueService.findByModaliteId(id);
        }

        @ApiOperation("delete by modalite id")
        @DeleteMapping("/modalite/id/{id}")
        public int deleteByModaliteId(@PathVariable Long id){
        return evenementColloqueScienntifiqueService.deleteByModaliteId(id);
        }

        @ApiOperation("find by modaliteIntervention code")
        @GetMapping("/modaliteIntervention/code/{code}")
        public List<EvenementColloqueScienntifique> findByModaliteInterventionCode(@PathVariable String code){
        return evenementColloqueScienntifiqueService.findByModaliteInterventionCode(code);
        }

        @ApiOperation("delete by modaliteIntervention code")
        @DeleteMapping("/modaliteIntervention/code/{code}")
        public int deleteByModaliteInterventionCode(@PathVariable String code){
        return evenementColloqueScienntifiqueService.deleteByModaliteInterventionCode(code);
        }

        @ApiOperation("find by modaliteIntervention id")
        @GetMapping("/modaliteIntervention/id/{id}")
        public List<EvenementColloqueScienntifique> findByModaliteInterventionId(@PathVariable Long id){
        return evenementColloqueScienntifiqueService.findByModaliteInterventionId(id);
        }

        @ApiOperation("delete by modaliteIntervention id")
        @DeleteMapping("/modaliteIntervention/id/{id}")
        public int deleteByModaliteInterventionId(@PathVariable Long id){
        return evenementColloqueScienntifiqueService.deleteByModaliteInterventionId(id);
        }

        @ApiOperation("find by savoirEtInnovation id")
        @GetMapping("/savoirEtInnovation/id/{id}")
        public List<EvenementColloqueScienntifique> findBySavoirEtInnovationId(@PathVariable Long id){
        return evenementColloqueScienntifiqueService.findBySavoirEtInnovationId(id);
        }

        @ApiOperation("delete by savoirEtInnovation id")
        @DeleteMapping("/savoirEtInnovation/id/{id}")
        public int deleteBySavoirEtInnovationId(@PathVariable Long id){
        return evenementColloqueScienntifiqueService.deleteBySavoirEtInnovationId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<EvenementColloqueScienntifique> findByEtatEtapeCampagneCode(@PathVariable String code){
        return evenementColloqueScienntifiqueService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return evenementColloqueScienntifiqueService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<EvenementColloqueScienntifique> findByEtatEtapeCampagneId(@PathVariable Long id){
        return evenementColloqueScienntifiqueService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return evenementColloqueScienntifiqueService.deleteByEtatEtapeCampagneId(id);
        }



            }
