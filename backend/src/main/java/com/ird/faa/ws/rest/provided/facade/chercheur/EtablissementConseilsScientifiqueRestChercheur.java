package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.EtablissementConseilsScientifiqueChercheurService;

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
import com.ird.faa.bean.EtablissementConseilsScientifique;
import com.ird.faa.ws.rest.provided.converter.EtablissementConseilsScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.EtablissementConseilsScientifiqueVo;

@Api("Manages etablissementConseilsScientifique services")
@RestController
@RequestMapping("api/chercheur/etablissementConseilsScientifique")
public class EtablissementConseilsScientifiqueRestChercheur {

@Autowired
private EtablissementConseilsScientifiqueChercheurService etablissementConseilsScientifiqueService;

@Autowired
private EtablissementConseilsScientifiqueConverter etablissementConseilsScientifiqueConverter;


            @ApiOperation("Updates the specified  etablissementConseilsScientifique")
            @PutMapping("/")
            public  EtablissementConseilsScientifiqueVo update(@RequestBody  EtablissementConseilsScientifiqueVo  etablissementConseilsScientifiqueVo){
            EtablissementConseilsScientifique etablissementConseilsScientifique = etablissementConseilsScientifiqueConverter.toItem(etablissementConseilsScientifiqueVo);
            etablissementConseilsScientifique = etablissementConseilsScientifiqueService.update(etablissementConseilsScientifique);
            return etablissementConseilsScientifiqueConverter.toVo(etablissementConseilsScientifique);
            }

    @ApiOperation("Finds a list of all etablissementConseilsScientifiques")
    @GetMapping("/")
    public List<EtablissementConseilsScientifiqueVo> findAll(){
        return etablissementConseilsScientifiqueConverter.toVo(etablissementConseilsScientifiqueService.findAll());
    }

    @ApiOperation("Finds a etablissementConseilsScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EtablissementConseilsScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return etablissementConseilsScientifiqueConverter.toVo(etablissementConseilsScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search etablissementConseilsScientifique by a specific criteria")
    @PostMapping("/search")
    public List<EtablissementConseilsScientifiqueVo> findByCriteria(@RequestBody EtablissementConseilsScientifiqueVo etablissementConseilsScientifiqueVo){
        return etablissementConseilsScientifiqueConverter.toVo(etablissementConseilsScientifiqueService.findByCriteria(etablissementConseilsScientifiqueVo));
        }

            @ApiOperation("Finds a etablissementConseilsScientifique by id")
            @GetMapping("/id/{id}")
            public EtablissementConseilsScientifiqueVo findById(@PathVariable Long id){
            return etablissementConseilsScientifiqueConverter.toVo(etablissementConseilsScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  etablissementConseilsScientifique")
            @PostMapping("/")
            public EtablissementConseilsScientifiqueVo save(@RequestBody EtablissementConseilsScientifiqueVo etablissementConseilsScientifiqueVo){
            EtablissementConseilsScientifique etablissementConseilsScientifique = etablissementConseilsScientifiqueConverter.toItem(etablissementConseilsScientifiqueVo);
            etablissementConseilsScientifique = etablissementConseilsScientifiqueService.save(etablissementConseilsScientifique);
            return etablissementConseilsScientifiqueConverter.toVo(etablissementConseilsScientifique);
            }

            @ApiOperation("Delete the specified etablissementConseilsScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody EtablissementConseilsScientifiqueVo etablissementConseilsScientifiqueVo){
            EtablissementConseilsScientifique etablissementConseilsScientifique = etablissementConseilsScientifiqueConverter.toItem(etablissementConseilsScientifiqueVo);
            return etablissementConseilsScientifiqueService.delete(etablissementConseilsScientifique);
            }

            @ApiOperation("Deletes a etablissementConseilsScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return etablissementConseilsScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by conseilsScientifique id")
        @GetMapping("/conseilsScientifique/id/{id}")
        public List<EtablissementConseilsScientifique> findByConseilsScientifiqueId(@PathVariable Long id){
        return etablissementConseilsScientifiqueService.findByConseilsScientifiqueId(id);
        }

        @ApiOperation("delete by conseilsScientifique id")
        @DeleteMapping("/conseilsScientifique/id/{id}")
        public int deleteByConseilsScientifiqueId(@PathVariable Long id){
        return etablissementConseilsScientifiqueService.deleteByConseilsScientifiqueId(id);
        }

        @ApiOperation("find by etablissement code")
        @GetMapping("/etablissement/code/{code}")
        public List<EtablissementConseilsScientifique> findByEtablissementCode(@PathVariable String code){
        return etablissementConseilsScientifiqueService.findByEtablissementCode(code);
        }

        @ApiOperation("delete by etablissement code")
        @DeleteMapping("/etablissement/code/{code}")
        public int deleteByEtablissementCode(@PathVariable String code){
        return etablissementConseilsScientifiqueService.deleteByEtablissementCode(code);
        }

        @ApiOperation("find by etablissement id")
        @GetMapping("/etablissement/id/{id}")
        public List<EtablissementConseilsScientifique> findByEtablissementId(@PathVariable Long id){
        return etablissementConseilsScientifiqueService.findByEtablissementId(id);
        }

        @ApiOperation("delete by etablissement id")
        @DeleteMapping("/etablissement/id/{id}")
        public int deleteByEtablissementId(@PathVariable Long id){
        return etablissementConseilsScientifiqueService.deleteByEtablissementId(id);
        }



            }
