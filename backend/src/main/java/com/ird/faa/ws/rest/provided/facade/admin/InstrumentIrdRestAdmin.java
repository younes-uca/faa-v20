package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.InstrumentIrdAdminService;

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
import com.ird.faa.bean.InstrumentIrd;
import com.ird.faa.ws.rest.provided.converter.InstrumentIrdConverter;
import com.ird.faa.ws.rest.provided.vo.InstrumentIrdVo;

@Api("Manages instrumentIrd services")
@RestController
@RequestMapping("api/admin/instrumentIrd")
public class InstrumentIrdRestAdmin {

@Autowired
private InstrumentIrdAdminService instrumentIrdService;

@Autowired
private InstrumentIrdConverter instrumentIrdConverter;


            @ApiOperation("Updates the specified  instrumentIrd")
            @PutMapping("/")
            public  InstrumentIrdVo update(@RequestBody  InstrumentIrdVo  instrumentIrdVo){
            InstrumentIrd instrumentIrd = instrumentIrdConverter.toItem(instrumentIrdVo);
            instrumentIrd = instrumentIrdService.update(instrumentIrd);
            return instrumentIrdConverter.toVo(instrumentIrd);
            }

    @ApiOperation("Finds a list of all instrumentIrds")
    @GetMapping("/")
    public List<InstrumentIrdVo> findAll(){
        return instrumentIrdConverter.toVo(instrumentIrdService.findAll());
    }

    @ApiOperation("Finds a instrumentIrd with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public InstrumentIrdVo findByIdWithAssociatedList(@PathVariable Long id){
    return instrumentIrdConverter.toVo(instrumentIrdService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search instrumentIrd by a specific criteria")
    @PostMapping("/search")
    public List<InstrumentIrdVo> findByCriteria(@RequestBody InstrumentIrdVo instrumentIrdVo){
        return instrumentIrdConverter.toVo(instrumentIrdService.findByCriteria(instrumentIrdVo));
        }

            @ApiOperation("Finds a instrumentIrd by id")
            @GetMapping("/id/{id}")
            public InstrumentIrdVo findById(@PathVariable Long id){
            return instrumentIrdConverter.toVo(instrumentIrdService.findById(id));
            }

            @ApiOperation("Saves the specified  instrumentIrd")
            @PostMapping("/")
            public InstrumentIrdVo save(@RequestBody InstrumentIrdVo instrumentIrdVo){
            InstrumentIrd instrumentIrd = instrumentIrdConverter.toItem(instrumentIrdVo);
            instrumentIrd = instrumentIrdService.save(instrumentIrd);
            return instrumentIrdConverter.toVo(instrumentIrd);
            }

            @ApiOperation("Delete the specified instrumentIrd")
            @DeleteMapping("/")
            public int delete(@RequestBody InstrumentIrdVo instrumentIrdVo){
            InstrumentIrd instrumentIrd = instrumentIrdConverter.toItem(instrumentIrdVo);
            return instrumentIrdService.delete(instrumentIrd);
            }

            @ApiOperation("Deletes a instrumentIrd by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return instrumentIrdService.deleteById(id);
            }
        @ApiOperation("find by typeInstrumentIrd code")
        @GetMapping("/typeInstrumentIrd/code/{code}")
        public List<InstrumentIrd> findByTypeInstrumentIrdCode(@PathVariable String code){
        return instrumentIrdService.findByTypeInstrumentIrdCode(code);
        }

        @ApiOperation("delete by typeInstrumentIrd code")
        @DeleteMapping("/typeInstrumentIrd/code/{code}")
        public int deleteByTypeInstrumentIrdCode(@PathVariable String code){
        return instrumentIrdService.deleteByTypeInstrumentIrdCode(code);
        }

        @ApiOperation("find by typeInstrumentIrd id")
        @GetMapping("/typeInstrumentIrd/id/{id}")
        public List<InstrumentIrd> findByTypeInstrumentIrdId(@PathVariable Long id){
        return instrumentIrdService.findByTypeInstrumentIrdId(id);
        }

        @ApiOperation("delete by typeInstrumentIrd id")
        @DeleteMapping("/typeInstrumentIrd/id/{id}")
        public int deleteByTypeInstrumentIrdId(@PathVariable Long id){
        return instrumentIrdService.deleteByTypeInstrumentIrdId(id);
        }



            @PutMapping("/archiver/")
            public InstrumentIrdVo archiver(@RequestBody InstrumentIrdVo instrumentIrdVo){
                InstrumentIrd instrumentIrd = instrumentIrdService.archiver(instrumentIrdConverter.toItem(instrumentIrdVo));
                return instrumentIrdConverter.toVo(instrumentIrd);
                }

            @PutMapping("/desarchiver/")
            public InstrumentIrdVo desarchiver(@RequestBody InstrumentIrdVo instrumentIrdVo){
                InstrumentIrd instrumentIrd = instrumentIrdService.desarchiver(instrumentIrdConverter.toItem(instrumentIrdVo));
                return instrumentIrdConverter.toVo(instrumentIrd);}
            }
