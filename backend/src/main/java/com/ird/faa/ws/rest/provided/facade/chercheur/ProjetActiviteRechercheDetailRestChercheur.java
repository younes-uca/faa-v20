package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ProjetActiviteRechercheDetailChercheurService;

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
import com.ird.faa.bean.ProjetActiviteRechercheDetail;
import com.ird.faa.ws.rest.provided.converter.ProjetActiviteRechercheDetailConverter;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailVo;

@Api("Manages projetActiviteRechercheDetail services")
@RestController
@RequestMapping("api/chercheur/projetActiviteRechercheDetail")
public class ProjetActiviteRechercheDetailRestChercheur {

@Autowired
private ProjetActiviteRechercheDetailChercheurService projetActiviteRechercheDetailService;

@Autowired
private ProjetActiviteRechercheDetailConverter projetActiviteRechercheDetailConverter;


            @ApiOperation("Updates the specified  projetActiviteRechercheDetail")
            @PutMapping("/")
            public  ProjetActiviteRechercheDetailVo update(@RequestBody  ProjetActiviteRechercheDetailVo  projetActiviteRechercheDetailVo){
            ProjetActiviteRechercheDetail projetActiviteRechercheDetail = projetActiviteRechercheDetailConverter.toItem(projetActiviteRechercheDetailVo);
            projetActiviteRechercheDetail = projetActiviteRechercheDetailService.update(projetActiviteRechercheDetail);
            return projetActiviteRechercheDetailConverter.toVo(projetActiviteRechercheDetail);
            }

    @ApiOperation("Finds a list of all projetActiviteRechercheDetails")
    @GetMapping("/")
    public List<ProjetActiviteRechercheDetailVo> findAll(){
        return projetActiviteRechercheDetailConverter.toVo(projetActiviteRechercheDetailService.findAll());
    }

    @ApiOperation("Finds a projetActiviteRechercheDetail with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ProjetActiviteRechercheDetailVo findByIdWithAssociatedList(@PathVariable Long id){
    return projetActiviteRechercheDetailConverter.toVo(projetActiviteRechercheDetailService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search projetActiviteRechercheDetail by a specific criteria")
    @PostMapping("/search")
    public List<ProjetActiviteRechercheDetailVo> findByCriteria(@RequestBody ProjetActiviteRechercheDetailVo projetActiviteRechercheDetailVo){
        return projetActiviteRechercheDetailConverter.toVo(projetActiviteRechercheDetailService.findByCriteria(projetActiviteRechercheDetailVo));
        }

            @ApiOperation("Finds a projetActiviteRechercheDetail by id")
            @GetMapping("/id/{id}")
            public ProjetActiviteRechercheDetailVo findById(@PathVariable Long id){
            return projetActiviteRechercheDetailConverter.toVo(projetActiviteRechercheDetailService.findById(id));
            }

            @ApiOperation("Saves the specified  projetActiviteRechercheDetail")
            @PostMapping("/")
            public ProjetActiviteRechercheDetailVo save(@RequestBody ProjetActiviteRechercheDetailVo projetActiviteRechercheDetailVo){
            ProjetActiviteRechercheDetail projetActiviteRechercheDetail = projetActiviteRechercheDetailConverter.toItem(projetActiviteRechercheDetailVo);
            projetActiviteRechercheDetail = projetActiviteRechercheDetailService.save(projetActiviteRechercheDetail);
            return projetActiviteRechercheDetailConverter.toVo(projetActiviteRechercheDetail);
            }

            @ApiOperation("Delete the specified projetActiviteRechercheDetail")
            @DeleteMapping("/")
            public int delete(@RequestBody ProjetActiviteRechercheDetailVo projetActiviteRechercheDetailVo){
            ProjetActiviteRechercheDetail projetActiviteRechercheDetail = projetActiviteRechercheDetailConverter.toItem(projetActiviteRechercheDetailVo);
            return projetActiviteRechercheDetailService.delete(projetActiviteRechercheDetail);
            }

            @ApiOperation("Deletes a projetActiviteRechercheDetail by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return projetActiviteRechercheDetailService.deleteById(id);
            }
        @ApiOperation("find by statusProjet code")
        @GetMapping("/statusProjet/code/{code}")
        public List<ProjetActiviteRechercheDetail> findByStatusProjetCode(@PathVariable String code){
        return projetActiviteRechercheDetailService.findByStatusProjetCode(code);
        }

        @ApiOperation("delete by statusProjet code")
        @DeleteMapping("/statusProjet/code/{code}")
        public int deleteByStatusProjetCode(@PathVariable String code){
        return projetActiviteRechercheDetailService.deleteByStatusProjetCode(code);
        }

        @ApiOperation("find by statusProjet id")
        @GetMapping("/statusProjet/id/{id}")
        public List<ProjetActiviteRechercheDetail> findByStatusProjetId(@PathVariable Long id){
        return projetActiviteRechercheDetailService.findByStatusProjetId(id);
        }

        @ApiOperation("delete by statusProjet id")
        @DeleteMapping("/statusProjet/id/{id}")
        public int deleteByStatusProjetId(@PathVariable Long id){
        return projetActiviteRechercheDetailService.deleteByStatusProjetId(id);
        }

        @ApiOperation("find by roleProjet code")
        @GetMapping("/roleProjet/code/{code}")
        public List<ProjetActiviteRechercheDetail> findByRoleProjetCode(@PathVariable String code){
        return projetActiviteRechercheDetailService.findByRoleProjetCode(code);
        }

        @ApiOperation("delete by roleProjet code")
        @DeleteMapping("/roleProjet/code/{code}")
        public int deleteByRoleProjetCode(@PathVariable String code){
        return projetActiviteRechercheDetailService.deleteByRoleProjetCode(code);
        }

        @ApiOperation("find by roleProjet id")
        @GetMapping("/roleProjet/id/{id}")
        public List<ProjetActiviteRechercheDetail> findByRoleProjetId(@PathVariable Long id){
        return projetActiviteRechercheDetailService.findByRoleProjetId(id);
        }

        @ApiOperation("delete by roleProjet id")
        @DeleteMapping("/roleProjet/id/{id}")
        public int deleteByRoleProjetId(@PathVariable Long id){
        return projetActiviteRechercheDetailService.deleteByRoleProjetId(id);
        }

        @ApiOperation("find by etablissement code")
        @GetMapping("/etablissement/code/{code}")
        public List<ProjetActiviteRechercheDetail> findByEtablissementCode(@PathVariable String code){
        return projetActiviteRechercheDetailService.findByEtablissementCode(code);
        }

        @ApiOperation("delete by etablissement code")
        @DeleteMapping("/etablissement/code/{code}")
        public int deleteByEtablissementCode(@PathVariable String code){
        return projetActiviteRechercheDetailService.deleteByEtablissementCode(code);
        }

        @ApiOperation("find by etablissement id")
        @GetMapping("/etablissement/id/{id}")
        public List<ProjetActiviteRechercheDetail> findByEtablissementId(@PathVariable Long id){
        return projetActiviteRechercheDetailService.findByEtablissementId(id);
        }

        @ApiOperation("delete by etablissement id")
        @DeleteMapping("/etablissement/id/{id}")
        public int deleteByEtablissementId(@PathVariable Long id){
        return projetActiviteRechercheDetailService.deleteByEtablissementId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<ProjetActiviteRechercheDetail> findByPaysCode(@PathVariable String code){
        return projetActiviteRechercheDetailService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return projetActiviteRechercheDetailService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<ProjetActiviteRechercheDetail> findByPaysId(@PathVariable Long id){
        return projetActiviteRechercheDetailService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return projetActiviteRechercheDetailService.deleteByPaysId(id);
        }

        @ApiOperation("find by projetActiviteRecherche id")
        @GetMapping("/projetActiviteRecherche/id/{id}")
        public List<ProjetActiviteRechercheDetail> findByProjetActiviteRechercheId(@PathVariable Long id){
        return projetActiviteRechercheDetailService.findByProjetActiviteRechercheId(id);
        }

        @ApiOperation("delete by projetActiviteRecherche id")
        @DeleteMapping("/projetActiviteRecherche/id/{id}")
        public int deleteByProjetActiviteRechercheId(@PathVariable Long id){
        return projetActiviteRechercheDetailService.deleteByProjetActiviteRechercheId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<ProjetActiviteRechercheDetail> findByEtatEtapeCampagneCode(@PathVariable String code){
        return projetActiviteRechercheDetailService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return projetActiviteRechercheDetailService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<ProjetActiviteRechercheDetail> findByEtatEtapeCampagneId(@PathVariable Long id){
        return projetActiviteRechercheDetailService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return projetActiviteRechercheDetailService.deleteByEtatEtapeCampagneId(id);
        }



            }
