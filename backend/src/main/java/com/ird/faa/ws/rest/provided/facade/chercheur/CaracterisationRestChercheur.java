package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.CaracterisationChercheurService;

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
import com.ird.faa.bean.Caracterisation;
import com.ird.faa.ws.rest.provided.converter.CaracterisationConverter;
import com.ird.faa.ws.rest.provided.vo.CaracterisationVo;

@Api("Manages caracterisation services")
@RestController
@RequestMapping("api/chercheur/caracterisation")
public class CaracterisationRestChercheur {

@Autowired
private CaracterisationChercheurService caracterisationService;

@Autowired
private CaracterisationConverter caracterisationConverter;


            @ApiOperation("Updates the specified  caracterisation")
            @PutMapping("/")
            public  CaracterisationVo update(@RequestBody  CaracterisationVo  caracterisationVo){
            Caracterisation caracterisation = caracterisationConverter.toItem(caracterisationVo);
            caracterisation = caracterisationService.update(caracterisation);
            return caracterisationConverter.toVo(caracterisation);
            }

    @ApiOperation("Finds a list of all caracterisations")
    @GetMapping("/")
    public List<CaracterisationVo> findAll(){
        return caracterisationConverter.toVo(caracterisationService.findAll());
    }

    @ApiOperation("Finds a caracterisation with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CaracterisationVo findByIdWithAssociatedList(@PathVariable Long id){
    return caracterisationConverter.toVo(caracterisationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search caracterisation by a specific criteria")
    @PostMapping("/search")
    public List<CaracterisationVo> findByCriteria(@RequestBody CaracterisationVo caracterisationVo){
        return caracterisationConverter.toVo(caracterisationService.findByCriteria(caracterisationVo));
        }

            @ApiOperation("Finds a caracterisation by id")
            @GetMapping("/id/{id}")
            public CaracterisationVo findById(@PathVariable Long id){
            return caracterisationConverter.toVo(caracterisationService.findById(id));
            }

            @ApiOperation("Saves the specified  caracterisation")
            @PostMapping("/")
            public CaracterisationVo save(@RequestBody CaracterisationVo caracterisationVo){
            Caracterisation caracterisation = caracterisationConverter.toItem(caracterisationVo);
            caracterisation = caracterisationService.save(caracterisation);
            return caracterisationConverter.toVo(caracterisation);
            }

            @ApiOperation("Delete the specified caracterisation")
            @DeleteMapping("/")
            public int delete(@RequestBody CaracterisationVo caracterisationVo){
            Caracterisation caracterisation = caracterisationConverter.toItem(caracterisationVo);
            return caracterisationService.delete(caracterisation);
            }

            @ApiOperation("Deletes a caracterisation by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return caracterisationService.deleteById(id);
            }


            }
