package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.TypeUtilisateurSavoirConcuChercheurService;

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
import com.ird.faa.bean.TypeUtilisateurSavoirConcu;
import com.ird.faa.ws.rest.provided.converter.TypeUtilisateurSavoirConcuConverter;
import com.ird.faa.ws.rest.provided.vo.TypeUtilisateurSavoirConcuVo;

@Api("Manages typeUtilisateurSavoirConcu services")
@RestController
@RequestMapping("api/chercheur/typeUtilisateurSavoirConcu")
public class TypeUtilisateurSavoirConcuRestChercheur {

@Autowired
private TypeUtilisateurSavoirConcuChercheurService typeUtilisateurSavoirConcuService;

@Autowired
private TypeUtilisateurSavoirConcuConverter typeUtilisateurSavoirConcuConverter;


            @ApiOperation("Updates the specified  typeUtilisateurSavoirConcu")
            @PutMapping("/")
            public  TypeUtilisateurSavoirConcuVo update(@RequestBody  TypeUtilisateurSavoirConcuVo  typeUtilisateurSavoirConcuVo){
            TypeUtilisateurSavoirConcu typeUtilisateurSavoirConcu = typeUtilisateurSavoirConcuConverter.toItem(typeUtilisateurSavoirConcuVo);
            typeUtilisateurSavoirConcu = typeUtilisateurSavoirConcuService.update(typeUtilisateurSavoirConcu);
            return typeUtilisateurSavoirConcuConverter.toVo(typeUtilisateurSavoirConcu);
            }

    @ApiOperation("Finds a list of all typeUtilisateurSavoirConcus")
    @GetMapping("/")
    public List<TypeUtilisateurSavoirConcuVo> findAll(){
        return typeUtilisateurSavoirConcuConverter.toVo(typeUtilisateurSavoirConcuService.findAll());
    }

    @ApiOperation("Finds a typeUtilisateurSavoirConcu with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeUtilisateurSavoirConcuVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeUtilisateurSavoirConcuConverter.toVo(typeUtilisateurSavoirConcuService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeUtilisateurSavoirConcu by a specific criteria")
    @PostMapping("/search")
    public List<TypeUtilisateurSavoirConcuVo> findByCriteria(@RequestBody TypeUtilisateurSavoirConcuVo typeUtilisateurSavoirConcuVo){
        return typeUtilisateurSavoirConcuConverter.toVo(typeUtilisateurSavoirConcuService.findByCriteria(typeUtilisateurSavoirConcuVo));
        }

            @ApiOperation("Finds a typeUtilisateurSavoirConcu by id")
            @GetMapping("/id/{id}")
            public TypeUtilisateurSavoirConcuVo findById(@PathVariable Long id){
            return typeUtilisateurSavoirConcuConverter.toVo(typeUtilisateurSavoirConcuService.findById(id));
            }

            @ApiOperation("Saves the specified  typeUtilisateurSavoirConcu")
            @PostMapping("/")
            public TypeUtilisateurSavoirConcuVo save(@RequestBody TypeUtilisateurSavoirConcuVo typeUtilisateurSavoirConcuVo){
            TypeUtilisateurSavoirConcu typeUtilisateurSavoirConcu = typeUtilisateurSavoirConcuConverter.toItem(typeUtilisateurSavoirConcuVo);
            typeUtilisateurSavoirConcu = typeUtilisateurSavoirConcuService.save(typeUtilisateurSavoirConcu);
            return typeUtilisateurSavoirConcuConverter.toVo(typeUtilisateurSavoirConcu);
            }

            @ApiOperation("Delete the specified typeUtilisateurSavoirConcu")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeUtilisateurSavoirConcuVo typeUtilisateurSavoirConcuVo){
            TypeUtilisateurSavoirConcu typeUtilisateurSavoirConcu = typeUtilisateurSavoirConcuConverter.toItem(typeUtilisateurSavoirConcuVo);
            return typeUtilisateurSavoirConcuService.delete(typeUtilisateurSavoirConcu);
            }

            @ApiOperation("Deletes a typeUtilisateurSavoirConcu by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeUtilisateurSavoirConcuService.deleteById(id);
            }
        @ApiOperation("find by typeUtilisateur code")
        @GetMapping("/typeUtilisateur/code/{code}")
        public List<TypeUtilisateurSavoirConcu> findByTypeUtilisateurCode(@PathVariable String code){
        return typeUtilisateurSavoirConcuService.findByTypeUtilisateurCode(code);
        }

        @ApiOperation("delete by typeUtilisateur code")
        @DeleteMapping("/typeUtilisateur/code/{code}")
        public int deleteByTypeUtilisateurCode(@PathVariable String code){
        return typeUtilisateurSavoirConcuService.deleteByTypeUtilisateurCode(code);
        }

        @ApiOperation("find by typeUtilisateur id")
        @GetMapping("/typeUtilisateur/id/{id}")
        public List<TypeUtilisateurSavoirConcu> findByTypeUtilisateurId(@PathVariable Long id){
        return typeUtilisateurSavoirConcuService.findByTypeUtilisateurId(id);
        }

        @ApiOperation("delete by typeUtilisateur id")
        @DeleteMapping("/typeUtilisateur/id/{id}")
        public int deleteByTypeUtilisateurId(@PathVariable Long id){
        return typeUtilisateurSavoirConcuService.deleteByTypeUtilisateurId(id);
        }

        @ApiOperation("find by developpementDeSavoirEtInnovationScientifique id")
        @GetMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public List<TypeUtilisateurSavoirConcu> findByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return typeUtilisateurSavoirConcuService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }

        @ApiOperation("delete by developpementDeSavoirEtInnovationScientifique id")
        @DeleteMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return typeUtilisateurSavoirConcuService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }



            }
