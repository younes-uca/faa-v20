package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.ConsultanceScientifiquePonctuelleAdminService;

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
import com.ird.faa.bean.ConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.converter.ConsultanceScientifiquePonctuelleConverter;
import com.ird.faa.ws.rest.provided.vo.ConsultanceScientifiquePonctuelleVo;

@Api("Manages consultanceScientifiquePonctuelle services")
@RestController
@RequestMapping("api/admin/consultanceScientifiquePonctuelle")
public class ConsultanceScientifiquePonctuelleRestAdmin {

@Autowired
private ConsultanceScientifiquePonctuelleAdminService consultanceScientifiquePonctuelleService;

@Autowired
private ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter;


            @ApiOperation("Updates the specified  consultanceScientifiquePonctuelle")
            @PutMapping("/")
            public  ConsultanceScientifiquePonctuelleVo update(@RequestBody  ConsultanceScientifiquePonctuelleVo  consultanceScientifiquePonctuelleVo){
            ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelleConverter.toItem(consultanceScientifiquePonctuelleVo);
            consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelleService.update(consultanceScientifiquePonctuelle);
            return consultanceScientifiquePonctuelleConverter.toVo(consultanceScientifiquePonctuelle);
            }

    @ApiOperation("Finds a list of all consultanceScientifiquePonctuelles")
    @GetMapping("/")
    public List<ConsultanceScientifiquePonctuelleVo> findAll(){
        return consultanceScientifiquePonctuelleConverter.toVo(consultanceScientifiquePonctuelleService.findAll());
    }

    @ApiOperation("Finds a consultanceScientifiquePonctuelle with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ConsultanceScientifiquePonctuelleVo findByIdWithAssociatedList(@PathVariable Long id){
    return consultanceScientifiquePonctuelleConverter.toVo(consultanceScientifiquePonctuelleService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search consultanceScientifiquePonctuelle by a specific criteria")
    @PostMapping("/search")
    public List<ConsultanceScientifiquePonctuelleVo> findByCriteria(@RequestBody ConsultanceScientifiquePonctuelleVo consultanceScientifiquePonctuelleVo){
        return consultanceScientifiquePonctuelleConverter.toVo(consultanceScientifiquePonctuelleService.findByCriteria(consultanceScientifiquePonctuelleVo));
        }

            @ApiOperation("Finds a consultanceScientifiquePonctuelle by id")
            @GetMapping("/id/{id}")
            public ConsultanceScientifiquePonctuelleVo findById(@PathVariable Long id){
            return consultanceScientifiquePonctuelleConverter.toVo(consultanceScientifiquePonctuelleService.findById(id));
            }

            @ApiOperation("Saves the specified  consultanceScientifiquePonctuelle")
            @PostMapping("/")
            public ConsultanceScientifiquePonctuelleVo save(@RequestBody ConsultanceScientifiquePonctuelleVo consultanceScientifiquePonctuelleVo){
            ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelleConverter.toItem(consultanceScientifiquePonctuelleVo);
            consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelleService.save(consultanceScientifiquePonctuelle);
            return consultanceScientifiquePonctuelleConverter.toVo(consultanceScientifiquePonctuelle);
            }

            @ApiOperation("Delete the specified consultanceScientifiquePonctuelle")
            @DeleteMapping("/")
            public int delete(@RequestBody ConsultanceScientifiquePonctuelleVo consultanceScientifiquePonctuelleVo){
            ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelleConverter.toItem(consultanceScientifiquePonctuelleVo);
            return consultanceScientifiquePonctuelleService.delete(consultanceScientifiquePonctuelle);
            }

            @ApiOperation("Deletes a consultanceScientifiquePonctuelle by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return consultanceScientifiquePonctuelleService.deleteById(id);
            }
        @ApiOperation("find by typeExpertise code")
        @GetMapping("/typeExpertise/code/{code}")
        public List<ConsultanceScientifiquePonctuelle> findByTypeExpertiseCode(@PathVariable String code){
        return consultanceScientifiquePonctuelleService.findByTypeExpertiseCode(code);
        }

        @ApiOperation("delete by typeExpertise code")
        @DeleteMapping("/typeExpertise/code/{code}")
        public int deleteByTypeExpertiseCode(@PathVariable String code){
        return consultanceScientifiquePonctuelleService.deleteByTypeExpertiseCode(code);
        }

        @ApiOperation("find by typeExpertise id")
        @GetMapping("/typeExpertise/id/{id}")
        public List<ConsultanceScientifiquePonctuelle> findByTypeExpertiseId(@PathVariable Long id){
        return consultanceScientifiquePonctuelleService.findByTypeExpertiseId(id);
        }

        @ApiOperation("delete by typeExpertise id")
        @DeleteMapping("/typeExpertise/id/{id}")
        public int deleteByTypeExpertiseId(@PathVariable Long id){
        return consultanceScientifiquePonctuelleService.deleteByTypeExpertiseId(id);
        }

        @ApiOperation("find by natureExpertise code")
        @GetMapping("/natureExpertise/code/{code}")
        public List<ConsultanceScientifiquePonctuelle> findByNatureExpertiseCode(@PathVariable String code){
        return consultanceScientifiquePonctuelleService.findByNatureExpertiseCode(code);
        }

        @ApiOperation("delete by natureExpertise code")
        @DeleteMapping("/natureExpertise/code/{code}")
        public int deleteByNatureExpertiseCode(@PathVariable String code){
        return consultanceScientifiquePonctuelleService.deleteByNatureExpertiseCode(code);
        }

        @ApiOperation("find by natureExpertise id")
        @GetMapping("/natureExpertise/id/{id}")
        public List<ConsultanceScientifiquePonctuelle> findByNatureExpertiseId(@PathVariable Long id){
        return consultanceScientifiquePonctuelleService.findByNatureExpertiseId(id);
        }

        @ApiOperation("delete by natureExpertise id")
        @DeleteMapping("/natureExpertise/id/{id}")
        public int deleteByNatureExpertiseId(@PathVariable Long id){
        return consultanceScientifiquePonctuelleService.deleteByNatureExpertiseId(id);
        }

        @ApiOperation("find by expertise id")
        @GetMapping("/expertise/id/{id}")
        public List<ConsultanceScientifiquePonctuelle> findByExpertiseId(@PathVariable Long id){
        return consultanceScientifiquePonctuelleService.findByExpertiseId(id);
        }

        @ApiOperation("delete by expertise id")
        @DeleteMapping("/expertise/id/{id}")
        public int deleteByExpertiseId(@PathVariable Long id){
        return consultanceScientifiquePonctuelleService.deleteByExpertiseId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<ConsultanceScientifiquePonctuelle> findByEtatEtapeCampagneCode(@PathVariable String code){
        return consultanceScientifiquePonctuelleService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return consultanceScientifiquePonctuelleService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<ConsultanceScientifiquePonctuelle> findByEtatEtapeCampagneId(@PathVariable Long id){
        return consultanceScientifiquePonctuelleService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return consultanceScientifiquePonctuelleService.deleteByEtatEtapeCampagneId(id);
        }



            }
