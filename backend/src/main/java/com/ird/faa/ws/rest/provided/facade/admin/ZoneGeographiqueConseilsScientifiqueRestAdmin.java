package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.ZoneGeographiqueConseilsScientifiqueAdminService;

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
import com.ird.faa.bean.ZoneGeographiqueConseilsScientifique;
import com.ird.faa.ws.rest.provided.converter.ZoneGeographiqueConseilsScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.ZoneGeographiqueConseilsScientifiqueVo;

@Api("Manages zoneGeographiqueConseilsScientifique services")
@RestController
@RequestMapping("api/admin/zoneGeographiqueConseilsScientifique")
public class ZoneGeographiqueConseilsScientifiqueRestAdmin {

@Autowired
private ZoneGeographiqueConseilsScientifiqueAdminService zoneGeographiqueConseilsScientifiqueService;

@Autowired
private ZoneGeographiqueConseilsScientifiqueConverter zoneGeographiqueConseilsScientifiqueConverter;


            @ApiOperation("Updates the specified  zoneGeographiqueConseilsScientifique")
            @PutMapping("/")
            public  ZoneGeographiqueConseilsScientifiqueVo update(@RequestBody  ZoneGeographiqueConseilsScientifiqueVo  zoneGeographiqueConseilsScientifiqueVo){
            ZoneGeographiqueConseilsScientifique zoneGeographiqueConseilsScientifique = zoneGeographiqueConseilsScientifiqueConverter.toItem(zoneGeographiqueConseilsScientifiqueVo);
            zoneGeographiqueConseilsScientifique = zoneGeographiqueConseilsScientifiqueService.update(zoneGeographiqueConseilsScientifique);
            return zoneGeographiqueConseilsScientifiqueConverter.toVo(zoneGeographiqueConseilsScientifique);
            }

    @ApiOperation("Finds a list of all zoneGeographiqueConseilsScientifiques")
    @GetMapping("/")
    public List<ZoneGeographiqueConseilsScientifiqueVo> findAll(){
        return zoneGeographiqueConseilsScientifiqueConverter.toVo(zoneGeographiqueConseilsScientifiqueService.findAll());
    }

    @ApiOperation("Finds a zoneGeographiqueConseilsScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ZoneGeographiqueConseilsScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return zoneGeographiqueConseilsScientifiqueConverter.toVo(zoneGeographiqueConseilsScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search zoneGeographiqueConseilsScientifique by a specific criteria")
    @PostMapping("/search")
    public List<ZoneGeographiqueConseilsScientifiqueVo> findByCriteria(@RequestBody ZoneGeographiqueConseilsScientifiqueVo zoneGeographiqueConseilsScientifiqueVo){
        return zoneGeographiqueConseilsScientifiqueConverter.toVo(zoneGeographiqueConseilsScientifiqueService.findByCriteria(zoneGeographiqueConseilsScientifiqueVo));
        }

            @ApiOperation("Finds a zoneGeographiqueConseilsScientifique by id")
            @GetMapping("/id/{id}")
            public ZoneGeographiqueConseilsScientifiqueVo findById(@PathVariable Long id){
            return zoneGeographiqueConseilsScientifiqueConverter.toVo(zoneGeographiqueConseilsScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  zoneGeographiqueConseilsScientifique")
            @PostMapping("/")
            public ZoneGeographiqueConseilsScientifiqueVo save(@RequestBody ZoneGeographiqueConseilsScientifiqueVo zoneGeographiqueConseilsScientifiqueVo){
            ZoneGeographiqueConseilsScientifique zoneGeographiqueConseilsScientifique = zoneGeographiqueConseilsScientifiqueConverter.toItem(zoneGeographiqueConseilsScientifiqueVo);
            zoneGeographiqueConseilsScientifique = zoneGeographiqueConseilsScientifiqueService.save(zoneGeographiqueConseilsScientifique);
            return zoneGeographiqueConseilsScientifiqueConverter.toVo(zoneGeographiqueConseilsScientifique);
            }

            @ApiOperation("Delete the specified zoneGeographiqueConseilsScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody ZoneGeographiqueConseilsScientifiqueVo zoneGeographiqueConseilsScientifiqueVo){
            ZoneGeographiqueConseilsScientifique zoneGeographiqueConseilsScientifique = zoneGeographiqueConseilsScientifiqueConverter.toItem(zoneGeographiqueConseilsScientifiqueVo);
            return zoneGeographiqueConseilsScientifiqueService.delete(zoneGeographiqueConseilsScientifique);
            }

            @ApiOperation("Deletes a zoneGeographiqueConseilsScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return zoneGeographiqueConseilsScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by conseilsScientifique id")
        @GetMapping("/conseilsScientifique/id/{id}")
        public List<ZoneGeographiqueConseilsScientifique> findByConseilsScientifiqueId(@PathVariable Long id){
        return zoneGeographiqueConseilsScientifiqueService.findByConseilsScientifiqueId(id);
        }

        @ApiOperation("delete by conseilsScientifique id")
        @DeleteMapping("/conseilsScientifique/id/{id}")
        public int deleteByConseilsScientifiqueId(@PathVariable Long id){
        return zoneGeographiqueConseilsScientifiqueService.deleteByConseilsScientifiqueId(id);
        }

        @ApiOperation("find by zoneGeographique code")
        @GetMapping("/zoneGeographique/code/{code}")
        public List<ZoneGeographiqueConseilsScientifique> findByZoneGeographiqueCode(@PathVariable String code){
        return zoneGeographiqueConseilsScientifiqueService.findByZoneGeographiqueCode(code);
        }

        @ApiOperation("delete by zoneGeographique code")
        @DeleteMapping("/zoneGeographique/code/{code}")
        public int deleteByZoneGeographiqueCode(@PathVariable String code){
        return zoneGeographiqueConseilsScientifiqueService.deleteByZoneGeographiqueCode(code);
        }

        @ApiOperation("find by zoneGeographique id")
        @GetMapping("/zoneGeographique/id/{id}")
        public List<ZoneGeographiqueConseilsScientifique> findByZoneGeographiqueId(@PathVariable Long id){
        return zoneGeographiqueConseilsScientifiqueService.findByZoneGeographiqueId(id);
        }

        @ApiOperation("delete by zoneGeographique id")
        @DeleteMapping("/zoneGeographique/id/{id}")
        public int deleteByZoneGeographiqueId(@PathVariable Long id){
        return zoneGeographiqueConseilsScientifiqueService.deleteByZoneGeographiqueId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<ZoneGeographiqueConseilsScientifique> findByPaysCode(@PathVariable String code){
        return zoneGeographiqueConseilsScientifiqueService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return zoneGeographiqueConseilsScientifiqueService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<ZoneGeographiqueConseilsScientifique> findByPaysId(@PathVariable Long id){
        return zoneGeographiqueConseilsScientifiqueService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return zoneGeographiqueConseilsScientifiqueService.deleteByPaysId(id);
        }



            }
