package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueEnjeuxIrdAdminService;

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
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.converter.RencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo;

@Api("Manages rencontreGrandPubliqueJeunePubliqueEnjeuxIrd services")
@RestController
@RequestMapping("api/admin/rencontreGrandPubliqueJeunePubliqueEnjeuxIrd")
public class RencontreGrandPubliqueJeunePubliqueEnjeuxIrdRestAdmin {

@Autowired
private RencontreGrandPubliqueJeunePubliqueEnjeuxIrdAdminService rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService;

@Autowired
private RencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter;


            @ApiOperation("Updates the specified  rencontreGrandPubliqueJeunePubliqueEnjeuxIrd")
            @PutMapping("/")
            public  RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo update(@RequestBody  RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo  rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo){
            RencontreGrandPubliqueJeunePubliqueEnjeuxIrd rencontreGrandPubliqueJeunePubliqueEnjeuxIrd = rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.toItem(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo);
            rencontreGrandPubliqueJeunePubliqueEnjeuxIrd = rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.update(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd);
            return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.toVo(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd);
            }

    @ApiOperation("Finds a list of all rencontreGrandPubliqueJeunePubliqueEnjeuxIrds")
    @GetMapping("/")
    public List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo> findAll(){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.toVo(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.findAll());
    }

    @ApiOperation("Finds a rencontreGrandPubliqueJeunePubliqueEnjeuxIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.toVo(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search rencontreGrandPubliqueJeunePubliqueEnjeuxIrd by a specific criteria")
    @PostMapping("/search")
    public List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo> findByCriteria(@RequestBody RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.toVo(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.findByCriteria(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo));
        }

            @ApiOperation("Finds a rencontreGrandPubliqueJeunePubliqueEnjeuxIrd by id")
            @GetMapping("/id/{id}")
            public RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo findById(@PathVariable Long id){
            return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.toVo(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  rencontreGrandPubliqueJeunePubliqueEnjeuxIrd")
            @PostMapping("/")
            public RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo save(@RequestBody RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo){
            RencontreGrandPubliqueJeunePubliqueEnjeuxIrd rencontreGrandPubliqueJeunePubliqueEnjeuxIrd = rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.toItem(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo);
            rencontreGrandPubliqueJeunePubliqueEnjeuxIrd = rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.save(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd);
            return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.toVo(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd);
            }

            @ApiOperation("Delete the specified rencontreGrandPubliqueJeunePubliqueEnjeuxIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo){
            RencontreGrandPubliqueJeunePubliqueEnjeuxIrd rencontreGrandPubliqueJeunePubliqueEnjeuxIrd = rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.toItem(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo);
            return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.delete(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd);
            }

            @ApiOperation("Deletes a rencontreGrandPubliqueJeunePubliqueEnjeuxIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.deleteById(id);
            }
        @ApiOperation("find by rencontreGrandPubliqueJeunePublique id")
        @GetMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @ApiOperation("delete by rencontreGrandPubliqueJeunePublique id")
        @DeleteMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findByEnjeuxIrdCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findByEnjeuxIrdId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.deleteByEnjeuxIrdId(id);
        }



            }
