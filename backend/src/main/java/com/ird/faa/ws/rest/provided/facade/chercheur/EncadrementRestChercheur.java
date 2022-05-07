package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.EncadrementChercheurService;

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
import com.ird.faa.bean.Encadrement;
import com.ird.faa.ws.rest.provided.converter.EncadrementConverter;
import com.ird.faa.ws.rest.provided.vo.EncadrementVo;

@Api("Manages encadrement services")
@RestController
@RequestMapping("api/chercheur/encadrement")
public class EncadrementRestChercheur {

@Autowired
private EncadrementChercheurService encadrementService;

@Autowired
private EncadrementConverter encadrementConverter;


            @ApiOperation("Updates the specified  encadrement")
            @PutMapping("/")
            public  EncadrementVo update(@RequestBody  EncadrementVo  encadrementVo){
            Encadrement encadrement = encadrementConverter.toItem(encadrementVo);
            encadrement = encadrementService.update(encadrement);
            return encadrementConverter.toVo(encadrement);
            }

    @ApiOperation("Finds a list of all encadrements")
    @GetMapping("/")
    public List<EncadrementVo> findAll(){
        return encadrementConverter.toVo(encadrementService.findAll());
    }

    @ApiOperation("Finds a encadrement with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EncadrementVo findByIdWithAssociatedList(@PathVariable Long id){
    return encadrementConverter.toVo(encadrementService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search encadrement by a specific criteria")
    @PostMapping("/search")
    public List<EncadrementVo> findByCriteria(@RequestBody EncadrementVo encadrementVo){
        return encadrementConverter.toVo(encadrementService.findByCriteria(encadrementVo));
        }

            @ApiOperation("Finds a encadrement by id")
            @GetMapping("/id/{id}")
            public EncadrementVo findById(@PathVariable Long id){
            return encadrementConverter.toVo(encadrementService.findById(id));
            }

            @ApiOperation("Saves the specified  encadrement")
            @PostMapping("/")
            public EncadrementVo save(@RequestBody EncadrementVo encadrementVo){
            Encadrement encadrement = encadrementConverter.toItem(encadrementVo);
            encadrement = encadrementService.save(encadrement);
            return encadrementConverter.toVo(encadrement);
            }

            @ApiOperation("Delete the specified encadrement")
            @DeleteMapping("/")
            public int delete(@RequestBody EncadrementVo encadrementVo){
            Encadrement encadrement = encadrementConverter.toItem(encadrementVo);
            return encadrementService.delete(encadrement);
            }

            @ApiOperation("Deletes a encadrement by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return encadrementService.deleteById(id);
            }
        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<Encadrement> findByCampagneCode(@PathVariable String code){
        return encadrementService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return encadrementService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<Encadrement> findByCampagneId(@PathVariable Long id){
        return encadrementService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return encadrementService.deleteByCampagneId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<Encadrement> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return encadrementService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return encadrementService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<Encadrement> findByChercheurId(@PathVariable Long id){
        return encadrementService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return encadrementService.deleteByChercheurId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<Encadrement> findByEtatEtapeCampagneCode(@PathVariable String code){
        return encadrementService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return encadrementService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<Encadrement> findByEtatEtapeCampagneId(@PathVariable Long id){
        return encadrementService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return encadrementService.deleteByEtatEtapeCampagneId(id);
        }


            @GetMapping("/username/{username}/id/{compagneId}")
            public List<EncadrementVo> findByChercheurUsernameAndCampagneId(@PathVariable String username,@PathVariable Long compagneId){
            return encadrementConverter.toVo(encadrementService.findByChercheurUsernameAndCampagneId(username,compagneId));
            }

            }
