package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.EnjeuxIrdConsultanceScientifiquePonctuelleChercheurService;

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
import com.ird.faa.bean.EnjeuxIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.converter.EnjeuxIrdConsultanceScientifiquePonctuelleConverter;
import com.ird.faa.ws.rest.provided.vo.EnjeuxIrdConsultanceScientifiquePonctuelleVo;

@Api("Manages enjeuxIrdConsultanceScientifiquePonctuelle services")
@RestController
@RequestMapping("api/chercheur/enjeuxIrdConsultanceScientifiquePonctuelle")
public class EnjeuxIrdConsultanceScientifiquePonctuelleRestChercheur {

@Autowired
private EnjeuxIrdConsultanceScientifiquePonctuelleChercheurService enjeuxIrdConsultanceScientifiquePonctuelleService;

@Autowired
private EnjeuxIrdConsultanceScientifiquePonctuelleConverter enjeuxIrdConsultanceScientifiquePonctuelleConverter;


            @ApiOperation("Updates the specified  enjeuxIrdConsultanceScientifiquePonctuelle")
            @PutMapping("/")
            public  EnjeuxIrdConsultanceScientifiquePonctuelleVo update(@RequestBody  EnjeuxIrdConsultanceScientifiquePonctuelleVo  enjeuxIrdConsultanceScientifiquePonctuelleVo){
            EnjeuxIrdConsultanceScientifiquePonctuelle enjeuxIrdConsultanceScientifiquePonctuelle = enjeuxIrdConsultanceScientifiquePonctuelleConverter.toItem(enjeuxIrdConsultanceScientifiquePonctuelleVo);
            enjeuxIrdConsultanceScientifiquePonctuelle = enjeuxIrdConsultanceScientifiquePonctuelleService.update(enjeuxIrdConsultanceScientifiquePonctuelle);
            return enjeuxIrdConsultanceScientifiquePonctuelleConverter.toVo(enjeuxIrdConsultanceScientifiquePonctuelle);
            }

    @ApiOperation("Finds a list of all enjeuxIrdConsultanceScientifiquePonctuelles")
    @GetMapping("/")
    public List<EnjeuxIrdConsultanceScientifiquePonctuelleVo> findAll(){
        return enjeuxIrdConsultanceScientifiquePonctuelleConverter.toVo(enjeuxIrdConsultanceScientifiquePonctuelleService.findAll());
    }

    @ApiOperation("Finds a enjeuxIrdConsultanceScientifiquePonctuelle with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EnjeuxIrdConsultanceScientifiquePonctuelleVo findByIdWithAssociatedList(@PathVariable Long id){
    return enjeuxIrdConsultanceScientifiquePonctuelleConverter.toVo(enjeuxIrdConsultanceScientifiquePonctuelleService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search enjeuxIrdConsultanceScientifiquePonctuelle by a specific criteria")
    @PostMapping("/search")
    public List<EnjeuxIrdConsultanceScientifiquePonctuelleVo> findByCriteria(@RequestBody EnjeuxIrdConsultanceScientifiquePonctuelleVo enjeuxIrdConsultanceScientifiquePonctuelleVo){
        return enjeuxIrdConsultanceScientifiquePonctuelleConverter.toVo(enjeuxIrdConsultanceScientifiquePonctuelleService.findByCriteria(enjeuxIrdConsultanceScientifiquePonctuelleVo));
        }

            @ApiOperation("Finds a enjeuxIrdConsultanceScientifiquePonctuelle by id")
            @GetMapping("/id/{id}")
            public EnjeuxIrdConsultanceScientifiquePonctuelleVo findById(@PathVariable Long id){
            return enjeuxIrdConsultanceScientifiquePonctuelleConverter.toVo(enjeuxIrdConsultanceScientifiquePonctuelleService.findById(id));
            }

            @ApiOperation("Saves the specified  enjeuxIrdConsultanceScientifiquePonctuelle")
            @PostMapping("/")
            public EnjeuxIrdConsultanceScientifiquePonctuelleVo save(@RequestBody EnjeuxIrdConsultanceScientifiquePonctuelleVo enjeuxIrdConsultanceScientifiquePonctuelleVo){
            EnjeuxIrdConsultanceScientifiquePonctuelle enjeuxIrdConsultanceScientifiquePonctuelle = enjeuxIrdConsultanceScientifiquePonctuelleConverter.toItem(enjeuxIrdConsultanceScientifiquePonctuelleVo);
            enjeuxIrdConsultanceScientifiquePonctuelle = enjeuxIrdConsultanceScientifiquePonctuelleService.save(enjeuxIrdConsultanceScientifiquePonctuelle);
            return enjeuxIrdConsultanceScientifiquePonctuelleConverter.toVo(enjeuxIrdConsultanceScientifiquePonctuelle);
            }

            @ApiOperation("Delete the specified enjeuxIrdConsultanceScientifiquePonctuelle")
            @DeleteMapping("/")
            public int delete(@RequestBody EnjeuxIrdConsultanceScientifiquePonctuelleVo enjeuxIrdConsultanceScientifiquePonctuelleVo){
            EnjeuxIrdConsultanceScientifiquePonctuelle enjeuxIrdConsultanceScientifiquePonctuelle = enjeuxIrdConsultanceScientifiquePonctuelleConverter.toItem(enjeuxIrdConsultanceScientifiquePonctuelleVo);
            return enjeuxIrdConsultanceScientifiquePonctuelleService.delete(enjeuxIrdConsultanceScientifiquePonctuelle);
            }

            @ApiOperation("Deletes a enjeuxIrdConsultanceScientifiquePonctuelle by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return enjeuxIrdConsultanceScientifiquePonctuelleService.deleteById(id);
            }
        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<EnjeuxIrdConsultanceScientifiquePonctuelle> findByEnjeuxIrdCode(@PathVariable String code){
        return enjeuxIrdConsultanceScientifiquePonctuelleService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return enjeuxIrdConsultanceScientifiquePonctuelleService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<EnjeuxIrdConsultanceScientifiquePonctuelle> findByEnjeuxIrdId(@PathVariable Long id){
        return enjeuxIrdConsultanceScientifiquePonctuelleService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return enjeuxIrdConsultanceScientifiquePonctuelleService.deleteByEnjeuxIrdId(id);
        }

        @ApiOperation("find by consultanceScientifiquePonctuelle id")
        @GetMapping("/consultanceScientifiquePonctuelle/id/{id}")
        public List<EnjeuxIrdConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(@PathVariable Long id){
        return enjeuxIrdConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(id);
        }

        @ApiOperation("delete by consultanceScientifiquePonctuelle id")
        @DeleteMapping("/consultanceScientifiquePonctuelle/id/{id}")
        public int deleteByConsultanceScientifiquePonctuelleId(@PathVariable Long id){
        return enjeuxIrdConsultanceScientifiquePonctuelleService.deleteByConsultanceScientifiquePonctuelleId(id);
        }



            }
