package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.FormationContinueObjetFormationGeneriqueAdminService;

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
import com.ird.faa.bean.FormationContinueObjetFormationGenerique;
import com.ird.faa.ws.rest.provided.converter.FormationContinueObjetFormationGeneriqueConverter;
import com.ird.faa.ws.rest.provided.vo.FormationContinueObjetFormationGeneriqueVo;

@Api("Manages formationContinueObjetFormationGenerique services")
@RestController
@RequestMapping("api/admin/formationContinueObjetFormationGenerique")
public class FormationContinueObjetFormationGeneriqueRestAdmin {

@Autowired
private FormationContinueObjetFormationGeneriqueAdminService formationContinueObjetFormationGeneriqueService;

@Autowired
private FormationContinueObjetFormationGeneriqueConverter formationContinueObjetFormationGeneriqueConverter;


            @ApiOperation("Updates the specified  formationContinueObjetFormationGenerique")
            @PutMapping("/")
            public  FormationContinueObjetFormationGeneriqueVo update(@RequestBody  FormationContinueObjetFormationGeneriqueVo  formationContinueObjetFormationGeneriqueVo){
            FormationContinueObjetFormationGenerique formationContinueObjetFormationGenerique = formationContinueObjetFormationGeneriqueConverter.toItem(formationContinueObjetFormationGeneriqueVo);
            formationContinueObjetFormationGenerique = formationContinueObjetFormationGeneriqueService.update(formationContinueObjetFormationGenerique);
            return formationContinueObjetFormationGeneriqueConverter.toVo(formationContinueObjetFormationGenerique);
            }

    @ApiOperation("Finds a list of all formationContinueObjetFormationGeneriques")
    @GetMapping("/")
    public List<FormationContinueObjetFormationGeneriqueVo> findAll(){
        return formationContinueObjetFormationGeneriqueConverter.toVo(formationContinueObjetFormationGeneriqueService.findAll());
    }

    @ApiOperation("Finds a formationContinueObjetFormationGenerique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public FormationContinueObjetFormationGeneriqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return formationContinueObjetFormationGeneriqueConverter.toVo(formationContinueObjetFormationGeneriqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search formationContinueObjetFormationGenerique by a specific criteria")
    @PostMapping("/search")
    public List<FormationContinueObjetFormationGeneriqueVo> findByCriteria(@RequestBody FormationContinueObjetFormationGeneriqueVo formationContinueObjetFormationGeneriqueVo){
        return formationContinueObjetFormationGeneriqueConverter.toVo(formationContinueObjetFormationGeneriqueService.findByCriteria(formationContinueObjetFormationGeneriqueVo));
        }

            @ApiOperation("Finds a formationContinueObjetFormationGenerique by id")
            @GetMapping("/id/{id}")
            public FormationContinueObjetFormationGeneriqueVo findById(@PathVariable Long id){
            return formationContinueObjetFormationGeneriqueConverter.toVo(formationContinueObjetFormationGeneriqueService.findById(id));
            }

            @ApiOperation("Saves the specified  formationContinueObjetFormationGenerique")
            @PostMapping("/")
            public FormationContinueObjetFormationGeneriqueVo save(@RequestBody FormationContinueObjetFormationGeneriqueVo formationContinueObjetFormationGeneriqueVo){
            FormationContinueObjetFormationGenerique formationContinueObjetFormationGenerique = formationContinueObjetFormationGeneriqueConverter.toItem(formationContinueObjetFormationGeneriqueVo);
            formationContinueObjetFormationGenerique = formationContinueObjetFormationGeneriqueService.save(formationContinueObjetFormationGenerique);
            return formationContinueObjetFormationGeneriqueConverter.toVo(formationContinueObjetFormationGenerique);
            }

            @ApiOperation("Delete the specified formationContinueObjetFormationGenerique")
            @DeleteMapping("/")
            public int delete(@RequestBody FormationContinueObjetFormationGeneriqueVo formationContinueObjetFormationGeneriqueVo){
            FormationContinueObjetFormationGenerique formationContinueObjetFormationGenerique = formationContinueObjetFormationGeneriqueConverter.toItem(formationContinueObjetFormationGeneriqueVo);
            return formationContinueObjetFormationGeneriqueService.delete(formationContinueObjetFormationGenerique);
            }

            @ApiOperation("Deletes a formationContinueObjetFormationGenerique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return formationContinueObjetFormationGeneriqueService.deleteById(id);
            }
        @ApiOperation("find by objetFormationGenerique code")
        @GetMapping("/objetFormationGenerique/code/{code}")
        public List<FormationContinueObjetFormationGenerique> findByObjetFormationGeneriqueCode(@PathVariable String code){
        return formationContinueObjetFormationGeneriqueService.findByObjetFormationGeneriqueCode(code);
        }

        @ApiOperation("delete by objetFormationGenerique code")
        @DeleteMapping("/objetFormationGenerique/code/{code}")
        public int deleteByObjetFormationGeneriqueCode(@PathVariable String code){
        return formationContinueObjetFormationGeneriqueService.deleteByObjetFormationGeneriqueCode(code);
        }

        @ApiOperation("find by objetFormationGenerique id")
        @GetMapping("/objetFormationGenerique/id/{id}")
        public List<FormationContinueObjetFormationGenerique> findByObjetFormationGeneriqueId(@PathVariable Long id){
        return formationContinueObjetFormationGeneriqueService.findByObjetFormationGeneriqueId(id);
        }

        @ApiOperation("delete by objetFormationGenerique id")
        @DeleteMapping("/objetFormationGenerique/id/{id}")
        public int deleteByObjetFormationGeneriqueId(@PathVariable Long id){
        return formationContinueObjetFormationGeneriqueService.deleteByObjetFormationGeneriqueId(id);
        }

        @ApiOperation("find by formationContinue id")
        @GetMapping("/formationContinue/id/{id}")
        public List<FormationContinueObjetFormationGenerique> findByFormationContinueId(@PathVariable Long id){
        return formationContinueObjetFormationGeneriqueService.findByFormationContinueId(id);
        }

        @ApiOperation("delete by formationContinue id")
        @DeleteMapping("/formationContinue/id/{id}")
        public int deleteByFormationContinueId(@PathVariable Long id){
        return formationContinueObjetFormationGeneriqueService.deleteByFormationContinueId(id);
        }



            }
