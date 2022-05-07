package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.OutilPedagogiqueEnjeuxIrdAdminService;

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
import com.ird.faa.bean.OutilPedagogiqueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.converter.OutilPedagogiqueEnjeuxIrdConverter;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueEnjeuxIrdVo;

@Api("Manages outilPedagogiqueEnjeuxIrd services")
@RestController
@RequestMapping("api/admin/outilPedagogiqueEnjeuxIrd")
public class OutilPedagogiqueEnjeuxIrdRestAdmin {

@Autowired
private OutilPedagogiqueEnjeuxIrdAdminService outilPedagogiqueEnjeuxIrdService;

@Autowired
private OutilPedagogiqueEnjeuxIrdConverter outilPedagogiqueEnjeuxIrdConverter;


            @ApiOperation("Updates the specified  outilPedagogiqueEnjeuxIrd")
            @PutMapping("/")
            public  OutilPedagogiqueEnjeuxIrdVo update(@RequestBody  OutilPedagogiqueEnjeuxIrdVo  outilPedagogiqueEnjeuxIrdVo){
            OutilPedagogiqueEnjeuxIrd outilPedagogiqueEnjeuxIrd = outilPedagogiqueEnjeuxIrdConverter.toItem(outilPedagogiqueEnjeuxIrdVo);
            outilPedagogiqueEnjeuxIrd = outilPedagogiqueEnjeuxIrdService.update(outilPedagogiqueEnjeuxIrd);
            return outilPedagogiqueEnjeuxIrdConverter.toVo(outilPedagogiqueEnjeuxIrd);
            }

    @ApiOperation("Finds a list of all outilPedagogiqueEnjeuxIrds")
    @GetMapping("/")
    public List<OutilPedagogiqueEnjeuxIrdVo> findAll(){
        return outilPedagogiqueEnjeuxIrdConverter.toVo(outilPedagogiqueEnjeuxIrdService.findAll());
    }

    @ApiOperation("Finds a outilPedagogiqueEnjeuxIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public OutilPedagogiqueEnjeuxIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return outilPedagogiqueEnjeuxIrdConverter.toVo(outilPedagogiqueEnjeuxIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search outilPedagogiqueEnjeuxIrd by a specific criteria")
    @PostMapping("/search")
    public List<OutilPedagogiqueEnjeuxIrdVo> findByCriteria(@RequestBody OutilPedagogiqueEnjeuxIrdVo outilPedagogiqueEnjeuxIrdVo){
        return outilPedagogiqueEnjeuxIrdConverter.toVo(outilPedagogiqueEnjeuxIrdService.findByCriteria(outilPedagogiqueEnjeuxIrdVo));
        }

            @ApiOperation("Finds a outilPedagogiqueEnjeuxIrd by id")
            @GetMapping("/id/{id}")
            public OutilPedagogiqueEnjeuxIrdVo findById(@PathVariable Long id){
            return outilPedagogiqueEnjeuxIrdConverter.toVo(outilPedagogiqueEnjeuxIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  outilPedagogiqueEnjeuxIrd")
            @PostMapping("/")
            public OutilPedagogiqueEnjeuxIrdVo save(@RequestBody OutilPedagogiqueEnjeuxIrdVo outilPedagogiqueEnjeuxIrdVo){
            OutilPedagogiqueEnjeuxIrd outilPedagogiqueEnjeuxIrd = outilPedagogiqueEnjeuxIrdConverter.toItem(outilPedagogiqueEnjeuxIrdVo);
            outilPedagogiqueEnjeuxIrd = outilPedagogiqueEnjeuxIrdService.save(outilPedagogiqueEnjeuxIrd);
            return outilPedagogiqueEnjeuxIrdConverter.toVo(outilPedagogiqueEnjeuxIrd);
            }

            @ApiOperation("Delete the specified outilPedagogiqueEnjeuxIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody OutilPedagogiqueEnjeuxIrdVo outilPedagogiqueEnjeuxIrdVo){
            OutilPedagogiqueEnjeuxIrd outilPedagogiqueEnjeuxIrd = outilPedagogiqueEnjeuxIrdConverter.toItem(outilPedagogiqueEnjeuxIrdVo);
            return outilPedagogiqueEnjeuxIrdService.delete(outilPedagogiqueEnjeuxIrd);
            }

            @ApiOperation("Deletes a outilPedagogiqueEnjeuxIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return outilPedagogiqueEnjeuxIrdService.deleteById(id);
            }
        @ApiOperation("find by outilPedagogique id")
        @GetMapping("/outilPedagogique/id/{id}")
        public List<OutilPedagogiqueEnjeuxIrd> findByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiqueEnjeuxIrdService.findByOutilPedagogiqueId(id);
        }

        @ApiOperation("delete by outilPedagogique id")
        @DeleteMapping("/outilPedagogique/id/{id}")
        public int deleteByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiqueEnjeuxIrdService.deleteByOutilPedagogiqueId(id);
        }

        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<OutilPedagogiqueEnjeuxIrd> findByEnjeuxIrdCode(@PathVariable String code){
        return outilPedagogiqueEnjeuxIrdService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return outilPedagogiqueEnjeuxIrdService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<OutilPedagogiqueEnjeuxIrd> findByEnjeuxIrdId(@PathVariable Long id){
        return outilPedagogiqueEnjeuxIrdService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return outilPedagogiqueEnjeuxIrdService.deleteByEnjeuxIrdId(id);
        }



            }
