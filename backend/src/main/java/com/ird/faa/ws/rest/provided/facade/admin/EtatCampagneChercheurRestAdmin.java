package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EtatCampagneChercheurAdminService;

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
import com.ird.faa.bean.EtatCampagneChercheur;
import com.ird.faa.ws.rest.provided.converter.EtatCampagneChercheurConverter;
import com.ird.faa.ws.rest.provided.vo.EtatCampagneChercheurVo;

@Api("Manages etatCampagneChercheur services")
@RestController
@RequestMapping("api/admin/etatCampagneChercheur")
public class EtatCampagneChercheurRestAdmin {

@Autowired
private EtatCampagneChercheurAdminService etatCampagneChercheurService;

@Autowired
private EtatCampagneChercheurConverter etatCampagneChercheurConverter;


            @ApiOperation("Updates the specified  etatCampagneChercheur")
            @PutMapping("/")
            public  EtatCampagneChercheurVo update(@RequestBody  EtatCampagneChercheurVo  etatCampagneChercheurVo){
            EtatCampagneChercheur etatCampagneChercheur = etatCampagneChercheurConverter.toItem(etatCampagneChercheurVo);
            etatCampagneChercheur = etatCampagneChercheurService.update(etatCampagneChercheur);
            return etatCampagneChercheurConverter.toVo(etatCampagneChercheur);
            }

    @ApiOperation("Finds a list of all etatCampagneChercheurs")
    @GetMapping("/")
    public List<EtatCampagneChercheurVo> findAll(){
        return etatCampagneChercheurConverter.toVo(etatCampagneChercheurService.findAll());
    }

    @ApiOperation("Finds a etatCampagneChercheur with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EtatCampagneChercheurVo findByIdWithAssociatedList(@PathVariable Long id){
    return etatCampagneChercheurConverter.toVo(etatCampagneChercheurService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search etatCampagneChercheur by a specific criteria")
    @PostMapping("/search")
    public List<EtatCampagneChercheurVo> findByCriteria(@RequestBody EtatCampagneChercheurVo etatCampagneChercheurVo){
        return etatCampagneChercheurConverter.toVo(etatCampagneChercheurService.findByCriteria(etatCampagneChercheurVo));
        }

            @ApiOperation("Finds a etatCampagneChercheur by id")
            @GetMapping("/id/{id}")
            public EtatCampagneChercheurVo findById(@PathVariable Long id){
            return etatCampagneChercheurConverter.toVo(etatCampagneChercheurService.findById(id));
            }

            @ApiOperation("Saves the specified  etatCampagneChercheur")
            @PostMapping("/")
            public EtatCampagneChercheurVo save(@RequestBody EtatCampagneChercheurVo etatCampagneChercheurVo){
            EtatCampagneChercheur etatCampagneChercheur = etatCampagneChercheurConverter.toItem(etatCampagneChercheurVo);
            etatCampagneChercheur = etatCampagneChercheurService.save(etatCampagneChercheur);
            return etatCampagneChercheurConverter.toVo(etatCampagneChercheur);
            }

            @ApiOperation("Delete the specified etatCampagneChercheur")
            @DeleteMapping("/")
            public int delete(@RequestBody EtatCampagneChercheurVo etatCampagneChercheurVo){
            EtatCampagneChercheur etatCampagneChercheur = etatCampagneChercheurConverter.toItem(etatCampagneChercheurVo);
            return etatCampagneChercheurService.delete(etatCampagneChercheur);
            }

            @ApiOperation("Deletes a etatCampagneChercheur by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return etatCampagneChercheurService.deleteById(id);
            }


            }
