package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypeEtudeEnseignementAdminService;

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
import com.ird.faa.bean.TypeEtudeEnseignement;
import com.ird.faa.ws.rest.provided.converter.TypeEtudeEnseignementConverter;
import com.ird.faa.ws.rest.provided.vo.TypeEtudeEnseignementVo;

@Api("Manages typeEtudeEnseignement services")
@RestController
@RequestMapping("api/admin/typeEtudeEnseignement")
public class TypeEtudeEnseignementRestAdmin {

@Autowired
private TypeEtudeEnseignementAdminService typeEtudeEnseignementService;

@Autowired
private TypeEtudeEnseignementConverter typeEtudeEnseignementConverter;


            @ApiOperation("Updates the specified  typeEtudeEnseignement")
            @PutMapping("/")
            public  TypeEtudeEnseignementVo update(@RequestBody  TypeEtudeEnseignementVo  typeEtudeEnseignementVo){
            TypeEtudeEnseignement typeEtudeEnseignement = typeEtudeEnseignementConverter.toItem(typeEtudeEnseignementVo);
            typeEtudeEnseignement = typeEtudeEnseignementService.update(typeEtudeEnseignement);
            return typeEtudeEnseignementConverter.toVo(typeEtudeEnseignement);
            }

    @ApiOperation("Finds a list of all typeEtudeEnseignements")
    @GetMapping("/")
    public List<TypeEtudeEnseignementVo> findAll(){
        return typeEtudeEnseignementConverter.toVo(typeEtudeEnseignementService.findAll());
    }

    @ApiOperation("Finds a typeEtudeEnseignement with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeEtudeEnseignementVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeEtudeEnseignementConverter.toVo(typeEtudeEnseignementService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeEtudeEnseignement by a specific criteria")
    @PostMapping("/search")
    public List<TypeEtudeEnseignementVo> findByCriteria(@RequestBody TypeEtudeEnseignementVo typeEtudeEnseignementVo){
        return typeEtudeEnseignementConverter.toVo(typeEtudeEnseignementService.findByCriteria(typeEtudeEnseignementVo));
        }

            @ApiOperation("Finds a typeEtudeEnseignement by id")
            @GetMapping("/id/{id}")
            public TypeEtudeEnseignementVo findById(@PathVariable Long id){
            return typeEtudeEnseignementConverter.toVo(typeEtudeEnseignementService.findById(id));
            }

            @ApiOperation("Saves the specified  typeEtudeEnseignement")
            @PostMapping("/")
            public TypeEtudeEnseignementVo save(@RequestBody TypeEtudeEnseignementVo typeEtudeEnseignementVo){
            TypeEtudeEnseignement typeEtudeEnseignement = typeEtudeEnseignementConverter.toItem(typeEtudeEnseignementVo);
            typeEtudeEnseignement = typeEtudeEnseignementService.save(typeEtudeEnseignement);
            return typeEtudeEnseignementConverter.toVo(typeEtudeEnseignement);
            }

            @ApiOperation("Delete the specified typeEtudeEnseignement")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeEtudeEnseignementVo typeEtudeEnseignementVo){
            TypeEtudeEnseignement typeEtudeEnseignement = typeEtudeEnseignementConverter.toItem(typeEtudeEnseignementVo);
            return typeEtudeEnseignementService.delete(typeEtudeEnseignement);
            }

            @ApiOperation("Deletes a typeEtudeEnseignement by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeEtudeEnseignementService.deleteById(id);
            }
        @ApiOperation("find by enseignement id")
        @GetMapping("/enseignement/id/{id}")
        public List<TypeEtudeEnseignement> findByEnseignementId(@PathVariable Long id){
        return typeEtudeEnseignementService.findByEnseignementId(id);
        }

        @ApiOperation("delete by enseignement id")
        @DeleteMapping("/enseignement/id/{id}")
        public int deleteByEnseignementId(@PathVariable Long id){
        return typeEtudeEnseignementService.deleteByEnseignementId(id);
        }

        @ApiOperation("find by typeEtude code")
        @GetMapping("/typeEtude/code/{code}")
        public List<TypeEtudeEnseignement> findByTypeEtudeCode(@PathVariable String code){
        return typeEtudeEnseignementService.findByTypeEtudeCode(code);
        }

        @ApiOperation("delete by typeEtude code")
        @DeleteMapping("/typeEtude/code/{code}")
        public int deleteByTypeEtudeCode(@PathVariable String code){
        return typeEtudeEnseignementService.deleteByTypeEtudeCode(code);
        }

        @ApiOperation("find by typeEtude id")
        @GetMapping("/typeEtude/id/{id}")
        public List<TypeEtudeEnseignement> findByTypeEtudeId(@PathVariable Long id){
        return typeEtudeEnseignementService.findByTypeEtudeId(id);
        }

        @ApiOperation("delete by typeEtude id")
        @DeleteMapping("/typeEtude/id/{id}")
        public int deleteByTypeEtudeId(@PathVariable Long id){
        return typeEtudeEnseignementService.deleteByTypeEtudeId(id);
        }



            }
