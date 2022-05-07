package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.LangueChercheurService;

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
import com.ird.faa.bean.Langue;
import com.ird.faa.ws.rest.provided.converter.LangueConverter;
import com.ird.faa.ws.rest.provided.vo.LangueVo;

@Api("Manages langue services")
@RestController
@RequestMapping("api/chercheur/langue")
public class LangueRestChercheur {

@Autowired
private LangueChercheurService langueService;

@Autowired
private LangueConverter langueConverter;


            @ApiOperation("Updates the specified  langue")
            @PutMapping("/")
            public  LangueVo update(@RequestBody  LangueVo  langueVo){
            Langue langue = langueConverter.toItem(langueVo);
            langue = langueService.update(langue);
            return langueConverter.toVo(langue);
            }

    @ApiOperation("Finds a list of all langues")
    @GetMapping("/")
    public List<LangueVo> findAll(){
        return langueConverter.toVo(langueService.findAll());
    }

    @ApiOperation("Finds a langue with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public LangueVo findByIdWithAssociatedList(@PathVariable Long id){
    return langueConverter.toVo(langueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search langue by a specific criteria")
    @PostMapping("/search")
    public List<LangueVo> findByCriteria(@RequestBody LangueVo langueVo){
        return langueConverter.toVo(langueService.findByCriteria(langueVo));
        }

            @ApiOperation("Finds a langue by id")
            @GetMapping("/id/{id}")
            public LangueVo findById(@PathVariable Long id){
            return langueConverter.toVo(langueService.findById(id));
            }

            @ApiOperation("Saves the specified  langue")
            @PostMapping("/")
            public LangueVo save(@RequestBody LangueVo langueVo){
            Langue langue = langueConverter.toItem(langueVo);
            langue = langueService.save(langue);
            return langueConverter.toVo(langue);
            }

            @ApiOperation("Delete the specified langue")
            @DeleteMapping("/")
            public int delete(@RequestBody LangueVo langueVo){
            Langue langue = langueConverter.toItem(langueVo);
            return langueService.delete(langue);
            }

            @ApiOperation("Deletes a langue by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return langueService.deleteById(id);
            }


            }
