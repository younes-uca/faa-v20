package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.RencontreGrandPubliqueJeunePubliqueInstrumentIrdChercheurService;

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
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueInstrumentIrd;
import com.ird.faa.ws.rest.provided.converter.RencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo;

@Api("Manages rencontreGrandPubliqueJeunePubliqueInstrumentIrd services")
@RestController
@RequestMapping("api/chercheur/rencontreGrandPubliqueJeunePubliqueInstrumentIrd")
public class RencontreGrandPubliqueJeunePubliqueInstrumentIrdRestChercheur {

@Autowired
private RencontreGrandPubliqueJeunePubliqueInstrumentIrdChercheurService rencontreGrandPubliqueJeunePubliqueInstrumentIrdService;

@Autowired
private RencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter;


            @ApiOperation("Updates the specified  rencontreGrandPubliqueJeunePubliqueInstrumentIrd")
            @PutMapping("/")
            public  RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo update(@RequestBody  RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo  rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo){
            RencontreGrandPubliqueJeunePubliqueInstrumentIrd rencontreGrandPubliqueJeunePubliqueInstrumentIrd = rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.toItem(rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo);
            rencontreGrandPubliqueJeunePubliqueInstrumentIrd = rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.update(rencontreGrandPubliqueJeunePubliqueInstrumentIrd);
            return rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.toVo(rencontreGrandPubliqueJeunePubliqueInstrumentIrd);
            }

    @ApiOperation("Finds a list of all rencontreGrandPubliqueJeunePubliqueInstrumentIrds")
    @GetMapping("/")
    public List<RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo> findAll(){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.toVo(rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.findAll());
    }

    @ApiOperation("Finds a rencontreGrandPubliqueJeunePubliqueInstrumentIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.toVo(rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search rencontreGrandPubliqueJeunePubliqueInstrumentIrd by a specific criteria")
    @PostMapping("/search")
    public List<RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo> findByCriteria(@RequestBody RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.toVo(rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.findByCriteria(rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo));
        }

            @ApiOperation("Finds a rencontreGrandPubliqueJeunePubliqueInstrumentIrd by id")
            @GetMapping("/id/{id}")
            public RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo findById(@PathVariable Long id){
            return rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.toVo(rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  rencontreGrandPubliqueJeunePubliqueInstrumentIrd")
            @PostMapping("/")
            public RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo save(@RequestBody RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo){
            RencontreGrandPubliqueJeunePubliqueInstrumentIrd rencontreGrandPubliqueJeunePubliqueInstrumentIrd = rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.toItem(rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo);
            rencontreGrandPubliqueJeunePubliqueInstrumentIrd = rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.save(rencontreGrandPubliqueJeunePubliqueInstrumentIrd);
            return rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.toVo(rencontreGrandPubliqueJeunePubliqueInstrumentIrd);
            }

            @ApiOperation("Delete the specified rencontreGrandPubliqueJeunePubliqueInstrumentIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo){
            RencontreGrandPubliqueJeunePubliqueInstrumentIrd rencontreGrandPubliqueJeunePubliqueInstrumentIrd = rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.toItem(rencontreGrandPubliqueJeunePubliqueInstrumentIrdVo);
            return rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.delete(rencontreGrandPubliqueJeunePubliqueInstrumentIrd);
            }

            @ApiOperation("Deletes a rencontreGrandPubliqueJeunePubliqueInstrumentIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.deleteById(id);
            }
        @ApiOperation("find by instrumentIrd code")
        @GetMapping("/instrumentIrd/code/{code}")
        public List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findByInstrumentIrdCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.findByInstrumentIrdCode(code);
        }

        @ApiOperation("delete by instrumentIrd code")
        @DeleteMapping("/instrumentIrd/code/{code}")
        public int deleteByInstrumentIrdCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.deleteByInstrumentIrdCode(code);
        }

        @ApiOperation("find by instrumentIrd id")
        @GetMapping("/instrumentIrd/id/{id}")
        public List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findByInstrumentIrdId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.findByInstrumentIrdId(id);
        }

        @ApiOperation("delete by instrumentIrd id")
        @DeleteMapping("/instrumentIrd/id/{id}")
        public int deleteByInstrumentIrdId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.deleteByInstrumentIrdId(id);
        }

        @ApiOperation("find by rencontreGrandPubliqueJeunePublique id")
        @GetMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @ApiOperation("delete by rencontreGrandPubliqueJeunePublique id")
        @DeleteMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }



            }
