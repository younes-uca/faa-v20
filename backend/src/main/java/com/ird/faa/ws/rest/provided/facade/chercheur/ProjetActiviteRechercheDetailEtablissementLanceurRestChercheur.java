package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ProjetActiviteRechercheDetailEtablissementLanceurChercheurService;

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
import com.ird.faa.bean.ProjetActiviteRechercheDetailEtablissementLanceur;
import com.ird.faa.ws.rest.provided.converter.ProjetActiviteRechercheDetailEtablissementLanceurConverter;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailEtablissementLanceurVo;

@Api("Manages projetActiviteRechercheDetailEtablissementLanceur services")
@RestController
@RequestMapping("api/chercheur/projetActiviteRechercheDetailEtablissementLanceur")
public class ProjetActiviteRechercheDetailEtablissementLanceurRestChercheur {

@Autowired
private ProjetActiviteRechercheDetailEtablissementLanceurChercheurService projetActiviteRechercheDetailEtablissementLanceurService;

@Autowired
private ProjetActiviteRechercheDetailEtablissementLanceurConverter projetActiviteRechercheDetailEtablissementLanceurConverter;


            @ApiOperation("Updates the specified  projetActiviteRechercheDetailEtablissementLanceur")
            @PutMapping("/")
            public  ProjetActiviteRechercheDetailEtablissementLanceurVo update(@RequestBody  ProjetActiviteRechercheDetailEtablissementLanceurVo  projetActiviteRechercheDetailEtablissementLanceurVo){
            ProjetActiviteRechercheDetailEtablissementLanceur projetActiviteRechercheDetailEtablissementLanceur = projetActiviteRechercheDetailEtablissementLanceurConverter.toItem(projetActiviteRechercheDetailEtablissementLanceurVo);
            projetActiviteRechercheDetailEtablissementLanceur = projetActiviteRechercheDetailEtablissementLanceurService.update(projetActiviteRechercheDetailEtablissementLanceur);
            return projetActiviteRechercheDetailEtablissementLanceurConverter.toVo(projetActiviteRechercheDetailEtablissementLanceur);
            }

    @ApiOperation("Finds a list of all projetActiviteRechercheDetailEtablissementLanceurs")
    @GetMapping("/")
    public List<ProjetActiviteRechercheDetailEtablissementLanceurVo> findAll(){
        return projetActiviteRechercheDetailEtablissementLanceurConverter.toVo(projetActiviteRechercheDetailEtablissementLanceurService.findAll());
    }

    @ApiOperation("Finds a projetActiviteRechercheDetailEtablissementLanceur with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ProjetActiviteRechercheDetailEtablissementLanceurVo findByIdWithAssociatedList(@PathVariable Long id){
    return projetActiviteRechercheDetailEtablissementLanceurConverter.toVo(projetActiviteRechercheDetailEtablissementLanceurService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search projetActiviteRechercheDetailEtablissementLanceur by a specific criteria")
    @PostMapping("/search")
    public List<ProjetActiviteRechercheDetailEtablissementLanceurVo> findByCriteria(@RequestBody ProjetActiviteRechercheDetailEtablissementLanceurVo projetActiviteRechercheDetailEtablissementLanceurVo){
        return projetActiviteRechercheDetailEtablissementLanceurConverter.toVo(projetActiviteRechercheDetailEtablissementLanceurService.findByCriteria(projetActiviteRechercheDetailEtablissementLanceurVo));
        }

            @ApiOperation("Finds a projetActiviteRechercheDetailEtablissementLanceur by id")
            @GetMapping("/id/{id}")
            public ProjetActiviteRechercheDetailEtablissementLanceurVo findById(@PathVariable Long id){
            return projetActiviteRechercheDetailEtablissementLanceurConverter.toVo(projetActiviteRechercheDetailEtablissementLanceurService.findById(id));
            }

            @ApiOperation("Saves the specified  projetActiviteRechercheDetailEtablissementLanceur")
            @PostMapping("/")
            public ProjetActiviteRechercheDetailEtablissementLanceurVo save(@RequestBody ProjetActiviteRechercheDetailEtablissementLanceurVo projetActiviteRechercheDetailEtablissementLanceurVo){
            ProjetActiviteRechercheDetailEtablissementLanceur projetActiviteRechercheDetailEtablissementLanceur = projetActiviteRechercheDetailEtablissementLanceurConverter.toItem(projetActiviteRechercheDetailEtablissementLanceurVo);
            projetActiviteRechercheDetailEtablissementLanceur = projetActiviteRechercheDetailEtablissementLanceurService.save(projetActiviteRechercheDetailEtablissementLanceur);
            return projetActiviteRechercheDetailEtablissementLanceurConverter.toVo(projetActiviteRechercheDetailEtablissementLanceur);
            }

            @ApiOperation("Delete the specified projetActiviteRechercheDetailEtablissementLanceur")
            @DeleteMapping("/")
            public int delete(@RequestBody ProjetActiviteRechercheDetailEtablissementLanceurVo projetActiviteRechercheDetailEtablissementLanceurVo){
            ProjetActiviteRechercheDetailEtablissementLanceur projetActiviteRechercheDetailEtablissementLanceur = projetActiviteRechercheDetailEtablissementLanceurConverter.toItem(projetActiviteRechercheDetailEtablissementLanceurVo);
            return projetActiviteRechercheDetailEtablissementLanceurService.delete(projetActiviteRechercheDetailEtablissementLanceur);
            }

            @ApiOperation("Deletes a projetActiviteRechercheDetailEtablissementLanceur by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return projetActiviteRechercheDetailEtablissementLanceurService.deleteById(id);
            }
        @ApiOperation("find by etablissement code")
        @GetMapping("/etablissement/code/{code}")
        public List<ProjetActiviteRechercheDetailEtablissementLanceur> findByEtablissementCode(@PathVariable String code){
        return projetActiviteRechercheDetailEtablissementLanceurService.findByEtablissementCode(code);
        }

        @ApiOperation("delete by etablissement code")
        @DeleteMapping("/etablissement/code/{code}")
        public int deleteByEtablissementCode(@PathVariable String code){
        return projetActiviteRechercheDetailEtablissementLanceurService.deleteByEtablissementCode(code);
        }

        @ApiOperation("find by etablissement id")
        @GetMapping("/etablissement/id/{id}")
        public List<ProjetActiviteRechercheDetailEtablissementLanceur> findByEtablissementId(@PathVariable Long id){
        return projetActiviteRechercheDetailEtablissementLanceurService.findByEtablissementId(id);
        }

        @ApiOperation("delete by etablissement id")
        @DeleteMapping("/etablissement/id/{id}")
        public int deleteByEtablissementId(@PathVariable Long id){
        return projetActiviteRechercheDetailEtablissementLanceurService.deleteByEtablissementId(id);
        }

        @ApiOperation("find by projetActiviteRechercheDetail id")
        @GetMapping("/projetActiviteRechercheDetail/id/{id}")
        public List<ProjetActiviteRechercheDetailEtablissementLanceur> findByProjetActiviteRechercheDetailId(@PathVariable Long id){
        return projetActiviteRechercheDetailEtablissementLanceurService.findByProjetActiviteRechercheDetailId(id);
        }

        @ApiOperation("delete by projetActiviteRechercheDetail id")
        @DeleteMapping("/projetActiviteRechercheDetail/id/{id}")
        public int deleteByProjetActiviteRechercheDetailId(@PathVariable Long id){
        return projetActiviteRechercheDetailEtablissementLanceurService.deleteByProjetActiviteRechercheDetailId(id);
        }



            }
