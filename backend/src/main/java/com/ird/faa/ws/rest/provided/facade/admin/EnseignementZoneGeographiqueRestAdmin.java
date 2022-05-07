package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EnseignementZoneGeographiqueAdminService;

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
import com.ird.faa.bean.EnseignementZoneGeographique;
import com.ird.faa.ws.rest.provided.converter.EnseignementZoneGeographiqueConverter;
import com.ird.faa.ws.rest.provided.vo.EnseignementZoneGeographiqueVo;

@Api("Manages enseignementZoneGeographique services")
@RestController
@RequestMapping("api/admin/enseignementZoneGeographique")
public class EnseignementZoneGeographiqueRestAdmin {

@Autowired
private EnseignementZoneGeographiqueAdminService enseignementZoneGeographiqueService;

@Autowired
private EnseignementZoneGeographiqueConverter enseignementZoneGeographiqueConverter;


            @ApiOperation("Updates the specified  enseignementZoneGeographique")
            @PutMapping("/")
            public  EnseignementZoneGeographiqueVo update(@RequestBody  EnseignementZoneGeographiqueVo  enseignementZoneGeographiqueVo){
            EnseignementZoneGeographique enseignementZoneGeographique = enseignementZoneGeographiqueConverter.toItem(enseignementZoneGeographiqueVo);
            enseignementZoneGeographique = enseignementZoneGeographiqueService.update(enseignementZoneGeographique);
            return enseignementZoneGeographiqueConverter.toVo(enseignementZoneGeographique);
            }

    @ApiOperation("Finds a list of all enseignementZoneGeographiques")
    @GetMapping("/")
    public List<EnseignementZoneGeographiqueVo> findAll(){
        return enseignementZoneGeographiqueConverter.toVo(enseignementZoneGeographiqueService.findAll());
    }

    @ApiOperation("Finds a enseignementZoneGeographique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EnseignementZoneGeographiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return enseignementZoneGeographiqueConverter.toVo(enseignementZoneGeographiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search enseignementZoneGeographique by a specific criteria")
    @PostMapping("/search")
    public List<EnseignementZoneGeographiqueVo> findByCriteria(@RequestBody EnseignementZoneGeographiqueVo enseignementZoneGeographiqueVo){
        return enseignementZoneGeographiqueConverter.toVo(enseignementZoneGeographiqueService.findByCriteria(enseignementZoneGeographiqueVo));
        }

            @ApiOperation("Finds a enseignementZoneGeographique by id")
            @GetMapping("/id/{id}")
            public EnseignementZoneGeographiqueVo findById(@PathVariable Long id){
            return enseignementZoneGeographiqueConverter.toVo(enseignementZoneGeographiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  enseignementZoneGeographique")
            @PostMapping("/")
            public EnseignementZoneGeographiqueVo save(@RequestBody EnseignementZoneGeographiqueVo enseignementZoneGeographiqueVo){
            EnseignementZoneGeographique enseignementZoneGeographique = enseignementZoneGeographiqueConverter.toItem(enseignementZoneGeographiqueVo);
            enseignementZoneGeographique = enseignementZoneGeographiqueService.save(enseignementZoneGeographique);
            return enseignementZoneGeographiqueConverter.toVo(enseignementZoneGeographique);
            }

            @ApiOperation("Delete the specified enseignementZoneGeographique")
            @DeleteMapping("/")
            public int delete(@RequestBody EnseignementZoneGeographiqueVo enseignementZoneGeographiqueVo){
            EnseignementZoneGeographique enseignementZoneGeographique = enseignementZoneGeographiqueConverter.toItem(enseignementZoneGeographiqueVo);
            return enseignementZoneGeographiqueService.delete(enseignementZoneGeographique);
            }

            @ApiOperation("Deletes a enseignementZoneGeographique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return enseignementZoneGeographiqueService.deleteById(id);
            }
        @ApiOperation("find by enseignement id")
        @GetMapping("/enseignement/id/{id}")
        public List<EnseignementZoneGeographique> findByEnseignementId(@PathVariable Long id){
        return enseignementZoneGeographiqueService.findByEnseignementId(id);
        }

        @ApiOperation("delete by enseignement id")
        @DeleteMapping("/enseignement/id/{id}")
        public int deleteByEnseignementId(@PathVariable Long id){
        return enseignementZoneGeographiqueService.deleteByEnseignementId(id);
        }

        @ApiOperation("find by zoneGeographique code")
        @GetMapping("/zoneGeographique/code/{code}")
        public List<EnseignementZoneGeographique> findByZoneGeographiqueCode(@PathVariable String code){
        return enseignementZoneGeographiqueService.findByZoneGeographiqueCode(code);
        }

        @ApiOperation("delete by zoneGeographique code")
        @DeleteMapping("/zoneGeographique/code/{code}")
        public int deleteByZoneGeographiqueCode(@PathVariable String code){
        return enseignementZoneGeographiqueService.deleteByZoneGeographiqueCode(code);
        }

        @ApiOperation("find by zoneGeographique id")
        @GetMapping("/zoneGeographique/id/{id}")
        public List<EnseignementZoneGeographique> findByZoneGeographiqueId(@PathVariable Long id){
        return enseignementZoneGeographiqueService.findByZoneGeographiqueId(id);
        }

        @ApiOperation("delete by zoneGeographique id")
        @DeleteMapping("/zoneGeographique/id/{id}")
        public int deleteByZoneGeographiqueId(@PathVariable Long id){
        return enseignementZoneGeographiqueService.deleteByZoneGeographiqueId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<EnseignementZoneGeographique> findByPaysCode(@PathVariable String code){
        return enseignementZoneGeographiqueService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return enseignementZoneGeographiqueService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<EnseignementZoneGeographique> findByPaysId(@PathVariable Long id){
        return enseignementZoneGeographiqueService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return enseignementZoneGeographiqueService.deleteByPaysId(id);
        }



            }
