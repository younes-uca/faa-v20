package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.CampagneAdminService;

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
import com.ird.faa.bean.Campagne;
import com.ird.faa.ws.rest.provided.converter.CampagneConverter;
import com.ird.faa.ws.rest.provided.vo.CampagneVo;

@Api("Manages campagne services")
@RestController
@RequestMapping("api/admin/campagne")
public class CampagneRestAdmin {

@Autowired
private CampagneAdminService campagneService;

@Autowired
private CampagneConverter campagneConverter;


            @ApiOperation("Updates the specified  campagne")
            @PutMapping("/")
            public  CampagneVo update(@RequestBody  CampagneVo  campagneVo){
            Campagne campagne = campagneConverter.toItem(campagneVo);
            campagne = campagneService.update(campagne);
            return campagneConverter.toVo(campagne);
            }

    @ApiOperation("Finds a list of all campagnes")
    @GetMapping("/")
    public List<CampagneVo> findAll(){
        return campagneConverter.toVo(campagneService.findAll());
    }

    @ApiOperation("Finds a campagne with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CampagneVo findByIdWithAssociatedList(@PathVariable Long id){
    return campagneConverter.toVo(campagneService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search campagne by a specific criteria")
    @PostMapping("/search")
    public List<CampagneVo> findByCriteria(@RequestBody CampagneVo campagneVo){
        return campagneConverter.toVo(campagneService.findByCriteria(campagneVo));
        }

            @ApiOperation("Finds a campagne by id")
            @GetMapping("/id/{id}")
            public CampagneVo findById(@PathVariable Long id){
            return campagneConverter.toVo(campagneService.findById(id));
            }

            @ApiOperation("Saves the specified  campagne")
            @PostMapping("/")
            public CampagneVo save(@RequestBody CampagneVo campagneVo){
            Campagne campagne = campagneConverter.toItem(campagneVo);
            campagne = campagneService.save(campagne);
            return campagneConverter.toVo(campagne);
            }

            @ApiOperation("Delete the specified campagne")
            @DeleteMapping("/")
            public int delete(@RequestBody CampagneVo campagneVo){
            Campagne campagne = campagneConverter.toItem(campagneVo);
            return campagneService.delete(campagne);
            }

            @ApiOperation("Deletes a campagne by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return campagneService.deleteById(id);
            }
        @ApiOperation("find by etatCampagne code")
        @GetMapping("/etatCampagne/code/{code}")
        public List<Campagne> findByEtatCampagneCode(@PathVariable String code){
        return campagneService.findByEtatCampagneCode(code);
        }

        @ApiOperation("delete by etatCampagne code")
        @DeleteMapping("/etatCampagne/code/{code}")
        public int deleteByEtatCampagneCode(@PathVariable String code){
        return campagneService.deleteByEtatCampagneCode(code);
        }

        @ApiOperation("find by etatCampagne id")
        @GetMapping("/etatCampagne/id/{id}")
        public List<Campagne> findByEtatCampagneId(@PathVariable Long id){
        return campagneService.findByEtatCampagneId(id);
        }

        @ApiOperation("delete by etatCampagne id")
        @DeleteMapping("/etatCampagne/id/{id}")
        public int deleteByEtatCampagneId(@PathVariable Long id){
        return campagneService.deleteByEtatCampagneId(id);
        }

        @ApiOperation("find by templateOuverture code")
        @GetMapping("/templateOuverture/code/{code}")
        public List<Campagne> findByTemplateOuvertureCode(@PathVariable String code){
        return campagneService.findByTemplateOuvertureCode(code);
        }

        @ApiOperation("delete by templateOuverture code")
        @DeleteMapping("/templateOuverture/code/{code}")
        public int deleteByTemplateOuvertureCode(@PathVariable String code){
        return campagneService.deleteByTemplateOuvertureCode(code);
        }

        @ApiOperation("find by templateOuverture id")
        @GetMapping("/templateOuverture/id/{id}")
        public List<Campagne> findByTemplateOuvertureId(@PathVariable Long id){
        return campagneService.findByTemplateOuvertureId(id);
        }

        @ApiOperation("delete by templateOuverture id")
        @DeleteMapping("/templateOuverture/id/{id}")
        public int deleteByTemplateOuvertureId(@PathVariable Long id){
        return campagneService.deleteByTemplateOuvertureId(id);
        }

        @ApiOperation("find by templateCloture code")
        @GetMapping("/templateCloture/code/{code}")
        public List<Campagne> findByTemplateClotureCode(@PathVariable String code){
        return campagneService.findByTemplateClotureCode(code);
        }

        @ApiOperation("delete by templateCloture code")
        @DeleteMapping("/templateCloture/code/{code}")
        public int deleteByTemplateClotureCode(@PathVariable String code){
        return campagneService.deleteByTemplateClotureCode(code);
        }

        @ApiOperation("find by templateCloture id")
        @GetMapping("/templateCloture/id/{id}")
        public List<Campagne> findByTemplateClotureId(@PathVariable Long id){
        return campagneService.findByTemplateClotureId(id);
        }

        @ApiOperation("delete by templateCloture id")
        @DeleteMapping("/templateCloture/id/{id}")
        public int deleteByTemplateClotureId(@PathVariable Long id){
        return campagneService.deleteByTemplateClotureId(id);
        }



            }
