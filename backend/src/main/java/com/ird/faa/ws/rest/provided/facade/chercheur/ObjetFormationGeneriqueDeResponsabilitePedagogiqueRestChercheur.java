package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ObjetFormationGeneriqueDeResponsabilitePedagogiqueChercheurService;

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
import com.ird.faa.bean.ObjetFormationGeneriqueDeResponsabilitePedagogique;
import com.ird.faa.ws.rest.provided.converter.ObjetFormationGeneriqueDeResponsabilitePedagogiqueConverter;
import com.ird.faa.ws.rest.provided.vo.ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo;

@Api("Manages objetFormationGeneriqueDeResponsabilitePedagogique services")
@RestController
@RequestMapping("api/chercheur/objetFormationGeneriqueDeResponsabilitePedagogique")
public class ObjetFormationGeneriqueDeResponsabilitePedagogiqueRestChercheur {

@Autowired
private ObjetFormationGeneriqueDeResponsabilitePedagogiqueChercheurService objetFormationGeneriqueDeResponsabilitePedagogiqueService;

@Autowired
private ObjetFormationGeneriqueDeResponsabilitePedagogiqueConverter objetFormationGeneriqueDeResponsabilitePedagogiqueConverter;


            @ApiOperation("Updates the specified  objetFormationGeneriqueDeResponsabilitePedagogique")
            @PutMapping("/")
            public  ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo update(@RequestBody  ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo  objetFormationGeneriqueDeResponsabilitePedagogiqueVo){
            ObjetFormationGeneriqueDeResponsabilitePedagogique objetFormationGeneriqueDeResponsabilitePedagogique = objetFormationGeneriqueDeResponsabilitePedagogiqueConverter.toItem(objetFormationGeneriqueDeResponsabilitePedagogiqueVo);
            objetFormationGeneriqueDeResponsabilitePedagogique = objetFormationGeneriqueDeResponsabilitePedagogiqueService.update(objetFormationGeneriqueDeResponsabilitePedagogique);
            return objetFormationGeneriqueDeResponsabilitePedagogiqueConverter.toVo(objetFormationGeneriqueDeResponsabilitePedagogique);
            }

    @ApiOperation("Finds a list of all objetFormationGeneriqueDeResponsabilitePedagogiques")
    @GetMapping("/")
    public List<ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo> findAll(){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueConverter.toVo(objetFormationGeneriqueDeResponsabilitePedagogiqueService.findAll());
    }

    @ApiOperation("Finds a objetFormationGeneriqueDeResponsabilitePedagogique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return objetFormationGeneriqueDeResponsabilitePedagogiqueConverter.toVo(objetFormationGeneriqueDeResponsabilitePedagogiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search objetFormationGeneriqueDeResponsabilitePedagogique by a specific criteria")
    @PostMapping("/search")
    public List<ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo> findByCriteria(@RequestBody ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo objetFormationGeneriqueDeResponsabilitePedagogiqueVo){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueConverter.toVo(objetFormationGeneriqueDeResponsabilitePedagogiqueService.findByCriteria(objetFormationGeneriqueDeResponsabilitePedagogiqueVo));
        }

            @ApiOperation("Finds a objetFormationGeneriqueDeResponsabilitePedagogique by id")
            @GetMapping("/id/{id}")
            public ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo findById(@PathVariable Long id){
            return objetFormationGeneriqueDeResponsabilitePedagogiqueConverter.toVo(objetFormationGeneriqueDeResponsabilitePedagogiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  objetFormationGeneriqueDeResponsabilitePedagogique")
            @PostMapping("/")
            public ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo save(@RequestBody ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo objetFormationGeneriqueDeResponsabilitePedagogiqueVo){
            ObjetFormationGeneriqueDeResponsabilitePedagogique objetFormationGeneriqueDeResponsabilitePedagogique = objetFormationGeneriqueDeResponsabilitePedagogiqueConverter.toItem(objetFormationGeneriqueDeResponsabilitePedagogiqueVo);
            objetFormationGeneriqueDeResponsabilitePedagogique = objetFormationGeneriqueDeResponsabilitePedagogiqueService.save(objetFormationGeneriqueDeResponsabilitePedagogique);
            return objetFormationGeneriqueDeResponsabilitePedagogiqueConverter.toVo(objetFormationGeneriqueDeResponsabilitePedagogique);
            }

            @ApiOperation("Delete the specified objetFormationGeneriqueDeResponsabilitePedagogique")
            @DeleteMapping("/")
            public int delete(@RequestBody ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo objetFormationGeneriqueDeResponsabilitePedagogiqueVo){
            ObjetFormationGeneriqueDeResponsabilitePedagogique objetFormationGeneriqueDeResponsabilitePedagogique = objetFormationGeneriqueDeResponsabilitePedagogiqueConverter.toItem(objetFormationGeneriqueDeResponsabilitePedagogiqueVo);
            return objetFormationGeneriqueDeResponsabilitePedagogiqueService.delete(objetFormationGeneriqueDeResponsabilitePedagogique);
            }

            @ApiOperation("Deletes a objetFormationGeneriqueDeResponsabilitePedagogique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return objetFormationGeneriqueDeResponsabilitePedagogiqueService.deleteById(id);
            }
        @ApiOperation("find by objetFormationGenerique code")
        @GetMapping("/objetFormationGenerique/code/{code}")
        public List<ObjetFormationGeneriqueDeResponsabilitePedagogique> findByObjetFormationGeneriqueCode(@PathVariable String code){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueService.findByObjetFormationGeneriqueCode(code);
        }

        @ApiOperation("delete by objetFormationGenerique code")
        @DeleteMapping("/objetFormationGenerique/code/{code}")
        public int deleteByObjetFormationGeneriqueCode(@PathVariable String code){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueService.deleteByObjetFormationGeneriqueCode(code);
        }

        @ApiOperation("find by objetFormationGenerique id")
        @GetMapping("/objetFormationGenerique/id/{id}")
        public List<ObjetFormationGeneriqueDeResponsabilitePedagogique> findByObjetFormationGeneriqueId(@PathVariable Long id){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueService.findByObjetFormationGeneriqueId(id);
        }

        @ApiOperation("delete by objetFormationGenerique id")
        @DeleteMapping("/objetFormationGenerique/id/{id}")
        public int deleteByObjetFormationGeneriqueId(@PathVariable Long id){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueService.deleteByObjetFormationGeneriqueId(id);
        }

        @ApiOperation("find by responsabilitePedagogique id")
        @GetMapping("/responsabilitePedagogique/id/{id}")
        public List<ObjetFormationGeneriqueDeResponsabilitePedagogique> findByResponsabilitePedagogiqueId(@PathVariable Long id){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueService.findByResponsabilitePedagogiqueId(id);
        }

        @ApiOperation("delete by responsabilitePedagogique id")
        @DeleteMapping("/responsabilitePedagogique/id/{id}")
        public int deleteByResponsabilitePedagogiqueId(@PathVariable Long id){
        return objetFormationGeneriqueDeResponsabilitePedagogiqueService.deleteByResponsabilitePedagogiqueId(id);
        }



            }
