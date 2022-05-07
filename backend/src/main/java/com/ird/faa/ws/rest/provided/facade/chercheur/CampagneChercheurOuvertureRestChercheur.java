package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.CampagneChercheurOuvertureChercheurService;

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
import com.ird.faa.bean.CampagneChercheurOuverture;
import com.ird.faa.ws.rest.provided.converter.CampagneChercheurOuvertureConverter;
import com.ird.faa.ws.rest.provided.vo.CampagneChercheurOuvertureVo;

@Api("Manages campagneChercheurOuverture services")
@RestController
@RequestMapping("api/chercheur/campagneChercheurOuverture")
public class CampagneChercheurOuvertureRestChercheur {

@Autowired
private CampagneChercheurOuvertureChercheurService campagneChercheurOuvertureService;

@Autowired
private CampagneChercheurOuvertureConverter campagneChercheurOuvertureConverter;


            @ApiOperation("Updates the specified  campagneChercheurOuverture")
            @PutMapping("/")
            public  CampagneChercheurOuvertureVo update(@RequestBody  CampagneChercheurOuvertureVo  campagneChercheurOuvertureVo){
            CampagneChercheurOuverture campagneChercheurOuverture = campagneChercheurOuvertureConverter.toItem(campagneChercheurOuvertureVo);
            campagneChercheurOuverture = campagneChercheurOuvertureService.update(campagneChercheurOuverture);
            return campagneChercheurOuvertureConverter.toVo(campagneChercheurOuverture);
            }

    @ApiOperation("Finds a list of all campagneChercheurOuvertures")
    @GetMapping("/")
    public List<CampagneChercheurOuvertureVo> findAll(){
        return campagneChercheurOuvertureConverter.toVo(campagneChercheurOuvertureService.findAll());
    }

    @ApiOperation("Finds a campagneChercheurOuverture with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CampagneChercheurOuvertureVo findByIdWithAssociatedList(@PathVariable Long id){
    return campagneChercheurOuvertureConverter.toVo(campagneChercheurOuvertureService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search campagneChercheurOuverture by a specific criteria")
    @PostMapping("/search")
    public List<CampagneChercheurOuvertureVo> findByCriteria(@RequestBody CampagneChercheurOuvertureVo campagneChercheurOuvertureVo){
        return campagneChercheurOuvertureConverter.toVo(campagneChercheurOuvertureService.findByCriteria(campagneChercheurOuvertureVo));
        }

            @ApiOperation("Finds a campagneChercheurOuverture by id")
            @GetMapping("/id/{id}")
            public CampagneChercheurOuvertureVo findById(@PathVariable Long id){
            return campagneChercheurOuvertureConverter.toVo(campagneChercheurOuvertureService.findById(id));
            }

            @ApiOperation("Saves the specified  campagneChercheurOuverture")
            @PostMapping("/")
            public CampagneChercheurOuvertureVo save(@RequestBody CampagneChercheurOuvertureVo campagneChercheurOuvertureVo){
            CampagneChercheurOuverture campagneChercheurOuverture = campagneChercheurOuvertureConverter.toItem(campagneChercheurOuvertureVo);
            campagneChercheurOuverture = campagneChercheurOuvertureService.save(campagneChercheurOuverture);
            return campagneChercheurOuvertureConverter.toVo(campagneChercheurOuverture);
            }

            @ApiOperation("Delete the specified campagneChercheurOuverture")
            @DeleteMapping("/")
            public int delete(@RequestBody CampagneChercheurOuvertureVo campagneChercheurOuvertureVo){
            CampagneChercheurOuverture campagneChercheurOuverture = campagneChercheurOuvertureConverter.toItem(campagneChercheurOuvertureVo);
            return campagneChercheurOuvertureService.delete(campagneChercheurOuverture);
            }

            @ApiOperation("Deletes a campagneChercheurOuverture by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return campagneChercheurOuvertureService.deleteById(id);
            }
        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<CampagneChercheurOuverture> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return campagneChercheurOuvertureService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return campagneChercheurOuvertureService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<CampagneChercheurOuverture> findByChercheurId(@PathVariable Long id){
        return campagneChercheurOuvertureService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return campagneChercheurOuvertureService.deleteByChercheurId(id);
        }

        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<CampagneChercheurOuverture> findByCampagneCode(@PathVariable String code){
        return campagneChercheurOuvertureService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return campagneChercheurOuvertureService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<CampagneChercheurOuverture> findByCampagneId(@PathVariable Long id){
        return campagneChercheurOuvertureService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return campagneChercheurOuvertureService.deleteByCampagneId(id);
        }

        @ApiOperation("find by etatCampagneChercheur code")
        @GetMapping("/etatCampagneChercheur/code/{code}")
        public List<CampagneChercheurOuverture> findByEtatCampagneChercheurCode(@PathVariable String code){
        return campagneChercheurOuvertureService.findByEtatCampagneChercheurCode(code);
        }

        @ApiOperation("delete by etatCampagneChercheur code")
        @DeleteMapping("/etatCampagneChercheur/code/{code}")
        public int deleteByEtatCampagneChercheurCode(@PathVariable String code){
        return campagneChercheurOuvertureService.deleteByEtatCampagneChercheurCode(code);
        }

        @ApiOperation("find by etatCampagneChercheur id")
        @GetMapping("/etatCampagneChercheur/id/{id}")
        public List<CampagneChercheurOuverture> findByEtatCampagneChercheurId(@PathVariable Long id){
        return campagneChercheurOuvertureService.findByEtatCampagneChercheurId(id);
        }

        @ApiOperation("delete by etatCampagneChercheur id")
        @DeleteMapping("/etatCampagneChercheur/id/{id}")
        public int deleteByEtatCampagneChercheurId(@PathVariable Long id){
        return campagneChercheurOuvertureService.deleteByEtatCampagneChercheurId(id);
        }



            }
