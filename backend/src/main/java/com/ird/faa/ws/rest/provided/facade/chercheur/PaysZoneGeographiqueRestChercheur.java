package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.PaysZoneGeographiqueChercheurService;

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
import com.ird.faa.bean.PaysZoneGeographique;
import com.ird.faa.ws.rest.provided.converter.PaysZoneGeographiqueConverter;
import com.ird.faa.ws.rest.provided.vo.PaysZoneGeographiqueVo;

@Api("Manages paysZoneGeographique services")
@RestController
@RequestMapping("api/chercheur/paysZoneGeographique")
public class PaysZoneGeographiqueRestChercheur {

@Autowired
private PaysZoneGeographiqueChercheurService paysZoneGeographiqueService;

@Autowired
private PaysZoneGeographiqueConverter paysZoneGeographiqueConverter;


            @ApiOperation("Updates the specified  paysZoneGeographique")
            @PutMapping("/")
            public  PaysZoneGeographiqueVo update(@RequestBody  PaysZoneGeographiqueVo  paysZoneGeographiqueVo){
            PaysZoneGeographique paysZoneGeographique = paysZoneGeographiqueConverter.toItem(paysZoneGeographiqueVo);
            paysZoneGeographique = paysZoneGeographiqueService.update(paysZoneGeographique);
            return paysZoneGeographiqueConverter.toVo(paysZoneGeographique);
            }

    @ApiOperation("Finds a list of all paysZoneGeographiques")
    @GetMapping("/")
    public List<PaysZoneGeographiqueVo> findAll(){
        return paysZoneGeographiqueConverter.toVo(paysZoneGeographiqueService.findAll());
    }

    @ApiOperation("Finds a paysZoneGeographique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public PaysZoneGeographiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return paysZoneGeographiqueConverter.toVo(paysZoneGeographiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search paysZoneGeographique by a specific criteria")
    @PostMapping("/search")
    public List<PaysZoneGeographiqueVo> findByCriteria(@RequestBody PaysZoneGeographiqueVo paysZoneGeographiqueVo){
        return paysZoneGeographiqueConverter.toVo(paysZoneGeographiqueService.findByCriteria(paysZoneGeographiqueVo));
        }

            @ApiOperation("Finds a paysZoneGeographique by id")
            @GetMapping("/id/{id}")
            public PaysZoneGeographiqueVo findById(@PathVariable Long id){
            return paysZoneGeographiqueConverter.toVo(paysZoneGeographiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  paysZoneGeographique")
            @PostMapping("/")
            public PaysZoneGeographiqueVo save(@RequestBody PaysZoneGeographiqueVo paysZoneGeographiqueVo){
            PaysZoneGeographique paysZoneGeographique = paysZoneGeographiqueConverter.toItem(paysZoneGeographiqueVo);
            paysZoneGeographique = paysZoneGeographiqueService.save(paysZoneGeographique);
            return paysZoneGeographiqueConverter.toVo(paysZoneGeographique);
            }

            @ApiOperation("Delete the specified paysZoneGeographique")
            @DeleteMapping("/")
            public int delete(@RequestBody PaysZoneGeographiqueVo paysZoneGeographiqueVo){
            PaysZoneGeographique paysZoneGeographique = paysZoneGeographiqueConverter.toItem(paysZoneGeographiqueVo);
            return paysZoneGeographiqueService.delete(paysZoneGeographique);
            }

            @ApiOperation("Deletes a paysZoneGeographique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return paysZoneGeographiqueService.deleteById(id);
            }
        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<PaysZoneGeographique> findByPaysCode(@PathVariable String code){
        return paysZoneGeographiqueService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return paysZoneGeographiqueService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<PaysZoneGeographique> findByPaysId(@PathVariable Long id){
        return paysZoneGeographiqueService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return paysZoneGeographiqueService.deleteByPaysId(id);
        }

        @ApiOperation("find by zoneGeographique code")
        @GetMapping("/zoneGeographique/code/{code}")
        public List<PaysZoneGeographique> findByZoneGeographiqueCode(@PathVariable String code){
        return paysZoneGeographiqueService.findByZoneGeographiqueCode(code);
        }

        @ApiOperation("delete by zoneGeographique code")
        @DeleteMapping("/zoneGeographique/code/{code}")
        public int deleteByZoneGeographiqueCode(@PathVariable String code){
        return paysZoneGeographiqueService.deleteByZoneGeographiqueCode(code);
        }

        @ApiOperation("find by zoneGeographique id")
        @GetMapping("/zoneGeographique/id/{id}")
        public List<PaysZoneGeographique> findByZoneGeographiqueId(@PathVariable Long id){
        return paysZoneGeographiqueService.findByZoneGeographiqueId(id);
        }

        @ApiOperation("delete by zoneGeographique id")
        @DeleteMapping("/zoneGeographique/id/{id}")
        public int deleteByZoneGeographiqueId(@PathVariable Long id){
        return paysZoneGeographiqueService.deleteByZoneGeographiqueId(id);
        }



            }
