package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.TypeEtudeChercheurService;

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
import com.ird.faa.bean.TypeEtude;
import com.ird.faa.ws.rest.provided.converter.TypeEtudeConverter;
import com.ird.faa.ws.rest.provided.vo.TypeEtudeVo;

@Api("Manages typeEtude services")
@RestController
@RequestMapping("api/chercheur/typeEtude")
public class TypeEtudeRestChercheur {

@Autowired
private TypeEtudeChercheurService typeEtudeService;

@Autowired
private TypeEtudeConverter typeEtudeConverter;


            @ApiOperation("Updates the specified  typeEtude")
            @PutMapping("/")
            public  TypeEtudeVo update(@RequestBody  TypeEtudeVo  typeEtudeVo){
            TypeEtude typeEtude = typeEtudeConverter.toItem(typeEtudeVo);
            typeEtude = typeEtudeService.update(typeEtude);
            return typeEtudeConverter.toVo(typeEtude);
            }

    @ApiOperation("Finds a list of all typeEtudes")
    @GetMapping("/")
    public List<TypeEtudeVo> findAll(){
        return typeEtudeConverter.toVo(typeEtudeService.findAll());
    }

    @ApiOperation("Finds a typeEtude with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeEtudeVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeEtudeConverter.toVo(typeEtudeService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeEtude by a specific criteria")
    @PostMapping("/search")
    public List<TypeEtudeVo> findByCriteria(@RequestBody TypeEtudeVo typeEtudeVo){
        return typeEtudeConverter.toVo(typeEtudeService.findByCriteria(typeEtudeVo));
        }

            @ApiOperation("Finds a typeEtude by id")
            @GetMapping("/id/{id}")
            public TypeEtudeVo findById(@PathVariable Long id){
            return typeEtudeConverter.toVo(typeEtudeService.findById(id));
            }

            @ApiOperation("Saves the specified  typeEtude")
            @PostMapping("/")
            public TypeEtudeVo save(@RequestBody TypeEtudeVo typeEtudeVo){
            TypeEtude typeEtude = typeEtudeConverter.toItem(typeEtudeVo);
            typeEtude = typeEtudeService.save(typeEtude);
            return typeEtudeConverter.toVo(typeEtude);
            }

            @ApiOperation("Delete the specified typeEtude")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeEtudeVo typeEtudeVo){
            TypeEtude typeEtude = typeEtudeConverter.toItem(typeEtudeVo);
            return typeEtudeService.delete(typeEtude);
            }

            @ApiOperation("Deletes a typeEtude by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeEtudeService.deleteById(id);
            }


            }
