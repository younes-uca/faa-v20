package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.StatusCursusAdminService;

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
import com.ird.faa.bean.StatusCursus;
import com.ird.faa.ws.rest.provided.converter.StatusCursusConverter;
import com.ird.faa.ws.rest.provided.vo.StatusCursusVo;

@Api("Manages statusCursus services")
@RestController
@RequestMapping("api/admin/statusCursus")
public class StatusCursusRestAdmin {

@Autowired
private StatusCursusAdminService statusCursusService;

@Autowired
private StatusCursusConverter statusCursusConverter;


            @ApiOperation("Updates the specified  statusCursus")
            @PutMapping("/")
            public  StatusCursusVo update(@RequestBody  StatusCursusVo  statusCursusVo){
            StatusCursus statusCursus = statusCursusConverter.toItem(statusCursusVo);
            statusCursus = statusCursusService.update(statusCursus);
            return statusCursusConverter.toVo(statusCursus);
            }

    @ApiOperation("Finds a list of all statusCursuss")
    @GetMapping("/")
    public List<StatusCursusVo> findAll(){
        return statusCursusConverter.toVo(statusCursusService.findAll());
    }

    @ApiOperation("Finds a statusCursus with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public StatusCursusVo findByIdWithAssociatedList(@PathVariable Long id){
    return statusCursusConverter.toVo(statusCursusService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search statusCursus by a specific criteria")
    @PostMapping("/search")
    public List<StatusCursusVo> findByCriteria(@RequestBody StatusCursusVo statusCursusVo){
        return statusCursusConverter.toVo(statusCursusService.findByCriteria(statusCursusVo));
        }

            @ApiOperation("Finds a statusCursus by id")
            @GetMapping("/id/{id}")
            public StatusCursusVo findById(@PathVariable Long id){
            return statusCursusConverter.toVo(statusCursusService.findById(id));
            }

            @ApiOperation("Saves the specified  statusCursus")
            @PostMapping("/")
            public StatusCursusVo save(@RequestBody StatusCursusVo statusCursusVo){
            StatusCursus statusCursus = statusCursusConverter.toItem(statusCursusVo);
            statusCursus = statusCursusService.save(statusCursus);
            return statusCursusConverter.toVo(statusCursus);
            }

            @ApiOperation("Delete the specified statusCursus")
            @DeleteMapping("/")
            public int delete(@RequestBody StatusCursusVo statusCursusVo){
            StatusCursus statusCursus = statusCursusConverter.toItem(statusCursusVo);
            return statusCursusService.delete(statusCursus);
            }

            @ApiOperation("Deletes a statusCursus by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return statusCursusService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public StatusCursusVo archiver(@RequestBody StatusCursusVo statusCursusVo){
                StatusCursus statusCursus = statusCursusService.archiver(statusCursusConverter.toItem(statusCursusVo));
                return statusCursusConverter.toVo(statusCursus);
                }

            @PutMapping("/desarchiver/")
            public StatusCursusVo desarchiver(@RequestBody StatusCursusVo statusCursusVo){
                StatusCursus statusCursus = statusCursusService.desarchiver(statusCursusConverter.toItem(statusCursusVo));
                return statusCursusConverter.toVo(statusCursus);}
            }
