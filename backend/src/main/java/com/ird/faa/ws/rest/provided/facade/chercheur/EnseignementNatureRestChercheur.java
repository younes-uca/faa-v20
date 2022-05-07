package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.EnseignementNatureChercheurService;

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
import com.ird.faa.bean.EnseignementNature;
import com.ird.faa.ws.rest.provided.converter.EnseignementNatureConverter;
import com.ird.faa.ws.rest.provided.vo.EnseignementNatureVo;

@Api("Manages enseignementNature services")
@RestController
@RequestMapping("api/chercheur/enseignementNature")
public class EnseignementNatureRestChercheur {

@Autowired
private EnseignementNatureChercheurService enseignementNatureService;

@Autowired
private EnseignementNatureConverter enseignementNatureConverter;


            @ApiOperation("Updates the specified  enseignementNature")
            @PutMapping("/")
            public  EnseignementNatureVo update(@RequestBody  EnseignementNatureVo  enseignementNatureVo){
            EnseignementNature enseignementNature = enseignementNatureConverter.toItem(enseignementNatureVo);
            enseignementNature = enseignementNatureService.update(enseignementNature);
            return enseignementNatureConverter.toVo(enseignementNature);
            }

    @ApiOperation("Finds a list of all enseignementNatures")
    @GetMapping("/")
    public List<EnseignementNatureVo> findAll(){
        return enseignementNatureConverter.toVo(enseignementNatureService.findAll());
    }

    @ApiOperation("Finds a enseignementNature with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EnseignementNatureVo findByIdWithAssociatedList(@PathVariable Long id){
    return enseignementNatureConverter.toVo(enseignementNatureService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search enseignementNature by a specific criteria")
    @PostMapping("/search")
    public List<EnseignementNatureVo> findByCriteria(@RequestBody EnseignementNatureVo enseignementNatureVo){
        return enseignementNatureConverter.toVo(enseignementNatureService.findByCriteria(enseignementNatureVo));
        }

            @ApiOperation("Finds a enseignementNature by id")
            @GetMapping("/id/{id}")
            public EnseignementNatureVo findById(@PathVariable Long id){
            return enseignementNatureConverter.toVo(enseignementNatureService.findById(id));
            }

            @ApiOperation("Saves the specified  enseignementNature")
            @PostMapping("/")
            public EnseignementNatureVo save(@RequestBody EnseignementNatureVo enseignementNatureVo){
            EnseignementNature enseignementNature = enseignementNatureConverter.toItem(enseignementNatureVo);
            enseignementNature = enseignementNatureService.save(enseignementNature);
            return enseignementNatureConverter.toVo(enseignementNature);
            }

            @ApiOperation("Delete the specified enseignementNature")
            @DeleteMapping("/")
            public int delete(@RequestBody EnseignementNatureVo enseignementNatureVo){
            EnseignementNature enseignementNature = enseignementNatureConverter.toItem(enseignementNatureVo);
            return enseignementNatureService.delete(enseignementNature);
            }

            @ApiOperation("Deletes a enseignementNature by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return enseignementNatureService.deleteById(id);
            }
        @ApiOperation("find by natureEnseignement code")
        @GetMapping("/natureEnseignement/code/{code}")
        public List<EnseignementNature> findByNatureEnseignementCode(@PathVariable String code){
        return enseignementNatureService.findByNatureEnseignementCode(code);
        }

        @ApiOperation("delete by natureEnseignement code")
        @DeleteMapping("/natureEnseignement/code/{code}")
        public int deleteByNatureEnseignementCode(@PathVariable String code){
        return enseignementNatureService.deleteByNatureEnseignementCode(code);
        }

        @ApiOperation("find by natureEnseignement id")
        @GetMapping("/natureEnseignement/id/{id}")
        public List<EnseignementNature> findByNatureEnseignementId(@PathVariable Long id){
        return enseignementNatureService.findByNatureEnseignementId(id);
        }

        @ApiOperation("delete by natureEnseignement id")
        @DeleteMapping("/natureEnseignement/id/{id}")
        public int deleteByNatureEnseignementId(@PathVariable Long id){
        return enseignementNatureService.deleteByNatureEnseignementId(id);
        }

        @ApiOperation("find by enseignement id")
        @GetMapping("/enseignement/id/{id}")
        public List<EnseignementNature> findByEnseignementId(@PathVariable Long id){
        return enseignementNatureService.findByEnseignementId(id);
        }

        @ApiOperation("delete by enseignement id")
        @DeleteMapping("/enseignement/id/{id}")
        public int deleteByEnseignementId(@PathVariable Long id){
        return enseignementNatureService.deleteByEnseignementId(id);
        }



            }
