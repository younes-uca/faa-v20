package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.ProjetActiviteRechercheDetailInstrumentIrdAdminService;

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
import com.ird.faa.bean.ProjetActiviteRechercheDetailInstrumentIrd;
import com.ird.faa.ws.rest.provided.converter.ProjetActiviteRechercheDetailInstrumentIrdConverter;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailInstrumentIrdVo;

@Api("Manages projetActiviteRechercheDetailInstrumentIrd services")
@RestController
@RequestMapping("api/admin/projetActiviteRechercheDetailInstrumentIrd")
public class ProjetActiviteRechercheDetailInstrumentIrdRestAdmin {

@Autowired
private ProjetActiviteRechercheDetailInstrumentIrdAdminService projetActiviteRechercheDetailInstrumentIrdService;

@Autowired
private ProjetActiviteRechercheDetailInstrumentIrdConverter projetActiviteRechercheDetailInstrumentIrdConverter;


            @ApiOperation("Updates the specified  projetActiviteRechercheDetailInstrumentIrd")
            @PutMapping("/")
            public  ProjetActiviteRechercheDetailInstrumentIrdVo update(@RequestBody  ProjetActiviteRechercheDetailInstrumentIrdVo  projetActiviteRechercheDetailInstrumentIrdVo){
            ProjetActiviteRechercheDetailInstrumentIrd projetActiviteRechercheDetailInstrumentIrd = projetActiviteRechercheDetailInstrumentIrdConverter.toItem(projetActiviteRechercheDetailInstrumentIrdVo);
            projetActiviteRechercheDetailInstrumentIrd = projetActiviteRechercheDetailInstrumentIrdService.update(projetActiviteRechercheDetailInstrumentIrd);
            return projetActiviteRechercheDetailInstrumentIrdConverter.toVo(projetActiviteRechercheDetailInstrumentIrd);
            }

    @ApiOperation("Finds a list of all projetActiviteRechercheDetailInstrumentIrds")
    @GetMapping("/")
    public List<ProjetActiviteRechercheDetailInstrumentIrdVo> findAll(){
        return projetActiviteRechercheDetailInstrumentIrdConverter.toVo(projetActiviteRechercheDetailInstrumentIrdService.findAll());
    }

    @ApiOperation("Finds a projetActiviteRechercheDetailInstrumentIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ProjetActiviteRechercheDetailInstrumentIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return projetActiviteRechercheDetailInstrumentIrdConverter.toVo(projetActiviteRechercheDetailInstrumentIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search projetActiviteRechercheDetailInstrumentIrd by a specific criteria")
    @PostMapping("/search")
    public List<ProjetActiviteRechercheDetailInstrumentIrdVo> findByCriteria(@RequestBody ProjetActiviteRechercheDetailInstrumentIrdVo projetActiviteRechercheDetailInstrumentIrdVo){
        return projetActiviteRechercheDetailInstrumentIrdConverter.toVo(projetActiviteRechercheDetailInstrumentIrdService.findByCriteria(projetActiviteRechercheDetailInstrumentIrdVo));
        }

            @ApiOperation("Finds a projetActiviteRechercheDetailInstrumentIrd by id")
            @GetMapping("/id/{id}")
            public ProjetActiviteRechercheDetailInstrumentIrdVo findById(@PathVariable Long id){
            return projetActiviteRechercheDetailInstrumentIrdConverter.toVo(projetActiviteRechercheDetailInstrumentIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  projetActiviteRechercheDetailInstrumentIrd")
            @PostMapping("/")
            public ProjetActiviteRechercheDetailInstrumentIrdVo save(@RequestBody ProjetActiviteRechercheDetailInstrumentIrdVo projetActiviteRechercheDetailInstrumentIrdVo){
            ProjetActiviteRechercheDetailInstrumentIrd projetActiviteRechercheDetailInstrumentIrd = projetActiviteRechercheDetailInstrumentIrdConverter.toItem(projetActiviteRechercheDetailInstrumentIrdVo);
            projetActiviteRechercheDetailInstrumentIrd = projetActiviteRechercheDetailInstrumentIrdService.save(projetActiviteRechercheDetailInstrumentIrd);
            return projetActiviteRechercheDetailInstrumentIrdConverter.toVo(projetActiviteRechercheDetailInstrumentIrd);
            }

            @ApiOperation("Delete the specified projetActiviteRechercheDetailInstrumentIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody ProjetActiviteRechercheDetailInstrumentIrdVo projetActiviteRechercheDetailInstrumentIrdVo){
            ProjetActiviteRechercheDetailInstrumentIrd projetActiviteRechercheDetailInstrumentIrd = projetActiviteRechercheDetailInstrumentIrdConverter.toItem(projetActiviteRechercheDetailInstrumentIrdVo);
            return projetActiviteRechercheDetailInstrumentIrdService.delete(projetActiviteRechercheDetailInstrumentIrd);
            }

            @ApiOperation("Deletes a projetActiviteRechercheDetailInstrumentIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return projetActiviteRechercheDetailInstrumentIrdService.deleteById(id);
            }
        @ApiOperation("find by projetActiviteRechercheDetail id")
        @GetMapping("/projetActiviteRechercheDetail/id/{id}")
        public List<ProjetActiviteRechercheDetailInstrumentIrd> findByProjetActiviteRechercheDetailId(@PathVariable Long id){
        return projetActiviteRechercheDetailInstrumentIrdService.findByProjetActiviteRechercheDetailId(id);
        }

        @ApiOperation("delete by projetActiviteRechercheDetail id")
        @DeleteMapping("/projetActiviteRechercheDetail/id/{id}")
        public int deleteByProjetActiviteRechercheDetailId(@PathVariable Long id){
        return projetActiviteRechercheDetailInstrumentIrdService.deleteByProjetActiviteRechercheDetailId(id);
        }

        @ApiOperation("find by instrumentIrd code")
        @GetMapping("/instrumentIrd/code/{code}")
        public List<ProjetActiviteRechercheDetailInstrumentIrd> findByInstrumentIrdCode(@PathVariable String code){
        return projetActiviteRechercheDetailInstrumentIrdService.findByInstrumentIrdCode(code);
        }

        @ApiOperation("delete by instrumentIrd code")
        @DeleteMapping("/instrumentIrd/code/{code}")
        public int deleteByInstrumentIrdCode(@PathVariable String code){
        return projetActiviteRechercheDetailInstrumentIrdService.deleteByInstrumentIrdCode(code);
        }

        @ApiOperation("find by instrumentIrd id")
        @GetMapping("/instrumentIrd/id/{id}")
        public List<ProjetActiviteRechercheDetailInstrumentIrd> findByInstrumentIrdId(@PathVariable Long id){
        return projetActiviteRechercheDetailInstrumentIrdService.findByInstrumentIrdId(id);
        }

        @ApiOperation("delete by instrumentIrd id")
        @DeleteMapping("/instrumentIrd/id/{id}")
        public int deleteByInstrumentIrdId(@PathVariable Long id){
        return projetActiviteRechercheDetailInstrumentIrdService.deleteByInstrumentIrdId(id);
        }



            }
