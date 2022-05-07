package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypeInstrumentIrdConsultanceScientifiquePonctuelleAdminService;

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
import com.ird.faa.bean.TypeInstrumentIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.converter.TypeInstrumentIrdConsultanceScientifiquePonctuelleConverter;
import com.ird.faa.ws.rest.provided.vo.TypeInstrumentIrdConsultanceScientifiquePonctuelleVo;

@Api("Manages typeInstrumentIrdConsultanceScientifiquePonctuelle services")
@RestController
@RequestMapping("api/admin/typeInstrumentIrdConsultanceScientifiquePonctuelle")
public class TypeInstrumentIrdConsultanceScientifiquePonctuelleRestAdmin {

@Autowired
private TypeInstrumentIrdConsultanceScientifiquePonctuelleAdminService typeInstrumentIrdConsultanceScientifiquePonctuelleService;

@Autowired
private TypeInstrumentIrdConsultanceScientifiquePonctuelleConverter typeInstrumentIrdConsultanceScientifiquePonctuelleConverter;


            @ApiOperation("Updates the specified  typeInstrumentIrdConsultanceScientifiquePonctuelle")
            @PutMapping("/")
            public  TypeInstrumentIrdConsultanceScientifiquePonctuelleVo update(@RequestBody  TypeInstrumentIrdConsultanceScientifiquePonctuelleVo  typeInstrumentIrdConsultanceScientifiquePonctuelleVo){
            TypeInstrumentIrdConsultanceScientifiquePonctuelle typeInstrumentIrdConsultanceScientifiquePonctuelle = typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.toItem(typeInstrumentIrdConsultanceScientifiquePonctuelleVo);
            typeInstrumentIrdConsultanceScientifiquePonctuelle = typeInstrumentIrdConsultanceScientifiquePonctuelleService.update(typeInstrumentIrdConsultanceScientifiquePonctuelle);
            return typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(typeInstrumentIrdConsultanceScientifiquePonctuelle);
            }

    @ApiOperation("Finds a list of all typeInstrumentIrdConsultanceScientifiquePonctuelles")
    @GetMapping("/")
    public List<TypeInstrumentIrdConsultanceScientifiquePonctuelleVo> findAll(){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(typeInstrumentIrdConsultanceScientifiquePonctuelleService.findAll());
    }

    @ApiOperation("Finds a typeInstrumentIrdConsultanceScientifiquePonctuelle with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeInstrumentIrdConsultanceScientifiquePonctuelleVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(typeInstrumentIrdConsultanceScientifiquePonctuelleService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeInstrumentIrdConsultanceScientifiquePonctuelle by a specific criteria")
    @PostMapping("/search")
    public List<TypeInstrumentIrdConsultanceScientifiquePonctuelleVo> findByCriteria(@RequestBody TypeInstrumentIrdConsultanceScientifiquePonctuelleVo typeInstrumentIrdConsultanceScientifiquePonctuelleVo){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(typeInstrumentIrdConsultanceScientifiquePonctuelleService.findByCriteria(typeInstrumentIrdConsultanceScientifiquePonctuelleVo));
        }

            @ApiOperation("Finds a typeInstrumentIrdConsultanceScientifiquePonctuelle by id")
            @GetMapping("/id/{id}")
            public TypeInstrumentIrdConsultanceScientifiquePonctuelleVo findById(@PathVariable Long id){
            return typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(typeInstrumentIrdConsultanceScientifiquePonctuelleService.findById(id));
            }

            @ApiOperation("Saves the specified  typeInstrumentIrdConsultanceScientifiquePonctuelle")
            @PostMapping("/")
            public TypeInstrumentIrdConsultanceScientifiquePonctuelleVo save(@RequestBody TypeInstrumentIrdConsultanceScientifiquePonctuelleVo typeInstrumentIrdConsultanceScientifiquePonctuelleVo){
            TypeInstrumentIrdConsultanceScientifiquePonctuelle typeInstrumentIrdConsultanceScientifiquePonctuelle = typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.toItem(typeInstrumentIrdConsultanceScientifiquePonctuelleVo);
            typeInstrumentIrdConsultanceScientifiquePonctuelle = typeInstrumentIrdConsultanceScientifiquePonctuelleService.save(typeInstrumentIrdConsultanceScientifiquePonctuelle);
            return typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(typeInstrumentIrdConsultanceScientifiquePonctuelle);
            }

            @ApiOperation("Delete the specified typeInstrumentIrdConsultanceScientifiquePonctuelle")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeInstrumentIrdConsultanceScientifiquePonctuelleVo typeInstrumentIrdConsultanceScientifiquePonctuelleVo){
            TypeInstrumentIrdConsultanceScientifiquePonctuelle typeInstrumentIrdConsultanceScientifiquePonctuelle = typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.toItem(typeInstrumentIrdConsultanceScientifiquePonctuelleVo);
            return typeInstrumentIrdConsultanceScientifiquePonctuelleService.delete(typeInstrumentIrdConsultanceScientifiquePonctuelle);
            }

            @ApiOperation("Deletes a typeInstrumentIrdConsultanceScientifiquePonctuelle by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeInstrumentIrdConsultanceScientifiquePonctuelleService.deleteById(id);
            }
        @ApiOperation("find by typeInstrumentIrd code")
        @GetMapping("/typeInstrumentIrd/code/{code}")
        public List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findByTypeInstrumentIrdCode(@PathVariable String code){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleService.findByTypeInstrumentIrdCode(code);
        }

        @ApiOperation("delete by typeInstrumentIrd code")
        @DeleteMapping("/typeInstrumentIrd/code/{code}")
        public int deleteByTypeInstrumentIrdCode(@PathVariable String code){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleService.deleteByTypeInstrumentIrdCode(code);
        }

        @ApiOperation("find by typeInstrumentIrd id")
        @GetMapping("/typeInstrumentIrd/id/{id}")
        public List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findByTypeInstrumentIrdId(@PathVariable Long id){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleService.findByTypeInstrumentIrdId(id);
        }

        @ApiOperation("delete by typeInstrumentIrd id")
        @DeleteMapping("/typeInstrumentIrd/id/{id}")
        public int deleteByTypeInstrumentIrdId(@PathVariable Long id){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleService.deleteByTypeInstrumentIrdId(id);
        }

        @ApiOperation("find by consultanceScientifiquePonctuelle id")
        @GetMapping("/consultanceScientifiquePonctuelle/id/{id}")
        public List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(@PathVariable Long id){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(id);
        }

        @ApiOperation("delete by consultanceScientifiquePonctuelle id")
        @DeleteMapping("/consultanceScientifiquePonctuelle/id/{id}")
        public int deleteByConsultanceScientifiquePonctuelleId(@PathVariable Long id){
        return typeInstrumentIrdConsultanceScientifiquePonctuelleService.deleteByConsultanceScientifiquePonctuelleId(id);
        }



            }
