package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypeOutilAdminService;

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
import com.ird.faa.bean.TypeOutil;
import com.ird.faa.ws.rest.provided.converter.TypeOutilConverter;
import com.ird.faa.ws.rest.provided.vo.TypeOutilVo;

@Api("Manages typeOutil services")
@RestController
@RequestMapping("api/admin/typeOutil")
public class TypeOutilRestAdmin {

@Autowired
private TypeOutilAdminService typeOutilService;

@Autowired
private TypeOutilConverter typeOutilConverter;


            @ApiOperation("Updates the specified  typeOutil")
            @PutMapping("/")
            public  TypeOutilVo update(@RequestBody  TypeOutilVo  typeOutilVo){
            TypeOutil typeOutil = typeOutilConverter.toItem(typeOutilVo);
            typeOutil = typeOutilService.update(typeOutil);
            return typeOutilConverter.toVo(typeOutil);
            }

    @ApiOperation("Finds a list of all typeOutils")
    @GetMapping("/")
    public List<TypeOutilVo> findAll(){
        return typeOutilConverter.toVo(typeOutilService.findAll());
    }

    @ApiOperation("Finds a typeOutil with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeOutilVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeOutilConverter.toVo(typeOutilService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeOutil by a specific criteria")
    @PostMapping("/search")
    public List<TypeOutilVo> findByCriteria(@RequestBody TypeOutilVo typeOutilVo){
        return typeOutilConverter.toVo(typeOutilService.findByCriteria(typeOutilVo));
        }

            @ApiOperation("Finds a typeOutil by id")
            @GetMapping("/id/{id}")
            public TypeOutilVo findById(@PathVariable Long id){
            return typeOutilConverter.toVo(typeOutilService.findById(id));
            }

            @ApiOperation("Saves the specified  typeOutil")
            @PostMapping("/")
            public TypeOutilVo save(@RequestBody TypeOutilVo typeOutilVo){
            TypeOutil typeOutil = typeOutilConverter.toItem(typeOutilVo);
            typeOutil = typeOutilService.save(typeOutil);
            return typeOutilConverter.toVo(typeOutil);
            }

            @ApiOperation("Delete the specified typeOutil")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeOutilVo typeOutilVo){
            TypeOutil typeOutil = typeOutilConverter.toItem(typeOutilVo);
            return typeOutilService.delete(typeOutil);
            }

            @ApiOperation("Deletes a typeOutil by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeOutilService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public TypeOutilVo archiver(@RequestBody TypeOutilVo typeOutilVo){
                TypeOutil typeOutil = typeOutilService.archiver(typeOutilConverter.toItem(typeOutilVo));
                return typeOutilConverter.toVo(typeOutil);
                }

            @PutMapping("/desarchiver/")
            public TypeOutilVo desarchiver(@RequestBody TypeOutilVo typeOutilVo){
                TypeOutil typeOutil = typeOutilService.desarchiver(typeOutilConverter.toItem(typeOutilVo));
                return typeOutilConverter.toVo(typeOutil);}
            }
