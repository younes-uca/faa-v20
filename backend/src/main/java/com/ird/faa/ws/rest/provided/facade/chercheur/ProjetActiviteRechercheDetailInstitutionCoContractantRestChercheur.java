package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ProjetActiviteRechercheDetailInstitutionCoContractantChercheurService;

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
import com.ird.faa.bean.ProjetActiviteRechercheDetailInstitutionCoContractant;
import com.ird.faa.ws.rest.provided.converter.ProjetActiviteRechercheDetailInstitutionCoContractantConverter;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailInstitutionCoContractantVo;

@Api("Manages projetActiviteRechercheDetailInstitutionCoContractant services")
@RestController
@RequestMapping("api/chercheur/projetActiviteRechercheDetailInstitutionCoContractant")
public class ProjetActiviteRechercheDetailInstitutionCoContractantRestChercheur {

@Autowired
private ProjetActiviteRechercheDetailInstitutionCoContractantChercheurService projetActiviteRechercheDetailInstitutionCoContractantService;

@Autowired
private ProjetActiviteRechercheDetailInstitutionCoContractantConverter projetActiviteRechercheDetailInstitutionCoContractantConverter;


            @ApiOperation("Updates the specified  projetActiviteRechercheDetailInstitutionCoContractant")
            @PutMapping("/")
            public  ProjetActiviteRechercheDetailInstitutionCoContractantVo update(@RequestBody  ProjetActiviteRechercheDetailInstitutionCoContractantVo  projetActiviteRechercheDetailInstitutionCoContractantVo){
            ProjetActiviteRechercheDetailInstitutionCoContractant projetActiviteRechercheDetailInstitutionCoContractant = projetActiviteRechercheDetailInstitutionCoContractantConverter.toItem(projetActiviteRechercheDetailInstitutionCoContractantVo);
            projetActiviteRechercheDetailInstitutionCoContractant = projetActiviteRechercheDetailInstitutionCoContractantService.update(projetActiviteRechercheDetailInstitutionCoContractant);
            return projetActiviteRechercheDetailInstitutionCoContractantConverter.toVo(projetActiviteRechercheDetailInstitutionCoContractant);
            }

    @ApiOperation("Finds a list of all projetActiviteRechercheDetailInstitutionCoContractants")
    @GetMapping("/")
    public List<ProjetActiviteRechercheDetailInstitutionCoContractantVo> findAll(){
        return projetActiviteRechercheDetailInstitutionCoContractantConverter.toVo(projetActiviteRechercheDetailInstitutionCoContractantService.findAll());
    }

    @ApiOperation("Finds a projetActiviteRechercheDetailInstitutionCoContractant with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ProjetActiviteRechercheDetailInstitutionCoContractantVo findByIdWithAssociatedList(@PathVariable Long id){
    return projetActiviteRechercheDetailInstitutionCoContractantConverter.toVo(projetActiviteRechercheDetailInstitutionCoContractantService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search projetActiviteRechercheDetailInstitutionCoContractant by a specific criteria")
    @PostMapping("/search")
    public List<ProjetActiviteRechercheDetailInstitutionCoContractantVo> findByCriteria(@RequestBody ProjetActiviteRechercheDetailInstitutionCoContractantVo projetActiviteRechercheDetailInstitutionCoContractantVo){
        return projetActiviteRechercheDetailInstitutionCoContractantConverter.toVo(projetActiviteRechercheDetailInstitutionCoContractantService.findByCriteria(projetActiviteRechercheDetailInstitutionCoContractantVo));
        }

            @ApiOperation("Finds a projetActiviteRechercheDetailInstitutionCoContractant by id")
            @GetMapping("/id/{id}")
            public ProjetActiviteRechercheDetailInstitutionCoContractantVo findById(@PathVariable Long id){
            return projetActiviteRechercheDetailInstitutionCoContractantConverter.toVo(projetActiviteRechercheDetailInstitutionCoContractantService.findById(id));
            }

            @ApiOperation("Saves the specified  projetActiviteRechercheDetailInstitutionCoContractant")
            @PostMapping("/")
            public ProjetActiviteRechercheDetailInstitutionCoContractantVo save(@RequestBody ProjetActiviteRechercheDetailInstitutionCoContractantVo projetActiviteRechercheDetailInstitutionCoContractantVo){
            ProjetActiviteRechercheDetailInstitutionCoContractant projetActiviteRechercheDetailInstitutionCoContractant = projetActiviteRechercheDetailInstitutionCoContractantConverter.toItem(projetActiviteRechercheDetailInstitutionCoContractantVo);
            projetActiviteRechercheDetailInstitutionCoContractant = projetActiviteRechercheDetailInstitutionCoContractantService.save(projetActiviteRechercheDetailInstitutionCoContractant);
            return projetActiviteRechercheDetailInstitutionCoContractantConverter.toVo(projetActiviteRechercheDetailInstitutionCoContractant);
            }

            @ApiOperation("Delete the specified projetActiviteRechercheDetailInstitutionCoContractant")
            @DeleteMapping("/")
            public int delete(@RequestBody ProjetActiviteRechercheDetailInstitutionCoContractantVo projetActiviteRechercheDetailInstitutionCoContractantVo){
            ProjetActiviteRechercheDetailInstitutionCoContractant projetActiviteRechercheDetailInstitutionCoContractant = projetActiviteRechercheDetailInstitutionCoContractantConverter.toItem(projetActiviteRechercheDetailInstitutionCoContractantVo);
            return projetActiviteRechercheDetailInstitutionCoContractantService.delete(projetActiviteRechercheDetailInstitutionCoContractant);
            }

            @ApiOperation("Deletes a projetActiviteRechercheDetailInstitutionCoContractant by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return projetActiviteRechercheDetailInstitutionCoContractantService.deleteById(id);
            }
        @ApiOperation("find by etablissement code")
        @GetMapping("/etablissement/code/{code}")
        public List<ProjetActiviteRechercheDetailInstitutionCoContractant> findByEtablissementCode(@PathVariable String code){
        return projetActiviteRechercheDetailInstitutionCoContractantService.findByEtablissementCode(code);
        }

        @ApiOperation("delete by etablissement code")
        @DeleteMapping("/etablissement/code/{code}")
        public int deleteByEtablissementCode(@PathVariable String code){
        return projetActiviteRechercheDetailInstitutionCoContractantService.deleteByEtablissementCode(code);
        }

        @ApiOperation("find by etablissement id")
        @GetMapping("/etablissement/id/{id}")
        public List<ProjetActiviteRechercheDetailInstitutionCoContractant> findByEtablissementId(@PathVariable Long id){
        return projetActiviteRechercheDetailInstitutionCoContractantService.findByEtablissementId(id);
        }

        @ApiOperation("delete by etablissement id")
        @DeleteMapping("/etablissement/id/{id}")
        public int deleteByEtablissementId(@PathVariable Long id){
        return projetActiviteRechercheDetailInstitutionCoContractantService.deleteByEtablissementId(id);
        }

        @ApiOperation("find by projetActiviteRechercheDetail id")
        @GetMapping("/projetActiviteRechercheDetail/id/{id}")
        public List<ProjetActiviteRechercheDetailInstitutionCoContractant> findByProjetActiviteRechercheDetailId(@PathVariable Long id){
        return projetActiviteRechercheDetailInstitutionCoContractantService.findByProjetActiviteRechercheDetailId(id);
        }

        @ApiOperation("delete by projetActiviteRechercheDetail id")
        @DeleteMapping("/projetActiviteRechercheDetail/id/{id}")
        public int deleteByProjetActiviteRechercheDetailId(@PathVariable Long id){
        return projetActiviteRechercheDetailInstitutionCoContractantService.deleteByProjetActiviteRechercheDetailId(id);
        }



            }
