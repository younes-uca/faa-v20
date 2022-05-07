package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.EncadrementDoctorantChercheurService;

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
import com.ird.faa.bean.EncadrementDoctorant;
import com.ird.faa.ws.rest.provided.converter.EncadrementDoctorantConverter;
import com.ird.faa.ws.rest.provided.vo.EncadrementDoctorantVo;

@Api("Manages encadrementDoctorant services")
@RestController
@RequestMapping("api/chercheur/encadrementDoctorant")
public class EncadrementDoctorantRestChercheur {

@Autowired
private EncadrementDoctorantChercheurService encadrementDoctorantService;

@Autowired
private EncadrementDoctorantConverter encadrementDoctorantConverter;


            @ApiOperation("Updates the specified  encadrementDoctorant")
            @PutMapping("/")
            public  EncadrementDoctorantVo update(@RequestBody  EncadrementDoctorantVo  encadrementDoctorantVo){
            EncadrementDoctorant encadrementDoctorant = encadrementDoctorantConverter.toItem(encadrementDoctorantVo);
            encadrementDoctorant = encadrementDoctorantService.update(encadrementDoctorant);
            return encadrementDoctorantConverter.toVo(encadrementDoctorant);
            }

    @ApiOperation("Finds a list of all encadrementDoctorants")
    @GetMapping("/")
    public List<EncadrementDoctorantVo> findAll(){
        return encadrementDoctorantConverter.toVo(encadrementDoctorantService.findAll());
    }

    @ApiOperation("Finds a encadrementDoctorant with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EncadrementDoctorantVo findByIdWithAssociatedList(@PathVariable Long id){
    return encadrementDoctorantConverter.toVo(encadrementDoctorantService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search encadrementDoctorant by a specific criteria")
    @PostMapping("/search")
    public List<EncadrementDoctorantVo> findByCriteria(@RequestBody EncadrementDoctorantVo encadrementDoctorantVo){
        return encadrementDoctorantConverter.toVo(encadrementDoctorantService.findByCriteria(encadrementDoctorantVo));
        }

            @ApiOperation("Finds a encadrementDoctorant by id")
            @GetMapping("/id/{id}")
            public EncadrementDoctorantVo findById(@PathVariable Long id){
            return encadrementDoctorantConverter.toVo(encadrementDoctorantService.findById(id));
            }

            @ApiOperation("Saves the specified  encadrementDoctorant")
            @PostMapping("/")
            public EncadrementDoctorantVo save(@RequestBody EncadrementDoctorantVo encadrementDoctorantVo){
            EncadrementDoctorant encadrementDoctorant = encadrementDoctorantConverter.toItem(encadrementDoctorantVo);
            encadrementDoctorant = encadrementDoctorantService.save(encadrementDoctorant);
            return encadrementDoctorantConverter.toVo(encadrementDoctorant);
            }

            @ApiOperation("Delete the specified encadrementDoctorant")
            @DeleteMapping("/")
            public int delete(@RequestBody EncadrementDoctorantVo encadrementDoctorantVo){
            EncadrementDoctorant encadrementDoctorant = encadrementDoctorantConverter.toItem(encadrementDoctorantVo);
            return encadrementDoctorantService.delete(encadrementDoctorant);
            }

            @ApiOperation("Deletes a encadrementDoctorant by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return encadrementDoctorantService.deleteById(id);
            }
        @ApiOperation("find by responsabiliteEncadrementDoctorant code")
        @GetMapping("/responsabiliteEncadrementDoctorant/code/{code}")
        public List<EncadrementDoctorant> findByResponsabiliteEncadrementDoctorantCode(@PathVariable String code){
        return encadrementDoctorantService.findByResponsabiliteEncadrementDoctorantCode(code);
        }

        @ApiOperation("delete by responsabiliteEncadrementDoctorant code")
        @DeleteMapping("/responsabiliteEncadrementDoctorant/code/{code}")
        public int deleteByResponsabiliteEncadrementDoctorantCode(@PathVariable String code){
        return encadrementDoctorantService.deleteByResponsabiliteEncadrementDoctorantCode(code);
        }

        @ApiOperation("find by responsabiliteEncadrementDoctorant id")
        @GetMapping("/responsabiliteEncadrementDoctorant/id/{id}")
        public List<EncadrementDoctorant> findByResponsabiliteEncadrementDoctorantId(@PathVariable Long id){
        return encadrementDoctorantService.findByResponsabiliteEncadrementDoctorantId(id);
        }

        @ApiOperation("delete by responsabiliteEncadrementDoctorant id")
        @DeleteMapping("/responsabiliteEncadrementDoctorant/id/{id}")
        public int deleteByResponsabiliteEncadrementDoctorantId(@PathVariable Long id){
        return encadrementDoctorantService.deleteByResponsabiliteEncadrementDoctorantId(id);
        }

        @ApiOperation("find by financementDoctorant code")
        @GetMapping("/financementDoctorant/code/{code}")
        public List<EncadrementDoctorant> findByFinancementDoctorantCode(@PathVariable String code){
        return encadrementDoctorantService.findByFinancementDoctorantCode(code);
        }

        @ApiOperation("delete by financementDoctorant code")
        @DeleteMapping("/financementDoctorant/code/{code}")
        public int deleteByFinancementDoctorantCode(@PathVariable String code){
        return encadrementDoctorantService.deleteByFinancementDoctorantCode(code);
        }

        @ApiOperation("find by financementDoctorant id")
        @GetMapping("/financementDoctorant/id/{id}")
        public List<EncadrementDoctorant> findByFinancementDoctorantId(@PathVariable Long id){
        return encadrementDoctorantService.findByFinancementDoctorantId(id);
        }

        @ApiOperation("delete by financementDoctorant id")
        @DeleteMapping("/financementDoctorant/id/{id}")
        public int deleteByFinancementDoctorantId(@PathVariable Long id){
        return encadrementDoctorantService.deleteByFinancementDoctorantId(id);
        }

        @ApiOperation("find by etablissement code")
        @GetMapping("/etablissement/code/{code}")
        public List<EncadrementDoctorant> findByEtablissementCode(@PathVariable String code){
        return encadrementDoctorantService.findByEtablissementCode(code);
        }

        @ApiOperation("delete by etablissement code")
        @DeleteMapping("/etablissement/code/{code}")
        public int deleteByEtablissementCode(@PathVariable String code){
        return encadrementDoctorantService.deleteByEtablissementCode(code);
        }

        @ApiOperation("find by etablissement id")
        @GetMapping("/etablissement/id/{id}")
        public List<EncadrementDoctorant> findByEtablissementId(@PathVariable Long id){
        return encadrementDoctorantService.findByEtablissementId(id);
        }

        @ApiOperation("delete by etablissement id")
        @DeleteMapping("/etablissement/id/{id}")
        public int deleteByEtablissementId(@PathVariable Long id){
        return encadrementDoctorantService.deleteByEtablissementId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<EncadrementDoctorant> findByPaysCode(@PathVariable String code){
        return encadrementDoctorantService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return encadrementDoctorantService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<EncadrementDoctorant> findByPaysId(@PathVariable Long id){
        return encadrementDoctorantService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return encadrementDoctorantService.deleteByPaysId(id);
        }

        @ApiOperation("find by doctorant id")
        @GetMapping("/doctorant/id/{id}")
        public List<EncadrementDoctorant> findByDoctorantId(@PathVariable Long id){
        return encadrementDoctorantService.findByDoctorantId(id);
        }

        @ApiOperation("delete by doctorant id")
        @DeleteMapping("/doctorant/id/{id}")
        public int deleteByDoctorantId(@PathVariable Long id){
        return encadrementDoctorantService.deleteByDoctorantId(id);
        }

        @ApiOperation("find by encadrement id")
        @GetMapping("/encadrement/id/{id}")
        public List<EncadrementDoctorant> findByEncadrementId(@PathVariable Long id){
        return encadrementDoctorantService.findByEncadrementId(id);
        }

        @ApiOperation("delete by encadrement id")
        @DeleteMapping("/encadrement/id/{id}")
        public int deleteByEncadrementId(@PathVariable Long id){
        return encadrementDoctorantService.deleteByEncadrementId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<EncadrementDoctorant> findByEtatEtapeCampagneCode(@PathVariable String code){
        return encadrementDoctorantService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return encadrementDoctorantService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<EncadrementDoctorant> findByEtatEtapeCampagneId(@PathVariable Long id){
        return encadrementDoctorantService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return encadrementDoctorantService.deleteByEtatEtapeCampagneId(id);
        }



            }
