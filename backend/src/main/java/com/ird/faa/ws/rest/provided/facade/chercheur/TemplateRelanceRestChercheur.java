package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.TemplateRelanceChercheurService;

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
import com.ird.faa.bean.TemplateRelance;
import com.ird.faa.ws.rest.provided.converter.TemplateRelanceConverter;
import com.ird.faa.ws.rest.provided.vo.TemplateRelanceVo;

@Api("Manages templateRelance services")
@RestController
@RequestMapping("api/chercheur/templateRelance")
public class TemplateRelanceRestChercheur {

@Autowired
private TemplateRelanceChercheurService templateRelanceService;

@Autowired
private TemplateRelanceConverter templateRelanceConverter;


            @ApiOperation("Updates the specified  templateRelance")
            @PutMapping("/")
            public  TemplateRelanceVo update(@RequestBody  TemplateRelanceVo  templateRelanceVo){
            TemplateRelance templateRelance = templateRelanceConverter.toItem(templateRelanceVo);
            templateRelance = templateRelanceService.update(templateRelance);
            return templateRelanceConverter.toVo(templateRelance);
            }

    @ApiOperation("Finds a list of all templateRelances")
    @GetMapping("/")
    public List<TemplateRelanceVo> findAll(){
        return templateRelanceConverter.toVo(templateRelanceService.findAll());
    }

    @ApiOperation("Finds a templateRelance with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TemplateRelanceVo findByIdWithAssociatedList(@PathVariable Long id){
    return templateRelanceConverter.toVo(templateRelanceService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search templateRelance by a specific criteria")
    @PostMapping("/search")
    public List<TemplateRelanceVo> findByCriteria(@RequestBody TemplateRelanceVo templateRelanceVo){
        return templateRelanceConverter.toVo(templateRelanceService.findByCriteria(templateRelanceVo));
        }

            @ApiOperation("Finds a templateRelance by id")
            @GetMapping("/id/{id}")
            public TemplateRelanceVo findById(@PathVariable Long id){
            return templateRelanceConverter.toVo(templateRelanceService.findById(id));
            }

            @ApiOperation("Saves the specified  templateRelance")
            @PostMapping("/")
            public TemplateRelanceVo save(@RequestBody TemplateRelanceVo templateRelanceVo){
            TemplateRelance templateRelance = templateRelanceConverter.toItem(templateRelanceVo);
            templateRelance = templateRelanceService.save(templateRelance);
            return templateRelanceConverter.toVo(templateRelance);
            }

            @ApiOperation("Delete the specified templateRelance")
            @DeleteMapping("/")
            public int delete(@RequestBody TemplateRelanceVo templateRelanceVo){
            TemplateRelance templateRelance = templateRelanceConverter.toItem(templateRelanceVo);
            return templateRelanceService.delete(templateRelance);
            }

            @ApiOperation("Deletes a templateRelance by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return templateRelanceService.deleteById(id);
            }


            }
