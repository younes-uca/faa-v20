package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.CommunauteSavoirAdminService;

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
import com.ird.faa.bean.CommunauteSavoir;
import com.ird.faa.ws.rest.provided.converter.CommunauteSavoirConverter;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirVo;

@Api("Manages communauteSavoir services")
@RestController
@RequestMapping("api/admin/communauteSavoir")
public class CommunauteSavoirRestAdmin {

@Autowired
private CommunauteSavoirAdminService communauteSavoirService;

@Autowired
private CommunauteSavoirConverter communauteSavoirConverter;


            @ApiOperation("Updates the specified  communauteSavoir")
            @PutMapping("/")
            public  CommunauteSavoirVo update(@RequestBody  CommunauteSavoirVo  communauteSavoirVo){
            CommunauteSavoir communauteSavoir = communauteSavoirConverter.toItem(communauteSavoirVo);
            communauteSavoir = communauteSavoirService.update(communauteSavoir);
            return communauteSavoirConverter.toVo(communauteSavoir);
            }

    @ApiOperation("Finds a list of all communauteSavoirs")
    @GetMapping("/")
    public List<CommunauteSavoirVo> findAll(){
        return communauteSavoirConverter.toVo(communauteSavoirService.findAll());
    }

    @ApiOperation("Finds a communauteSavoir with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CommunauteSavoirVo findByIdWithAssociatedList(@PathVariable Long id){
    return communauteSavoirConverter.toVo(communauteSavoirService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search communauteSavoir by a specific criteria")
    @PostMapping("/search")
    public List<CommunauteSavoirVo> findByCriteria(@RequestBody CommunauteSavoirVo communauteSavoirVo){
        return communauteSavoirConverter.toVo(communauteSavoirService.findByCriteria(communauteSavoirVo));
        }

            @ApiOperation("Finds a communauteSavoir by id")
            @GetMapping("/id/{id}")
            public CommunauteSavoirVo findById(@PathVariable Long id){
            return communauteSavoirConverter.toVo(communauteSavoirService.findById(id));
            }

            @ApiOperation("Saves the specified  communauteSavoir")
            @PostMapping("/")
            public CommunauteSavoirVo save(@RequestBody CommunauteSavoirVo communauteSavoirVo){
            CommunauteSavoir communauteSavoir = communauteSavoirConverter.toItem(communauteSavoirVo);
            communauteSavoir = communauteSavoirService.save(communauteSavoir);
            return communauteSavoirConverter.toVo(communauteSavoir);
            }

            @ApiOperation("Delete the specified communauteSavoir")
            @DeleteMapping("/")
            public int delete(@RequestBody CommunauteSavoirVo communauteSavoirVo){
            CommunauteSavoir communauteSavoir = communauteSavoirConverter.toItem(communauteSavoirVo);
            return communauteSavoirService.delete(communauteSavoir);
            }

            @ApiOperation("Deletes a communauteSavoir by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return communauteSavoirService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public CommunauteSavoirVo archiver(@RequestBody CommunauteSavoirVo communauteSavoirVo){
                CommunauteSavoir communauteSavoir = communauteSavoirService.archiver(communauteSavoirConverter.toItem(communauteSavoirVo));
                return communauteSavoirConverter.toVo(communauteSavoir);
                }

            @PutMapping("/desarchiver/")
            public CommunauteSavoirVo desarchiver(@RequestBody CommunauteSavoirVo communauteSavoirVo){
                CommunauteSavoir communauteSavoir = communauteSavoirService.desarchiver(communauteSavoirConverter.toItem(communauteSavoirVo));
                return communauteSavoirConverter.toVo(communauteSavoir);}
            }
