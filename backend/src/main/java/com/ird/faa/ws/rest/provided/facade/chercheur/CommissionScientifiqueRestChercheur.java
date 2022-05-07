package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.CommissionScientifiqueChercheurService;

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
import com.ird.faa.bean.CommissionScientifique;
import com.ird.faa.ws.rest.provided.converter.CommissionScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.CommissionScientifiqueVo;

@Api("Manages commissionScientifique services")
@RestController
@RequestMapping("api/chercheur/commissionScientifique")
public class CommissionScientifiqueRestChercheur {

@Autowired
private CommissionScientifiqueChercheurService commissionScientifiqueService;

@Autowired
private CommissionScientifiqueConverter commissionScientifiqueConverter;


            @ApiOperation("Updates the specified  commissionScientifique")
            @PutMapping("/")
            public  CommissionScientifiqueVo update(@RequestBody  CommissionScientifiqueVo  commissionScientifiqueVo){
            CommissionScientifique commissionScientifique = commissionScientifiqueConverter.toItem(commissionScientifiqueVo);
            commissionScientifique = commissionScientifiqueService.update(commissionScientifique);
            return commissionScientifiqueConverter.toVo(commissionScientifique);
            }

    @ApiOperation("Finds a list of all commissionScientifiques")
    @GetMapping("/")
    public List<CommissionScientifiqueVo> findAll(){
        return commissionScientifiqueConverter.toVo(commissionScientifiqueService.findAll());
    }

    @ApiOperation("Finds a commissionScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CommissionScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return commissionScientifiqueConverter.toVo(commissionScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search commissionScientifique by a specific criteria")
    @PostMapping("/search")
    public List<CommissionScientifiqueVo> findByCriteria(@RequestBody CommissionScientifiqueVo commissionScientifiqueVo){
        return commissionScientifiqueConverter.toVo(commissionScientifiqueService.findByCriteria(commissionScientifiqueVo));
        }

            @ApiOperation("Finds a commissionScientifique by id")
            @GetMapping("/id/{id}")
            public CommissionScientifiqueVo findById(@PathVariable Long id){
            return commissionScientifiqueConverter.toVo(commissionScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  commissionScientifique")
            @PostMapping("/")
            public CommissionScientifiqueVo save(@RequestBody CommissionScientifiqueVo commissionScientifiqueVo){
            CommissionScientifique commissionScientifique = commissionScientifiqueConverter.toItem(commissionScientifiqueVo);
            commissionScientifique = commissionScientifiqueService.save(commissionScientifique);
            return commissionScientifiqueConverter.toVo(commissionScientifique);
            }

            @ApiOperation("Delete the specified commissionScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody CommissionScientifiqueVo commissionScientifiqueVo){
            CommissionScientifique commissionScientifique = commissionScientifiqueConverter.toItem(commissionScientifiqueVo);
            return commissionScientifiqueService.delete(commissionScientifique);
            }

            @ApiOperation("Deletes a commissionScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return commissionScientifiqueService.deleteById(id);
            }


            }
