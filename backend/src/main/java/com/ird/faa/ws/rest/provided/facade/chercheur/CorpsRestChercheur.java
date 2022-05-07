package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.CorpsChercheurService;

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
import com.ird.faa.bean.Corps;
import com.ird.faa.ws.rest.provided.converter.CorpsConverter;
import com.ird.faa.ws.rest.provided.vo.CorpsVo;

@Api("Manages corps services")
@RestController
@RequestMapping("api/chercheur/corps")
public class CorpsRestChercheur {

@Autowired
private CorpsChercheurService corpsService;

@Autowired
private CorpsConverter corpsConverter;


            @ApiOperation("Updates the specified  corps")
            @PutMapping("/")
            public  CorpsVo update(@RequestBody  CorpsVo  corpsVo){
            Corps corps = corpsConverter.toItem(corpsVo);
            corps = corpsService.update(corps);
            return corpsConverter.toVo(corps);
            }

    @ApiOperation("Finds a list of all corpss")
    @GetMapping("/")
    public List<CorpsVo> findAll(){
        return corpsConverter.toVo(corpsService.findAll());
    }

    @ApiOperation("Finds a corps with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CorpsVo findByIdWithAssociatedList(@PathVariable Long id){
    return corpsConverter.toVo(corpsService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search corps by a specific criteria")
    @PostMapping("/search")
    public List<CorpsVo> findByCriteria(@RequestBody CorpsVo corpsVo){
        return corpsConverter.toVo(corpsService.findByCriteria(corpsVo));
        }

            @ApiOperation("Finds a corps by id")
            @GetMapping("/id/{id}")
            public CorpsVo findById(@PathVariable Long id){
            return corpsConverter.toVo(corpsService.findById(id));
            }

            @ApiOperation("Saves the specified  corps")
            @PostMapping("/")
            public CorpsVo save(@RequestBody CorpsVo corpsVo){
            Corps corps = corpsConverter.toItem(corpsVo);
            corps = corpsService.save(corps);
            return corpsConverter.toVo(corps);
            }

            @ApiOperation("Delete the specified corps")
            @DeleteMapping("/")
            public int delete(@RequestBody CorpsVo corpsVo){
            Corps corps = corpsConverter.toItem(corpsVo);
            return corpsService.delete(corps);
            }

            @ApiOperation("Deletes a corps by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return corpsService.deleteById(id);
            }


            }
