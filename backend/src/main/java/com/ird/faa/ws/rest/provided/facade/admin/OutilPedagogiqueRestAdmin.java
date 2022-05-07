package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.OutilPedagogiqueAdminService;

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
import com.ird.faa.bean.OutilPedagogique;
import com.ird.faa.ws.rest.provided.converter.OutilPedagogiqueConverter;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueVo;

@Api("Manages outilPedagogique services")
@RestController
@RequestMapping("api/admin/outilPedagogique")
public class OutilPedagogiqueRestAdmin {

@Autowired
private OutilPedagogiqueAdminService outilPedagogiqueService;

@Autowired
private OutilPedagogiqueConverter outilPedagogiqueConverter;


            @ApiOperation("Updates the specified  outilPedagogique")
            @PutMapping("/")
            public  OutilPedagogiqueVo update(@RequestBody  OutilPedagogiqueVo  outilPedagogiqueVo){
            OutilPedagogique outilPedagogique = outilPedagogiqueConverter.toItem(outilPedagogiqueVo);
            outilPedagogique = outilPedagogiqueService.update(outilPedagogique);
            return outilPedagogiqueConverter.toVo(outilPedagogique);
            }

    @ApiOperation("Finds a list of all outilPedagogiques")
    @GetMapping("/")
    public List<OutilPedagogiqueVo> findAll(){
        return outilPedagogiqueConverter.toVo(outilPedagogiqueService.findAll());
    }

    @ApiOperation("Finds a outilPedagogique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public OutilPedagogiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return outilPedagogiqueConverter.toVo(outilPedagogiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search outilPedagogique by a specific criteria")
    @PostMapping("/search")
    public List<OutilPedagogiqueVo> findByCriteria(@RequestBody OutilPedagogiqueVo outilPedagogiqueVo){
        return outilPedagogiqueConverter.toVo(outilPedagogiqueService.findByCriteria(outilPedagogiqueVo));
        }

            @ApiOperation("Finds a outilPedagogique by id")
            @GetMapping("/id/{id}")
            public OutilPedagogiqueVo findById(@PathVariable Long id){
            return outilPedagogiqueConverter.toVo(outilPedagogiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  outilPedagogique")
            @PostMapping("/")
            public OutilPedagogiqueVo save(@RequestBody OutilPedagogiqueVo outilPedagogiqueVo){
            OutilPedagogique outilPedagogique = outilPedagogiqueConverter.toItem(outilPedagogiqueVo);
            outilPedagogique = outilPedagogiqueService.save(outilPedagogique);
            return outilPedagogiqueConverter.toVo(outilPedagogique);
            }

            @ApiOperation("Delete the specified outilPedagogique")
            @DeleteMapping("/")
            public int delete(@RequestBody OutilPedagogiqueVo outilPedagogiqueVo){
            OutilPedagogique outilPedagogique = outilPedagogiqueConverter.toItem(outilPedagogiqueVo);
            return outilPedagogiqueService.delete(outilPedagogique);
            }

            @ApiOperation("Deletes a outilPedagogique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return outilPedagogiqueService.deleteById(id);
            }
        @ApiOperation("find by cultureScientifique id")
        @GetMapping("/cultureScientifique/id/{id}")
        public List<OutilPedagogique> findByCultureScientifiqueId(@PathVariable Long id){
        return outilPedagogiqueService.findByCultureScientifiqueId(id);
        }

        @ApiOperation("delete by cultureScientifique id")
        @DeleteMapping("/cultureScientifique/id/{id}")
        public int deleteByCultureScientifiqueId(@PathVariable Long id){
        return outilPedagogiqueService.deleteByCultureScientifiqueId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<OutilPedagogique> findByEtatEtapeCampagneCode(@PathVariable String code){
        return outilPedagogiqueService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return outilPedagogiqueService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<OutilPedagogique> findByEtatEtapeCampagneId(@PathVariable Long id){
        return outilPedagogiqueService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return outilPedagogiqueService.deleteByEtatEtapeCampagneId(id);
        }



            }
