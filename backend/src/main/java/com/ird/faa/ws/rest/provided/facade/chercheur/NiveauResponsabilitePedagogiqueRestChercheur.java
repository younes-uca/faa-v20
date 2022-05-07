package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.NiveauResponsabilitePedagogiqueChercheurService;

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
import com.ird.faa.bean.NiveauResponsabilitePedagogique;
import com.ird.faa.ws.rest.provided.converter.NiveauResponsabilitePedagogiqueConverter;
import com.ird.faa.ws.rest.provided.vo.NiveauResponsabilitePedagogiqueVo;

@Api("Manages niveauResponsabilitePedagogique services")
@RestController
@RequestMapping("api/chercheur/niveauResponsabilitePedagogique")
public class NiveauResponsabilitePedagogiqueRestChercheur {

@Autowired
private NiveauResponsabilitePedagogiqueChercheurService niveauResponsabilitePedagogiqueService;

@Autowired
private NiveauResponsabilitePedagogiqueConverter niveauResponsabilitePedagogiqueConverter;


            @ApiOperation("Updates the specified  niveauResponsabilitePedagogique")
            @PutMapping("/")
            public  NiveauResponsabilitePedagogiqueVo update(@RequestBody  NiveauResponsabilitePedagogiqueVo  niveauResponsabilitePedagogiqueVo){
            NiveauResponsabilitePedagogique niveauResponsabilitePedagogique = niveauResponsabilitePedagogiqueConverter.toItem(niveauResponsabilitePedagogiqueVo);
            niveauResponsabilitePedagogique = niveauResponsabilitePedagogiqueService.update(niveauResponsabilitePedagogique);
            return niveauResponsabilitePedagogiqueConverter.toVo(niveauResponsabilitePedagogique);
            }

    @ApiOperation("Finds a list of all niveauResponsabilitePedagogiques")
    @GetMapping("/")
    public List<NiveauResponsabilitePedagogiqueVo> findAll(){
        return niveauResponsabilitePedagogiqueConverter.toVo(niveauResponsabilitePedagogiqueService.findAll());
    }

    @ApiOperation("Finds a niveauResponsabilitePedagogique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public NiveauResponsabilitePedagogiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return niveauResponsabilitePedagogiqueConverter.toVo(niveauResponsabilitePedagogiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search niveauResponsabilitePedagogique by a specific criteria")
    @PostMapping("/search")
    public List<NiveauResponsabilitePedagogiqueVo> findByCriteria(@RequestBody NiveauResponsabilitePedagogiqueVo niveauResponsabilitePedagogiqueVo){
        return niveauResponsabilitePedagogiqueConverter.toVo(niveauResponsabilitePedagogiqueService.findByCriteria(niveauResponsabilitePedagogiqueVo));
        }

            @ApiOperation("Finds a niveauResponsabilitePedagogique by id")
            @GetMapping("/id/{id}")
            public NiveauResponsabilitePedagogiqueVo findById(@PathVariable Long id){
            return niveauResponsabilitePedagogiqueConverter.toVo(niveauResponsabilitePedagogiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  niveauResponsabilitePedagogique")
            @PostMapping("/")
            public NiveauResponsabilitePedagogiqueVo save(@RequestBody NiveauResponsabilitePedagogiqueVo niveauResponsabilitePedagogiqueVo){
            NiveauResponsabilitePedagogique niveauResponsabilitePedagogique = niveauResponsabilitePedagogiqueConverter.toItem(niveauResponsabilitePedagogiqueVo);
            niveauResponsabilitePedagogique = niveauResponsabilitePedagogiqueService.save(niveauResponsabilitePedagogique);
            return niveauResponsabilitePedagogiqueConverter.toVo(niveauResponsabilitePedagogique);
            }

            @ApiOperation("Delete the specified niveauResponsabilitePedagogique")
            @DeleteMapping("/")
            public int delete(@RequestBody NiveauResponsabilitePedagogiqueVo niveauResponsabilitePedagogiqueVo){
            NiveauResponsabilitePedagogique niveauResponsabilitePedagogique = niveauResponsabilitePedagogiqueConverter.toItem(niveauResponsabilitePedagogiqueVo);
            return niveauResponsabilitePedagogiqueService.delete(niveauResponsabilitePedagogique);
            }

            @ApiOperation("Deletes a niveauResponsabilitePedagogique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return niveauResponsabilitePedagogiqueService.deleteById(id);
            }


            }
