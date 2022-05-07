package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.ConseilEtComiteScientifiqueAdminService;

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
import com.ird.faa.bean.ConseilEtComiteScientifique;
import com.ird.faa.ws.rest.provided.converter.ConseilEtComiteScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.ConseilEtComiteScientifiqueVo;

@Api("Manages conseilEtComiteScientifique services")
@RestController
@RequestMapping("api/admin/conseilEtComiteScientifique")
public class ConseilEtComiteScientifiqueRestAdmin {

@Autowired
private ConseilEtComiteScientifiqueAdminService conseilEtComiteScientifiqueService;

@Autowired
private ConseilEtComiteScientifiqueConverter conseilEtComiteScientifiqueConverter;


            @ApiOperation("Updates the specified  conseilEtComiteScientifique")
            @PutMapping("/")
            public  ConseilEtComiteScientifiqueVo update(@RequestBody  ConseilEtComiteScientifiqueVo  conseilEtComiteScientifiqueVo){
            ConseilEtComiteScientifique conseilEtComiteScientifique = conseilEtComiteScientifiqueConverter.toItem(conseilEtComiteScientifiqueVo);
            conseilEtComiteScientifique = conseilEtComiteScientifiqueService.update(conseilEtComiteScientifique);
            return conseilEtComiteScientifiqueConverter.toVo(conseilEtComiteScientifique);
            }

    @ApiOperation("Finds a list of all conseilEtComiteScientifiques")
    @GetMapping("/")
    public List<ConseilEtComiteScientifiqueVo> findAll(){
        return conseilEtComiteScientifiqueConverter.toVo(conseilEtComiteScientifiqueService.findAll());
    }

    @ApiOperation("Finds a conseilEtComiteScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ConseilEtComiteScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return conseilEtComiteScientifiqueConverter.toVo(conseilEtComiteScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search conseilEtComiteScientifique by a specific criteria")
    @PostMapping("/search")
    public List<ConseilEtComiteScientifiqueVo> findByCriteria(@RequestBody ConseilEtComiteScientifiqueVo conseilEtComiteScientifiqueVo){
        return conseilEtComiteScientifiqueConverter.toVo(conseilEtComiteScientifiqueService.findByCriteria(conseilEtComiteScientifiqueVo));
        }

            @ApiOperation("Finds a conseilEtComiteScientifique by id")
            @GetMapping("/id/{id}")
            public ConseilEtComiteScientifiqueVo findById(@PathVariable Long id){
            return conseilEtComiteScientifiqueConverter.toVo(conseilEtComiteScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  conseilEtComiteScientifique")
            @PostMapping("/")
            public ConseilEtComiteScientifiqueVo save(@RequestBody ConseilEtComiteScientifiqueVo conseilEtComiteScientifiqueVo){
            ConseilEtComiteScientifique conseilEtComiteScientifique = conseilEtComiteScientifiqueConverter.toItem(conseilEtComiteScientifiqueVo);
            conseilEtComiteScientifique = conseilEtComiteScientifiqueService.save(conseilEtComiteScientifique);
            return conseilEtComiteScientifiqueConverter.toVo(conseilEtComiteScientifique);
            }

            @ApiOperation("Delete the specified conseilEtComiteScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody ConseilEtComiteScientifiqueVo conseilEtComiteScientifiqueVo){
            ConseilEtComiteScientifique conseilEtComiteScientifique = conseilEtComiteScientifiqueConverter.toItem(conseilEtComiteScientifiqueVo);
            return conseilEtComiteScientifiqueService.delete(conseilEtComiteScientifique);
            }

            @ApiOperation("Deletes a conseilEtComiteScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return conseilEtComiteScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<ConseilEtComiteScientifique> findByPaysCode(@PathVariable String code){
        return conseilEtComiteScientifiqueService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return conseilEtComiteScientifiqueService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<ConseilEtComiteScientifique> findByPaysId(@PathVariable Long id){
        return conseilEtComiteScientifiqueService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return conseilEtComiteScientifiqueService.deleteByPaysId(id);
        }

        @ApiOperation("find by etablissement code")
        @GetMapping("/etablissement/code/{code}")
        public List<ConseilEtComiteScientifique> findByEtablissementCode(@PathVariable String code){
        return conseilEtComiteScientifiqueService.findByEtablissementCode(code);
        }

        @ApiOperation("delete by etablissement code")
        @DeleteMapping("/etablissement/code/{code}")
        public int deleteByEtablissementCode(@PathVariable String code){
        return conseilEtComiteScientifiqueService.deleteByEtablissementCode(code);
        }

        @ApiOperation("find by etablissement id")
        @GetMapping("/etablissement/id/{id}")
        public List<ConseilEtComiteScientifique> findByEtablissementId(@PathVariable Long id){
        return conseilEtComiteScientifiqueService.findByEtablissementId(id);
        }

        @ApiOperation("delete by etablissement id")
        @DeleteMapping("/etablissement/id/{id}")
        public int deleteByEtablissementId(@PathVariable Long id){
        return conseilEtComiteScientifiqueService.deleteByEtablissementId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<ConseilEtComiteScientifique> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return conseilEtComiteScientifiqueService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return conseilEtComiteScientifiqueService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<ConseilEtComiteScientifique> findByChercheurId(@PathVariable Long id){
        return conseilEtComiteScientifiqueService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return conseilEtComiteScientifiqueService.deleteByChercheurId(id);
        }

        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<ConseilEtComiteScientifique> findByCampagneCode(@PathVariable String code){
        return conseilEtComiteScientifiqueService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return conseilEtComiteScientifiqueService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<ConseilEtComiteScientifique> findByCampagneId(@PathVariable Long id){
        return conseilEtComiteScientifiqueService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return conseilEtComiteScientifiqueService.deleteByCampagneId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<ConseilEtComiteScientifique> findByEtatEtapeCampagneCode(@PathVariable String code){
        return conseilEtComiteScientifiqueService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return conseilEtComiteScientifiqueService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<ConseilEtComiteScientifique> findByEtatEtapeCampagneId(@PathVariable Long id){
        return conseilEtComiteScientifiqueService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return conseilEtComiteScientifiqueService.deleteByEtatEtapeCampagneId(id);
        }



            }
