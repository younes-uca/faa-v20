package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.ModaliteAdminService;

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
import com.ird.faa.bean.Modalite;
import com.ird.faa.ws.rest.provided.converter.ModaliteConverter;
import com.ird.faa.ws.rest.provided.vo.ModaliteVo;

@Api("Manages modalite services")
@RestController
@RequestMapping("api/admin/modalite")
public class ModaliteRestAdmin {

@Autowired
private ModaliteAdminService modaliteService;

@Autowired
private ModaliteConverter modaliteConverter;


            @ApiOperation("Updates the specified  modalite")
            @PutMapping("/")
            public  ModaliteVo update(@RequestBody  ModaliteVo  modaliteVo){
            Modalite modalite = modaliteConverter.toItem(modaliteVo);
            modalite = modaliteService.update(modalite);
            return modaliteConverter.toVo(modalite);
            }

    @ApiOperation("Finds a list of all modalites")
    @GetMapping("/")
    public List<ModaliteVo> findAll(){
        return modaliteConverter.toVo(modaliteService.findAll());
    }

    @ApiOperation("Finds a modalite with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ModaliteVo findByIdWithAssociatedList(@PathVariable Long id){
    return modaliteConverter.toVo(modaliteService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search modalite by a specific criteria")
    @PostMapping("/search")
    public List<ModaliteVo> findByCriteria(@RequestBody ModaliteVo modaliteVo){
        return modaliteConverter.toVo(modaliteService.findByCriteria(modaliteVo));
        }

            @ApiOperation("Finds a modalite by id")
            @GetMapping("/id/{id}")
            public ModaliteVo findById(@PathVariable Long id){
            return modaliteConverter.toVo(modaliteService.findById(id));
            }

            @ApiOperation("Saves the specified  modalite")
            @PostMapping("/")
            public ModaliteVo save(@RequestBody ModaliteVo modaliteVo){
            Modalite modalite = modaliteConverter.toItem(modaliteVo);
            modalite = modaliteService.save(modalite);
            return modaliteConverter.toVo(modalite);
            }

            @ApiOperation("Delete the specified modalite")
            @DeleteMapping("/")
            public int delete(@RequestBody ModaliteVo modaliteVo){
            Modalite modalite = modaliteConverter.toItem(modaliteVo);
            return modaliteService.delete(modalite);
            }

            @ApiOperation("Deletes a modalite by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return modaliteService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public ModaliteVo archiver(@RequestBody ModaliteVo modaliteVo){
                Modalite modalite = modaliteService.archiver(modaliteConverter.toItem(modaliteVo));
                return modaliteConverter.toVo(modalite);
                }

            @PutMapping("/desarchiver/")
            public ModaliteVo desarchiver(@RequestBody ModaliteVo modaliteVo){
                Modalite modalite = modaliteService.desarchiver(modaliteConverter.toItem(modaliteVo));
                return modaliteConverter.toVo(modalite);}
            }
