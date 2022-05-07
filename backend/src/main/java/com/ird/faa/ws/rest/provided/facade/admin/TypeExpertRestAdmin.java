package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypeExpertAdminService;

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
import com.ird.faa.bean.TypeExpert;
import com.ird.faa.ws.rest.provided.converter.TypeExpertConverter;
import com.ird.faa.ws.rest.provided.vo.TypeExpertVo;

@Api("Manages typeExpert services")
@RestController
@RequestMapping("api/admin/typeExpert")
public class TypeExpertRestAdmin {

@Autowired
private TypeExpertAdminService typeExpertService;

@Autowired
private TypeExpertConverter typeExpertConverter;


            @ApiOperation("Updates the specified  typeExpert")
            @PutMapping("/")
            public  TypeExpertVo update(@RequestBody  TypeExpertVo  typeExpertVo){
            TypeExpert typeExpert = typeExpertConverter.toItem(typeExpertVo);
            typeExpert = typeExpertService.update(typeExpert);
            return typeExpertConverter.toVo(typeExpert);
            }

    @ApiOperation("Finds a list of all typeExperts")
    @GetMapping("/")
    public List<TypeExpertVo> findAll(){
        return typeExpertConverter.toVo(typeExpertService.findAll());
    }

    @ApiOperation("Finds a typeExpert with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeExpertVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeExpertConverter.toVo(typeExpertService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeExpert by a specific criteria")
    @PostMapping("/search")
    public List<TypeExpertVo> findByCriteria(@RequestBody TypeExpertVo typeExpertVo){
        return typeExpertConverter.toVo(typeExpertService.findByCriteria(typeExpertVo));
        }

            @ApiOperation("Finds a typeExpert by id")
            @GetMapping("/id/{id}")
            public TypeExpertVo findById(@PathVariable Long id){
            return typeExpertConverter.toVo(typeExpertService.findById(id));
            }

            @ApiOperation("Saves the specified  typeExpert")
            @PostMapping("/")
            public TypeExpertVo save(@RequestBody TypeExpertVo typeExpertVo){
            TypeExpert typeExpert = typeExpertConverter.toItem(typeExpertVo);
            typeExpert = typeExpertService.save(typeExpert);
            return typeExpertConverter.toVo(typeExpert);
            }

            @ApiOperation("Delete the specified typeExpert")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeExpertVo typeExpertVo){
            TypeExpert typeExpert = typeExpertConverter.toItem(typeExpertVo);
            return typeExpertService.delete(typeExpert);
            }

            @ApiOperation("Deletes a typeExpert by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeExpertService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public TypeExpertVo archiver(@RequestBody TypeExpertVo typeExpertVo){
                TypeExpert typeExpert = typeExpertService.archiver(typeExpertConverter.toItem(typeExpertVo));
                return typeExpertConverter.toVo(typeExpert);
                }

            @PutMapping("/desarchiver/")
            public TypeExpertVo desarchiver(@RequestBody TypeExpertVo typeExpertVo){
                TypeExpert typeExpert = typeExpertService.desarchiver(typeExpertConverter.toItem(typeExpertVo));
                return typeExpertConverter.toVo(typeExpert);}
            }
