package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.DistinctionEtablissementPaysChercheurService;

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
import com.ird.faa.bean.DistinctionEtablissementPays;
import com.ird.faa.ws.rest.provided.converter.DistinctionEtablissementPaysConverter;
import com.ird.faa.ws.rest.provided.vo.DistinctionEtablissementPaysVo;

@Api("Manages distinctionEtablissementPays services")
@RestController
@RequestMapping("api/chercheur/distinctionEtablissementPays")
public class DistinctionEtablissementPaysRestChercheur {

@Autowired
private DistinctionEtablissementPaysChercheurService distinctionEtablissementPaysService;

@Autowired
private DistinctionEtablissementPaysConverter distinctionEtablissementPaysConverter;


            @ApiOperation("Updates the specified  distinctionEtablissementPays")
            @PutMapping("/")
            public  DistinctionEtablissementPaysVo update(@RequestBody  DistinctionEtablissementPaysVo  distinctionEtablissementPaysVo){
            DistinctionEtablissementPays distinctionEtablissementPays = distinctionEtablissementPaysConverter.toItem(distinctionEtablissementPaysVo);
            distinctionEtablissementPays = distinctionEtablissementPaysService.update(distinctionEtablissementPays);
            return distinctionEtablissementPaysConverter.toVo(distinctionEtablissementPays);
            }

    @ApiOperation("Finds a list of all distinctionEtablissementPayss")
    @GetMapping("/")
    public List<DistinctionEtablissementPaysVo> findAll(){
        return distinctionEtablissementPaysConverter.toVo(distinctionEtablissementPaysService.findAll());
    }

    @ApiOperation("Finds a distinctionEtablissementPays with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public DistinctionEtablissementPaysVo findByIdWithAssociatedList(@PathVariable Long id){
    return distinctionEtablissementPaysConverter.toVo(distinctionEtablissementPaysService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search distinctionEtablissementPays by a specific criteria")
    @PostMapping("/search")
    public List<DistinctionEtablissementPaysVo> findByCriteria(@RequestBody DistinctionEtablissementPaysVo distinctionEtablissementPaysVo){
        return distinctionEtablissementPaysConverter.toVo(distinctionEtablissementPaysService.findByCriteria(distinctionEtablissementPaysVo));
        }

            @ApiOperation("Finds a distinctionEtablissementPays by id")
            @GetMapping("/id/{id}")
            public DistinctionEtablissementPaysVo findById(@PathVariable Long id){
            return distinctionEtablissementPaysConverter.toVo(distinctionEtablissementPaysService.findById(id));
            }

            @ApiOperation("Saves the specified  distinctionEtablissementPays")
            @PostMapping("/")
            public DistinctionEtablissementPaysVo save(@RequestBody DistinctionEtablissementPaysVo distinctionEtablissementPaysVo){
            DistinctionEtablissementPays distinctionEtablissementPays = distinctionEtablissementPaysConverter.toItem(distinctionEtablissementPaysVo);
            distinctionEtablissementPays = distinctionEtablissementPaysService.save(distinctionEtablissementPays);
            return distinctionEtablissementPaysConverter.toVo(distinctionEtablissementPays);
            }

            @ApiOperation("Delete the specified distinctionEtablissementPays")
            @DeleteMapping("/")
            public int delete(@RequestBody DistinctionEtablissementPaysVo distinctionEtablissementPaysVo){
            DistinctionEtablissementPays distinctionEtablissementPays = distinctionEtablissementPaysConverter.toItem(distinctionEtablissementPaysVo);
            return distinctionEtablissementPaysService.delete(distinctionEtablissementPays);
            }

            @ApiOperation("Deletes a distinctionEtablissementPays by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return distinctionEtablissementPaysService.deleteById(id);
            }
        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<DistinctionEtablissementPays> findByPaysCode(@PathVariable String code){
        return distinctionEtablissementPaysService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return distinctionEtablissementPaysService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<DistinctionEtablissementPays> findByPaysId(@PathVariable Long id){
        return distinctionEtablissementPaysService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return distinctionEtablissementPaysService.deleteByPaysId(id);
        }

        @ApiOperation("find by etablissement code")
        @GetMapping("/etablissement/code/{code}")
        public List<DistinctionEtablissementPays> findByEtablissementCode(@PathVariable String code){
        return distinctionEtablissementPaysService.findByEtablissementCode(code);
        }

        @ApiOperation("delete by etablissement code")
        @DeleteMapping("/etablissement/code/{code}")
        public int deleteByEtablissementCode(@PathVariable String code){
        return distinctionEtablissementPaysService.deleteByEtablissementCode(code);
        }

        @ApiOperation("find by etablissement id")
        @GetMapping("/etablissement/id/{id}")
        public List<DistinctionEtablissementPays> findByEtablissementId(@PathVariable Long id){
        return distinctionEtablissementPaysService.findByEtablissementId(id);
        }

        @ApiOperation("delete by etablissement id")
        @DeleteMapping("/etablissement/id/{id}")
        public int deleteByEtablissementId(@PathVariable Long id){
        return distinctionEtablissementPaysService.deleteByEtablissementId(id);
        }

        @ApiOperation("find by distinction id")
        @GetMapping("/distinction/id/{id}")
        public List<DistinctionEtablissementPays> findByDistinctionId(@PathVariable Long id){
        return distinctionEtablissementPaysService.findByDistinctionId(id);
        }

        @ApiOperation("delete by distinction id")
        @DeleteMapping("/distinction/id/{id}")
        public int deleteByDistinctionId(@PathVariable Long id){
        return distinctionEtablissementPaysService.deleteByDistinctionId(id);
        }



            }
