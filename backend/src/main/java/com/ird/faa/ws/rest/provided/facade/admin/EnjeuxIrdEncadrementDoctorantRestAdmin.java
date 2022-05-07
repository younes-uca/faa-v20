package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EnjeuxIrdEncadrementDoctorantAdminService;

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
import com.ird.faa.bean.EnjeuxIrdEncadrementDoctorant;
import com.ird.faa.ws.rest.provided.converter.EnjeuxIrdEncadrementDoctorantConverter;
import com.ird.faa.ws.rest.provided.vo.EnjeuxIrdEncadrementDoctorantVo;

@Api("Manages enjeuxIrdEncadrementDoctorant services")
@RestController
@RequestMapping("api/admin/enjeuxIrdEncadrementDoctorant")
public class EnjeuxIrdEncadrementDoctorantRestAdmin {

@Autowired
private EnjeuxIrdEncadrementDoctorantAdminService enjeuxIrdEncadrementDoctorantService;

@Autowired
private EnjeuxIrdEncadrementDoctorantConverter enjeuxIrdEncadrementDoctorantConverter;


            @ApiOperation("Updates the specified  enjeuxIrdEncadrementDoctorant")
            @PutMapping("/")
            public  EnjeuxIrdEncadrementDoctorantVo update(@RequestBody  EnjeuxIrdEncadrementDoctorantVo  enjeuxIrdEncadrementDoctorantVo){
            EnjeuxIrdEncadrementDoctorant enjeuxIrdEncadrementDoctorant = enjeuxIrdEncadrementDoctorantConverter.toItem(enjeuxIrdEncadrementDoctorantVo);
            enjeuxIrdEncadrementDoctorant = enjeuxIrdEncadrementDoctorantService.update(enjeuxIrdEncadrementDoctorant);
            return enjeuxIrdEncadrementDoctorantConverter.toVo(enjeuxIrdEncadrementDoctorant);
            }

    @ApiOperation("Finds a list of all enjeuxIrdEncadrementDoctorants")
    @GetMapping("/")
    public List<EnjeuxIrdEncadrementDoctorantVo> findAll(){
        return enjeuxIrdEncadrementDoctorantConverter.toVo(enjeuxIrdEncadrementDoctorantService.findAll());
    }

    @ApiOperation("Finds a enjeuxIrdEncadrementDoctorant with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EnjeuxIrdEncadrementDoctorantVo findByIdWithAssociatedList(@PathVariable Long id){
    return enjeuxIrdEncadrementDoctorantConverter.toVo(enjeuxIrdEncadrementDoctorantService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search enjeuxIrdEncadrementDoctorant by a specific criteria")
    @PostMapping("/search")
    public List<EnjeuxIrdEncadrementDoctorantVo> findByCriteria(@RequestBody EnjeuxIrdEncadrementDoctorantVo enjeuxIrdEncadrementDoctorantVo){
        return enjeuxIrdEncadrementDoctorantConverter.toVo(enjeuxIrdEncadrementDoctorantService.findByCriteria(enjeuxIrdEncadrementDoctorantVo));
        }

            @ApiOperation("Finds a enjeuxIrdEncadrementDoctorant by id")
            @GetMapping("/id/{id}")
            public EnjeuxIrdEncadrementDoctorantVo findById(@PathVariable Long id){
            return enjeuxIrdEncadrementDoctorantConverter.toVo(enjeuxIrdEncadrementDoctorantService.findById(id));
            }

            @ApiOperation("Saves the specified  enjeuxIrdEncadrementDoctorant")
            @PostMapping("/")
            public EnjeuxIrdEncadrementDoctorantVo save(@RequestBody EnjeuxIrdEncadrementDoctorantVo enjeuxIrdEncadrementDoctorantVo){
            EnjeuxIrdEncadrementDoctorant enjeuxIrdEncadrementDoctorant = enjeuxIrdEncadrementDoctorantConverter.toItem(enjeuxIrdEncadrementDoctorantVo);
            enjeuxIrdEncadrementDoctorant = enjeuxIrdEncadrementDoctorantService.save(enjeuxIrdEncadrementDoctorant);
            return enjeuxIrdEncadrementDoctorantConverter.toVo(enjeuxIrdEncadrementDoctorant);
            }

            @ApiOperation("Delete the specified enjeuxIrdEncadrementDoctorant")
            @DeleteMapping("/")
            public int delete(@RequestBody EnjeuxIrdEncadrementDoctorantVo enjeuxIrdEncadrementDoctorantVo){
            EnjeuxIrdEncadrementDoctorant enjeuxIrdEncadrementDoctorant = enjeuxIrdEncadrementDoctorantConverter.toItem(enjeuxIrdEncadrementDoctorantVo);
            return enjeuxIrdEncadrementDoctorantService.delete(enjeuxIrdEncadrementDoctorant);
            }

            @ApiOperation("Deletes a enjeuxIrdEncadrementDoctorant by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return enjeuxIrdEncadrementDoctorantService.deleteById(id);
            }
        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<EnjeuxIrdEncadrementDoctorant> findByEnjeuxIrdCode(@PathVariable String code){
        return enjeuxIrdEncadrementDoctorantService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return enjeuxIrdEncadrementDoctorantService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<EnjeuxIrdEncadrementDoctorant> findByEnjeuxIrdId(@PathVariable Long id){
        return enjeuxIrdEncadrementDoctorantService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return enjeuxIrdEncadrementDoctorantService.deleteByEnjeuxIrdId(id);
        }

        @ApiOperation("find by encadrementDoctorant id")
        @GetMapping("/encadrementDoctorant/id/{id}")
        public List<EnjeuxIrdEncadrementDoctorant> findByEncadrementDoctorantId(@PathVariable Long id){
        return enjeuxIrdEncadrementDoctorantService.findByEncadrementDoctorantId(id);
        }

        @ApiOperation("delete by encadrementDoctorant id")
        @DeleteMapping("/encadrementDoctorant/id/{id}")
        public int deleteByEncadrementDoctorantId(@PathVariable Long id){
        return enjeuxIrdEncadrementDoctorantService.deleteByEncadrementDoctorantId(id);
        }



            }
