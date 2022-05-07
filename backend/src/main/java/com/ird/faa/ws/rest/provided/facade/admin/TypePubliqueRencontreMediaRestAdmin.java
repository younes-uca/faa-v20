package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypePubliqueRencontreMediaAdminService;

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
import com.ird.faa.bean.TypePubliqueRencontreMedia;
import com.ird.faa.ws.rest.provided.converter.TypePubliqueRencontreMediaConverter;
import com.ird.faa.ws.rest.provided.vo.TypePubliqueRencontreMediaVo;

@Api("Manages typePubliqueRencontreMedia services")
@RestController
@RequestMapping("api/admin/typePubliqueRencontreMedia")
public class TypePubliqueRencontreMediaRestAdmin {

@Autowired
private TypePubliqueRencontreMediaAdminService typePubliqueRencontreMediaService;

@Autowired
private TypePubliqueRencontreMediaConverter typePubliqueRencontreMediaConverter;


            @ApiOperation("Updates the specified  typePubliqueRencontreMedia")
            @PutMapping("/")
            public  TypePubliqueRencontreMediaVo update(@RequestBody  TypePubliqueRencontreMediaVo  typePubliqueRencontreMediaVo){
            TypePubliqueRencontreMedia typePubliqueRencontreMedia = typePubliqueRencontreMediaConverter.toItem(typePubliqueRencontreMediaVo);
            typePubliqueRencontreMedia = typePubliqueRencontreMediaService.update(typePubliqueRencontreMedia);
            return typePubliqueRencontreMediaConverter.toVo(typePubliqueRencontreMedia);
            }

    @ApiOperation("Finds a list of all typePubliqueRencontreMedias")
    @GetMapping("/")
    public List<TypePubliqueRencontreMediaVo> findAll(){
        return typePubliqueRencontreMediaConverter.toVo(typePubliqueRencontreMediaService.findAll());
    }

    @ApiOperation("Finds a typePubliqueRencontreMedia with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypePubliqueRencontreMediaVo findByIdWithAssociatedList(@PathVariable Long id){
    return typePubliqueRencontreMediaConverter.toVo(typePubliqueRencontreMediaService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typePubliqueRencontreMedia by a specific criteria")
    @PostMapping("/search")
    public List<TypePubliqueRencontreMediaVo> findByCriteria(@RequestBody TypePubliqueRencontreMediaVo typePubliqueRencontreMediaVo){
        return typePubliqueRencontreMediaConverter.toVo(typePubliqueRencontreMediaService.findByCriteria(typePubliqueRencontreMediaVo));
        }

            @ApiOperation("Finds a typePubliqueRencontreMedia by id")
            @GetMapping("/id/{id}")
            public TypePubliqueRencontreMediaVo findById(@PathVariable Long id){
            return typePubliqueRencontreMediaConverter.toVo(typePubliqueRencontreMediaService.findById(id));
            }

            @ApiOperation("Saves the specified  typePubliqueRencontreMedia")
            @PostMapping("/")
            public TypePubliqueRencontreMediaVo save(@RequestBody TypePubliqueRencontreMediaVo typePubliqueRencontreMediaVo){
            TypePubliqueRencontreMedia typePubliqueRencontreMedia = typePubliqueRencontreMediaConverter.toItem(typePubliqueRencontreMediaVo);
            typePubliqueRencontreMedia = typePubliqueRencontreMediaService.save(typePubliqueRencontreMedia);
            return typePubliqueRencontreMediaConverter.toVo(typePubliqueRencontreMedia);
            }

            @ApiOperation("Delete the specified typePubliqueRencontreMedia")
            @DeleteMapping("/")
            public int delete(@RequestBody TypePubliqueRencontreMediaVo typePubliqueRencontreMediaVo){
            TypePubliqueRencontreMedia typePubliqueRencontreMedia = typePubliqueRencontreMediaConverter.toItem(typePubliqueRencontreMediaVo);
            return typePubliqueRencontreMediaService.delete(typePubliqueRencontreMedia);
            }

            @ApiOperation("Deletes a typePubliqueRencontreMedia by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typePubliqueRencontreMediaService.deleteById(id);
            }
        @ApiOperation("find by typePublique code")
        @GetMapping("/typePublique/code/{code}")
        public List<TypePubliqueRencontreMedia> findByTypePubliqueCode(@PathVariable String code){
        return typePubliqueRencontreMediaService.findByTypePubliqueCode(code);
        }

        @ApiOperation("delete by typePublique code")
        @DeleteMapping("/typePublique/code/{code}")
        public int deleteByTypePubliqueCode(@PathVariable String code){
        return typePubliqueRencontreMediaService.deleteByTypePubliqueCode(code);
        }

        @ApiOperation("find by typePublique id")
        @GetMapping("/typePublique/id/{id}")
        public List<TypePubliqueRencontreMedia> findByTypePubliqueId(@PathVariable Long id){
        return typePubliqueRencontreMediaService.findByTypePubliqueId(id);
        }

        @ApiOperation("delete by typePublique id")
        @DeleteMapping("/typePublique/id/{id}")
        public int deleteByTypePubliqueId(@PathVariable Long id){
        return typePubliqueRencontreMediaService.deleteByTypePubliqueId(id);
        }

        @ApiOperation("find by rencontreMedia id")
        @GetMapping("/rencontreMedia/id/{id}")
        public List<TypePubliqueRencontreMedia> findByRencontreMediaId(@PathVariable Long id){
        return typePubliqueRencontreMediaService.findByRencontreMediaId(id);
        }

        @ApiOperation("delete by rencontreMedia id")
        @DeleteMapping("/rencontreMedia/id/{id}")
        public int deleteByRencontreMediaId(@PathVariable Long id){
        return typePubliqueRencontreMediaService.deleteByRencontreMediaId(id);
        }



            }
