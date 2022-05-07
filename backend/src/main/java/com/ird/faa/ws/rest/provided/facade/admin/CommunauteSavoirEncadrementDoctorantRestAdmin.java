package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.CommunauteSavoirEncadrementDoctorantAdminService;

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
import com.ird.faa.bean.CommunauteSavoirEncadrementDoctorant;
import com.ird.faa.ws.rest.provided.converter.CommunauteSavoirEncadrementDoctorantConverter;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirEncadrementDoctorantVo;

@Api("Manages communauteSavoirEncadrementDoctorant services")
@RestController
@RequestMapping("api/admin/communauteSavoirEncadrementDoctorant")
public class CommunauteSavoirEncadrementDoctorantRestAdmin {

@Autowired
private CommunauteSavoirEncadrementDoctorantAdminService communauteSavoirEncadrementDoctorantService;

@Autowired
private CommunauteSavoirEncadrementDoctorantConverter communauteSavoirEncadrementDoctorantConverter;


            @ApiOperation("Updates the specified  communauteSavoirEncadrementDoctorant")
            @PutMapping("/")
            public  CommunauteSavoirEncadrementDoctorantVo update(@RequestBody  CommunauteSavoirEncadrementDoctorantVo  communauteSavoirEncadrementDoctorantVo){
            CommunauteSavoirEncadrementDoctorant communauteSavoirEncadrementDoctorant = communauteSavoirEncadrementDoctorantConverter.toItem(communauteSavoirEncadrementDoctorantVo);
            communauteSavoirEncadrementDoctorant = communauteSavoirEncadrementDoctorantService.update(communauteSavoirEncadrementDoctorant);
            return communauteSavoirEncadrementDoctorantConverter.toVo(communauteSavoirEncadrementDoctorant);
            }

    @ApiOperation("Finds a list of all communauteSavoirEncadrementDoctorants")
    @GetMapping("/")
    public List<CommunauteSavoirEncadrementDoctorantVo> findAll(){
        return communauteSavoirEncadrementDoctorantConverter.toVo(communauteSavoirEncadrementDoctorantService.findAll());
    }

    @ApiOperation("Finds a communauteSavoirEncadrementDoctorant with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CommunauteSavoirEncadrementDoctorantVo findByIdWithAssociatedList(@PathVariable Long id){
    return communauteSavoirEncadrementDoctorantConverter.toVo(communauteSavoirEncadrementDoctorantService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search communauteSavoirEncadrementDoctorant by a specific criteria")
    @PostMapping("/search")
    public List<CommunauteSavoirEncadrementDoctorantVo> findByCriteria(@RequestBody CommunauteSavoirEncadrementDoctorantVo communauteSavoirEncadrementDoctorantVo){
        return communauteSavoirEncadrementDoctorantConverter.toVo(communauteSavoirEncadrementDoctorantService.findByCriteria(communauteSavoirEncadrementDoctorantVo));
        }

            @ApiOperation("Finds a communauteSavoirEncadrementDoctorant by id")
            @GetMapping("/id/{id}")
            public CommunauteSavoirEncadrementDoctorantVo findById(@PathVariable Long id){
            return communauteSavoirEncadrementDoctorantConverter.toVo(communauteSavoirEncadrementDoctorantService.findById(id));
            }

            @ApiOperation("Saves the specified  communauteSavoirEncadrementDoctorant")
            @PostMapping("/")
            public CommunauteSavoirEncadrementDoctorantVo save(@RequestBody CommunauteSavoirEncadrementDoctorantVo communauteSavoirEncadrementDoctorantVo){
            CommunauteSavoirEncadrementDoctorant communauteSavoirEncadrementDoctorant = communauteSavoirEncadrementDoctorantConverter.toItem(communauteSavoirEncadrementDoctorantVo);
            communauteSavoirEncadrementDoctorant = communauteSavoirEncadrementDoctorantService.save(communauteSavoirEncadrementDoctorant);
            return communauteSavoirEncadrementDoctorantConverter.toVo(communauteSavoirEncadrementDoctorant);
            }

            @ApiOperation("Delete the specified communauteSavoirEncadrementDoctorant")
            @DeleteMapping("/")
            public int delete(@RequestBody CommunauteSavoirEncadrementDoctorantVo communauteSavoirEncadrementDoctorantVo){
            CommunauteSavoirEncadrementDoctorant communauteSavoirEncadrementDoctorant = communauteSavoirEncadrementDoctorantConverter.toItem(communauteSavoirEncadrementDoctorantVo);
            return communauteSavoirEncadrementDoctorantService.delete(communauteSavoirEncadrementDoctorant);
            }

            @ApiOperation("Deletes a communauteSavoirEncadrementDoctorant by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return communauteSavoirEncadrementDoctorantService.deleteById(id);
            }
        @ApiOperation("find by communauteSavoir code")
        @GetMapping("/communauteSavoir/code/{code}")
        public List<CommunauteSavoirEncadrementDoctorant> findByCommunauteSavoirCode(@PathVariable String code){
        return communauteSavoirEncadrementDoctorantService.findByCommunauteSavoirCode(code);
        }

        @ApiOperation("delete by communauteSavoir code")
        @DeleteMapping("/communauteSavoir/code/{code}")
        public int deleteByCommunauteSavoirCode(@PathVariable String code){
        return communauteSavoirEncadrementDoctorantService.deleteByCommunauteSavoirCode(code);
        }

        @ApiOperation("find by communauteSavoir id")
        @GetMapping("/communauteSavoir/id/{id}")
        public List<CommunauteSavoirEncadrementDoctorant> findByCommunauteSavoirId(@PathVariable Long id){
        return communauteSavoirEncadrementDoctorantService.findByCommunauteSavoirId(id);
        }

        @ApiOperation("delete by communauteSavoir id")
        @DeleteMapping("/communauteSavoir/id/{id}")
        public int deleteByCommunauteSavoirId(@PathVariable Long id){
        return communauteSavoirEncadrementDoctorantService.deleteByCommunauteSavoirId(id);
        }

        @ApiOperation("find by encadrementDoctorant id")
        @GetMapping("/encadrementDoctorant/id/{id}")
        public List<CommunauteSavoirEncadrementDoctorant> findByEncadrementDoctorantId(@PathVariable Long id){
        return communauteSavoirEncadrementDoctorantService.findByEncadrementDoctorantId(id);
        }

        @ApiOperation("delete by encadrementDoctorant id")
        @DeleteMapping("/encadrementDoctorant/id/{id}")
        public int deleteByEncadrementDoctorantId(@PathVariable Long id){
        return communauteSavoirEncadrementDoctorantService.deleteByEncadrementDoctorantId(id);
        }



            }
