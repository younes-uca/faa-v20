package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.TypeEnseignementChercheurService;

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
import com.ird.faa.bean.TypeEnseignement;
import com.ird.faa.ws.rest.provided.converter.TypeEnseignementConverter;
import com.ird.faa.ws.rest.provided.vo.TypeEnseignementVo;

@Api("Manages typeEnseignement services")
@RestController
@RequestMapping("api/chercheur/typeEnseignement")
public class TypeEnseignementRestChercheur {

@Autowired
private TypeEnseignementChercheurService typeEnseignementService;

@Autowired
private TypeEnseignementConverter typeEnseignementConverter;


            @ApiOperation("Updates the specified  typeEnseignement")
            @PutMapping("/")
            public  TypeEnseignementVo update(@RequestBody  TypeEnseignementVo  typeEnseignementVo){
            TypeEnseignement typeEnseignement = typeEnseignementConverter.toItem(typeEnseignementVo);
            typeEnseignement = typeEnseignementService.update(typeEnseignement);
            return typeEnseignementConverter.toVo(typeEnseignement);
            }

    @ApiOperation("Finds a list of all typeEnseignements")
    @GetMapping("/")
    public List<TypeEnseignementVo> findAll(){
        return typeEnseignementConverter.toVo(typeEnseignementService.findAll());
    }

    @ApiOperation("Finds a typeEnseignement with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeEnseignementVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeEnseignementConverter.toVo(typeEnseignementService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeEnseignement by a specific criteria")
    @PostMapping("/search")
    public List<TypeEnseignementVo> findByCriteria(@RequestBody TypeEnseignementVo typeEnseignementVo){
        return typeEnseignementConverter.toVo(typeEnseignementService.findByCriteria(typeEnseignementVo));
        }

            @ApiOperation("Finds a typeEnseignement by id")
            @GetMapping("/id/{id}")
            public TypeEnseignementVo findById(@PathVariable Long id){
            return typeEnseignementConverter.toVo(typeEnseignementService.findById(id));
            }

            @ApiOperation("Saves the specified  typeEnseignement")
            @PostMapping("/")
            public TypeEnseignementVo save(@RequestBody TypeEnseignementVo typeEnseignementVo){
            TypeEnseignement typeEnseignement = typeEnseignementConverter.toItem(typeEnseignementVo);
            typeEnseignement = typeEnseignementService.save(typeEnseignement);
            return typeEnseignementConverter.toVo(typeEnseignement);
            }

            @ApiOperation("Delete the specified typeEnseignement")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeEnseignementVo typeEnseignementVo){
            TypeEnseignement typeEnseignement = typeEnseignementConverter.toItem(typeEnseignementVo);
            return typeEnseignementService.delete(typeEnseignement);
            }

            @ApiOperation("Deletes a typeEnseignement by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeEnseignementService.deleteById(id);
            }


            }
