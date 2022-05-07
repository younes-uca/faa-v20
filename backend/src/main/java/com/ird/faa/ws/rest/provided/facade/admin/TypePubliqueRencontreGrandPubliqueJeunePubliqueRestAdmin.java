package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypePubliqueRencontreGrandPubliqueJeunePubliqueAdminService;

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
import com.ird.faa.bean.TypePubliqueRencontreGrandPubliqueJeunePublique;
import com.ird.faa.ws.rest.provided.converter.TypePubliqueRencontreGrandPubliqueJeunePubliqueConverter;
import com.ird.faa.ws.rest.provided.vo.TypePubliqueRencontreGrandPubliqueJeunePubliqueVo;

@Api("Manages typePubliqueRencontreGrandPubliqueJeunePublique services")
@RestController
@RequestMapping("api/admin/typePubliqueRencontreGrandPubliqueJeunePublique")
public class TypePubliqueRencontreGrandPubliqueJeunePubliqueRestAdmin {

@Autowired
private TypePubliqueRencontreGrandPubliqueJeunePubliqueAdminService typePubliqueRencontreGrandPubliqueJeunePubliqueService;

@Autowired
private TypePubliqueRencontreGrandPubliqueJeunePubliqueConverter typePubliqueRencontreGrandPubliqueJeunePubliqueConverter;


            @ApiOperation("Updates the specified  typePubliqueRencontreGrandPubliqueJeunePublique")
            @PutMapping("/")
            public  TypePubliqueRencontreGrandPubliqueJeunePubliqueVo update(@RequestBody  TypePubliqueRencontreGrandPubliqueJeunePubliqueVo  typePubliqueRencontreGrandPubliqueJeunePubliqueVo){
            TypePubliqueRencontreGrandPubliqueJeunePublique typePubliqueRencontreGrandPubliqueJeunePublique = typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.toItem(typePubliqueRencontreGrandPubliqueJeunePubliqueVo);
            typePubliqueRencontreGrandPubliqueJeunePublique = typePubliqueRencontreGrandPubliqueJeunePubliqueService.update(typePubliqueRencontreGrandPubliqueJeunePublique);
            return typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.toVo(typePubliqueRencontreGrandPubliqueJeunePublique);
            }

    @ApiOperation("Finds a list of all typePubliqueRencontreGrandPubliqueJeunePubliques")
    @GetMapping("/")
    public List<TypePubliqueRencontreGrandPubliqueJeunePubliqueVo> findAll(){
        return typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.toVo(typePubliqueRencontreGrandPubliqueJeunePubliqueService.findAll());
    }

    @ApiOperation("Finds a typePubliqueRencontreGrandPubliqueJeunePublique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypePubliqueRencontreGrandPubliqueJeunePubliqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.toVo(typePubliqueRencontreGrandPubliqueJeunePubliqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typePubliqueRencontreGrandPubliqueJeunePublique by a specific criteria")
    @PostMapping("/search")
    public List<TypePubliqueRencontreGrandPubliqueJeunePubliqueVo> findByCriteria(@RequestBody TypePubliqueRencontreGrandPubliqueJeunePubliqueVo typePubliqueRencontreGrandPubliqueJeunePubliqueVo){
        return typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.toVo(typePubliqueRencontreGrandPubliqueJeunePubliqueService.findByCriteria(typePubliqueRencontreGrandPubliqueJeunePubliqueVo));
        }

            @ApiOperation("Finds a typePubliqueRencontreGrandPubliqueJeunePublique by id")
            @GetMapping("/id/{id}")
            public TypePubliqueRencontreGrandPubliqueJeunePubliqueVo findById(@PathVariable Long id){
            return typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.toVo(typePubliqueRencontreGrandPubliqueJeunePubliqueService.findById(id));
            }

            @ApiOperation("Saves the specified  typePubliqueRencontreGrandPubliqueJeunePublique")
            @PostMapping("/")
            public TypePubliqueRencontreGrandPubliqueJeunePubliqueVo save(@RequestBody TypePubliqueRencontreGrandPubliqueJeunePubliqueVo typePubliqueRencontreGrandPubliqueJeunePubliqueVo){
            TypePubliqueRencontreGrandPubliqueJeunePublique typePubliqueRencontreGrandPubliqueJeunePublique = typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.toItem(typePubliqueRencontreGrandPubliqueJeunePubliqueVo);
            typePubliqueRencontreGrandPubliqueJeunePublique = typePubliqueRencontreGrandPubliqueJeunePubliqueService.save(typePubliqueRencontreGrandPubliqueJeunePublique);
            return typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.toVo(typePubliqueRencontreGrandPubliqueJeunePublique);
            }

            @ApiOperation("Delete the specified typePubliqueRencontreGrandPubliqueJeunePublique")
            @DeleteMapping("/")
            public int delete(@RequestBody TypePubliqueRencontreGrandPubliqueJeunePubliqueVo typePubliqueRencontreGrandPubliqueJeunePubliqueVo){
            TypePubliqueRencontreGrandPubliqueJeunePublique typePubliqueRencontreGrandPubliqueJeunePublique = typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.toItem(typePubliqueRencontreGrandPubliqueJeunePubliqueVo);
            return typePubliqueRencontreGrandPubliqueJeunePubliqueService.delete(typePubliqueRencontreGrandPubliqueJeunePublique);
            }

            @ApiOperation("Deletes a typePubliqueRencontreGrandPubliqueJeunePublique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typePubliqueRencontreGrandPubliqueJeunePubliqueService.deleteById(id);
            }
        @ApiOperation("find by rencontreGrandPubliqueJeunePublique id")
        @GetMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public List<TypePubliqueRencontreGrandPubliqueJeunePublique> findByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return typePubliqueRencontreGrandPubliqueJeunePubliqueService.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @ApiOperation("delete by rencontreGrandPubliqueJeunePublique id")
        @DeleteMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return typePubliqueRencontreGrandPubliqueJeunePubliqueService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @ApiOperation("find by typePublique code")
        @GetMapping("/typePublique/code/{code}")
        public List<TypePubliqueRencontreGrandPubliqueJeunePublique> findByTypePubliqueCode(@PathVariable String code){
        return typePubliqueRencontreGrandPubliqueJeunePubliqueService.findByTypePubliqueCode(code);
        }

        @ApiOperation("delete by typePublique code")
        @DeleteMapping("/typePublique/code/{code}")
        public int deleteByTypePubliqueCode(@PathVariable String code){
        return typePubliqueRencontreGrandPubliqueJeunePubliqueService.deleteByTypePubliqueCode(code);
        }

        @ApiOperation("find by typePublique id")
        @GetMapping("/typePublique/id/{id}")
        public List<TypePubliqueRencontreGrandPubliqueJeunePublique> findByTypePubliqueId(@PathVariable Long id){
        return typePubliqueRencontreGrandPubliqueJeunePubliqueService.findByTypePubliqueId(id);
        }

        @ApiOperation("delete by typePublique id")
        @DeleteMapping("/typePublique/id/{id}")
        public int deleteByTypePubliqueId(@PathVariable Long id){
        return typePubliqueRencontreGrandPubliqueJeunePubliqueService.deleteByTypePubliqueId(id);
        }



            }
