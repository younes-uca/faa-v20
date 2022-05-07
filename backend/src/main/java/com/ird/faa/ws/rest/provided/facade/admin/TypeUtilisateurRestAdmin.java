package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypeUtilisateurAdminService;

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
import com.ird.faa.bean.TypeUtilisateur;
import com.ird.faa.ws.rest.provided.converter.TypeUtilisateurConverter;
import com.ird.faa.ws.rest.provided.vo.TypeUtilisateurVo;

@Api("Manages typeUtilisateur services")
@RestController
@RequestMapping("api/admin/typeUtilisateur")
public class TypeUtilisateurRestAdmin {

@Autowired
private TypeUtilisateurAdminService typeUtilisateurService;

@Autowired
private TypeUtilisateurConverter typeUtilisateurConverter;


            @ApiOperation("Updates the specified  typeUtilisateur")
            @PutMapping("/")
            public  TypeUtilisateurVo update(@RequestBody  TypeUtilisateurVo  typeUtilisateurVo){
            TypeUtilisateur typeUtilisateur = typeUtilisateurConverter.toItem(typeUtilisateurVo);
            typeUtilisateur = typeUtilisateurService.update(typeUtilisateur);
            return typeUtilisateurConverter.toVo(typeUtilisateur);
            }

    @ApiOperation("Finds a list of all typeUtilisateurs")
    @GetMapping("/")
    public List<TypeUtilisateurVo> findAll(){
        return typeUtilisateurConverter.toVo(typeUtilisateurService.findAll());
    }

    @ApiOperation("Finds a typeUtilisateur with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeUtilisateurVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeUtilisateurConverter.toVo(typeUtilisateurService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeUtilisateur by a specific criteria")
    @PostMapping("/search")
    public List<TypeUtilisateurVo> findByCriteria(@RequestBody TypeUtilisateurVo typeUtilisateurVo){
        return typeUtilisateurConverter.toVo(typeUtilisateurService.findByCriteria(typeUtilisateurVo));
        }

            @ApiOperation("Finds a typeUtilisateur by id")
            @GetMapping("/id/{id}")
            public TypeUtilisateurVo findById(@PathVariable Long id){
            return typeUtilisateurConverter.toVo(typeUtilisateurService.findById(id));
            }

            @ApiOperation("Saves the specified  typeUtilisateur")
            @PostMapping("/")
            public TypeUtilisateurVo save(@RequestBody TypeUtilisateurVo typeUtilisateurVo){
            TypeUtilisateur typeUtilisateur = typeUtilisateurConverter.toItem(typeUtilisateurVo);
            typeUtilisateur = typeUtilisateurService.save(typeUtilisateur);
            return typeUtilisateurConverter.toVo(typeUtilisateur);
            }

            @ApiOperation("Delete the specified typeUtilisateur")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeUtilisateurVo typeUtilisateurVo){
            TypeUtilisateur typeUtilisateur = typeUtilisateurConverter.toItem(typeUtilisateurVo);
            return typeUtilisateurService.delete(typeUtilisateur);
            }

            @ApiOperation("Deletes a typeUtilisateur by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeUtilisateurService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public TypeUtilisateurVo archiver(@RequestBody TypeUtilisateurVo typeUtilisateurVo){
                TypeUtilisateur typeUtilisateur = typeUtilisateurService.archiver(typeUtilisateurConverter.toItem(typeUtilisateurVo));
                return typeUtilisateurConverter.toVo(typeUtilisateur);
                }

            @PutMapping("/desarchiver/")
            public TypeUtilisateurVo desarchiver(@RequestBody TypeUtilisateurVo typeUtilisateurVo){
                TypeUtilisateur typeUtilisateur = typeUtilisateurService.desarchiver(typeUtilisateurConverter.toItem(typeUtilisateurVo));
                return typeUtilisateurConverter.toVo(typeUtilisateur);}
            }
