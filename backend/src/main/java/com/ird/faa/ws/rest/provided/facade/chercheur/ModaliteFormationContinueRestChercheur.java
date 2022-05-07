package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ModaliteFormationContinueChercheurService;

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
import com.ird.faa.bean.ModaliteFormationContinue;
import com.ird.faa.ws.rest.provided.converter.ModaliteFormationContinueConverter;
import com.ird.faa.ws.rest.provided.vo.ModaliteFormationContinueVo;

@Api("Manages modaliteFormationContinue services")
@RestController
@RequestMapping("api/chercheur/modaliteFormationContinue")
public class ModaliteFormationContinueRestChercheur {

@Autowired
private ModaliteFormationContinueChercheurService modaliteFormationContinueService;

@Autowired
private ModaliteFormationContinueConverter modaliteFormationContinueConverter;


            @ApiOperation("Updates the specified  modaliteFormationContinue")
            @PutMapping("/")
            public  ModaliteFormationContinueVo update(@RequestBody  ModaliteFormationContinueVo  modaliteFormationContinueVo){
            ModaliteFormationContinue modaliteFormationContinue = modaliteFormationContinueConverter.toItem(modaliteFormationContinueVo);
            modaliteFormationContinue = modaliteFormationContinueService.update(modaliteFormationContinue);
            return modaliteFormationContinueConverter.toVo(modaliteFormationContinue);
            }

    @ApiOperation("Finds a list of all modaliteFormationContinues")
    @GetMapping("/")
    public List<ModaliteFormationContinueVo> findAll(){
        return modaliteFormationContinueConverter.toVo(modaliteFormationContinueService.findAll());
    }

    @ApiOperation("Finds a modaliteFormationContinue with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ModaliteFormationContinueVo findByIdWithAssociatedList(@PathVariable Long id){
    return modaliteFormationContinueConverter.toVo(modaliteFormationContinueService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search modaliteFormationContinue by a specific criteria")
    @PostMapping("/search")
    public List<ModaliteFormationContinueVo> findByCriteria(@RequestBody ModaliteFormationContinueVo modaliteFormationContinueVo){
        return modaliteFormationContinueConverter.toVo(modaliteFormationContinueService.findByCriteria(modaliteFormationContinueVo));
        }

            @ApiOperation("Finds a modaliteFormationContinue by id")
            @GetMapping("/id/{id}")
            public ModaliteFormationContinueVo findById(@PathVariable Long id){
            return modaliteFormationContinueConverter.toVo(modaliteFormationContinueService.findById(id));
            }

            @ApiOperation("Saves the specified  modaliteFormationContinue")
            @PostMapping("/")
            public ModaliteFormationContinueVo save(@RequestBody ModaliteFormationContinueVo modaliteFormationContinueVo){
            ModaliteFormationContinue modaliteFormationContinue = modaliteFormationContinueConverter.toItem(modaliteFormationContinueVo);
            modaliteFormationContinue = modaliteFormationContinueService.save(modaliteFormationContinue);
            return modaliteFormationContinueConverter.toVo(modaliteFormationContinue);
            }

            @ApiOperation("Delete the specified modaliteFormationContinue")
            @DeleteMapping("/")
            public int delete(@RequestBody ModaliteFormationContinueVo modaliteFormationContinueVo){
            ModaliteFormationContinue modaliteFormationContinue = modaliteFormationContinueConverter.toItem(modaliteFormationContinueVo);
            return modaliteFormationContinueService.delete(modaliteFormationContinue);
            }

            @ApiOperation("Deletes a modaliteFormationContinue by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return modaliteFormationContinueService.deleteById(id);
            }


            }
