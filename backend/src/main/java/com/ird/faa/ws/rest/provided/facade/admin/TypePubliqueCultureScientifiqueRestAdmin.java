package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypePubliqueCultureScientifiqueAdminService;

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
import com.ird.faa.bean.TypePubliqueCultureScientifique;
import com.ird.faa.ws.rest.provided.converter.TypePubliqueCultureScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.TypePubliqueCultureScientifiqueVo;

@Api("Manages typePubliqueCultureScientifique services")
@RestController
@RequestMapping("api/admin/typePubliqueCultureScientifique")
public class TypePubliqueCultureScientifiqueRestAdmin {

@Autowired
private TypePubliqueCultureScientifiqueAdminService typePubliqueCultureScientifiqueService;

@Autowired
private TypePubliqueCultureScientifiqueConverter typePubliqueCultureScientifiqueConverter;


            @ApiOperation("Updates the specified  typePubliqueCultureScientifique")
            @PutMapping("/")
            public  TypePubliqueCultureScientifiqueVo update(@RequestBody  TypePubliqueCultureScientifiqueVo  typePubliqueCultureScientifiqueVo){
            TypePubliqueCultureScientifique typePubliqueCultureScientifique = typePubliqueCultureScientifiqueConverter.toItem(typePubliqueCultureScientifiqueVo);
            typePubliqueCultureScientifique = typePubliqueCultureScientifiqueService.update(typePubliqueCultureScientifique);
            return typePubliqueCultureScientifiqueConverter.toVo(typePubliqueCultureScientifique);
            }

    @ApiOperation("Finds a list of all typePubliqueCultureScientifiques")
    @GetMapping("/")
    public List<TypePubliqueCultureScientifiqueVo> findAll(){
        return typePubliqueCultureScientifiqueConverter.toVo(typePubliqueCultureScientifiqueService.findAll());
    }

    @ApiOperation("Finds a typePubliqueCultureScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypePubliqueCultureScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return typePubliqueCultureScientifiqueConverter.toVo(typePubliqueCultureScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typePubliqueCultureScientifique by a specific criteria")
    @PostMapping("/search")
    public List<TypePubliqueCultureScientifiqueVo> findByCriteria(@RequestBody TypePubliqueCultureScientifiqueVo typePubliqueCultureScientifiqueVo){
        return typePubliqueCultureScientifiqueConverter.toVo(typePubliqueCultureScientifiqueService.findByCriteria(typePubliqueCultureScientifiqueVo));
        }

            @ApiOperation("Finds a typePubliqueCultureScientifique by id")
            @GetMapping("/id/{id}")
            public TypePubliqueCultureScientifiqueVo findById(@PathVariable Long id){
            return typePubliqueCultureScientifiqueConverter.toVo(typePubliqueCultureScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  typePubliqueCultureScientifique")
            @PostMapping("/")
            public TypePubliqueCultureScientifiqueVo save(@RequestBody TypePubliqueCultureScientifiqueVo typePubliqueCultureScientifiqueVo){
            TypePubliqueCultureScientifique typePubliqueCultureScientifique = typePubliqueCultureScientifiqueConverter.toItem(typePubliqueCultureScientifiqueVo);
            typePubliqueCultureScientifique = typePubliqueCultureScientifiqueService.save(typePubliqueCultureScientifique);
            return typePubliqueCultureScientifiqueConverter.toVo(typePubliqueCultureScientifique);
            }

            @ApiOperation("Delete the specified typePubliqueCultureScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody TypePubliqueCultureScientifiqueVo typePubliqueCultureScientifiqueVo){
            TypePubliqueCultureScientifique typePubliqueCultureScientifique = typePubliqueCultureScientifiqueConverter.toItem(typePubliqueCultureScientifiqueVo);
            return typePubliqueCultureScientifiqueService.delete(typePubliqueCultureScientifique);
            }

            @ApiOperation("Deletes a typePubliqueCultureScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typePubliqueCultureScientifiqueService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public TypePubliqueCultureScientifiqueVo archiver(@RequestBody TypePubliqueCultureScientifiqueVo typePubliqueCultureScientifiqueVo){
                TypePubliqueCultureScientifique typePubliqueCultureScientifique = typePubliqueCultureScientifiqueService.archiver(typePubliqueCultureScientifiqueConverter.toItem(typePubliqueCultureScientifiqueVo));
                return typePubliqueCultureScientifiqueConverter.toVo(typePubliqueCultureScientifique);
                }

            @PutMapping("/desarchiver/")
            public TypePubliqueCultureScientifiqueVo desarchiver(@RequestBody TypePubliqueCultureScientifiqueVo typePubliqueCultureScientifiqueVo){
                TypePubliqueCultureScientifique typePubliqueCultureScientifique = typePubliqueCultureScientifiqueService.desarchiver(typePubliqueCultureScientifiqueConverter.toItem(typePubliqueCultureScientifiqueVo));
                return typePubliqueCultureScientifiqueConverter.toVo(typePubliqueCultureScientifique);}
            }
