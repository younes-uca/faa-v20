package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EvenementColloqueScienntifiqueEnjeuxIrdAdminService;

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
import com.ird.faa.bean.EvenementColloqueScienntifiqueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.converter.EvenementColloqueScienntifiqueEnjeuxIrdConverter;
import com.ird.faa.ws.rest.provided.vo.EvenementColloqueScienntifiqueEnjeuxIrdVo;

@Api("Manages evenementColloqueScienntifiqueEnjeuxIrd services")
@RestController
@RequestMapping("api/admin/evenementColloqueScienntifiqueEnjeuxIrd")
public class EvenementColloqueScienntifiqueEnjeuxIrdRestAdmin {

@Autowired
private EvenementColloqueScienntifiqueEnjeuxIrdAdminService evenementColloqueScienntifiqueEnjeuxIrdService;

@Autowired
private EvenementColloqueScienntifiqueEnjeuxIrdConverter evenementColloqueScienntifiqueEnjeuxIrdConverter;


            @ApiOperation("Updates the specified  evenementColloqueScienntifiqueEnjeuxIrd")
            @PutMapping("/")
            public  EvenementColloqueScienntifiqueEnjeuxIrdVo update(@RequestBody  EvenementColloqueScienntifiqueEnjeuxIrdVo  evenementColloqueScienntifiqueEnjeuxIrdVo){
            EvenementColloqueScienntifiqueEnjeuxIrd evenementColloqueScienntifiqueEnjeuxIrd = evenementColloqueScienntifiqueEnjeuxIrdConverter.toItem(evenementColloqueScienntifiqueEnjeuxIrdVo);
            evenementColloqueScienntifiqueEnjeuxIrd = evenementColloqueScienntifiqueEnjeuxIrdService.update(evenementColloqueScienntifiqueEnjeuxIrd);
            return evenementColloqueScienntifiqueEnjeuxIrdConverter.toVo(evenementColloqueScienntifiqueEnjeuxIrd);
            }

    @ApiOperation("Finds a list of all evenementColloqueScienntifiqueEnjeuxIrds")
    @GetMapping("/")
    public List<EvenementColloqueScienntifiqueEnjeuxIrdVo> findAll(){
        return evenementColloqueScienntifiqueEnjeuxIrdConverter.toVo(evenementColloqueScienntifiqueEnjeuxIrdService.findAll());
    }

    @ApiOperation("Finds a evenementColloqueScienntifiqueEnjeuxIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EvenementColloqueScienntifiqueEnjeuxIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return evenementColloqueScienntifiqueEnjeuxIrdConverter.toVo(evenementColloqueScienntifiqueEnjeuxIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search evenementColloqueScienntifiqueEnjeuxIrd by a specific criteria")
    @PostMapping("/search")
    public List<EvenementColloqueScienntifiqueEnjeuxIrdVo> findByCriteria(@RequestBody EvenementColloqueScienntifiqueEnjeuxIrdVo evenementColloqueScienntifiqueEnjeuxIrdVo){
        return evenementColloqueScienntifiqueEnjeuxIrdConverter.toVo(evenementColloqueScienntifiqueEnjeuxIrdService.findByCriteria(evenementColloqueScienntifiqueEnjeuxIrdVo));
        }

            @ApiOperation("Finds a evenementColloqueScienntifiqueEnjeuxIrd by id")
            @GetMapping("/id/{id}")
            public EvenementColloqueScienntifiqueEnjeuxIrdVo findById(@PathVariable Long id){
            return evenementColloqueScienntifiqueEnjeuxIrdConverter.toVo(evenementColloqueScienntifiqueEnjeuxIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  evenementColloqueScienntifiqueEnjeuxIrd")
            @PostMapping("/")
            public EvenementColloqueScienntifiqueEnjeuxIrdVo save(@RequestBody EvenementColloqueScienntifiqueEnjeuxIrdVo evenementColloqueScienntifiqueEnjeuxIrdVo){
            EvenementColloqueScienntifiqueEnjeuxIrd evenementColloqueScienntifiqueEnjeuxIrd = evenementColloqueScienntifiqueEnjeuxIrdConverter.toItem(evenementColloqueScienntifiqueEnjeuxIrdVo);
            evenementColloqueScienntifiqueEnjeuxIrd = evenementColloqueScienntifiqueEnjeuxIrdService.save(evenementColloqueScienntifiqueEnjeuxIrd);
            return evenementColloqueScienntifiqueEnjeuxIrdConverter.toVo(evenementColloqueScienntifiqueEnjeuxIrd);
            }

            @ApiOperation("Delete the specified evenementColloqueScienntifiqueEnjeuxIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody EvenementColloqueScienntifiqueEnjeuxIrdVo evenementColloqueScienntifiqueEnjeuxIrdVo){
            EvenementColloqueScienntifiqueEnjeuxIrd evenementColloqueScienntifiqueEnjeuxIrd = evenementColloqueScienntifiqueEnjeuxIrdConverter.toItem(evenementColloqueScienntifiqueEnjeuxIrdVo);
            return evenementColloqueScienntifiqueEnjeuxIrdService.delete(evenementColloqueScienntifiqueEnjeuxIrd);
            }

            @ApiOperation("Deletes a evenementColloqueScienntifiqueEnjeuxIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return evenementColloqueScienntifiqueEnjeuxIrdService.deleteById(id);
            }
        @ApiOperation("find by evenementColloqueScienntifique id")
        @GetMapping("/evenementColloqueScienntifique/id/{id}")
        public List<EvenementColloqueScienntifiqueEnjeuxIrd> findByEvenementColloqueScienntifiqueId(@PathVariable Long id){
        return evenementColloqueScienntifiqueEnjeuxIrdService.findByEvenementColloqueScienntifiqueId(id);
        }

        @ApiOperation("delete by evenementColloqueScienntifique id")
        @DeleteMapping("/evenementColloqueScienntifique/id/{id}")
        public int deleteByEvenementColloqueScienntifiqueId(@PathVariable Long id){
        return evenementColloqueScienntifiqueEnjeuxIrdService.deleteByEvenementColloqueScienntifiqueId(id);
        }

        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<EvenementColloqueScienntifiqueEnjeuxIrd> findByEnjeuxIrdCode(@PathVariable String code){
        return evenementColloqueScienntifiqueEnjeuxIrdService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return evenementColloqueScienntifiqueEnjeuxIrdService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<EvenementColloqueScienntifiqueEnjeuxIrd> findByEnjeuxIrdId(@PathVariable Long id){
        return evenementColloqueScienntifiqueEnjeuxIrdService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return evenementColloqueScienntifiqueEnjeuxIrdService.deleteByEnjeuxIrdId(id);
        }



            }
