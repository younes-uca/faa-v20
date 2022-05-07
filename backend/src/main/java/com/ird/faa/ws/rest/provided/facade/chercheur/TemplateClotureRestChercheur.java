package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.TemplateClotureChercheurService;

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
import com.ird.faa.bean.TemplateCloture;
import com.ird.faa.ws.rest.provided.converter.TemplateClotureConverter;
import com.ird.faa.ws.rest.provided.vo.TemplateClotureVo;

@Api("Manages templateCloture services")
@RestController
@RequestMapping("api/chercheur/templateCloture")
public class TemplateClotureRestChercheur {

@Autowired
private TemplateClotureChercheurService templateClotureService;

@Autowired
private TemplateClotureConverter templateClotureConverter;


            @ApiOperation("Updates the specified  templateCloture")
            @PutMapping("/")
            public  TemplateClotureVo update(@RequestBody  TemplateClotureVo  templateClotureVo){
            TemplateCloture templateCloture = templateClotureConverter.toItem(templateClotureVo);
            templateCloture = templateClotureService.update(templateCloture);
            return templateClotureConverter.toVo(templateCloture);
            }

    @ApiOperation("Finds a list of all templateClotures")
    @GetMapping("/")
    public List<TemplateClotureVo> findAll(){
        return templateClotureConverter.toVo(templateClotureService.findAll());
    }

    @ApiOperation("Finds a templateCloture with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TemplateClotureVo findByIdWithAssociatedList(@PathVariable Long id){
    return templateClotureConverter.toVo(templateClotureService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search templateCloture by a specific criteria")
    @PostMapping("/search")
    public List<TemplateClotureVo> findByCriteria(@RequestBody TemplateClotureVo templateClotureVo){
        return templateClotureConverter.toVo(templateClotureService.findByCriteria(templateClotureVo));
        }

            @ApiOperation("Finds a templateCloture by id")
            @GetMapping("/id/{id}")
            public TemplateClotureVo findById(@PathVariable Long id){
            return templateClotureConverter.toVo(templateClotureService.findById(id));
            }

            @ApiOperation("Saves the specified  templateCloture")
            @PostMapping("/")
            public TemplateClotureVo save(@RequestBody TemplateClotureVo templateClotureVo){
            TemplateCloture templateCloture = templateClotureConverter.toItem(templateClotureVo);
            templateCloture = templateClotureService.save(templateCloture);
            return templateClotureConverter.toVo(templateCloture);
            }

            @ApiOperation("Delete the specified templateCloture")
            @DeleteMapping("/")
            public int delete(@RequestBody TemplateClotureVo templateClotureVo){
            TemplateCloture templateCloture = templateClotureConverter.toItem(templateClotureVo);
            return templateClotureService.delete(templateCloture);
            }

            @ApiOperation("Deletes a templateCloture by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return templateClotureService.deleteById(id);
            }


            }
