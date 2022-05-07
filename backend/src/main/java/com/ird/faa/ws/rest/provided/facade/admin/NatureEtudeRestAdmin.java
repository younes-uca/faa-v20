package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.NatureEtudeAdminService;

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
import com.ird.faa.bean.NatureEtude;
import com.ird.faa.ws.rest.provided.converter.NatureEtudeConverter;
import com.ird.faa.ws.rest.provided.vo.NatureEtudeVo;

@Api("Manages natureEtude services")
@RestController
@RequestMapping("api/admin/natureEtude")
public class NatureEtudeRestAdmin {

@Autowired
private NatureEtudeAdminService natureEtudeService;

@Autowired
private NatureEtudeConverter natureEtudeConverter;


            @ApiOperation("Updates the specified  natureEtude")
            @PutMapping("/")
            public  NatureEtudeVo update(@RequestBody  NatureEtudeVo  natureEtudeVo){
            NatureEtude natureEtude = natureEtudeConverter.toItem(natureEtudeVo);
            natureEtude = natureEtudeService.update(natureEtude);
            return natureEtudeConverter.toVo(natureEtude);
            }

    @ApiOperation("Finds a list of all natureEtudes")
    @GetMapping("/")
    public List<NatureEtudeVo> findAll(){
        return natureEtudeConverter.toVo(natureEtudeService.findAll());
    }

    @ApiOperation("Finds a natureEtude with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public NatureEtudeVo findByIdWithAssociatedList(@PathVariable Long id){
    return natureEtudeConverter.toVo(natureEtudeService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search natureEtude by a specific criteria")
    @PostMapping("/search")
    public List<NatureEtudeVo> findByCriteria(@RequestBody NatureEtudeVo natureEtudeVo){
        return natureEtudeConverter.toVo(natureEtudeService.findByCriteria(natureEtudeVo));
        }

            @ApiOperation("Finds a natureEtude by id")
            @GetMapping("/id/{id}")
            public NatureEtudeVo findById(@PathVariable Long id){
            return natureEtudeConverter.toVo(natureEtudeService.findById(id));
            }

            @ApiOperation("Saves the specified  natureEtude")
            @PostMapping("/")
            public NatureEtudeVo save(@RequestBody NatureEtudeVo natureEtudeVo){
            NatureEtude natureEtude = natureEtudeConverter.toItem(natureEtudeVo);
            natureEtude = natureEtudeService.save(natureEtude);
            return natureEtudeConverter.toVo(natureEtude);
            }

            @ApiOperation("Delete the specified natureEtude")
            @DeleteMapping("/")
            public int delete(@RequestBody NatureEtudeVo natureEtudeVo){
            NatureEtude natureEtude = natureEtudeConverter.toItem(natureEtudeVo);
            return natureEtudeService.delete(natureEtude);
            }

            @ApiOperation("Deletes a natureEtude by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return natureEtudeService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public NatureEtudeVo archiver(@RequestBody NatureEtudeVo natureEtudeVo){
                NatureEtude natureEtude = natureEtudeService.archiver(natureEtudeConverter.toItem(natureEtudeVo));
                return natureEtudeConverter.toVo(natureEtude);
                }

            @PutMapping("/desarchiver/")
            public NatureEtudeVo desarchiver(@RequestBody NatureEtudeVo natureEtudeVo){
                NatureEtude natureEtude = natureEtudeService.desarchiver(natureEtudeConverter.toItem(natureEtudeVo));
                return natureEtudeConverter.toVo(natureEtude);}
            }
