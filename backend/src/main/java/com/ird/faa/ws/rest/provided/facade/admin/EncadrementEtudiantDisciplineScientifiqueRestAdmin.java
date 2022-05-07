package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EncadrementEtudiantDisciplineScientifiqueAdminService;

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
import com.ird.faa.bean.EncadrementEtudiantDisciplineScientifique;
import com.ird.faa.ws.rest.provided.converter.EncadrementEtudiantDisciplineScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.EncadrementEtudiantDisciplineScientifiqueVo;

@Api("Manages encadrementEtudiantDisciplineScientifique services")
@RestController
@RequestMapping("api/admin/encadrementEtudiantDisciplineScientifique")
public class EncadrementEtudiantDisciplineScientifiqueRestAdmin {

@Autowired
private EncadrementEtudiantDisciplineScientifiqueAdminService encadrementEtudiantDisciplineScientifiqueService;

@Autowired
private EncadrementEtudiantDisciplineScientifiqueConverter encadrementEtudiantDisciplineScientifiqueConverter;


            @ApiOperation("Updates the specified  encadrementEtudiantDisciplineScientifique")
            @PutMapping("/")
            public  EncadrementEtudiantDisciplineScientifiqueVo update(@RequestBody  EncadrementEtudiantDisciplineScientifiqueVo  encadrementEtudiantDisciplineScientifiqueVo){
            EncadrementEtudiantDisciplineScientifique encadrementEtudiantDisciplineScientifique = encadrementEtudiantDisciplineScientifiqueConverter.toItem(encadrementEtudiantDisciplineScientifiqueVo);
            encadrementEtudiantDisciplineScientifique = encadrementEtudiantDisciplineScientifiqueService.update(encadrementEtudiantDisciplineScientifique);
            return encadrementEtudiantDisciplineScientifiqueConverter.toVo(encadrementEtudiantDisciplineScientifique);
            }

    @ApiOperation("Finds a list of all encadrementEtudiantDisciplineScientifiques")
    @GetMapping("/")
    public List<EncadrementEtudiantDisciplineScientifiqueVo> findAll(){
        return encadrementEtudiantDisciplineScientifiqueConverter.toVo(encadrementEtudiantDisciplineScientifiqueService.findAll());
    }

    @ApiOperation("Finds a encadrementEtudiantDisciplineScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EncadrementEtudiantDisciplineScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return encadrementEtudiantDisciplineScientifiqueConverter.toVo(encadrementEtudiantDisciplineScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search encadrementEtudiantDisciplineScientifique by a specific criteria")
    @PostMapping("/search")
    public List<EncadrementEtudiantDisciplineScientifiqueVo> findByCriteria(@RequestBody EncadrementEtudiantDisciplineScientifiqueVo encadrementEtudiantDisciplineScientifiqueVo){
        return encadrementEtudiantDisciplineScientifiqueConverter.toVo(encadrementEtudiantDisciplineScientifiqueService.findByCriteria(encadrementEtudiantDisciplineScientifiqueVo));
        }

            @ApiOperation("Finds a encadrementEtudiantDisciplineScientifique by id")
            @GetMapping("/id/{id}")
            public EncadrementEtudiantDisciplineScientifiqueVo findById(@PathVariable Long id){
            return encadrementEtudiantDisciplineScientifiqueConverter.toVo(encadrementEtudiantDisciplineScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  encadrementEtudiantDisciplineScientifique")
            @PostMapping("/")
            public EncadrementEtudiantDisciplineScientifiqueVo save(@RequestBody EncadrementEtudiantDisciplineScientifiqueVo encadrementEtudiantDisciplineScientifiqueVo){
            EncadrementEtudiantDisciplineScientifique encadrementEtudiantDisciplineScientifique = encadrementEtudiantDisciplineScientifiqueConverter.toItem(encadrementEtudiantDisciplineScientifiqueVo);
            encadrementEtudiantDisciplineScientifique = encadrementEtudiantDisciplineScientifiqueService.save(encadrementEtudiantDisciplineScientifique);
            return encadrementEtudiantDisciplineScientifiqueConverter.toVo(encadrementEtudiantDisciplineScientifique);
            }

            @ApiOperation("Delete the specified encadrementEtudiantDisciplineScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody EncadrementEtudiantDisciplineScientifiqueVo encadrementEtudiantDisciplineScientifiqueVo){
            EncadrementEtudiantDisciplineScientifique encadrementEtudiantDisciplineScientifique = encadrementEtudiantDisciplineScientifiqueConverter.toItem(encadrementEtudiantDisciplineScientifiqueVo);
            return encadrementEtudiantDisciplineScientifiqueService.delete(encadrementEtudiantDisciplineScientifique);
            }

            @ApiOperation("Deletes a encadrementEtudiantDisciplineScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return encadrementEtudiantDisciplineScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by encadrementEtudiant id")
        @GetMapping("/encadrementEtudiant/id/{id}")
        public List<EncadrementEtudiantDisciplineScientifique> findByEncadrementEtudiantId(@PathVariable Long id){
        return encadrementEtudiantDisciplineScientifiqueService.findByEncadrementEtudiantId(id);
        }

        @ApiOperation("delete by encadrementEtudiant id")
        @DeleteMapping("/encadrementEtudiant/id/{id}")
        public int deleteByEncadrementEtudiantId(@PathVariable Long id){
        return encadrementEtudiantDisciplineScientifiqueService.deleteByEncadrementEtudiantId(id);
        }

        @ApiOperation("find by disciplineScientifique code")
        @GetMapping("/disciplineScientifique/code/{code}")
        public List<EncadrementEtudiantDisciplineScientifique> findByDisciplineScientifiqueCode(@PathVariable String code){
        return encadrementEtudiantDisciplineScientifiqueService.findByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("delete by disciplineScientifique code")
        @DeleteMapping("/disciplineScientifique/code/{code}")
        public int deleteByDisciplineScientifiqueCode(@PathVariable String code){
        return encadrementEtudiantDisciplineScientifiqueService.deleteByDisciplineScientifiqueCode(code);
        }

        @ApiOperation("find by disciplineScientifique id")
        @GetMapping("/disciplineScientifique/id/{id}")
        public List<EncadrementEtudiantDisciplineScientifique> findByDisciplineScientifiqueId(@PathVariable Long id){
        return encadrementEtudiantDisciplineScientifiqueService.findByDisciplineScientifiqueId(id);
        }

        @ApiOperation("delete by disciplineScientifique id")
        @DeleteMapping("/disciplineScientifique/id/{id}")
        public int deleteByDisciplineScientifiqueId(@PathVariable Long id){
        return encadrementEtudiantDisciplineScientifiqueService.deleteByDisciplineScientifiqueId(id);
        }



            }
