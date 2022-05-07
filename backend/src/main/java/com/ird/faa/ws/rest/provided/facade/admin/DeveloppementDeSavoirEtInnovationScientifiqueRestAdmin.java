package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.DeveloppementDeSavoirEtInnovationScientifiqueAdminService;

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
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.ws.rest.provided.converter.DeveloppementDeSavoirEtInnovationScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueVo;

@Api("Manages developpementDeSavoirEtInnovationScientifique services")
@RestController
@RequestMapping("api/admin/developpementDeSavoirEtInnovationScientifique")
public class DeveloppementDeSavoirEtInnovationScientifiqueRestAdmin {

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueAdminService developpementDeSavoirEtInnovationScientifiqueService;

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter;


            @ApiOperation("Updates the specified  developpementDeSavoirEtInnovationScientifique")
            @PutMapping("/")
            public  DeveloppementDeSavoirEtInnovationScientifiqueVo update(@RequestBody  DeveloppementDeSavoirEtInnovationScientifiqueVo  developpementDeSavoirEtInnovationScientifiqueVo){
            DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifiqueConverter.toItem(developpementDeSavoirEtInnovationScientifiqueVo);
            developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifiqueService.update(developpementDeSavoirEtInnovationScientifique);
            return developpementDeSavoirEtInnovationScientifiqueConverter.toVo(developpementDeSavoirEtInnovationScientifique);
            }

    @ApiOperation("Finds a list of all developpementDeSavoirEtInnovationScientifiques")
    @GetMapping("/")
    public List<DeveloppementDeSavoirEtInnovationScientifiqueVo> findAll(){
        return developpementDeSavoirEtInnovationScientifiqueConverter.toVo(developpementDeSavoirEtInnovationScientifiqueService.findAll());
    }

    @ApiOperation("Finds a developpementDeSavoirEtInnovationScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public DeveloppementDeSavoirEtInnovationScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return developpementDeSavoirEtInnovationScientifiqueConverter.toVo(developpementDeSavoirEtInnovationScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search developpementDeSavoirEtInnovationScientifique by a specific criteria")
    @PostMapping("/search")
    public List<DeveloppementDeSavoirEtInnovationScientifiqueVo> findByCriteria(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo){
        return developpementDeSavoirEtInnovationScientifiqueConverter.toVo(developpementDeSavoirEtInnovationScientifiqueService.findByCriteria(developpementDeSavoirEtInnovationScientifiqueVo));
        }

            @ApiOperation("Finds a developpementDeSavoirEtInnovationScientifique by id")
            @GetMapping("/id/{id}")
            public DeveloppementDeSavoirEtInnovationScientifiqueVo findById(@PathVariable Long id){
            return developpementDeSavoirEtInnovationScientifiqueConverter.toVo(developpementDeSavoirEtInnovationScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  developpementDeSavoirEtInnovationScientifique")
            @PostMapping("/")
            public DeveloppementDeSavoirEtInnovationScientifiqueVo save(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo){
            DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifiqueConverter.toItem(developpementDeSavoirEtInnovationScientifiqueVo);
            developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifiqueService.save(developpementDeSavoirEtInnovationScientifique);
            return developpementDeSavoirEtInnovationScientifiqueConverter.toVo(developpementDeSavoirEtInnovationScientifique);
            }

            @ApiOperation("Delete the specified developpementDeSavoirEtInnovationScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo){
            DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifiqueConverter.toItem(developpementDeSavoirEtInnovationScientifiqueVo);
            return developpementDeSavoirEtInnovationScientifiqueService.delete(developpementDeSavoirEtInnovationScientifique);
            }

            @ApiOperation("Deletes a developpementDeSavoirEtInnovationScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return developpementDeSavoirEtInnovationScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by roleDeveloppementDeSavoir code")
        @GetMapping("/roleDeveloppementDeSavoir/code/{code}")
        public List<DeveloppementDeSavoirEtInnovationScientifique> findByRoleDeveloppementDeSavoirCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiqueService.findByRoleDeveloppementDeSavoirCode(code);
        }

        @ApiOperation("delete by roleDeveloppementDeSavoir code")
        @DeleteMapping("/roleDeveloppementDeSavoir/code/{code}")
        public int deleteByRoleDeveloppementDeSavoirCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiqueService.deleteByRoleDeveloppementDeSavoirCode(code);
        }

        @ApiOperation("find by roleDeveloppementDeSavoir id")
        @GetMapping("/roleDeveloppementDeSavoir/id/{id}")
        public List<DeveloppementDeSavoirEtInnovationScientifique> findByRoleDeveloppementDeSavoirId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueService.findByRoleDeveloppementDeSavoirId(id);
        }

        @ApiOperation("delete by roleDeveloppementDeSavoir id")
        @DeleteMapping("/roleDeveloppementDeSavoir/id/{id}")
        public int deleteByRoleDeveloppementDeSavoirId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueService.deleteByRoleDeveloppementDeSavoirId(id);
        }

        @ApiOperation("find by savoirEtInnovation id")
        @GetMapping("/savoirEtInnovation/id/{id}")
        public List<DeveloppementDeSavoirEtInnovationScientifique> findBySavoirEtInnovationId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueService.findBySavoirEtInnovationId(id);
        }

        @ApiOperation("delete by savoirEtInnovation id")
        @DeleteMapping("/savoirEtInnovation/id/{id}")
        public int deleteBySavoirEtInnovationId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueService.deleteBySavoirEtInnovationId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<DeveloppementDeSavoirEtInnovationScientifique> findByEtatEtapeCampagneCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiqueService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return developpementDeSavoirEtInnovationScientifiqueService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<DeveloppementDeSavoirEtInnovationScientifique> findByEtatEtapeCampagneId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return developpementDeSavoirEtInnovationScientifiqueService.deleteByEtatEtapeCampagneId(id);
        }



            }
