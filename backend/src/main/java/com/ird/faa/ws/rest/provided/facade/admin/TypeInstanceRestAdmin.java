package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypeInstanceAdminService;

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
import com.ird.faa.bean.TypeInstance;
import com.ird.faa.ws.rest.provided.converter.TypeInstanceConverter;
import com.ird.faa.ws.rest.provided.vo.TypeInstanceVo;

@Api("Manages typeInstance services")
@RestController
@RequestMapping("api/admin/typeInstance")
public class TypeInstanceRestAdmin {

@Autowired
private TypeInstanceAdminService typeInstanceService;

@Autowired
private TypeInstanceConverter typeInstanceConverter;


            @ApiOperation("Updates the specified  typeInstance")
            @PutMapping("/")
            public  TypeInstanceVo update(@RequestBody  TypeInstanceVo  typeInstanceVo){
            TypeInstance typeInstance = typeInstanceConverter.toItem(typeInstanceVo);
            typeInstance = typeInstanceService.update(typeInstance);
            return typeInstanceConverter.toVo(typeInstance);
            }

    @ApiOperation("Finds a list of all typeInstances")
    @GetMapping("/")
    public List<TypeInstanceVo> findAll(){
        return typeInstanceConverter.toVo(typeInstanceService.findAll());
    }

    @ApiOperation("Finds a typeInstance with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeInstanceVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeInstanceConverter.toVo(typeInstanceService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeInstance by a specific criteria")
    @PostMapping("/search")
    public List<TypeInstanceVo> findByCriteria(@RequestBody TypeInstanceVo typeInstanceVo){
        return typeInstanceConverter.toVo(typeInstanceService.findByCriteria(typeInstanceVo));
        }

            @ApiOperation("Finds a typeInstance by id")
            @GetMapping("/id/{id}")
            public TypeInstanceVo findById(@PathVariable Long id){
            return typeInstanceConverter.toVo(typeInstanceService.findById(id));
            }

            @ApiOperation("Saves the specified  typeInstance")
            @PostMapping("/")
            public TypeInstanceVo save(@RequestBody TypeInstanceVo typeInstanceVo){
            TypeInstance typeInstance = typeInstanceConverter.toItem(typeInstanceVo);
            typeInstance = typeInstanceService.save(typeInstance);
            return typeInstanceConverter.toVo(typeInstance);
            }

            @ApiOperation("Delete the specified typeInstance")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeInstanceVo typeInstanceVo){
            TypeInstance typeInstance = typeInstanceConverter.toItem(typeInstanceVo);
            return typeInstanceService.delete(typeInstance);
            }

            @ApiOperation("Deletes a typeInstance by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeInstanceService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public TypeInstanceVo archiver(@RequestBody TypeInstanceVo typeInstanceVo){
                TypeInstance typeInstance = typeInstanceService.archiver(typeInstanceConverter.toItem(typeInstanceVo));
                return typeInstanceConverter.toVo(typeInstance);
                }

            @PutMapping("/desarchiver/")
            public TypeInstanceVo desarchiver(@RequestBody TypeInstanceVo typeInstanceVo){
                TypeInstance typeInstance = typeInstanceService.desarchiver(typeInstanceConverter.toItem(typeInstanceVo));
                return typeInstanceConverter.toVo(typeInstance);}
            }
