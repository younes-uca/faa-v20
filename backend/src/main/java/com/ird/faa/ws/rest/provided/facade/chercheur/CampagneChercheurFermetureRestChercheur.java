package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.CampagneChercheurFermetureChercheurService;

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
import com.ird.faa.bean.CampagneChercheurFermeture;
import com.ird.faa.ws.rest.provided.converter.CampagneChercheurFermetureConverter;
import com.ird.faa.ws.rest.provided.vo.CampagneChercheurFermetureVo;

@Api("Manages campagneChercheurFermeture services")
@RestController
@RequestMapping("api/chercheur/campagneChercheurFermeture")
public class CampagneChercheurFermetureRestChercheur {

@Autowired
private CampagneChercheurFermetureChercheurService campagneChercheurFermetureService;

@Autowired
private CampagneChercheurFermetureConverter campagneChercheurFermetureConverter;


            @ApiOperation("Updates the specified  campagneChercheurFermeture")
            @PutMapping("/")
            public  CampagneChercheurFermetureVo update(@RequestBody  CampagneChercheurFermetureVo  campagneChercheurFermetureVo){
            CampagneChercheurFermeture campagneChercheurFermeture = campagneChercheurFermetureConverter.toItem(campagneChercheurFermetureVo);
            campagneChercheurFermeture = campagneChercheurFermetureService.update(campagneChercheurFermeture);
            return campagneChercheurFermetureConverter.toVo(campagneChercheurFermeture);
            }

    @ApiOperation("Finds a list of all campagneChercheurFermetures")
    @GetMapping("/")
    public List<CampagneChercheurFermetureVo> findAll(){
        return campagneChercheurFermetureConverter.toVo(campagneChercheurFermetureService.findAll());
    }

    @ApiOperation("Finds a campagneChercheurFermeture with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CampagneChercheurFermetureVo findByIdWithAssociatedList(@PathVariable Long id){
    return campagneChercheurFermetureConverter.toVo(campagneChercheurFermetureService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search campagneChercheurFermeture by a specific criteria")
    @PostMapping("/search")
    public List<CampagneChercheurFermetureVo> findByCriteria(@RequestBody CampagneChercheurFermetureVo campagneChercheurFermetureVo){
        return campagneChercheurFermetureConverter.toVo(campagneChercheurFermetureService.findByCriteria(campagneChercheurFermetureVo));
        }

            @ApiOperation("Finds a campagneChercheurFermeture by id")
            @GetMapping("/id/{id}")
            public CampagneChercheurFermetureVo findById(@PathVariable Long id){
            return campagneChercheurFermetureConverter.toVo(campagneChercheurFermetureService.findById(id));
            }

            @ApiOperation("Saves the specified  campagneChercheurFermeture")
            @PostMapping("/")
            public CampagneChercheurFermetureVo save(@RequestBody CampagneChercheurFermetureVo campagneChercheurFermetureVo){
            CampagneChercheurFermeture campagneChercheurFermeture = campagneChercheurFermetureConverter.toItem(campagneChercheurFermetureVo);
            campagneChercheurFermeture = campagneChercheurFermetureService.save(campagneChercheurFermeture);
            return campagneChercheurFermetureConverter.toVo(campagneChercheurFermeture);
            }

            @ApiOperation("Delete the specified campagneChercheurFermeture")
            @DeleteMapping("/")
            public int delete(@RequestBody CampagneChercheurFermetureVo campagneChercheurFermetureVo){
            CampagneChercheurFermeture campagneChercheurFermeture = campagneChercheurFermetureConverter.toItem(campagneChercheurFermetureVo);
            return campagneChercheurFermetureService.delete(campagneChercheurFermeture);
            }

            @ApiOperation("Deletes a campagneChercheurFermeture by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return campagneChercheurFermetureService.deleteById(id);
            }
        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<CampagneChercheurFermeture> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return campagneChercheurFermetureService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return campagneChercheurFermetureService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<CampagneChercheurFermeture> findByChercheurId(@PathVariable Long id){
        return campagneChercheurFermetureService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return campagneChercheurFermetureService.deleteByChercheurId(id);
        }

        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<CampagneChercheurFermeture> findByCampagneCode(@PathVariable String code){
        return campagneChercheurFermetureService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return campagneChercheurFermetureService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<CampagneChercheurFermeture> findByCampagneId(@PathVariable Long id){
        return campagneChercheurFermetureService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return campagneChercheurFermetureService.deleteByCampagneId(id);
        }



            }
