package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.DisciplineScientifiqueEvenementColloqueScientifiqueAdminService;

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
import com.ird.faa.bean.DisciplineScientifiqueEvenementColloqueScientifique;
import com.ird.faa.ws.rest.provided.converter.DisciplineScientifiqueEvenementColloqueScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueEvenementColloqueScientifiqueVo;

@Api("Manages disciplineScientifiqueEvenementColloqueScientifique services")
@RestController
@RequestMapping("api/admin/disciplineScientifiqueEvenementColloqueScientifique")
public class DisciplineScientifiqueEvenementColloqueScientifiqueRestAdmin {

@Autowired
private DisciplineScientifiqueEvenementColloqueScientifiqueAdminService disciplineScientifiqueEvenementColloqueScientifiqueService;

@Autowired
private DisciplineScientifiqueEvenementColloqueScientifiqueConverter disciplineScientifiqueEvenementColloqueScientifiqueConverter;


            @ApiOperation("Updates the specified  disciplineScientifiqueEvenementColloqueScientifique")
            @PutMapping("/")
            public  DisciplineScientifiqueEvenementColloqueScientifiqueVo update(@RequestBody  DisciplineScientifiqueEvenementColloqueScientifiqueVo  disciplineScientifiqueEvenementColloqueScientifiqueVo){
            DisciplineScientifiqueEvenementColloqueScientifique disciplineScientifiqueEvenementColloqueScientifique = disciplineScientifiqueEvenementColloqueScientifiqueConverter.toItem(disciplineScientifiqueEvenementColloqueScientifiqueVo);
            disciplineScientifiqueEvenementColloqueScientifique = disciplineScientifiqueEvenementColloqueScientifiqueService.update(disciplineScientifiqueEvenementColloqueScientifique);
            return disciplineScientifiqueEvenementColloqueScientifiqueConverter.toVo(disciplineScientifiqueEvenementColloqueScientifique);
            }

    @ApiOperation("Finds a list of all disciplineScientifiqueEvenementColloqueScientifiques")
    @GetMapping("/")
    public List<DisciplineScientifiqueEvenementColloqueScientifiqueVo> findAll(){
        return disciplineScientifiqueEvenementColloqueScientifiqueConverter.toVo(disciplineScientifiqueEvenementColloqueScientifiqueService.findAll());
    }

    @ApiOperation("Finds a disciplineScientifiqueEvenementColloqueScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public DisciplineScientifiqueEvenementColloqueScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return disciplineScientifiqueEvenementColloqueScientifiqueConverter.toVo(disciplineScientifiqueEvenementColloqueScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search disciplineScientifiqueEvenementColloqueScientifique by a specific criteria")
    @PostMapping("/search")
    public List<DisciplineScientifiqueEvenementColloqueScientifiqueVo> findByCriteria(@RequestBody DisciplineScientifiqueEvenementColloqueScientifiqueVo disciplineScientifiqueEvenementColloqueScientifiqueVo){
        return disciplineScientifiqueEvenementColloqueScientifiqueConverter.toVo(disciplineScientifiqueEvenementColloqueScientifiqueService.findByCriteria(disciplineScientifiqueEvenementColloqueScientifiqueVo));
        }

            @ApiOperation("Finds a disciplineScientifiqueEvenementColloqueScientifique by id")
            @GetMapping("/id/{id}")
            public DisciplineScientifiqueEvenementColloqueScientifiqueVo findById(@PathVariable Long id){
            return disciplineScientifiqueEvenementColloqueScientifiqueConverter.toVo(disciplineScientifiqueEvenementColloqueScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  disciplineScientifiqueEvenementColloqueScientifique")
            @PostMapping("/")
            public DisciplineScientifiqueEvenementColloqueScientifiqueVo save(@RequestBody DisciplineScientifiqueEvenementColloqueScientifiqueVo disciplineScientifiqueEvenementColloqueScientifiqueVo){
            DisciplineScientifiqueEvenementColloqueScientifique disciplineScientifiqueEvenementColloqueScientifique = disciplineScientifiqueEvenementColloqueScientifiqueConverter.toItem(disciplineScientifiqueEvenementColloqueScientifiqueVo);
            disciplineScientifiqueEvenementColloqueScientifique = disciplineScientifiqueEvenementColloqueScientifiqueService.save(disciplineScientifiqueEvenementColloqueScientifique);
            return disciplineScientifiqueEvenementColloqueScientifiqueConverter.toVo(disciplineScientifiqueEvenementColloqueScientifique);
            }

            @ApiOperation("Delete the specified disciplineScientifiqueEvenementColloqueScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody DisciplineScientifiqueEvenementColloqueScientifiqueVo disciplineScientifiqueEvenementColloqueScientifiqueVo){
            DisciplineScientifiqueEvenementColloqueScientifique disciplineScientifiqueEvenementColloqueScientifique = disciplineScientifiqueEvenementColloqueScientifiqueConverter.toItem(disciplineScientifiqueEvenementColloqueScientifiqueVo);
            return disciplineScientifiqueEvenementColloqueScientifiqueService.delete(disciplineScientifiqueEvenementColloqueScientifique);
            }

            @ApiOperation("Deletes a disciplineScientifiqueEvenementColloqueScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return disciplineScientifiqueEvenementColloqueScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by evenementColloqueScienntifique id")
        @GetMapping("/evenementColloqueScienntifique/id/{id}")
        public List<DisciplineScientifiqueEvenementColloqueScientifique> findByEvenementColloqueScienntifiqueId(@PathVariable Long id){
        return disciplineScientifiqueEvenementColloqueScientifiqueService.findByEvenementColloqueScienntifiqueId(id);
        }

        @ApiOperation("delete by evenementColloqueScienntifique id")
        @DeleteMapping("/evenementColloqueScienntifique/id/{id}")
        public int deleteByEvenementColloqueScienntifiqueId(@PathVariable Long id){
        return disciplineScientifiqueEvenementColloqueScientifiqueService.deleteByEvenementColloqueScienntifiqueId(id);
        }

        @ApiOperation("find by disciplineScientifique code")
        @GetMapping("/disciplineScientifique/code/{code}")
        public List<DisciplineScientifiqueEvenementColloqueScientifique> findByDisciplineScientifiqueCode(@PathVariable String code){
        return disciplineScientifiqueEvenementColloqueScientifiqueService.findByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("delete by disciplineScientifique code")
        @DeleteMapping("/disciplineScientifique/code/{code}")
        public int deleteByDisciplineScientifiqueCode(@PathVariable String code){
        return disciplineScientifiqueEvenementColloqueScientifiqueService.deleteByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("find by disciplineScientifique id")
        @GetMapping("/disciplineScientifique/id/{id}")
        public List<DisciplineScientifiqueEvenementColloqueScientifique> findByDisciplineScientifiqueId(@PathVariable Long id){
        return disciplineScientifiqueEvenementColloqueScientifiqueService.findByDisciplineScientifiqueId(id);
        }

        @ApiOperation("delete by disciplineScientifique id")
        @DeleteMapping("/disciplineScientifique/id/{id}")
        public int deleteByDisciplineScientifiqueId(@PathVariable Long id){
        return disciplineScientifiqueEvenementColloqueScientifiqueService.deleteByDisciplineScientifiqueId(id);
        }



            }
