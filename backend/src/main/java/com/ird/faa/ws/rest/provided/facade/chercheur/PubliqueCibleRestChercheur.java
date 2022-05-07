package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.PubliqueCibleChercheurService;

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
import com.ird.faa.bean.PubliqueCible;
import com.ird.faa.ws.rest.provided.converter.PubliqueCibleConverter;
import com.ird.faa.ws.rest.provided.vo.PubliqueCibleVo;

@Api("Manages publiqueCible services")
@RestController
@RequestMapping("api/chercheur/publiqueCible")
public class PubliqueCibleRestChercheur {

@Autowired
private PubliqueCibleChercheurService publiqueCibleService;

@Autowired
private PubliqueCibleConverter publiqueCibleConverter;


            @ApiOperation("Updates the specified  publiqueCible")
            @PutMapping("/")
            public  PubliqueCibleVo update(@RequestBody  PubliqueCibleVo  publiqueCibleVo){
            PubliqueCible publiqueCible = publiqueCibleConverter.toItem(publiqueCibleVo);
            publiqueCible = publiqueCibleService.update(publiqueCible);
            return publiqueCibleConverter.toVo(publiqueCible);
            }

    @ApiOperation("Finds a list of all publiqueCibles")
    @GetMapping("/")
    public List<PubliqueCibleVo> findAll(){
        return publiqueCibleConverter.toVo(publiqueCibleService.findAll());
    }

    @ApiOperation("Finds a publiqueCible with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public PubliqueCibleVo findByIdWithAssociatedList(@PathVariable Long id){
    return publiqueCibleConverter.toVo(publiqueCibleService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search publiqueCible by a specific criteria")
    @PostMapping("/search")
    public List<PubliqueCibleVo> findByCriteria(@RequestBody PubliqueCibleVo publiqueCibleVo){
        return publiqueCibleConverter.toVo(publiqueCibleService.findByCriteria(publiqueCibleVo));
        }

            @ApiOperation("Finds a publiqueCible by id")
            @GetMapping("/id/{id}")
            public PubliqueCibleVo findById(@PathVariable Long id){
            return publiqueCibleConverter.toVo(publiqueCibleService.findById(id));
            }

            @ApiOperation("Saves the specified  publiqueCible")
            @PostMapping("/")
            public PubliqueCibleVo save(@RequestBody PubliqueCibleVo publiqueCibleVo){
            PubliqueCible publiqueCible = publiqueCibleConverter.toItem(publiqueCibleVo);
            publiqueCible = publiqueCibleService.save(publiqueCible);
            return publiqueCibleConverter.toVo(publiqueCible);
            }

            @ApiOperation("Delete the specified publiqueCible")
            @DeleteMapping("/")
            public int delete(@RequestBody PubliqueCibleVo publiqueCibleVo){
            PubliqueCible publiqueCible = publiqueCibleConverter.toItem(publiqueCibleVo);
            return publiqueCibleService.delete(publiqueCible);
            }

            @ApiOperation("Deletes a publiqueCible by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return publiqueCibleService.deleteById(id);
            }


            }
