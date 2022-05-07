package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TemplateRappelAdminService;

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
import com.ird.faa.bean.TemplateRappel;
import com.ird.faa.ws.rest.provided.converter.TemplateRappelConverter;
import com.ird.faa.ws.rest.provided.vo.TemplateRappelVo;

@Api("Manages templateRappel services")
@RestController
@RequestMapping("api/admin/templateRappel")
public class TemplateRappelRestAdmin {

@Autowired
private TemplateRappelAdminService templateRappelService;

@Autowired
private TemplateRappelConverter templateRappelConverter;


            @ApiOperation("Updates the specified  templateRappel")
            @PutMapping("/")
            public  TemplateRappelVo update(@RequestBody  TemplateRappelVo  templateRappelVo){
            TemplateRappel templateRappel = templateRappelConverter.toItem(templateRappelVo);
            templateRappel = templateRappelService.update(templateRappel);
            return templateRappelConverter.toVo(templateRappel);
            }

    @ApiOperation("Finds a list of all templateRappels")
    @GetMapping("/")
    public List<TemplateRappelVo> findAll(){
        return templateRappelConverter.toVo(templateRappelService.findAll());
    }

    @ApiOperation("Finds a templateRappel with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TemplateRappelVo findByIdWithAssociatedList(@PathVariable Long id){
    return templateRappelConverter.toVo(templateRappelService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search templateRappel by a specific criteria")
    @PostMapping("/search")
    public List<TemplateRappelVo> findByCriteria(@RequestBody TemplateRappelVo templateRappelVo){
        return templateRappelConverter.toVo(templateRappelService.findByCriteria(templateRappelVo));
        }

            @ApiOperation("Finds a templateRappel by id")
            @GetMapping("/id/{id}")
            public TemplateRappelVo findById(@PathVariable Long id){
            return templateRappelConverter.toVo(templateRappelService.findById(id));
            }

            @ApiOperation("Saves the specified  templateRappel")
            @PostMapping("/")
            public TemplateRappelVo save(@RequestBody TemplateRappelVo templateRappelVo){
            TemplateRappel templateRappel = templateRappelConverter.toItem(templateRappelVo);
            templateRappel = templateRappelService.save(templateRappel);
            return templateRappelConverter.toVo(templateRappel);
            }

            @ApiOperation("Delete the specified templateRappel")
            @DeleteMapping("/")
            public int delete(@RequestBody TemplateRappelVo templateRappelVo){
            TemplateRappel templateRappel = templateRappelConverter.toItem(templateRappelVo);
            return templateRappelService.delete(templateRappel);
            }

            @ApiOperation("Deletes a templateRappel by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return templateRappelService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public TemplateRappelVo archiver(@RequestBody TemplateRappelVo templateRappelVo){
                TemplateRappel templateRappel = templateRappelService.archiver(templateRappelConverter.toItem(templateRappelVo));
                return templateRappelConverter.toVo(templateRappel);
                }

            @PutMapping("/desarchiver/")
            public TemplateRappelVo desarchiver(@RequestBody TemplateRappelVo templateRappelVo){
                TemplateRappel templateRappel = templateRappelService.desarchiver(templateRappelConverter.toItem(templateRappelVo));
                return templateRappelConverter.toVo(templateRappel);}
            }
