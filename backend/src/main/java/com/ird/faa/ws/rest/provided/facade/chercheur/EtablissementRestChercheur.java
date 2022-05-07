package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.EtablissementChercheurService;

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
import com.ird.faa.bean.Etablissement;
import com.ird.faa.ws.rest.provided.converter.EtablissementConverter;
import com.ird.faa.ws.rest.provided.vo.EtablissementVo;

@Api("Manages etablissement services")
@RestController
@RequestMapping("api/chercheur/etablissement")
public class EtablissementRestChercheur {

@Autowired
private EtablissementChercheurService etablissementService;

@Autowired
private EtablissementConverter etablissementConverter;


            @ApiOperation("Updates the specified  etablissement")
            @PutMapping("/")
            public  EtablissementVo update(@RequestBody  EtablissementVo  etablissementVo){
            Etablissement etablissement = etablissementConverter.toItem(etablissementVo);
            etablissement = etablissementService.update(etablissement);
            return etablissementConverter.toVo(etablissement);
            }

    @ApiOperation("Finds a list of all etablissements")
    @GetMapping("/")
    public List<EtablissementVo> findAll(){
        return etablissementConverter.toVo(etablissementService.findAll());
    }

    @ApiOperation("Finds a etablissement with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EtablissementVo findByIdWithAssociatedList(@PathVariable Long id){
    return etablissementConverter.toVo(etablissementService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search etablissement by a specific criteria")
    @PostMapping("/search")
    public List<EtablissementVo> findByCriteria(@RequestBody EtablissementVo etablissementVo){
        return etablissementConverter.toVo(etablissementService.findByCriteria(etablissementVo));
        }

            @ApiOperation("Finds a etablissement by id")
            @GetMapping("/id/{id}")
            public EtablissementVo findById(@PathVariable Long id){
            return etablissementConverter.toVo(etablissementService.findById(id));
            }

            @ApiOperation("Saves the specified  etablissement")
            @PostMapping("/")
            public EtablissementVo save(@RequestBody EtablissementVo etablissementVo){
            Etablissement etablissement = etablissementConverter.toItem(etablissementVo);
            etablissement = etablissementService.save(etablissement);
            return etablissementConverter.toVo(etablissement);
            }

            @ApiOperation("Delete the specified etablissement")
            @DeleteMapping("/")
            public int delete(@RequestBody EtablissementVo etablissementVo){
            Etablissement etablissement = etablissementConverter.toItem(etablissementVo);
            return etablissementService.delete(etablissement);
            }

            @ApiOperation("Deletes a etablissement by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return etablissementService.deleteById(id);
            }
        @ApiOperation("find by ville code")
        @GetMapping("/ville/code/{code}")
        public List<Etablissement> findByVilleCode(@PathVariable String code){
        return etablissementService.findByVilleCode(code);
        }

        @ApiOperation("delete by ville code")
        @DeleteMapping("/ville/code/{code}")
        public int deleteByVilleCode(@PathVariable String code){
        return etablissementService.deleteByVilleCode(code);
        }

        @ApiOperation("find by ville id")
        @GetMapping("/ville/id/{id}")
        public List<Etablissement> findByVilleId(@PathVariable Long id){
        return etablissementService.findByVilleId(id);
        }

        @ApiOperation("delete by ville id")
        @DeleteMapping("/ville/id/{id}")
        public int deleteByVilleId(@PathVariable Long id){
        return etablissementService.deleteByVilleId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<Etablissement> findByPaysCode(@PathVariable String code){
        return etablissementService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return etablissementService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<Etablissement> findByPaysId(@PathVariable Long id){
        return etablissementService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return etablissementService.deleteByPaysId(id);
        }



            }
