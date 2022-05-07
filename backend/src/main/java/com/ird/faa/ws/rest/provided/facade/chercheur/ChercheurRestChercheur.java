package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ChercheurChercheurService;

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
import com.ird.faa.bean.Chercheur;
import com.ird.faa.ws.rest.provided.converter.ChercheurConverter;
import com.ird.faa.ws.rest.provided.vo.ChercheurVo;

@Api("Manages chercheur services")
@RestController
@RequestMapping("api/chercheur/chercheur")
public class ChercheurRestChercheur {

@Autowired
private ChercheurChercheurService chercheurService;

@Autowired
private ChercheurConverter chercheurConverter;


            @ApiOperation("Updates the specified  chercheur")
            @PutMapping("/")
            public  ChercheurVo update(@RequestBody  ChercheurVo  chercheurVo){
            Chercheur chercheur = chercheurConverter.toItem(chercheurVo);
            chercheur = chercheurService.update(chercheur);
            return chercheurConverter.toVo(chercheur);
            }

    @ApiOperation("Finds a list of all chercheurs")
    @GetMapping("/")
    public List<ChercheurVo> findAll(){
        return chercheurConverter.toVo(chercheurService.findAll());
    }

    @ApiOperation("Finds a chercheur with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ChercheurVo findByIdWithAssociatedList(@PathVariable Long id){
    return chercheurConverter.toVo(chercheurService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search chercheur by a specific criteria")
    @PostMapping("/search")
    public List<ChercheurVo> findByCriteria(@RequestBody ChercheurVo chercheurVo){
        return chercheurConverter.toVo(chercheurService.findByCriteria(chercheurVo));
        }

            @ApiOperation("Finds a chercheur by id")
            @GetMapping("/id/{id}")
            public ChercheurVo findById(@PathVariable Long id){
            return chercheurConverter.toVo(chercheurService.findById(id));
            }

            @ApiOperation("Saves the specified  chercheur")
            @PostMapping("/")
            public ChercheurVo save(@RequestBody ChercheurVo chercheurVo){
            Chercheur chercheur = chercheurConverter.toItem(chercheurVo);
            chercheur = chercheurService.save(chercheur);
            return chercheurConverter.toVo(chercheur);
            }

            @ApiOperation("Delete the specified chercheur")
            @DeleteMapping("/")
            public int delete(@RequestBody ChercheurVo chercheurVo){
            Chercheur chercheur = chercheurConverter.toItem(chercheurVo);
            return chercheurService.delete(chercheur);
            }

            @ApiOperation("Deletes a chercheur by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return chercheurService.deleteById(id);
            }
        @ApiOperation("find by affectationStructurelle code")
        @GetMapping("/affectationStructurelle/code/{code}")
        public List<Chercheur> findByAffectationStructurelleCode(@PathVariable String code){
        return chercheurService.findByAffectationStructurelleCode(code);
        }

        @ApiOperation("delete by affectationStructurelle code")
        @DeleteMapping("/affectationStructurelle/code/{code}")
        public int deleteByAffectationStructurelleCode(@PathVariable String code){
        return chercheurService.deleteByAffectationStructurelleCode(code);
        }

        @ApiOperation("find by affectationStructurelle id")
        @GetMapping("/affectationStructurelle/id/{id}")
        public List<Chercheur> findByAffectationStructurelleId(@PathVariable Long id){
        return chercheurService.findByAffectationStructurelleId(id);
        }

        @ApiOperation("delete by affectationStructurelle id")
        @DeleteMapping("/affectationStructurelle/id/{id}")
        public int deleteByAffectationStructurelleId(@PathVariable Long id){
        return chercheurService.deleteByAffectationStructurelleId(id);
        }

        @ApiOperation("find by entiteAdministrative code")
        @GetMapping("/entiteAdministrative/code/{code}")
        public List<Chercheur> findByEntiteAdministrativeCode(@PathVariable String code){
        return chercheurService.findByEntiteAdministrativeCode(code);
        }

        @ApiOperation("delete by entiteAdministrative code")
        @DeleteMapping("/entiteAdministrative/code/{code}")
        public int deleteByEntiteAdministrativeCode(@PathVariable String code){
        return chercheurService.deleteByEntiteAdministrativeCode(code);
        }

        @ApiOperation("find by entiteAdministrative id")
        @GetMapping("/entiteAdministrative/id/{id}")
        public List<Chercheur> findByEntiteAdministrativeId(@PathVariable Long id){
        return chercheurService.findByEntiteAdministrativeId(id);
        }

        @ApiOperation("delete by entiteAdministrative id")
        @DeleteMapping("/entiteAdministrative/id/{id}")
        public int deleteByEntiteAdministrativeId(@PathVariable Long id){
        return chercheurService.deleteByEntiteAdministrativeId(id);
        }

        @ApiOperation("find by typeEntiteAdministrative code")
        @GetMapping("/typeEntiteAdministrative/code/{code}")
        public List<Chercheur> findByTypeEntiteAdministrativeCode(@PathVariable String code){
        return chercheurService.findByTypeEntiteAdministrativeCode(code);
        }

        @ApiOperation("delete by typeEntiteAdministrative code")
        @DeleteMapping("/typeEntiteAdministrative/code/{code}")
        public int deleteByTypeEntiteAdministrativeCode(@PathVariable String code){
        return chercheurService.deleteByTypeEntiteAdministrativeCode(code);
        }

        @ApiOperation("find by typeEntiteAdministrative id")
        @GetMapping("/typeEntiteAdministrative/id/{id}")
        public List<Chercheur> findByTypeEntiteAdministrativeId(@PathVariable Long id){
        return chercheurService.findByTypeEntiteAdministrativeId(id);
        }

        @ApiOperation("delete by typeEntiteAdministrative id")
        @DeleteMapping("/typeEntiteAdministrative/id/{id}")
        public int deleteByTypeEntiteAdministrativeId(@PathVariable Long id){
        return chercheurService.deleteByTypeEntiteAdministrativeId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<Chercheur> findByPaysCode(@PathVariable String code){
        return chercheurService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return chercheurService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<Chercheur> findByPaysId(@PathVariable Long id){
        return chercheurService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return chercheurService.deleteByPaysId(id);
        }

        @ApiOperation("find by ville code")
        @GetMapping("/ville/code/{code}")
        public List<Chercheur> findByVilleCode(@PathVariable String code){
        return chercheurService.findByVilleCode(code);
        }

        @ApiOperation("delete by ville code")
        @DeleteMapping("/ville/code/{code}")
        public int deleteByVilleCode(@PathVariable String code){
        return chercheurService.deleteByVilleCode(code);
        }

        @ApiOperation("find by ville id")
        @GetMapping("/ville/id/{id}")
        public List<Chercheur> findByVilleId(@PathVariable Long id){
        return chercheurService.findByVilleId(id);
        }

        @ApiOperation("delete by ville id")
        @DeleteMapping("/ville/id/{id}")
        public int deleteByVilleId(@PathVariable Long id){
        return chercheurService.deleteByVilleId(id);
        }

        @ApiOperation("find by departementScientifique code")
        @GetMapping("/departementScientifique/code/{code}")
        public List<Chercheur> findByDepartementScientifiqueCode(@PathVariable String code){
        return chercheurService.findByDepartementScientifiqueCode(code);
        }

        @ApiOperation("delete by departementScientifique code")
        @DeleteMapping("/departementScientifique/code/{code}")
        public int deleteByDepartementScientifiqueCode(@PathVariable String code){
        return chercheurService.deleteByDepartementScientifiqueCode(code);
        }

        @ApiOperation("find by departementScientifique id")
        @GetMapping("/departementScientifique/id/{id}")
        public List<Chercheur> findByDepartementScientifiqueId(@PathVariable Long id){
        return chercheurService.findByDepartementScientifiqueId(id);
        }

        @ApiOperation("delete by departementScientifique id")
        @DeleteMapping("/departementScientifique/id/{id}")
        public int deleteByDepartementScientifiqueId(@PathVariable Long id){
        return chercheurService.deleteByDepartementScientifiqueId(id);
        }

        @ApiOperation("find by commissionScientifique code")
        @GetMapping("/commissionScientifique/code/{code}")
        public List<Chercheur> findByCommissionScientifiqueCode(@PathVariable String code){
        return chercheurService.findByCommissionScientifiqueCode(code);
        }

        @ApiOperation("delete by commissionScientifique code")
        @DeleteMapping("/commissionScientifique/code/{code}")
        public int deleteByCommissionScientifiqueCode(@PathVariable String code){
        return chercheurService.deleteByCommissionScientifiqueCode(code);
        }

        @ApiOperation("find by commissionScientifique id")
        @GetMapping("/commissionScientifique/id/{id}")
        public List<Chercheur> findByCommissionScientifiqueId(@PathVariable Long id){
        return chercheurService.findByCommissionScientifiqueId(id);
        }

        @ApiOperation("delete by commissionScientifique id")
        @DeleteMapping("/commissionScientifique/id/{id}")
        public int deleteByCommissionScientifiqueId(@PathVariable Long id){
        return chercheurService.deleteByCommissionScientifiqueId(id);
        }

        @ApiOperation("find by grade code")
        @GetMapping("/grade/code/{code}")
        public List<Chercheur> findByGradeCode(@PathVariable String code){
        return chercheurService.findByGradeCode(code);
        }

        @ApiOperation("delete by grade code")
        @DeleteMapping("/grade/code/{code}")
        public int deleteByGradeCode(@PathVariable String code){
        return chercheurService.deleteByGradeCode(code);
        }

        @ApiOperation("find by grade id")
        @GetMapping("/grade/id/{id}")
        public List<Chercheur> findByGradeId(@PathVariable Long id){
        return chercheurService.findByGradeId(id);
        }

        @ApiOperation("delete by grade id")
        @DeleteMapping("/grade/id/{id}")
        public int deleteByGradeId(@PathVariable Long id){
        return chercheurService.deleteByGradeId(id);
        }

        @ApiOperation("find by corps code")
        @GetMapping("/corps/code/{code}")
        public List<Chercheur> findByCorpsCode(@PathVariable String code){
        return chercheurService.findByCorpsCode(code);
        }

        @ApiOperation("delete by corps code")
        @DeleteMapping("/corps/code/{code}")
        public int deleteByCorpsCode(@PathVariable String code){
        return chercheurService.deleteByCorpsCode(code);
        }

        @ApiOperation("find by corps id")
        @GetMapping("/corps/id/{id}")
        public List<Chercheur> findByCorpsId(@PathVariable Long id){
        return chercheurService.findByCorpsId(id);
        }

        @ApiOperation("delete by corps id")
        @DeleteMapping("/corps/id/{id}")
        public int deleteByCorpsId(@PathVariable Long id){
        return chercheurService.deleteByCorpsId(id);
        }

        @ApiOperation("find by sexe code")
        @GetMapping("/sexe/code/{code}")
        public List<Chercheur> findBySexeCode(@PathVariable String code){
        return chercheurService.findBySexeCode(code);
        }

        @ApiOperation("delete by sexe code")
        @DeleteMapping("/sexe/code/{code}")
        public int deleteBySexeCode(@PathVariable String code){
        return chercheurService.deleteBySexeCode(code);
        }

        @ApiOperation("find by sexe id")
        @GetMapping("/sexe/id/{id}")
        public List<Chercheur> findBySexeId(@PathVariable Long id){
        return chercheurService.findBySexeId(id);
        }

        @ApiOperation("delete by sexe id")
        @DeleteMapping("/sexe/id/{id}")
        public int deleteBySexeId(@PathVariable Long id){
        return chercheurService.deleteBySexeId(id);
        }



            }
