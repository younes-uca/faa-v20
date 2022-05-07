package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypeEntiteAdministrativeAdminService;

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
import com.ird.faa.bean.TypeEntiteAdministrative;
import com.ird.faa.ws.rest.provided.converter.TypeEntiteAdministrativeConverter;
import com.ird.faa.ws.rest.provided.vo.TypeEntiteAdministrativeVo;

@Api("Manages typeEntiteAdministrative services")
@RestController
@RequestMapping("api/admin/typeEntiteAdministrative")
public class TypeEntiteAdministrativeRestAdmin {

@Autowired
private TypeEntiteAdministrativeAdminService typeEntiteAdministrativeService;

@Autowired
private TypeEntiteAdministrativeConverter typeEntiteAdministrativeConverter;


            @ApiOperation("Updates the specified  typeEntiteAdministrative")
            @PutMapping("/")
            public  TypeEntiteAdministrativeVo update(@RequestBody  TypeEntiteAdministrativeVo  typeEntiteAdministrativeVo){
            TypeEntiteAdministrative typeEntiteAdministrative = typeEntiteAdministrativeConverter.toItem(typeEntiteAdministrativeVo);
            typeEntiteAdministrative = typeEntiteAdministrativeService.update(typeEntiteAdministrative);
            return typeEntiteAdministrativeConverter.toVo(typeEntiteAdministrative);
            }

    @ApiOperation("Finds a list of all typeEntiteAdministratives")
    @GetMapping("/")
    public List<TypeEntiteAdministrativeVo> findAll(){
        return typeEntiteAdministrativeConverter.toVo(typeEntiteAdministrativeService.findAll());
    }

    @ApiOperation("Finds a typeEntiteAdministrative with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeEntiteAdministrativeVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeEntiteAdministrativeConverter.toVo(typeEntiteAdministrativeService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeEntiteAdministrative by a specific criteria")
    @PostMapping("/search")
    public List<TypeEntiteAdministrativeVo> findByCriteria(@RequestBody TypeEntiteAdministrativeVo typeEntiteAdministrativeVo){
        return typeEntiteAdministrativeConverter.toVo(typeEntiteAdministrativeService.findByCriteria(typeEntiteAdministrativeVo));
        }

            @ApiOperation("Finds a typeEntiteAdministrative by id")
            @GetMapping("/id/{id}")
            public TypeEntiteAdministrativeVo findById(@PathVariable Long id){
            return typeEntiteAdministrativeConverter.toVo(typeEntiteAdministrativeService.findById(id));
            }

            @ApiOperation("Saves the specified  typeEntiteAdministrative")
            @PostMapping("/")
            public TypeEntiteAdministrativeVo save(@RequestBody TypeEntiteAdministrativeVo typeEntiteAdministrativeVo){
            TypeEntiteAdministrative typeEntiteAdministrative = typeEntiteAdministrativeConverter.toItem(typeEntiteAdministrativeVo);
            typeEntiteAdministrative = typeEntiteAdministrativeService.save(typeEntiteAdministrative);
            return typeEntiteAdministrativeConverter.toVo(typeEntiteAdministrative);
            }

            @ApiOperation("Delete the specified typeEntiteAdministrative")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeEntiteAdministrativeVo typeEntiteAdministrativeVo){
            TypeEntiteAdministrative typeEntiteAdministrative = typeEntiteAdministrativeConverter.toItem(typeEntiteAdministrativeVo);
            return typeEntiteAdministrativeService.delete(typeEntiteAdministrative);
            }

            @ApiOperation("Deletes a typeEntiteAdministrative by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeEntiteAdministrativeService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public TypeEntiteAdministrativeVo archiver(@RequestBody TypeEntiteAdministrativeVo typeEntiteAdministrativeVo){
                TypeEntiteAdministrative typeEntiteAdministrative = typeEntiteAdministrativeService.archiver(typeEntiteAdministrativeConverter.toItem(typeEntiteAdministrativeVo));
                return typeEntiteAdministrativeConverter.toVo(typeEntiteAdministrative);
                }

            @PutMapping("/desarchiver/")
            public TypeEntiteAdministrativeVo desarchiver(@RequestBody TypeEntiteAdministrativeVo typeEntiteAdministrativeVo){
                TypeEntiteAdministrative typeEntiteAdministrative = typeEntiteAdministrativeService.desarchiver(typeEntiteAdministrativeConverter.toItem(typeEntiteAdministrativeVo));
                return typeEntiteAdministrativeConverter.toVo(typeEntiteAdministrative);}
            }
