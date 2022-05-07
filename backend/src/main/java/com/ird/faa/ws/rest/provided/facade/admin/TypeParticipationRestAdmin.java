package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypeParticipationAdminService;

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
import com.ird.faa.bean.TypeParticipation;
import com.ird.faa.ws.rest.provided.converter.TypeParticipationConverter;
import com.ird.faa.ws.rest.provided.vo.TypeParticipationVo;

@Api("Manages typeParticipation services")
@RestController
@RequestMapping("api/admin/typeParticipation")
public class TypeParticipationRestAdmin {

@Autowired
private TypeParticipationAdminService typeParticipationService;

@Autowired
private TypeParticipationConverter typeParticipationConverter;


            @ApiOperation("Updates the specified  typeParticipation")
            @PutMapping("/")
            public  TypeParticipationVo update(@RequestBody  TypeParticipationVo  typeParticipationVo){
            TypeParticipation typeParticipation = typeParticipationConverter.toItem(typeParticipationVo);
            typeParticipation = typeParticipationService.update(typeParticipation);
            return typeParticipationConverter.toVo(typeParticipation);
            }

    @ApiOperation("Finds a list of all typeParticipations")
    @GetMapping("/")
    public List<TypeParticipationVo> findAll(){
        return typeParticipationConverter.toVo(typeParticipationService.findAll());
    }

    @ApiOperation("Finds a typeParticipation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeParticipationVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeParticipationConverter.toVo(typeParticipationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeParticipation by a specific criteria")
    @PostMapping("/search")
    public List<TypeParticipationVo> findByCriteria(@RequestBody TypeParticipationVo typeParticipationVo){
        return typeParticipationConverter.toVo(typeParticipationService.findByCriteria(typeParticipationVo));
        }

            @ApiOperation("Finds a typeParticipation by id")
            @GetMapping("/id/{id}")
            public TypeParticipationVo findById(@PathVariable Long id){
            return typeParticipationConverter.toVo(typeParticipationService.findById(id));
            }

            @ApiOperation("Saves the specified  typeParticipation")
            @PostMapping("/")
            public TypeParticipationVo save(@RequestBody TypeParticipationVo typeParticipationVo){
            TypeParticipation typeParticipation = typeParticipationConverter.toItem(typeParticipationVo);
            typeParticipation = typeParticipationService.save(typeParticipation);
            return typeParticipationConverter.toVo(typeParticipation);
            }

            @ApiOperation("Delete the specified typeParticipation")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeParticipationVo typeParticipationVo){
            TypeParticipation typeParticipation = typeParticipationConverter.toItem(typeParticipationVo);
            return typeParticipationService.delete(typeParticipation);
            }

            @ApiOperation("Deletes a typeParticipation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeParticipationService.deleteById(id);
            }


            }
