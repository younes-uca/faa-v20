package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.VieInstitutionnelleDetailChercheurService;

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
import com.ird.faa.bean.VieInstitutionnelleDetail;
import com.ird.faa.ws.rest.provided.converter.VieInstitutionnelleDetailConverter;
import com.ird.faa.ws.rest.provided.vo.VieInstitutionnelleDetailVo;

@Api("Manages vieInstitutionnelleDetail services")
@RestController
@RequestMapping("api/chercheur/vieInstitutionnelleDetail")
public class VieInstitutionnelleDetailRestChercheur {

@Autowired
private VieInstitutionnelleDetailChercheurService vieInstitutionnelleDetailService;

@Autowired
private VieInstitutionnelleDetailConverter vieInstitutionnelleDetailConverter;


            @ApiOperation("Updates the specified  vieInstitutionnelleDetail")
            @PutMapping("/")
            public  VieInstitutionnelleDetailVo update(@RequestBody  VieInstitutionnelleDetailVo  vieInstitutionnelleDetailVo){
            VieInstitutionnelleDetail vieInstitutionnelleDetail = vieInstitutionnelleDetailConverter.toItem(vieInstitutionnelleDetailVo);
            vieInstitutionnelleDetail = vieInstitutionnelleDetailService.update(vieInstitutionnelleDetail);
            return vieInstitutionnelleDetailConverter.toVo(vieInstitutionnelleDetail);
            }

    @ApiOperation("Finds a list of all vieInstitutionnelleDetails")
    @GetMapping("/")
    public List<VieInstitutionnelleDetailVo> findAll(){
        return vieInstitutionnelleDetailConverter.toVo(vieInstitutionnelleDetailService.findAll());
    }

    @ApiOperation("Finds a vieInstitutionnelleDetail with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public VieInstitutionnelleDetailVo findByIdWithAssociatedList(@PathVariable Long id){
    return vieInstitutionnelleDetailConverter.toVo(vieInstitutionnelleDetailService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search vieInstitutionnelleDetail by a specific criteria")
    @PostMapping("/search")
    public List<VieInstitutionnelleDetailVo> findByCriteria(@RequestBody VieInstitutionnelleDetailVo vieInstitutionnelleDetailVo){
        return vieInstitutionnelleDetailConverter.toVo(vieInstitutionnelleDetailService.findByCriteria(vieInstitutionnelleDetailVo));
        }

            @ApiOperation("Finds a vieInstitutionnelleDetail by id")
            @GetMapping("/id/{id}")
            public VieInstitutionnelleDetailVo findById(@PathVariable Long id){
            return vieInstitutionnelleDetailConverter.toVo(vieInstitutionnelleDetailService.findById(id));
            }

            @ApiOperation("Saves the specified  vieInstitutionnelleDetail")
            @PostMapping("/")
            public VieInstitutionnelleDetailVo save(@RequestBody VieInstitutionnelleDetailVo vieInstitutionnelleDetailVo){
            VieInstitutionnelleDetail vieInstitutionnelleDetail = vieInstitutionnelleDetailConverter.toItem(vieInstitutionnelleDetailVo);
            vieInstitutionnelleDetail = vieInstitutionnelleDetailService.save(vieInstitutionnelleDetail);
            return vieInstitutionnelleDetailConverter.toVo(vieInstitutionnelleDetail);
            }

            @ApiOperation("Delete the specified vieInstitutionnelleDetail")
            @DeleteMapping("/")
            public int delete(@RequestBody VieInstitutionnelleDetailVo vieInstitutionnelleDetailVo){
            VieInstitutionnelleDetail vieInstitutionnelleDetail = vieInstitutionnelleDetailConverter.toItem(vieInstitutionnelleDetailVo);
            return vieInstitutionnelleDetailService.delete(vieInstitutionnelleDetail);
            }

            @ApiOperation("Deletes a vieInstitutionnelleDetail by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return vieInstitutionnelleDetailService.deleteById(id);
            }
        @ApiOperation("find by typeInstance code")
        @GetMapping("/typeInstance/code/{code}")
        public List<VieInstitutionnelleDetail> findByTypeInstanceCode(@PathVariable String code){
        return vieInstitutionnelleDetailService.findByTypeInstanceCode(code);
        }

        @ApiOperation("delete by typeInstance code")
        @DeleteMapping("/typeInstance/code/{code}")
        public int deleteByTypeInstanceCode(@PathVariable String code){
        return vieInstitutionnelleDetailService.deleteByTypeInstanceCode(code);
        }

        @ApiOperation("find by typeInstance id")
        @GetMapping("/typeInstance/id/{id}")
        public List<VieInstitutionnelleDetail> findByTypeInstanceId(@PathVariable Long id){
        return vieInstitutionnelleDetailService.findByTypeInstanceId(id);
        }

        @ApiOperation("delete by typeInstance id")
        @DeleteMapping("/typeInstance/id/{id}")
        public int deleteByTypeInstanceId(@PathVariable Long id){
        return vieInstitutionnelleDetailService.deleteByTypeInstanceId(id);
        }

        @ApiOperation("find by structureIrd code")
        @GetMapping("/structureIrd/code/{code}")
        public List<VieInstitutionnelleDetail> findByStructureIrdCode(@PathVariable String code){
        return vieInstitutionnelleDetailService.findByStructureIrdCode(code);
        }

        @ApiOperation("delete by structureIrd code")
        @DeleteMapping("/structureIrd/code/{code}")
        public int deleteByStructureIrdCode(@PathVariable String code){
        return vieInstitutionnelleDetailService.deleteByStructureIrdCode(code);
        }

        @ApiOperation("find by structureIrd id")
        @GetMapping("/structureIrd/id/{id}")
        public List<VieInstitutionnelleDetail> findByStructureIrdId(@PathVariable Long id){
        return vieInstitutionnelleDetailService.findByStructureIrdId(id);
        }

        @ApiOperation("delete by structureIrd id")
        @DeleteMapping("/structureIrd/id/{id}")
        public int deleteByStructureIrdId(@PathVariable Long id){
        return vieInstitutionnelleDetailService.deleteByStructureIrdId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<VieInstitutionnelleDetail> findByPaysCode(@PathVariable String code){
        return vieInstitutionnelleDetailService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return vieInstitutionnelleDetailService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<VieInstitutionnelleDetail> findByPaysId(@PathVariable Long id){
        return vieInstitutionnelleDetailService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return vieInstitutionnelleDetailService.deleteByPaysId(id);
        }

        @ApiOperation("find by vieInstitutionnelle id")
        @GetMapping("/vieInstitutionnelle/id/{id}")
        public List<VieInstitutionnelleDetail> findByVieInstitutionnelleId(@PathVariable Long id){
        return vieInstitutionnelleDetailService.findByVieInstitutionnelleId(id);
        }

        @ApiOperation("delete by vieInstitutionnelle id")
        @DeleteMapping("/vieInstitutionnelle/id/{id}")
        public int deleteByVieInstitutionnelleId(@PathVariable Long id){
        return vieInstitutionnelleDetailService.deleteByVieInstitutionnelleId(id);
        }



            }
