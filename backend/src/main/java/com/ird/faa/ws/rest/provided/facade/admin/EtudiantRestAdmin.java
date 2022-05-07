package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EtudiantAdminService;

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
import com.ird.faa.bean.Etudiant;
import com.ird.faa.ws.rest.provided.converter.EtudiantConverter;
import com.ird.faa.ws.rest.provided.vo.EtudiantVo;

@Api("Manages etudiant services")
@RestController
@RequestMapping("api/admin/etudiant")
public class EtudiantRestAdmin {

@Autowired
private EtudiantAdminService etudiantService;

@Autowired
private EtudiantConverter etudiantConverter;


            @ApiOperation("Updates the specified  etudiant")
            @PutMapping("/")
            public  EtudiantVo update(@RequestBody  EtudiantVo  etudiantVo){
            Etudiant etudiant = etudiantConverter.toItem(etudiantVo);
            etudiant = etudiantService.update(etudiant);
            return etudiantConverter.toVo(etudiant);
            }

    @ApiOperation("Finds a list of all etudiants")
    @GetMapping("/")
    public List<EtudiantVo> findAll(){
        return etudiantConverter.toVo(etudiantService.findAll());
    }

    @ApiOperation("Finds a etudiant with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EtudiantVo findByIdWithAssociatedList(@PathVariable Long id){
    return etudiantConverter.toVo(etudiantService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search etudiant by a specific criteria")
    @PostMapping("/search")
    public List<EtudiantVo> findByCriteria(@RequestBody EtudiantVo etudiantVo){
        return etudiantConverter.toVo(etudiantService.findByCriteria(etudiantVo));
        }

            @ApiOperation("Finds a etudiant by id")
            @GetMapping("/id/{id}")
            public EtudiantVo findById(@PathVariable Long id){
            return etudiantConverter.toVo(etudiantService.findById(id));
            }

            @ApiOperation("Saves the specified  etudiant")
            @PostMapping("/")
            public EtudiantVo save(@RequestBody EtudiantVo etudiantVo){
            Etudiant etudiant = etudiantConverter.toItem(etudiantVo);
            etudiant = etudiantService.save(etudiant);
            return etudiantConverter.toVo(etudiant);
            }

            @ApiOperation("Delete the specified etudiant")
            @DeleteMapping("/")
            public int delete(@RequestBody EtudiantVo etudiantVo){
            Etudiant etudiant = etudiantConverter.toItem(etudiantVo);
            return etudiantService.delete(etudiant);
            }

            @ApiOperation("Deletes a etudiant by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return etudiantService.deleteById(id);
            }
        @ApiOperation("find by sexe code")
        @GetMapping("/sexe/code/{code}")
        public List<Etudiant> findBySexeCode(@PathVariable String code){
        return etudiantService.findBySexeCode(code);
        }

        @ApiOperation("delete by sexe code")
        @DeleteMapping("/sexe/code/{code}")
        public int deleteBySexeCode(@PathVariable String code){
        return etudiantService.deleteBySexeCode(code);
        }

        @ApiOperation("find by sexe id")
        @GetMapping("/sexe/id/{id}")
        public List<Etudiant> findBySexeId(@PathVariable Long id){
        return etudiantService.findBySexeId(id);
        }

        @ApiOperation("delete by sexe id")
        @DeleteMapping("/sexe/id/{id}")
        public int deleteBySexeId(@PathVariable Long id){
        return etudiantService.deleteBySexeId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<Etudiant> findByPaysCode(@PathVariable String code){
        return etudiantService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return etudiantService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<Etudiant> findByPaysId(@PathVariable Long id){
        return etudiantService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return etudiantService.deleteByPaysId(id);
        }



            @PutMapping("/archiver/")
            public EtudiantVo archiver(@RequestBody EtudiantVo etudiantVo){
                Etudiant etudiant = etudiantService.archiver(etudiantConverter.toItem(etudiantVo));
                return etudiantConverter.toVo(etudiant);
                }

            @PutMapping("/desarchiver/")
            public EtudiantVo desarchiver(@RequestBody EtudiantVo etudiantVo){
                Etudiant etudiant = etudiantService.desarchiver(etudiantConverter.toItem(etudiantVo));
                return etudiantConverter.toVo(etudiant);}
            }
