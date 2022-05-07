package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.RencontreMediaPeriodeChercheurService;

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
import com.ird.faa.bean.RencontreMediaPeriode;
import com.ird.faa.ws.rest.provided.converter.RencontreMediaPeriodeConverter;
import com.ird.faa.ws.rest.provided.vo.RencontreMediaPeriodeVo;

@Api("Manages rencontreMediaPeriode services")
@RestController
@RequestMapping("api/chercheur/rencontreMediaPeriode")
public class RencontreMediaPeriodeRestChercheur {

@Autowired
private RencontreMediaPeriodeChercheurService rencontreMediaPeriodeService;

@Autowired
private RencontreMediaPeriodeConverter rencontreMediaPeriodeConverter;


            @ApiOperation("Updates the specified  rencontreMediaPeriode")
            @PutMapping("/")
            public  RencontreMediaPeriodeVo update(@RequestBody  RencontreMediaPeriodeVo  rencontreMediaPeriodeVo){
            RencontreMediaPeriode rencontreMediaPeriode = rencontreMediaPeriodeConverter.toItem(rencontreMediaPeriodeVo);
            rencontreMediaPeriode = rencontreMediaPeriodeService.update(rencontreMediaPeriode);
            return rencontreMediaPeriodeConverter.toVo(rencontreMediaPeriode);
            }

    @ApiOperation("Finds a list of all rencontreMediaPeriodes")
    @GetMapping("/")
    public List<RencontreMediaPeriodeVo> findAll(){
        return rencontreMediaPeriodeConverter.toVo(rencontreMediaPeriodeService.findAll());
    }

    @ApiOperation("Finds a rencontreMediaPeriode with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public RencontreMediaPeriodeVo findByIdWithAssociatedList(@PathVariable Long id){
    return rencontreMediaPeriodeConverter.toVo(rencontreMediaPeriodeService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search rencontreMediaPeriode by a specific criteria")
    @PostMapping("/search")
    public List<RencontreMediaPeriodeVo> findByCriteria(@RequestBody RencontreMediaPeriodeVo rencontreMediaPeriodeVo){
        return rencontreMediaPeriodeConverter.toVo(rencontreMediaPeriodeService.findByCriteria(rencontreMediaPeriodeVo));
        }

            @ApiOperation("Finds a rencontreMediaPeriode by id")
            @GetMapping("/id/{id}")
            public RencontreMediaPeriodeVo findById(@PathVariable Long id){
            return rencontreMediaPeriodeConverter.toVo(rencontreMediaPeriodeService.findById(id));
            }

            @ApiOperation("Saves the specified  rencontreMediaPeriode")
            @PostMapping("/")
            public RencontreMediaPeriodeVo save(@RequestBody RencontreMediaPeriodeVo rencontreMediaPeriodeVo){
            RencontreMediaPeriode rencontreMediaPeriode = rencontreMediaPeriodeConverter.toItem(rencontreMediaPeriodeVo);
            rencontreMediaPeriode = rencontreMediaPeriodeService.save(rencontreMediaPeriode);
            return rencontreMediaPeriodeConverter.toVo(rencontreMediaPeriode);
            }

            @ApiOperation("Delete the specified rencontreMediaPeriode")
            @DeleteMapping("/")
            public int delete(@RequestBody RencontreMediaPeriodeVo rencontreMediaPeriodeVo){
            RencontreMediaPeriode rencontreMediaPeriode = rencontreMediaPeriodeConverter.toItem(rencontreMediaPeriodeVo);
            return rencontreMediaPeriodeService.delete(rencontreMediaPeriode);
            }

            @ApiOperation("Deletes a rencontreMediaPeriode by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return rencontreMediaPeriodeService.deleteById(id);
            }
        @ApiOperation("find by rencontreMedia id")
        @GetMapping("/rencontreMedia/id/{id}")
        public List<RencontreMediaPeriode> findByRencontreMediaId(@PathVariable Long id){
        return rencontreMediaPeriodeService.findByRencontreMediaId(id);
        }

        @ApiOperation("delete by rencontreMedia id")
        @DeleteMapping("/rencontreMedia/id/{id}")
        public int deleteByRencontreMediaId(@PathVariable Long id){
        return rencontreMediaPeriodeService.deleteByRencontreMediaId(id);
        }



            }
