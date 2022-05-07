package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypeOutilPedagogiqueAdminService;

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
import com.ird.faa.bean.TypeOutilPedagogique;
import com.ird.faa.ws.rest.provided.converter.TypeOutilPedagogiqueConverter;
import com.ird.faa.ws.rest.provided.vo.TypeOutilPedagogiqueVo;

@Api("Manages typeOutilPedagogique services")
@RestController
@RequestMapping("api/admin/typeOutilPedagogique")
public class TypeOutilPedagogiqueRestAdmin {

@Autowired
private TypeOutilPedagogiqueAdminService typeOutilPedagogiqueService;

@Autowired
private TypeOutilPedagogiqueConverter typeOutilPedagogiqueConverter;


            @ApiOperation("Updates the specified  typeOutilPedagogique")
            @PutMapping("/")
            public  TypeOutilPedagogiqueVo update(@RequestBody  TypeOutilPedagogiqueVo  typeOutilPedagogiqueVo){
            TypeOutilPedagogique typeOutilPedagogique = typeOutilPedagogiqueConverter.toItem(typeOutilPedagogiqueVo);
            typeOutilPedagogique = typeOutilPedagogiqueService.update(typeOutilPedagogique);
            return typeOutilPedagogiqueConverter.toVo(typeOutilPedagogique);
            }

    @ApiOperation("Finds a list of all typeOutilPedagogiques")
    @GetMapping("/")
    public List<TypeOutilPedagogiqueVo> findAll(){
        return typeOutilPedagogiqueConverter.toVo(typeOutilPedagogiqueService.findAll());
    }

    @ApiOperation("Finds a typeOutilPedagogique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeOutilPedagogiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeOutilPedagogiqueConverter.toVo(typeOutilPedagogiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeOutilPedagogique by a specific criteria")
    @PostMapping("/search")
    public List<TypeOutilPedagogiqueVo> findByCriteria(@RequestBody TypeOutilPedagogiqueVo typeOutilPedagogiqueVo){
        return typeOutilPedagogiqueConverter.toVo(typeOutilPedagogiqueService.findByCriteria(typeOutilPedagogiqueVo));
        }

            @ApiOperation("Finds a typeOutilPedagogique by id")
            @GetMapping("/id/{id}")
            public TypeOutilPedagogiqueVo findById(@PathVariable Long id){
            return typeOutilPedagogiqueConverter.toVo(typeOutilPedagogiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  typeOutilPedagogique")
            @PostMapping("/")
            public TypeOutilPedagogiqueVo save(@RequestBody TypeOutilPedagogiqueVo typeOutilPedagogiqueVo){
            TypeOutilPedagogique typeOutilPedagogique = typeOutilPedagogiqueConverter.toItem(typeOutilPedagogiqueVo);
            typeOutilPedagogique = typeOutilPedagogiqueService.save(typeOutilPedagogique);
            return typeOutilPedagogiqueConverter.toVo(typeOutilPedagogique);
            }

            @ApiOperation("Delete the specified typeOutilPedagogique")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeOutilPedagogiqueVo typeOutilPedagogiqueVo){
            TypeOutilPedagogique typeOutilPedagogique = typeOutilPedagogiqueConverter.toItem(typeOutilPedagogiqueVo);
            return typeOutilPedagogiqueService.delete(typeOutilPedagogique);
            }

            @ApiOperation("Deletes a typeOutilPedagogique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeOutilPedagogiqueService.deleteById(id);
            }
        @ApiOperation("find by typeOutil code")
        @GetMapping("/typeOutil/code/{code}")
        public List<TypeOutilPedagogique> findByTypeOutilCode(@PathVariable String code){
        return typeOutilPedagogiqueService.findByTypeOutilCode(code);
        }

        @ApiOperation("delete by typeOutil code")
        @DeleteMapping("/typeOutil/code/{code}")
        public int deleteByTypeOutilCode(@PathVariable String code){
        return typeOutilPedagogiqueService.deleteByTypeOutilCode(code);
        }

        @ApiOperation("find by typeOutil id")
        @GetMapping("/typeOutil/id/{id}")
        public List<TypeOutilPedagogique> findByTypeOutilId(@PathVariable Long id){
        return typeOutilPedagogiqueService.findByTypeOutilId(id);
        }

        @ApiOperation("delete by typeOutil id")
        @DeleteMapping("/typeOutil/id/{id}")
        public int deleteByTypeOutilId(@PathVariable Long id){
        return typeOutilPedagogiqueService.deleteByTypeOutilId(id);
        }

        @ApiOperation("find by outilPedagogique id")
        @GetMapping("/outilPedagogique/id/{id}")
        public List<TypeOutilPedagogique> findByOutilPedagogiqueId(@PathVariable Long id){
        return typeOutilPedagogiqueService.findByOutilPedagogiqueId(id);
        }

        @ApiOperation("delete by outilPedagogique id")
        @DeleteMapping("/outilPedagogique/id/{id}")
        public int deleteByOutilPedagogiqueId(@PathVariable Long id){
        return typeOutilPedagogiqueService.deleteByOutilPedagogiqueId(id);
        }



            }
