package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ResponsabilitePedagogiqueEtablissementChercheurService;

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
import com.ird.faa.bean.ResponsabilitePedagogiqueEtablissement;
import com.ird.faa.ws.rest.provided.converter.ResponsabilitePedagogiqueEtablissementConverter;
import com.ird.faa.ws.rest.provided.vo.ResponsabilitePedagogiqueEtablissementVo;

@Api("Manages responsabilitePedagogiqueEtablissement services")
@RestController
@RequestMapping("api/chercheur/responsabilitePedagogiqueEtablissement")
public class ResponsabilitePedagogiqueEtablissementRestChercheur {

@Autowired
private ResponsabilitePedagogiqueEtablissementChercheurService responsabilitePedagogiqueEtablissementService;

@Autowired
private ResponsabilitePedagogiqueEtablissementConverter responsabilitePedagogiqueEtablissementConverter;


            @ApiOperation("Updates the specified  responsabilitePedagogiqueEtablissement")
            @PutMapping("/")
            public  ResponsabilitePedagogiqueEtablissementVo update(@RequestBody  ResponsabilitePedagogiqueEtablissementVo  responsabilitePedagogiqueEtablissementVo){
            ResponsabilitePedagogiqueEtablissement responsabilitePedagogiqueEtablissement = responsabilitePedagogiqueEtablissementConverter.toItem(responsabilitePedagogiqueEtablissementVo);
            responsabilitePedagogiqueEtablissement = responsabilitePedagogiqueEtablissementService.update(responsabilitePedagogiqueEtablissement);
            return responsabilitePedagogiqueEtablissementConverter.toVo(responsabilitePedagogiqueEtablissement);
            }

    @ApiOperation("Finds a list of all responsabilitePedagogiqueEtablissements")
    @GetMapping("/")
    public List<ResponsabilitePedagogiqueEtablissementVo> findAll(){
        return responsabilitePedagogiqueEtablissementConverter.toVo(responsabilitePedagogiqueEtablissementService.findAll());
    }

    @ApiOperation("Finds a responsabilitePedagogiqueEtablissement with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ResponsabilitePedagogiqueEtablissementVo findByIdWithAssociatedList(@PathVariable Long id){
    return responsabilitePedagogiqueEtablissementConverter.toVo(responsabilitePedagogiqueEtablissementService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search responsabilitePedagogiqueEtablissement by a specific criteria")
    @PostMapping("/search")
    public List<ResponsabilitePedagogiqueEtablissementVo> findByCriteria(@RequestBody ResponsabilitePedagogiqueEtablissementVo responsabilitePedagogiqueEtablissementVo){
        return responsabilitePedagogiqueEtablissementConverter.toVo(responsabilitePedagogiqueEtablissementService.findByCriteria(responsabilitePedagogiqueEtablissementVo));
        }

            @ApiOperation("Finds a responsabilitePedagogiqueEtablissement by id")
            @GetMapping("/id/{id}")
            public ResponsabilitePedagogiqueEtablissementVo findById(@PathVariable Long id){
            return responsabilitePedagogiqueEtablissementConverter.toVo(responsabilitePedagogiqueEtablissementService.findById(id));
            }

            @ApiOperation("Saves the specified  responsabilitePedagogiqueEtablissement")
            @PostMapping("/")
            public ResponsabilitePedagogiqueEtablissementVo save(@RequestBody ResponsabilitePedagogiqueEtablissementVo responsabilitePedagogiqueEtablissementVo){
            ResponsabilitePedagogiqueEtablissement responsabilitePedagogiqueEtablissement = responsabilitePedagogiqueEtablissementConverter.toItem(responsabilitePedagogiqueEtablissementVo);
            responsabilitePedagogiqueEtablissement = responsabilitePedagogiqueEtablissementService.save(responsabilitePedagogiqueEtablissement);
            return responsabilitePedagogiqueEtablissementConverter.toVo(responsabilitePedagogiqueEtablissement);
            }

            @ApiOperation("Delete the specified responsabilitePedagogiqueEtablissement")
            @DeleteMapping("/")
            public int delete(@RequestBody ResponsabilitePedagogiqueEtablissementVo responsabilitePedagogiqueEtablissementVo){
            ResponsabilitePedagogiqueEtablissement responsabilitePedagogiqueEtablissement = responsabilitePedagogiqueEtablissementConverter.toItem(responsabilitePedagogiqueEtablissementVo);
            return responsabilitePedagogiqueEtablissementService.delete(responsabilitePedagogiqueEtablissement);
            }

            @ApiOperation("Deletes a responsabilitePedagogiqueEtablissement by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return responsabilitePedagogiqueEtablissementService.deleteById(id);
            }
        @ApiOperation("find by etablissement code")
        @GetMapping("/etablissement/code/{code}")
        public List<ResponsabilitePedagogiqueEtablissement> findByEtablissementCode(@PathVariable String code){
        return responsabilitePedagogiqueEtablissementService.findByEtablissementCode(code);
        }

        @ApiOperation("delete by etablissement code")
        @DeleteMapping("/etablissement/code/{code}")
        public int deleteByEtablissementCode(@PathVariable String code){
        return responsabilitePedagogiqueEtablissementService.deleteByEtablissementCode(code);
        }

        @ApiOperation("find by etablissement id")
        @GetMapping("/etablissement/id/{id}")
        public List<ResponsabilitePedagogiqueEtablissement> findByEtablissementId(@PathVariable Long id){
        return responsabilitePedagogiqueEtablissementService.findByEtablissementId(id);
        }

        @ApiOperation("delete by etablissement id")
        @DeleteMapping("/etablissement/id/{id}")
        public int deleteByEtablissementId(@PathVariable Long id){
        return responsabilitePedagogiqueEtablissementService.deleteByEtablissementId(id);
        }

        @ApiOperation("find by responsabilitePedagogique id")
        @GetMapping("/responsabilitePedagogique/id/{id}")
        public List<ResponsabilitePedagogiqueEtablissement> findByResponsabilitePedagogiqueId(@PathVariable Long id){
        return responsabilitePedagogiqueEtablissementService.findByResponsabilitePedagogiqueId(id);
        }

        @ApiOperation("delete by responsabilitePedagogique id")
        @DeleteMapping("/responsabilitePedagogique/id/{id}")
        public int deleteByResponsabilitePedagogiqueId(@PathVariable Long id){
        return responsabilitePedagogiqueEtablissementService.deleteByResponsabilitePedagogiqueId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<ResponsabilitePedagogiqueEtablissement> findByPaysCode(@PathVariable String code){
        return responsabilitePedagogiqueEtablissementService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return responsabilitePedagogiqueEtablissementService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<ResponsabilitePedagogiqueEtablissement> findByPaysId(@PathVariable Long id){
        return responsabilitePedagogiqueEtablissementService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return responsabilitePedagogiqueEtablissementService.deleteByPaysId(id);
        }



            }
