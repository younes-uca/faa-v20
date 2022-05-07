package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.OutilPedagogiqueLangueAdminService;

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
import com.ird.faa.bean.OutilPedagogiqueLangue;
import com.ird.faa.ws.rest.provided.converter.OutilPedagogiqueLangueConverter;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueLangueVo;

@Api("Manages outilPedagogiqueLangue services")
@RestController
@RequestMapping("api/admin/outilPedagogiqueLangue")
public class OutilPedagogiqueLangueRestAdmin {

@Autowired
private OutilPedagogiqueLangueAdminService outilPedagogiqueLangueService;

@Autowired
private OutilPedagogiqueLangueConverter outilPedagogiqueLangueConverter;


            @ApiOperation("Updates the specified  outilPedagogiqueLangue")
            @PutMapping("/")
            public  OutilPedagogiqueLangueVo update(@RequestBody  OutilPedagogiqueLangueVo  outilPedagogiqueLangueVo){
            OutilPedagogiqueLangue outilPedagogiqueLangue = outilPedagogiqueLangueConverter.toItem(outilPedagogiqueLangueVo);
            outilPedagogiqueLangue = outilPedagogiqueLangueService.update(outilPedagogiqueLangue);
            return outilPedagogiqueLangueConverter.toVo(outilPedagogiqueLangue);
            }

    @ApiOperation("Finds a list of all outilPedagogiqueLangues")
    @GetMapping("/")
    public List<OutilPedagogiqueLangueVo> findAll(){
        return outilPedagogiqueLangueConverter.toVo(outilPedagogiqueLangueService.findAll());
    }

    @ApiOperation("Finds a outilPedagogiqueLangue with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public OutilPedagogiqueLangueVo findByIdWithAssociatedList(@PathVariable Long id){
    return outilPedagogiqueLangueConverter.toVo(outilPedagogiqueLangueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search outilPedagogiqueLangue by a specific criteria")
    @PostMapping("/search")
    public List<OutilPedagogiqueLangueVo> findByCriteria(@RequestBody OutilPedagogiqueLangueVo outilPedagogiqueLangueVo){
        return outilPedagogiqueLangueConverter.toVo(outilPedagogiqueLangueService.findByCriteria(outilPedagogiqueLangueVo));
        }

            @ApiOperation("Finds a outilPedagogiqueLangue by id")
            @GetMapping("/id/{id}")
            public OutilPedagogiqueLangueVo findById(@PathVariable Long id){
            return outilPedagogiqueLangueConverter.toVo(outilPedagogiqueLangueService.findById(id));
            }

            @ApiOperation("Saves the specified  outilPedagogiqueLangue")
            @PostMapping("/")
            public OutilPedagogiqueLangueVo save(@RequestBody OutilPedagogiqueLangueVo outilPedagogiqueLangueVo){
            OutilPedagogiqueLangue outilPedagogiqueLangue = outilPedagogiqueLangueConverter.toItem(outilPedagogiqueLangueVo);
            outilPedagogiqueLangue = outilPedagogiqueLangueService.save(outilPedagogiqueLangue);
            return outilPedagogiqueLangueConverter.toVo(outilPedagogiqueLangue);
            }

            @ApiOperation("Delete the specified outilPedagogiqueLangue")
            @DeleteMapping("/")
            public int delete(@RequestBody OutilPedagogiqueLangueVo outilPedagogiqueLangueVo){
            OutilPedagogiqueLangue outilPedagogiqueLangue = outilPedagogiqueLangueConverter.toItem(outilPedagogiqueLangueVo);
            return outilPedagogiqueLangueService.delete(outilPedagogiqueLangue);
            }

            @ApiOperation("Deletes a outilPedagogiqueLangue by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return outilPedagogiqueLangueService.deleteById(id);
            }
        @ApiOperation("find by langue code")
        @GetMapping("/langue/code/{code}")
        public List<OutilPedagogiqueLangue> findByLangueCode(@PathVariable String code){
        return outilPedagogiqueLangueService.findByLangueCode(code);
        }

        @ApiOperation("delete by langue code")
        @DeleteMapping("/langue/code/{code}")
        public int deleteByLangueCode(@PathVariable String code){
        return outilPedagogiqueLangueService.deleteByLangueCode(code);
        }

        @ApiOperation("find by langue id")
        @GetMapping("/langue/id/{id}")
        public List<OutilPedagogiqueLangue> findByLangueId(@PathVariable Long id){
        return outilPedagogiqueLangueService.findByLangueId(id);
        }

        @ApiOperation("delete by langue id")
        @DeleteMapping("/langue/id/{id}")
        public int deleteByLangueId(@PathVariable Long id){
        return outilPedagogiqueLangueService.deleteByLangueId(id);
        }

        @ApiOperation("find by outilPedagogique id")
        @GetMapping("/outilPedagogique/id/{id}")
        public List<OutilPedagogiqueLangue> findByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiqueLangueService.findByOutilPedagogiqueId(id);
        }

        @ApiOperation("delete by outilPedagogique id")
        @DeleteMapping("/outilPedagogique/id/{id}")
        public int deleteByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiqueLangueService.deleteByOutilPedagogiqueId(id);
        }



            }
