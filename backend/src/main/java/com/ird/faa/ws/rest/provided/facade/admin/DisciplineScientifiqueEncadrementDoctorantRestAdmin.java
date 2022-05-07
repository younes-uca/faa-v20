package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.DisciplineScientifiqueEncadrementDoctorantAdminService;

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
import com.ird.faa.bean.DisciplineScientifiqueEncadrementDoctorant;
import com.ird.faa.ws.rest.provided.converter.DisciplineScientifiqueEncadrementDoctorantConverter;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueEncadrementDoctorantVo;

@Api("Manages disciplineScientifiqueEncadrementDoctorant services")
@RestController
@RequestMapping("api/admin/disciplineScientifiqueEncadrementDoctorant")
public class DisciplineScientifiqueEncadrementDoctorantRestAdmin {

@Autowired
private DisciplineScientifiqueEncadrementDoctorantAdminService disciplineScientifiqueEncadrementDoctorantService;

@Autowired
private DisciplineScientifiqueEncadrementDoctorantConverter disciplineScientifiqueEncadrementDoctorantConverter;


            @ApiOperation("Updates the specified  disciplineScientifiqueEncadrementDoctorant")
            @PutMapping("/")
            public  DisciplineScientifiqueEncadrementDoctorantVo update(@RequestBody  DisciplineScientifiqueEncadrementDoctorantVo  disciplineScientifiqueEncadrementDoctorantVo){
            DisciplineScientifiqueEncadrementDoctorant disciplineScientifiqueEncadrementDoctorant = disciplineScientifiqueEncadrementDoctorantConverter.toItem(disciplineScientifiqueEncadrementDoctorantVo);
            disciplineScientifiqueEncadrementDoctorant = disciplineScientifiqueEncadrementDoctorantService.update(disciplineScientifiqueEncadrementDoctorant);
            return disciplineScientifiqueEncadrementDoctorantConverter.toVo(disciplineScientifiqueEncadrementDoctorant);
            }

    @ApiOperation("Finds a list of all disciplineScientifiqueEncadrementDoctorants")
    @GetMapping("/")
    public List<DisciplineScientifiqueEncadrementDoctorantVo> findAll(){
        return disciplineScientifiqueEncadrementDoctorantConverter.toVo(disciplineScientifiqueEncadrementDoctorantService.findAll());
    }

    @ApiOperation("Finds a disciplineScientifiqueEncadrementDoctorant with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public DisciplineScientifiqueEncadrementDoctorantVo findByIdWithAssociatedList(@PathVariable Long id){
    return disciplineScientifiqueEncadrementDoctorantConverter.toVo(disciplineScientifiqueEncadrementDoctorantService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search disciplineScientifiqueEncadrementDoctorant by a specific criteria")
    @PostMapping("/search")
    public List<DisciplineScientifiqueEncadrementDoctorantVo> findByCriteria(@RequestBody DisciplineScientifiqueEncadrementDoctorantVo disciplineScientifiqueEncadrementDoctorantVo){
        return disciplineScientifiqueEncadrementDoctorantConverter.toVo(disciplineScientifiqueEncadrementDoctorantService.findByCriteria(disciplineScientifiqueEncadrementDoctorantVo));
        }

            @ApiOperation("Finds a disciplineScientifiqueEncadrementDoctorant by id")
            @GetMapping("/id/{id}")
            public DisciplineScientifiqueEncadrementDoctorantVo findById(@PathVariable Long id){
            return disciplineScientifiqueEncadrementDoctorantConverter.toVo(disciplineScientifiqueEncadrementDoctorantService.findById(id));
            }

            @ApiOperation("Saves the specified  disciplineScientifiqueEncadrementDoctorant")
            @PostMapping("/")
            public DisciplineScientifiqueEncadrementDoctorantVo save(@RequestBody DisciplineScientifiqueEncadrementDoctorantVo disciplineScientifiqueEncadrementDoctorantVo){
            DisciplineScientifiqueEncadrementDoctorant disciplineScientifiqueEncadrementDoctorant = disciplineScientifiqueEncadrementDoctorantConverter.toItem(disciplineScientifiqueEncadrementDoctorantVo);
            disciplineScientifiqueEncadrementDoctorant = disciplineScientifiqueEncadrementDoctorantService.save(disciplineScientifiqueEncadrementDoctorant);
            return disciplineScientifiqueEncadrementDoctorantConverter.toVo(disciplineScientifiqueEncadrementDoctorant);
            }

            @ApiOperation("Delete the specified disciplineScientifiqueEncadrementDoctorant")
            @DeleteMapping("/")
            public int delete(@RequestBody DisciplineScientifiqueEncadrementDoctorantVo disciplineScientifiqueEncadrementDoctorantVo){
            DisciplineScientifiqueEncadrementDoctorant disciplineScientifiqueEncadrementDoctorant = disciplineScientifiqueEncadrementDoctorantConverter.toItem(disciplineScientifiqueEncadrementDoctorantVo);
            return disciplineScientifiqueEncadrementDoctorantService.delete(disciplineScientifiqueEncadrementDoctorant);
            }

            @ApiOperation("Deletes a disciplineScientifiqueEncadrementDoctorant by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return disciplineScientifiqueEncadrementDoctorantService.deleteById(id);
            }
        @ApiOperation("find by encadrementDoctorant id")
        @GetMapping("/encadrementDoctorant/id/{id}")
        public List<DisciplineScientifiqueEncadrementDoctorant> findByEncadrementDoctorantId(@PathVariable Long id){
        return disciplineScientifiqueEncadrementDoctorantService.findByEncadrementDoctorantId(id);
        }

        @ApiOperation("delete by encadrementDoctorant id")
        @DeleteMapping("/encadrementDoctorant/id/{id}")
        public int deleteByEncadrementDoctorantId(@PathVariable Long id){
        return disciplineScientifiqueEncadrementDoctorantService.deleteByEncadrementDoctorantId(id);
        }

        @ApiOperation("find by disciplineScientifique code")
        @GetMapping("/disciplineScientifique/code/{code}")
        public List<DisciplineScientifiqueEncadrementDoctorant> findByDisciplineScientifiqueCode(@PathVariable String code){
        return disciplineScientifiqueEncadrementDoctorantService.findByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("delete by disciplineScientifique code")
        @DeleteMapping("/disciplineScientifique/code/{code}")
        public int deleteByDisciplineScientifiqueCode(@PathVariable String code){
        return disciplineScientifiqueEncadrementDoctorantService.deleteByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("find by disciplineScientifique id")
        @GetMapping("/disciplineScientifique/id/{id}")
        public List<DisciplineScientifiqueEncadrementDoctorant> findByDisciplineScientifiqueId(@PathVariable Long id){
        return disciplineScientifiqueEncadrementDoctorantService.findByDisciplineScientifiqueId(id);
        }

        @ApiOperation("delete by disciplineScientifique id")
        @DeleteMapping("/disciplineScientifique/id/{id}")
        public int deleteByDisciplineScientifiqueId(@PathVariable Long id){
        return disciplineScientifiqueEncadrementDoctorantService.deleteByDisciplineScientifiqueId(id);
        }



            }
