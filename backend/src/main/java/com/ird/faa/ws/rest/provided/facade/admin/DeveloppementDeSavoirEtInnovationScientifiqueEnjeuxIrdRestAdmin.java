package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdAdminService;

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
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.converter.DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo;

@Api("Manages developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd services")
@RestController
@RequestMapping("api/admin/developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd")
public class DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdRestAdmin {

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdAdminService developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService;

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter;


            @ApiOperation("Updates the specified  developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd")
            @PutMapping("/")
            public  DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo update(@RequestBody  DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo  developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo){
            DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd = developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.toItem(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo);
            developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd = developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.update(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd);
            return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.toVo(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd);
            }

    @ApiOperation("Finds a list of all developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds")
    @GetMapping("/")
    public List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo> findAll(){
        return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.toVo(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.findAll());
    }

    @ApiOperation("Finds a developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.toVo(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd by a specific criteria")
    @PostMapping("/search")
    public List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo> findByCriteria(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo){
        return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.toVo(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.findByCriteria(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo));
        }

            @ApiOperation("Finds a developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd by id")
            @GetMapping("/id/{id}")
            public DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo findById(@PathVariable Long id){
            return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.toVo(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd")
            @PostMapping("/")
            public DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo save(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo){
            DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd = developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.toItem(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo);
            developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd = developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.save(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd);
            return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.toVo(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd);
            }

            @ApiOperation("Delete the specified developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo){
            DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd = developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.toItem(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo);
            return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.delete(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd);
            }

            @ApiOperation("Deletes a developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.deleteById(id);
            }
        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd> findByEnjeuxIrdCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd> findByEnjeuxIrdId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.deleteByEnjeuxIrdId(id);
        }

        @ApiOperation("find by developpementDeSavoirEtInnovationScientifique id")
        @GetMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd> findByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }

        @ApiOperation("delete by developpementDeSavoirEtInnovationScientifique id")
        @DeleteMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }



            }
