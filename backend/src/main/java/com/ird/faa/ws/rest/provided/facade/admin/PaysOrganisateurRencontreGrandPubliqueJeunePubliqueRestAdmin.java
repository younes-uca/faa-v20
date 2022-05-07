package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.PaysOrganisateurRencontreGrandPubliqueJeunePubliqueAdminService;

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
import com.ird.faa.bean.PaysOrganisateurRencontreGrandPubliqueJeunePublique;
import com.ird.faa.ws.rest.provided.converter.PaysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter;
import com.ird.faa.ws.rest.provided.vo.PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo;

@Api("Manages paysOrganisateurRencontreGrandPubliqueJeunePublique services")
@RestController
@RequestMapping("api/admin/paysOrganisateurRencontreGrandPubliqueJeunePublique")
public class PaysOrganisateurRencontreGrandPubliqueJeunePubliqueRestAdmin {

@Autowired
private PaysOrganisateurRencontreGrandPubliqueJeunePubliqueAdminService paysOrganisateurRencontreGrandPubliqueJeunePubliqueService;

@Autowired
private PaysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter;


            @ApiOperation("Updates the specified  paysOrganisateurRencontreGrandPubliqueJeunePublique")
            @PutMapping("/")
            public  PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo update(@RequestBody  PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo  paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo){
            PaysOrganisateurRencontreGrandPubliqueJeunePublique paysOrganisateurRencontreGrandPubliqueJeunePublique = paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.toItem(paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo);
            paysOrganisateurRencontreGrandPubliqueJeunePublique = paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.update(paysOrganisateurRencontreGrandPubliqueJeunePublique);
            return paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.toVo(paysOrganisateurRencontreGrandPubliqueJeunePublique);
            }

    @ApiOperation("Finds a list of all paysOrganisateurRencontreGrandPubliqueJeunePubliques")
    @GetMapping("/")
    public List<PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo> findAll(){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.toVo(paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.findAll());
    }

    @ApiOperation("Finds a paysOrganisateurRencontreGrandPubliqueJeunePublique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.toVo(paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search paysOrganisateurRencontreGrandPubliqueJeunePublique by a specific criteria")
    @PostMapping("/search")
    public List<PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo> findByCriteria(@RequestBody PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.toVo(paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.findByCriteria(paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo));
        }

            @ApiOperation("Finds a paysOrganisateurRencontreGrandPubliqueJeunePublique by id")
            @GetMapping("/id/{id}")
            public PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo findById(@PathVariable Long id){
            return paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.toVo(paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.findById(id));
            }

            @ApiOperation("Saves the specified  paysOrganisateurRencontreGrandPubliqueJeunePublique")
            @PostMapping("/")
            public PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo save(@RequestBody PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo){
            PaysOrganisateurRencontreGrandPubliqueJeunePublique paysOrganisateurRencontreGrandPubliqueJeunePublique = paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.toItem(paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo);
            paysOrganisateurRencontreGrandPubliqueJeunePublique = paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.save(paysOrganisateurRencontreGrandPubliqueJeunePublique);
            return paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.toVo(paysOrganisateurRencontreGrandPubliqueJeunePublique);
            }

            @ApiOperation("Delete the specified paysOrganisateurRencontreGrandPubliqueJeunePublique")
            @DeleteMapping("/")
            public int delete(@RequestBody PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo){
            PaysOrganisateurRencontreGrandPubliqueJeunePublique paysOrganisateurRencontreGrandPubliqueJeunePublique = paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.toItem(paysOrganisateurRencontreGrandPubliqueJeunePubliqueVo);
            return paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.delete(paysOrganisateurRencontreGrandPubliqueJeunePublique);
            }

            @ApiOperation("Deletes a paysOrganisateurRencontreGrandPubliqueJeunePublique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.deleteById(id);
            }
        @ApiOperation("find by rencontreGrandPubliqueJeunePublique id")
        @GetMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.findByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @ApiOperation("delete by rencontreGrandPubliqueJeunePublique id")
        @DeleteMapping("/rencontreGrandPubliqueJeunePublique/id/{id}")
        public int deleteByRencontreGrandPubliqueJeunePubliqueId(@PathVariable Long id){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        }

        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findByPaysCode(@PathVariable String code){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findByPaysId(@PathVariable Long id){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.deleteByPaysId(id);
        }



            }
