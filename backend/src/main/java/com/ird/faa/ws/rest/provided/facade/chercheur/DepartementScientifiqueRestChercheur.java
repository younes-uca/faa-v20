package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.DepartementScientifiqueChercheurService;

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
import com.ird.faa.bean.DepartementScientifique;
import com.ird.faa.ws.rest.provided.converter.DepartementScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.DepartementScientifiqueVo;

@Api("Manages departementScientifique services")
@RestController
@RequestMapping("api/chercheur/departementScientifique")
public class DepartementScientifiqueRestChercheur {

@Autowired
private DepartementScientifiqueChercheurService departementScientifiqueService;

@Autowired
private DepartementScientifiqueConverter departementScientifiqueConverter;


            @ApiOperation("Updates the specified  departementScientifique")
            @PutMapping("/")
            public  DepartementScientifiqueVo update(@RequestBody  DepartementScientifiqueVo  departementScientifiqueVo){
            DepartementScientifique departementScientifique = departementScientifiqueConverter.toItem(departementScientifiqueVo);
            departementScientifique = departementScientifiqueService.update(departementScientifique);
            return departementScientifiqueConverter.toVo(departementScientifique);
            }

    @ApiOperation("Finds a list of all departementScientifiques")
    @GetMapping("/")
    public List<DepartementScientifiqueVo> findAll(){
        return departementScientifiqueConverter.toVo(departementScientifiqueService.findAll());
    }

    @ApiOperation("Finds a departementScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public DepartementScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return departementScientifiqueConverter.toVo(departementScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search departementScientifique by a specific criteria")
    @PostMapping("/search")
    public List<DepartementScientifiqueVo> findByCriteria(@RequestBody DepartementScientifiqueVo departementScientifiqueVo){
        return departementScientifiqueConverter.toVo(departementScientifiqueService.findByCriteria(departementScientifiqueVo));
        }

            @ApiOperation("Finds a departementScientifique by id")
            @GetMapping("/id/{id}")
            public DepartementScientifiqueVo findById(@PathVariable Long id){
            return departementScientifiqueConverter.toVo(departementScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  departementScientifique")
            @PostMapping("/")
            public DepartementScientifiqueVo save(@RequestBody DepartementScientifiqueVo departementScientifiqueVo){
            DepartementScientifique departementScientifique = departementScientifiqueConverter.toItem(departementScientifiqueVo);
            departementScientifique = departementScientifiqueService.save(departementScientifique);
            return departementScientifiqueConverter.toVo(departementScientifique);
            }

            @ApiOperation("Delete the specified departementScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody DepartementScientifiqueVo departementScientifiqueVo){
            DepartementScientifique departementScientifique = departementScientifiqueConverter.toItem(departementScientifiqueVo);
            return departementScientifiqueService.delete(departementScientifique);
            }

            @ApiOperation("Deletes a departementScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return departementScientifiqueService.deleteById(id);
            }


            }
