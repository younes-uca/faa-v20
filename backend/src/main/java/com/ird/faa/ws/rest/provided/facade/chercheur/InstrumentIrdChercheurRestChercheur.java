package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.InstrumentIrdChercheurChercheurService;

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
import com.ird.faa.bean.InstrumentIrdChercheur;
import com.ird.faa.ws.rest.provided.converter.InstrumentIrdChercheurConverter;
import com.ird.faa.ws.rest.provided.vo.InstrumentIrdChercheurVo;

@Api("Manages instrumentIrdChercheur services")
@RestController
@RequestMapping("api/chercheur/instrumentIrdChercheur")
public class InstrumentIrdChercheurRestChercheur {

@Autowired
private InstrumentIrdChercheurChercheurService instrumentIrdChercheurService;

@Autowired
private InstrumentIrdChercheurConverter instrumentIrdChercheurConverter;


            @ApiOperation("Updates the specified  instrumentIrdChercheur")
            @PutMapping("/")
            public  InstrumentIrdChercheurVo update(@RequestBody  InstrumentIrdChercheurVo  instrumentIrdChercheurVo){
            InstrumentIrdChercheur instrumentIrdChercheur = instrumentIrdChercheurConverter.toItem(instrumentIrdChercheurVo);
            instrumentIrdChercheur = instrumentIrdChercheurService.update(instrumentIrdChercheur);
            return instrumentIrdChercheurConverter.toVo(instrumentIrdChercheur);
            }

    @ApiOperation("Finds a list of all instrumentIrdChercheurs")
    @GetMapping("/")
    public List<InstrumentIrdChercheurVo> findAll(){
        return instrumentIrdChercheurConverter.toVo(instrumentIrdChercheurService.findAll());
    }

    @ApiOperation("Finds a instrumentIrdChercheur with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public InstrumentIrdChercheurVo findByIdWithAssociatedList(@PathVariable Long id){
    return instrumentIrdChercheurConverter.toVo(instrumentIrdChercheurService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search instrumentIrdChercheur by a specific criteria")
    @PostMapping("/search")
    public List<InstrumentIrdChercheurVo> findByCriteria(@RequestBody InstrumentIrdChercheurVo instrumentIrdChercheurVo){
        return instrumentIrdChercheurConverter.toVo(instrumentIrdChercheurService.findByCriteria(instrumentIrdChercheurVo));
        }

            @ApiOperation("Finds a instrumentIrdChercheur by id")
            @GetMapping("/id/{id}")
            public InstrumentIrdChercheurVo findById(@PathVariable Long id){
            return instrumentIrdChercheurConverter.toVo(instrumentIrdChercheurService.findById(id));
            }

            @ApiOperation("Saves the specified  instrumentIrdChercheur")
            @PostMapping("/")
            public InstrumentIrdChercheurVo save(@RequestBody InstrumentIrdChercheurVo instrumentIrdChercheurVo){
            InstrumentIrdChercheur instrumentIrdChercheur = instrumentIrdChercheurConverter.toItem(instrumentIrdChercheurVo);
            instrumentIrdChercheur = instrumentIrdChercheurService.save(instrumentIrdChercheur);
            return instrumentIrdChercheurConverter.toVo(instrumentIrdChercheur);
            }

            @ApiOperation("Delete the specified instrumentIrdChercheur")
            @DeleteMapping("/")
            public int delete(@RequestBody InstrumentIrdChercheurVo instrumentIrdChercheurVo){
            InstrumentIrdChercheur instrumentIrdChercheur = instrumentIrdChercheurConverter.toItem(instrumentIrdChercheurVo);
            return instrumentIrdChercheurService.delete(instrumentIrdChercheur);
            }

            @ApiOperation("Deletes a instrumentIrdChercheur by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return instrumentIrdChercheurService.deleteById(id);
            }
        @ApiOperation("find by instrumentIrd code")
        @GetMapping("/instrumentIrd/code/{code}")
        public List<InstrumentIrdChercheur> findByInstrumentIrdCode(@PathVariable String code){
        return instrumentIrdChercheurService.findByInstrumentIrdCode(code);
        }

        @ApiOperation("delete by instrumentIrd code")
        @DeleteMapping("/instrumentIrd/code/{code}")
        public int deleteByInstrumentIrdCode(@PathVariable String code){
        return instrumentIrdChercheurService.deleteByInstrumentIrdCode(code);
        }

        @ApiOperation("find by instrumentIrd id")
        @GetMapping("/instrumentIrd/id/{id}")
        public List<InstrumentIrdChercheur> findByInstrumentIrdId(@PathVariable Long id){
        return instrumentIrdChercheurService.findByInstrumentIrdId(id);
        }

        @ApiOperation("delete by instrumentIrd id")
        @DeleteMapping("/instrumentIrd/id/{id}")
        public int deleteByInstrumentIrdId(@PathVariable Long id){
        return instrumentIrdChercheurService.deleteByInstrumentIrdId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<InstrumentIrdChercheur> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return instrumentIrdChercheurService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return instrumentIrdChercheurService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<InstrumentIrdChercheur> findByChercheurId(@PathVariable Long id){
        return instrumentIrdChercheurService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return instrumentIrdChercheurService.deleteByChercheurId(id);
        }



            }
