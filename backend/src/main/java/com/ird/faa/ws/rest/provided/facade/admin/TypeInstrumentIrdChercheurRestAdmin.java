package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.TypeInstrumentIrdChercheurAdminService;

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
import com.ird.faa.bean.TypeInstrumentIrdChercheur;
import com.ird.faa.ws.rest.provided.converter.TypeInstrumentIrdChercheurConverter;
import com.ird.faa.ws.rest.provided.vo.TypeInstrumentIrdChercheurVo;

@Api("Manages typeInstrumentIrdChercheur services")
@RestController
@RequestMapping("api/admin/typeInstrumentIrdChercheur")
public class TypeInstrumentIrdChercheurRestAdmin {

@Autowired
private TypeInstrumentIrdChercheurAdminService typeInstrumentIrdChercheurService;

@Autowired
private TypeInstrumentIrdChercheurConverter typeInstrumentIrdChercheurConverter;


            @ApiOperation("Updates the specified  typeInstrumentIrdChercheur")
            @PutMapping("/")
            public  TypeInstrumentIrdChercheurVo update(@RequestBody  TypeInstrumentIrdChercheurVo  typeInstrumentIrdChercheurVo){
            TypeInstrumentIrdChercheur typeInstrumentIrdChercheur = typeInstrumentIrdChercheurConverter.toItem(typeInstrumentIrdChercheurVo);
            typeInstrumentIrdChercheur = typeInstrumentIrdChercheurService.update(typeInstrumentIrdChercheur);
            return typeInstrumentIrdChercheurConverter.toVo(typeInstrumentIrdChercheur);
            }

    @ApiOperation("Finds a list of all typeInstrumentIrdChercheurs")
    @GetMapping("/")
    public List<TypeInstrumentIrdChercheurVo> findAll(){
        return typeInstrumentIrdChercheurConverter.toVo(typeInstrumentIrdChercheurService.findAll());
    }

    @ApiOperation("Finds a typeInstrumentIrdChercheur with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TypeInstrumentIrdChercheurVo findByIdWithAssociatedList(@PathVariable Long id){
    return typeInstrumentIrdChercheurConverter.toVo(typeInstrumentIrdChercheurService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search typeInstrumentIrdChercheur by a specific criteria")
    @PostMapping("/search")
    public List<TypeInstrumentIrdChercheurVo> findByCriteria(@RequestBody TypeInstrumentIrdChercheurVo typeInstrumentIrdChercheurVo){
        return typeInstrumentIrdChercheurConverter.toVo(typeInstrumentIrdChercheurService.findByCriteria(typeInstrumentIrdChercheurVo));
        }

            @ApiOperation("Finds a typeInstrumentIrdChercheur by id")
            @GetMapping("/id/{id}")
            public TypeInstrumentIrdChercheurVo findById(@PathVariable Long id){
            return typeInstrumentIrdChercheurConverter.toVo(typeInstrumentIrdChercheurService.findById(id));
            }

            @ApiOperation("Saves the specified  typeInstrumentIrdChercheur")
            @PostMapping("/")
            public TypeInstrumentIrdChercheurVo save(@RequestBody TypeInstrumentIrdChercheurVo typeInstrumentIrdChercheurVo){
            TypeInstrumentIrdChercheur typeInstrumentIrdChercheur = typeInstrumentIrdChercheurConverter.toItem(typeInstrumentIrdChercheurVo);
            typeInstrumentIrdChercheur = typeInstrumentIrdChercheurService.save(typeInstrumentIrdChercheur);
            return typeInstrumentIrdChercheurConverter.toVo(typeInstrumentIrdChercheur);
            }

            @ApiOperation("Delete the specified typeInstrumentIrdChercheur")
            @DeleteMapping("/")
            public int delete(@RequestBody TypeInstrumentIrdChercheurVo typeInstrumentIrdChercheurVo){
            TypeInstrumentIrdChercheur typeInstrumentIrdChercheur = typeInstrumentIrdChercheurConverter.toItem(typeInstrumentIrdChercheurVo);
            return typeInstrumentIrdChercheurService.delete(typeInstrumentIrdChercheur);
            }

            @ApiOperation("Deletes a typeInstrumentIrdChercheur by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return typeInstrumentIrdChercheurService.deleteById(id);
            }
        @ApiOperation("find by typeInstrumentIrd code")
        @GetMapping("/typeInstrumentIrd/code/{code}")
        public List<TypeInstrumentIrdChercheur> findByTypeInstrumentIrdCode(@PathVariable String code){
        return typeInstrumentIrdChercheurService.findByTypeInstrumentIrdCode(code);
        }

        @ApiOperation("delete by typeInstrumentIrd code")
        @DeleteMapping("/typeInstrumentIrd/code/{code}")
        public int deleteByTypeInstrumentIrdCode(@PathVariable String code){
        return typeInstrumentIrdChercheurService.deleteByTypeInstrumentIrdCode(code);
        }

        @ApiOperation("find by typeInstrumentIrd id")
        @GetMapping("/typeInstrumentIrd/id/{id}")
        public List<TypeInstrumentIrdChercheur> findByTypeInstrumentIrdId(@PathVariable Long id){
        return typeInstrumentIrdChercheurService.findByTypeInstrumentIrdId(id);
        }

        @ApiOperation("delete by typeInstrumentIrd id")
        @DeleteMapping("/typeInstrumentIrd/id/{id}")
        public int deleteByTypeInstrumentIrdId(@PathVariable Long id){
        return typeInstrumentIrdChercheurService.deleteByTypeInstrumentIrdId(id);
        }

        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<TypeInstrumentIrdChercheur> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return typeInstrumentIrdChercheurService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return typeInstrumentIrdChercheurService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<TypeInstrumentIrdChercheur> findByChercheurId(@PathVariable Long id){
        return typeInstrumentIrdChercheurService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return typeInstrumentIrdChercheurService.deleteByChercheurId(id);
        }



            }
