package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EtablissementPartenaireAdminService;

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
import com.ird.faa.bean.EtablissementPartenaire;
import com.ird.faa.ws.rest.provided.converter.EtablissementPartenaireConverter;
import com.ird.faa.ws.rest.provided.vo.EtablissementPartenaireVo;

@Api("Manages etablissementPartenaire services")
@RestController
@RequestMapping("api/admin/etablissementPartenaire")
public class EtablissementPartenaireRestAdmin {

@Autowired
private EtablissementPartenaireAdminService etablissementPartenaireService;

@Autowired
private EtablissementPartenaireConverter etablissementPartenaireConverter;


            @ApiOperation("Updates the specified  etablissementPartenaire")
            @PutMapping("/")
            public  EtablissementPartenaireVo update(@RequestBody  EtablissementPartenaireVo  etablissementPartenaireVo){
            EtablissementPartenaire etablissementPartenaire = etablissementPartenaireConverter.toItem(etablissementPartenaireVo);
            etablissementPartenaire = etablissementPartenaireService.update(etablissementPartenaire);
            return etablissementPartenaireConverter.toVo(etablissementPartenaire);
            }

    @ApiOperation("Finds a list of all etablissementPartenaires")
    @GetMapping("/")
    public List<EtablissementPartenaireVo> findAll(){
        return etablissementPartenaireConverter.toVo(etablissementPartenaireService.findAll());
    }

    @ApiOperation("Finds a etablissementPartenaire with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EtablissementPartenaireVo findByIdWithAssociatedList(@PathVariable Long id){
    return etablissementPartenaireConverter.toVo(etablissementPartenaireService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search etablissementPartenaire by a specific criteria")
    @PostMapping("/search")
    public List<EtablissementPartenaireVo> findByCriteria(@RequestBody EtablissementPartenaireVo etablissementPartenaireVo){
        return etablissementPartenaireConverter.toVo(etablissementPartenaireService.findByCriteria(etablissementPartenaireVo));
        }

            @ApiOperation("Finds a etablissementPartenaire by id")
            @GetMapping("/id/{id}")
            public EtablissementPartenaireVo findById(@PathVariable Long id){
            return etablissementPartenaireConverter.toVo(etablissementPartenaireService.findById(id));
            }

            @ApiOperation("Saves the specified  etablissementPartenaire")
            @PostMapping("/")
            public EtablissementPartenaireVo save(@RequestBody EtablissementPartenaireVo etablissementPartenaireVo){
            EtablissementPartenaire etablissementPartenaire = etablissementPartenaireConverter.toItem(etablissementPartenaireVo);
            etablissementPartenaire = etablissementPartenaireService.save(etablissementPartenaire);
            return etablissementPartenaireConverter.toVo(etablissementPartenaire);
            }

            @ApiOperation("Delete the specified etablissementPartenaire")
            @DeleteMapping("/")
            public int delete(@RequestBody EtablissementPartenaireVo etablissementPartenaireVo){
            EtablissementPartenaire etablissementPartenaire = etablissementPartenaireConverter.toItem(etablissementPartenaireVo);
            return etablissementPartenaireService.delete(etablissementPartenaire);
            }

            @ApiOperation("Deletes a etablissementPartenaire by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return etablissementPartenaireService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public EtablissementPartenaireVo archiver(@RequestBody EtablissementPartenaireVo etablissementPartenaireVo){
                EtablissementPartenaire etablissementPartenaire = etablissementPartenaireService.archiver(etablissementPartenaireConverter.toItem(etablissementPartenaireVo));
                return etablissementPartenaireConverter.toVo(etablissementPartenaire);
                }

            @PutMapping("/desarchiver/")
            public EtablissementPartenaireVo desarchiver(@RequestBody EtablissementPartenaireVo etablissementPartenaireVo){
                EtablissementPartenaire etablissementPartenaire = etablissementPartenaireService.desarchiver(etablissementPartenaireConverter.toItem(etablissementPartenaireVo));
                return etablissementPartenaireConverter.toVo(etablissementPartenaire);}
            }
