package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ResponsabilitePedagogiqueEnjeuxIrdChercheurService;

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
import com.ird.faa.bean.ResponsabilitePedagogiqueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.converter.ResponsabilitePedagogiqueEnjeuxIrdConverter;
import com.ird.faa.ws.rest.provided.vo.ResponsabilitePedagogiqueEnjeuxIrdVo;

@Api("Manages responsabilitePedagogiqueEnjeuxIrd services")
@RestController
@RequestMapping("api/chercheur/responsabilitePedagogiqueEnjeuxIrd")
public class ResponsabilitePedagogiqueEnjeuxIrdRestChercheur {

@Autowired
private ResponsabilitePedagogiqueEnjeuxIrdChercheurService responsabilitePedagogiqueEnjeuxIrdService;

@Autowired
private ResponsabilitePedagogiqueEnjeuxIrdConverter responsabilitePedagogiqueEnjeuxIrdConverter;


            @ApiOperation("Updates the specified  responsabilitePedagogiqueEnjeuxIrd")
            @PutMapping("/")
            public  ResponsabilitePedagogiqueEnjeuxIrdVo update(@RequestBody  ResponsabilitePedagogiqueEnjeuxIrdVo  responsabilitePedagogiqueEnjeuxIrdVo){
            ResponsabilitePedagogiqueEnjeuxIrd responsabilitePedagogiqueEnjeuxIrd = responsabilitePedagogiqueEnjeuxIrdConverter.toItem(responsabilitePedagogiqueEnjeuxIrdVo);
            responsabilitePedagogiqueEnjeuxIrd = responsabilitePedagogiqueEnjeuxIrdService.update(responsabilitePedagogiqueEnjeuxIrd);
            return responsabilitePedagogiqueEnjeuxIrdConverter.toVo(responsabilitePedagogiqueEnjeuxIrd);
            }

    @ApiOperation("Finds a list of all responsabilitePedagogiqueEnjeuxIrds")
    @GetMapping("/")
    public List<ResponsabilitePedagogiqueEnjeuxIrdVo> findAll(){
        return responsabilitePedagogiqueEnjeuxIrdConverter.toVo(responsabilitePedagogiqueEnjeuxIrdService.findAll());
    }

    @ApiOperation("Finds a responsabilitePedagogiqueEnjeuxIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ResponsabilitePedagogiqueEnjeuxIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return responsabilitePedagogiqueEnjeuxIrdConverter.toVo(responsabilitePedagogiqueEnjeuxIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search responsabilitePedagogiqueEnjeuxIrd by a specific criteria")
    @PostMapping("/search")
    public List<ResponsabilitePedagogiqueEnjeuxIrdVo> findByCriteria(@RequestBody ResponsabilitePedagogiqueEnjeuxIrdVo responsabilitePedagogiqueEnjeuxIrdVo){
        return responsabilitePedagogiqueEnjeuxIrdConverter.toVo(responsabilitePedagogiqueEnjeuxIrdService.findByCriteria(responsabilitePedagogiqueEnjeuxIrdVo));
        }

            @ApiOperation("Finds a responsabilitePedagogiqueEnjeuxIrd by id")
            @GetMapping("/id/{id}")
            public ResponsabilitePedagogiqueEnjeuxIrdVo findById(@PathVariable Long id){
            return responsabilitePedagogiqueEnjeuxIrdConverter.toVo(responsabilitePedagogiqueEnjeuxIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  responsabilitePedagogiqueEnjeuxIrd")
            @PostMapping("/")
            public ResponsabilitePedagogiqueEnjeuxIrdVo save(@RequestBody ResponsabilitePedagogiqueEnjeuxIrdVo responsabilitePedagogiqueEnjeuxIrdVo){
            ResponsabilitePedagogiqueEnjeuxIrd responsabilitePedagogiqueEnjeuxIrd = responsabilitePedagogiqueEnjeuxIrdConverter.toItem(responsabilitePedagogiqueEnjeuxIrdVo);
            responsabilitePedagogiqueEnjeuxIrd = responsabilitePedagogiqueEnjeuxIrdService.save(responsabilitePedagogiqueEnjeuxIrd);
            return responsabilitePedagogiqueEnjeuxIrdConverter.toVo(responsabilitePedagogiqueEnjeuxIrd);
            }

            @ApiOperation("Delete the specified responsabilitePedagogiqueEnjeuxIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody ResponsabilitePedagogiqueEnjeuxIrdVo responsabilitePedagogiqueEnjeuxIrdVo){
            ResponsabilitePedagogiqueEnjeuxIrd responsabilitePedagogiqueEnjeuxIrd = responsabilitePedagogiqueEnjeuxIrdConverter.toItem(responsabilitePedagogiqueEnjeuxIrdVo);
            return responsabilitePedagogiqueEnjeuxIrdService.delete(responsabilitePedagogiqueEnjeuxIrd);
            }

            @ApiOperation("Deletes a responsabilitePedagogiqueEnjeuxIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return responsabilitePedagogiqueEnjeuxIrdService.deleteById(id);
            }
        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<ResponsabilitePedagogiqueEnjeuxIrd> findByEnjeuxIrdCode(@PathVariable String code){
        return responsabilitePedagogiqueEnjeuxIrdService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return responsabilitePedagogiqueEnjeuxIrdService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<ResponsabilitePedagogiqueEnjeuxIrd> findByEnjeuxIrdId(@PathVariable Long id){
        return responsabilitePedagogiqueEnjeuxIrdService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return responsabilitePedagogiqueEnjeuxIrdService.deleteByEnjeuxIrdId(id);
        }

        @ApiOperation("find by responsabilitePedagogique id")
        @GetMapping("/responsabilitePedagogique/id/{id}")
        public List<ResponsabilitePedagogiqueEnjeuxIrd> findByResponsabilitePedagogiqueId(@PathVariable Long id){
        return responsabilitePedagogiqueEnjeuxIrdService.findByResponsabilitePedagogiqueId(id);
        }

        @ApiOperation("delete by responsabilitePedagogique id")
        @DeleteMapping("/responsabilitePedagogique/id/{id}")
        public int deleteByResponsabilitePedagogiqueId(@PathVariable Long id){
        return responsabilitePedagogiqueEnjeuxIrdService.deleteByResponsabilitePedagogiqueId(id);
        }



            }
