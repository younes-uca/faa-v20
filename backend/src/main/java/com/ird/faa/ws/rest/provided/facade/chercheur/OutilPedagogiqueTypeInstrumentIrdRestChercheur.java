package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.OutilPedagogiqueTypeInstrumentIrdChercheurService;

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
import com.ird.faa.bean.OutilPedagogiqueTypeInstrumentIrd;
import com.ird.faa.ws.rest.provided.converter.OutilPedagogiqueTypeInstrumentIrdConverter;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueTypeInstrumentIrdVo;

@Api("Manages outilPedagogiqueTypeInstrumentIrd services")
@RestController
@RequestMapping("api/chercheur/outilPedagogiqueTypeInstrumentIrd")
public class OutilPedagogiqueTypeInstrumentIrdRestChercheur {

@Autowired
private OutilPedagogiqueTypeInstrumentIrdChercheurService outilPedagogiqueTypeInstrumentIrdService;

@Autowired
private OutilPedagogiqueTypeInstrumentIrdConverter outilPedagogiqueTypeInstrumentIrdConverter;


            @ApiOperation("Updates the specified  outilPedagogiqueTypeInstrumentIrd")
            @PutMapping("/")
            public  OutilPedagogiqueTypeInstrumentIrdVo update(@RequestBody  OutilPedagogiqueTypeInstrumentIrdVo  outilPedagogiqueTypeInstrumentIrdVo){
            OutilPedagogiqueTypeInstrumentIrd outilPedagogiqueTypeInstrumentIrd = outilPedagogiqueTypeInstrumentIrdConverter.toItem(outilPedagogiqueTypeInstrumentIrdVo);
            outilPedagogiqueTypeInstrumentIrd = outilPedagogiqueTypeInstrumentIrdService.update(outilPedagogiqueTypeInstrumentIrd);
            return outilPedagogiqueTypeInstrumentIrdConverter.toVo(outilPedagogiqueTypeInstrumentIrd);
            }

    @ApiOperation("Finds a list of all outilPedagogiqueTypeInstrumentIrds")
    @GetMapping("/")
    public List<OutilPedagogiqueTypeInstrumentIrdVo> findAll(){
        return outilPedagogiqueTypeInstrumentIrdConverter.toVo(outilPedagogiqueTypeInstrumentIrdService.findAll());
    }

    @ApiOperation("Finds a outilPedagogiqueTypeInstrumentIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public OutilPedagogiqueTypeInstrumentIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return outilPedagogiqueTypeInstrumentIrdConverter.toVo(outilPedagogiqueTypeInstrumentIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search outilPedagogiqueTypeInstrumentIrd by a specific criteria")
    @PostMapping("/search")
    public List<OutilPedagogiqueTypeInstrumentIrdVo> findByCriteria(@RequestBody OutilPedagogiqueTypeInstrumentIrdVo outilPedagogiqueTypeInstrumentIrdVo){
        return outilPedagogiqueTypeInstrumentIrdConverter.toVo(outilPedagogiqueTypeInstrumentIrdService.findByCriteria(outilPedagogiqueTypeInstrumentIrdVo));
        }

            @ApiOperation("Finds a outilPedagogiqueTypeInstrumentIrd by id")
            @GetMapping("/id/{id}")
            public OutilPedagogiqueTypeInstrumentIrdVo findById(@PathVariable Long id){
            return outilPedagogiqueTypeInstrumentIrdConverter.toVo(outilPedagogiqueTypeInstrumentIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  outilPedagogiqueTypeInstrumentIrd")
            @PostMapping("/")
            public OutilPedagogiqueTypeInstrumentIrdVo save(@RequestBody OutilPedagogiqueTypeInstrumentIrdVo outilPedagogiqueTypeInstrumentIrdVo){
            OutilPedagogiqueTypeInstrumentIrd outilPedagogiqueTypeInstrumentIrd = outilPedagogiqueTypeInstrumentIrdConverter.toItem(outilPedagogiqueTypeInstrumentIrdVo);
            outilPedagogiqueTypeInstrumentIrd = outilPedagogiqueTypeInstrumentIrdService.save(outilPedagogiqueTypeInstrumentIrd);
            return outilPedagogiqueTypeInstrumentIrdConverter.toVo(outilPedagogiqueTypeInstrumentIrd);
            }

            @ApiOperation("Delete the specified outilPedagogiqueTypeInstrumentIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody OutilPedagogiqueTypeInstrumentIrdVo outilPedagogiqueTypeInstrumentIrdVo){
            OutilPedagogiqueTypeInstrumentIrd outilPedagogiqueTypeInstrumentIrd = outilPedagogiqueTypeInstrumentIrdConverter.toItem(outilPedagogiqueTypeInstrumentIrdVo);
            return outilPedagogiqueTypeInstrumentIrdService.delete(outilPedagogiqueTypeInstrumentIrd);
            }

            @ApiOperation("Deletes a outilPedagogiqueTypeInstrumentIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return outilPedagogiqueTypeInstrumentIrdService.deleteById(id);
            }
        @ApiOperation("find by typeInstrumentIrd code")
        @GetMapping("/typeInstrumentIrd/code/{code}")
        public List<OutilPedagogiqueTypeInstrumentIrd> findByTypeInstrumentIrdCode(@PathVariable String code){
        return outilPedagogiqueTypeInstrumentIrdService.findByTypeInstrumentIrdCode(code);
        }

        @ApiOperation("delete by typeInstrumentIrd code")
        @DeleteMapping("/typeInstrumentIrd/code/{code}")
        public int deleteByTypeInstrumentIrdCode(@PathVariable String code){
        return outilPedagogiqueTypeInstrumentIrdService.deleteByTypeInstrumentIrdCode(code);
        }

        @ApiOperation("find by typeInstrumentIrd id")
        @GetMapping("/typeInstrumentIrd/id/{id}")
        public List<OutilPedagogiqueTypeInstrumentIrd> findByTypeInstrumentIrdId(@PathVariable Long id){
        return outilPedagogiqueTypeInstrumentIrdService.findByTypeInstrumentIrdId(id);
        }

        @ApiOperation("delete by typeInstrumentIrd id")
        @DeleteMapping("/typeInstrumentIrd/id/{id}")
        public int deleteByTypeInstrumentIrdId(@PathVariable Long id){
        return outilPedagogiqueTypeInstrumentIrdService.deleteByTypeInstrumentIrdId(id);
        }

        @ApiOperation("find by outilPedagogique id")
        @GetMapping("/outilPedagogique/id/{id}")
        public List<OutilPedagogiqueTypeInstrumentIrd> findByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiqueTypeInstrumentIrdService.findByOutilPedagogiqueId(id);
        }

        @ApiOperation("delete by outilPedagogique id")
        @DeleteMapping("/outilPedagogique/id/{id}")
        public int deleteByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiqueTypeInstrumentIrdService.deleteByOutilPedagogiqueId(id);
        }



            }
