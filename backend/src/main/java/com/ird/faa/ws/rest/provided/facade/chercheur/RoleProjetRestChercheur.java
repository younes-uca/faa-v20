package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.RoleProjetChercheurService;

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
import com.ird.faa.bean.RoleProjet;
import com.ird.faa.ws.rest.provided.converter.RoleProjetConverter;
import com.ird.faa.ws.rest.provided.vo.RoleProjetVo;

@Api("Manages roleProjet services")
@RestController
@RequestMapping("api/chercheur/roleProjet")
public class RoleProjetRestChercheur {

@Autowired
private RoleProjetChercheurService roleProjetService;

@Autowired
private RoleProjetConverter roleProjetConverter;


            @ApiOperation("Updates the specified  roleProjet")
            @PutMapping("/")
            public  RoleProjetVo update(@RequestBody  RoleProjetVo  roleProjetVo){
            RoleProjet roleProjet = roleProjetConverter.toItem(roleProjetVo);
            roleProjet = roleProjetService.update(roleProjet);
            return roleProjetConverter.toVo(roleProjet);
            }

    @ApiOperation("Finds a list of all roleProjets")
    @GetMapping("/")
    public List<RoleProjetVo> findAll(){
        return roleProjetConverter.toVo(roleProjetService.findAll());
    }

    @ApiOperation("Finds a roleProjet with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public RoleProjetVo findByIdWithAssociatedList(@PathVariable Long id){
    return roleProjetConverter.toVo(roleProjetService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search roleProjet by a specific criteria")
    @PostMapping("/search")
    public List<RoleProjetVo> findByCriteria(@RequestBody RoleProjetVo roleProjetVo){
        return roleProjetConverter.toVo(roleProjetService.findByCriteria(roleProjetVo));
        }

            @ApiOperation("Finds a roleProjet by id")
            @GetMapping("/id/{id}")
            public RoleProjetVo findById(@PathVariable Long id){
            return roleProjetConverter.toVo(roleProjetService.findById(id));
            }

            @ApiOperation("Saves the specified  roleProjet")
            @PostMapping("/")
            public RoleProjetVo save(@RequestBody RoleProjetVo roleProjetVo){
            RoleProjet roleProjet = roleProjetConverter.toItem(roleProjetVo);
            roleProjet = roleProjetService.save(roleProjet);
            return roleProjetConverter.toVo(roleProjet);
            }

            @ApiOperation("Delete the specified roleProjet")
            @DeleteMapping("/")
            public int delete(@RequestBody RoleProjetVo roleProjetVo){
            RoleProjet roleProjet = roleProjetConverter.toItem(roleProjetVo);
            return roleProjetService.delete(roleProjet);
            }

            @ApiOperation("Deletes a roleProjet by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return roleProjetService.deleteById(id);
            }


            }
