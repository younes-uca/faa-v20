package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.OutilPedagogiqueDisciplineScientifiqueChercheurService;

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
import com.ird.faa.bean.OutilPedagogiqueDisciplineScientifique;
import com.ird.faa.ws.rest.provided.converter.OutilPedagogiqueDisciplineScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueDisciplineScientifiqueVo;

@Api("Manages outilPedagogiqueDisciplineScientifique services")
@RestController
@RequestMapping("api/chercheur/outilPedagogiqueDisciplineScientifique")
public class OutilPedagogiqueDisciplineScientifiqueRestChercheur {

@Autowired
private OutilPedagogiqueDisciplineScientifiqueChercheurService outilPedagogiqueDisciplineScientifiqueService;

@Autowired
private OutilPedagogiqueDisciplineScientifiqueConverter outilPedagogiqueDisciplineScientifiqueConverter;


            @ApiOperation("Updates the specified  outilPedagogiqueDisciplineScientifique")
            @PutMapping("/")
            public  OutilPedagogiqueDisciplineScientifiqueVo update(@RequestBody  OutilPedagogiqueDisciplineScientifiqueVo  outilPedagogiqueDisciplineScientifiqueVo){
            OutilPedagogiqueDisciplineScientifique outilPedagogiqueDisciplineScientifique = outilPedagogiqueDisciplineScientifiqueConverter.toItem(outilPedagogiqueDisciplineScientifiqueVo);
            outilPedagogiqueDisciplineScientifique = outilPedagogiqueDisciplineScientifiqueService.update(outilPedagogiqueDisciplineScientifique);
            return outilPedagogiqueDisciplineScientifiqueConverter.toVo(outilPedagogiqueDisciplineScientifique);
            }

    @ApiOperation("Finds a list of all outilPedagogiqueDisciplineScientifiques")
    @GetMapping("/")
    public List<OutilPedagogiqueDisciplineScientifiqueVo> findAll(){
        return outilPedagogiqueDisciplineScientifiqueConverter.toVo(outilPedagogiqueDisciplineScientifiqueService.findAll());
    }

    @ApiOperation("Finds a outilPedagogiqueDisciplineScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public OutilPedagogiqueDisciplineScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return outilPedagogiqueDisciplineScientifiqueConverter.toVo(outilPedagogiqueDisciplineScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search outilPedagogiqueDisciplineScientifique by a specific criteria")
    @PostMapping("/search")
    public List<OutilPedagogiqueDisciplineScientifiqueVo> findByCriteria(@RequestBody OutilPedagogiqueDisciplineScientifiqueVo outilPedagogiqueDisciplineScientifiqueVo){
        return outilPedagogiqueDisciplineScientifiqueConverter.toVo(outilPedagogiqueDisciplineScientifiqueService.findByCriteria(outilPedagogiqueDisciplineScientifiqueVo));
        }

            @ApiOperation("Finds a outilPedagogiqueDisciplineScientifique by id")
            @GetMapping("/id/{id}")
            public OutilPedagogiqueDisciplineScientifiqueVo findById(@PathVariable Long id){
            return outilPedagogiqueDisciplineScientifiqueConverter.toVo(outilPedagogiqueDisciplineScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  outilPedagogiqueDisciplineScientifique")
            @PostMapping("/")
            public OutilPedagogiqueDisciplineScientifiqueVo save(@RequestBody OutilPedagogiqueDisciplineScientifiqueVo outilPedagogiqueDisciplineScientifiqueVo){
            OutilPedagogiqueDisciplineScientifique outilPedagogiqueDisciplineScientifique = outilPedagogiqueDisciplineScientifiqueConverter.toItem(outilPedagogiqueDisciplineScientifiqueVo);
            outilPedagogiqueDisciplineScientifique = outilPedagogiqueDisciplineScientifiqueService.save(outilPedagogiqueDisciplineScientifique);
            return outilPedagogiqueDisciplineScientifiqueConverter.toVo(outilPedagogiqueDisciplineScientifique);
            }

            @ApiOperation("Delete the specified outilPedagogiqueDisciplineScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody OutilPedagogiqueDisciplineScientifiqueVo outilPedagogiqueDisciplineScientifiqueVo){
            OutilPedagogiqueDisciplineScientifique outilPedagogiqueDisciplineScientifique = outilPedagogiqueDisciplineScientifiqueConverter.toItem(outilPedagogiqueDisciplineScientifiqueVo);
            return outilPedagogiqueDisciplineScientifiqueService.delete(outilPedagogiqueDisciplineScientifique);
            }

            @ApiOperation("Deletes a outilPedagogiqueDisciplineScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return outilPedagogiqueDisciplineScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by outilPedagogique id")
        @GetMapping("/outilPedagogique/id/{id}")
        public List<OutilPedagogiqueDisciplineScientifique> findByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiqueDisciplineScientifiqueService.findByOutilPedagogiqueId(id);
        }

        @ApiOperation("delete by outilPedagogique id")
        @DeleteMapping("/outilPedagogique/id/{id}")
        public int deleteByOutilPedagogiqueId(@PathVariable Long id){
        return outilPedagogiqueDisciplineScientifiqueService.deleteByOutilPedagogiqueId(id);
        }

        @ApiOperation("find by disciplineScientifique code")
        @GetMapping("/disciplineScientifique/code/{code}")
        public List<OutilPedagogiqueDisciplineScientifique> findByDisciplineScientifiqueCode(@PathVariable String code){
        return outilPedagogiqueDisciplineScientifiqueService.findByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("delete by disciplineScientifique code")
        @DeleteMapping("/disciplineScientifique/code/{code}")
        public int deleteByDisciplineScientifiqueCode(@PathVariable String code){
        return outilPedagogiqueDisciplineScientifiqueService.deleteByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("find by disciplineScientifique id")
        @GetMapping("/disciplineScientifique/id/{id}")
        public List<OutilPedagogiqueDisciplineScientifique> findByDisciplineScientifiqueId(@PathVariable Long id){
        return outilPedagogiqueDisciplineScientifiqueService.findByDisciplineScientifiqueId(id);
        }

        @ApiOperation("delete by disciplineScientifique id")
        @DeleteMapping("/disciplineScientifique/id/{id}")
        public int deleteByDisciplineScientifiqueId(@PathVariable Long id){
        return outilPedagogiqueDisciplineScientifiqueService.deleteByDisciplineScientifiqueId(id);
        }



            }
