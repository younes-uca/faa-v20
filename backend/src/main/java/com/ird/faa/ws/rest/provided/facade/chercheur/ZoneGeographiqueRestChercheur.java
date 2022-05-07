package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ZoneGeographiqueChercheurService;

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
import com.ird.faa.bean.ZoneGeographique;
import com.ird.faa.ws.rest.provided.converter.ZoneGeographiqueConverter;
import com.ird.faa.ws.rest.provided.vo.ZoneGeographiqueVo;

@Api("Manages zoneGeographique services")
@RestController
@RequestMapping("api/chercheur/zoneGeographique")
public class ZoneGeographiqueRestChercheur {

@Autowired
private ZoneGeographiqueChercheurService zoneGeographiqueService;

@Autowired
private ZoneGeographiqueConverter zoneGeographiqueConverter;


            @ApiOperation("Updates the specified  zoneGeographique")
            @PutMapping("/")
            public  ZoneGeographiqueVo update(@RequestBody  ZoneGeographiqueVo  zoneGeographiqueVo){
            ZoneGeographique zoneGeographique = zoneGeographiqueConverter.toItem(zoneGeographiqueVo);
            zoneGeographique = zoneGeographiqueService.update(zoneGeographique);
            return zoneGeographiqueConverter.toVo(zoneGeographique);
            }

    @ApiOperation("Finds a list of all zoneGeographiques")
    @GetMapping("/")
    public List<ZoneGeographiqueVo> findAll(){
        return zoneGeographiqueConverter.toVo(zoneGeographiqueService.findAll());
    }

    @ApiOperation("Finds a zoneGeographique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ZoneGeographiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return zoneGeographiqueConverter.toVo(zoneGeographiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search zoneGeographique by a specific criteria")
    @PostMapping("/search")
    public List<ZoneGeographiqueVo> findByCriteria(@RequestBody ZoneGeographiqueVo zoneGeographiqueVo){
        return zoneGeographiqueConverter.toVo(zoneGeographiqueService.findByCriteria(zoneGeographiqueVo));
        }

            @ApiOperation("Finds a zoneGeographique by id")
            @GetMapping("/id/{id}")
            public ZoneGeographiqueVo findById(@PathVariable Long id){
            return zoneGeographiqueConverter.toVo(zoneGeographiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  zoneGeographique")
            @PostMapping("/")
            public ZoneGeographiqueVo save(@RequestBody ZoneGeographiqueVo zoneGeographiqueVo){
            ZoneGeographique zoneGeographique = zoneGeographiqueConverter.toItem(zoneGeographiqueVo);
            zoneGeographique = zoneGeographiqueService.save(zoneGeographique);
            return zoneGeographiqueConverter.toVo(zoneGeographique);
            }

            @ApiOperation("Delete the specified zoneGeographique")
            @DeleteMapping("/")
            public int delete(@RequestBody ZoneGeographiqueVo zoneGeographiqueVo){
            ZoneGeographique zoneGeographique = zoneGeographiqueConverter.toItem(zoneGeographiqueVo);
            return zoneGeographiqueService.delete(zoneGeographique);
            }

            @ApiOperation("Deletes a zoneGeographique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return zoneGeographiqueService.deleteById(id);
            }


            }
