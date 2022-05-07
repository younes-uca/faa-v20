package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.NiveauFormationPostBacChercheurService;

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
import com.ird.faa.bean.NiveauFormationPostBac;
import com.ird.faa.ws.rest.provided.converter.NiveauFormationPostBacConverter;
import com.ird.faa.ws.rest.provided.vo.NiveauFormationPostBacVo;

@Api("Manages niveauFormationPostBac services")
@RestController
@RequestMapping("api/chercheur/niveauFormationPostBac")
public class NiveauFormationPostBacRestChercheur {

@Autowired
private NiveauFormationPostBacChercheurService niveauFormationPostBacService;

@Autowired
private NiveauFormationPostBacConverter niveauFormationPostBacConverter;


            @ApiOperation("Updates the specified  niveauFormationPostBac")
            @PutMapping("/")
            public  NiveauFormationPostBacVo update(@RequestBody  NiveauFormationPostBacVo  niveauFormationPostBacVo){
            NiveauFormationPostBac niveauFormationPostBac = niveauFormationPostBacConverter.toItem(niveauFormationPostBacVo);
            niveauFormationPostBac = niveauFormationPostBacService.update(niveauFormationPostBac);
            return niveauFormationPostBacConverter.toVo(niveauFormationPostBac);
            }

    @ApiOperation("Finds a list of all niveauFormationPostBacs")
    @GetMapping("/")
    public List<NiveauFormationPostBacVo> findAll(){
        return niveauFormationPostBacConverter.toVo(niveauFormationPostBacService.findAll());
    }

    @ApiOperation("Finds a niveauFormationPostBac with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public NiveauFormationPostBacVo findByIdWithAssociatedList(@PathVariable Long id){
    return niveauFormationPostBacConverter.toVo(niveauFormationPostBacService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search niveauFormationPostBac by a specific criteria")
    @PostMapping("/search")
    public List<NiveauFormationPostBacVo> findByCriteria(@RequestBody NiveauFormationPostBacVo niveauFormationPostBacVo){
        return niveauFormationPostBacConverter.toVo(niveauFormationPostBacService.findByCriteria(niveauFormationPostBacVo));
        }

            @ApiOperation("Finds a niveauFormationPostBac by id")
            @GetMapping("/id/{id}")
            public NiveauFormationPostBacVo findById(@PathVariable Long id){
            return niveauFormationPostBacConverter.toVo(niveauFormationPostBacService.findById(id));
            }

            @ApiOperation("Saves the specified  niveauFormationPostBac")
            @PostMapping("/")
            public NiveauFormationPostBacVo save(@RequestBody NiveauFormationPostBacVo niveauFormationPostBacVo){
            NiveauFormationPostBac niveauFormationPostBac = niveauFormationPostBacConverter.toItem(niveauFormationPostBacVo);
            niveauFormationPostBac = niveauFormationPostBacService.save(niveauFormationPostBac);
            return niveauFormationPostBacConverter.toVo(niveauFormationPostBac);
            }

            @ApiOperation("Delete the specified niveauFormationPostBac")
            @DeleteMapping("/")
            public int delete(@RequestBody NiveauFormationPostBacVo niveauFormationPostBacVo){
            NiveauFormationPostBac niveauFormationPostBac = niveauFormationPostBacConverter.toItem(niveauFormationPostBacVo);
            return niveauFormationPostBacService.delete(niveauFormationPostBac);
            }

            @ApiOperation("Deletes a niveauFormationPostBac by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return niveauFormationPostBacService.deleteById(id);
            }


            }
