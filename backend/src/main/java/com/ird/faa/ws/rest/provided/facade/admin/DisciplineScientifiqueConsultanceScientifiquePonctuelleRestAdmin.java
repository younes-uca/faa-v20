package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.DisciplineScientifiqueConsultanceScientifiquePonctuelleAdminService;

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
import com.ird.faa.bean.DisciplineScientifiqueConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.converter.DisciplineScientifiqueConsultanceScientifiquePonctuelleConverter;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueConsultanceScientifiquePonctuelleVo;

@Api("Manages disciplineScientifiqueConsultanceScientifiquePonctuelle services")
@RestController
@RequestMapping("api/admin/disciplineScientifiqueConsultanceScientifiquePonctuelle")
public class DisciplineScientifiqueConsultanceScientifiquePonctuelleRestAdmin {

@Autowired
private DisciplineScientifiqueConsultanceScientifiquePonctuelleAdminService disciplineScientifiqueConsultanceScientifiquePonctuelleService;

@Autowired
private DisciplineScientifiqueConsultanceScientifiquePonctuelleConverter disciplineScientifiqueConsultanceScientifiquePonctuelleConverter;


            @ApiOperation("Updates the specified  disciplineScientifiqueConsultanceScientifiquePonctuelle")
            @PutMapping("/")
            public  DisciplineScientifiqueConsultanceScientifiquePonctuelleVo update(@RequestBody  DisciplineScientifiqueConsultanceScientifiquePonctuelleVo  disciplineScientifiqueConsultanceScientifiquePonctuelleVo){
            DisciplineScientifiqueConsultanceScientifiquePonctuelle disciplineScientifiqueConsultanceScientifiquePonctuelle = disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.toItem(disciplineScientifiqueConsultanceScientifiquePonctuelleVo);
            disciplineScientifiqueConsultanceScientifiquePonctuelle = disciplineScientifiqueConsultanceScientifiquePonctuelleService.update(disciplineScientifiqueConsultanceScientifiquePonctuelle);
            return disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.toVo(disciplineScientifiqueConsultanceScientifiquePonctuelle);
            }

    @ApiOperation("Finds a list of all disciplineScientifiqueConsultanceScientifiquePonctuelles")
    @GetMapping("/")
    public List<DisciplineScientifiqueConsultanceScientifiquePonctuelleVo> findAll(){
        return disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.toVo(disciplineScientifiqueConsultanceScientifiquePonctuelleService.findAll());
    }

    @ApiOperation("Finds a disciplineScientifiqueConsultanceScientifiquePonctuelle with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public DisciplineScientifiqueConsultanceScientifiquePonctuelleVo findByIdWithAssociatedList(@PathVariable Long id){
    return disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.toVo(disciplineScientifiqueConsultanceScientifiquePonctuelleService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search disciplineScientifiqueConsultanceScientifiquePonctuelle by a specific criteria")
    @PostMapping("/search")
    public List<DisciplineScientifiqueConsultanceScientifiquePonctuelleVo> findByCriteria(@RequestBody DisciplineScientifiqueConsultanceScientifiquePonctuelleVo disciplineScientifiqueConsultanceScientifiquePonctuelleVo){
        return disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.toVo(disciplineScientifiqueConsultanceScientifiquePonctuelleService.findByCriteria(disciplineScientifiqueConsultanceScientifiquePonctuelleVo));
        }

            @ApiOperation("Finds a disciplineScientifiqueConsultanceScientifiquePonctuelle by id")
            @GetMapping("/id/{id}")
            public DisciplineScientifiqueConsultanceScientifiquePonctuelleVo findById(@PathVariable Long id){
            return disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.toVo(disciplineScientifiqueConsultanceScientifiquePonctuelleService.findById(id));
            }

            @ApiOperation("Saves the specified  disciplineScientifiqueConsultanceScientifiquePonctuelle")
            @PostMapping("/")
            public DisciplineScientifiqueConsultanceScientifiquePonctuelleVo save(@RequestBody DisciplineScientifiqueConsultanceScientifiquePonctuelleVo disciplineScientifiqueConsultanceScientifiquePonctuelleVo){
            DisciplineScientifiqueConsultanceScientifiquePonctuelle disciplineScientifiqueConsultanceScientifiquePonctuelle = disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.toItem(disciplineScientifiqueConsultanceScientifiquePonctuelleVo);
            disciplineScientifiqueConsultanceScientifiquePonctuelle = disciplineScientifiqueConsultanceScientifiquePonctuelleService.save(disciplineScientifiqueConsultanceScientifiquePonctuelle);
            return disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.toVo(disciplineScientifiqueConsultanceScientifiquePonctuelle);
            }

            @ApiOperation("Delete the specified disciplineScientifiqueConsultanceScientifiquePonctuelle")
            @DeleteMapping("/")
            public int delete(@RequestBody DisciplineScientifiqueConsultanceScientifiquePonctuelleVo disciplineScientifiqueConsultanceScientifiquePonctuelleVo){
            DisciplineScientifiqueConsultanceScientifiquePonctuelle disciplineScientifiqueConsultanceScientifiquePonctuelle = disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.toItem(disciplineScientifiqueConsultanceScientifiquePonctuelleVo);
            return disciplineScientifiqueConsultanceScientifiquePonctuelleService.delete(disciplineScientifiqueConsultanceScientifiquePonctuelle);
            }

            @ApiOperation("Deletes a disciplineScientifiqueConsultanceScientifiquePonctuelle by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return disciplineScientifiqueConsultanceScientifiquePonctuelleService.deleteById(id);
            }
        @ApiOperation("find by consultanceScientifiquePonctuelle id")
        @GetMapping("/consultanceScientifiquePonctuelle/id/{id}")
        public List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(@PathVariable Long id){
        return disciplineScientifiqueConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(id);
        }

        @ApiOperation("delete by consultanceScientifiquePonctuelle id")
        @DeleteMapping("/consultanceScientifiquePonctuelle/id/{id}")
        public int deleteByConsultanceScientifiquePonctuelleId(@PathVariable Long id){
        return disciplineScientifiqueConsultanceScientifiquePonctuelleService.deleteByConsultanceScientifiquePonctuelleId(id);
        }

        @ApiOperation("find by disciplineScientifique code")
        @GetMapping("/disciplineScientifique/code/{code}")
        public List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> findByDisciplineScientifiqueCode(@PathVariable String code){
        return disciplineScientifiqueConsultanceScientifiquePonctuelleService.findByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("delete by disciplineScientifique code")
        @DeleteMapping("/disciplineScientifique/code/{code}")
        public int deleteByDisciplineScientifiqueCode(@PathVariable String code){
        return disciplineScientifiqueConsultanceScientifiquePonctuelleService.deleteByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("find by disciplineScientifique id")
        @GetMapping("/disciplineScientifique/id/{id}")
        public List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> findByDisciplineScientifiqueId(@PathVariable Long id){
        return disciplineScientifiqueConsultanceScientifiquePonctuelleService.findByDisciplineScientifiqueId(id);
        }

        @ApiOperation("delete by disciplineScientifique id")
        @DeleteMapping("/disciplineScientifique/id/{id}")
        public int deleteByDisciplineScientifiqueId(@PathVariable Long id){
        return disciplineScientifiqueConsultanceScientifiquePonctuelleService.deleteByDisciplineScientifiqueId(id);
        }



            }
