package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ChercheurEmailChercheurService;

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
import com.ird.faa.bean.ChercheurEmail;
import com.ird.faa.ws.rest.provided.converter.ChercheurEmailConverter;
import com.ird.faa.ws.rest.provided.vo.ChercheurEmailVo;

@Api("Manages chercheurEmail services")
@RestController
@RequestMapping("api/chercheur/chercheurEmail")
public class ChercheurEmailRestChercheur {

@Autowired
private ChercheurEmailChercheurService chercheurEmailService;

@Autowired
private ChercheurEmailConverter chercheurEmailConverter;


            @ApiOperation("Updates the specified  chercheurEmail")
            @PutMapping("/")
            public  ChercheurEmailVo update(@RequestBody  ChercheurEmailVo  chercheurEmailVo){
            ChercheurEmail chercheurEmail = chercheurEmailConverter.toItem(chercheurEmailVo);
            chercheurEmail = chercheurEmailService.update(chercheurEmail);
            return chercheurEmailConverter.toVo(chercheurEmail);
            }

    @ApiOperation("Finds a list of all chercheurEmails")
    @GetMapping("/")
    public List<ChercheurEmailVo> findAll(){
        return chercheurEmailConverter.toVo(chercheurEmailService.findAll());
    }

    @ApiOperation("Finds a chercheurEmail with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ChercheurEmailVo findByIdWithAssociatedList(@PathVariable Long id){
    return chercheurEmailConverter.toVo(chercheurEmailService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search chercheurEmail by a specific criteria")
    @PostMapping("/search")
    public List<ChercheurEmailVo> findByCriteria(@RequestBody ChercheurEmailVo chercheurEmailVo){
        return chercheurEmailConverter.toVo(chercheurEmailService.findByCriteria(chercheurEmailVo));
        }

            @ApiOperation("Finds a chercheurEmail by id")
            @GetMapping("/id/{id}")
            public ChercheurEmailVo findById(@PathVariable Long id){
            return chercheurEmailConverter.toVo(chercheurEmailService.findById(id));
            }

            @ApiOperation("Saves the specified  chercheurEmail")
            @PostMapping("/")
            public ChercheurEmailVo save(@RequestBody ChercheurEmailVo chercheurEmailVo){
            ChercheurEmail chercheurEmail = chercheurEmailConverter.toItem(chercheurEmailVo);
            chercheurEmail = chercheurEmailService.save(chercheurEmail);
            return chercheurEmailConverter.toVo(chercheurEmail);
            }

            @ApiOperation("Delete the specified chercheurEmail")
            @DeleteMapping("/")
            public int delete(@RequestBody ChercheurEmailVo chercheurEmailVo){
            ChercheurEmail chercheurEmail = chercheurEmailConverter.toItem(chercheurEmailVo);
            return chercheurEmailService.delete(chercheurEmail);
            }

            @ApiOperation("Deletes a chercheurEmail by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return chercheurEmailService.deleteById(id);
            }
        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<ChercheurEmail> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return chercheurEmailService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return chercheurEmailService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<ChercheurEmail> findByChercheurId(@PathVariable Long id){
        return chercheurEmailService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return chercheurEmailService.deleteByChercheurId(id);
        }



            }
