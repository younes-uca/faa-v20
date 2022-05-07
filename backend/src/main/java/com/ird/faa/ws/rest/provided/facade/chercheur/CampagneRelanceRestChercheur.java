package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.CampagneRelanceChercheurService;

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
import com.ird.faa.bean.CampagneRelance;
import com.ird.faa.ws.rest.provided.converter.CampagneRelanceConverter;
import com.ird.faa.ws.rest.provided.vo.CampagneRelanceVo;

@Api("Manages campagneRelance services")
@RestController
@RequestMapping("api/chercheur/campagneRelance")
public class CampagneRelanceRestChercheur {

@Autowired
private CampagneRelanceChercheurService campagneRelanceService;

@Autowired
private CampagneRelanceConverter campagneRelanceConverter;


            @ApiOperation("Updates the specified  campagneRelance")
            @PutMapping("/")
            public  CampagneRelanceVo update(@RequestBody  CampagneRelanceVo  campagneRelanceVo){
            CampagneRelance campagneRelance = campagneRelanceConverter.toItem(campagneRelanceVo);
            campagneRelance = campagneRelanceService.update(campagneRelance);
            return campagneRelanceConverter.toVo(campagneRelance);
            }

    @ApiOperation("Finds a list of all campagneRelances")
    @GetMapping("/")
    public List<CampagneRelanceVo> findAll(){
        return campagneRelanceConverter.toVo(campagneRelanceService.findAll());
    }

    @ApiOperation("Finds a campagneRelance with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CampagneRelanceVo findByIdWithAssociatedList(@PathVariable Long id){
    return campagneRelanceConverter.toVo(campagneRelanceService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search campagneRelance by a specific criteria")
    @PostMapping("/search")
    public List<CampagneRelanceVo> findByCriteria(@RequestBody CampagneRelanceVo campagneRelanceVo){
        return campagneRelanceConverter.toVo(campagneRelanceService.findByCriteria(campagneRelanceVo));
        }

            @ApiOperation("Finds a campagneRelance by id")
            @GetMapping("/id/{id}")
            public CampagneRelanceVo findById(@PathVariable Long id){
            return campagneRelanceConverter.toVo(campagneRelanceService.findById(id));
            }

            @ApiOperation("Saves the specified  campagneRelance")
            @PostMapping("/")
            public CampagneRelanceVo save(@RequestBody CampagneRelanceVo campagneRelanceVo){
            CampagneRelance campagneRelance = campagneRelanceConverter.toItem(campagneRelanceVo);
            campagneRelance = campagneRelanceService.save(campagneRelance);
            return campagneRelanceConverter.toVo(campagneRelance);
            }

            @ApiOperation("Delete the specified campagneRelance")
            @DeleteMapping("/")
            public int delete(@RequestBody CampagneRelanceVo campagneRelanceVo){
            CampagneRelance campagneRelance = campagneRelanceConverter.toItem(campagneRelanceVo);
            return campagneRelanceService.delete(campagneRelance);
            }

            @ApiOperation("Deletes a campagneRelance by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return campagneRelanceService.deleteById(id);
            }
        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<CampagneRelance> findByCampagneCode(@PathVariable String code){
        return campagneRelanceService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return campagneRelanceService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<CampagneRelance> findByCampagneId(@PathVariable Long id){
        return campagneRelanceService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return campagneRelanceService.deleteByCampagneId(id);
        }

        @ApiOperation("find by templateRelance code")
        @GetMapping("/templateRelance/code/{code}")
        public List<CampagneRelance> findByTemplateRelanceCode(@PathVariable String code){
        return campagneRelanceService.findByTemplateRelanceCode(code);
        }

        @ApiOperation("delete by templateRelance code")
        @DeleteMapping("/templateRelance/code/{code}")
        public int deleteByTemplateRelanceCode(@PathVariable String code){
        return campagneRelanceService.deleteByTemplateRelanceCode(code);
        }

        @ApiOperation("find by templateRelance id")
        @GetMapping("/templateRelance/id/{id}")
        public List<CampagneRelance> findByTemplateRelanceId(@PathVariable Long id){
        return campagneRelanceService.findByTemplateRelanceId(id);
        }

        @ApiOperation("delete by templateRelance id")
        @DeleteMapping("/templateRelance/id/{id}")
        public int deleteByTemplateRelanceId(@PathVariable Long id){
        return campagneRelanceService.deleteByTemplateRelanceId(id);
        }



            }
