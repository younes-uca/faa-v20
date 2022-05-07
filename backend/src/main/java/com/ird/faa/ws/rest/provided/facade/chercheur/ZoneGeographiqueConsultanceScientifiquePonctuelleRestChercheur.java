package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ZoneGeographiqueConsultanceScientifiquePonctuelleChercheurService;

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
import com.ird.faa.bean.ZoneGeographiqueConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.converter.ZoneGeographiqueConsultanceScientifiquePonctuelleConverter;
import com.ird.faa.ws.rest.provided.vo.ZoneGeographiqueConsultanceScientifiquePonctuelleVo;

@Api("Manages zoneGeographiqueConsultanceScientifiquePonctuelle services")
@RestController
@RequestMapping("api/chercheur/zoneGeographiqueConsultanceScientifiquePonctuelle")
public class ZoneGeographiqueConsultanceScientifiquePonctuelleRestChercheur {

@Autowired
private ZoneGeographiqueConsultanceScientifiquePonctuelleChercheurService zoneGeographiqueConsultanceScientifiquePonctuelleService;

@Autowired
private ZoneGeographiqueConsultanceScientifiquePonctuelleConverter zoneGeographiqueConsultanceScientifiquePonctuelleConverter;


            @ApiOperation("Updates the specified  zoneGeographiqueConsultanceScientifiquePonctuelle")
            @PutMapping("/")
            public  ZoneGeographiqueConsultanceScientifiquePonctuelleVo update(@RequestBody  ZoneGeographiqueConsultanceScientifiquePonctuelleVo  zoneGeographiqueConsultanceScientifiquePonctuelleVo){
            ZoneGeographiqueConsultanceScientifiquePonctuelle zoneGeographiqueConsultanceScientifiquePonctuelle = zoneGeographiqueConsultanceScientifiquePonctuelleConverter.toItem(zoneGeographiqueConsultanceScientifiquePonctuelleVo);
            zoneGeographiqueConsultanceScientifiquePonctuelle = zoneGeographiqueConsultanceScientifiquePonctuelleService.update(zoneGeographiqueConsultanceScientifiquePonctuelle);
            return zoneGeographiqueConsultanceScientifiquePonctuelleConverter.toVo(zoneGeographiqueConsultanceScientifiquePonctuelle);
            }

    @ApiOperation("Finds a list of all zoneGeographiqueConsultanceScientifiquePonctuelles")
    @GetMapping("/")
    public List<ZoneGeographiqueConsultanceScientifiquePonctuelleVo> findAll(){
        return zoneGeographiqueConsultanceScientifiquePonctuelleConverter.toVo(zoneGeographiqueConsultanceScientifiquePonctuelleService.findAll());
    }

    @ApiOperation("Finds a zoneGeographiqueConsultanceScientifiquePonctuelle with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ZoneGeographiqueConsultanceScientifiquePonctuelleVo findByIdWithAssociatedList(@PathVariable Long id){
    return zoneGeographiqueConsultanceScientifiquePonctuelleConverter.toVo(zoneGeographiqueConsultanceScientifiquePonctuelleService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search zoneGeographiqueConsultanceScientifiquePonctuelle by a specific criteria")
    @PostMapping("/search")
    public List<ZoneGeographiqueConsultanceScientifiquePonctuelleVo> findByCriteria(@RequestBody ZoneGeographiqueConsultanceScientifiquePonctuelleVo zoneGeographiqueConsultanceScientifiquePonctuelleVo){
        return zoneGeographiqueConsultanceScientifiquePonctuelleConverter.toVo(zoneGeographiqueConsultanceScientifiquePonctuelleService.findByCriteria(zoneGeographiqueConsultanceScientifiquePonctuelleVo));
        }

            @ApiOperation("Finds a zoneGeographiqueConsultanceScientifiquePonctuelle by id")
            @GetMapping("/id/{id}")
            public ZoneGeographiqueConsultanceScientifiquePonctuelleVo findById(@PathVariable Long id){
            return zoneGeographiqueConsultanceScientifiquePonctuelleConverter.toVo(zoneGeographiqueConsultanceScientifiquePonctuelleService.findById(id));
            }

            @ApiOperation("Saves the specified  zoneGeographiqueConsultanceScientifiquePonctuelle")
            @PostMapping("/")
            public ZoneGeographiqueConsultanceScientifiquePonctuelleVo save(@RequestBody ZoneGeographiqueConsultanceScientifiquePonctuelleVo zoneGeographiqueConsultanceScientifiquePonctuelleVo){
            ZoneGeographiqueConsultanceScientifiquePonctuelle zoneGeographiqueConsultanceScientifiquePonctuelle = zoneGeographiqueConsultanceScientifiquePonctuelleConverter.toItem(zoneGeographiqueConsultanceScientifiquePonctuelleVo);
            zoneGeographiqueConsultanceScientifiquePonctuelle = zoneGeographiqueConsultanceScientifiquePonctuelleService.save(zoneGeographiqueConsultanceScientifiquePonctuelle);
            return zoneGeographiqueConsultanceScientifiquePonctuelleConverter.toVo(zoneGeographiqueConsultanceScientifiquePonctuelle);
            }

            @ApiOperation("Delete the specified zoneGeographiqueConsultanceScientifiquePonctuelle")
            @DeleteMapping("/")
            public int delete(@RequestBody ZoneGeographiqueConsultanceScientifiquePonctuelleVo zoneGeographiqueConsultanceScientifiquePonctuelleVo){
            ZoneGeographiqueConsultanceScientifiquePonctuelle zoneGeographiqueConsultanceScientifiquePonctuelle = zoneGeographiqueConsultanceScientifiquePonctuelleConverter.toItem(zoneGeographiqueConsultanceScientifiquePonctuelleVo);
            return zoneGeographiqueConsultanceScientifiquePonctuelleService.delete(zoneGeographiqueConsultanceScientifiquePonctuelle);
            }

            @ApiOperation("Deletes a zoneGeographiqueConsultanceScientifiquePonctuelle by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return zoneGeographiqueConsultanceScientifiquePonctuelleService.deleteById(id);
            }
        @ApiOperation("find by consultanceScientifiquePonctuelle id")
        @GetMapping("/consultanceScientifiquePonctuelle/id/{id}")
        public List<ZoneGeographiqueConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(@PathVariable Long id){
        return zoneGeographiqueConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(id);
        }

        @ApiOperation("delete by consultanceScientifiquePonctuelle id")
        @DeleteMapping("/consultanceScientifiquePonctuelle/id/{id}")
        public int deleteByConsultanceScientifiquePonctuelleId(@PathVariable Long id){
        return zoneGeographiqueConsultanceScientifiquePonctuelleService.deleteByConsultanceScientifiquePonctuelleId(id);
        }

        @ApiOperation("find by zoneGeographique code")
        @GetMapping("/zoneGeographique/code/{code}")
        public List<ZoneGeographiqueConsultanceScientifiquePonctuelle> findByZoneGeographiqueCode(@PathVariable String code){
        return zoneGeographiqueConsultanceScientifiquePonctuelleService.findByZoneGeographiqueCode(code);
        }

        @ApiOperation("delete by zoneGeographique code")
        @DeleteMapping("/zoneGeographique/code/{code}")
        public int deleteByZoneGeographiqueCode(@PathVariable String code){
        return zoneGeographiqueConsultanceScientifiquePonctuelleService.deleteByZoneGeographiqueCode(code);
        }

        @ApiOperation("find by zoneGeographique id")
        @GetMapping("/zoneGeographique/id/{id}")
        public List<ZoneGeographiqueConsultanceScientifiquePonctuelle> findByZoneGeographiqueId(@PathVariable Long id){
        return zoneGeographiqueConsultanceScientifiquePonctuelleService.findByZoneGeographiqueId(id);
        }

        @ApiOperation("delete by zoneGeographique id")
        @DeleteMapping("/zoneGeographique/id/{id}")
        public int deleteByZoneGeographiqueId(@PathVariable Long id){
        return zoneGeographiqueConsultanceScientifiquePonctuelleService.deleteByZoneGeographiqueId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<ZoneGeographiqueConsultanceScientifiquePonctuelle> findByPaysCode(@PathVariable String code){
        return zoneGeographiqueConsultanceScientifiquePonctuelleService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return zoneGeographiqueConsultanceScientifiquePonctuelleService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<ZoneGeographiqueConsultanceScientifiquePonctuelle> findByPaysId(@PathVariable Long id){
        return zoneGeographiqueConsultanceScientifiquePonctuelleService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return zoneGeographiqueConsultanceScientifiquePonctuelleService.deleteByPaysId(id);
        }



            }
