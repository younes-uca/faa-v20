package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.StructureIrdChercheurService;

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
import com.ird.faa.bean.StructureIrd;
import com.ird.faa.ws.rest.provided.converter.StructureIrdConverter;
import com.ird.faa.ws.rest.provided.vo.StructureIrdVo;

@Api("Manages structureIrd services")
@RestController
@RequestMapping("api/chercheur/structureIrd")
public class StructureIrdRestChercheur {

@Autowired
private StructureIrdChercheurService structureIrdService;

@Autowired
private StructureIrdConverter structureIrdConverter;


            @ApiOperation("Updates the specified  structureIrd")
            @PutMapping("/")
            public  StructureIrdVo update(@RequestBody  StructureIrdVo  structureIrdVo){
            StructureIrd structureIrd = structureIrdConverter.toItem(structureIrdVo);
            structureIrd = structureIrdService.update(structureIrd);
            return structureIrdConverter.toVo(structureIrd);
            }

    @ApiOperation("Finds a list of all structureIrds")
    @GetMapping("/")
    public List<StructureIrdVo> findAll(){
        return structureIrdConverter.toVo(structureIrdService.findAll());
    }

    @ApiOperation("Finds a structureIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public StructureIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return structureIrdConverter.toVo(structureIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search structureIrd by a specific criteria")
    @PostMapping("/search")
    public List<StructureIrdVo> findByCriteria(@RequestBody StructureIrdVo structureIrdVo){
        return structureIrdConverter.toVo(structureIrdService.findByCriteria(structureIrdVo));
        }

            @ApiOperation("Finds a structureIrd by id")
            @GetMapping("/id/{id}")
            public StructureIrdVo findById(@PathVariable Long id){
            return structureIrdConverter.toVo(structureIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  structureIrd")
            @PostMapping("/")
            public StructureIrdVo save(@RequestBody StructureIrdVo structureIrdVo){
            StructureIrd structureIrd = structureIrdConverter.toItem(structureIrdVo);
            structureIrd = structureIrdService.save(structureIrd);
            return structureIrdConverter.toVo(structureIrd);
            }

            @ApiOperation("Delete the specified structureIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody StructureIrdVo structureIrdVo){
            StructureIrd structureIrd = structureIrdConverter.toItem(structureIrdVo);
            return structureIrdService.delete(structureIrd);
            }

            @ApiOperation("Deletes a structureIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return structureIrdService.deleteById(id);
            }


            }
