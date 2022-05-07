package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ResponsabilitePedagogiqueChercheurService;

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
import com.ird.faa.bean.ResponsabilitePedagogique;
import com.ird.faa.ws.rest.provided.converter.ResponsabilitePedagogiqueConverter;
import com.ird.faa.ws.rest.provided.vo.ResponsabilitePedagogiqueVo;

@Api("Manages responsabilitePedagogique services")
@RestController
@RequestMapping("api/chercheur/responsabilitePedagogique")
public class ResponsabilitePedagogiqueRestChercheur {

@Autowired
private ResponsabilitePedagogiqueChercheurService responsabilitePedagogiqueService;

@Autowired
private ResponsabilitePedagogiqueConverter responsabilitePedagogiqueConverter;


            @ApiOperation("Updates the specified  responsabilitePedagogique")
            @PutMapping("/")
            public  ResponsabilitePedagogiqueVo update(@RequestBody  ResponsabilitePedagogiqueVo  responsabilitePedagogiqueVo){
            ResponsabilitePedagogique responsabilitePedagogique = responsabilitePedagogiqueConverter.toItem(responsabilitePedagogiqueVo);
            responsabilitePedagogique = responsabilitePedagogiqueService.update(responsabilitePedagogique);
            return responsabilitePedagogiqueConverter.toVo(responsabilitePedagogique);
            }

    @ApiOperation("Finds a list of all responsabilitePedagogiques")
    @GetMapping("/")
    public List<ResponsabilitePedagogiqueVo> findAll(){
        return responsabilitePedagogiqueConverter.toVo(responsabilitePedagogiqueService.findAll());
    }

    @ApiOperation("Finds a responsabilitePedagogique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ResponsabilitePedagogiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return responsabilitePedagogiqueConverter.toVo(responsabilitePedagogiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search responsabilitePedagogique by a specific criteria")
    @PostMapping("/search")
    public List<ResponsabilitePedagogiqueVo> findByCriteria(@RequestBody ResponsabilitePedagogiqueVo responsabilitePedagogiqueVo){
        return responsabilitePedagogiqueConverter.toVo(responsabilitePedagogiqueService.findByCriteria(responsabilitePedagogiqueVo));
        }

            @ApiOperation("Finds a responsabilitePedagogique by id")
            @GetMapping("/id/{id}")
            public ResponsabilitePedagogiqueVo findById(@PathVariable Long id){
            return responsabilitePedagogiqueConverter.toVo(responsabilitePedagogiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  responsabilitePedagogique")
            @PostMapping("/")
            public ResponsabilitePedagogiqueVo save(@RequestBody ResponsabilitePedagogiqueVo responsabilitePedagogiqueVo){
            ResponsabilitePedagogique responsabilitePedagogique = responsabilitePedagogiqueConverter.toItem(responsabilitePedagogiqueVo);
            responsabilitePedagogique = responsabilitePedagogiqueService.save(responsabilitePedagogique);
            return responsabilitePedagogiqueConverter.toVo(responsabilitePedagogique);
            }

            @ApiOperation("Delete the specified responsabilitePedagogique")
            @DeleteMapping("/")
            public int delete(@RequestBody ResponsabilitePedagogiqueVo responsabilitePedagogiqueVo){
            ResponsabilitePedagogique responsabilitePedagogique = responsabilitePedagogiqueConverter.toItem(responsabilitePedagogiqueVo);
            return responsabilitePedagogiqueService.delete(responsabilitePedagogique);
            }

            @ApiOperation("Deletes a responsabilitePedagogique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return responsabilitePedagogiqueService.deleteById(id);
            }
        @ApiOperation("find by niveauResponsabilitePedagogique code")
        @GetMapping("/niveauResponsabilitePedagogique/code/{code}")
        public List<ResponsabilitePedagogique> findByNiveauResponsabilitePedagogiqueCode(@PathVariable String code){
        return responsabilitePedagogiqueService.findByNiveauResponsabilitePedagogiqueCode(code);
        }

        @ApiOperation("delete by niveauResponsabilitePedagogique code")
        @DeleteMapping("/niveauResponsabilitePedagogique/code/{code}")
        public int deleteByNiveauResponsabilitePedagogiqueCode(@PathVariable String code){
        return responsabilitePedagogiqueService.deleteByNiveauResponsabilitePedagogiqueCode(code);
        }

        @ApiOperation("find by niveauResponsabilitePedagogique id")
        @GetMapping("/niveauResponsabilitePedagogique/id/{id}")
        public List<ResponsabilitePedagogique> findByNiveauResponsabilitePedagogiqueId(@PathVariable Long id){
        return responsabilitePedagogiqueService.findByNiveauResponsabilitePedagogiqueId(id);
        }

        @ApiOperation("delete by niveauResponsabilitePedagogique id")
        @DeleteMapping("/niveauResponsabilitePedagogique/id/{id}")
        public int deleteByNiveauResponsabilitePedagogiqueId(@PathVariable Long id){
        return responsabilitePedagogiqueService.deleteByNiveauResponsabilitePedagogiqueId(id);
        }

        @ApiOperation("find by statusCursus code")
        @GetMapping("/statusCursus/code/{code}")
        public List<ResponsabilitePedagogique> findByStatusCursusCode(@PathVariable String code){
        return responsabilitePedagogiqueService.findByStatusCursusCode(code);
        }

        @ApiOperation("delete by statusCursus code")
        @DeleteMapping("/statusCursus/code/{code}")
        public int deleteByStatusCursusCode(@PathVariable String code){
        return responsabilitePedagogiqueService.deleteByStatusCursusCode(code);
        }

        @ApiOperation("find by statusCursus id")
        @GetMapping("/statusCursus/id/{id}")
        public List<ResponsabilitePedagogique> findByStatusCursusId(@PathVariable Long id){
        return responsabilitePedagogiqueService.findByStatusCursusId(id);
        }

        @ApiOperation("delete by statusCursus id")
        @DeleteMapping("/statusCursus/id/{id}")
        public int deleteByStatusCursusId(@PathVariable Long id){
        return responsabilitePedagogiqueService.deleteByStatusCursusId(id);
        }

        @ApiOperation("find by etatEtapeCampagne code")
        @GetMapping("/etatEtapeCampagne/code/{code}")
        public List<ResponsabilitePedagogique> findByEtatEtapeCampagneCode(@PathVariable String code){
        return responsabilitePedagogiqueService.findByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("delete by etatEtapeCampagne code")
        @DeleteMapping("/etatEtapeCampagne/code/{code}")
        public int deleteByEtatEtapeCampagneCode(@PathVariable String code){
        return responsabilitePedagogiqueService.deleteByEtatEtapeCampagneCode(code);
        }

        @ApiOperation("find by etatEtapeCampagne id")
        @GetMapping("/etatEtapeCampagne/id/{id}")
        public List<ResponsabilitePedagogique> findByEtatEtapeCampagneId(@PathVariable Long id){
        return responsabilitePedagogiqueService.findByEtatEtapeCampagneId(id);
        }

        @ApiOperation("delete by etatEtapeCampagne id")
        @DeleteMapping("/etatEtapeCampagne/id/{id}")
        public int deleteByEtatEtapeCampagneId(@PathVariable Long id){
        return responsabilitePedagogiqueService.deleteByEtatEtapeCampagneId(id);
        }

        @ApiOperation("find by enseignementEtFormation id")
        @GetMapping("/enseignementEtFormation/id/{id}")
        public List<ResponsabilitePedagogique> findByEnseignementEtFormationId(@PathVariable Long id){
        return responsabilitePedagogiqueService.findByEnseignementEtFormationId(id);
        }

        @ApiOperation("delete by enseignementEtFormation id")
        @DeleteMapping("/enseignementEtFormation/id/{id}")
        public int deleteByEnseignementEtFormationId(@PathVariable Long id){
        return responsabilitePedagogiqueService.deleteByEnseignementEtFormationId(id);
        }



            }
