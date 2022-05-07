package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.ZoneGeographiqueFormationContinueAdminService;

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
import com.ird.faa.bean.ZoneGeographiqueFormationContinue;
import com.ird.faa.ws.rest.provided.converter.ZoneGeographiqueFormationContinueConverter;
import com.ird.faa.ws.rest.provided.vo.ZoneGeographiqueFormationContinueVo;

@Api("Manages zoneGeographiqueFormationContinue services")
@RestController
@RequestMapping("api/admin/zoneGeographiqueFormationContinue")
public class ZoneGeographiqueFormationContinueRestAdmin {

@Autowired
private ZoneGeographiqueFormationContinueAdminService zoneGeographiqueFormationContinueService;

@Autowired
private ZoneGeographiqueFormationContinueConverter zoneGeographiqueFormationContinueConverter;


            @ApiOperation("Updates the specified  zoneGeographiqueFormationContinue")
            @PutMapping("/")
            public  ZoneGeographiqueFormationContinueVo update(@RequestBody  ZoneGeographiqueFormationContinueVo  zoneGeographiqueFormationContinueVo){
            ZoneGeographiqueFormationContinue zoneGeographiqueFormationContinue = zoneGeographiqueFormationContinueConverter.toItem(zoneGeographiqueFormationContinueVo);
            zoneGeographiqueFormationContinue = zoneGeographiqueFormationContinueService.update(zoneGeographiqueFormationContinue);
            return zoneGeographiqueFormationContinueConverter.toVo(zoneGeographiqueFormationContinue);
            }

    @ApiOperation("Finds a list of all zoneGeographiqueFormationContinues")
    @GetMapping("/")
    public List<ZoneGeographiqueFormationContinueVo> findAll(){
        return zoneGeographiqueFormationContinueConverter.toVo(zoneGeographiqueFormationContinueService.findAll());
    }

    @ApiOperation("Finds a zoneGeographiqueFormationContinue with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ZoneGeographiqueFormationContinueVo findByIdWithAssociatedList(@PathVariable Long id){
    return zoneGeographiqueFormationContinueConverter.toVo(zoneGeographiqueFormationContinueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search zoneGeographiqueFormationContinue by a specific criteria")
    @PostMapping("/search")
    public List<ZoneGeographiqueFormationContinueVo> findByCriteria(@RequestBody ZoneGeographiqueFormationContinueVo zoneGeographiqueFormationContinueVo){
        return zoneGeographiqueFormationContinueConverter.toVo(zoneGeographiqueFormationContinueService.findByCriteria(zoneGeographiqueFormationContinueVo));
        }

            @ApiOperation("Finds a zoneGeographiqueFormationContinue by id")
            @GetMapping("/id/{id}")
            public ZoneGeographiqueFormationContinueVo findById(@PathVariable Long id){
            return zoneGeographiqueFormationContinueConverter.toVo(zoneGeographiqueFormationContinueService.findById(id));
            }

            @ApiOperation("Saves the specified  zoneGeographiqueFormationContinue")
            @PostMapping("/")
            public ZoneGeographiqueFormationContinueVo save(@RequestBody ZoneGeographiqueFormationContinueVo zoneGeographiqueFormationContinueVo){
            ZoneGeographiqueFormationContinue zoneGeographiqueFormationContinue = zoneGeographiqueFormationContinueConverter.toItem(zoneGeographiqueFormationContinueVo);
            zoneGeographiqueFormationContinue = zoneGeographiqueFormationContinueService.save(zoneGeographiqueFormationContinue);
            return zoneGeographiqueFormationContinueConverter.toVo(zoneGeographiqueFormationContinue);
            }

            @ApiOperation("Delete the specified zoneGeographiqueFormationContinue")
            @DeleteMapping("/")
            public int delete(@RequestBody ZoneGeographiqueFormationContinueVo zoneGeographiqueFormationContinueVo){
            ZoneGeographiqueFormationContinue zoneGeographiqueFormationContinue = zoneGeographiqueFormationContinueConverter.toItem(zoneGeographiqueFormationContinueVo);
            return zoneGeographiqueFormationContinueService.delete(zoneGeographiqueFormationContinue);
            }

            @ApiOperation("Deletes a zoneGeographiqueFormationContinue by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return zoneGeographiqueFormationContinueService.deleteById(id);
            }
        @ApiOperation("find by formationContinue id")
        @GetMapping("/formationContinue/id/{id}")
        public List<ZoneGeographiqueFormationContinue> findByFormationContinueId(@PathVariable Long id){
        return zoneGeographiqueFormationContinueService.findByFormationContinueId(id);
        }

        @ApiOperation("delete by formationContinue id")
        @DeleteMapping("/formationContinue/id/{id}")
        public int deleteByFormationContinueId(@PathVariable Long id){
        return zoneGeographiqueFormationContinueService.deleteByFormationContinueId(id);
        }

        @ApiOperation("find by zoneGeographique code")
        @GetMapping("/zoneGeographique/code/{code}")
        public List<ZoneGeographiqueFormationContinue> findByZoneGeographiqueCode(@PathVariable String code){
        return zoneGeographiqueFormationContinueService.findByZoneGeographiqueCode(code);
        }

        @ApiOperation("delete by zoneGeographique code")
        @DeleteMapping("/zoneGeographique/code/{code}")
        public int deleteByZoneGeographiqueCode(@PathVariable String code){
        return zoneGeographiqueFormationContinueService.deleteByZoneGeographiqueCode(code);
        }

        @ApiOperation("find by zoneGeographique id")
        @GetMapping("/zoneGeographique/id/{id}")
        public List<ZoneGeographiqueFormationContinue> findByZoneGeographiqueId(@PathVariable Long id){
        return zoneGeographiqueFormationContinueService.findByZoneGeographiqueId(id);
        }

        @ApiOperation("delete by zoneGeographique id")
        @DeleteMapping("/zoneGeographique/id/{id}")
        public int deleteByZoneGeographiqueId(@PathVariable Long id){
        return zoneGeographiqueFormationContinueService.deleteByZoneGeographiqueId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<ZoneGeographiqueFormationContinue> findByPaysCode(@PathVariable String code){
        return zoneGeographiqueFormationContinueService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return zoneGeographiqueFormationContinueService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<ZoneGeographiqueFormationContinue> findByPaysId(@PathVariable Long id){
        return zoneGeographiqueFormationContinueService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return zoneGeographiqueFormationContinueService.deleteByPaysId(id);
        }



            }
