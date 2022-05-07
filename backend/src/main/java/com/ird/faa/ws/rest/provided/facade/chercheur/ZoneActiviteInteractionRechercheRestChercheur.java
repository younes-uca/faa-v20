package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ZoneActiviteInteractionRechercheChercheurService;

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
import com.ird.faa.bean.ZoneActiviteInteractionRecherche;
import com.ird.faa.ws.rest.provided.converter.ZoneActiviteInteractionRechercheConverter;
import com.ird.faa.ws.rest.provided.vo.ZoneActiviteInteractionRechercheVo;

@Api("Manages zoneActiviteInteractionRecherche services")
@RestController
@RequestMapping("api/chercheur/zoneActiviteInteractionRecherche")
public class ZoneActiviteInteractionRechercheRestChercheur {

@Autowired
private ZoneActiviteInteractionRechercheChercheurService zoneActiviteInteractionRechercheService;

@Autowired
private ZoneActiviteInteractionRechercheConverter zoneActiviteInteractionRechercheConverter;


            @ApiOperation("Updates the specified  zoneActiviteInteractionRecherche")
            @PutMapping("/")
            public  ZoneActiviteInteractionRechercheVo update(@RequestBody  ZoneActiviteInteractionRechercheVo  zoneActiviteInteractionRechercheVo){
            ZoneActiviteInteractionRecherche zoneActiviteInteractionRecherche = zoneActiviteInteractionRechercheConverter.toItem(zoneActiviteInteractionRechercheVo);
            zoneActiviteInteractionRecherche = zoneActiviteInteractionRechercheService.update(zoneActiviteInteractionRecherche);
            return zoneActiviteInteractionRechercheConverter.toVo(zoneActiviteInteractionRecherche);
            }

    @ApiOperation("Finds a list of all zoneActiviteInteractionRecherches")
    @GetMapping("/")
    public List<ZoneActiviteInteractionRechercheVo> findAll(){
        return zoneActiviteInteractionRechercheConverter.toVo(zoneActiviteInteractionRechercheService.findAll());
    }

    @ApiOperation("Finds a zoneActiviteInteractionRecherche with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ZoneActiviteInteractionRechercheVo findByIdWithAssociatedList(@PathVariable Long id){
    return zoneActiviteInteractionRechercheConverter.toVo(zoneActiviteInteractionRechercheService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search zoneActiviteInteractionRecherche by a specific criteria")
    @PostMapping("/search")
    public List<ZoneActiviteInteractionRechercheVo> findByCriteria(@RequestBody ZoneActiviteInteractionRechercheVo zoneActiviteInteractionRechercheVo){
        return zoneActiviteInteractionRechercheConverter.toVo(zoneActiviteInteractionRechercheService.findByCriteria(zoneActiviteInteractionRechercheVo));
        }

            @ApiOperation("Finds a zoneActiviteInteractionRecherche by id")
            @GetMapping("/id/{id}")
            public ZoneActiviteInteractionRechercheVo findById(@PathVariable Long id){
            return zoneActiviteInteractionRechercheConverter.toVo(zoneActiviteInteractionRechercheService.findById(id));
            }

            @ApiOperation("Saves the specified  zoneActiviteInteractionRecherche")
            @PostMapping("/")
            public ZoneActiviteInteractionRechercheVo save(@RequestBody ZoneActiviteInteractionRechercheVo zoneActiviteInteractionRechercheVo){
            ZoneActiviteInteractionRecherche zoneActiviteInteractionRecherche = zoneActiviteInteractionRechercheConverter.toItem(zoneActiviteInteractionRechercheVo);
            zoneActiviteInteractionRecherche = zoneActiviteInteractionRechercheService.save(zoneActiviteInteractionRecherche);
            return zoneActiviteInteractionRechercheConverter.toVo(zoneActiviteInteractionRecherche);
            }

            @ApiOperation("Delete the specified zoneActiviteInteractionRecherche")
            @DeleteMapping("/")
            public int delete(@RequestBody ZoneActiviteInteractionRechercheVo zoneActiviteInteractionRechercheVo){
            ZoneActiviteInteractionRecherche zoneActiviteInteractionRecherche = zoneActiviteInteractionRechercheConverter.toItem(zoneActiviteInteractionRechercheVo);
            return zoneActiviteInteractionRechercheService.delete(zoneActiviteInteractionRecherche);
            }

            @ApiOperation("Deletes a zoneActiviteInteractionRecherche by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return zoneActiviteInteractionRechercheService.deleteById(id);
            }
        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<ZoneActiviteInteractionRecherche> findByPaysCode(@PathVariable String code){
        return zoneActiviteInteractionRechercheService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return zoneActiviteInteractionRechercheService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<ZoneActiviteInteractionRecherche> findByPaysId(@PathVariable Long id){
        return zoneActiviteInteractionRechercheService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return zoneActiviteInteractionRechercheService.deleteByPaysId(id);
        }

        @ApiOperation("find by zoneGeographique code")
        @GetMapping("/zoneGeographique/code/{code}")
        public List<ZoneActiviteInteractionRecherche> findByZoneGeographiqueCode(@PathVariable String code){
        return zoneActiviteInteractionRechercheService.findByZoneGeographiqueCode(code);
        }

        @ApiOperation("delete by zoneGeographique code")
        @DeleteMapping("/zoneGeographique/code/{code}")
        public int deleteByZoneGeographiqueCode(@PathVariable String code){
        return zoneActiviteInteractionRechercheService.deleteByZoneGeographiqueCode(code);
        }

        @ApiOperation("find by zoneGeographique id")
        @GetMapping("/zoneGeographique/id/{id}")
        public List<ZoneActiviteInteractionRecherche> findByZoneGeographiqueId(@PathVariable Long id){
        return zoneActiviteInteractionRechercheService.findByZoneGeographiqueId(id);
        }

        @ApiOperation("delete by zoneGeographique id")
        @DeleteMapping("/zoneGeographique/id/{id}")
        public int deleteByZoneGeographiqueId(@PathVariable Long id){
        return zoneActiviteInteractionRechercheService.deleteByZoneGeographiqueId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<ZoneActiviteInteractionRecherche> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return zoneActiviteInteractionRechercheService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return zoneActiviteInteractionRechercheService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<ZoneActiviteInteractionRecherche> findByChercheurId(@PathVariable Long id){
        return zoneActiviteInteractionRechercheService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return zoneActiviteInteractionRechercheService.deleteByChercheurId(id);
        }



            }
