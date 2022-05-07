package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.EtablissementProjetChercheurService;

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
import com.ird.faa.bean.EtablissementProjet;
import com.ird.faa.ws.rest.provided.converter.EtablissementProjetConverter;
import com.ird.faa.ws.rest.provided.vo.EtablissementProjetVo;

@Api("Manages etablissementProjet services")
@RestController
@RequestMapping("api/chercheur/etablissementProjet")
public class EtablissementProjetRestChercheur {

@Autowired
private EtablissementProjetChercheurService etablissementProjetService;

@Autowired
private EtablissementProjetConverter etablissementProjetConverter;


            @ApiOperation("Updates the specified  etablissementProjet")
            @PutMapping("/")
            public  EtablissementProjetVo update(@RequestBody  EtablissementProjetVo  etablissementProjetVo){
            EtablissementProjet etablissementProjet = etablissementProjetConverter.toItem(etablissementProjetVo);
            etablissementProjet = etablissementProjetService.update(etablissementProjet);
            return etablissementProjetConverter.toVo(etablissementProjet);
            }

    @ApiOperation("Finds a list of all etablissementProjets")
    @GetMapping("/")
    public List<EtablissementProjetVo> findAll(){
        return etablissementProjetConverter.toVo(etablissementProjetService.findAll());
    }

    @ApiOperation("Finds a etablissementProjet with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EtablissementProjetVo findByIdWithAssociatedList(@PathVariable Long id){
    return etablissementProjetConverter.toVo(etablissementProjetService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search etablissementProjet by a specific criteria")
    @PostMapping("/search")
    public List<EtablissementProjetVo> findByCriteria(@RequestBody EtablissementProjetVo etablissementProjetVo){
        return etablissementProjetConverter.toVo(etablissementProjetService.findByCriteria(etablissementProjetVo));
        }

            @ApiOperation("Finds a etablissementProjet by id")
            @GetMapping("/id/{id}")
            public EtablissementProjetVo findById(@PathVariable Long id){
            return etablissementProjetConverter.toVo(etablissementProjetService.findById(id));
            }

            @ApiOperation("Saves the specified  etablissementProjet")
            @PostMapping("/")
            public EtablissementProjetVo save(@RequestBody EtablissementProjetVo etablissementProjetVo){
            EtablissementProjet etablissementProjet = etablissementProjetConverter.toItem(etablissementProjetVo);
            etablissementProjet = etablissementProjetService.save(etablissementProjet);
            return etablissementProjetConverter.toVo(etablissementProjet);
            }

            @ApiOperation("Delete the specified etablissementProjet")
            @DeleteMapping("/")
            public int delete(@RequestBody EtablissementProjetVo etablissementProjetVo){
            EtablissementProjet etablissementProjet = etablissementProjetConverter.toItem(etablissementProjetVo);
            return etablissementProjetService.delete(etablissementProjet);
            }

            @ApiOperation("Deletes a etablissementProjet by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return etablissementProjetService.deleteById(id);
            }
        @ApiOperation("find by ville code")
        @GetMapping("/ville/code/{code}")
        public List<EtablissementProjet> findByVilleCode(@PathVariable String code){
        return etablissementProjetService.findByVilleCode(code);
        }

        @ApiOperation("delete by ville code")
        @DeleteMapping("/ville/code/{code}")
        public int deleteByVilleCode(@PathVariable String code){
        return etablissementProjetService.deleteByVilleCode(code);
        }

        @ApiOperation("find by ville id")
        @GetMapping("/ville/id/{id}")
        public List<EtablissementProjet> findByVilleId(@PathVariable Long id){
        return etablissementProjetService.findByVilleId(id);
        }

        @ApiOperation("delete by ville id")
        @DeleteMapping("/ville/id/{id}")
        public int deleteByVilleId(@PathVariable Long id){
        return etablissementProjetService.deleteByVilleId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<EtablissementProjet> findByPaysCode(@PathVariable String code){
        return etablissementProjetService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return etablissementProjetService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<EtablissementProjet> findByPaysId(@PathVariable Long id){
        return etablissementProjetService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return etablissementProjetService.deleteByPaysId(id);
        }



            }
