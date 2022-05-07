package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.StatusContratEtConventionAdminService;

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
import com.ird.faa.bean.StatusContratEtConvention;
import com.ird.faa.ws.rest.provided.converter.StatusContratEtConventionConverter;
import com.ird.faa.ws.rest.provided.vo.StatusContratEtConventionVo;

@Api("Manages statusContratEtConvention services")
@RestController
@RequestMapping("api/admin/statusContratEtConvention")
public class StatusContratEtConventionRestAdmin {

@Autowired
private StatusContratEtConventionAdminService statusContratEtConventionService;

@Autowired
private StatusContratEtConventionConverter statusContratEtConventionConverter;


            @ApiOperation("Updates the specified  statusContratEtConvention")
            @PutMapping("/")
            public  StatusContratEtConventionVo update(@RequestBody  StatusContratEtConventionVo  statusContratEtConventionVo){
            StatusContratEtConvention statusContratEtConvention = statusContratEtConventionConverter.toItem(statusContratEtConventionVo);
            statusContratEtConvention = statusContratEtConventionService.update(statusContratEtConvention);
            return statusContratEtConventionConverter.toVo(statusContratEtConvention);
            }

    @ApiOperation("Finds a list of all statusContratEtConventions")
    @GetMapping("/")
    public List<StatusContratEtConventionVo> findAll(){
        return statusContratEtConventionConverter.toVo(statusContratEtConventionService.findAll());
    }

    @ApiOperation("Finds a statusContratEtConvention with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public StatusContratEtConventionVo findByIdWithAssociatedList(@PathVariable Long id){
    return statusContratEtConventionConverter.toVo(statusContratEtConventionService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search statusContratEtConvention by a specific criteria")
    @PostMapping("/search")
    public List<StatusContratEtConventionVo> findByCriteria(@RequestBody StatusContratEtConventionVo statusContratEtConventionVo){
        return statusContratEtConventionConverter.toVo(statusContratEtConventionService.findByCriteria(statusContratEtConventionVo));
        }

            @ApiOperation("Finds a statusContratEtConvention by id")
            @GetMapping("/id/{id}")
            public StatusContratEtConventionVo findById(@PathVariable Long id){
            return statusContratEtConventionConverter.toVo(statusContratEtConventionService.findById(id));
            }

            @ApiOperation("Saves the specified  statusContratEtConvention")
            @PostMapping("/")
            public StatusContratEtConventionVo save(@RequestBody StatusContratEtConventionVo statusContratEtConventionVo){
            StatusContratEtConvention statusContratEtConvention = statusContratEtConventionConverter.toItem(statusContratEtConventionVo);
            statusContratEtConvention = statusContratEtConventionService.save(statusContratEtConvention);
            return statusContratEtConventionConverter.toVo(statusContratEtConvention);
            }

            @ApiOperation("Delete the specified statusContratEtConvention")
            @DeleteMapping("/")
            public int delete(@RequestBody StatusContratEtConventionVo statusContratEtConventionVo){
            StatusContratEtConvention statusContratEtConvention = statusContratEtConventionConverter.toItem(statusContratEtConventionVo);
            return statusContratEtConventionService.delete(statusContratEtConvention);
            }

            @ApiOperation("Deletes a statusContratEtConvention by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return statusContratEtConventionService.deleteById(id);
            }


            }
