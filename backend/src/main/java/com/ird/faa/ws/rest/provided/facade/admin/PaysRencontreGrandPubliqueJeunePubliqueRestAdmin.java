package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.PaysRencontreGrandPubliqueJeunePubliqueAdminService;

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
import com.ird.faa.bean.PaysRencontreGrandPubliqueJeunePublique;
import com.ird.faa.ws.rest.provided.converter.PaysRencontreGrandPubliqueJeunePubliqueConverter;
import com.ird.faa.ws.rest.provided.vo.PaysRencontreGrandPubliqueJeunePubliqueVo;

@Api("Manages paysRencontreGrandPubliqueJeunePublique services")
@RestController
@RequestMapping("api/admin/paysRencontreGrandPubliqueJeunePublique")
public class PaysRencontreGrandPubliqueJeunePubliqueRestAdmin {

@Autowired
private PaysRencontreGrandPubliqueJeunePubliqueAdminService paysRencontreGrandPubliqueJeunePubliqueService;

@Autowired
private PaysRencontreGrandPubliqueJeunePubliqueConverter paysRencontreGrandPubliqueJeunePubliqueConverter;


            @ApiOperation("Updates the specified  paysRencontreGrandPubliqueJeunePublique")
            @PutMapping("/")
            public  PaysRencontreGrandPubliqueJeunePubliqueVo update(@RequestBody  PaysRencontreGrandPubliqueJeunePubliqueVo  paysRencontreGrandPubliqueJeunePubliqueVo){
            PaysRencontreGrandPubliqueJeunePublique paysRencontreGrandPubliqueJeunePublique = paysRencontreGrandPubliqueJeunePubliqueConverter.toItem(paysRencontreGrandPubliqueJeunePubliqueVo);
            paysRencontreGrandPubliqueJeunePublique = paysRencontreGrandPubliqueJeunePubliqueService.update(paysRencontreGrandPubliqueJeunePublique);
            return paysRencontreGrandPubliqueJeunePubliqueConverter.toVo(paysRencontreGrandPubliqueJeunePublique);
            }

    @ApiOperation("Finds a list of all paysRencontreGrandPubliqueJeunePubliques")
    @GetMapping("/")
    public List<PaysRencontreGrandPubliqueJeunePubliqueVo> findAll(){
        return paysRencontreGrandPubliqueJeunePubliqueConverter.toVo(paysRencontreGrandPubliqueJeunePubliqueService.findAll());
    }

    @ApiOperation("Finds a paysRencontreGrandPubliqueJeunePublique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public PaysRencontreGrandPubliqueJeunePubliqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return paysRencontreGrandPubliqueJeunePubliqueConverter.toVo(paysRencontreGrandPubliqueJeunePubliqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search paysRencontreGrandPubliqueJeunePublique by a specific criteria")
    @PostMapping("/search")
    public List<PaysRencontreGrandPubliqueJeunePubliqueVo> findByCriteria(@RequestBody PaysRencontreGrandPubliqueJeunePubliqueVo paysRencontreGrandPubliqueJeunePubliqueVo){
        return paysRencontreGrandPubliqueJeunePubliqueConverter.toVo(paysRencontreGrandPubliqueJeunePubliqueService.findByCriteria(paysRencontreGrandPubliqueJeunePubliqueVo));
        }

            @ApiOperation("Finds a paysRencontreGrandPubliqueJeunePublique by id")
            @GetMapping("/id/{id}")
            public PaysRencontreGrandPubliqueJeunePubliqueVo findById(@PathVariable Long id){
            return paysRencontreGrandPubliqueJeunePubliqueConverter.toVo(paysRencontreGrandPubliqueJeunePubliqueService.findById(id));
            }

            @ApiOperation("Saves the specified  paysRencontreGrandPubliqueJeunePublique")
            @PostMapping("/")
            public PaysRencontreGrandPubliqueJeunePubliqueVo save(@RequestBody PaysRencontreGrandPubliqueJeunePubliqueVo paysRencontreGrandPubliqueJeunePubliqueVo){
            PaysRencontreGrandPubliqueJeunePublique paysRencontreGrandPubliqueJeunePublique = paysRencontreGrandPubliqueJeunePubliqueConverter.toItem(paysRencontreGrandPubliqueJeunePubliqueVo);
            paysRencontreGrandPubliqueJeunePublique = paysRencontreGrandPubliqueJeunePubliqueService.save(paysRencontreGrandPubliqueJeunePublique);
            return paysRencontreGrandPubliqueJeunePubliqueConverter.toVo(paysRencontreGrandPubliqueJeunePublique);
            }

            @ApiOperation("Delete the specified paysRencontreGrandPubliqueJeunePublique")
            @DeleteMapping("/")
            public int delete(@RequestBody PaysRencontreGrandPubliqueJeunePubliqueVo paysRencontreGrandPubliqueJeunePubliqueVo){
            PaysRencontreGrandPubliqueJeunePublique paysRencontreGrandPubliqueJeunePublique = paysRencontreGrandPubliqueJeunePubliqueConverter.toItem(paysRencontreGrandPubliqueJeunePubliqueVo);
            return paysRencontreGrandPubliqueJeunePubliqueService.delete(paysRencontreGrandPubliqueJeunePublique);
            }

            @ApiOperation("Deletes a paysRencontreGrandPubliqueJeunePublique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return paysRencontreGrandPubliqueJeunePubliqueService.deleteById(id);
            }
        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<PaysRencontreGrandPubliqueJeunePublique> findByPaysCode(@PathVariable String code){
        return paysRencontreGrandPubliqueJeunePubliqueService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return paysRencontreGrandPubliqueJeunePubliqueService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<PaysRencontreGrandPubliqueJeunePublique> findByPaysId(@PathVariable Long id){
        return paysRencontreGrandPubliqueJeunePubliqueService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return paysRencontreGrandPubliqueJeunePubliqueService.deleteByPaysId(id);
        }

        @ApiOperation("find by rencontreGrandPubliqueJeunePublique id")
        @GetMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public List<PaysRencontreGrandPubliqueJeunePublique> findByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return paysRencontreGrandPubliqueJeunePubliqueService.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @ApiOperation("delete by rencontreGrandPubliqueJeunePublique id")
        @DeleteMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return paysRencontreGrandPubliqueJeunePubliqueService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }



            }
