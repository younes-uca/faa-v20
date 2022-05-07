package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.ConseilsScientifiqueAdminService;

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
import com.ird.faa.bean.ConseilsScientifique;
import com.ird.faa.ws.rest.provided.converter.ConseilsScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.ConseilsScientifiqueVo;

@Api("Manages conseilsScientifique services")
@RestController
@RequestMapping("api/admin/conseilsScientifique")
public class ConseilsScientifiqueRestAdmin {

@Autowired
private ConseilsScientifiqueAdminService conseilsScientifiqueService;

@Autowired
private ConseilsScientifiqueConverter conseilsScientifiqueConverter;


            @ApiOperation("Updates the specified  conseilsScientifique")
            @PutMapping("/")
            public  ConseilsScientifiqueVo update(@RequestBody  ConseilsScientifiqueVo  conseilsScientifiqueVo){
            ConseilsScientifique conseilsScientifique = conseilsScientifiqueConverter.toItem(conseilsScientifiqueVo);
            conseilsScientifique = conseilsScientifiqueService.update(conseilsScientifique);
            return conseilsScientifiqueConverter.toVo(conseilsScientifique);
            }

    @ApiOperation("Finds a list of all conseilsScientifiques")
    @GetMapping("/")
    public List<ConseilsScientifiqueVo> findAll(){
        return conseilsScientifiqueConverter.toVo(conseilsScientifiqueService.findAll());
    }

    @ApiOperation("Finds a conseilsScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ConseilsScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return conseilsScientifiqueConverter.toVo(conseilsScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search conseilsScientifique by a specific criteria")
    @PostMapping("/search")
    public List<ConseilsScientifiqueVo> findByCriteria(@RequestBody ConseilsScientifiqueVo conseilsScientifiqueVo){
        return conseilsScientifiqueConverter.toVo(conseilsScientifiqueService.findByCriteria(conseilsScientifiqueVo));
        }

            @ApiOperation("Finds a conseilsScientifique by id")
            @GetMapping("/id/{id}")
            public ConseilsScientifiqueVo findById(@PathVariable Long id){
            return conseilsScientifiqueConverter.toVo(conseilsScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  conseilsScientifique")
            @PostMapping("/")
            public ConseilsScientifiqueVo save(@RequestBody ConseilsScientifiqueVo conseilsScientifiqueVo){
            ConseilsScientifique conseilsScientifique = conseilsScientifiqueConverter.toItem(conseilsScientifiqueVo);
            conseilsScientifique = conseilsScientifiqueService.save(conseilsScientifique);
            return conseilsScientifiqueConverter.toVo(conseilsScientifique);
            }

            @ApiOperation("Delete the specified conseilsScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody ConseilsScientifiqueVo conseilsScientifiqueVo){
            ConseilsScientifique conseilsScientifique = conseilsScientifiqueConverter.toItem(conseilsScientifiqueVo);
            return conseilsScientifiqueService.delete(conseilsScientifique);
            }

            @ApiOperation("Deletes a conseilsScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return conseilsScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by natureExpertise code")
        @GetMapping("/natureExpertise/code/{code}")
        public List<ConseilsScientifique> findByNatureExpertiseCode(@PathVariable String code){
        return conseilsScientifiqueService.findByNatureExpertiseCode(code);
        }

        @ApiOperation("delete by natureExpertise code")
        @DeleteMapping("/natureExpertise/code/{code}")
        public int deleteByNatureExpertiseCode(@PathVariable String code){
        return conseilsScientifiqueService.deleteByNatureExpertiseCode(code);
        }

        @ApiOperation("find by natureExpertise id")
        @GetMapping("/natureExpertise/id/{id}")
        public List<ConseilsScientifique> findByNatureExpertiseId(@PathVariable Long id){
        return conseilsScientifiqueService.findByNatureExpertiseId(id);
        }

        @ApiOperation("delete by natureExpertise id")
        @DeleteMapping("/natureExpertise/id/{id}")
        public int deleteByNatureExpertiseId(@PathVariable Long id){
        return conseilsScientifiqueService.deleteByNatureExpertiseId(id);
        }

        @ApiOperation("find by typeExpertise code")
        @GetMapping("/typeExpertise/code/{code}")
        public List<ConseilsScientifique> findByTypeExpertiseCode(@PathVariable String code){
        return conseilsScientifiqueService.findByTypeExpertiseCode(code);
        }

        @ApiOperation("delete by typeExpertise code")
        @DeleteMapping("/typeExpertise/code/{code}")
        public int deleteByTypeExpertiseCode(@PathVariable String code){
        return conseilsScientifiqueService.deleteByTypeExpertiseCode(code);
        }

        @ApiOperation("find by typeExpertise id")
        @GetMapping("/typeExpertise/id/{id}")
        public List<ConseilsScientifique> findByTypeExpertiseId(@PathVariable Long id){
        return conseilsScientifiqueService.findByTypeExpertiseId(id);
        }

        @ApiOperation("delete by typeExpertise id")
        @DeleteMapping("/typeExpertise/id/{id}")
        public int deleteByTypeExpertiseId(@PathVariable Long id){
        return conseilsScientifiqueService.deleteByTypeExpertiseId(id);
        }

        @ApiOperation("find by expertise id")
        @GetMapping("/expertise/id/{id}")
        public List<ConseilsScientifique> findByExpertiseId(@PathVariable Long id){
        return conseilsScientifiqueService.findByExpertiseId(id);
        }

        @ApiOperation("delete by expertise id")
        @DeleteMapping("/expertise/id/{id}")
        public int deleteByExpertiseId(@PathVariable Long id){
        return conseilsScientifiqueService.deleteByExpertiseId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<ConseilsScientifique> findByEtatEtapeCampagneCode(@PathVariable String code){
        return conseilsScientifiqueService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return conseilsScientifiqueService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<ConseilsScientifique> findByEtatEtapeCampagneId(@PathVariable Long id){
        return conseilsScientifiqueService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return conseilsScientifiqueService.deleteByEtatEtapeCampagneId(id);
        }



            }
