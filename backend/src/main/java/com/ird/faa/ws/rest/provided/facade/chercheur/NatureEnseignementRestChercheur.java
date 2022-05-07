package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.NatureEnseignementChercheurService;

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
import com.ird.faa.bean.NatureEnseignement;
import com.ird.faa.ws.rest.provided.converter.NatureEnseignementConverter;
import com.ird.faa.ws.rest.provided.vo.NatureEnseignementVo;

@Api("Manages natureEnseignement services")
@RestController
@RequestMapping("api/chercheur/natureEnseignement")
public class NatureEnseignementRestChercheur {

@Autowired
private NatureEnseignementChercheurService natureEnseignementService;

@Autowired
private NatureEnseignementConverter natureEnseignementConverter;


            @ApiOperation("Updates the specified  natureEnseignement")
            @PutMapping("/")
            public  NatureEnseignementVo update(@RequestBody  NatureEnseignementVo  natureEnseignementVo){
            NatureEnseignement natureEnseignement = natureEnseignementConverter.toItem(natureEnseignementVo);
            natureEnseignement = natureEnseignementService.update(natureEnseignement);
            return natureEnseignementConverter.toVo(natureEnseignement);
            }

    @ApiOperation("Finds a list of all natureEnseignements")
    @GetMapping("/")
    public List<NatureEnseignementVo> findAll(){
        return natureEnseignementConverter.toVo(natureEnseignementService.findAll());
    }

    @ApiOperation("Finds a natureEnseignement with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public NatureEnseignementVo findByIdWithAssociatedList(@PathVariable Long id){
    return natureEnseignementConverter.toVo(natureEnseignementService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search natureEnseignement by a specific criteria")
    @PostMapping("/search")
    public List<NatureEnseignementVo> findByCriteria(@RequestBody NatureEnseignementVo natureEnseignementVo){
        return natureEnseignementConverter.toVo(natureEnseignementService.findByCriteria(natureEnseignementVo));
        }

            @ApiOperation("Finds a natureEnseignement by id")
            @GetMapping("/id/{id}")
            public NatureEnseignementVo findById(@PathVariable Long id){
            return natureEnseignementConverter.toVo(natureEnseignementService.findById(id));
            }

            @ApiOperation("Saves the specified  natureEnseignement")
            @PostMapping("/")
            public NatureEnseignementVo save(@RequestBody NatureEnseignementVo natureEnseignementVo){
            NatureEnseignement natureEnseignement = natureEnseignementConverter.toItem(natureEnseignementVo);
            natureEnseignement = natureEnseignementService.save(natureEnseignement);
            return natureEnseignementConverter.toVo(natureEnseignement);
            }

            @ApiOperation("Delete the specified natureEnseignement")
            @DeleteMapping("/")
            public int delete(@RequestBody NatureEnseignementVo natureEnseignementVo){
            NatureEnseignement natureEnseignement = natureEnseignementConverter.toItem(natureEnseignementVo);
            return natureEnseignementService.delete(natureEnseignement);
            }

            @ApiOperation("Deletes a natureEnseignement by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return natureEnseignementService.deleteById(id);
            }


            }
