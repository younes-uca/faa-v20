package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.CommunauteSavoirEvenementColloqueScientifiqueAdminService;

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
import com.ird.faa.bean.CommunauteSavoirEvenementColloqueScientifique;
import com.ird.faa.ws.rest.provided.converter.CommunauteSavoirEvenementColloqueScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirEvenementColloqueScientifiqueVo;

@Api("Manages communauteSavoirEvenementColloqueScientifique services")
@RestController
@RequestMapping("api/admin/communauteSavoirEvenementColloqueScientifique")
public class CommunauteSavoirEvenementColloqueScientifiqueRestAdmin {

@Autowired
private CommunauteSavoirEvenementColloqueScientifiqueAdminService communauteSavoirEvenementColloqueScientifiqueService;

@Autowired
private CommunauteSavoirEvenementColloqueScientifiqueConverter communauteSavoirEvenementColloqueScientifiqueConverter;


            @ApiOperation("Updates the specified  communauteSavoirEvenementColloqueScientifique")
            @PutMapping("/")
            public  CommunauteSavoirEvenementColloqueScientifiqueVo update(@RequestBody  CommunauteSavoirEvenementColloqueScientifiqueVo  communauteSavoirEvenementColloqueScientifiqueVo){
            CommunauteSavoirEvenementColloqueScientifique communauteSavoirEvenementColloqueScientifique = communauteSavoirEvenementColloqueScientifiqueConverter.toItem(communauteSavoirEvenementColloqueScientifiqueVo);
            communauteSavoirEvenementColloqueScientifique = communauteSavoirEvenementColloqueScientifiqueService.update(communauteSavoirEvenementColloqueScientifique);
            return communauteSavoirEvenementColloqueScientifiqueConverter.toVo(communauteSavoirEvenementColloqueScientifique);
            }

    @ApiOperation("Finds a list of all communauteSavoirEvenementColloqueScientifiques")
    @GetMapping("/")
    public List<CommunauteSavoirEvenementColloqueScientifiqueVo> findAll(){
        return communauteSavoirEvenementColloqueScientifiqueConverter.toVo(communauteSavoirEvenementColloqueScientifiqueService.findAll());
    }

    @ApiOperation("Finds a communauteSavoirEvenementColloqueScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CommunauteSavoirEvenementColloqueScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return communauteSavoirEvenementColloqueScientifiqueConverter.toVo(communauteSavoirEvenementColloqueScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search communauteSavoirEvenementColloqueScientifique by a specific criteria")
    @PostMapping("/search")
    public List<CommunauteSavoirEvenementColloqueScientifiqueVo> findByCriteria(@RequestBody CommunauteSavoirEvenementColloqueScientifiqueVo communauteSavoirEvenementColloqueScientifiqueVo){
        return communauteSavoirEvenementColloqueScientifiqueConverter.toVo(communauteSavoirEvenementColloqueScientifiqueService.findByCriteria(communauteSavoirEvenementColloqueScientifiqueVo));
        }

            @ApiOperation("Finds a communauteSavoirEvenementColloqueScientifique by id")
            @GetMapping("/id/{id}")
            public CommunauteSavoirEvenementColloqueScientifiqueVo findById(@PathVariable Long id){
            return communauteSavoirEvenementColloqueScientifiqueConverter.toVo(communauteSavoirEvenementColloqueScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  communauteSavoirEvenementColloqueScientifique")
            @PostMapping("/")
            public CommunauteSavoirEvenementColloqueScientifiqueVo save(@RequestBody CommunauteSavoirEvenementColloqueScientifiqueVo communauteSavoirEvenementColloqueScientifiqueVo){
            CommunauteSavoirEvenementColloqueScientifique communauteSavoirEvenementColloqueScientifique = communauteSavoirEvenementColloqueScientifiqueConverter.toItem(communauteSavoirEvenementColloqueScientifiqueVo);
            communauteSavoirEvenementColloqueScientifique = communauteSavoirEvenementColloqueScientifiqueService.save(communauteSavoirEvenementColloqueScientifique);
            return communauteSavoirEvenementColloqueScientifiqueConverter.toVo(communauteSavoirEvenementColloqueScientifique);
            }

            @ApiOperation("Delete the specified communauteSavoirEvenementColloqueScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody CommunauteSavoirEvenementColloqueScientifiqueVo communauteSavoirEvenementColloqueScientifiqueVo){
            CommunauteSavoirEvenementColloqueScientifique communauteSavoirEvenementColloqueScientifique = communauteSavoirEvenementColloqueScientifiqueConverter.toItem(communauteSavoirEvenementColloqueScientifiqueVo);
            return communauteSavoirEvenementColloqueScientifiqueService.delete(communauteSavoirEvenementColloqueScientifique);
            }

            @ApiOperation("Deletes a communauteSavoirEvenementColloqueScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return communauteSavoirEvenementColloqueScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by evenementColloqueScienntifique id")
        @GetMapping("/evenementColloqueScienntifique/id/{id}")
        public List<CommunauteSavoirEvenementColloqueScientifique> findByEvenementColloqueScienntifiqueId(@PathVariable Long id){
        return communauteSavoirEvenementColloqueScientifiqueService.findByEvenementColloqueScienntifiqueId(id);
        }

        @ApiOperation("delete by evenementColloqueScienntifique id")
        @DeleteMapping("/evenementColloqueScienntifique/id/{id}")
        public int deleteByEvenementColloqueScienntifiqueId(@PathVariable Long id){
        return communauteSavoirEvenementColloqueScientifiqueService.deleteByEvenementColloqueScienntifiqueId(id);
        }

        @ApiOperation("find by communauteSavoir code")
        @GetMapping("/communauteSavoir/code/{code}")
        public List<CommunauteSavoirEvenementColloqueScientifique> findByCommunauteSavoirCode(@PathVariable String code){
        return communauteSavoirEvenementColloqueScientifiqueService.findByCommunauteSavoirCode(code);
        }

        @ApiOperation("delete by communauteSavoir code")
        @DeleteMapping("/communauteSavoir/code/{code}")
        public int deleteByCommunauteSavoirCode(@PathVariable String code){
        return communauteSavoirEvenementColloqueScientifiqueService.deleteByCommunauteSavoirCode(code);
        }

        @ApiOperation("find by communauteSavoir id")
        @GetMapping("/communauteSavoir/id/{id}")
        public List<CommunauteSavoirEvenementColloqueScientifique> findByCommunauteSavoirId(@PathVariable Long id){
        return communauteSavoirEvenementColloqueScientifiqueService.findByCommunauteSavoirId(id);
        }

        @ApiOperation("delete by communauteSavoir id")
        @DeleteMapping("/communauteSavoir/id/{id}")
        public int deleteByCommunauteSavoirId(@PathVariable Long id){
        return communauteSavoirEvenementColloqueScientifiqueService.deleteByCommunauteSavoirId(id);
        }



            }
