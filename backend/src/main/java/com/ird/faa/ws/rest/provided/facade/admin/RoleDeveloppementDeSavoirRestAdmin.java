package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.RoleDeveloppementDeSavoirAdminService;

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
import com.ird.faa.bean.RoleDeveloppementDeSavoir;
import com.ird.faa.ws.rest.provided.converter.RoleDeveloppementDeSavoirConverter;
import com.ird.faa.ws.rest.provided.vo.RoleDeveloppementDeSavoirVo;

@Api("Manages roleDeveloppementDeSavoir services")
@RestController
@RequestMapping("api/admin/roleDeveloppementDeSavoir")
public class RoleDeveloppementDeSavoirRestAdmin {

@Autowired
private RoleDeveloppementDeSavoirAdminService roleDeveloppementDeSavoirService;

@Autowired
private RoleDeveloppementDeSavoirConverter roleDeveloppementDeSavoirConverter;


            @ApiOperation("Updates the specified  roleDeveloppementDeSavoir")
            @PutMapping("/")
            public  RoleDeveloppementDeSavoirVo update(@RequestBody  RoleDeveloppementDeSavoirVo  roleDeveloppementDeSavoirVo){
            RoleDeveloppementDeSavoir roleDeveloppementDeSavoir = roleDeveloppementDeSavoirConverter.toItem(roleDeveloppementDeSavoirVo);
            roleDeveloppementDeSavoir = roleDeveloppementDeSavoirService.update(roleDeveloppementDeSavoir);
            return roleDeveloppementDeSavoirConverter.toVo(roleDeveloppementDeSavoir);
            }

    @ApiOperation("Finds a list of all roleDeveloppementDeSavoirs")
    @GetMapping("/")
    public List<RoleDeveloppementDeSavoirVo> findAll(){
        return roleDeveloppementDeSavoirConverter.toVo(roleDeveloppementDeSavoirService.findAll());
    }

    @ApiOperation("Finds a roleDeveloppementDeSavoir with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public RoleDeveloppementDeSavoirVo findByIdWithAssociatedList(@PathVariable Long id){
    return roleDeveloppementDeSavoirConverter.toVo(roleDeveloppementDeSavoirService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search roleDeveloppementDeSavoir by a specific criteria")
    @PostMapping("/search")
    public List<RoleDeveloppementDeSavoirVo> findByCriteria(@RequestBody RoleDeveloppementDeSavoirVo roleDeveloppementDeSavoirVo){
        return roleDeveloppementDeSavoirConverter.toVo(roleDeveloppementDeSavoirService.findByCriteria(roleDeveloppementDeSavoirVo));
        }

            @ApiOperation("Finds a roleDeveloppementDeSavoir by id")
            @GetMapping("/id/{id}")
            public RoleDeveloppementDeSavoirVo findById(@PathVariable Long id){
            return roleDeveloppementDeSavoirConverter.toVo(roleDeveloppementDeSavoirService.findById(id));
            }

            @ApiOperation("Saves the specified  roleDeveloppementDeSavoir")
            @PostMapping("/")
            public RoleDeveloppementDeSavoirVo save(@RequestBody RoleDeveloppementDeSavoirVo roleDeveloppementDeSavoirVo){
            RoleDeveloppementDeSavoir roleDeveloppementDeSavoir = roleDeveloppementDeSavoirConverter.toItem(roleDeveloppementDeSavoirVo);
            roleDeveloppementDeSavoir = roleDeveloppementDeSavoirService.save(roleDeveloppementDeSavoir);
            return roleDeveloppementDeSavoirConverter.toVo(roleDeveloppementDeSavoir);
            }

            @ApiOperation("Delete the specified roleDeveloppementDeSavoir")
            @DeleteMapping("/")
            public int delete(@RequestBody RoleDeveloppementDeSavoirVo roleDeveloppementDeSavoirVo){
            RoleDeveloppementDeSavoir roleDeveloppementDeSavoir = roleDeveloppementDeSavoirConverter.toItem(roleDeveloppementDeSavoirVo);
            return roleDeveloppementDeSavoirService.delete(roleDeveloppementDeSavoir);
            }

            @ApiOperation("Deletes a roleDeveloppementDeSavoir by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return roleDeveloppementDeSavoirService.deleteById(id);
            }


            }
