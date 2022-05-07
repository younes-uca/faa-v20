package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.TypePubliqueChercheurService;

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
import com.ird.faa.bean.TypePublique;
import com.ird.faa.ws.rest.provided.converter.TypePubliqueConverter;
import com.ird.faa.ws.rest.provided.vo.TypePubliqueVo;

@Api("Manages typePublique services")
@RestController
@RequestMapping("api/chercheur/typePublique")
public class TypePubliqueRestChercheur {

@Autowired
private TypePubliqueChercheurService typePubliqueService;

@Autowired
private TypePubliqueConverter typePubliqueConverter;


            @ApiOperation("Updates the specified  typePublique")
            @PutMapping("/")
            public  TypePubliqueVo update(@RequestBody  TypePubliqueVo  typePubliqueVo){
            TypePublique typePublique = typePubliqueConverter.toItem(typePubliqueVo);
            typePublique = typePubliqueService.update(typePublique);
            return typePubliqueConverter.toVo(typePublique);
            }

    @ApiOperation("Finds a list of all typePubliques")
    @GetMapping("/")
    public List<TypePubliqueVo> findAll(){
        return typePubliqueConverter.toVo(typePubliqueService.findAll());
    }

    @ApiOperation("Finds a typePublique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypePubliqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return typePubliqueConverter.toVo(typePubliqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typePublique by a specific criteria")
    @PostMapping("/search")
    public List<TypePubliqueVo> findByCriteria(@RequestBody TypePubliqueVo typePubliqueVo){
        return typePubliqueConverter.toVo(typePubliqueService.findByCriteria(typePubliqueVo));
        }

            @ApiOperation("Finds a typePublique by id")
            @GetMapping("/id/{id}")
            public TypePubliqueVo findById(@PathVariable Long id){
            return typePubliqueConverter.toVo(typePubliqueService.findById(id));
            }

            @ApiOperation("Saves the specified  typePublique")
            @PostMapping("/")
            public TypePubliqueVo save(@RequestBody TypePubliqueVo typePubliqueVo){
            TypePublique typePublique = typePubliqueConverter.toItem(typePubliqueVo);
            typePublique = typePubliqueService.save(typePublique);
            return typePubliqueConverter.toVo(typePublique);
            }

            @ApiOperation("Delete the specified typePublique")
            @DeleteMapping("/")
            public int delete(@RequestBody TypePubliqueVo typePubliqueVo){
            TypePublique typePublique = typePubliqueConverter.toItem(typePubliqueVo);
            return typePubliqueService.delete(typePublique);
            }

            @ApiOperation("Deletes a typePublique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typePubliqueService.deleteById(id);
            }


            }
