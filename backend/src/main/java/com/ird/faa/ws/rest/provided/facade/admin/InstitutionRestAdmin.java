package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.InstitutionAdminService;

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
import com.ird.faa.bean.Institution;
import com.ird.faa.ws.rest.provided.converter.InstitutionConverter;
import com.ird.faa.ws.rest.provided.vo.InstitutionVo;

@Api("Manages institution services")
@RestController
@RequestMapping("api/admin/institution")
public class InstitutionRestAdmin {

@Autowired
private InstitutionAdminService institutionService;

@Autowired
private InstitutionConverter institutionConverter;


            @ApiOperation("Updates the specified  institution")
            @PutMapping("/")
            public  InstitutionVo update(@RequestBody  InstitutionVo  institutionVo){
            Institution institution = institutionConverter.toItem(institutionVo);
            institution = institutionService.update(institution);
            return institutionConverter.toVo(institution);
            }

    @ApiOperation("Finds a list of all institutions")
    @GetMapping("/")
    public List<InstitutionVo> findAll(){
        return institutionConverter.toVo(institutionService.findAll());
    }

    @ApiOperation("Finds a institution with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public InstitutionVo findByIdWithAssociatedList(@PathVariable Long id){
    return institutionConverter.toVo(institutionService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search institution by a specific criteria")
    @PostMapping("/search")
    public List<InstitutionVo> findByCriteria(@RequestBody InstitutionVo institutionVo){
        return institutionConverter.toVo(institutionService.findByCriteria(institutionVo));
        }

            @ApiOperation("Finds a institution by id")
            @GetMapping("/id/{id}")
            public InstitutionVo findById(@PathVariable Long id){
            return institutionConverter.toVo(institutionService.findById(id));
            }

            @ApiOperation("Saves the specified  institution")
            @PostMapping("/")
            public InstitutionVo save(@RequestBody InstitutionVo institutionVo){
            Institution institution = institutionConverter.toItem(institutionVo);
            institution = institutionService.save(institution);
            return institutionConverter.toVo(institution);
            }

            @ApiOperation("Delete the specified institution")
            @DeleteMapping("/")
            public int delete(@RequestBody InstitutionVo institutionVo){
            Institution institution = institutionConverter.toItem(institutionVo);
            return institutionService.delete(institution);
            }

            @ApiOperation("Deletes a institution by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return institutionService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public InstitutionVo archiver(@RequestBody InstitutionVo institutionVo){
                Institution institution = institutionService.archiver(institutionConverter.toItem(institutionVo));
                return institutionConverter.toVo(institution);
                }

            @PutMapping("/desarchiver/")
            public InstitutionVo desarchiver(@RequestBody InstitutionVo institutionVo){
                Institution institution = institutionService.desarchiver(institutionConverter.toItem(institutionVo));
                return institutionConverter.toVo(institution);}
            }
