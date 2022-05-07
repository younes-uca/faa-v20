package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.CategorieFaqAdminService;

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
import com.ird.faa.bean.CategorieFaq;
import com.ird.faa.ws.rest.provided.converter.CategorieFaqConverter;
import com.ird.faa.ws.rest.provided.vo.CategorieFaqVo;

@Api("Manages categorieFaq services")
@RestController
@RequestMapping("api/admin/categorieFaq")
public class CategorieFaqRestAdmin {

@Autowired
private CategorieFaqAdminService categorieFaqService;

@Autowired
private CategorieFaqConverter categorieFaqConverter;


            @ApiOperation("Updates the specified  categorieFaq")
            @PutMapping("/")
            public  CategorieFaqVo update(@RequestBody  CategorieFaqVo  categorieFaqVo){
            CategorieFaq categorieFaq = categorieFaqConverter.toItem(categorieFaqVo);
            categorieFaq = categorieFaqService.update(categorieFaq);
            return categorieFaqConverter.toVo(categorieFaq);
            }

    @ApiOperation("Finds a list of all categorieFaqs")
    @GetMapping("/")
    public List<CategorieFaqVo> findAll(){
        return categorieFaqConverter.toVo(categorieFaqService.findAll());
    }

    @ApiOperation("Finds a categorieFaq with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CategorieFaqVo findByIdWithAssociatedList(@PathVariable Long id){
    return categorieFaqConverter.toVo(categorieFaqService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search categorieFaq by a specific criteria")
    @PostMapping("/search")
    public List<CategorieFaqVo> findByCriteria(@RequestBody CategorieFaqVo categorieFaqVo){
        return categorieFaqConverter.toVo(categorieFaqService.findByCriteria(categorieFaqVo));
        }

            @ApiOperation("Finds a categorieFaq by id")
            @GetMapping("/id/{id}")
            public CategorieFaqVo findById(@PathVariable Long id){
            return categorieFaqConverter.toVo(categorieFaqService.findById(id));
            }

            @ApiOperation("Saves the specified  categorieFaq")
            @PostMapping("/")
            public CategorieFaqVo save(@RequestBody CategorieFaqVo categorieFaqVo){
            CategorieFaq categorieFaq = categorieFaqConverter.toItem(categorieFaqVo);
            categorieFaq = categorieFaqService.save(categorieFaq);
            return categorieFaqConverter.toVo(categorieFaq);
            }

            @ApiOperation("Delete the specified categorieFaq")
            @DeleteMapping("/")
            public int delete(@RequestBody CategorieFaqVo categorieFaqVo){
            CategorieFaq categorieFaq = categorieFaqConverter.toItem(categorieFaqVo);
            return categorieFaqService.delete(categorieFaq);
            }

            @ApiOperation("Deletes a categorieFaq by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return categorieFaqService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public CategorieFaqVo archiver(@RequestBody CategorieFaqVo categorieFaqVo){
                CategorieFaq categorieFaq = categorieFaqService.archiver(categorieFaqConverter.toItem(categorieFaqVo));
                return categorieFaqConverter.toVo(categorieFaq);
                }

            @PutMapping("/desarchiver/")
            public CategorieFaqVo desarchiver(@RequestBody CategorieFaqVo categorieFaqVo){
                CategorieFaq categorieFaq = categorieFaqService.desarchiver(categorieFaqConverter.toItem(categorieFaqVo));
                return categorieFaqConverter.toVo(categorieFaq);}
            }
