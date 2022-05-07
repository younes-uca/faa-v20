package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ContexteChercheurService;

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
import com.ird.faa.bean.Contexte;
import com.ird.faa.ws.rest.provided.converter.ContexteConverter;
import com.ird.faa.ws.rest.provided.vo.ContexteVo;

@Api("Manages contexte services")
@RestController
@RequestMapping("api/chercheur/contexte")
public class ContexteRestChercheur {

@Autowired
private ContexteChercheurService contexteService;

@Autowired
private ContexteConverter contexteConverter;


            @ApiOperation("Updates the specified  contexte")
            @PutMapping("/")
            public  ContexteVo update(@RequestBody  ContexteVo  contexteVo){
            Contexte contexte = contexteConverter.toItem(contexteVo);
            contexte = contexteService.update(contexte);
            return contexteConverter.toVo(contexte);
            }

    @ApiOperation("Finds a list of all contextes")
    @GetMapping("/")
    public List<ContexteVo> findAll(){
        return contexteConverter.toVo(contexteService.findAll());
    }

    @ApiOperation("Finds a contexte with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ContexteVo findByIdWithAssociatedList(@PathVariable Long id){
    return contexteConverter.toVo(contexteService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search contexte by a specific criteria")
    @PostMapping("/search")
    public List<ContexteVo> findByCriteria(@RequestBody ContexteVo contexteVo){
        return contexteConverter.toVo(contexteService.findByCriteria(contexteVo));
        }

            @ApiOperation("Finds a contexte by id")
            @GetMapping("/id/{id}")
            public ContexteVo findById(@PathVariable Long id){
            return contexteConverter.toVo(contexteService.findById(id));
            }

            @ApiOperation("Saves the specified  contexte")
            @PostMapping("/")
            public ContexteVo save(@RequestBody ContexteVo contexteVo){
            Contexte contexte = contexteConverter.toItem(contexteVo);
            contexte = contexteService.save(contexte);
            return contexteConverter.toVo(contexte);
            }

            @ApiOperation("Delete the specified contexte")
            @DeleteMapping("/")
            public int delete(@RequestBody ContexteVo contexteVo){
            Contexte contexte = contexteConverter.toItem(contexteVo);
            return contexteService.delete(contexte);
            }

            @ApiOperation("Deletes a contexte by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return contexteService.deleteById(id);
            }


            }
