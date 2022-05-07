package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ReclamationChercheurService;

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
import com.ird.faa.bean.Reclamation;
import com.ird.faa.ws.rest.provided.converter.ReclamationConverter;
import com.ird.faa.ws.rest.provided.vo.ReclamationVo;

@Api("Manages reclamation services")
@RestController
@RequestMapping("api/chercheur/reclamation")
public class ReclamationRestChercheur {

@Autowired
private ReclamationChercheurService reclamationService;

@Autowired
private ReclamationConverter reclamationConverter;


            @ApiOperation("Updates the specified  reclamation")
            @PutMapping("/")
            public  ReclamationVo update(@RequestBody  ReclamationVo  reclamationVo){
            Reclamation reclamation = reclamationConverter.toItem(reclamationVo);
            reclamation = reclamationService.update(reclamation);
            return reclamationConverter.toVo(reclamation);
            }

    @ApiOperation("Finds a list of all reclamations")
    @GetMapping("/")
    public List<ReclamationVo> findAll(){
        return reclamationConverter.toVo(reclamationService.findAll());
    }

    @ApiOperation("Finds a reclamation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ReclamationVo findByIdWithAssociatedList(@PathVariable Long id){
    return reclamationConverter.toVo(reclamationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search reclamation by a specific criteria")
    @PostMapping("/search")
    public List<ReclamationVo> findByCriteria(@RequestBody ReclamationVo reclamationVo){
        return reclamationConverter.toVo(reclamationService.findByCriteria(reclamationVo));
        }

            @ApiOperation("Finds a reclamation by id")
            @GetMapping("/id/{id}")
            public ReclamationVo findById(@PathVariable Long id){
            return reclamationConverter.toVo(reclamationService.findById(id));
            }

            @ApiOperation("Saves the specified  reclamation")
            @PostMapping("/")
            public ReclamationVo save(@RequestBody ReclamationVo reclamationVo){
            Reclamation reclamation = reclamationConverter.toItem(reclamationVo);
            reclamation = reclamationService.save(reclamation);
            return reclamationConverter.toVo(reclamation);
            }

            @ApiOperation("Delete the specified reclamation")
            @DeleteMapping("/")
            public int delete(@RequestBody ReclamationVo reclamationVo){
            Reclamation reclamation = reclamationConverter.toItem(reclamationVo);
            return reclamationService.delete(reclamation);
            }

            @ApiOperation("Deletes a reclamation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return reclamationService.deleteById(id);
            }
        @ApiOperation("find by etatReclamation code")
        @GetMapping("/etatReclamation/code/{code}")
        public List<Reclamation> findByEtatReclamationCode(@PathVariable String code){
        return reclamationService.findByEtatReclamationCode(code);
        }

        @ApiOperation("delete by etatReclamation code")
        @DeleteMapping("/etatReclamation/code/{code}")
        public int deleteByEtatReclamationCode(@PathVariable String code){
        return reclamationService.deleteByEtatReclamationCode(code);
        }

        @ApiOperation("find by etatReclamation id")
        @GetMapping("/etatReclamation/id/{id}")
        public List<Reclamation> findByEtatReclamationId(@PathVariable Long id){
        return reclamationService.findByEtatReclamationId(id);
        }

        @ApiOperation("delete by etatReclamation id")
        @DeleteMapping("/etatReclamation/id/{id}")
        public int deleteByEtatReclamationId(@PathVariable Long id){
        return reclamationService.deleteByEtatReclamationId(id);
        }

        @ApiOperation("find by typeReclamation code")
        @GetMapping("/typeReclamation/code/{code}")
        public List<Reclamation> findByTypeReclamationCode(@PathVariable String code){
        return reclamationService.findByTypeReclamationCode(code);
        }

        @ApiOperation("delete by typeReclamation code")
        @DeleteMapping("/typeReclamation/code/{code}")
        public int deleteByTypeReclamationCode(@PathVariable String code){
        return reclamationService.deleteByTypeReclamationCode(code);
        }

        @ApiOperation("find by typeReclamation id")
        @GetMapping("/typeReclamation/id/{id}")
        public List<Reclamation> findByTypeReclamationId(@PathVariable Long id){
        return reclamationService.findByTypeReclamationId(id);
        }

        @ApiOperation("delete by typeReclamation id")
        @DeleteMapping("/typeReclamation/id/{id}")
        public int deleteByTypeReclamationId(@PathVariable Long id){
        return reclamationService.deleteByTypeReclamationId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<Reclamation> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return reclamationService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return reclamationService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<Reclamation> findByChercheurId(@PathVariable Long id){
        return reclamationService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return reclamationService.deleteByChercheurId(id);
        }



            }
