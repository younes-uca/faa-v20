package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.VieInstitutionnelleDetailInstrumentIrdChercheurService;

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
import com.ird.faa.bean.VieInstitutionnelleDetailInstrumentIrd;
import com.ird.faa.ws.rest.provided.converter.VieInstitutionnelleDetailInstrumentIrdConverter;
import com.ird.faa.ws.rest.provided.vo.VieInstitutionnelleDetailInstrumentIrdVo;

@Api("Manages vieInstitutionnelleDetailInstrumentIrd services")
@RestController
@RequestMapping("api/chercheur/vieInstitutionnelleDetailInstrumentIrd")
public class VieInstitutionnelleDetailInstrumentIrdRestChercheur {

@Autowired
private VieInstitutionnelleDetailInstrumentIrdChercheurService vieInstitutionnelleDetailInstrumentIrdService;

@Autowired
private VieInstitutionnelleDetailInstrumentIrdConverter vieInstitutionnelleDetailInstrumentIrdConverter;


            @ApiOperation("Updates the specified  vieInstitutionnelleDetailInstrumentIrd")
            @PutMapping("/")
            public  VieInstitutionnelleDetailInstrumentIrdVo update(@RequestBody  VieInstitutionnelleDetailInstrumentIrdVo  vieInstitutionnelleDetailInstrumentIrdVo){
            VieInstitutionnelleDetailInstrumentIrd vieInstitutionnelleDetailInstrumentIrd = vieInstitutionnelleDetailInstrumentIrdConverter.toItem(vieInstitutionnelleDetailInstrumentIrdVo);
            vieInstitutionnelleDetailInstrumentIrd = vieInstitutionnelleDetailInstrumentIrdService.update(vieInstitutionnelleDetailInstrumentIrd);
            return vieInstitutionnelleDetailInstrumentIrdConverter.toVo(vieInstitutionnelleDetailInstrumentIrd);
            }

    @ApiOperation("Finds a list of all vieInstitutionnelleDetailInstrumentIrds")
    @GetMapping("/")
    public List<VieInstitutionnelleDetailInstrumentIrdVo> findAll(){
        return vieInstitutionnelleDetailInstrumentIrdConverter.toVo(vieInstitutionnelleDetailInstrumentIrdService.findAll());
    }

    @ApiOperation("Finds a vieInstitutionnelleDetailInstrumentIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public VieInstitutionnelleDetailInstrumentIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return vieInstitutionnelleDetailInstrumentIrdConverter.toVo(vieInstitutionnelleDetailInstrumentIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search vieInstitutionnelleDetailInstrumentIrd by a specific criteria")
    @PostMapping("/search")
    public List<VieInstitutionnelleDetailInstrumentIrdVo> findByCriteria(@RequestBody VieInstitutionnelleDetailInstrumentIrdVo vieInstitutionnelleDetailInstrumentIrdVo){
        return vieInstitutionnelleDetailInstrumentIrdConverter.toVo(vieInstitutionnelleDetailInstrumentIrdService.findByCriteria(vieInstitutionnelleDetailInstrumentIrdVo));
        }

            @ApiOperation("Finds a vieInstitutionnelleDetailInstrumentIrd by id")
            @GetMapping("/id/{id}")
            public VieInstitutionnelleDetailInstrumentIrdVo findById(@PathVariable Long id){
            return vieInstitutionnelleDetailInstrumentIrdConverter.toVo(vieInstitutionnelleDetailInstrumentIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  vieInstitutionnelleDetailInstrumentIrd")
            @PostMapping("/")
            public VieInstitutionnelleDetailInstrumentIrdVo save(@RequestBody VieInstitutionnelleDetailInstrumentIrdVo vieInstitutionnelleDetailInstrumentIrdVo){
            VieInstitutionnelleDetailInstrumentIrd vieInstitutionnelleDetailInstrumentIrd = vieInstitutionnelleDetailInstrumentIrdConverter.toItem(vieInstitutionnelleDetailInstrumentIrdVo);
            vieInstitutionnelleDetailInstrumentIrd = vieInstitutionnelleDetailInstrumentIrdService.save(vieInstitutionnelleDetailInstrumentIrd);
            return vieInstitutionnelleDetailInstrumentIrdConverter.toVo(vieInstitutionnelleDetailInstrumentIrd);
            }

            @ApiOperation("Delete the specified vieInstitutionnelleDetailInstrumentIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody VieInstitutionnelleDetailInstrumentIrdVo vieInstitutionnelleDetailInstrumentIrdVo){
            VieInstitutionnelleDetailInstrumentIrd vieInstitutionnelleDetailInstrumentIrd = vieInstitutionnelleDetailInstrumentIrdConverter.toItem(vieInstitutionnelleDetailInstrumentIrdVo);
            return vieInstitutionnelleDetailInstrumentIrdService.delete(vieInstitutionnelleDetailInstrumentIrd);
            }

            @ApiOperation("Deletes a vieInstitutionnelleDetailInstrumentIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return vieInstitutionnelleDetailInstrumentIrdService.deleteById(id);
            }
        @ApiOperation("find by vieInstitutionnelleDetail id")
        @GetMapping("/vieInstitutionnelleDetail/id/{id}")
        public List<VieInstitutionnelleDetailInstrumentIrd> findByVieInstitutionnelleDetailId(@PathVariable Long id){
        return vieInstitutionnelleDetailInstrumentIrdService.findByVieInstitutionnelleDetailId(id);
        }

        @ApiOperation("delete by vieInstitutionnelleDetail id")
        @DeleteMapping("/vieInstitutionnelleDetail/id/{id}")
        public int deleteByVieInstitutionnelleDetailId(@PathVariable Long id){
        return vieInstitutionnelleDetailInstrumentIrdService.deleteByVieInstitutionnelleDetailId(id);
        }

        @ApiOperation("find by instrumentIrd code")
        @GetMapping("/instrumentIrd/code/{code}")
        public List<VieInstitutionnelleDetailInstrumentIrd> findByInstrumentIrdCode(@PathVariable String code){
        return vieInstitutionnelleDetailInstrumentIrdService.findByInstrumentIrdCode(code);
        }

        @ApiOperation("delete by instrumentIrd code")
        @DeleteMapping("/instrumentIrd/code/{code}")
        public int deleteByInstrumentIrdCode(@PathVariable String code){
        return vieInstitutionnelleDetailInstrumentIrdService.deleteByInstrumentIrdCode(code);
        }

        @ApiOperation("find by instrumentIrd id")
        @GetMapping("/instrumentIrd/id/{id}")
        public List<VieInstitutionnelleDetailInstrumentIrd> findByInstrumentIrdId(@PathVariable Long id){
        return vieInstitutionnelleDetailInstrumentIrdService.findByInstrumentIrdId(id);
        }

        @ApiOperation("delete by instrumentIrd id")
        @DeleteMapping("/instrumentIrd/id/{id}")
        public int deleteByInstrumentIrdId(@PathVariable Long id){
        return vieInstitutionnelleDetailInstrumentIrdService.deleteByInstrumentIrdId(id);
        }



            }
