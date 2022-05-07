package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueAdminService;

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
import com.ird.faa.bean.RencontreGrandPubliqueJeunePublique;
import com.ird.faa.ws.rest.provided.converter.RencontreGrandPubliqueJeunePubliqueConverter;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueVo;

@Api("Manages rencontreGrandPubliqueJeunePublique services")
@RestController
@RequestMapping("api/admin/rencontreGrandPubliqueJeunePublique")
public class RencontreGrandPubliqueJeunePubliqueRestAdmin {

@Autowired
private RencontreGrandPubliqueJeunePubliqueAdminService rencontreGrandPubliqueJeunePubliqueService;

@Autowired
private RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter;


            @ApiOperation("Updates the specified  rencontreGrandPubliqueJeunePublique")
            @PutMapping("/")
            public  RencontreGrandPubliqueJeunePubliqueVo update(@RequestBody  RencontreGrandPubliqueJeunePubliqueVo  rencontreGrandPubliqueJeunePubliqueVo){
            RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePubliqueConverter.toItem(rencontreGrandPubliqueJeunePubliqueVo);
            rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePubliqueService.update(rencontreGrandPubliqueJeunePublique);
            return rencontreGrandPubliqueJeunePubliqueConverter.toVo(rencontreGrandPubliqueJeunePublique);
            }

    @ApiOperation("Finds a list of all rencontreGrandPubliqueJeunePubliques")
    @GetMapping("/")
    public List<RencontreGrandPubliqueJeunePubliqueVo> findAll(){
        return rencontreGrandPubliqueJeunePubliqueConverter.toVo(rencontreGrandPubliqueJeunePubliqueService.findAll());
    }

    @ApiOperation("Finds a rencontreGrandPubliqueJeunePublique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public RencontreGrandPubliqueJeunePubliqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return rencontreGrandPubliqueJeunePubliqueConverter.toVo(rencontreGrandPubliqueJeunePubliqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search rencontreGrandPubliqueJeunePublique by a specific criteria")
    @PostMapping("/search")
    public List<RencontreGrandPubliqueJeunePubliqueVo> findByCriteria(@RequestBody RencontreGrandPubliqueJeunePubliqueVo rencontreGrandPubliqueJeunePubliqueVo){
        return rencontreGrandPubliqueJeunePubliqueConverter.toVo(rencontreGrandPubliqueJeunePubliqueService.findByCriteria(rencontreGrandPubliqueJeunePubliqueVo));
        }

            @ApiOperation("Finds a rencontreGrandPubliqueJeunePublique by id")
            @GetMapping("/id/{id}")
            public RencontreGrandPubliqueJeunePubliqueVo findById(@PathVariable Long id){
            return rencontreGrandPubliqueJeunePubliqueConverter.toVo(rencontreGrandPubliqueJeunePubliqueService.findById(id));
            }

            @ApiOperation("Saves the specified  rencontreGrandPubliqueJeunePublique")
            @PostMapping("/")
            public RencontreGrandPubliqueJeunePubliqueVo save(@RequestBody RencontreGrandPubliqueJeunePubliqueVo rencontreGrandPubliqueJeunePubliqueVo){
            RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePubliqueConverter.toItem(rencontreGrandPubliqueJeunePubliqueVo);
            rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePubliqueService.save(rencontreGrandPubliqueJeunePublique);
            return rencontreGrandPubliqueJeunePubliqueConverter.toVo(rencontreGrandPubliqueJeunePublique);
            }

            @ApiOperation("Delete the specified rencontreGrandPubliqueJeunePublique")
            @DeleteMapping("/")
            public int delete(@RequestBody RencontreGrandPubliqueJeunePubliqueVo rencontreGrandPubliqueJeunePubliqueVo){
            RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePubliqueConverter.toItem(rencontreGrandPubliqueJeunePubliqueVo);
            return rencontreGrandPubliqueJeunePubliqueService.delete(rencontreGrandPubliqueJeunePublique);
            }

            @ApiOperation("Deletes a rencontreGrandPubliqueJeunePublique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return rencontreGrandPubliqueJeunePubliqueService.deleteById(id);
            }
        @ApiOperation("find by formatRencontre code")
        @GetMapping("/formatRencontre/code/{code}")
        public List<RencontreGrandPubliqueJeunePublique> findByFormatRencontreCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueService.findByFormatRencontreCode(code);
        }

        @ApiOperation("delete by formatRencontre code")
        @DeleteMapping("/formatRencontre/code/{code}")
        public int deleteByFormatRencontreCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueService.deleteByFormatRencontreCode(code);
        }

        @ApiOperation("find by formatRencontre id")
        @GetMapping("/formatRencontre/id/{id}")
        public List<RencontreGrandPubliqueJeunePublique> findByFormatRencontreId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueService.findByFormatRencontreId(id);
        }

        @ApiOperation("delete by formatRencontre id")
        @DeleteMapping("/formatRencontre/id/{id}")
        public int deleteByFormatRencontreId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueService.deleteByFormatRencontreId(id);
        }

        @ApiOperation("find by contexte code")
        @GetMapping("/contexte/code/{code}")
        public List<RencontreGrandPubliqueJeunePublique> findByContexteCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueService.findByContexteCode(code);
        }

        @ApiOperation("delete by contexte code")
        @DeleteMapping("/contexte/code/{code}")
        public int deleteByContexteCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueService.deleteByContexteCode(code);
        }

        @ApiOperation("find by contexte id")
        @GetMapping("/contexte/id/{id}")
        public List<RencontreGrandPubliqueJeunePublique> findByContexteId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueService.findByContexteId(id);
        }

        @ApiOperation("delete by contexte id")
        @DeleteMapping("/contexte/id/{id}")
        public int deleteByContexteId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueService.deleteByContexteId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<RencontreGrandPubliqueJeunePublique> findByPaysCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<RencontreGrandPubliqueJeunePublique> findByPaysId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueService.deleteByPaysId(id);
        }

        @ApiOperation("find by cultureScientifique id")
        @GetMapping("/cultureScientifique/id/{id}")
        public List<RencontreGrandPubliqueJeunePublique> findByCultureScientifiqueId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueService.findByCultureScientifiqueId(id);
        }

        @ApiOperation("delete by cultureScientifique id")
        @DeleteMapping("/cultureScientifique/id/{id}")
        public int deleteByCultureScientifiqueId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueService.deleteByCultureScientifiqueId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<RencontreGrandPubliqueJeunePublique> findByEtatEtapeCampagneCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<RencontreGrandPubliqueJeunePublique> findByEtatEtapeCampagneId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueService.deleteByEtatEtapeCampagneId(id);
        }



            }
