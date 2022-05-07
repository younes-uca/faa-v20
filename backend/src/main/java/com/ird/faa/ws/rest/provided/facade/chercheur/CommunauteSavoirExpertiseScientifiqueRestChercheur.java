package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.CommunauteSavoirExpertiseScientifiqueChercheurService;

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
import com.ird.faa.bean.CommunauteSavoirExpertiseScientifique;
import com.ird.faa.ws.rest.provided.converter.CommunauteSavoirExpertiseScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirExpertiseScientifiqueVo;

@Api("Manages communauteSavoirExpertiseScientifique services")
@RestController
@RequestMapping("api/chercheur/communauteSavoirExpertiseScientifique")
public class CommunauteSavoirExpertiseScientifiqueRestChercheur {

@Autowired
private CommunauteSavoirExpertiseScientifiqueChercheurService communauteSavoirExpertiseScientifiqueService;

@Autowired
private CommunauteSavoirExpertiseScientifiqueConverter communauteSavoirExpertiseScientifiqueConverter;


            @ApiOperation("Updates the specified  communauteSavoirExpertiseScientifique")
            @PutMapping("/")
            public  CommunauteSavoirExpertiseScientifiqueVo update(@RequestBody  CommunauteSavoirExpertiseScientifiqueVo  communauteSavoirExpertiseScientifiqueVo){
            CommunauteSavoirExpertiseScientifique communauteSavoirExpertiseScientifique = communauteSavoirExpertiseScientifiqueConverter.toItem(communauteSavoirExpertiseScientifiqueVo);
            communauteSavoirExpertiseScientifique = communauteSavoirExpertiseScientifiqueService.update(communauteSavoirExpertiseScientifique);
            return communauteSavoirExpertiseScientifiqueConverter.toVo(communauteSavoirExpertiseScientifique);
            }

    @ApiOperation("Finds a list of all communauteSavoirExpertiseScientifiques")
    @GetMapping("/")
    public List<CommunauteSavoirExpertiseScientifiqueVo> findAll(){
        return communauteSavoirExpertiseScientifiqueConverter.toVo(communauteSavoirExpertiseScientifiqueService.findAll());
    }

    @ApiOperation("Finds a communauteSavoirExpertiseScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CommunauteSavoirExpertiseScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return communauteSavoirExpertiseScientifiqueConverter.toVo(communauteSavoirExpertiseScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search communauteSavoirExpertiseScientifique by a specific criteria")
    @PostMapping("/search")
    public List<CommunauteSavoirExpertiseScientifiqueVo> findByCriteria(@RequestBody CommunauteSavoirExpertiseScientifiqueVo communauteSavoirExpertiseScientifiqueVo){
        return communauteSavoirExpertiseScientifiqueConverter.toVo(communauteSavoirExpertiseScientifiqueService.findByCriteria(communauteSavoirExpertiseScientifiqueVo));
        }

            @ApiOperation("Finds a communauteSavoirExpertiseScientifique by id")
            @GetMapping("/id/{id}")
            public CommunauteSavoirExpertiseScientifiqueVo findById(@PathVariable Long id){
            return communauteSavoirExpertiseScientifiqueConverter.toVo(communauteSavoirExpertiseScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  communauteSavoirExpertiseScientifique")
            @PostMapping("/")
            public CommunauteSavoirExpertiseScientifiqueVo save(@RequestBody CommunauteSavoirExpertiseScientifiqueVo communauteSavoirExpertiseScientifiqueVo){
            CommunauteSavoirExpertiseScientifique communauteSavoirExpertiseScientifique = communauteSavoirExpertiseScientifiqueConverter.toItem(communauteSavoirExpertiseScientifiqueVo);
            communauteSavoirExpertiseScientifique = communauteSavoirExpertiseScientifiqueService.save(communauteSavoirExpertiseScientifique);
            return communauteSavoirExpertiseScientifiqueConverter.toVo(communauteSavoirExpertiseScientifique);
            }

            @ApiOperation("Delete the specified communauteSavoirExpertiseScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody CommunauteSavoirExpertiseScientifiqueVo communauteSavoirExpertiseScientifiqueVo){
            CommunauteSavoirExpertiseScientifique communauteSavoirExpertiseScientifique = communauteSavoirExpertiseScientifiqueConverter.toItem(communauteSavoirExpertiseScientifiqueVo);
            return communauteSavoirExpertiseScientifiqueService.delete(communauteSavoirExpertiseScientifique);
            }

            @ApiOperation("Deletes a communauteSavoirExpertiseScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return communauteSavoirExpertiseScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by communauteSavoir code")
        @GetMapping("/communauteSavoir/code/{code}")
        public List<CommunauteSavoirExpertiseScientifique> findByCommunauteSavoirCode(@PathVariable String code){
        return communauteSavoirExpertiseScientifiqueService.findByCommunauteSavoirCode(code);
        }

        @ApiOperation("delete by communauteSavoir code")
        @DeleteMapping("/communauteSavoir/code/{code}")
        public int deleteByCommunauteSavoirCode(@PathVariable String code){
        return communauteSavoirExpertiseScientifiqueService.deleteByCommunauteSavoirCode(code);
        }

        @ApiOperation("find by communauteSavoir id")
        @GetMapping("/communauteSavoir/id/{id}")
        public List<CommunauteSavoirExpertiseScientifique> findByCommunauteSavoirId(@PathVariable Long id){
        return communauteSavoirExpertiseScientifiqueService.findByCommunauteSavoirId(id);
        }

        @ApiOperation("delete by communauteSavoir id")
        @DeleteMapping("/communauteSavoir/id/{id}")
        public int deleteByCommunauteSavoirId(@PathVariable Long id){
        return communauteSavoirExpertiseScientifiqueService.deleteByCommunauteSavoirId(id);
        }

        @ApiOperation("find by expertiseScientifique id")
        @GetMapping("/expertiseScientifique/id/{id}")
        public List<CommunauteSavoirExpertiseScientifique> findByExpertiseScientifiqueId(@PathVariable Long id){
        return communauteSavoirExpertiseScientifiqueService.findByExpertiseScientifiqueId(id);
        }

        @ApiOperation("delete by expertiseScientifique id")
        @DeleteMapping("/expertiseScientifique/id/{id}")
        public int deleteByExpertiseScientifiqueId(@PathVariable Long id){
        return communauteSavoirExpertiseScientifiqueService.deleteByExpertiseScientifiqueId(id);
        }



            }
