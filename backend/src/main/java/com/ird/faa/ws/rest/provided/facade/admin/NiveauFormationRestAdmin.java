package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.NiveauFormationAdminService;

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
import com.ird.faa.bean.NiveauFormation;
import com.ird.faa.ws.rest.provided.converter.NiveauFormationConverter;
import com.ird.faa.ws.rest.provided.vo.NiveauFormationVo;

@Api("Manages niveauFormation services")
@RestController
@RequestMapping("api/admin/niveauFormation")
public class NiveauFormationRestAdmin {

@Autowired
private NiveauFormationAdminService niveauFormationService;

@Autowired
private NiveauFormationConverter niveauFormationConverter;


            @ApiOperation("Updates the specified  niveauFormation")
            @PutMapping("/")
            public  NiveauFormationVo update(@RequestBody  NiveauFormationVo  niveauFormationVo){
            NiveauFormation niveauFormation = niveauFormationConverter.toItem(niveauFormationVo);
            niveauFormation = niveauFormationService.update(niveauFormation);
            return niveauFormationConverter.toVo(niveauFormation);
            }

    @ApiOperation("Finds a list of all niveauFormations")
    @GetMapping("/")
    public List<NiveauFormationVo> findAll(){
        return niveauFormationConverter.toVo(niveauFormationService.findAll());
    }

    @ApiOperation("Finds a niveauFormation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public NiveauFormationVo findByIdWithAssociatedList(@PathVariable Long id){
    return niveauFormationConverter.toVo(niveauFormationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search niveauFormation by a specific criteria")
    @PostMapping("/search")
    public List<NiveauFormationVo> findByCriteria(@RequestBody NiveauFormationVo niveauFormationVo){
        return niveauFormationConverter.toVo(niveauFormationService.findByCriteria(niveauFormationVo));
        }

            @ApiOperation("Finds a niveauFormation by id")
            @GetMapping("/id/{id}")
            public NiveauFormationVo findById(@PathVariable Long id){
            return niveauFormationConverter.toVo(niveauFormationService.findById(id));
            }

            @ApiOperation("Saves the specified  niveauFormation")
            @PostMapping("/")
            public NiveauFormationVo save(@RequestBody NiveauFormationVo niveauFormationVo){
            NiveauFormation niveauFormation = niveauFormationConverter.toItem(niveauFormationVo);
            niveauFormation = niveauFormationService.save(niveauFormation);
            return niveauFormationConverter.toVo(niveauFormation);
            }

            @ApiOperation("Delete the specified niveauFormation")
            @DeleteMapping("/")
            public int delete(@RequestBody NiveauFormationVo niveauFormationVo){
            NiveauFormation niveauFormation = niveauFormationConverter.toItem(niveauFormationVo);
            return niveauFormationService.delete(niveauFormation);
            }

            @ApiOperation("Deletes a niveauFormation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return niveauFormationService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public NiveauFormationVo archiver(@RequestBody NiveauFormationVo niveauFormationVo){
                NiveauFormation niveauFormation = niveauFormationService.archiver(niveauFormationConverter.toItem(niveauFormationVo));
                return niveauFormationConverter.toVo(niveauFormation);
                }

            @PutMapping("/desarchiver/")
            public NiveauFormationVo desarchiver(@RequestBody NiveauFormationVo niveauFormationVo){
                NiveauFormation niveauFormation = niveauFormationService.desarchiver(niveauFormationConverter.toItem(niveauFormationVo));
                return niveauFormationConverter.toVo(niveauFormation);}
            }
