package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.ModaliteInterventionChercheurService;

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
import com.ird.faa.bean.ModaliteIntervention;
import com.ird.faa.ws.rest.provided.converter.ModaliteInterventionConverter;
import com.ird.faa.ws.rest.provided.vo.ModaliteInterventionVo;

@Api("Manages modaliteIntervention services")
@RestController
@RequestMapping("api/chercheur/modaliteIntervention")
public class ModaliteInterventionRestChercheur {

@Autowired
private ModaliteInterventionChercheurService modaliteInterventionService;

@Autowired
private ModaliteInterventionConverter modaliteInterventionConverter;


            @ApiOperation("Updates the specified  modaliteIntervention")
            @PutMapping("/")
            public  ModaliteInterventionVo update(@RequestBody  ModaliteInterventionVo  modaliteInterventionVo){
            ModaliteIntervention modaliteIntervention = modaliteInterventionConverter.toItem(modaliteInterventionVo);
            modaliteIntervention = modaliteInterventionService.update(modaliteIntervention);
            return modaliteInterventionConverter.toVo(modaliteIntervention);
            }

    @ApiOperation("Finds a list of all modaliteInterventions")
    @GetMapping("/")
    public List<ModaliteInterventionVo> findAll(){
        return modaliteInterventionConverter.toVo(modaliteInterventionService.findAll());
    }

    @ApiOperation("Finds a modaliteIntervention with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public ModaliteInterventionVo findByIdWithAssociatedList(@PathVariable Long id){
    return modaliteInterventionConverter.toVo(modaliteInterventionService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search modaliteIntervention by a specific criteria")
    @PostMapping("/search")
    public List<ModaliteInterventionVo> findByCriteria(@RequestBody ModaliteInterventionVo modaliteInterventionVo){
        return modaliteInterventionConverter.toVo(modaliteInterventionService.findByCriteria(modaliteInterventionVo));
        }

            @ApiOperation("Finds a modaliteIntervention by id")
            @GetMapping("/id/{id}")
            public ModaliteInterventionVo findById(@PathVariable Long id){
            return modaliteInterventionConverter.toVo(modaliteInterventionService.findById(id));
            }

            @ApiOperation("Saves the specified  modaliteIntervention")
            @PostMapping("/")
            public ModaliteInterventionVo save(@RequestBody ModaliteInterventionVo modaliteInterventionVo){
            ModaliteIntervention modaliteIntervention = modaliteInterventionConverter.toItem(modaliteInterventionVo);
            modaliteIntervention = modaliteInterventionService.save(modaliteIntervention);
            return modaliteInterventionConverter.toVo(modaliteIntervention);
            }

            @ApiOperation("Delete the specified modaliteIntervention")
            @DeleteMapping("/")
            public int delete(@RequestBody ModaliteInterventionVo modaliteInterventionVo){
            ModaliteIntervention modaliteIntervention = modaliteInterventionConverter.toItem(modaliteInterventionVo);
            return modaliteInterventionService.delete(modaliteIntervention);
            }

            @ApiOperation("Deletes a modaliteIntervention by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return modaliteInterventionService.deleteById(id);
            }


            }
