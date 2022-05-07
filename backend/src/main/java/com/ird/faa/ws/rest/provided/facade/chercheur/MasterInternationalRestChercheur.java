package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.MasterInternationalChercheurService;

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
import com.ird.faa.bean.MasterInternational;
import com.ird.faa.ws.rest.provided.converter.MasterInternationalConverter;
import com.ird.faa.ws.rest.provided.vo.MasterInternationalVo;

@Api("Manages masterInternational services")
@RestController
@RequestMapping("api/chercheur/masterInternational")
public class MasterInternationalRestChercheur {

@Autowired
private MasterInternationalChercheurService masterInternationalService;

@Autowired
private MasterInternationalConverter masterInternationalConverter;


            @ApiOperation("Updates the specified  masterInternational")
            @PutMapping("/")
            public  MasterInternationalVo update(@RequestBody  MasterInternationalVo  masterInternationalVo){
            MasterInternational masterInternational = masterInternationalConverter.toItem(masterInternationalVo);
            masterInternational = masterInternationalService.update(masterInternational);
            return masterInternationalConverter.toVo(masterInternational);
            }

    @ApiOperation("Finds a list of all masterInternationals")
    @GetMapping("/")
    public List<MasterInternationalVo> findAll(){
        return masterInternationalConverter.toVo(masterInternationalService.findAll());
    }

    @ApiOperation("Finds a masterInternational with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public MasterInternationalVo findByIdWithAssociatedList(@PathVariable Long id){
    return masterInternationalConverter.toVo(masterInternationalService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search masterInternational by a specific criteria")
    @PostMapping("/search")
    public List<MasterInternationalVo> findByCriteria(@RequestBody MasterInternationalVo masterInternationalVo){
        return masterInternationalConverter.toVo(masterInternationalService.findByCriteria(masterInternationalVo));
        }

            @ApiOperation("Finds a masterInternational by id")
            @GetMapping("/id/{id}")
            public MasterInternationalVo findById(@PathVariable Long id){
            return masterInternationalConverter.toVo(masterInternationalService.findById(id));
            }

            @ApiOperation("Saves the specified  masterInternational")
            @PostMapping("/")
            public MasterInternationalVo save(@RequestBody MasterInternationalVo masterInternationalVo){
            MasterInternational masterInternational = masterInternationalConverter.toItem(masterInternationalVo);
            masterInternational = masterInternationalService.save(masterInternational);
            return masterInternationalConverter.toVo(masterInternational);
            }

            @ApiOperation("Delete the specified masterInternational")
            @DeleteMapping("/")
            public int delete(@RequestBody MasterInternationalVo masterInternationalVo){
            MasterInternational masterInternational = masterInternationalConverter.toItem(masterInternationalVo);
            return masterInternationalService.delete(masterInternational);
            }

            @ApiOperation("Deletes a masterInternational by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return masterInternationalService.deleteById(id);
            }


            }
