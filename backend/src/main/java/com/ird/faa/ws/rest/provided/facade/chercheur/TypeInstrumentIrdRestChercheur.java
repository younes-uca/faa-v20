package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.TypeInstrumentIrdChercheurService;

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
import com.ird.faa.bean.TypeInstrumentIrd;
import com.ird.faa.ws.rest.provided.converter.TypeInstrumentIrdConverter;
import com.ird.faa.ws.rest.provided.vo.TypeInstrumentIrdVo;

@Api("Manages typeInstrumentIrd services")
@RestController
@RequestMapping("api/chercheur/typeInstrumentIrd")
public class TypeInstrumentIrdRestChercheur {

@Autowired
private TypeInstrumentIrdChercheurService typeInstrumentIrdService;

@Autowired
private TypeInstrumentIrdConverter typeInstrumentIrdConverter;


            @ApiOperation("Updates the specified  typeInstrumentIrd")
            @PutMapping("/")
            public  TypeInstrumentIrdVo update(@RequestBody  TypeInstrumentIrdVo  typeInstrumentIrdVo){
            TypeInstrumentIrd typeInstrumentIrd = typeInstrumentIrdConverter.toItem(typeInstrumentIrdVo);
            typeInstrumentIrd = typeInstrumentIrdService.update(typeInstrumentIrd);
            return typeInstrumentIrdConverter.toVo(typeInstrumentIrd);
            }

    @ApiOperation("Finds a list of all typeInstrumentIrds")
    @GetMapping("/")
    public List<TypeInstrumentIrdVo> findAll(){
        return typeInstrumentIrdConverter.toVo(typeInstrumentIrdService.findAll());
    }

    @ApiOperation("Finds a typeInstrumentIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeInstrumentIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeInstrumentIrdConverter.toVo(typeInstrumentIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeInstrumentIrd by a specific criteria")
    @PostMapping("/search")
    public List<TypeInstrumentIrdVo> findByCriteria(@RequestBody TypeInstrumentIrdVo typeInstrumentIrdVo){
        return typeInstrumentIrdConverter.toVo(typeInstrumentIrdService.findByCriteria(typeInstrumentIrdVo));
        }

            @ApiOperation("Finds a typeInstrumentIrd by id")
            @GetMapping("/id/{id}")
            public TypeInstrumentIrdVo findById(@PathVariable Long id){
            return typeInstrumentIrdConverter.toVo(typeInstrumentIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  typeInstrumentIrd")
            @PostMapping("/")
            public TypeInstrumentIrdVo save(@RequestBody TypeInstrumentIrdVo typeInstrumentIrdVo){
            TypeInstrumentIrd typeInstrumentIrd = typeInstrumentIrdConverter.toItem(typeInstrumentIrdVo);
            typeInstrumentIrd = typeInstrumentIrdService.save(typeInstrumentIrd);
            return typeInstrumentIrdConverter.toVo(typeInstrumentIrd);
            }

            @ApiOperation("Delete the specified typeInstrumentIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeInstrumentIrdVo typeInstrumentIrdVo){
            TypeInstrumentIrd typeInstrumentIrd = typeInstrumentIrdConverter.toItem(typeInstrumentIrdVo);
            return typeInstrumentIrdService.delete(typeInstrumentIrd);
            }

            @ApiOperation("Deletes a typeInstrumentIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeInstrumentIrdService.deleteById(id);
            }


            }
