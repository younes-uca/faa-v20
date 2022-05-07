package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.RencontreMediaEnjeuxIrdAdminService;

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
import com.ird.faa.bean.RencontreMediaEnjeuxIrd;
import com.ird.faa.ws.rest.provided.converter.RencontreMediaEnjeuxIrdConverter;
import com.ird.faa.ws.rest.provided.vo.RencontreMediaEnjeuxIrdVo;

@Api("Manages rencontreMediaEnjeuxIrd services")
@RestController
@RequestMapping("api/admin/rencontreMediaEnjeuxIrd")
public class RencontreMediaEnjeuxIrdRestAdmin {

@Autowired
private RencontreMediaEnjeuxIrdAdminService rencontreMediaEnjeuxIrdService;

@Autowired
private RencontreMediaEnjeuxIrdConverter rencontreMediaEnjeuxIrdConverter;


            @ApiOperation("Updates the specified  rencontreMediaEnjeuxIrd")
            @PutMapping("/")
            public  RencontreMediaEnjeuxIrdVo update(@RequestBody  RencontreMediaEnjeuxIrdVo  rencontreMediaEnjeuxIrdVo){
            RencontreMediaEnjeuxIrd rencontreMediaEnjeuxIrd = rencontreMediaEnjeuxIrdConverter.toItem(rencontreMediaEnjeuxIrdVo);
            rencontreMediaEnjeuxIrd = rencontreMediaEnjeuxIrdService.update(rencontreMediaEnjeuxIrd);
            return rencontreMediaEnjeuxIrdConverter.toVo(rencontreMediaEnjeuxIrd);
            }

    @ApiOperation("Finds a list of all rencontreMediaEnjeuxIrds")
    @GetMapping("/")
    public List<RencontreMediaEnjeuxIrdVo> findAll(){
        return rencontreMediaEnjeuxIrdConverter.toVo(rencontreMediaEnjeuxIrdService.findAll());
    }

    @ApiOperation("Finds a rencontreMediaEnjeuxIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public RencontreMediaEnjeuxIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return rencontreMediaEnjeuxIrdConverter.toVo(rencontreMediaEnjeuxIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search rencontreMediaEnjeuxIrd by a specific criteria")
    @PostMapping("/search")
    public List<RencontreMediaEnjeuxIrdVo> findByCriteria(@RequestBody RencontreMediaEnjeuxIrdVo rencontreMediaEnjeuxIrdVo){
        return rencontreMediaEnjeuxIrdConverter.toVo(rencontreMediaEnjeuxIrdService.findByCriteria(rencontreMediaEnjeuxIrdVo));
        }

            @ApiOperation("Finds a rencontreMediaEnjeuxIrd by id")
            @GetMapping("/id/{id}")
            public RencontreMediaEnjeuxIrdVo findById(@PathVariable Long id){
            return rencontreMediaEnjeuxIrdConverter.toVo(rencontreMediaEnjeuxIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  rencontreMediaEnjeuxIrd")
            @PostMapping("/")
            public RencontreMediaEnjeuxIrdVo save(@RequestBody RencontreMediaEnjeuxIrdVo rencontreMediaEnjeuxIrdVo){
            RencontreMediaEnjeuxIrd rencontreMediaEnjeuxIrd = rencontreMediaEnjeuxIrdConverter.toItem(rencontreMediaEnjeuxIrdVo);
            rencontreMediaEnjeuxIrd = rencontreMediaEnjeuxIrdService.save(rencontreMediaEnjeuxIrd);
            return rencontreMediaEnjeuxIrdConverter.toVo(rencontreMediaEnjeuxIrd);
            }

            @ApiOperation("Delete the specified rencontreMediaEnjeuxIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody RencontreMediaEnjeuxIrdVo rencontreMediaEnjeuxIrdVo){
            RencontreMediaEnjeuxIrd rencontreMediaEnjeuxIrd = rencontreMediaEnjeuxIrdConverter.toItem(rencontreMediaEnjeuxIrdVo);
            return rencontreMediaEnjeuxIrdService.delete(rencontreMediaEnjeuxIrd);
            }

            @ApiOperation("Deletes a rencontreMediaEnjeuxIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return rencontreMediaEnjeuxIrdService.deleteById(id);
            }
        @ApiOperation("find by rencontreMedia id")
        @GetMapping("/rencontreMedia/id/{id}")
        public List<RencontreMediaEnjeuxIrd> findByRencontreMediaId(@PathVariable Long id){
        return rencontreMediaEnjeuxIrdService.findByRencontreMediaId(id);
        }

        @ApiOperation("delete by rencontreMedia id")
        @DeleteMapping("/rencontreMedia/id/{id}")
        public int deleteByRencontreMediaId(@PathVariable Long id){
        return rencontreMediaEnjeuxIrdService.deleteByRencontreMediaId(id);
        }

        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<RencontreMediaEnjeuxIrd> findByEnjeuxIrdCode(@PathVariable String code){
        return rencontreMediaEnjeuxIrdService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return rencontreMediaEnjeuxIrdService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<RencontreMediaEnjeuxIrd> findByEnjeuxIrdId(@PathVariable Long id){
        return rencontreMediaEnjeuxIrdService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return rencontreMediaEnjeuxIrdService.deleteByEnjeuxIrdId(id);
        }



            }
