package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.OutilPedagogiquePaysDiffusionChercheurService;

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
import com.ird.faa.bean.OutilPedagogiquePaysDiffusion;
import com.ird.faa.ws.rest.provided.converter.OutilPedagogiquePaysDiffusionConverter;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiquePaysDiffusionVo;

@Api("Manages outilPedagogiquePaysDiffusion services")
@RestController
@RequestMapping("api/chercheur/outilPedagogiquePaysDiffusion")
public class OutilPedagogiquePaysDiffusionRestChercheur {

@Autowired
private OutilPedagogiquePaysDiffusionChercheurService outilPedagogiquePaysDiffusionService;

@Autowired
private OutilPedagogiquePaysDiffusionConverter outilPedagogiquePaysDiffusionConverter;


            @ApiOperation("Updates the specified  outilPedagogiquePaysDiffusion")
            @PutMapping("/")
            public  OutilPedagogiquePaysDiffusionVo update(@RequestBody  OutilPedagogiquePaysDiffusionVo  outilPedagogiquePaysDiffusionVo){
            OutilPedagogiquePaysDiffusion outilPedagogiquePaysDiffusion = outilPedagogiquePaysDiffusionConverter.toItem(outilPedagogiquePaysDiffusionVo);
            outilPedagogiquePaysDiffusion = outilPedagogiquePaysDiffusionService.update(outilPedagogiquePaysDiffusion);
            return outilPedagogiquePaysDiffusionConverter.toVo(outilPedagogiquePaysDiffusion);
            }

    @ApiOperation("Finds a list of all outilPedagogiquePaysDiffusions")
    @GetMapping("/")
    public List<OutilPedagogiquePaysDiffusionVo> findAll(){
        return outilPedagogiquePaysDiffusionConverter.toVo(outilPedagogiquePaysDiffusionService.findAll());
    }

    @ApiOperation("Finds a outilPedagogiquePaysDiffusion with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public OutilPedagogiquePaysDiffusionVo findByIdWithAssociatedList(@PathVariable Long id){
    return outilPedagogiquePaysDiffusionConverter.toVo(outilPedagogiquePaysDiffusionService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search outilPedagogiquePaysDiffusion by a specific criteria")
    @PostMapping("/search")
    public List<OutilPedagogiquePaysDiffusionVo> findByCriteria(@RequestBody OutilPedagogiquePaysDiffusionVo outilPedagogiquePaysDiffusionVo){
        return outilPedagogiquePaysDiffusionConverter.toVo(outilPedagogiquePaysDiffusionService.findByCriteria(outilPedagogiquePaysDiffusionVo));
        }

            @ApiOperation("Finds a outilPedagogiquePaysDiffusion by id")
            @GetMapping("/id/{id}")
            public OutilPedagogiquePaysDiffusionVo findById(@PathVariable Long id){
            return outilPedagogiquePaysDiffusionConverter.toVo(outilPedagogiquePaysDiffusionService.findById(id));
            }

            @ApiOperation("Saves the specified  outilPedagogiquePaysDiffusion")
            @PostMapping("/")
            public OutilPedagogiquePaysDiffusionVo save(@RequestBody OutilPedagogiquePaysDiffusionVo outilPedagogiquePaysDiffusionVo){
            OutilPedagogiquePaysDiffusion outilPedagogiquePaysDiffusion = outilPedagogiquePaysDiffusionConverter.toItem(outilPedagogiquePaysDiffusionVo);
            outilPedagogiquePaysDiffusion = outilPedagogiquePaysDiffusionService.save(outilPedagogiquePaysDiffusion);
            return outilPedagogiquePaysDiffusionConverter.toVo(outilPedagogiquePaysDiffusion);
            }

            @ApiOperation("Delete the specified outilPedagogiquePaysDiffusion")
            @DeleteMapping("/")
            public int delete(@RequestBody OutilPedagogiquePaysDiffusionVo outilPedagogiquePaysDiffusionVo){
            OutilPedagogiquePaysDiffusion outilPedagogiquePaysDiffusion = outilPedagogiquePaysDiffusionConverter.toItem(outilPedagogiquePaysDiffusionVo);
            return outilPedagogiquePaysDiffusionService.delete(outilPedagogiquePaysDiffusion);
            }

            @ApiOperation("Deletes a outilPedagogiquePaysDiffusion by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return outilPedagogiquePaysDiffusionService.deleteById(id);
            }
        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<OutilPedagogiquePaysDiffusion> findByPaysCode(@PathVariable String code){
        return outilPedagogiquePaysDiffusionService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return outilPedagogiquePaysDiffusionService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<OutilPedagogiquePaysDiffusion> findByPaysId(@PathVariable Long id){
        return outilPedagogiquePaysDiffusionService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return outilPedagogiquePaysDiffusionService.deleteByPaysId(id);
        }

        @ApiOperation("find by outilPedagogique id")
        @GetMapping("/outilPedagogique/id/{id}")
        public List<OutilPedagogiquePaysDiffusion> findByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiquePaysDiffusionService.findByOutilPedagogiqueId(id);
        }

        @ApiOperation("delete by outilPedagogique id")
        @DeleteMapping("/outilPedagogique/id/{id}")
        public int deleteByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiquePaysDiffusionService.deleteByOutilPedagogiqueId(id);
        }



            }
