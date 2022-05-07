package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EnseignementEnjeuxIrdAdminService;

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
import com.ird.faa.bean.EnseignementEnjeuxIrd;
import com.ird.faa.ws.rest.provided.converter.EnseignementEnjeuxIrdConverter;
import com.ird.faa.ws.rest.provided.vo.EnseignementEnjeuxIrdVo;

@Api("Manages enseignementEnjeuxIrd services")
@RestController
@RequestMapping("api/admin/enseignementEnjeuxIrd")
public class EnseignementEnjeuxIrdRestAdmin {

@Autowired
private EnseignementEnjeuxIrdAdminService enseignementEnjeuxIrdService;

@Autowired
private EnseignementEnjeuxIrdConverter enseignementEnjeuxIrdConverter;


            @ApiOperation("Updates the specified  enseignementEnjeuxIrd")
            @PutMapping("/")
            public  EnseignementEnjeuxIrdVo update(@RequestBody  EnseignementEnjeuxIrdVo  enseignementEnjeuxIrdVo){
            EnseignementEnjeuxIrd enseignementEnjeuxIrd = enseignementEnjeuxIrdConverter.toItem(enseignementEnjeuxIrdVo);
            enseignementEnjeuxIrd = enseignementEnjeuxIrdService.update(enseignementEnjeuxIrd);
            return enseignementEnjeuxIrdConverter.toVo(enseignementEnjeuxIrd);
            }

    @ApiOperation("Finds a list of all enseignementEnjeuxIrds")
    @GetMapping("/")
    public List<EnseignementEnjeuxIrdVo> findAll(){
        return enseignementEnjeuxIrdConverter.toVo(enseignementEnjeuxIrdService.findAll());
    }

    @ApiOperation("Finds a enseignementEnjeuxIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EnseignementEnjeuxIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return enseignementEnjeuxIrdConverter.toVo(enseignementEnjeuxIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search enseignementEnjeuxIrd by a specific criteria")
    @PostMapping("/search")
    public List<EnseignementEnjeuxIrdVo> findByCriteria(@RequestBody EnseignementEnjeuxIrdVo enseignementEnjeuxIrdVo){
        return enseignementEnjeuxIrdConverter.toVo(enseignementEnjeuxIrdService.findByCriteria(enseignementEnjeuxIrdVo));
        }

            @ApiOperation("Finds a enseignementEnjeuxIrd by id")
            @GetMapping("/id/{id}")
            public EnseignementEnjeuxIrdVo findById(@PathVariable Long id){
            return enseignementEnjeuxIrdConverter.toVo(enseignementEnjeuxIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  enseignementEnjeuxIrd")
            @PostMapping("/")
            public EnseignementEnjeuxIrdVo save(@RequestBody EnseignementEnjeuxIrdVo enseignementEnjeuxIrdVo){
            EnseignementEnjeuxIrd enseignementEnjeuxIrd = enseignementEnjeuxIrdConverter.toItem(enseignementEnjeuxIrdVo);
            enseignementEnjeuxIrd = enseignementEnjeuxIrdService.save(enseignementEnjeuxIrd);
            return enseignementEnjeuxIrdConverter.toVo(enseignementEnjeuxIrd);
            }

            @ApiOperation("Delete the specified enseignementEnjeuxIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody EnseignementEnjeuxIrdVo enseignementEnjeuxIrdVo){
            EnseignementEnjeuxIrd enseignementEnjeuxIrd = enseignementEnjeuxIrdConverter.toItem(enseignementEnjeuxIrdVo);
            return enseignementEnjeuxIrdService.delete(enseignementEnjeuxIrd);
            }

            @ApiOperation("Deletes a enseignementEnjeuxIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return enseignementEnjeuxIrdService.deleteById(id);
            }
        @ApiOperation("find by enseignement id")
        @GetMapping("/enseignement/id/{id}")
        public List<EnseignementEnjeuxIrd> findByEnseignementId(@PathVariable Long id){
        return enseignementEnjeuxIrdService.findByEnseignementId(id);
        }

        @ApiOperation("delete by enseignement id")
        @DeleteMapping("/enseignement/id/{id}")
        public int deleteByEnseignementId(@PathVariable Long id){
        return enseignementEnjeuxIrdService.deleteByEnseignementId(id);
        }

        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<EnseignementEnjeuxIrd> findByEnjeuxIrdCode(@PathVariable String code){
        return enseignementEnjeuxIrdService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return enseignementEnjeuxIrdService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<EnseignementEnjeuxIrd> findByEnjeuxIrdId(@PathVariable Long id){
        return enseignementEnjeuxIrdService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return enseignementEnjeuxIrdService.deleteByEnjeuxIrdId(id);
        }



            }
