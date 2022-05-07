package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EncadrementEtudiantEnjeuxIrdAdminService;

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
import com.ird.faa.bean.EncadrementEtudiantEnjeuxIrd;
import com.ird.faa.ws.rest.provided.converter.EncadrementEtudiantEnjeuxIrdConverter;
import com.ird.faa.ws.rest.provided.vo.EncadrementEtudiantEnjeuxIrdVo;

@Api("Manages encadrementEtudiantEnjeuxIrd services")
@RestController
@RequestMapping("api/admin/encadrementEtudiantEnjeuxIrd")
public class EncadrementEtudiantEnjeuxIrdRestAdmin {

@Autowired
private EncadrementEtudiantEnjeuxIrdAdminService encadrementEtudiantEnjeuxIrdService;

@Autowired
private EncadrementEtudiantEnjeuxIrdConverter encadrementEtudiantEnjeuxIrdConverter;


            @ApiOperation("Updates the specified  encadrementEtudiantEnjeuxIrd")
            @PutMapping("/")
            public  EncadrementEtudiantEnjeuxIrdVo update(@RequestBody  EncadrementEtudiantEnjeuxIrdVo  encadrementEtudiantEnjeuxIrdVo){
            EncadrementEtudiantEnjeuxIrd encadrementEtudiantEnjeuxIrd = encadrementEtudiantEnjeuxIrdConverter.toItem(encadrementEtudiantEnjeuxIrdVo);
            encadrementEtudiantEnjeuxIrd = encadrementEtudiantEnjeuxIrdService.update(encadrementEtudiantEnjeuxIrd);
            return encadrementEtudiantEnjeuxIrdConverter.toVo(encadrementEtudiantEnjeuxIrd);
            }

    @ApiOperation("Finds a list of all encadrementEtudiantEnjeuxIrds")
    @GetMapping("/")
    public List<EncadrementEtudiantEnjeuxIrdVo> findAll(){
        return encadrementEtudiantEnjeuxIrdConverter.toVo(encadrementEtudiantEnjeuxIrdService.findAll());
    }

    @ApiOperation("Finds a encadrementEtudiantEnjeuxIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EncadrementEtudiantEnjeuxIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return encadrementEtudiantEnjeuxIrdConverter.toVo(encadrementEtudiantEnjeuxIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search encadrementEtudiantEnjeuxIrd by a specific criteria")
    @PostMapping("/search")
    public List<EncadrementEtudiantEnjeuxIrdVo> findByCriteria(@RequestBody EncadrementEtudiantEnjeuxIrdVo encadrementEtudiantEnjeuxIrdVo){
        return encadrementEtudiantEnjeuxIrdConverter.toVo(encadrementEtudiantEnjeuxIrdService.findByCriteria(encadrementEtudiantEnjeuxIrdVo));
        }

            @ApiOperation("Finds a encadrementEtudiantEnjeuxIrd by id")
            @GetMapping("/id/{id}")
            public EncadrementEtudiantEnjeuxIrdVo findById(@PathVariable Long id){
            return encadrementEtudiantEnjeuxIrdConverter.toVo(encadrementEtudiantEnjeuxIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  encadrementEtudiantEnjeuxIrd")
            @PostMapping("/")
            public EncadrementEtudiantEnjeuxIrdVo save(@RequestBody EncadrementEtudiantEnjeuxIrdVo encadrementEtudiantEnjeuxIrdVo){
            EncadrementEtudiantEnjeuxIrd encadrementEtudiantEnjeuxIrd = encadrementEtudiantEnjeuxIrdConverter.toItem(encadrementEtudiantEnjeuxIrdVo);
            encadrementEtudiantEnjeuxIrd = encadrementEtudiantEnjeuxIrdService.save(encadrementEtudiantEnjeuxIrd);
            return encadrementEtudiantEnjeuxIrdConverter.toVo(encadrementEtudiantEnjeuxIrd);
            }

            @ApiOperation("Delete the specified encadrementEtudiantEnjeuxIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody EncadrementEtudiantEnjeuxIrdVo encadrementEtudiantEnjeuxIrdVo){
            EncadrementEtudiantEnjeuxIrd encadrementEtudiantEnjeuxIrd = encadrementEtudiantEnjeuxIrdConverter.toItem(encadrementEtudiantEnjeuxIrdVo);
            return encadrementEtudiantEnjeuxIrdService.delete(encadrementEtudiantEnjeuxIrd);
            }

            @ApiOperation("Deletes a encadrementEtudiantEnjeuxIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return encadrementEtudiantEnjeuxIrdService.deleteById(id);
            }
        @ApiOperation("find by encadrementEtudiant id")
        @GetMapping("/encadrementEtudiant/id/{id}")
        public List<EncadrementEtudiantEnjeuxIrd> findByEncadrementEtudiantId(@PathVariable Long id){
        return encadrementEtudiantEnjeuxIrdService.findByEncadrementEtudiantId(id);
        }

        @ApiOperation("delete by encadrementEtudiant id")
        @DeleteMapping("/encadrementEtudiant/id/{id}")
        public int deleteByEncadrementEtudiantId(@PathVariable Long id){
        return encadrementEtudiantEnjeuxIrdService.deleteByEncadrementEtudiantId(id);
        }

        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<EncadrementEtudiantEnjeuxIrd> findByEnjeuxIrdCode(@PathVariable String code){
        return encadrementEtudiantEnjeuxIrdService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return encadrementEtudiantEnjeuxIrdService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<EncadrementEtudiantEnjeuxIrd> findByEnjeuxIrdId(@PathVariable Long id){
        return encadrementEtudiantEnjeuxIrdService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return encadrementEtudiantEnjeuxIrdService.deleteByEnjeuxIrdId(id);
        }



            }
