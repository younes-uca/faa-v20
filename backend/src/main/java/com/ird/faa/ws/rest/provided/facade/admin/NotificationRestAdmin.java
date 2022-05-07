package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.NotificationAdminService;

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
import com.ird.faa.bean.Notification;
import com.ird.faa.ws.rest.provided.converter.NotificationConverter;
import com.ird.faa.ws.rest.provided.vo.NotificationVo;

@Api("Manages notification services")
@RestController
@RequestMapping("api/admin/notification")
public class NotificationRestAdmin {

@Autowired
private NotificationAdminService notificationService;

@Autowired
private NotificationConverter notificationConverter;


            @ApiOperation("Updates the specified  notification")
            @PutMapping("/")
            public  NotificationVo update(@RequestBody  NotificationVo  notificationVo){
            Notification notification = notificationConverter.toItem(notificationVo);
            notification = notificationService.update(notification);
            return notificationConverter.toVo(notification);
            }

    @ApiOperation("Finds a list of all notifications")
    @GetMapping("/")
    public List<NotificationVo> findAll(){
        return notificationConverter.toVo(notificationService.findAll());
    }

    @ApiOperation("Finds a notification with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public NotificationVo findByIdWithAssociatedList(@PathVariable Long id){
    return notificationConverter.toVo(notificationService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search notification by a specific criteria")
    @PostMapping("/search")
    public List<NotificationVo> findByCriteria(@RequestBody NotificationVo notificationVo){
        return notificationConverter.toVo(notificationService.findByCriteria(notificationVo));
        }

            @ApiOperation("Finds a notification by id")
            @GetMapping("/id/{id}")
            public NotificationVo findById(@PathVariable Long id){
            return notificationConverter.toVo(notificationService.findById(id));
            }

            @ApiOperation("Saves the specified  notification")
            @PostMapping("/")
            public NotificationVo save(@RequestBody NotificationVo notificationVo){
            Notification notification = notificationConverter.toItem(notificationVo);
            notification = notificationService.save(notification);
            return notificationConverter.toVo(notification);
            }

            @ApiOperation("Delete the specified notification")
            @DeleteMapping("/")
            public int delete(@RequestBody NotificationVo notificationVo){
            Notification notification = notificationConverter.toItem(notificationVo);
            return notificationService.delete(notification);
            }

            @ApiOperation("Deletes a notification by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return notificationService.deleteById(id);
            }
        @ApiOperation("find by chercheur numeroMatricule")
        @GetMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public List<Notification> findByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return notificationService.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("delete by chercheur numeroMatricule")
        @DeleteMapping("/chercheur/numeroMatricule/{numeroMatricule}")
        public int deleteByChercheurNumeroMatricule(@PathVariable String numeroMatricule){
        return notificationService.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @ApiOperation("find by chercheur id")
        @GetMapping("/chercheur/id/{id}")
        public List<Notification> findByChercheurId(@PathVariable Long id){
        return notificationService.findByChercheurId(id);
        }

        @ApiOperation("delete by chercheur id")
        @DeleteMapping("/chercheur/id/{id}")
        public int deleteByChercheurId(@PathVariable Long id){
        return notificationService.deleteByChercheurId(id);
        }

        @ApiOperation("find by categorieNotification code")
        @GetMapping("/categorieNotification/code/{code}")
        public List<Notification> findByCategorieNotificationCode(@PathVariable String code){
        return notificationService.findByCategorieNotificationCode(code);
        }

        @ApiOperation("delete by categorieNotification code")
        @DeleteMapping("/categorieNotification/code/{code}")
        public int deleteByCategorieNotificationCode(@PathVariable String code){
        return notificationService.deleteByCategorieNotificationCode(code);
        }

        @ApiOperation("find by categorieNotification id")
        @GetMapping("/categorieNotification/id/{id}")
        public List<Notification> findByCategorieNotificationId(@PathVariable Long id){
        return notificationService.findByCategorieNotificationId(id);
        }

        @ApiOperation("delete by categorieNotification id")
        @DeleteMapping("/categorieNotification/id/{id}")
        public int deleteByCategorieNotificationId(@PathVariable Long id){
        return notificationService.deleteByCategorieNotificationId(id);
        }



            }
