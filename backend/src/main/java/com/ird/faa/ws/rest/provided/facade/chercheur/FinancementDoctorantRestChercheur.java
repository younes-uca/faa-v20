package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.FinancementDoctorantChercheurService;

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
import com.ird.faa.bean.FinancementDoctorant;
import com.ird.faa.ws.rest.provided.converter.FinancementDoctorantConverter;
import com.ird.faa.ws.rest.provided.vo.FinancementDoctorantVo;

@Api("Manages financementDoctorant services")
@RestController
@RequestMapping("api/chercheur/financementDoctorant")
public class FinancementDoctorantRestChercheur {

@Autowired
private FinancementDoctorantChercheurService financementDoctorantService;

@Autowired
private FinancementDoctorantConverter financementDoctorantConverter;


            @ApiOperation("Updates the specified  financementDoctorant")
            @PutMapping("/")
            public  FinancementDoctorantVo update(@RequestBody  FinancementDoctorantVo  financementDoctorantVo){
            FinancementDoctorant financementDoctorant = financementDoctorantConverter.toItem(financementDoctorantVo);
            financementDoctorant = financementDoctorantService.update(financementDoctorant);
            return financementDoctorantConverter.toVo(financementDoctorant);
            }

    @ApiOperation("Finds a list of all financementDoctorants")
    @GetMapping("/")
    public List<FinancementDoctorantVo> findAll(){
        return financementDoctorantConverter.toVo(financementDoctorantService.findAll());
    }

    @ApiOperation("Finds a financementDoctorant with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public FinancementDoctorantVo findByIdWithAssociatedList(@PathVariable Long id){
    return financementDoctorantConverter.toVo(financementDoctorantService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search financementDoctorant by a specific criteria")
    @PostMapping("/search")
    public List<FinancementDoctorantVo> findByCriteria(@RequestBody FinancementDoctorantVo financementDoctorantVo){
        return financementDoctorantConverter.toVo(financementDoctorantService.findByCriteria(financementDoctorantVo));
        }

            @ApiOperation("Finds a financementDoctorant by id")
            @GetMapping("/id/{id}")
            public FinancementDoctorantVo findById(@PathVariable Long id){
            return financementDoctorantConverter.toVo(financementDoctorantService.findById(id));
            }

            @ApiOperation("Saves the specified  financementDoctorant")
            @PostMapping("/")
            public FinancementDoctorantVo save(@RequestBody FinancementDoctorantVo financementDoctorantVo){
            FinancementDoctorant financementDoctorant = financementDoctorantConverter.toItem(financementDoctorantVo);
            financementDoctorant = financementDoctorantService.save(financementDoctorant);
            return financementDoctorantConverter.toVo(financementDoctorant);
            }

            @ApiOperation("Delete the specified financementDoctorant")
            @DeleteMapping("/")
            public int delete(@RequestBody FinancementDoctorantVo financementDoctorantVo){
            FinancementDoctorant financementDoctorant = financementDoctorantConverter.toItem(financementDoctorantVo);
            return financementDoctorantService.delete(financementDoctorant);
            }

            @ApiOperation("Deletes a financementDoctorant by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return financementDoctorantService.deleteById(id);
            }


            }
