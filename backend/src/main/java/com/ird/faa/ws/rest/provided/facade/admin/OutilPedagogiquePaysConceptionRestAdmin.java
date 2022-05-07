package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.OutilPedagogiquePaysConceptionAdminService;

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
import com.ird.faa.bean.OutilPedagogiquePaysConception;
import com.ird.faa.ws.rest.provided.converter.OutilPedagogiquePaysConceptionConverter;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiquePaysConceptionVo;

@Api("Manages outilPedagogiquePaysConception services")
@RestController
@RequestMapping("api/admin/outilPedagogiquePaysConception")
public class OutilPedagogiquePaysConceptionRestAdmin {

@Autowired
private OutilPedagogiquePaysConceptionAdminService outilPedagogiquePaysConceptionService;

@Autowired
private OutilPedagogiquePaysConceptionConverter outilPedagogiquePaysConceptionConverter;


            @ApiOperation("Updates the specified  outilPedagogiquePaysConception")
            @PutMapping("/")
            public  OutilPedagogiquePaysConceptionVo update(@RequestBody  OutilPedagogiquePaysConceptionVo  outilPedagogiquePaysConceptionVo){
            OutilPedagogiquePaysConception outilPedagogiquePaysConception = outilPedagogiquePaysConceptionConverter.toItem(outilPedagogiquePaysConceptionVo);
            outilPedagogiquePaysConception = outilPedagogiquePaysConceptionService.update(outilPedagogiquePaysConception);
            return outilPedagogiquePaysConceptionConverter.toVo(outilPedagogiquePaysConception);
            }

    @ApiOperation("Finds a list of all outilPedagogiquePaysConceptions")
    @GetMapping("/")
    public List<OutilPedagogiquePaysConceptionVo> findAll(){
        return outilPedagogiquePaysConceptionConverter.toVo(outilPedagogiquePaysConceptionService.findAll());
    }

    @ApiOperation("Finds a outilPedagogiquePaysConception with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public OutilPedagogiquePaysConceptionVo findByIdWithAssociatedList(@PathVariable Long id){
    return outilPedagogiquePaysConceptionConverter.toVo(outilPedagogiquePaysConceptionService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search outilPedagogiquePaysConception by a specific criteria")
    @PostMapping("/search")
    public List<OutilPedagogiquePaysConceptionVo> findByCriteria(@RequestBody OutilPedagogiquePaysConceptionVo outilPedagogiquePaysConceptionVo){
        return outilPedagogiquePaysConceptionConverter.toVo(outilPedagogiquePaysConceptionService.findByCriteria(outilPedagogiquePaysConceptionVo));
        }

            @ApiOperation("Finds a outilPedagogiquePaysConception by id")
            @GetMapping("/id/{id}")
            public OutilPedagogiquePaysConceptionVo findById(@PathVariable Long id){
            return outilPedagogiquePaysConceptionConverter.toVo(outilPedagogiquePaysConceptionService.findById(id));
            }

            @ApiOperation("Saves the specified  outilPedagogiquePaysConception")
            @PostMapping("/")
            public OutilPedagogiquePaysConceptionVo save(@RequestBody OutilPedagogiquePaysConceptionVo outilPedagogiquePaysConceptionVo){
            OutilPedagogiquePaysConception outilPedagogiquePaysConception = outilPedagogiquePaysConceptionConverter.toItem(outilPedagogiquePaysConceptionVo);
            outilPedagogiquePaysConception = outilPedagogiquePaysConceptionService.save(outilPedagogiquePaysConception);
            return outilPedagogiquePaysConceptionConverter.toVo(outilPedagogiquePaysConception);
            }

            @ApiOperation("Delete the specified outilPedagogiquePaysConception")
            @DeleteMapping("/")
            public int delete(@RequestBody OutilPedagogiquePaysConceptionVo outilPedagogiquePaysConceptionVo){
            OutilPedagogiquePaysConception outilPedagogiquePaysConception = outilPedagogiquePaysConceptionConverter.toItem(outilPedagogiquePaysConceptionVo);
            return outilPedagogiquePaysConceptionService.delete(outilPedagogiquePaysConception);
            }

            @ApiOperation("Deletes a outilPedagogiquePaysConception by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return outilPedagogiquePaysConceptionService.deleteById(id);
            }
        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<OutilPedagogiquePaysConception> findByPaysCode(@PathVariable String code){
        return outilPedagogiquePaysConceptionService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return outilPedagogiquePaysConceptionService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<OutilPedagogiquePaysConception> findByPaysId(@PathVariable Long id){
        return outilPedagogiquePaysConceptionService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return outilPedagogiquePaysConceptionService.deleteByPaysId(id);
        }

        @ApiOperation("find by outilPedagogique id")
        @GetMapping("/outilPedagogique/id/{id}")
        public List<OutilPedagogiquePaysConception> findByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiquePaysConceptionService.findByOutilPedagogiqueId(id);
        }

        @ApiOperation("delete by outilPedagogique id")
        @DeleteMapping("/outilPedagogique/id/{id}")
        public int deleteByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiquePaysConceptionService.deleteByOutilPedagogiqueId(id);
        }



            }
