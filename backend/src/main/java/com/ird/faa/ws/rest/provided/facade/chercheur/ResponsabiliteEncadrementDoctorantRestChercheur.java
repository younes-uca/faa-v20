package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ResponsabiliteEncadrementDoctorantChercheurService;

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
import com.ird.faa.bean.ResponsabiliteEncadrementDoctorant;
import com.ird.faa.ws.rest.provided.converter.ResponsabiliteEncadrementDoctorantConverter;
import com.ird.faa.ws.rest.provided.vo.ResponsabiliteEncadrementDoctorantVo;

@Api("Manages responsabiliteEncadrementDoctorant services")
@RestController
@RequestMapping("api/chercheur/responsabiliteEncadrementDoctorant")
public class ResponsabiliteEncadrementDoctorantRestChercheur {

@Autowired
private ResponsabiliteEncadrementDoctorantChercheurService responsabiliteEncadrementDoctorantService;

@Autowired
private ResponsabiliteEncadrementDoctorantConverter responsabiliteEncadrementDoctorantConverter;


            @ApiOperation("Updates the specified  responsabiliteEncadrementDoctorant")
            @PutMapping("/")
            public  ResponsabiliteEncadrementDoctorantVo update(@RequestBody  ResponsabiliteEncadrementDoctorantVo  responsabiliteEncadrementDoctorantVo){
            ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant = responsabiliteEncadrementDoctorantConverter.toItem(responsabiliteEncadrementDoctorantVo);
            responsabiliteEncadrementDoctorant = responsabiliteEncadrementDoctorantService.update(responsabiliteEncadrementDoctorant);
            return responsabiliteEncadrementDoctorantConverter.toVo(responsabiliteEncadrementDoctorant);
            }

    @ApiOperation("Finds a list of all responsabiliteEncadrementDoctorants")
    @GetMapping("/")
    public List<ResponsabiliteEncadrementDoctorantVo> findAll(){
        return responsabiliteEncadrementDoctorantConverter.toVo(responsabiliteEncadrementDoctorantService.findAll());
    }

    @ApiOperation("Finds a responsabiliteEncadrementDoctorant with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ResponsabiliteEncadrementDoctorantVo findByIdWithAssociatedList(@PathVariable Long id){
    return responsabiliteEncadrementDoctorantConverter.toVo(responsabiliteEncadrementDoctorantService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search responsabiliteEncadrementDoctorant by a specific criteria")
    @PostMapping("/search")
    public List<ResponsabiliteEncadrementDoctorantVo> findByCriteria(@RequestBody ResponsabiliteEncadrementDoctorantVo responsabiliteEncadrementDoctorantVo){
        return responsabiliteEncadrementDoctorantConverter.toVo(responsabiliteEncadrementDoctorantService.findByCriteria(responsabiliteEncadrementDoctorantVo));
        }

            @ApiOperation("Finds a responsabiliteEncadrementDoctorant by id")
            @GetMapping("/id/{id}")
            public ResponsabiliteEncadrementDoctorantVo findById(@PathVariable Long id){
            return responsabiliteEncadrementDoctorantConverter.toVo(responsabiliteEncadrementDoctorantService.findById(id));
            }

            @ApiOperation("Saves the specified  responsabiliteEncadrementDoctorant")
            @PostMapping("/")
            public ResponsabiliteEncadrementDoctorantVo save(@RequestBody ResponsabiliteEncadrementDoctorantVo responsabiliteEncadrementDoctorantVo){
            ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant = responsabiliteEncadrementDoctorantConverter.toItem(responsabiliteEncadrementDoctorantVo);
            responsabiliteEncadrementDoctorant = responsabiliteEncadrementDoctorantService.save(responsabiliteEncadrementDoctorant);
            return responsabiliteEncadrementDoctorantConverter.toVo(responsabiliteEncadrementDoctorant);
            }

            @ApiOperation("Delete the specified responsabiliteEncadrementDoctorant")
            @DeleteMapping("/")
            public int delete(@RequestBody ResponsabiliteEncadrementDoctorantVo responsabiliteEncadrementDoctorantVo){
            ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant = responsabiliteEncadrementDoctorantConverter.toItem(responsabiliteEncadrementDoctorantVo);
            return responsabiliteEncadrementDoctorantService.delete(responsabiliteEncadrementDoctorant);
            }

            @ApiOperation("Deletes a responsabiliteEncadrementDoctorant by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return responsabiliteEncadrementDoctorantService.deleteById(id);
            }


            }
