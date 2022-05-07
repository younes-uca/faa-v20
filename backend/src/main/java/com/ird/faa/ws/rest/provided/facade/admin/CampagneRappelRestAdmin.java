package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.CampagneRappelAdminService;

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
import com.ird.faa.bean.CampagneRappel;
import com.ird.faa.ws.rest.provided.converter.CampagneRappelConverter;
import com.ird.faa.ws.rest.provided.vo.CampagneRappelVo;

@Api("Manages campagneRappel services")
@RestController
@RequestMapping("api/admin/campagneRappel")
public class CampagneRappelRestAdmin {

@Autowired
private CampagneRappelAdminService campagneRappelService;

@Autowired
private CampagneRappelConverter campagneRappelConverter;


            @ApiOperation("Updates the specified  campagneRappel")
            @PutMapping("/")
            public  CampagneRappelVo update(@RequestBody  CampagneRappelVo  campagneRappelVo){
            CampagneRappel campagneRappel = campagneRappelConverter.toItem(campagneRappelVo);
            campagneRappel = campagneRappelService.update(campagneRappel);
            return campagneRappelConverter.toVo(campagneRappel);
            }

    @ApiOperation("Finds a list of all campagneRappels")
    @GetMapping("/")
    public List<CampagneRappelVo> findAll(){
        return campagneRappelConverter.toVo(campagneRappelService.findAll());
    }

    @ApiOperation("Finds a campagneRappel with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CampagneRappelVo findByIdWithAssociatedList(@PathVariable Long id){
    return campagneRappelConverter.toVo(campagneRappelService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search campagneRappel by a specific criteria")
    @PostMapping("/search")
    public List<CampagneRappelVo> findByCriteria(@RequestBody CampagneRappelVo campagneRappelVo){
        return campagneRappelConverter.toVo(campagneRappelService.findByCriteria(campagneRappelVo));
        }

            @ApiOperation("Finds a campagneRappel by id")
            @GetMapping("/id/{id}")
            public CampagneRappelVo findById(@PathVariable Long id){
            return campagneRappelConverter.toVo(campagneRappelService.findById(id));
            }

            @ApiOperation("Saves the specified  campagneRappel")
            @PostMapping("/")
            public CampagneRappelVo save(@RequestBody CampagneRappelVo campagneRappelVo){
            CampagneRappel campagneRappel = campagneRappelConverter.toItem(campagneRappelVo);
            campagneRappel = campagneRappelService.save(campagneRappel);
            return campagneRappelConverter.toVo(campagneRappel);
            }

            @ApiOperation("Delete the specified campagneRappel")
            @DeleteMapping("/")
            public int delete(@RequestBody CampagneRappelVo campagneRappelVo){
            CampagneRappel campagneRappel = campagneRappelConverter.toItem(campagneRappelVo);
            return campagneRappelService.delete(campagneRappel);
            }

            @ApiOperation("Deletes a campagneRappel by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return campagneRappelService.deleteById(id);
            }
        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<CampagneRappel> findByCampagneCode(@PathVariable String code){
        return campagneRappelService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return campagneRappelService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<CampagneRappel> findByCampagneId(@PathVariable Long id){
        return campagneRappelService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return campagneRappelService.deleteByCampagneId(id);
        }

        @ApiOperation("find by templateRappel code")
        @GetMapping("/templateRappel/code/{code}")
        public List<CampagneRappel> findByTemplateRappelCode(@PathVariable String code){
        return campagneRappelService.findByTemplateRappelCode(code);
        }

        @ApiOperation("delete by templateRappel code")
        @DeleteMapping("/templateRappel/code/{code}")
        public int deleteByTemplateRappelCode(@PathVariable String code){
        return campagneRappelService.deleteByTemplateRappelCode(code);
        }

        @ApiOperation("find by templateRappel id")
        @GetMapping("/templateRappel/id/{id}")
        public List<CampagneRappel> findByTemplateRappelId(@PathVariable Long id){
        return campagneRappelService.findByTemplateRappelId(id);
        }

        @ApiOperation("delete by templateRappel id")
        @DeleteMapping("/templateRappel/id/{id}")
        public int deleteByTemplateRappelId(@PathVariable Long id){
        return campagneRappelService.deleteByTemplateRappelId(id);
        }



            }
