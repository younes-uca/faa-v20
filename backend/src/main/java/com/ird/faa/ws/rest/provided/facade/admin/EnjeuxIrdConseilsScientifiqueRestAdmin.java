package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.EnjeuxIrdConseilsScientifiqueAdminService;

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
import com.ird.faa.bean.EnjeuxIrdConseilsScientifique;
import com.ird.faa.ws.rest.provided.converter.EnjeuxIrdConseilsScientifiqueConverter;
import com.ird.faa.ws.rest.provided.vo.EnjeuxIrdConseilsScientifiqueVo;

@Api("Manages enjeuxIrdConseilsScientifique services")
@RestController
@RequestMapping("api/admin/enjeuxIrdConseilsScientifique")
public class EnjeuxIrdConseilsScientifiqueRestAdmin {

@Autowired
private EnjeuxIrdConseilsScientifiqueAdminService enjeuxIrdConseilsScientifiqueService;

@Autowired
private EnjeuxIrdConseilsScientifiqueConverter enjeuxIrdConseilsScientifiqueConverter;


            @ApiOperation("Updates the specified  enjeuxIrdConseilsScientifique")
            @PutMapping("/")
            public  EnjeuxIrdConseilsScientifiqueVo update(@RequestBody  EnjeuxIrdConseilsScientifiqueVo  enjeuxIrdConseilsScientifiqueVo){
            EnjeuxIrdConseilsScientifique enjeuxIrdConseilsScientifique = enjeuxIrdConseilsScientifiqueConverter.toItem(enjeuxIrdConseilsScientifiqueVo);
            enjeuxIrdConseilsScientifique = enjeuxIrdConseilsScientifiqueService.update(enjeuxIrdConseilsScientifique);
            return enjeuxIrdConseilsScientifiqueConverter.toVo(enjeuxIrdConseilsScientifique);
            }

    @ApiOperation("Finds a list of all enjeuxIrdConseilsScientifiques")
    @GetMapping("/")
    public List<EnjeuxIrdConseilsScientifiqueVo> findAll(){
        return enjeuxIrdConseilsScientifiqueConverter.toVo(enjeuxIrdConseilsScientifiqueService.findAll());
    }

    @ApiOperation("Finds a enjeuxIrdConseilsScientifique with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public EnjeuxIrdConseilsScientifiqueVo findByIdWithAssociatedList(@PathVariable Long id){
    return enjeuxIrdConseilsScientifiqueConverter.toVo(enjeuxIrdConseilsScientifiqueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search enjeuxIrdConseilsScientifique by a specific criteria")
    @PostMapping("/search")
    public List<EnjeuxIrdConseilsScientifiqueVo> findByCriteria(@RequestBody EnjeuxIrdConseilsScientifiqueVo enjeuxIrdConseilsScientifiqueVo){
        return enjeuxIrdConseilsScientifiqueConverter.toVo(enjeuxIrdConseilsScientifiqueService.findByCriteria(enjeuxIrdConseilsScientifiqueVo));
        }

            @ApiOperation("Finds a enjeuxIrdConseilsScientifique by id")
            @GetMapping("/id/{id}")
            public EnjeuxIrdConseilsScientifiqueVo findById(@PathVariable Long id){
            return enjeuxIrdConseilsScientifiqueConverter.toVo(enjeuxIrdConseilsScientifiqueService.findById(id));
            }

            @ApiOperation("Saves the specified  enjeuxIrdConseilsScientifique")
            @PostMapping("/")
            public EnjeuxIrdConseilsScientifiqueVo save(@RequestBody EnjeuxIrdConseilsScientifiqueVo enjeuxIrdConseilsScientifiqueVo){
            EnjeuxIrdConseilsScientifique enjeuxIrdConseilsScientifique = enjeuxIrdConseilsScientifiqueConverter.toItem(enjeuxIrdConseilsScientifiqueVo);
            enjeuxIrdConseilsScientifique = enjeuxIrdConseilsScientifiqueService.save(enjeuxIrdConseilsScientifique);
            return enjeuxIrdConseilsScientifiqueConverter.toVo(enjeuxIrdConseilsScientifique);
            }

            @ApiOperation("Delete the specified enjeuxIrdConseilsScientifique")
            @DeleteMapping("/")
            public int delete(@RequestBody EnjeuxIrdConseilsScientifiqueVo enjeuxIrdConseilsScientifiqueVo){
            EnjeuxIrdConseilsScientifique enjeuxIrdConseilsScientifique = enjeuxIrdConseilsScientifiqueConverter.toItem(enjeuxIrdConseilsScientifiqueVo);
            return enjeuxIrdConseilsScientifiqueService.delete(enjeuxIrdConseilsScientifique);
            }

            @ApiOperation("Deletes a enjeuxIrdConseilsScientifique by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return enjeuxIrdConseilsScientifiqueService.deleteById(id);
            }
        @ApiOperation("find by enjeuxIrd code")
        @GetMapping("/enjeuxIrd/code/{code}")
        public List<EnjeuxIrdConseilsScientifique> findByEnjeuxIrdCode(@PathVariable String code){
        return enjeuxIrdConseilsScientifiqueService.findByEnjeuxIrdCode(code);
        }

        @ApiOperation("delete by enjeuxIrd code")
        @DeleteMapping("/enjeuxIrd/code/{code}")
        public int deleteByEnjeuxIrdCode(@PathVariable String code){
        return enjeuxIrdConseilsScientifiqueService.deleteByEnjeuxIrdCode(code);
        }

        @ApiOperation("find by enjeuxIrd id")
        @GetMapping("/enjeuxIrd/id/{id}")
        public List<EnjeuxIrdConseilsScientifique> findByEnjeuxIrdId(@PathVariable Long id){
        return enjeuxIrdConseilsScientifiqueService.findByEnjeuxIrdId(id);
        }

        @ApiOperation("delete by enjeuxIrd id")
        @DeleteMapping("/enjeuxIrd/id/{id}")
        public int deleteByEnjeuxIrdId(@PathVariable Long id){
        return enjeuxIrdConseilsScientifiqueService.deleteByEnjeuxIrdId(id);
        }

        @ApiOperation("find by conseilsScientifique id")
        @GetMapping("/conseilsScientifique/id/{id}")
        public List<EnjeuxIrdConseilsScientifique> findByConseilsScientifiqueId(@PathVariable Long id){
        return enjeuxIrdConseilsScientifiqueService.findByConseilsScientifiqueId(id);
        }

        @ApiOperation("delete by conseilsScientifique id")
        @DeleteMapping("/conseilsScientifique/id/{id}")
        public int deleteByConseilsScientifiqueId(@PathVariable Long id){
        return enjeuxIrdConseilsScientifiqueService.deleteByConseilsScientifiqueId(id);
        }



            }
