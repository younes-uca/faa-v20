package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.FournisseurAppelProjetRechercheChercheurService;

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
import com.ird.faa.bean.FournisseurAppelProjetRecherche;
import com.ird.faa.ws.rest.provided.converter.FournisseurAppelProjetRechercheConverter;
import com.ird.faa.ws.rest.provided.vo.FournisseurAppelProjetRechercheVo;

@Api("Manages fournisseurAppelProjetRecherche services")
@RestController
@RequestMapping("api/chercheur/fournisseurAppelProjetRecherche")
public class FournisseurAppelProjetRechercheRestChercheur {

@Autowired
private FournisseurAppelProjetRechercheChercheurService fournisseurAppelProjetRechercheService;

@Autowired
private FournisseurAppelProjetRechercheConverter fournisseurAppelProjetRechercheConverter;


            @ApiOperation("Updates the specified  fournisseurAppelProjetRecherche")
            @PutMapping("/")
            public  FournisseurAppelProjetRechercheVo update(@RequestBody  FournisseurAppelProjetRechercheVo  fournisseurAppelProjetRechercheVo){
            FournisseurAppelProjetRecherche fournisseurAppelProjetRecherche = fournisseurAppelProjetRechercheConverter.toItem(fournisseurAppelProjetRechercheVo);
            fournisseurAppelProjetRecherche = fournisseurAppelProjetRechercheService.update(fournisseurAppelProjetRecherche);
            return fournisseurAppelProjetRechercheConverter.toVo(fournisseurAppelProjetRecherche);
            }

    @ApiOperation("Finds a list of all fournisseurAppelProjetRecherches")
    @GetMapping("/")
    public List<FournisseurAppelProjetRechercheVo> findAll(){
        return fournisseurAppelProjetRechercheConverter.toVo(fournisseurAppelProjetRechercheService.findAll());
    }

    @ApiOperation("Finds a fournisseurAppelProjetRecherche with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public FournisseurAppelProjetRechercheVo findByIdWithAssociatedList(@PathVariable Long id){
    return fournisseurAppelProjetRechercheConverter.toVo(fournisseurAppelProjetRechercheService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search fournisseurAppelProjetRecherche by a specific criteria")
    @PostMapping("/search")
    public List<FournisseurAppelProjetRechercheVo> findByCriteria(@RequestBody FournisseurAppelProjetRechercheVo fournisseurAppelProjetRechercheVo){
        return fournisseurAppelProjetRechercheConverter.toVo(fournisseurAppelProjetRechercheService.findByCriteria(fournisseurAppelProjetRechercheVo));
        }

            @ApiOperation("Finds a fournisseurAppelProjetRecherche by id")
            @GetMapping("/id/{id}")
            public FournisseurAppelProjetRechercheVo findById(@PathVariable Long id){
            return fournisseurAppelProjetRechercheConverter.toVo(fournisseurAppelProjetRechercheService.findById(id));
            }

            @ApiOperation("Saves the specified  fournisseurAppelProjetRecherche")
            @PostMapping("/")
            public FournisseurAppelProjetRechercheVo save(@RequestBody FournisseurAppelProjetRechercheVo fournisseurAppelProjetRechercheVo){
            FournisseurAppelProjetRecherche fournisseurAppelProjetRecherche = fournisseurAppelProjetRechercheConverter.toItem(fournisseurAppelProjetRechercheVo);
            fournisseurAppelProjetRecherche = fournisseurAppelProjetRechercheService.save(fournisseurAppelProjetRecherche);
            return fournisseurAppelProjetRechercheConverter.toVo(fournisseurAppelProjetRecherche);
            }

            @ApiOperation("Delete the specified fournisseurAppelProjetRecherche")
            @DeleteMapping("/")
            public int delete(@RequestBody FournisseurAppelProjetRechercheVo fournisseurAppelProjetRechercheVo){
            FournisseurAppelProjetRecherche fournisseurAppelProjetRecherche = fournisseurAppelProjetRechercheConverter.toItem(fournisseurAppelProjetRechercheVo);
            return fournisseurAppelProjetRechercheService.delete(fournisseurAppelProjetRecherche);
            }

            @ApiOperation("Deletes a fournisseurAppelProjetRecherche by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return fournisseurAppelProjetRechercheService.deleteById(id);
            }
        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<FournisseurAppelProjetRecherche> findByPaysCode(@PathVariable String code){
        return fournisseurAppelProjetRechercheService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return fournisseurAppelProjetRechercheService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<FournisseurAppelProjetRecherche> findByPaysId(@PathVariable Long id){
        return fournisseurAppelProjetRechercheService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return fournisseurAppelProjetRechercheService.deleteByPaysId(id);
        }



            }
