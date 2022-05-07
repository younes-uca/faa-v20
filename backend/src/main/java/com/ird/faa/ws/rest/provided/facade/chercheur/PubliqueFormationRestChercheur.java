package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.PubliqueFormationChercheurService;

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
import com.ird.faa.bean.PubliqueFormation;
import com.ird.faa.ws.rest.provided.converter.PubliqueFormationConverter;
import com.ird.faa.ws.rest.provided.vo.PubliqueFormationVo;

@Api("Manages publiqueFormation services")
@RestController
@RequestMapping("api/chercheur/publiqueFormation")
public class PubliqueFormationRestChercheur {

@Autowired
private PubliqueFormationChercheurService publiqueFormationService;

@Autowired
private PubliqueFormationConverter publiqueFormationConverter;


            @ApiOperation("Updates the specified  publiqueFormation")
            @PutMapping("/")
            public  PubliqueFormationVo update(@RequestBody  PubliqueFormationVo  publiqueFormationVo){
            PubliqueFormation publiqueFormation = publiqueFormationConverter.toItem(publiqueFormationVo);
            publiqueFormation = publiqueFormationService.update(publiqueFormation);
            return publiqueFormationConverter.toVo(publiqueFormation);
            }

    @ApiOperation("Finds a list of all publiqueFormations")
    @GetMapping("/")
    public List<PubliqueFormationVo> findAll(){
        return publiqueFormationConverter.toVo(publiqueFormationService.findAll());
    }

    @ApiOperation("Finds a publiqueFormation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public PubliqueFormationVo findByIdWithAssociatedList(@PathVariable Long id){
    return publiqueFormationConverter.toVo(publiqueFormationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search publiqueFormation by a specific criteria")
    @PostMapping("/search")
    public List<PubliqueFormationVo> findByCriteria(@RequestBody PubliqueFormationVo publiqueFormationVo){
        return publiqueFormationConverter.toVo(publiqueFormationService.findByCriteria(publiqueFormationVo));
        }

            @ApiOperation("Finds a publiqueFormation by id")
            @GetMapping("/id/{id}")
            public PubliqueFormationVo findById(@PathVariable Long id){
            return publiqueFormationConverter.toVo(publiqueFormationService.findById(id));
            }

            @ApiOperation("Saves the specified  publiqueFormation")
            @PostMapping("/")
            public PubliqueFormationVo save(@RequestBody PubliqueFormationVo publiqueFormationVo){
            PubliqueFormation publiqueFormation = publiqueFormationConverter.toItem(publiqueFormationVo);
            publiqueFormation = publiqueFormationService.save(publiqueFormation);
            return publiqueFormationConverter.toVo(publiqueFormation);
            }

            @ApiOperation("Delete the specified publiqueFormation")
            @DeleteMapping("/")
            public int delete(@RequestBody PubliqueFormationVo publiqueFormationVo){
            PubliqueFormation publiqueFormation = publiqueFormationConverter.toItem(publiqueFormationVo);
            return publiqueFormationService.delete(publiqueFormation);
            }

            @ApiOperation("Deletes a publiqueFormation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return publiqueFormationService.deleteById(id);
            }


            }
