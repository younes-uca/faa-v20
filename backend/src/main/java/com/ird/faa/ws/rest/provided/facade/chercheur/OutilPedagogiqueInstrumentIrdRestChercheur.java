package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.OutilPedagogiqueInstrumentIrdChercheurService;

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
import com.ird.faa.bean.OutilPedagogiqueInstrumentIrd;
import com.ird.faa.ws.rest.provided.converter.OutilPedagogiqueInstrumentIrdConverter;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueInstrumentIrdVo;

@Api("Manages outilPedagogiqueInstrumentIrd services")
@RestController
@RequestMapping("api/chercheur/outilPedagogiqueInstrumentIrd")
public class OutilPedagogiqueInstrumentIrdRestChercheur {

@Autowired
private OutilPedagogiqueInstrumentIrdChercheurService outilPedagogiqueInstrumentIrdService;

@Autowired
private OutilPedagogiqueInstrumentIrdConverter outilPedagogiqueInstrumentIrdConverter;


            @ApiOperation("Updates the specified  outilPedagogiqueInstrumentIrd")
            @PutMapping("/")
            public  OutilPedagogiqueInstrumentIrdVo update(@RequestBody  OutilPedagogiqueInstrumentIrdVo  outilPedagogiqueInstrumentIrdVo){
            OutilPedagogiqueInstrumentIrd outilPedagogiqueInstrumentIrd = outilPedagogiqueInstrumentIrdConverter.toItem(outilPedagogiqueInstrumentIrdVo);
            outilPedagogiqueInstrumentIrd = outilPedagogiqueInstrumentIrdService.update(outilPedagogiqueInstrumentIrd);
            return outilPedagogiqueInstrumentIrdConverter.toVo(outilPedagogiqueInstrumentIrd);
            }

    @ApiOperation("Finds a list of all outilPedagogiqueInstrumentIrds")
    @GetMapping("/")
    public List<OutilPedagogiqueInstrumentIrdVo> findAll(){
        return outilPedagogiqueInstrumentIrdConverter.toVo(outilPedagogiqueInstrumentIrdService.findAll());
    }

    @ApiOperation("Finds a outilPedagogiqueInstrumentIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public OutilPedagogiqueInstrumentIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return outilPedagogiqueInstrumentIrdConverter.toVo(outilPedagogiqueInstrumentIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search outilPedagogiqueInstrumentIrd by a specific criteria")
    @PostMapping("/search")
    public List<OutilPedagogiqueInstrumentIrdVo> findByCriteria(@RequestBody OutilPedagogiqueInstrumentIrdVo outilPedagogiqueInstrumentIrdVo){
        return outilPedagogiqueInstrumentIrdConverter.toVo(outilPedagogiqueInstrumentIrdService.findByCriteria(outilPedagogiqueInstrumentIrdVo));
        }

            @ApiOperation("Finds a outilPedagogiqueInstrumentIrd by id")
            @GetMapping("/id/{id}")
            public OutilPedagogiqueInstrumentIrdVo findById(@PathVariable Long id){
            return outilPedagogiqueInstrumentIrdConverter.toVo(outilPedagogiqueInstrumentIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  outilPedagogiqueInstrumentIrd")
            @PostMapping("/")
            public OutilPedagogiqueInstrumentIrdVo save(@RequestBody OutilPedagogiqueInstrumentIrdVo outilPedagogiqueInstrumentIrdVo){
            OutilPedagogiqueInstrumentIrd outilPedagogiqueInstrumentIrd = outilPedagogiqueInstrumentIrdConverter.toItem(outilPedagogiqueInstrumentIrdVo);
            outilPedagogiqueInstrumentIrd = outilPedagogiqueInstrumentIrdService.save(outilPedagogiqueInstrumentIrd);
            return outilPedagogiqueInstrumentIrdConverter.toVo(outilPedagogiqueInstrumentIrd);
            }

            @ApiOperation("Delete the specified outilPedagogiqueInstrumentIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody OutilPedagogiqueInstrumentIrdVo outilPedagogiqueInstrumentIrdVo){
            OutilPedagogiqueInstrumentIrd outilPedagogiqueInstrumentIrd = outilPedagogiqueInstrumentIrdConverter.toItem(outilPedagogiqueInstrumentIrdVo);
            return outilPedagogiqueInstrumentIrdService.delete(outilPedagogiqueInstrumentIrd);
            }

            @ApiOperation("Deletes a outilPedagogiqueInstrumentIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return outilPedagogiqueInstrumentIrdService.deleteById(id);
            }
        @ApiOperation("find by instrumentIrd code")
        @GetMapping("/instrumentIrd/code/{code}")
        public List<OutilPedagogiqueInstrumentIrd> findByInstrumentIrdCode(@PathVariable String code){
        return outilPedagogiqueInstrumentIrdService.findByInstrumentIrdCode(code);
        }

        @ApiOperation("delete by instrumentIrd code")
        @DeleteMapping("/instrumentIrd/code/{code}")
        public int deleteByInstrumentIrdCode(@PathVariable String code){
        return outilPedagogiqueInstrumentIrdService.deleteByInstrumentIrdCode(code);
        }

        @ApiOperation("find by instrumentIrd id")
        @GetMapping("/instrumentIrd/id/{id}")
        public List<OutilPedagogiqueInstrumentIrd> findByInstrumentIrdId(@PathVariable Long id){
        return outilPedagogiqueInstrumentIrdService.findByInstrumentIrdId(id);
        }

        @ApiOperation("delete by instrumentIrd id")
        @DeleteMapping("/instrumentIrd/id/{id}")
        public int deleteByInstrumentIrdId(@PathVariable Long id){
        return outilPedagogiqueInstrumentIrdService.deleteByInstrumentIrdId(id);
        }

        @ApiOperation("find by outilPedagogique id")
        @GetMapping("/outilPedagogique/id/{id}")
        public List<OutilPedagogiqueInstrumentIrd> findByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiqueInstrumentIrdService.findByOutilPedagogiqueId(id);
        }

        @ApiOperation("delete by outilPedagogique id")
        @DeleteMapping("/outilPedagogique/id/{id}")
        public int deleteByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiqueInstrumentIrdService.deleteByOutilPedagogiqueId(id);
        }



            }
