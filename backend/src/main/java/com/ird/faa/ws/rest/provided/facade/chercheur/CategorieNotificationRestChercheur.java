package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.CategorieNotificationChercheurService;

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
import com.ird.faa.bean.CategorieNotification;
import com.ird.faa.ws.rest.provided.converter.CategorieNotificationConverter;
import com.ird.faa.ws.rest.provided.vo.CategorieNotificationVo;

@Api("Manages categorieNotification services")
@RestController
@RequestMapping("api/chercheur/categorieNotification")
public class CategorieNotificationRestChercheur {

@Autowired
private CategorieNotificationChercheurService categorieNotificationService;

@Autowired
private CategorieNotificationConverter categorieNotificationConverter;


            @ApiOperation("Updates the specified  categorieNotification")
            @PutMapping("/")
            public  CategorieNotificationVo update(@RequestBody  CategorieNotificationVo  categorieNotificationVo){
            CategorieNotification categorieNotification = categorieNotificationConverter.toItem(categorieNotificationVo);
            categorieNotification = categorieNotificationService.update(categorieNotification);
            return categorieNotificationConverter.toVo(categorieNotification);
            }

    @ApiOperation("Finds a list of all categorieNotifications")
    @GetMapping("/")
    public List<CategorieNotificationVo> findAll(){
        return categorieNotificationConverter.toVo(categorieNotificationService.findAll());
    }

    @ApiOperation("Finds a categorieNotification with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CategorieNotificationVo findByIdWithAssociatedList(@PathVariable Long id){
    return categorieNotificationConverter.toVo(categorieNotificationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search categorieNotification by a specific criteria")
    @PostMapping("/search")
    public List<CategorieNotificationVo> findByCriteria(@RequestBody CategorieNotificationVo categorieNotificationVo){
        return categorieNotificationConverter.toVo(categorieNotificationService.findByCriteria(categorieNotificationVo));
        }

            @ApiOperation("Finds a categorieNotification by id")
            @GetMapping("/id/{id}")
            public CategorieNotificationVo findById(@PathVariable Long id){
            return categorieNotificationConverter.toVo(categorieNotificationService.findById(id));
            }

            @ApiOperation("Saves the specified  categorieNotification")
            @PostMapping("/")
            public CategorieNotificationVo save(@RequestBody CategorieNotificationVo categorieNotificationVo){
            CategorieNotification categorieNotification = categorieNotificationConverter.toItem(categorieNotificationVo);
            categorieNotification = categorieNotificationService.save(categorieNotification);
            return categorieNotificationConverter.toVo(categorieNotification);
            }

            @ApiOperation("Delete the specified categorieNotification")
            @DeleteMapping("/")
            public int delete(@RequestBody CategorieNotificationVo categorieNotificationVo){
            CategorieNotification categorieNotification = categorieNotificationConverter.toItem(categorieNotificationVo);
            return categorieNotificationService.delete(categorieNotification);
            }

            @ApiOperation("Deletes a categorieNotification by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return categorieNotificationService.deleteById(id);
            }


            }
