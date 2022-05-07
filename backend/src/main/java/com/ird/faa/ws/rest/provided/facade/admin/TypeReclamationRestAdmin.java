package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypeReclamationAdminService;

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
import com.ird.faa.bean.TypeReclamation;
import com.ird.faa.ws.rest.provided.converter.TypeReclamationConverter;
import com.ird.faa.ws.rest.provided.vo.TypeReclamationVo;

@Api("Manages typeReclamation services")
@RestController
@RequestMapping("api/admin/typeReclamation")
public class TypeReclamationRestAdmin {

@Autowired
private TypeReclamationAdminService typeReclamationService;

@Autowired
private TypeReclamationConverter typeReclamationConverter;


            @ApiOperation("Updates the specified  typeReclamation")
            @PutMapping("/")
            public  TypeReclamationVo update(@RequestBody  TypeReclamationVo  typeReclamationVo){
            TypeReclamation typeReclamation = typeReclamationConverter.toItem(typeReclamationVo);
            typeReclamation = typeReclamationService.update(typeReclamation);
            return typeReclamationConverter.toVo(typeReclamation);
            }

    @ApiOperation("Finds a list of all typeReclamations")
    @GetMapping("/")
    public List<TypeReclamationVo> findAll(){
        return typeReclamationConverter.toVo(typeReclamationService.findAll());
    }

    @ApiOperation("Finds a typeReclamation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeReclamationVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeReclamationConverter.toVo(typeReclamationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeReclamation by a specific criteria")
    @PostMapping("/search")
    public List<TypeReclamationVo> findByCriteria(@RequestBody TypeReclamationVo typeReclamationVo){
        return typeReclamationConverter.toVo(typeReclamationService.findByCriteria(typeReclamationVo));
        }

            @ApiOperation("Finds a typeReclamation by id")
            @GetMapping("/id/{id}")
            public TypeReclamationVo findById(@PathVariable Long id){
            return typeReclamationConverter.toVo(typeReclamationService.findById(id));
            }

            @ApiOperation("Saves the specified  typeReclamation")
            @PostMapping("/")
            public TypeReclamationVo save(@RequestBody TypeReclamationVo typeReclamationVo){
            TypeReclamation typeReclamation = typeReclamationConverter.toItem(typeReclamationVo);
            typeReclamation = typeReclamationService.save(typeReclamation);
            return typeReclamationConverter.toVo(typeReclamation);
            }

            @ApiOperation("Delete the specified typeReclamation")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeReclamationVo typeReclamationVo){
            TypeReclamation typeReclamation = typeReclamationConverter.toItem(typeReclamationVo);
            return typeReclamationService.delete(typeReclamation);
            }

            @ApiOperation("Deletes a typeReclamation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeReclamationService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public TypeReclamationVo archiver(@RequestBody TypeReclamationVo typeReclamationVo){
                TypeReclamation typeReclamation = typeReclamationService.archiver(typeReclamationConverter.toItem(typeReclamationVo));
                return typeReclamationConverter.toVo(typeReclamation);
                }

            @PutMapping("/desarchiver/")
            public TypeReclamationVo desarchiver(@RequestBody TypeReclamationVo typeReclamationVo){
                TypeReclamation typeReclamation = typeReclamationService.desarchiver(typeReclamationConverter.toItem(typeReclamationVo));
                return typeReclamationConverter.toVo(typeReclamation);}
            }
