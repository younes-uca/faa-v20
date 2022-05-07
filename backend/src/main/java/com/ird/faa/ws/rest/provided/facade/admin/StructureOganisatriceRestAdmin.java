package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.StructureOganisatriceAdminService;

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
import com.ird.faa.bean.StructureOganisatrice;
import com.ird.faa.ws.rest.provided.converter.StructureOganisatriceConverter;
import com.ird.faa.ws.rest.provided.vo.StructureOganisatriceVo;

@Api("Manages structureOganisatrice services")
@RestController
@RequestMapping("api/admin/structureOganisatrice")
public class StructureOganisatriceRestAdmin {

@Autowired
private StructureOganisatriceAdminService structureOganisatriceService;

@Autowired
private StructureOganisatriceConverter structureOganisatriceConverter;


            @ApiOperation("Updates the specified  structureOganisatrice")
            @PutMapping("/")
            public  StructureOganisatriceVo update(@RequestBody  StructureOganisatriceVo  structureOganisatriceVo){
            StructureOganisatrice structureOganisatrice = structureOganisatriceConverter.toItem(structureOganisatriceVo);
            structureOganisatrice = structureOganisatriceService.update(structureOganisatrice);
            return structureOganisatriceConverter.toVo(structureOganisatrice);
            }

    @ApiOperation("Finds a list of all structureOganisatrices")
    @GetMapping("/")
    public List<StructureOganisatriceVo> findAll(){
        return structureOganisatriceConverter.toVo(structureOganisatriceService.findAll());
    }

    @ApiOperation("Finds a structureOganisatrice with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public StructureOganisatriceVo findByIdWithAssociatedList(@PathVariable Long id){
    return structureOganisatriceConverter.toVo(structureOganisatriceService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search structureOganisatrice by a specific criteria")
    @PostMapping("/search")
    public List<StructureOganisatriceVo> findByCriteria(@RequestBody StructureOganisatriceVo structureOganisatriceVo){
        return structureOganisatriceConverter.toVo(structureOganisatriceService.findByCriteria(structureOganisatriceVo));
        }

            @ApiOperation("Finds a structureOganisatrice by id")
            @GetMapping("/id/{id}")
            public StructureOganisatriceVo findById(@PathVariable Long id){
            return structureOganisatriceConverter.toVo(structureOganisatriceService.findById(id));
            }

            @ApiOperation("Saves the specified  structureOganisatrice")
            @PostMapping("/")
            public StructureOganisatriceVo save(@RequestBody StructureOganisatriceVo structureOganisatriceVo){
            StructureOganisatrice structureOganisatrice = structureOganisatriceConverter.toItem(structureOganisatriceVo);
            structureOganisatrice = structureOganisatriceService.save(structureOganisatrice);
            return structureOganisatriceConverter.toVo(structureOganisatrice);
            }

            @ApiOperation("Delete the specified structureOganisatrice")
            @DeleteMapping("/")
            public int delete(@RequestBody StructureOganisatriceVo structureOganisatriceVo){
            StructureOganisatrice structureOganisatrice = structureOganisatriceConverter.toItem(structureOganisatriceVo);
            return structureOganisatriceService.delete(structureOganisatrice);
            }

            @ApiOperation("Deletes a structureOganisatrice by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return structureOganisatriceService.deleteById(id);
            }
        @ApiOperation("find by rencontreGrandPubliqueJeunePublique id")
        @GetMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public List<StructureOganisatrice> findByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return structureOganisatriceService.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @ApiOperation("delete by rencontreGrandPubliqueJeunePublique id")
        @DeleteMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return structureOganisatriceService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @ApiOperation("find by etablissement code")
        @GetMapping("/etablissement/code/{code}")
        public List<StructureOganisatrice> findByEtablissementCode(@PathVariable String code){
        return structureOganisatriceService.findByEtablissementCode(code);
        }

        @ApiOperation("delete by etablissement code")
        @DeleteMapping("/etablissement/code/{code}")
        public int deleteByEtablissementCode(@PathVariable String code){
        return structureOganisatriceService.deleteByEtablissementCode(code);
        }

        @ApiOperation("find by etablissement id")
        @GetMapping("/etablissement/id/{id}")
        public List<StructureOganisatrice> findByEtablissementId(@PathVariable Long id){
        return structureOganisatriceService.findByEtablissementId(id);
        }

        @ApiOperation("delete by etablissement id")
        @DeleteMapping("/etablissement/id/{id}")
        public int deleteByEtablissementId(@PathVariable Long id){
        return structureOganisatriceService.deleteByEtablissementId(id);
        }



            }
