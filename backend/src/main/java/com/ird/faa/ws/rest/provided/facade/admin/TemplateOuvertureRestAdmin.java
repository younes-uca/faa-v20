package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TemplateOuvertureAdminService;

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
import com.ird.faa.bean.TemplateOuverture;
import com.ird.faa.ws.rest.provided.converter.TemplateOuvertureConverter;
import com.ird.faa.ws.rest.provided.vo.TemplateOuvertureVo;

@Api("Manages templateOuverture services")
@RestController
@RequestMapping("api/admin/templateOuverture")
public class TemplateOuvertureRestAdmin {

@Autowired
private TemplateOuvertureAdminService templateOuvertureService;

@Autowired
private TemplateOuvertureConverter templateOuvertureConverter;


            @ApiOperation("Updates the specified  templateOuverture")
            @PutMapping("/")
            public  TemplateOuvertureVo update(@RequestBody  TemplateOuvertureVo  templateOuvertureVo){
            TemplateOuverture templateOuverture = templateOuvertureConverter.toItem(templateOuvertureVo);
            templateOuverture = templateOuvertureService.update(templateOuverture);
            return templateOuvertureConverter.toVo(templateOuverture);
            }

    @ApiOperation("Finds a list of all templateOuvertures")
    @GetMapping("/")
    public List<TemplateOuvertureVo> findAll(){
        return templateOuvertureConverter.toVo(templateOuvertureService.findAll());
    }

    @ApiOperation("Finds a templateOuverture with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TemplateOuvertureVo findByIdWithAssociatedList(@PathVariable Long id){
    return templateOuvertureConverter.toVo(templateOuvertureService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search templateOuverture by a specific criteria")
    @PostMapping("/search")
    public List<TemplateOuvertureVo> findByCriteria(@RequestBody TemplateOuvertureVo templateOuvertureVo){
        return templateOuvertureConverter.toVo(templateOuvertureService.findByCriteria(templateOuvertureVo));
        }

            @ApiOperation("Finds a templateOuverture by id")
            @GetMapping("/id/{id}")
            public TemplateOuvertureVo findById(@PathVariable Long id){
            return templateOuvertureConverter.toVo(templateOuvertureService.findById(id));
            }

            @ApiOperation("Saves the specified  templateOuverture")
            @PostMapping("/")
            public TemplateOuvertureVo save(@RequestBody TemplateOuvertureVo templateOuvertureVo){
            TemplateOuverture templateOuverture = templateOuvertureConverter.toItem(templateOuvertureVo);
            templateOuverture = templateOuvertureService.save(templateOuverture);
            return templateOuvertureConverter.toVo(templateOuverture);
            }

            @ApiOperation("Delete the specified templateOuverture")
            @DeleteMapping("/")
            public int delete(@RequestBody TemplateOuvertureVo templateOuvertureVo){
            TemplateOuverture templateOuverture = templateOuvertureConverter.toItem(templateOuvertureVo);
            return templateOuvertureService.delete(templateOuverture);
            }

            @ApiOperation("Deletes a templateOuverture by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return templateOuvertureService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public TemplateOuvertureVo archiver(@RequestBody TemplateOuvertureVo templateOuvertureVo){
                TemplateOuverture templateOuverture = templateOuvertureService.archiver(templateOuvertureConverter.toItem(templateOuvertureVo));
                return templateOuvertureConverter.toVo(templateOuverture);
                }

            @PutMapping("/desarchiver/")
            public TemplateOuvertureVo desarchiver(@RequestBody TemplateOuvertureVo templateOuvertureVo){
                TemplateOuverture templateOuverture = templateOuvertureService.desarchiver(templateOuvertureConverter.toItem(templateOuvertureVo));
                return templateOuvertureConverter.toVo(templateOuverture);}
            }
