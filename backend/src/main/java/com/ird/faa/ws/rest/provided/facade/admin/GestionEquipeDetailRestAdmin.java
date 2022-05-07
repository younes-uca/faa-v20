package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.GestionEquipeDetailAdminService;

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
import com.ird.faa.bean.GestionEquipeDetail;
import com.ird.faa.ws.rest.provided.converter.GestionEquipeDetailConverter;
import com.ird.faa.ws.rest.provided.vo.GestionEquipeDetailVo;

@Api("Manages gestionEquipeDetail services")
@RestController
@RequestMapping("api/admin/gestionEquipeDetail")
public class GestionEquipeDetailRestAdmin {

@Autowired
private GestionEquipeDetailAdminService gestionEquipeDetailService;

@Autowired
private GestionEquipeDetailConverter gestionEquipeDetailConverter;


            @ApiOperation("Updates the specified  gestionEquipeDetail")
            @PutMapping("/")
            public  GestionEquipeDetailVo update(@RequestBody  GestionEquipeDetailVo  gestionEquipeDetailVo){
            GestionEquipeDetail gestionEquipeDetail = gestionEquipeDetailConverter.toItem(gestionEquipeDetailVo);
            gestionEquipeDetail = gestionEquipeDetailService.update(gestionEquipeDetail);
            return gestionEquipeDetailConverter.toVo(gestionEquipeDetail);
            }

    @ApiOperation("Finds a list of all gestionEquipeDetails")
    @GetMapping("/")
    public List<GestionEquipeDetailVo> findAll(){
        return gestionEquipeDetailConverter.toVo(gestionEquipeDetailService.findAll());
    }

    @ApiOperation("Finds a gestionEquipeDetail with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public GestionEquipeDetailVo findByIdWithAssociatedList(@PathVariable Long id){
    return gestionEquipeDetailConverter.toVo(gestionEquipeDetailService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search gestionEquipeDetail by a specific criteria")
    @PostMapping("/search")
    public List<GestionEquipeDetailVo> findByCriteria(@RequestBody GestionEquipeDetailVo gestionEquipeDetailVo){
        return gestionEquipeDetailConverter.toVo(gestionEquipeDetailService.findByCriteria(gestionEquipeDetailVo));
        }

            @ApiOperation("Finds a gestionEquipeDetail by id")
            @GetMapping("/id/{id}")
            public GestionEquipeDetailVo findById(@PathVariable Long id){
            return gestionEquipeDetailConverter.toVo(gestionEquipeDetailService.findById(id));
            }

            @ApiOperation("Saves the specified  gestionEquipeDetail")
            @PostMapping("/")
            public GestionEquipeDetailVo save(@RequestBody GestionEquipeDetailVo gestionEquipeDetailVo){
            GestionEquipeDetail gestionEquipeDetail = gestionEquipeDetailConverter.toItem(gestionEquipeDetailVo);
            gestionEquipeDetail = gestionEquipeDetailService.save(gestionEquipeDetail);
            return gestionEquipeDetailConverter.toVo(gestionEquipeDetail);
            }

            @ApiOperation("Delete the specified gestionEquipeDetail")
            @DeleteMapping("/")
            public int delete(@RequestBody GestionEquipeDetailVo gestionEquipeDetailVo){
            GestionEquipeDetail gestionEquipeDetail = gestionEquipeDetailConverter.toItem(gestionEquipeDetailVo);
            return gestionEquipeDetailService.delete(gestionEquipeDetail);
            }

            @ApiOperation("Deletes a gestionEquipeDetail by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return gestionEquipeDetailService.deleteById(id);
            }
        @ApiOperation("find by gestionEquipe id")
        @GetMapping("/gestionEquipe/id/{id}")
        public List<GestionEquipeDetail> findByGestionEquipeId(@PathVariable Long id){
        return gestionEquipeDetailService.findByGestionEquipeId(id);
        }

        @ApiOperation("delete by gestionEquipe id")
        @DeleteMapping("/gestionEquipe/id/{id}")
        public int deleteByGestionEquipeId(@PathVariable Long id){
        return gestionEquipeDetailService.deleteByGestionEquipeId(id);
        }



            }
