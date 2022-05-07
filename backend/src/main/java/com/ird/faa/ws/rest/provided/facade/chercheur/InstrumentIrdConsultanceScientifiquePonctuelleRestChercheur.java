package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.InstrumentIrdConsultanceScientifiquePonctuelleChercheurService;

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
import com.ird.faa.bean.InstrumentIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.converter.InstrumentIrdConsultanceScientifiquePonctuelleConverter;
import com.ird.faa.ws.rest.provided.vo.InstrumentIrdConsultanceScientifiquePonctuelleVo;

@Api("Manages instrumentIrdConsultanceScientifiquePonctuelle services")
@RestController
@RequestMapping("api/chercheur/instrumentIrdConsultanceScientifiquePonctuelle")
public class InstrumentIrdConsultanceScientifiquePonctuelleRestChercheur {

@Autowired
private InstrumentIrdConsultanceScientifiquePonctuelleChercheurService instrumentIrdConsultanceScientifiquePonctuelleService;

@Autowired
private InstrumentIrdConsultanceScientifiquePonctuelleConverter instrumentIrdConsultanceScientifiquePonctuelleConverter;


            @ApiOperation("Updates the specified  instrumentIrdConsultanceScientifiquePonctuelle")
            @PutMapping("/")
            public  InstrumentIrdConsultanceScientifiquePonctuelleVo update(@RequestBody  InstrumentIrdConsultanceScientifiquePonctuelleVo  instrumentIrdConsultanceScientifiquePonctuelleVo){
            InstrumentIrdConsultanceScientifiquePonctuelle instrumentIrdConsultanceScientifiquePonctuelle = instrumentIrdConsultanceScientifiquePonctuelleConverter.toItem(instrumentIrdConsultanceScientifiquePonctuelleVo);
            instrumentIrdConsultanceScientifiquePonctuelle = instrumentIrdConsultanceScientifiquePonctuelleService.update(instrumentIrdConsultanceScientifiquePonctuelle);
            return instrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(instrumentIrdConsultanceScientifiquePonctuelle);
            }

    @ApiOperation("Finds a list of all instrumentIrdConsultanceScientifiquePonctuelles")
    @GetMapping("/")
    public List<InstrumentIrdConsultanceScientifiquePonctuelleVo> findAll(){
        return instrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(instrumentIrdConsultanceScientifiquePonctuelleService.findAll());
    }

    @ApiOperation("Finds a instrumentIrdConsultanceScientifiquePonctuelle with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public InstrumentIrdConsultanceScientifiquePonctuelleVo findByIdWithAssociatedList(@PathVariable Long id){
    return instrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(instrumentIrdConsultanceScientifiquePonctuelleService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search instrumentIrdConsultanceScientifiquePonctuelle by a specific criteria")
    @PostMapping("/search")
    public List<InstrumentIrdConsultanceScientifiquePonctuelleVo> findByCriteria(@RequestBody InstrumentIrdConsultanceScientifiquePonctuelleVo instrumentIrdConsultanceScientifiquePonctuelleVo){
        return instrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(instrumentIrdConsultanceScientifiquePonctuelleService.findByCriteria(instrumentIrdConsultanceScientifiquePonctuelleVo));
        }

            @ApiOperation("Finds a instrumentIrdConsultanceScientifiquePonctuelle by id")
            @GetMapping("/id/{id}")
            public InstrumentIrdConsultanceScientifiquePonctuelleVo findById(@PathVariable Long id){
            return instrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(instrumentIrdConsultanceScientifiquePonctuelleService.findById(id));
            }

            @ApiOperation("Saves the specified  instrumentIrdConsultanceScientifiquePonctuelle")
            @PostMapping("/")
            public InstrumentIrdConsultanceScientifiquePonctuelleVo save(@RequestBody InstrumentIrdConsultanceScientifiquePonctuelleVo instrumentIrdConsultanceScientifiquePonctuelleVo){
            InstrumentIrdConsultanceScientifiquePonctuelle instrumentIrdConsultanceScientifiquePonctuelle = instrumentIrdConsultanceScientifiquePonctuelleConverter.toItem(instrumentIrdConsultanceScientifiquePonctuelleVo);
            instrumentIrdConsultanceScientifiquePonctuelle = instrumentIrdConsultanceScientifiquePonctuelleService.save(instrumentIrdConsultanceScientifiquePonctuelle);
            return instrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(instrumentIrdConsultanceScientifiquePonctuelle);
            }

            @ApiOperation("Delete the specified instrumentIrdConsultanceScientifiquePonctuelle")
            @DeleteMapping("/")
            public int delete(@RequestBody InstrumentIrdConsultanceScientifiquePonctuelleVo instrumentIrdConsultanceScientifiquePonctuelleVo){
            InstrumentIrdConsultanceScientifiquePonctuelle instrumentIrdConsultanceScientifiquePonctuelle = instrumentIrdConsultanceScientifiquePonctuelleConverter.toItem(instrumentIrdConsultanceScientifiquePonctuelleVo);
            return instrumentIrdConsultanceScientifiquePonctuelleService.delete(instrumentIrdConsultanceScientifiquePonctuelle);
            }

            @ApiOperation("Deletes a instrumentIrdConsultanceScientifiquePonctuelle by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return instrumentIrdConsultanceScientifiquePonctuelleService.deleteById(id);
            }
        @ApiOperation("find by consultanceScientifiquePonctuelle id")
        @GetMapping("/consultanceScientifiquePonctuelle/id/{id}")
        public List<InstrumentIrdConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(@PathVariable Long id){
        return instrumentIrdConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(id);
        }

        @ApiOperation("delete by consultanceScientifiquePonctuelle id")
        @DeleteMapping("/consultanceScientifiquePonctuelle/id/{id}")
        public int deleteByConsultanceScientifiquePonctuelleId(@PathVariable Long id){
        return instrumentIrdConsultanceScientifiquePonctuelleService.deleteByConsultanceScientifiquePonctuelleId(id);
        }

        @ApiOperation("find by instrumentIrd code")
        @GetMapping("/instrumentIrd/code/{code}")
        public List<InstrumentIrdConsultanceScientifiquePonctuelle> findByInstrumentIrdCode(@PathVariable String code){
        return instrumentIrdConsultanceScientifiquePonctuelleService.findByInstrumentIrdCode(code);
        }

        @ApiOperation("delete by instrumentIrd code")
        @DeleteMapping("/instrumentIrd/code/{code}")
        public int deleteByInstrumentIrdCode(@PathVariable String code){
        return instrumentIrdConsultanceScientifiquePonctuelleService.deleteByInstrumentIrdCode(code);
        }

        @ApiOperation("find by instrumentIrd id")
        @GetMapping("/instrumentIrd/id/{id}")
        public List<InstrumentIrdConsultanceScientifiquePonctuelle> findByInstrumentIrdId(@PathVariable Long id){
        return instrumentIrdConsultanceScientifiquePonctuelleService.findByInstrumentIrdId(id);
        }

        @ApiOperation("delete by instrumentIrd id")
        @DeleteMapping("/instrumentIrd/id/{id}")
        public int deleteByInstrumentIrdId(@PathVariable Long id){
        return instrumentIrdConsultanceScientifiquePonctuelleService.deleteByInstrumentIrdId(id);
        }



            }
