package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EnseignementAdminService;

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
import com.ird.faa.bean.Enseignement;
import com.ird.faa.ws.rest.provided.converter.EnseignementConverter;
import com.ird.faa.ws.rest.provided.vo.EnseignementVo;

@Api("Manages enseignement services")
@RestController
@RequestMapping("api/admin/enseignement")
public class EnseignementRestAdmin {

@Autowired
private EnseignementAdminService enseignementService;

@Autowired
private EnseignementConverter enseignementConverter;


            @ApiOperation("Updates the specified  enseignement")
            @PutMapping("/")
            public  EnseignementVo update(@RequestBody  EnseignementVo  enseignementVo){
            Enseignement enseignement = enseignementConverter.toItem(enseignementVo);
            enseignement = enseignementService.update(enseignement);
            return enseignementConverter.toVo(enseignement);
            }

    @ApiOperation("Finds a list of all enseignements")
    @GetMapping("/")
    public List<EnseignementVo> findAll(){
        return enseignementConverter.toVo(enseignementService.findAll());
    }

    @ApiOperation("Finds a enseignement with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EnseignementVo findByIdWithAssociatedList(@PathVariable Long id){
    return enseignementConverter.toVo(enseignementService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search enseignement by a specific criteria")
    @PostMapping("/search")
    public List<EnseignementVo> findByCriteria(@RequestBody EnseignementVo enseignementVo){
        return enseignementConverter.toVo(enseignementService.findByCriteria(enseignementVo));
        }

            @ApiOperation("Finds a enseignement by id")
            @GetMapping("/id/{id}")
            public EnseignementVo findById(@PathVariable Long id){
            return enseignementConverter.toVo(enseignementService.findById(id));
            }

            @ApiOperation("Saves the specified  enseignement")
            @PostMapping("/")
            public EnseignementVo save(@RequestBody EnseignementVo enseignementVo){
            Enseignement enseignement = enseignementConverter.toItem(enseignementVo);
            enseignement = enseignementService.save(enseignement);
            return enseignementConverter.toVo(enseignement);
            }

            @ApiOperation("Delete the specified enseignement")
            @DeleteMapping("/")
            public int delete(@RequestBody EnseignementVo enseignementVo){
            Enseignement enseignement = enseignementConverter.toItem(enseignementVo);
            return enseignementService.delete(enseignement);
            }

            @ApiOperation("Deletes a enseignement by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return enseignementService.deleteById(id);
            }
        @ApiOperation("find by modaliteEtude code")
        @GetMapping("/modaliteEtude/code/{code}")
        public List<Enseignement> findByModaliteEtudeCode(@PathVariable String code){
        return enseignementService.findByModaliteEtudeCode(code);
        }

        @ApiOperation("delete by modaliteEtude code")
        @DeleteMapping("/modaliteEtude/code/{code}")
        public int deleteByModaliteEtudeCode(@PathVariable String code){
        return enseignementService.deleteByModaliteEtudeCode(code);
        }

        @ApiOperation("find by modaliteEtude id")
        @GetMapping("/modaliteEtude/id/{id}")
        public List<Enseignement> findByModaliteEtudeId(@PathVariable Long id){
        return enseignementService.findByModaliteEtudeId(id);
        }

        @ApiOperation("delete by modaliteEtude id")
        @DeleteMapping("/modaliteEtude/id/{id}")
        public int deleteByModaliteEtudeId(@PathVariable Long id){
        return enseignementService.deleteByModaliteEtudeId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<Enseignement> findByEtatEtapeCampagneCode(@PathVariable String code){
        return enseignementService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return enseignementService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<Enseignement> findByEtatEtapeCampagneId(@PathVariable Long id){
        return enseignementService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return enseignementService.deleteByEtatEtapeCampagneId(id);
        }

        @ApiOperation("find by enseignementEtFormation id")
        @GetMapping("/enseignementEtFormation/id/{id}")
        public List<Enseignement> findByEnseignementEtFormationId(@PathVariable Long id){
        return enseignementService.findByEnseignementEtFormationId(id);
        }

        @ApiOperation("delete by enseignementEtFormation id")
        @DeleteMapping("/enseignementEtFormation/id/{id}")
        public int deleteByEnseignementEtFormationId(@PathVariable Long id){
        return enseignementService.deleteByEnseignementEtFormationId(id);
        }



            }
