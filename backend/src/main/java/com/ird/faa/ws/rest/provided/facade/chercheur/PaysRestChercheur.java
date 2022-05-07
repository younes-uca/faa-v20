package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.PaysChercheurService;

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
import com.ird.faa.bean.Pays;
import com.ird.faa.ws.rest.provided.converter.PaysConverter;
import com.ird.faa.ws.rest.provided.vo.PaysVo;

@Api("Manages pays services")
@RestController
@RequestMapping("api/chercheur/pays")
public class PaysRestChercheur {

@Autowired
private PaysChercheurService paysService;

@Autowired
private PaysConverter paysConverter;


            @ApiOperation("Updates the specified  pays")
            @PutMapping("/")
            public  PaysVo update(@RequestBody  PaysVo  paysVo){
            Pays pays = paysConverter.toItem(paysVo);
            pays = paysService.update(pays);
            return paysConverter.toVo(pays);
            }

    @ApiOperation("Finds a list of all payss")
    @GetMapping("/")
    public List<PaysVo> findAll(){
        return paysConverter.toVo(paysService.findAll());
    }

    @ApiOperation("Finds a pays with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public PaysVo findByIdWithAssociatedList(@PathVariable Long id){
    return paysConverter.toVo(paysService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search pays by a specific criteria")
    @PostMapping("/search")
    public List<PaysVo> findByCriteria(@RequestBody PaysVo paysVo){
        return paysConverter.toVo(paysService.findByCriteria(paysVo));
        }

            @ApiOperation("Finds a pays by id")
            @GetMapping("/id/{id}")
            public PaysVo findById(@PathVariable Long id){
            return paysConverter.toVo(paysService.findById(id));
            }

            @ApiOperation("Saves the specified  pays")
            @PostMapping("/")
            public PaysVo save(@RequestBody PaysVo paysVo){
            Pays pays = paysConverter.toItem(paysVo);
            pays = paysService.save(pays);
            return paysConverter.toVo(pays);
            }

            @ApiOperation("Delete the specified pays")
            @DeleteMapping("/")
            public int delete(@RequestBody PaysVo paysVo){
            Pays pays = paysConverter.toItem(paysVo);
            return paysService.delete(pays);
            }

            @ApiOperation("Deletes a pays by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return paysService.deleteById(id);
            }


            }
