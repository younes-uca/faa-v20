package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.PubliqueProfessionelChercheurService;

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
import com.ird.faa.bean.PubliqueProfessionel;
import com.ird.faa.ws.rest.provided.converter.PubliqueProfessionelConverter;
import com.ird.faa.ws.rest.provided.vo.PubliqueProfessionelVo;

@Api("Manages publiqueProfessionel services")
@RestController
@RequestMapping("api/chercheur/publiqueProfessionel")
public class PubliqueProfessionelRestChercheur {

@Autowired
private PubliqueProfessionelChercheurService publiqueProfessionelService;

@Autowired
private PubliqueProfessionelConverter publiqueProfessionelConverter;


            @ApiOperation("Updates the specified  publiqueProfessionel")
            @PutMapping("/")
            public  PubliqueProfessionelVo update(@RequestBody  PubliqueProfessionelVo  publiqueProfessionelVo){
            PubliqueProfessionel publiqueProfessionel = publiqueProfessionelConverter.toItem(publiqueProfessionelVo);
            publiqueProfessionel = publiqueProfessionelService.update(publiqueProfessionel);
            return publiqueProfessionelConverter.toVo(publiqueProfessionel);
            }

    @ApiOperation("Finds a list of all publiqueProfessionels")
    @GetMapping("/")
    public List<PubliqueProfessionelVo> findAll(){
        return publiqueProfessionelConverter.toVo(publiqueProfessionelService.findAll());
    }

    @ApiOperation("Finds a publiqueProfessionel with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public PubliqueProfessionelVo findByIdWithAssociatedList(@PathVariable Long id){
    return publiqueProfessionelConverter.toVo(publiqueProfessionelService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search publiqueProfessionel by a specific criteria")
    @PostMapping("/search")
    public List<PubliqueProfessionelVo> findByCriteria(@RequestBody PubliqueProfessionelVo publiqueProfessionelVo){
        return publiqueProfessionelConverter.toVo(publiqueProfessionelService.findByCriteria(publiqueProfessionelVo));
        }

            @ApiOperation("Finds a publiqueProfessionel by id")
            @GetMapping("/id/{id}")
            public PubliqueProfessionelVo findById(@PathVariable Long id){
            return publiqueProfessionelConverter.toVo(publiqueProfessionelService.findById(id));
            }

            @ApiOperation("Saves the specified  publiqueProfessionel")
            @PostMapping("/")
            public PubliqueProfessionelVo save(@RequestBody PubliqueProfessionelVo publiqueProfessionelVo){
            PubliqueProfessionel publiqueProfessionel = publiqueProfessionelConverter.toItem(publiqueProfessionelVo);
            publiqueProfessionel = publiqueProfessionelService.save(publiqueProfessionel);
            return publiqueProfessionelConverter.toVo(publiqueProfessionel);
            }

            @ApiOperation("Delete the specified publiqueProfessionel")
            @DeleteMapping("/")
            public int delete(@RequestBody PubliqueProfessionelVo publiqueProfessionelVo){
            PubliqueProfessionel publiqueProfessionel = publiqueProfessionelConverter.toItem(publiqueProfessionelVo);
            return publiqueProfessionelService.delete(publiqueProfessionel);
            }

            @ApiOperation("Deletes a publiqueProfessionel by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return publiqueProfessionelService.deleteById(id);
            }


            }
