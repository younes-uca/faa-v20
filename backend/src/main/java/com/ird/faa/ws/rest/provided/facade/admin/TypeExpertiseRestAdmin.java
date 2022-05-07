package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypeExpertiseAdminService;

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
import com.ird.faa.bean.TypeExpertise;
import com.ird.faa.ws.rest.provided.converter.TypeExpertiseConverter;
import com.ird.faa.ws.rest.provided.vo.TypeExpertiseVo;

@Api("Manages typeExpertise services")
@RestController
@RequestMapping("api/admin/typeExpertise")
public class TypeExpertiseRestAdmin {

@Autowired
private TypeExpertiseAdminService typeExpertiseService;

@Autowired
private TypeExpertiseConverter typeExpertiseConverter;


            @ApiOperation("Updates the specified  typeExpertise")
            @PutMapping("/")
            public  TypeExpertiseVo update(@RequestBody  TypeExpertiseVo  typeExpertiseVo){
            TypeExpertise typeExpertise = typeExpertiseConverter.toItem(typeExpertiseVo);
            typeExpertise = typeExpertiseService.update(typeExpertise);
            return typeExpertiseConverter.toVo(typeExpertise);
            }

    @ApiOperation("Finds a list of all typeExpertises")
    @GetMapping("/")
    public List<TypeExpertiseVo> findAll(){
        return typeExpertiseConverter.toVo(typeExpertiseService.findAll());
    }

    @ApiOperation("Finds a typeExpertise with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeExpertiseVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeExpertiseConverter.toVo(typeExpertiseService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeExpertise by a specific criteria")
    @PostMapping("/search")
    public List<TypeExpertiseVo> findByCriteria(@RequestBody TypeExpertiseVo typeExpertiseVo){
        return typeExpertiseConverter.toVo(typeExpertiseService.findByCriteria(typeExpertiseVo));
        }

            @ApiOperation("Finds a typeExpertise by id")
            @GetMapping("/id/{id}")
            public TypeExpertiseVo findById(@PathVariable Long id){
            return typeExpertiseConverter.toVo(typeExpertiseService.findById(id));
            }

            @ApiOperation("Saves the specified  typeExpertise")
            @PostMapping("/")
            public TypeExpertiseVo save(@RequestBody TypeExpertiseVo typeExpertiseVo){
            TypeExpertise typeExpertise = typeExpertiseConverter.toItem(typeExpertiseVo);
            typeExpertise = typeExpertiseService.save(typeExpertise);
            return typeExpertiseConverter.toVo(typeExpertise);
            }

            @ApiOperation("Delete the specified typeExpertise")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeExpertiseVo typeExpertiseVo){
            TypeExpertise typeExpertise = typeExpertiseConverter.toItem(typeExpertiseVo);
            return typeExpertiseService.delete(typeExpertise);
            }

            @ApiOperation("Deletes a typeExpertise by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeExpertiseService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public TypeExpertiseVo archiver(@RequestBody TypeExpertiseVo typeExpertiseVo){
                TypeExpertise typeExpertise = typeExpertiseService.archiver(typeExpertiseConverter.toItem(typeExpertiseVo));
                return typeExpertiseConverter.toVo(typeExpertise);
                }

            @PutMapping("/desarchiver/")
            public TypeExpertiseVo desarchiver(@RequestBody TypeExpertiseVo typeExpertiseVo){
                TypeExpertise typeExpertise = typeExpertiseService.desarchiver(typeExpertiseConverter.toItem(typeExpertiseVo));
                return typeExpertiseConverter.toVo(typeExpertise);}
            }
