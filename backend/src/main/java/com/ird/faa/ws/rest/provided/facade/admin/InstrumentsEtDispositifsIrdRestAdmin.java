package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.InstrumentsEtDispositifsIrdAdminService;

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
import com.ird.faa.bean.InstrumentsEtDispositifsIrd;
import com.ird.faa.ws.rest.provided.converter.InstrumentsEtDispositifsIrdConverter;
import com.ird.faa.ws.rest.provided.vo.InstrumentsEtDispositifsIrdVo;

@Api("Manages instrumentsEtDispositifsIrd services")
@RestController
@RequestMapping("api/admin/instrumentsEtDispositifsIrd")
public class InstrumentsEtDispositifsIrdRestAdmin {

@Autowired
private InstrumentsEtDispositifsIrdAdminService instrumentsEtDispositifsIrdService;

@Autowired
private InstrumentsEtDispositifsIrdConverter instrumentsEtDispositifsIrdConverter;


            @ApiOperation("Updates the specified  instrumentsEtDispositifsIrd")
            @PutMapping("/")
            public  InstrumentsEtDispositifsIrdVo update(@RequestBody  InstrumentsEtDispositifsIrdVo  instrumentsEtDispositifsIrdVo){
            InstrumentsEtDispositifsIrd instrumentsEtDispositifsIrd = instrumentsEtDispositifsIrdConverter.toItem(instrumentsEtDispositifsIrdVo);
            instrumentsEtDispositifsIrd = instrumentsEtDispositifsIrdService.update(instrumentsEtDispositifsIrd);
            return instrumentsEtDispositifsIrdConverter.toVo(instrumentsEtDispositifsIrd);
            }

    @ApiOperation("Finds a list of all instrumentsEtDispositifsIrds")
    @GetMapping("/")
    public List<InstrumentsEtDispositifsIrdVo> findAll(){
        return instrumentsEtDispositifsIrdConverter.toVo(instrumentsEtDispositifsIrdService.findAll());
    }

    @ApiOperation("Finds a instrumentsEtDispositifsIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public InstrumentsEtDispositifsIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return instrumentsEtDispositifsIrdConverter.toVo(instrumentsEtDispositifsIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search instrumentsEtDispositifsIrd by a specific criteria")
    @PostMapping("/search")
    public List<InstrumentsEtDispositifsIrdVo> findByCriteria(@RequestBody InstrumentsEtDispositifsIrdVo instrumentsEtDispositifsIrdVo){
        return instrumentsEtDispositifsIrdConverter.toVo(instrumentsEtDispositifsIrdService.findByCriteria(instrumentsEtDispositifsIrdVo));
        }

            @ApiOperation("Finds a instrumentsEtDispositifsIrd by id")
            @GetMapping("/id/{id}")
            public InstrumentsEtDispositifsIrdVo findById(@PathVariable Long id){
            return instrumentsEtDispositifsIrdConverter.toVo(instrumentsEtDispositifsIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  instrumentsEtDispositifsIrd")
            @PostMapping("/")
            public InstrumentsEtDispositifsIrdVo save(@RequestBody InstrumentsEtDispositifsIrdVo instrumentsEtDispositifsIrdVo){
            InstrumentsEtDispositifsIrd instrumentsEtDispositifsIrd = instrumentsEtDispositifsIrdConverter.toItem(instrumentsEtDispositifsIrdVo);
            instrumentsEtDispositifsIrd = instrumentsEtDispositifsIrdService.save(instrumentsEtDispositifsIrd);
            return instrumentsEtDispositifsIrdConverter.toVo(instrumentsEtDispositifsIrd);
            }

            @ApiOperation("Delete the specified instrumentsEtDispositifsIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody InstrumentsEtDispositifsIrdVo instrumentsEtDispositifsIrdVo){
            InstrumentsEtDispositifsIrd instrumentsEtDispositifsIrd = instrumentsEtDispositifsIrdConverter.toItem(instrumentsEtDispositifsIrdVo);
            return instrumentsEtDispositifsIrdService.delete(instrumentsEtDispositifsIrd);
            }

            @ApiOperation("Deletes a instrumentsEtDispositifsIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return instrumentsEtDispositifsIrdService.deleteById(id);
            }
        @ApiOperation("find by campagne code")
        @GetMapping("/campagne/code/{code}")
        public List<InstrumentsEtDispositifsIrd> findByCampagneCode(@PathVariable String code){
        return instrumentsEtDispositifsIrdService.findByCampagneCode(code);
        }

        @ApiOperation("delete by campagne code")
        @DeleteMapping("/campagne/code/{code}")
        public int deleteByCampagneCode(@PathVariable String code){
        return instrumentsEtDispositifsIrdService.deleteByCampagneCode(code);
        }

        @ApiOperation("find by campagne id")
        @GetMapping("/campagne/id/{id}")
        public List<InstrumentsEtDispositifsIrd> findByCampagneId(@PathVariable Long id){
        return instrumentsEtDispositifsIrdService.findByCampagneId(id);
        }

        @ApiOperation("delete by campagne id")
        @DeleteMapping("/campagne/id/{id}")
        public int deleteByCampagneId(@PathVariable Long id){
        return instrumentsEtDispositifsIrdService.deleteByCampagneId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<InstrumentsEtDispositifsIrd> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return instrumentsEtDispositifsIrdService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return instrumentsEtDispositifsIrdService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<InstrumentsEtDispositifsIrd> findByChercheurId(@PathVariable Long id){
        return instrumentsEtDispositifsIrdService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return instrumentsEtDispositifsIrdService.deleteByChercheurId(id);
        }



            }
