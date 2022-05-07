package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.RencontreMediaDisciplineScientifiqueAdminService;

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
import com.ird.faa.bean.RencontreMediaDisciplineScientifique;
import com.ird.faa.ws.rest.provided.converter.RencontreMediaDisciplineScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.RencontreMediaDisciplineScientifiqueVo;

@Api("Manages rencontreMediaDisciplineScientifique services")
@RestController
@RequestMapping("api/admin/rencontreMediaDisciplineScientifique")
public class RencontreMediaDisciplineScientifiqueRestAdmin {

@Autowired
private RencontreMediaDisciplineScientifiqueAdminService rencontreMediaDisciplineScientifiqueService;

@Autowired
private RencontreMediaDisciplineScientifiqueConverter rencontreMediaDisciplineScientifiqueConverter;


            @ApiOperation("Updates the specified  rencontreMediaDisciplineScientifique")
            @PutMapping("/")
            public  RencontreMediaDisciplineScientifiqueVo update(@RequestBody  RencontreMediaDisciplineScientifiqueVo  rencontreMediaDisciplineScientifiqueVo){
            RencontreMediaDisciplineScientifique rencontreMediaDisciplineScientifique = rencontreMediaDisciplineScientifiqueConverter.toItem(rencontreMediaDisciplineScientifiqueVo);
            rencontreMediaDisciplineScientifique = rencontreMediaDisciplineScientifiqueService.update(rencontreMediaDisciplineScientifique);
            return rencontreMediaDisciplineScientifiqueConverter.toVo(rencontreMediaDisciplineScientifique);
            }

    @ApiOperation("Finds a list of all rencontreMediaDisciplineScientifiques")
    @GetMapping("/")
    public List<RencontreMediaDisciplineScientifiqueVo> findAll(){
        return rencontreMediaDisciplineScientifiqueConverter.toVo(rencontreMediaDisciplineScientifiqueService.findAll());
    }

    @ApiOperation("Finds a rencontreMediaDisciplineScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public RencontreMediaDisciplineScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return rencontreMediaDisciplineScientifiqueConverter.toVo(rencontreMediaDisciplineScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search rencontreMediaDisciplineScientifique by a specific criteria")
    @PostMapping("/search")
    public List<RencontreMediaDisciplineScientifiqueVo> findByCriteria(@RequestBody RencontreMediaDisciplineScientifiqueVo rencontreMediaDisciplineScientifiqueVo){
        return rencontreMediaDisciplineScientifiqueConverter.toVo(rencontreMediaDisciplineScientifiqueService.findByCriteria(rencontreMediaDisciplineScientifiqueVo));
        }

            @ApiOperation("Finds a rencontreMediaDisciplineScientifique by id")
            @GetMapping("/id/{id}")
            public RencontreMediaDisciplineScientifiqueVo findById(@PathVariable Long id){
            return rencontreMediaDisciplineScientifiqueConverter.toVo(rencontreMediaDisciplineScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  rencontreMediaDisciplineScientifique")
            @PostMapping("/")
            public RencontreMediaDisciplineScientifiqueVo save(@RequestBody RencontreMediaDisciplineScientifiqueVo rencontreMediaDisciplineScientifiqueVo){
            RencontreMediaDisciplineScientifique rencontreMediaDisciplineScientifique = rencontreMediaDisciplineScientifiqueConverter.toItem(rencontreMediaDisciplineScientifiqueVo);
            rencontreMediaDisciplineScientifique = rencontreMediaDisciplineScientifiqueService.save(rencontreMediaDisciplineScientifique);
            return rencontreMediaDisciplineScientifiqueConverter.toVo(rencontreMediaDisciplineScientifique);
            }

            @ApiOperation("Delete the specified rencontreMediaDisciplineScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody RencontreMediaDisciplineScientifiqueVo rencontreMediaDisciplineScientifiqueVo){
            RencontreMediaDisciplineScientifique rencontreMediaDisciplineScientifique = rencontreMediaDisciplineScientifiqueConverter.toItem(rencontreMediaDisciplineScientifiqueVo);
            return rencontreMediaDisciplineScientifiqueService.delete(rencontreMediaDisciplineScientifique);
            }

            @ApiOperation("Deletes a rencontreMediaDisciplineScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return rencontreMediaDisciplineScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by rencontreMedia id")
        @GetMapping("/rencontreMedia/id/{id}")
        public List<RencontreMediaDisciplineScientifique> findByRencontreMediaId(@PathVariable Long id){
        return rencontreMediaDisciplineScientifiqueService.findByRencontreMediaId(id);
        }

        @ApiOperation("delete by rencontreMedia id")
        @DeleteMapping("/rencontreMedia/id/{id}")
        public int deleteByRencontreMediaId(@PathVariable Long id){
        return rencontreMediaDisciplineScientifiqueService.deleteByRencontreMediaId(id);
        }

        @ApiOperation("find by disciplineScientifique code")
        @GetMapping("/disciplineScientifique/code/{code}")
        public List<RencontreMediaDisciplineScientifique> findByDisciplineScientifiqueCode(@PathVariable String code){
        return rencontreMediaDisciplineScientifiqueService.findByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("delete by disciplineScientifique code")
        @DeleteMapping("/disciplineScientifique/code/{code}")
        public int deleteByDisciplineScientifiqueCode(@PathVariable String code){
        return rencontreMediaDisciplineScientifiqueService.deleteByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("find by disciplineScientifique id")
        @GetMapping("/disciplineScientifique/id/{id}")
        public List<RencontreMediaDisciplineScientifique> findByDisciplineScientifiqueId(@PathVariable Long id){
        return rencontreMediaDisciplineScientifiqueService.findByDisciplineScientifiqueId(id);
        }

        @ApiOperation("delete by disciplineScientifique id")
        @DeleteMapping("/disciplineScientifique/id/{id}")
        public int deleteByDisciplineScientifiqueId(@PathVariable Long id){
        return rencontreMediaDisciplineScientifiqueService.deleteByDisciplineScientifiqueId(id);
        }



            }
