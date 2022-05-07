package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueChercheurService;

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
import com.ird.faa.bean.TypeSavoirDeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.ws.rest.provided.converter.TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo;

@Api("Manages typeSavoirDeveloppementDeSavoirEtInnovationScientifique services")
@RestController
@RequestMapping("api/chercheur/typeSavoirDeveloppementDeSavoirEtInnovationScientifique")
public class TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueRestChercheur {

@Autowired
private TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueChercheurService typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService;

@Autowired
private TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter;


            @ApiOperation("Updates the specified  typeSavoirDeveloppementDeSavoirEtInnovationScientifique")
            @PutMapping("/")
            public  TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo update(@RequestBody  TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo  typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo){
            TypeSavoirDeveloppementDeSavoirEtInnovationScientifique typeSavoirDeveloppementDeSavoirEtInnovationScientifique = typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.toItem(typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo);
            typeSavoirDeveloppementDeSavoirEtInnovationScientifique = typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.update(typeSavoirDeveloppementDeSavoirEtInnovationScientifique);
            return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.toVo(typeSavoirDeveloppementDeSavoirEtInnovationScientifique);
            }

    @ApiOperation("Finds a list of all typeSavoirDeveloppementDeSavoirEtInnovationScientifiques")
    @GetMapping("/")
    public List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo> findAll(){
        return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.toVo(typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.findAll());
    }

    @ApiOperation("Finds a typeSavoirDeveloppementDeSavoirEtInnovationScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.toVo(typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeSavoirDeveloppementDeSavoirEtInnovationScientifique by a specific criteria")
    @PostMapping("/search")
    public List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo> findByCriteria(@RequestBody TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo){
        return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.toVo(typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.findByCriteria(typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo));
        }

            @ApiOperation("Finds a typeSavoirDeveloppementDeSavoirEtInnovationScientifique by id")
            @GetMapping("/id/{id}")
            public TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo findById(@PathVariable Long id){
            return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.toVo(typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  typeSavoirDeveloppementDeSavoirEtInnovationScientifique")
            @PostMapping("/")
            public TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo save(@RequestBody TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo){
            TypeSavoirDeveloppementDeSavoirEtInnovationScientifique typeSavoirDeveloppementDeSavoirEtInnovationScientifique = typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.toItem(typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo);
            typeSavoirDeveloppementDeSavoirEtInnovationScientifique = typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.save(typeSavoirDeveloppementDeSavoirEtInnovationScientifique);
            return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.toVo(typeSavoirDeveloppementDeSavoirEtInnovationScientifique);
            }

            @ApiOperation("Delete the specified typeSavoirDeveloppementDeSavoirEtInnovationScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo){
            TypeSavoirDeveloppementDeSavoirEtInnovationScientifique typeSavoirDeveloppementDeSavoirEtInnovationScientifique = typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.toItem(typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo);
            return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.delete(typeSavoirDeveloppementDeSavoirEtInnovationScientifique);
            }

            @ApiOperation("Deletes a typeSavoirDeveloppementDeSavoirEtInnovationScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by developpementDeSavoirEtInnovationScientifique id")
        @GetMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> findByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }

        @ApiOperation("delete by developpementDeSavoirEtInnovationScientifique id")
        @DeleteMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }

        @ApiOperation("find by typeSavoir code")
        @GetMapping("/typeSavoir/code/{code}")
        public List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> findByTypeSavoirCode(@PathVariable String code){
        return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.findByTypeSavoirCode(code);
        }

        @ApiOperation("delete by typeSavoir code")
        @DeleteMapping("/typeSavoir/code/{code}")
        public int deleteByTypeSavoirCode(@PathVariable String code){
        return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.deleteByTypeSavoirCode(code);
        }

        @ApiOperation("find by typeSavoir id")
        @GetMapping("/typeSavoir/id/{id}")
        public List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> findByTypeSavoirId(@PathVariable Long id){
        return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.findByTypeSavoirId(id);
        }

        @ApiOperation("delete by typeSavoir id")
        @DeleteMapping("/typeSavoir/id/{id}")
        public int deleteByTypeSavoirId(@PathVariable Long id){
        return typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.deleteByTypeSavoirId(id);
        }



            }
