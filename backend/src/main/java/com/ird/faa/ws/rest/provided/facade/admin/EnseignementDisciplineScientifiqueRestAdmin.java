package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EnseignementDisciplineScientifiqueAdminService;

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
import com.ird.faa.bean.EnseignementDisciplineScientifique;
import com.ird.faa.ws.rest.provided.converter.EnseignementDisciplineScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.EnseignementDisciplineScientifiqueVo;

@Api("Manages enseignementDisciplineScientifique services")
@RestController
@RequestMapping("api/admin/enseignementDisciplineScientifique")
public class EnseignementDisciplineScientifiqueRestAdmin {

@Autowired
private EnseignementDisciplineScientifiqueAdminService enseignementDisciplineScientifiqueService;

@Autowired
private EnseignementDisciplineScientifiqueConverter enseignementDisciplineScientifiqueConverter;


            @ApiOperation("Updates the specified  enseignementDisciplineScientifique")
            @PutMapping("/")
            public  EnseignementDisciplineScientifiqueVo update(@RequestBody  EnseignementDisciplineScientifiqueVo  enseignementDisciplineScientifiqueVo){
            EnseignementDisciplineScientifique enseignementDisciplineScientifique = enseignementDisciplineScientifiqueConverter.toItem(enseignementDisciplineScientifiqueVo);
            enseignementDisciplineScientifique = enseignementDisciplineScientifiqueService.update(enseignementDisciplineScientifique);
            return enseignementDisciplineScientifiqueConverter.toVo(enseignementDisciplineScientifique);
            }

    @ApiOperation("Finds a list of all enseignementDisciplineScientifiques")
    @GetMapping("/")
    public List<EnseignementDisciplineScientifiqueVo> findAll(){
        return enseignementDisciplineScientifiqueConverter.toVo(enseignementDisciplineScientifiqueService.findAll());
    }

    @ApiOperation("Finds a enseignementDisciplineScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EnseignementDisciplineScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return enseignementDisciplineScientifiqueConverter.toVo(enseignementDisciplineScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search enseignementDisciplineScientifique by a specific criteria")
    @PostMapping("/search")
    public List<EnseignementDisciplineScientifiqueVo> findByCriteria(@RequestBody EnseignementDisciplineScientifiqueVo enseignementDisciplineScientifiqueVo){
        return enseignementDisciplineScientifiqueConverter.toVo(enseignementDisciplineScientifiqueService.findByCriteria(enseignementDisciplineScientifiqueVo));
        }

            @ApiOperation("Finds a enseignementDisciplineScientifique by id")
            @GetMapping("/id/{id}")
            public EnseignementDisciplineScientifiqueVo findById(@PathVariable Long id){
            return enseignementDisciplineScientifiqueConverter.toVo(enseignementDisciplineScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  enseignementDisciplineScientifique")
            @PostMapping("/")
            public EnseignementDisciplineScientifiqueVo save(@RequestBody EnseignementDisciplineScientifiqueVo enseignementDisciplineScientifiqueVo){
            EnseignementDisciplineScientifique enseignementDisciplineScientifique = enseignementDisciplineScientifiqueConverter.toItem(enseignementDisciplineScientifiqueVo);
            enseignementDisciplineScientifique = enseignementDisciplineScientifiqueService.save(enseignementDisciplineScientifique);
            return enseignementDisciplineScientifiqueConverter.toVo(enseignementDisciplineScientifique);
            }

            @ApiOperation("Delete the specified enseignementDisciplineScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody EnseignementDisciplineScientifiqueVo enseignementDisciplineScientifiqueVo){
            EnseignementDisciplineScientifique enseignementDisciplineScientifique = enseignementDisciplineScientifiqueConverter.toItem(enseignementDisciplineScientifiqueVo);
            return enseignementDisciplineScientifiqueService.delete(enseignementDisciplineScientifique);
            }

            @ApiOperation("Deletes a enseignementDisciplineScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return enseignementDisciplineScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by disciplineScientifique code")
        @GetMapping("/disciplineScientifique/code/{code}")
        public List<EnseignementDisciplineScientifique> findByDisciplineScientifiqueCode(@PathVariable String code){
        return enseignementDisciplineScientifiqueService.findByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("delete by disciplineScientifique code")
        @DeleteMapping("/disciplineScientifique/code/{code}")
        public int deleteByDisciplineScientifiqueCode(@PathVariable String code){
        return enseignementDisciplineScientifiqueService.deleteByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("find by disciplineScientifique id")
        @GetMapping("/disciplineScientifique/id/{id}")
        public List<EnseignementDisciplineScientifique> findByDisciplineScientifiqueId(@PathVariable Long id){
        return enseignementDisciplineScientifiqueService.findByDisciplineScientifiqueId(id);
        }

        @ApiOperation("delete by disciplineScientifique id")
        @DeleteMapping("/disciplineScientifique/id/{id}")
        public int deleteByDisciplineScientifiqueId(@PathVariable Long id){
        return enseignementDisciplineScientifiqueService.deleteByDisciplineScientifiqueId(id);
        }

        @ApiOperation("find by enseignement id")
        @GetMapping("/enseignement/id/{id}")
        public List<EnseignementDisciplineScientifique> findByEnseignementId(@PathVariable Long id){
        return enseignementDisciplineScientifiqueService.findByEnseignementId(id);
        }

        @ApiOperation("delete by enseignement id")
        @DeleteMapping("/enseignement/id/{id}")
        public int deleteByEnseignementId(@PathVariable Long id){
        return enseignementDisciplineScientifiqueService.deleteByEnseignementId(id);
        }



            }
