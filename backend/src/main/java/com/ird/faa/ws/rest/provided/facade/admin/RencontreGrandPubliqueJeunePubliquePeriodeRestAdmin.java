package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliquePeriodeAdminService;

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
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliquePeriode;
import com.ird.faa.ws.rest.provided.converter.RencontreGrandPubliqueJeunePubliquePeriodeConverter;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliquePeriodeVo;

@Api("Manages rencontreGrandPubliqueJeunePubliquePeriode services")
@RestController
@RequestMapping("api/admin/rencontreGrandPubliqueJeunePubliquePeriode")
public class RencontreGrandPubliqueJeunePubliquePeriodeRestAdmin {

@Autowired
private RencontreGrandPubliqueJeunePubliquePeriodeAdminService rencontreGrandPubliqueJeunePubliquePeriodeService;

@Autowired
private RencontreGrandPubliqueJeunePubliquePeriodeConverter rencontreGrandPubliqueJeunePubliquePeriodeConverter;


            @ApiOperation("Updates the specified  rencontreGrandPubliqueJeunePubliquePeriode")
            @PutMapping("/")
            public  RencontreGrandPubliqueJeunePubliquePeriodeVo update(@RequestBody  RencontreGrandPubliqueJeunePubliquePeriodeVo  rencontreGrandPubliqueJeunePubliquePeriodeVo){
            RencontreGrandPubliqueJeunePubliquePeriode rencontreGrandPubliqueJeunePubliquePeriode = rencontreGrandPubliqueJeunePubliquePeriodeConverter.toItem(rencontreGrandPubliqueJeunePubliquePeriodeVo);
            rencontreGrandPubliqueJeunePubliquePeriode = rencontreGrandPubliqueJeunePubliquePeriodeService.update(rencontreGrandPubliqueJeunePubliquePeriode);
            return rencontreGrandPubliqueJeunePubliquePeriodeConverter.toVo(rencontreGrandPubliqueJeunePubliquePeriode);
            }

    @ApiOperation("Finds a list of all rencontreGrandPubliqueJeunePubliquePeriodes")
    @GetMapping("/")
    public List<RencontreGrandPubliqueJeunePubliquePeriodeVo> findAll(){
        return rencontreGrandPubliqueJeunePubliquePeriodeConverter.toVo(rencontreGrandPubliqueJeunePubliquePeriodeService.findAll());
    }

    @ApiOperation("Finds a rencontreGrandPubliqueJeunePubliquePeriode with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public RencontreGrandPubliqueJeunePubliquePeriodeVo findByIdWithAssociatedList(@PathVariable Long id){
    return rencontreGrandPubliqueJeunePubliquePeriodeConverter.toVo(rencontreGrandPubliqueJeunePubliquePeriodeService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search rencontreGrandPubliqueJeunePubliquePeriode by a specific criteria")
    @PostMapping("/search")
    public List<RencontreGrandPubliqueJeunePubliquePeriodeVo> findByCriteria(@RequestBody RencontreGrandPubliqueJeunePubliquePeriodeVo rencontreGrandPubliqueJeunePubliquePeriodeVo){
        return rencontreGrandPubliqueJeunePubliquePeriodeConverter.toVo(rencontreGrandPubliqueJeunePubliquePeriodeService.findByCriteria(rencontreGrandPubliqueJeunePubliquePeriodeVo));
        }

            @ApiOperation("Finds a rencontreGrandPubliqueJeunePubliquePeriode by id")
            @GetMapping("/id/{id}")
            public RencontreGrandPubliqueJeunePubliquePeriodeVo findById(@PathVariable Long id){
            return rencontreGrandPubliqueJeunePubliquePeriodeConverter.toVo(rencontreGrandPubliqueJeunePubliquePeriodeService.findById(id));
            }

            @ApiOperation("Saves the specified  rencontreGrandPubliqueJeunePubliquePeriode")
            @PostMapping("/")
            public RencontreGrandPubliqueJeunePubliquePeriodeVo save(@RequestBody RencontreGrandPubliqueJeunePubliquePeriodeVo rencontreGrandPubliqueJeunePubliquePeriodeVo){
            RencontreGrandPubliqueJeunePubliquePeriode rencontreGrandPubliqueJeunePubliquePeriode = rencontreGrandPubliqueJeunePubliquePeriodeConverter.toItem(rencontreGrandPubliqueJeunePubliquePeriodeVo);
            rencontreGrandPubliqueJeunePubliquePeriode = rencontreGrandPubliqueJeunePubliquePeriodeService.save(rencontreGrandPubliqueJeunePubliquePeriode);
            return rencontreGrandPubliqueJeunePubliquePeriodeConverter.toVo(rencontreGrandPubliqueJeunePubliquePeriode);
            }

            @ApiOperation("Delete the specified rencontreGrandPubliqueJeunePubliquePeriode")
            @DeleteMapping("/")
            public int delete(@RequestBody RencontreGrandPubliqueJeunePubliquePeriodeVo rencontreGrandPubliqueJeunePubliquePeriodeVo){
            RencontreGrandPubliqueJeunePubliquePeriode rencontreGrandPubliqueJeunePubliquePeriode = rencontreGrandPubliqueJeunePubliquePeriodeConverter.toItem(rencontreGrandPubliqueJeunePubliquePeriodeVo);
            return rencontreGrandPubliqueJeunePubliquePeriodeService.delete(rencontreGrandPubliqueJeunePubliquePeriode);
            }

            @ApiOperation("Deletes a rencontreGrandPubliqueJeunePubliquePeriode by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return rencontreGrandPubliqueJeunePubliquePeriodeService.deleteById(id);
            }
        @ApiOperation("find by rencontreGrandPubliqueJeunePublique id")
        @GetMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public List<RencontreGrandPubliqueJeunePubliquePeriode> findByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliquePeriodeService.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @ApiOperation("delete by rencontreGrandPubliqueJeunePublique id")
        @DeleteMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliquePeriodeService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }



            }
