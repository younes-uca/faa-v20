package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ResponsabilitePedagogiquePaysChercheurService;

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
import com.ird.faa.bean.ResponsabilitePedagogiquePays;
import com.ird.faa.ws.rest.provided.converter.ResponsabilitePedagogiquePaysConverter;
import com.ird.faa.ws.rest.provided.vo.ResponsabilitePedagogiquePaysVo;

@Api("Manages responsabilitePedagogiquePays services")
@RestController
@RequestMapping("api/chercheur/responsabilitePedagogiquePays")
public class ResponsabilitePedagogiquePaysRestChercheur {

@Autowired
private ResponsabilitePedagogiquePaysChercheurService responsabilitePedagogiquePaysService;

@Autowired
private ResponsabilitePedagogiquePaysConverter responsabilitePedagogiquePaysConverter;


            @ApiOperation("Updates the specified  responsabilitePedagogiquePays")
            @PutMapping("/")
            public  ResponsabilitePedagogiquePaysVo update(@RequestBody  ResponsabilitePedagogiquePaysVo  responsabilitePedagogiquePaysVo){
            ResponsabilitePedagogiquePays responsabilitePedagogiquePays = responsabilitePedagogiquePaysConverter.toItem(responsabilitePedagogiquePaysVo);
            responsabilitePedagogiquePays = responsabilitePedagogiquePaysService.update(responsabilitePedagogiquePays);
            return responsabilitePedagogiquePaysConverter.toVo(responsabilitePedagogiquePays);
            }

    @ApiOperation("Finds a list of all responsabilitePedagogiquePayss")
    @GetMapping("/")
    public List<ResponsabilitePedagogiquePaysVo> findAll(){
        return responsabilitePedagogiquePaysConverter.toVo(responsabilitePedagogiquePaysService.findAll());
    }

    @ApiOperation("Finds a responsabilitePedagogiquePays with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ResponsabilitePedagogiquePaysVo findByIdWithAssociatedList(@PathVariable Long id){
    return responsabilitePedagogiquePaysConverter.toVo(responsabilitePedagogiquePaysService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search responsabilitePedagogiquePays by a specific criteria")
    @PostMapping("/search")
    public List<ResponsabilitePedagogiquePaysVo> findByCriteria(@RequestBody ResponsabilitePedagogiquePaysVo responsabilitePedagogiquePaysVo){
        return responsabilitePedagogiquePaysConverter.toVo(responsabilitePedagogiquePaysService.findByCriteria(responsabilitePedagogiquePaysVo));
        }

            @ApiOperation("Finds a responsabilitePedagogiquePays by id")
            @GetMapping("/id/{id}")
            public ResponsabilitePedagogiquePaysVo findById(@PathVariable Long id){
            return responsabilitePedagogiquePaysConverter.toVo(responsabilitePedagogiquePaysService.findById(id));
            }

            @ApiOperation("Saves the specified  responsabilitePedagogiquePays")
            @PostMapping("/")
            public ResponsabilitePedagogiquePaysVo save(@RequestBody ResponsabilitePedagogiquePaysVo responsabilitePedagogiquePaysVo){
            ResponsabilitePedagogiquePays responsabilitePedagogiquePays = responsabilitePedagogiquePaysConverter.toItem(responsabilitePedagogiquePaysVo);
            responsabilitePedagogiquePays = responsabilitePedagogiquePaysService.save(responsabilitePedagogiquePays);
            return responsabilitePedagogiquePaysConverter.toVo(responsabilitePedagogiquePays);
            }

            @ApiOperation("Delete the specified responsabilitePedagogiquePays")
            @DeleteMapping("/")
            public int delete(@RequestBody ResponsabilitePedagogiquePaysVo responsabilitePedagogiquePaysVo){
            ResponsabilitePedagogiquePays responsabilitePedagogiquePays = responsabilitePedagogiquePaysConverter.toItem(responsabilitePedagogiquePaysVo);
            return responsabilitePedagogiquePaysService.delete(responsabilitePedagogiquePays);
            }

            @ApiOperation("Deletes a responsabilitePedagogiquePays by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return responsabilitePedagogiquePaysService.deleteById(id);
            }
        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<ResponsabilitePedagogiquePays> findByPaysCode(@PathVariable String code){
        return responsabilitePedagogiquePaysService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return responsabilitePedagogiquePaysService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<ResponsabilitePedagogiquePays> findByPaysId(@PathVariable Long id){
        return responsabilitePedagogiquePaysService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return responsabilitePedagogiquePaysService.deleteByPaysId(id);
        }

        @ApiOperation("find by responsabilitePedagogique id")
        @GetMapping("/responsabilitePedagogique/id/{id}")
        public List<ResponsabilitePedagogiquePays> findByResponsabilitePedagogiqueId(@PathVariable Long id){
        return responsabilitePedagogiquePaysService.findByResponsabilitePedagogiqueId(id);
        }

        @ApiOperation("delete by responsabilitePedagogique id")
        @DeleteMapping("/responsabilitePedagogique/id/{id}")
        public int deleteByResponsabilitePedagogiqueId(@PathVariable Long id){
        return responsabilitePedagogiquePaysService.deleteByResponsabilitePedagogiqueId(id);
        }



            }
