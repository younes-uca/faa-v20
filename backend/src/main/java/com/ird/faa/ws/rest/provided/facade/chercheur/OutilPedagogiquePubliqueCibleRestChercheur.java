package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.OutilPedagogiquePubliqueCibleChercheurService;

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
import com.ird.faa.bean.OutilPedagogiquePubliqueCible;
import com.ird.faa.ws.rest.provided.converter.OutilPedagogiquePubliqueCibleConverter;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiquePubliqueCibleVo;

@Api("Manages outilPedagogiquePubliqueCible services")
@RestController
@RequestMapping("api/chercheur/outilPedagogiquePubliqueCible")
public class OutilPedagogiquePubliqueCibleRestChercheur {

@Autowired
private OutilPedagogiquePubliqueCibleChercheurService outilPedagogiquePubliqueCibleService;

@Autowired
private OutilPedagogiquePubliqueCibleConverter outilPedagogiquePubliqueCibleConverter;


            @ApiOperation("Updates the specified  outilPedagogiquePubliqueCible")
            @PutMapping("/")
            public  OutilPedagogiquePubliqueCibleVo update(@RequestBody  OutilPedagogiquePubliqueCibleVo  outilPedagogiquePubliqueCibleVo){
            OutilPedagogiquePubliqueCible outilPedagogiquePubliqueCible = outilPedagogiquePubliqueCibleConverter.toItem(outilPedagogiquePubliqueCibleVo);
            outilPedagogiquePubliqueCible = outilPedagogiquePubliqueCibleService.update(outilPedagogiquePubliqueCible);
            return outilPedagogiquePubliqueCibleConverter.toVo(outilPedagogiquePubliqueCible);
            }

    @ApiOperation("Finds a list of all outilPedagogiquePubliqueCibles")
    @GetMapping("/")
    public List<OutilPedagogiquePubliqueCibleVo> findAll(){
        return outilPedagogiquePubliqueCibleConverter.toVo(outilPedagogiquePubliqueCibleService.findAll());
    }

    @ApiOperation("Finds a outilPedagogiquePubliqueCible with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public OutilPedagogiquePubliqueCibleVo findByIdWithAssociatedList(@PathVariable Long id){
    return outilPedagogiquePubliqueCibleConverter.toVo(outilPedagogiquePubliqueCibleService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search outilPedagogiquePubliqueCible by a specific criteria")
    @PostMapping("/search")
    public List<OutilPedagogiquePubliqueCibleVo> findByCriteria(@RequestBody OutilPedagogiquePubliqueCibleVo outilPedagogiquePubliqueCibleVo){
        return outilPedagogiquePubliqueCibleConverter.toVo(outilPedagogiquePubliqueCibleService.findByCriteria(outilPedagogiquePubliqueCibleVo));
        }

            @ApiOperation("Finds a outilPedagogiquePubliqueCible by id")
            @GetMapping("/id/{id}")
            public OutilPedagogiquePubliqueCibleVo findById(@PathVariable Long id){
            return outilPedagogiquePubliqueCibleConverter.toVo(outilPedagogiquePubliqueCibleService.findById(id));
            }

            @ApiOperation("Saves the specified  outilPedagogiquePubliqueCible")
            @PostMapping("/")
            public OutilPedagogiquePubliqueCibleVo save(@RequestBody OutilPedagogiquePubliqueCibleVo outilPedagogiquePubliqueCibleVo){
            OutilPedagogiquePubliqueCible outilPedagogiquePubliqueCible = outilPedagogiquePubliqueCibleConverter.toItem(outilPedagogiquePubliqueCibleVo);
            outilPedagogiquePubliqueCible = outilPedagogiquePubliqueCibleService.save(outilPedagogiquePubliqueCible);
            return outilPedagogiquePubliqueCibleConverter.toVo(outilPedagogiquePubliqueCible);
            }

            @ApiOperation("Delete the specified outilPedagogiquePubliqueCible")
            @DeleteMapping("/")
            public int delete(@RequestBody OutilPedagogiquePubliqueCibleVo outilPedagogiquePubliqueCibleVo){
            OutilPedagogiquePubliqueCible outilPedagogiquePubliqueCible = outilPedagogiquePubliqueCibleConverter.toItem(outilPedagogiquePubliqueCibleVo);
            return outilPedagogiquePubliqueCibleService.delete(outilPedagogiquePubliqueCible);
            }

            @ApiOperation("Deletes a outilPedagogiquePubliqueCible by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return outilPedagogiquePubliqueCibleService.deleteById(id);
            }
        @ApiOperation("find by publiqueCible code")
        @GetMapping("/publiqueCible/code/{code}")
        public List<OutilPedagogiquePubliqueCible> findByPubliqueCibleCode(@PathVariable String code){
        return outilPedagogiquePubliqueCibleService.findByPubliqueCibleCode(code);
        }

        @ApiOperation("delete by publiqueCible code")
        @DeleteMapping("/publiqueCible/code/{code}")
        public int deleteByPubliqueCibleCode(@PathVariable String code){
        return outilPedagogiquePubliqueCibleService.deleteByPubliqueCibleCode(code);
        }

        @ApiOperation("find by publiqueCible id")
        @GetMapping("/publiqueCible/id/{id}")
        public List<OutilPedagogiquePubliqueCible> findByPubliqueCibleId(@PathVariable Long id){
        return outilPedagogiquePubliqueCibleService.findByPubliqueCibleId(id);
        }

        @ApiOperation("delete by publiqueCible id")
        @DeleteMapping("/publiqueCible/id/{id}")
        public int deleteByPubliqueCibleId(@PathVariable Long id){
        return outilPedagogiquePubliqueCibleService.deleteByPubliqueCibleId(id);
        }

        @ApiOperation("find by outilPedagogique id")
        @GetMapping("/outilPedagogique/id/{id}")
        public List<OutilPedagogiquePubliqueCible> findByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiquePubliqueCibleService.findByOutilPedagogiqueId(id);
        }

        @ApiOperation("delete by outilPedagogique id")
        @DeleteMapping("/outilPedagogique/id/{id}")
        public int deleteByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiquePubliqueCibleService.deleteByOutilPedagogiqueId(id);
        }



            }
