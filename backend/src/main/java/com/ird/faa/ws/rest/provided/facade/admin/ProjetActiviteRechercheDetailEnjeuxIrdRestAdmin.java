package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.ProjetActiviteRechercheDetailEnjeuxIrdAdminService;

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
import com.ird.faa.bean.ProjetActiviteRechercheDetailEnjeuxIrd;
import com.ird.faa.ws.rest.provided.converter.ProjetActiviteRechercheDetailEnjeuxIrdConverter;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailEnjeuxIrdVo;

@Api("Manages projetActiviteRechercheDetailEnjeuxIrd services")
@RestController
@RequestMapping("api/admin/projetActiviteRechercheDetailEnjeuxIrd")
public class ProjetActiviteRechercheDetailEnjeuxIrdRestAdmin {

@Autowired
private ProjetActiviteRechercheDetailEnjeuxIrdAdminService projetActiviteRechercheDetailEnjeuxIrdService;

@Autowired
private ProjetActiviteRechercheDetailEnjeuxIrdConverter projetActiviteRechercheDetailEnjeuxIrdConverter;


            @ApiOperation("Updates the specified  projetActiviteRechercheDetailEnjeuxIrd")
            @PutMapping("/")
            public  ProjetActiviteRechercheDetailEnjeuxIrdVo update(@RequestBody  ProjetActiviteRechercheDetailEnjeuxIrdVo  projetActiviteRechercheDetailEnjeuxIrdVo){
            ProjetActiviteRechercheDetailEnjeuxIrd projetActiviteRechercheDetailEnjeuxIrd = projetActiviteRechercheDetailEnjeuxIrdConverter.toItem(projetActiviteRechercheDetailEnjeuxIrdVo);
            projetActiviteRechercheDetailEnjeuxIrd = projetActiviteRechercheDetailEnjeuxIrdService.update(projetActiviteRechercheDetailEnjeuxIrd);
            return projetActiviteRechercheDetailEnjeuxIrdConverter.toVo(projetActiviteRechercheDetailEnjeuxIrd);
            }

    @ApiOperation("Finds a list of all projetActiviteRechercheDetailEnjeuxIrds")
    @GetMapping("/")
    public List<ProjetActiviteRechercheDetailEnjeuxIrdVo> findAll(){
        return projetActiviteRechercheDetailEnjeuxIrdConverter.toVo(projetActiviteRechercheDetailEnjeuxIrdService.findAll());
    }

    @ApiOperation("Finds a projetActiviteRechercheDetailEnjeuxIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ProjetActiviteRechercheDetailEnjeuxIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return projetActiviteRechercheDetailEnjeuxIrdConverter.toVo(projetActiviteRechercheDetailEnjeuxIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search projetActiviteRechercheDetailEnjeuxIrd by a specific criteria")
    @PostMapping("/search")
    public List<ProjetActiviteRechercheDetailEnjeuxIrdVo> findByCriteria(@RequestBody ProjetActiviteRechercheDetailEnjeuxIrdVo projetActiviteRechercheDetailEnjeuxIrdVo){
        return projetActiviteRechercheDetailEnjeuxIrdConverter.toVo(projetActiviteRechercheDetailEnjeuxIrdService.findByCriteria(projetActiviteRechercheDetailEnjeuxIrdVo));
        }

            @ApiOperation("Finds a projetActiviteRechercheDetailEnjeuxIrd by id")
            @GetMapping("/id/{id}")
            public ProjetActiviteRechercheDetailEnjeuxIrdVo findById(@PathVariable Long id){
            return projetActiviteRechercheDetailEnjeuxIrdConverter.toVo(projetActiviteRechercheDetailEnjeuxIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  projetActiviteRechercheDetailEnjeuxIrd")
            @PostMapping("/")
            public ProjetActiviteRechercheDetailEnjeuxIrdVo save(@RequestBody ProjetActiviteRechercheDetailEnjeuxIrdVo projetActiviteRechercheDetailEnjeuxIrdVo){
            ProjetActiviteRechercheDetailEnjeuxIrd projetActiviteRechercheDetailEnjeuxIrd = projetActiviteRechercheDetailEnjeuxIrdConverter.toItem(projetActiviteRechercheDetailEnjeuxIrdVo);
            projetActiviteRechercheDetailEnjeuxIrd = projetActiviteRechercheDetailEnjeuxIrdService.save(projetActiviteRechercheDetailEnjeuxIrd);
            return projetActiviteRechercheDetailEnjeuxIrdConverter.toVo(projetActiviteRechercheDetailEnjeuxIrd);
            }

            @ApiOperation("Delete the specified projetActiviteRechercheDetailEnjeuxIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody ProjetActiviteRechercheDetailEnjeuxIrdVo projetActiviteRechercheDetailEnjeuxIrdVo){
            ProjetActiviteRechercheDetailEnjeuxIrd projetActiviteRechercheDetailEnjeuxIrd = projetActiviteRechercheDetailEnjeuxIrdConverter.toItem(projetActiviteRechercheDetailEnjeuxIrdVo);
            return projetActiviteRechercheDetailEnjeuxIrdService.delete(projetActiviteRechercheDetailEnjeuxIrd);
            }

            @ApiOperation("Deletes a projetActiviteRechercheDetailEnjeuxIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return projetActiviteRechercheDetailEnjeuxIrdService.deleteById(id);
            }
        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<ProjetActiviteRechercheDetailEnjeuxIrd> findByEnjeuxIrdCode(@PathVariable String code){
        return projetActiviteRechercheDetailEnjeuxIrdService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return projetActiviteRechercheDetailEnjeuxIrdService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<ProjetActiviteRechercheDetailEnjeuxIrd> findByEnjeuxIrdId(@PathVariable Long id){
        return projetActiviteRechercheDetailEnjeuxIrdService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return projetActiviteRechercheDetailEnjeuxIrdService.deleteByEnjeuxIrdId(id);
        }

        @ApiOperation("find by projetActiviteRechercheDetail id")
        @GetMapping("/projetActiviteRechercheDetail/id/{id}")
        public List<ProjetActiviteRechercheDetailEnjeuxIrd> findByProjetActiviteRechercheDetailId(@PathVariable Long id){
        return projetActiviteRechercheDetailEnjeuxIrdService.findByProjetActiviteRechercheDetailId(id);
        }

        @ApiOperation("delete by projetActiviteRechercheDetail id")
        @DeleteMapping("/projetActiviteRechercheDetail/id/{id}")
        public int deleteByProjetActiviteRechercheDetailId(@PathVariable Long id){
        return projetActiviteRechercheDetailEnjeuxIrdService.deleteByProjetActiviteRechercheDetailId(id);
        }



            }
