package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueChercheurService;

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
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueDisciplineScientifique;
import com.ird.faa.ws.rest.provided.converter.RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo;

@Api("Manages rencontreGrandPubliqueJeunePubliqueDisciplineScientifique services")
@RestController
@RequestMapping("api/chercheur/rencontreGrandPubliqueJeunePubliqueDisciplineScientifique")
public class RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueRestChercheur {

@Autowired
private RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueChercheurService rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService;

@Autowired
private RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter;


            @ApiOperation("Updates the specified  rencontreGrandPubliqueJeunePubliqueDisciplineScientifique")
            @PutMapping("/")
            public  RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo update(@RequestBody  RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo  rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo){
            RencontreGrandPubliqueJeunePubliqueDisciplineScientifique rencontreGrandPubliqueJeunePubliqueDisciplineScientifique = rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.toItem(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo);
            rencontreGrandPubliqueJeunePubliqueDisciplineScientifique = rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.update(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique);
            return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.toVo(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique);
            }

    @ApiOperation("Finds a list of all rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques")
    @GetMapping("/")
    public List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo> findAll(){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.toVo(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.findAll());
    }

    @ApiOperation("Finds a rencontreGrandPubliqueJeunePubliqueDisciplineScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.toVo(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search rencontreGrandPubliqueJeunePubliqueDisciplineScientifique by a specific criteria")
    @PostMapping("/search")
    public List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo> findByCriteria(@RequestBody RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.toVo(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.findByCriteria(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo));
        }

            @ApiOperation("Finds a rencontreGrandPubliqueJeunePubliqueDisciplineScientifique by id")
            @GetMapping("/id/{id}")
            public RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo findById(@PathVariable Long id){
            return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.toVo(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  rencontreGrandPubliqueJeunePubliqueDisciplineScientifique")
            @PostMapping("/")
            public RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo save(@RequestBody RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo){
            RencontreGrandPubliqueJeunePubliqueDisciplineScientifique rencontreGrandPubliqueJeunePubliqueDisciplineScientifique = rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.toItem(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo);
            rencontreGrandPubliqueJeunePubliqueDisciplineScientifique = rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.save(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique);
            return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.toVo(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique);
            }

            @ApiOperation("Delete the specified rencontreGrandPubliqueJeunePubliqueDisciplineScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo){
            RencontreGrandPubliqueJeunePubliqueDisciplineScientifique rencontreGrandPubliqueJeunePubliqueDisciplineScientifique = rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.toItem(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo);
            return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.delete(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique);
            }

            @ApiOperation("Deletes a rencontreGrandPubliqueJeunePubliqueDisciplineScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by rencontreGrandPubliqueJeunePublique id")
        @GetMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @ApiOperation("delete by rencontreGrandPubliqueJeunePublique id")
        @DeleteMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @ApiOperation("find by disciplineScientifique code")
        @GetMapping("/disciplineScientifique/code/{code}")
        public List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findByDisciplineScientifiqueCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.findByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("delete by disciplineScientifique code")
        @DeleteMapping("/disciplineScientifique/code/{code}")
        public int deleteByDisciplineScientifiqueCode(@PathVariable String code){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.deleteByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("find by disciplineScientifique id")
        @GetMapping("/disciplineScientifique/id/{id}")
        public List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findByDisciplineScientifiqueId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.findByDisciplineScientifiqueId(id);
        }

        @ApiOperation("delete by disciplineScientifique id")
        @DeleteMapping("/disciplineScientifique/id/{id}")
        public int deleteByDisciplineScientifiqueId(@PathVariable Long id){
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.deleteByDisciplineScientifiqueId(id);
        }



            }
