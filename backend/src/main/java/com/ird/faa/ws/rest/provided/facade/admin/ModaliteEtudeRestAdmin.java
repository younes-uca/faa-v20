package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.ModaliteEtudeAdminService;

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
import com.ird.faa.bean.ModaliteEtude;
import com.ird.faa.ws.rest.provided.converter.ModaliteEtudeConverter;
import com.ird.faa.ws.rest.provided.vo.ModaliteEtudeVo;

@Api("Manages modaliteEtude services")
@RestController
@RequestMapping("api/admin/modaliteEtude")
public class ModaliteEtudeRestAdmin {

@Autowired
private ModaliteEtudeAdminService modaliteEtudeService;

@Autowired
private ModaliteEtudeConverter modaliteEtudeConverter;


            @ApiOperation("Updates the specified  modaliteEtude")
            @PutMapping("/")
            public  ModaliteEtudeVo update(@RequestBody  ModaliteEtudeVo  modaliteEtudeVo){
            ModaliteEtude modaliteEtude = modaliteEtudeConverter.toItem(modaliteEtudeVo);
            modaliteEtude = modaliteEtudeService.update(modaliteEtude);
            return modaliteEtudeConverter.toVo(modaliteEtude);
            }

    @ApiOperation("Finds a list of all modaliteEtudes")
    @GetMapping("/")
    public List<ModaliteEtudeVo> findAll(){
        return modaliteEtudeConverter.toVo(modaliteEtudeService.findAll());
    }

    @ApiOperation("Finds a modaliteEtude with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ModaliteEtudeVo findByIdWithAssociatedList(@PathVariable Long id){
    return modaliteEtudeConverter.toVo(modaliteEtudeService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search modaliteEtude by a specific criteria")
    @PostMapping("/search")
    public List<ModaliteEtudeVo> findByCriteria(@RequestBody ModaliteEtudeVo modaliteEtudeVo){
        return modaliteEtudeConverter.toVo(modaliteEtudeService.findByCriteria(modaliteEtudeVo));
        }

            @ApiOperation("Finds a modaliteEtude by id")
            @GetMapping("/id/{id}")
            public ModaliteEtudeVo findById(@PathVariable Long id){
            return modaliteEtudeConverter.toVo(modaliteEtudeService.findById(id));
            }

            @ApiOperation("Saves the specified  modaliteEtude")
            @PostMapping("/")
            public ModaliteEtudeVo save(@RequestBody ModaliteEtudeVo modaliteEtudeVo){
            ModaliteEtude modaliteEtude = modaliteEtudeConverter.toItem(modaliteEtudeVo);
            modaliteEtude = modaliteEtudeService.save(modaliteEtude);
            return modaliteEtudeConverter.toVo(modaliteEtude);
            }

            @ApiOperation("Delete the specified modaliteEtude")
            @DeleteMapping("/")
            public int delete(@RequestBody ModaliteEtudeVo modaliteEtudeVo){
            ModaliteEtude modaliteEtude = modaliteEtudeConverter.toItem(modaliteEtudeVo);
            return modaliteEtudeService.delete(modaliteEtude);
            }

            @ApiOperation("Deletes a modaliteEtude by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return modaliteEtudeService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public ModaliteEtudeVo archiver(@RequestBody ModaliteEtudeVo modaliteEtudeVo){
                ModaliteEtude modaliteEtude = modaliteEtudeService.archiver(modaliteEtudeConverter.toItem(modaliteEtudeVo));
                return modaliteEtudeConverter.toVo(modaliteEtude);
                }

            @PutMapping("/desarchiver/")
            public ModaliteEtudeVo desarchiver(@RequestBody ModaliteEtudeVo modaliteEtudeVo){
                ModaliteEtude modaliteEtude = modaliteEtudeService.desarchiver(modaliteEtudeConverter.toItem(modaliteEtudeVo));
                return modaliteEtudeConverter.toVo(modaliteEtude);}
            }
