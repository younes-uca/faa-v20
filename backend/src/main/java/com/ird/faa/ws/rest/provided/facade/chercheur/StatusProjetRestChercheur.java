package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.StatusProjetChercheurService;

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
import com.ird.faa.bean.StatusProjet;
import com.ird.faa.ws.rest.provided.converter.StatusProjetConverter;
import com.ird.faa.ws.rest.provided.vo.StatusProjetVo;

@Api("Manages statusProjet services")
@RestController
@RequestMapping("api/chercheur/statusProjet")
public class StatusProjetRestChercheur {

@Autowired
private StatusProjetChercheurService statusProjetService;

@Autowired
private StatusProjetConverter statusProjetConverter;


            @ApiOperation("Updates the specified  statusProjet")
            @PutMapping("/")
            public  StatusProjetVo update(@RequestBody  StatusProjetVo  statusProjetVo){
            StatusProjet statusProjet = statusProjetConverter.toItem(statusProjetVo);
            statusProjet = statusProjetService.update(statusProjet);
            return statusProjetConverter.toVo(statusProjet);
            }

    @ApiOperation("Finds a list of all statusProjets")
    @GetMapping("/")
    public List<StatusProjetVo> findAll(){
        return statusProjetConverter.toVo(statusProjetService.findAll());
    }

    @ApiOperation("Finds a statusProjet with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public StatusProjetVo findByIdWithAssociatedList(@PathVariable Long id){
    return statusProjetConverter.toVo(statusProjetService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search statusProjet by a specific criteria")
    @PostMapping("/search")
    public List<StatusProjetVo> findByCriteria(@RequestBody StatusProjetVo statusProjetVo){
        return statusProjetConverter.toVo(statusProjetService.findByCriteria(statusProjetVo));
        }

            @ApiOperation("Finds a statusProjet by id")
            @GetMapping("/id/{id}")
            public StatusProjetVo findById(@PathVariable Long id){
            return statusProjetConverter.toVo(statusProjetService.findById(id));
            }

            @ApiOperation("Saves the specified  statusProjet")
            @PostMapping("/")
            public StatusProjetVo save(@RequestBody StatusProjetVo statusProjetVo){
            StatusProjet statusProjet = statusProjetConverter.toItem(statusProjetVo);
            statusProjet = statusProjetService.save(statusProjet);
            return statusProjetConverter.toVo(statusProjet);
            }

            @ApiOperation("Delete the specified statusProjet")
            @DeleteMapping("/")
            public int delete(@RequestBody StatusProjetVo statusProjetVo){
            StatusProjet statusProjet = statusProjetConverter.toItem(statusProjetVo);
            return statusProjetService.delete(statusProjet);
            }

            @ApiOperation("Deletes a statusProjet by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return statusProjetService.deleteById(id);
            }


            }
