package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.TypeSavoirChercheurService;

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
import com.ird.faa.bean.TypeSavoir;
import com.ird.faa.ws.rest.provided.converter.TypeSavoirConverter;
import com.ird.faa.ws.rest.provided.vo.TypeSavoirVo;

@Api("Manages typeSavoir services")
@RestController
@RequestMapping("api/chercheur/typeSavoir")
public class TypeSavoirRestChercheur {

@Autowired
private TypeSavoirChercheurService typeSavoirService;

@Autowired
private TypeSavoirConverter typeSavoirConverter;


            @ApiOperation("Updates the specified  typeSavoir")
            @PutMapping("/")
            public  TypeSavoirVo update(@RequestBody  TypeSavoirVo  typeSavoirVo){
            TypeSavoir typeSavoir = typeSavoirConverter.toItem(typeSavoirVo);
            typeSavoir = typeSavoirService.update(typeSavoir);
            return typeSavoirConverter.toVo(typeSavoir);
            }

    @ApiOperation("Finds a list of all typeSavoirs")
    @GetMapping("/")
    public List<TypeSavoirVo> findAll(){
        return typeSavoirConverter.toVo(typeSavoirService.findAll());
    }

    @ApiOperation("Finds a typeSavoir with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeSavoirVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeSavoirConverter.toVo(typeSavoirService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeSavoir by a specific criteria")
    @PostMapping("/search")
    public List<TypeSavoirVo> findByCriteria(@RequestBody TypeSavoirVo typeSavoirVo){
        return typeSavoirConverter.toVo(typeSavoirService.findByCriteria(typeSavoirVo));
        }

            @ApiOperation("Finds a typeSavoir by id")
            @GetMapping("/id/{id}")
            public TypeSavoirVo findById(@PathVariable Long id){
            return typeSavoirConverter.toVo(typeSavoirService.findById(id));
            }

            @ApiOperation("Saves the specified  typeSavoir")
            @PostMapping("/")
            public TypeSavoirVo save(@RequestBody TypeSavoirVo typeSavoirVo){
            TypeSavoir typeSavoir = typeSavoirConverter.toItem(typeSavoirVo);
            typeSavoir = typeSavoirService.save(typeSavoir);
            return typeSavoirConverter.toVo(typeSavoir);
            }

            @ApiOperation("Delete the specified typeSavoir")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeSavoirVo typeSavoirVo){
            TypeSavoir typeSavoir = typeSavoirConverter.toItem(typeSavoirVo);
            return typeSavoirService.delete(typeSavoir);
            }

            @ApiOperation("Deletes a typeSavoir by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeSavoirService.deleteById(id);
            }


            }
