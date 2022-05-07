package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.NationaliteAdminService;

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
import com.ird.faa.bean.Nationalite;
import com.ird.faa.ws.rest.provided.converter.NationaliteConverter;
import com.ird.faa.ws.rest.provided.vo.NationaliteVo;

@Api("Manages nationalite services")
@RestController
@RequestMapping("api/admin/nationalite")
public class NationaliteRestAdmin {

@Autowired
private NationaliteAdminService nationaliteService;

@Autowired
private NationaliteConverter nationaliteConverter;


            @ApiOperation("Updates the specified  nationalite")
            @PutMapping("/")
            public  NationaliteVo update(@RequestBody  NationaliteVo  nationaliteVo){
            Nationalite nationalite = nationaliteConverter.toItem(nationaliteVo);
            nationalite = nationaliteService.update(nationalite);
            return nationaliteConverter.toVo(nationalite);
            }

    @ApiOperation("Finds a list of all nationalites")
    @GetMapping("/")
    public List<NationaliteVo> findAll(){
        return nationaliteConverter.toVo(nationaliteService.findAll());
    }

    @ApiOperation("Finds a nationalite with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public NationaliteVo findByIdWithAssociatedList(@PathVariable Long id){
    return nationaliteConverter.toVo(nationaliteService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search nationalite by a specific criteria")
    @PostMapping("/search")
    public List<NationaliteVo> findByCriteria(@RequestBody NationaliteVo nationaliteVo){
        return nationaliteConverter.toVo(nationaliteService.findByCriteria(nationaliteVo));
        }

            @ApiOperation("Finds a nationalite by id")
            @GetMapping("/id/{id}")
            public NationaliteVo findById(@PathVariable Long id){
            return nationaliteConverter.toVo(nationaliteService.findById(id));
            }

            @ApiOperation("Saves the specified  nationalite")
            @PostMapping("/")
            public NationaliteVo save(@RequestBody NationaliteVo nationaliteVo){
            Nationalite nationalite = nationaliteConverter.toItem(nationaliteVo);
            nationalite = nationaliteService.save(nationalite);
            return nationaliteConverter.toVo(nationalite);
            }

            @ApiOperation("Delete the specified nationalite")
            @DeleteMapping("/")
            public int delete(@RequestBody NationaliteVo nationaliteVo){
            Nationalite nationalite = nationaliteConverter.toItem(nationaliteVo);
            return nationaliteService.delete(nationalite);
            }

            @ApiOperation("Deletes a nationalite by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return nationaliteService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public NationaliteVo archiver(@RequestBody NationaliteVo nationaliteVo){
                Nationalite nationalite = nationaliteService.archiver(nationaliteConverter.toItem(nationaliteVo));
                return nationaliteConverter.toVo(nationalite);
                }

            @PutMapping("/desarchiver/")
            public NationaliteVo desarchiver(@RequestBody NationaliteVo nationaliteVo){
                Nationalite nationalite = nationaliteService.desarchiver(nationaliteConverter.toItem(nationaliteVo));
                return nationaliteConverter.toVo(nationalite);}
            }
