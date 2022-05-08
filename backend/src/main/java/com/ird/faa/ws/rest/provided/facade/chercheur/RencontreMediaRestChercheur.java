package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.RencontreMediaChercheurService;

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
import com.ird.faa.bean.RencontreMedia;
import com.ird.faa.ws.rest.provided.converter.RencontreMediaConverter;
import com.ird.faa.ws.rest.provided.vo.RencontreMediaVo;

@Api("Manages rencontreMedia services")
@RestController
@RequestMapping("api/chercheur/rencontreMedia")
public class RencontreMediaRestChercheur {

@Autowired
private RencontreMediaChercheurService rencontreMediaService;

@Autowired
private RencontreMediaConverter rencontreMediaConverter;


            @ApiOperation("Updates the specified  rencontreMedia")
            @PutMapping("/")
            public  RencontreMediaVo update(@RequestBody  RencontreMediaVo  rencontreMediaVo){
            RencontreMedia rencontreMedia = rencontreMediaConverter.toItem(rencontreMediaVo);
            rencontreMedia = rencontreMediaService.update(rencontreMedia);
            return rencontreMediaConverter.toVo(rencontreMedia);
            }

    @ApiOperation("Finds a list of all rencontreMedias")
    @GetMapping("/")
    public List<RencontreMediaVo> findAll(){
        return rencontreMediaConverter.toVo(rencontreMediaService.findAll());
    }

    @ApiOperation("Finds a rencontreMedia with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public RencontreMediaVo findByIdWithAssociatedList(@PathVariable Long id){
    return rencontreMediaConverter.toVo(rencontreMediaService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search rencontreMedia by a specific criteria")
    @PostMapping("/search")
    public List<RencontreMediaVo> findByCriteria(@RequestBody RencontreMediaVo rencontreMediaVo){
        return rencontreMediaConverter.toVo(rencontreMediaService.findByCriteria(rencontreMediaVo));
        }

            @ApiOperation("Finds a rencontreMedia by id")
            @GetMapping("/id/{id}")
            public RencontreMediaVo findById(@PathVariable Long id){
            return rencontreMediaConverter.toVo(rencontreMediaService.findById(id));
            }

            @ApiOperation("Saves the specified  rencontreMedia")
            @PostMapping("/")
            public RencontreMediaVo save(@RequestBody RencontreMediaVo rencontreMediaVo){
            RencontreMedia rencontreMedia = rencontreMediaConverter.toItem(rencontreMediaVo);
            rencontreMedia = rencontreMediaService.save(rencontreMedia);
            return rencontreMediaConverter.toVo(rencontreMedia);
            }

            @ApiOperation("Delete the specified rencontreMedia")
            @DeleteMapping("/")
            public int delete(@RequestBody RencontreMediaVo rencontreMediaVo){
            RencontreMedia rencontreMedia = rencontreMediaConverter.toItem(rencontreMediaVo);
            return rencontreMediaService.delete(rencontreMedia);
            }

            @ApiOperation("Deletes a rencontreMedia by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return rencontreMediaService.deleteById(id);
            }
        @ApiOperation("find by formatRencontre code")
        @GetMapping("/formatRencontre/code/{code}")
        public List<RencontreMedia> findByFormatRencontreCode(@PathVariable String code){
        return rencontreMediaService.findByFormatRencontreCode(code);
        }

        @ApiOperation("delete by formatRencontre code")
        @DeleteMapping("/formatRencontre/code/{code}")
        public int deleteByFormatRencontreCode(@PathVariable String code){
        return rencontreMediaService.deleteByFormatRencontreCode(code);
        }

        @ApiOperation("find by formatRencontre id")
        @GetMapping("/formatRencontre/id/{id}")
        public List<RencontreMedia> findByFormatRencontreId(@PathVariable Long id){
        return rencontreMediaService.findByFormatRencontreId(id);
        }

        @ApiOperation("delete by formatRencontre id")
        @DeleteMapping("/formatRencontre/id/{id}")
        public int deleteByFormatRencontreId(@PathVariable Long id){
        return rencontreMediaService.deleteByFormatRencontreId(id);
        }

        @ApiOperation("find by cultureScientifique id")
        @GetMapping("/cultureScientifique/id/{id}")
        public List<RencontreMedia> findByCultureScientifiqueId(@PathVariable Long id){
        return rencontreMediaService.findByCultureScientifiqueId(id);
        }

        @ApiOperation("delete by cultureScientifique id")
        @DeleteMapping("/cultureScientifique/id/{id}")
        public int deleteByCultureScientifiqueId(@PathVariable Long id){
        return rencontreMediaService.deleteByCultureScientifiqueId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<RencontreMedia> findByEtatEtapeCampagneCode(@PathVariable String code){
        return rencontreMediaService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return rencontreMediaService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<RencontreMedia> findByEtatEtapeCampagneId(@PathVariable Long id){
        return rencontreMediaService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return rencontreMediaService.deleteByEtatEtapeCampagneId(id);
        }



            }
