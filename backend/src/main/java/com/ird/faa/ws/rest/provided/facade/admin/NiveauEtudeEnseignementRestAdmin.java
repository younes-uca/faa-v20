package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.NiveauEtudeEnseignementAdminService;

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
import com.ird.faa.bean.NiveauEtudeEnseignement;
import com.ird.faa.ws.rest.provided.converter.NiveauEtudeEnseignementConverter;
import com.ird.faa.ws.rest.provided.vo.NiveauEtudeEnseignementVo;

@Api("Manages niveauEtudeEnseignement services")
@RestController
@RequestMapping("api/admin/niveauEtudeEnseignement")
public class NiveauEtudeEnseignementRestAdmin {

@Autowired
private NiveauEtudeEnseignementAdminService niveauEtudeEnseignementService;

@Autowired
private NiveauEtudeEnseignementConverter niveauEtudeEnseignementConverter;


            @ApiOperation("Updates the specified  niveauEtudeEnseignement")
            @PutMapping("/")
            public  NiveauEtudeEnseignementVo update(@RequestBody  NiveauEtudeEnseignementVo  niveauEtudeEnseignementVo){
            NiveauEtudeEnseignement niveauEtudeEnseignement = niveauEtudeEnseignementConverter.toItem(niveauEtudeEnseignementVo);
            niveauEtudeEnseignement = niveauEtudeEnseignementService.update(niveauEtudeEnseignement);
            return niveauEtudeEnseignementConverter.toVo(niveauEtudeEnseignement);
            }

    @ApiOperation("Finds a list of all niveauEtudeEnseignements")
    @GetMapping("/")
    public List<NiveauEtudeEnseignementVo> findAll(){
        return niveauEtudeEnseignementConverter.toVo(niveauEtudeEnseignementService.findAll());
    }

    @ApiOperation("Finds a niveauEtudeEnseignement with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public NiveauEtudeEnseignementVo findByIdWithAssociatedList(@PathVariable Long id){
    return niveauEtudeEnseignementConverter.toVo(niveauEtudeEnseignementService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search niveauEtudeEnseignement by a specific criteria")
    @PostMapping("/search")
    public List<NiveauEtudeEnseignementVo> findByCriteria(@RequestBody NiveauEtudeEnseignementVo niveauEtudeEnseignementVo){
        return niveauEtudeEnseignementConverter.toVo(niveauEtudeEnseignementService.findByCriteria(niveauEtudeEnseignementVo));
        }

            @ApiOperation("Finds a niveauEtudeEnseignement by id")
            @GetMapping("/id/{id}")
            public NiveauEtudeEnseignementVo findById(@PathVariable Long id){
            return niveauEtudeEnseignementConverter.toVo(niveauEtudeEnseignementService.findById(id));
            }

            @ApiOperation("Saves the specified  niveauEtudeEnseignement")
            @PostMapping("/")
            public NiveauEtudeEnseignementVo save(@RequestBody NiveauEtudeEnseignementVo niveauEtudeEnseignementVo){
            NiveauEtudeEnseignement niveauEtudeEnseignement = niveauEtudeEnseignementConverter.toItem(niveauEtudeEnseignementVo);
            niveauEtudeEnseignement = niveauEtudeEnseignementService.save(niveauEtudeEnseignement);
            return niveauEtudeEnseignementConverter.toVo(niveauEtudeEnseignement);
            }

            @ApiOperation("Delete the specified niveauEtudeEnseignement")
            @DeleteMapping("/")
            public int delete(@RequestBody NiveauEtudeEnseignementVo niveauEtudeEnseignementVo){
            NiveauEtudeEnseignement niveauEtudeEnseignement = niveauEtudeEnseignementConverter.toItem(niveauEtudeEnseignementVo);
            return niveauEtudeEnseignementService.delete(niveauEtudeEnseignement);
            }

            @ApiOperation("Deletes a niveauEtudeEnseignement by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return niveauEtudeEnseignementService.deleteById(id);
            }
        @ApiOperation("find by niveauEtude code")
        @GetMapping("/niveauEtude/code/{code}")
        public List<NiveauEtudeEnseignement> findByNiveauEtudeCode(@PathVariable String code){
        return niveauEtudeEnseignementService.findByNiveauEtudeCode(code);
        }

        @ApiOperation("delete by niveauEtude code")
        @DeleteMapping("/niveauEtude/code/{code}")
        public int deleteByNiveauEtudeCode(@PathVariable String code){
        return niveauEtudeEnseignementService.deleteByNiveauEtudeCode(code);
        }

        @ApiOperation("find by niveauEtude id")
        @GetMapping("/niveauEtude/id/{id}")
        public List<NiveauEtudeEnseignement> findByNiveauEtudeId(@PathVariable Long id){
        return niveauEtudeEnseignementService.findByNiveauEtudeId(id);
        }

        @ApiOperation("delete by niveauEtude id")
        @DeleteMapping("/niveauEtude/id/{id}")
        public int deleteByNiveauEtudeId(@PathVariable Long id){
        return niveauEtudeEnseignementService.deleteByNiveauEtudeId(id);
        }

        @ApiOperation("find by enseignement id")
        @GetMapping("/enseignement/id/{id}")
        public List<NiveauEtudeEnseignement> findByEnseignementId(@PathVariable Long id){
        return niveauEtudeEnseignementService.findByEnseignementId(id);
        }

        @ApiOperation("delete by enseignement id")
        @DeleteMapping("/enseignement/id/{id}")
        public int deleteByEnseignementId(@PathVariable Long id){
        return niveauEtudeEnseignementService.deleteByEnseignementId(id);
        }



            }
