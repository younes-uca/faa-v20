package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ObjetFormationGeneriqueChercheurService;

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
import com.ird.faa.bean.ObjetFormationGenerique;
import com.ird.faa.ws.rest.provided.converter.ObjetFormationGeneriqueConverter;
import com.ird.faa.ws.rest.provided.vo.ObjetFormationGeneriqueVo;

@Api("Manages objetFormationGenerique services")
@RestController
@RequestMapping("api/chercheur/objetFormationGenerique")
public class ObjetFormationGeneriqueRestChercheur {

@Autowired
private ObjetFormationGeneriqueChercheurService objetFormationGeneriqueService;

@Autowired
private ObjetFormationGeneriqueConverter objetFormationGeneriqueConverter;


            @ApiOperation("Updates the specified  objetFormationGenerique")
            @PutMapping("/")
            public  ObjetFormationGeneriqueVo update(@RequestBody  ObjetFormationGeneriqueVo  objetFormationGeneriqueVo){
            ObjetFormationGenerique objetFormationGenerique = objetFormationGeneriqueConverter.toItem(objetFormationGeneriqueVo);
            objetFormationGenerique = objetFormationGeneriqueService.update(objetFormationGenerique);
            return objetFormationGeneriqueConverter.toVo(objetFormationGenerique);
            }

    @ApiOperation("Finds a list of all objetFormationGeneriques")
    @GetMapping("/")
    public List<ObjetFormationGeneriqueVo> findAll(){
        return objetFormationGeneriqueConverter.toVo(objetFormationGeneriqueService.findAll());
    }

    @ApiOperation("Finds a objetFormationGenerique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ObjetFormationGeneriqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return objetFormationGeneriqueConverter.toVo(objetFormationGeneriqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search objetFormationGenerique by a specific criteria")
    @PostMapping("/search")
    public List<ObjetFormationGeneriqueVo> findByCriteria(@RequestBody ObjetFormationGeneriqueVo objetFormationGeneriqueVo){
        return objetFormationGeneriqueConverter.toVo(objetFormationGeneriqueService.findByCriteria(objetFormationGeneriqueVo));
        }

            @ApiOperation("Finds a objetFormationGenerique by id")
            @GetMapping("/id/{id}")
            public ObjetFormationGeneriqueVo findById(@PathVariable Long id){
            return objetFormationGeneriqueConverter.toVo(objetFormationGeneriqueService.findById(id));
            }

            @ApiOperation("Saves the specified  objetFormationGenerique")
            @PostMapping("/")
            public ObjetFormationGeneriqueVo save(@RequestBody ObjetFormationGeneriqueVo objetFormationGeneriqueVo){
            ObjetFormationGenerique objetFormationGenerique = objetFormationGeneriqueConverter.toItem(objetFormationGeneriqueVo);
            objetFormationGenerique = objetFormationGeneriqueService.save(objetFormationGenerique);
            return objetFormationGeneriqueConverter.toVo(objetFormationGenerique);
            }

            @ApiOperation("Delete the specified objetFormationGenerique")
            @DeleteMapping("/")
            public int delete(@RequestBody ObjetFormationGeneriqueVo objetFormationGeneriqueVo){
            ObjetFormationGenerique objetFormationGenerique = objetFormationGeneriqueConverter.toItem(objetFormationGeneriqueVo);
            return objetFormationGeneriqueService.delete(objetFormationGenerique);
            }

            @ApiOperation("Deletes a objetFormationGenerique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return objetFormationGeneriqueService.deleteById(id);
            }


            }
