package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EtablissementConsultanceScientifiquePonctuelleAdminService;

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
import com.ird.faa.bean.EtablissementConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.converter.EtablissementConsultanceScientifiquePonctuelleConverter;
import com.ird.faa.ws.rest.provided.vo.EtablissementConsultanceScientifiquePonctuelleVo;

@Api("Manages etablissementConsultanceScientifiquePonctuelle services")
@RestController
@RequestMapping("api/admin/etablissementConsultanceScientifiquePonctuelle")
public class EtablissementConsultanceScientifiquePonctuelleRestAdmin {

@Autowired
private EtablissementConsultanceScientifiquePonctuelleAdminService etablissementConsultanceScientifiquePonctuelleService;

@Autowired
private EtablissementConsultanceScientifiquePonctuelleConverter etablissementConsultanceScientifiquePonctuelleConverter;


            @ApiOperation("Updates the specified  etablissementConsultanceScientifiquePonctuelle")
            @PutMapping("/")
            public  EtablissementConsultanceScientifiquePonctuelleVo update(@RequestBody  EtablissementConsultanceScientifiquePonctuelleVo  etablissementConsultanceScientifiquePonctuelleVo){
            EtablissementConsultanceScientifiquePonctuelle etablissementConsultanceScientifiquePonctuelle = etablissementConsultanceScientifiquePonctuelleConverter.toItem(etablissementConsultanceScientifiquePonctuelleVo);
            etablissementConsultanceScientifiquePonctuelle = etablissementConsultanceScientifiquePonctuelleService.update(etablissementConsultanceScientifiquePonctuelle);
            return etablissementConsultanceScientifiquePonctuelleConverter.toVo(etablissementConsultanceScientifiquePonctuelle);
            }

    @ApiOperation("Finds a list of all etablissementConsultanceScientifiquePonctuelles")
    @GetMapping("/")
    public List<EtablissementConsultanceScientifiquePonctuelleVo> findAll(){
        return etablissementConsultanceScientifiquePonctuelleConverter.toVo(etablissementConsultanceScientifiquePonctuelleService.findAll());
    }

    @ApiOperation("Finds a etablissementConsultanceScientifiquePonctuelle with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EtablissementConsultanceScientifiquePonctuelleVo findByIdWithAssociatedList(@PathVariable Long id){
    return etablissementConsultanceScientifiquePonctuelleConverter.toVo(etablissementConsultanceScientifiquePonctuelleService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search etablissementConsultanceScientifiquePonctuelle by a specific criteria")
    @PostMapping("/search")
    public List<EtablissementConsultanceScientifiquePonctuelleVo> findByCriteria(@RequestBody EtablissementConsultanceScientifiquePonctuelleVo etablissementConsultanceScientifiquePonctuelleVo){
        return etablissementConsultanceScientifiquePonctuelleConverter.toVo(etablissementConsultanceScientifiquePonctuelleService.findByCriteria(etablissementConsultanceScientifiquePonctuelleVo));
        }

            @ApiOperation("Finds a etablissementConsultanceScientifiquePonctuelle by id")
            @GetMapping("/id/{id}")
            public EtablissementConsultanceScientifiquePonctuelleVo findById(@PathVariable Long id){
            return etablissementConsultanceScientifiquePonctuelleConverter.toVo(etablissementConsultanceScientifiquePonctuelleService.findById(id));
            }

            @ApiOperation("Saves the specified  etablissementConsultanceScientifiquePonctuelle")
            @PostMapping("/")
            public EtablissementConsultanceScientifiquePonctuelleVo save(@RequestBody EtablissementConsultanceScientifiquePonctuelleVo etablissementConsultanceScientifiquePonctuelleVo){
            EtablissementConsultanceScientifiquePonctuelle etablissementConsultanceScientifiquePonctuelle = etablissementConsultanceScientifiquePonctuelleConverter.toItem(etablissementConsultanceScientifiquePonctuelleVo);
            etablissementConsultanceScientifiquePonctuelle = etablissementConsultanceScientifiquePonctuelleService.save(etablissementConsultanceScientifiquePonctuelle);
            return etablissementConsultanceScientifiquePonctuelleConverter.toVo(etablissementConsultanceScientifiquePonctuelle);
            }

            @ApiOperation("Delete the specified etablissementConsultanceScientifiquePonctuelle")
            @DeleteMapping("/")
            public int delete(@RequestBody EtablissementConsultanceScientifiquePonctuelleVo etablissementConsultanceScientifiquePonctuelleVo){
            EtablissementConsultanceScientifiquePonctuelle etablissementConsultanceScientifiquePonctuelle = etablissementConsultanceScientifiquePonctuelleConverter.toItem(etablissementConsultanceScientifiquePonctuelleVo);
            return etablissementConsultanceScientifiquePonctuelleService.delete(etablissementConsultanceScientifiquePonctuelle);
            }

            @ApiOperation("Deletes a etablissementConsultanceScientifiquePonctuelle by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return etablissementConsultanceScientifiquePonctuelleService.deleteById(id);
            }
        @ApiOperation("find by consultanceScientifiquePonctuelle id")
        @GetMapping("/consultanceScientifiquePonctuelle/id/{id}")
        public List<EtablissementConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(@PathVariable Long id){
        return etablissementConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(id);
        }

        @ApiOperation("delete by consultanceScientifiquePonctuelle id")
        @DeleteMapping("/consultanceScientifiquePonctuelle/id/{id}")
        public int deleteByConsultanceScientifiquePonctuelleId(@PathVariable Long id){
        return etablissementConsultanceScientifiquePonctuelleService.deleteByConsultanceScientifiquePonctuelleId(id);
        }

        @ApiOperation("find by etablissement code")
        @GetMapping("/etablissement/code/{code}")
        public List<EtablissementConsultanceScientifiquePonctuelle> findByEtablissementCode(@PathVariable String code){
        return etablissementConsultanceScientifiquePonctuelleService.findByEtablissementCode(code);
        }

        @ApiOperation("delete by etablissement code")
        @DeleteMapping("/etablissement/code/{code}")
        public int deleteByEtablissementCode(@PathVariable String code){
        return etablissementConsultanceScientifiquePonctuelleService.deleteByEtablissementCode(code);
        }

        @ApiOperation("find by etablissement id")
        @GetMapping("/etablissement/id/{id}")
        public List<EtablissementConsultanceScientifiquePonctuelle> findByEtablissementId(@PathVariable Long id){
        return etablissementConsultanceScientifiquePonctuelleService.findByEtablissementId(id);
        }

        @ApiOperation("delete by etablissement id")
        @DeleteMapping("/etablissement/id/{id}")
        public int deleteByEtablissementId(@PathVariable Long id){
        return etablissementConsultanceScientifiquePonctuelleService.deleteByEtablissementId(id);
        }



            }
