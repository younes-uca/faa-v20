package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirAdminService;

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
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir;
import com.ird.faa.ws.rest.provided.converter.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo;

@Api("Manages developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir services")
@RestController
@RequestMapping("api/admin/developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir")
public class DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirRestAdmin {

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirAdminService developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService;

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter;


            @ApiOperation("Updates the specified  developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir")
            @PutMapping("/")
            public  DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo update(@RequestBody  DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo  developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo){
            DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir = developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.toItem(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo);
            developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir = developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.update(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir);
            return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.toVo(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir);
            }

    @ApiOperation("Finds a list of all developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs")
    @GetMapping("/")
    public List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo> findAll(){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.toVo(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.findAll());
    }

    @ApiOperation("Finds a developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo findByIdWithAssociatedList(@PathVariable Long id){
    return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.toVo(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir by a specific criteria")
    @PostMapping("/search")
    public List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo> findByCriteria(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.toVo(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.findByCriteria(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo));
        }

            @ApiOperation("Finds a developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir by id")
            @GetMapping("/id/{id}")
            public DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo findById(@PathVariable Long id){
            return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.toVo(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.findById(id));
            }

            @ApiOperation("Saves the specified  developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir")
            @PostMapping("/")
            public DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo save(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo){
            DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir = developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.toItem(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo);
            developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir = developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.save(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir);
            return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.toVo(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir);
            }

            @ApiOperation("Delete the specified developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir")
            @DeleteMapping("/")
            public int delete(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo){
            DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir = developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.toItem(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo);
            return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.delete(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir);
            }

            @ApiOperation("Deletes a developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.deleteById(id);
            }
        @ApiOperation("find by communauteSavoir code")
        @GetMapping("/communauteSavoir/code/{code}")
        public List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> findByCommunauteSavoirCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.findByCommunauteSavoirCode(code);
        }

        @ApiOperation("delete by communauteSavoir code")
        @DeleteMapping("/communauteSavoir/code/{code}")
        public int deleteByCommunauteSavoirCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.deleteByCommunauteSavoirCode(code);
        }

        @ApiOperation("find by communauteSavoir id")
        @GetMapping("/communauteSavoir/id/{id}")
        public List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> findByCommunauteSavoirId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.findByCommunauteSavoirId(id);
        }

        @ApiOperation("delete by communauteSavoir id")
        @DeleteMapping("/communauteSavoir/id/{id}")
        public int deleteByCommunauteSavoirId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.deleteByCommunauteSavoirId(id);
        }

        @ApiOperation("find by developpementDeSavoirEtInnovationScientifique id")
        @GetMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> findByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }

        @ApiOperation("delete by developpementDeSavoirEtInnovationScientifique id")
        @DeleteMapping("/developpementDeSavoirEtInnovationScientifique/id/{id}")
        public int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }



            }
