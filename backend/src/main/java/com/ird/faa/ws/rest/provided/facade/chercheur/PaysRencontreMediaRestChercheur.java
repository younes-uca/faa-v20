package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.PaysRencontreMediaChercheurService;

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
import com.ird.faa.bean.PaysRencontreMedia;
import com.ird.faa.ws.rest.provided.converter.PaysRencontreMediaConverter;
import com.ird.faa.ws.rest.provided.vo.PaysRencontreMediaVo;

@Api("Manages paysRencontreMedia services")
@RestController
@RequestMapping("api/chercheur/paysRencontreMedia")
public class PaysRencontreMediaRestChercheur {

@Autowired
private PaysRencontreMediaChercheurService paysRencontreMediaService;

@Autowired
private PaysRencontreMediaConverter paysRencontreMediaConverter;


            @ApiOperation("Updates the specified  paysRencontreMedia")
            @PutMapping("/")
            public  PaysRencontreMediaVo update(@RequestBody  PaysRencontreMediaVo  paysRencontreMediaVo){
            PaysRencontreMedia paysRencontreMedia = paysRencontreMediaConverter.toItem(paysRencontreMediaVo);
            paysRencontreMedia = paysRencontreMediaService.update(paysRencontreMedia);
            return paysRencontreMediaConverter.toVo(paysRencontreMedia);
            }

    @ApiOperation("Finds a list of all paysRencontreMedias")
    @GetMapping("/")
    public List<PaysRencontreMediaVo> findAll(){
        return paysRencontreMediaConverter.toVo(paysRencontreMediaService.findAll());
    }

    @ApiOperation("Finds a paysRencontreMedia with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public PaysRencontreMediaVo findByIdWithAssociatedList(@PathVariable Long id){
    return paysRencontreMediaConverter.toVo(paysRencontreMediaService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search paysRencontreMedia by a specific criteria")
    @PostMapping("/search")
    public List<PaysRencontreMediaVo> findByCriteria(@RequestBody PaysRencontreMediaVo paysRencontreMediaVo){
        return paysRencontreMediaConverter.toVo(paysRencontreMediaService.findByCriteria(paysRencontreMediaVo));
        }

            @ApiOperation("Finds a paysRencontreMedia by id")
            @GetMapping("/id/{id}")
            public PaysRencontreMediaVo findById(@PathVariable Long id){
            return paysRencontreMediaConverter.toVo(paysRencontreMediaService.findById(id));
            }

            @ApiOperation("Saves the specified  paysRencontreMedia")
            @PostMapping("/")
            public PaysRencontreMediaVo save(@RequestBody PaysRencontreMediaVo paysRencontreMediaVo){
            PaysRencontreMedia paysRencontreMedia = paysRencontreMediaConverter.toItem(paysRencontreMediaVo);
            paysRencontreMedia = paysRencontreMediaService.save(paysRencontreMedia);
            return paysRencontreMediaConverter.toVo(paysRencontreMedia);
            }

            @ApiOperation("Delete the specified paysRencontreMedia")
            @DeleteMapping("/")
            public int delete(@RequestBody PaysRencontreMediaVo paysRencontreMediaVo){
            PaysRencontreMedia paysRencontreMedia = paysRencontreMediaConverter.toItem(paysRencontreMediaVo);
            return paysRencontreMediaService.delete(paysRencontreMedia);
            }

            @ApiOperation("Deletes a paysRencontreMedia by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return paysRencontreMediaService.deleteById(id);
            }
        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<PaysRencontreMedia> findByPaysCode(@PathVariable String code){
        return paysRencontreMediaService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return paysRencontreMediaService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<PaysRencontreMedia> findByPaysId(@PathVariable Long id){
        return paysRencontreMediaService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return paysRencontreMediaService.deleteByPaysId(id);
        }

        @ApiOperation("find by rencontreMedia id")
        @GetMapping("/rencontreMedia/id/{id}")
        public List<PaysRencontreMedia> findByRencontreMediaId(@PathVariable Long id){
        return paysRencontreMediaService.findByRencontreMediaId(id);
        }

        @ApiOperation("delete by rencontreMedia id")
        @DeleteMapping("/rencontreMedia/id/{id}")
        public int deleteByRencontreMediaId(@PathVariable Long id){
        return paysRencontreMediaService.deleteByRencontreMediaId(id);
        }



            }
