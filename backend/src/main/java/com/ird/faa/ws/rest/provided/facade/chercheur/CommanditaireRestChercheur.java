package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.CommanditaireChercheurService;

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
import com.ird.faa.bean.Commanditaire;
import com.ird.faa.ws.rest.provided.converter.CommanditaireConverter;
import com.ird.faa.ws.rest.provided.vo.CommanditaireVo;

@Api("Manages commanditaire services")
@RestController
@RequestMapping("api/chercheur/commanditaire")
public class CommanditaireRestChercheur {

@Autowired
private CommanditaireChercheurService commanditaireService;

@Autowired
private CommanditaireConverter commanditaireConverter;


            @ApiOperation("Updates the specified  commanditaire")
            @PutMapping("/")
            public  CommanditaireVo update(@RequestBody  CommanditaireVo  commanditaireVo){
            Commanditaire commanditaire = commanditaireConverter.toItem(commanditaireVo);
            commanditaire = commanditaireService.update(commanditaire);
            return commanditaireConverter.toVo(commanditaire);
            }

    @ApiOperation("Finds a list of all commanditaires")
    @GetMapping("/")
    public List<CommanditaireVo> findAll(){
        return commanditaireConverter.toVo(commanditaireService.findAll());
    }

    @ApiOperation("Finds a commanditaire with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public CommanditaireVo findByIdWithAssociatedList(@PathVariable Long id){
    return commanditaireConverter.toVo(commanditaireService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search commanditaire by a specific criteria")
    @PostMapping("/search")
    public List<CommanditaireVo> findByCriteria(@RequestBody CommanditaireVo commanditaireVo){
        return commanditaireConverter.toVo(commanditaireService.findByCriteria(commanditaireVo));
        }

            @ApiOperation("Finds a commanditaire by id")
            @GetMapping("/id/{id}")
            public CommanditaireVo findById(@PathVariable Long id){
            return commanditaireConverter.toVo(commanditaireService.findById(id));
            }

            @ApiOperation("Saves the specified  commanditaire")
            @PostMapping("/")
            public CommanditaireVo save(@RequestBody CommanditaireVo commanditaireVo){
            Commanditaire commanditaire = commanditaireConverter.toItem(commanditaireVo);
            commanditaire = commanditaireService.save(commanditaire);
            return commanditaireConverter.toVo(commanditaire);
            }

            @ApiOperation("Delete the specified commanditaire")
            @DeleteMapping("/")
            public int delete(@RequestBody CommanditaireVo commanditaireVo){
            Commanditaire commanditaire = commanditaireConverter.toItem(commanditaireVo);
            return commanditaireService.delete(commanditaire);
            }

            @ApiOperation("Deletes a commanditaire by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return commanditaireService.deleteById(id);
            }
        @ApiOperation("find by pays code")
        @GetMapping("/pays/code/{code}")
        public List<Commanditaire> findByPaysCode(@PathVariable String code){
        return commanditaireService.findByPaysCode(code);
        }

        @ApiOperation("delete by pays code")
        @DeleteMapping("/pays/code/{code}")
        public int deleteByPaysCode(@PathVariable String code){
        return commanditaireService.deleteByPaysCode(code);
        }

        @ApiOperation("find by pays id")
        @GetMapping("/pays/id/{id}")
        public List<Commanditaire> findByPaysId(@PathVariable Long id){
        return commanditaireService.findByPaysId(id);
        }

        @ApiOperation("delete by pays id")
        @DeleteMapping("/pays/id/{id}")
        public int deleteByPaysId(@PathVariable Long id){
        return commanditaireService.deleteByPaysId(id);
        }



            }
