package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.EvenementColloqueScienntifiquePaysChercheurService;

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
import com.ird.faa.bean.EvenementColloqueScienntifiquePays;
import com.ird.faa.ws.rest.provided.converter.EvenementColloqueScienntifiquePaysConverter;
import com.ird.faa.ws.rest.provided.vo.EvenementColloqueScienntifiquePaysVo;

@Api("Manages evenementColloqueScienntifiquePays services")
@RestController
@RequestMapping("api/chercheur/evenementColloqueScienntifiquePays")
public class EvenementColloqueScienntifiquePaysRestChercheur {

@Autowired
private EvenementColloqueScienntifiquePaysChercheurService evenementColloqueScienntifiquePaysService;

@Autowired
private EvenementColloqueScienntifiquePaysConverter evenementColloqueScienntifiquePaysConverter;


            @ApiOperation("Updates the specified  evenementColloqueScienntifiquePays")
            @PutMapping("/")
            public  EvenementColloqueScienntifiquePaysVo update(@RequestBody  EvenementColloqueScienntifiquePaysVo  evenementColloqueScienntifiquePaysVo){
            EvenementColloqueScienntifiquePays evenementColloqueScienntifiquePays = evenementColloqueScienntifiquePaysConverter.toItem(evenementColloqueScienntifiquePaysVo);
            evenementColloqueScienntifiquePays = evenementColloqueScienntifiquePaysService.update(evenementColloqueScienntifiquePays);
            return evenementColloqueScienntifiquePaysConverter.toVo(evenementColloqueScienntifiquePays);
            }

    @ApiOperation("Finds a list of all evenementColloqueScienntifiquePayss")
    @GetMapping("/")
    public List<EvenementColloqueScienntifiquePaysVo> findAll(){
        return evenementColloqueScienntifiquePaysConverter.toVo(evenementColloqueScienntifiquePaysService.findAll());
    }

    @ApiOperation("Finds a evenementColloqueScienntifiquePays with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EvenementColloqueScienntifiquePaysVo findByIdWithAssociatedList(@PathVariable Long id){
    return evenementColloqueScienntifiquePaysConverter.toVo(evenementColloqueScienntifiquePaysService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search evenementColloqueScienntifiquePays by a specific criteria")
    @PostMapping("/search")
    public List<EvenementColloqueScienntifiquePaysVo> findByCriteria(@RequestBody EvenementColloqueScienntifiquePaysVo evenementColloqueScienntifiquePaysVo){
        return evenementColloqueScienntifiquePaysConverter.toVo(evenementColloqueScienntifiquePaysService.findByCriteria(evenementColloqueScienntifiquePaysVo));
        }

            @ApiOperation("Finds a evenementColloqueScienntifiquePays by id")
            @GetMapping("/id/{id}")
            public EvenementColloqueScienntifiquePaysVo findById(@PathVariable Long id){
            return evenementColloqueScienntifiquePaysConverter.toVo(evenementColloqueScienntifiquePaysService.findById(id));
            }

            @ApiOperation("Saves the specified  evenementColloqueScienntifiquePays")
            @PostMapping("/")
            public EvenementColloqueScienntifiquePaysVo save(@RequestBody EvenementColloqueScienntifiquePaysVo evenementColloqueScienntifiquePaysVo){
            EvenementColloqueScienntifiquePays evenementColloqueScienntifiquePays = evenementColloqueScienntifiquePaysConverter.toItem(evenementColloqueScienntifiquePaysVo);
            evenementColloqueScienntifiquePays = evenementColloqueScienntifiquePaysService.save(evenementColloqueScienntifiquePays);
            return evenementColloqueScienntifiquePaysConverter.toVo(evenementColloqueScienntifiquePays);
            }

            @ApiOperation("Delete the specified evenementColloqueScienntifiquePays")
            @DeleteMapping("/")
            public int delete(@RequestBody EvenementColloqueScienntifiquePaysVo evenementColloqueScienntifiquePaysVo){
            EvenementColloqueScienntifiquePays evenementColloqueScienntifiquePays = evenementColloqueScienntifiquePaysConverter.toItem(evenementColloqueScienntifiquePaysVo);
            return evenementColloqueScienntifiquePaysService.delete(evenementColloqueScienntifiquePays);
            }

            @ApiOperation("Deletes a evenementColloqueScienntifiquePays by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return evenementColloqueScienntifiquePaysService.deleteById(id);
            }
        @ApiOperation("find by evenementColloqueScienntifique id")
        @GetMapping("/evenementColloqueScienntifique/id/{id}")
        public List<EvenementColloqueScienntifiquePays> findByEvenementColloqueScienntifiqueId(@PathVariable Long id){
        return evenementColloqueScienntifiquePaysService.findByEvenementColloqueScienntifiqueId(id);
        }

        @ApiOperation("delete by evenementColloqueScienntifique id")
        @DeleteMapping("/evenementColloqueScienntifique/id/{id}")
        public int deleteByEvenementColloqueScienntifiqueId(@PathVariable Long id){
        return evenementColloqueScienntifiquePaysService.deleteByEvenementColloqueScienntifiqueId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<EvenementColloqueScienntifiquePays> findByPaysCode(@PathVariable String code){
        return evenementColloqueScienntifiquePaysService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return evenementColloqueScienntifiquePaysService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<EvenementColloqueScienntifiquePays> findByPaysId(@PathVariable Long id){
        return evenementColloqueScienntifiquePaysService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return evenementColloqueScienntifiquePaysService.deleteByPaysId(id);
        }



            }
