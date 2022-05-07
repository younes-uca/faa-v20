package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.FormatRencontreAdminService;

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
import com.ird.faa.bean.FormatRencontre;
import com.ird.faa.ws.rest.provided.converter.FormatRencontreConverter;
import com.ird.faa.ws.rest.provided.vo.FormatRencontreVo;

@Api("Manages formatRencontre services")
@RestController
@RequestMapping("api/admin/formatRencontre")
public class FormatRencontreRestAdmin {

@Autowired
private FormatRencontreAdminService formatRencontreService;

@Autowired
private FormatRencontreConverter formatRencontreConverter;


            @ApiOperation("Updates the specified  formatRencontre")
            @PutMapping("/")
            public  FormatRencontreVo update(@RequestBody  FormatRencontreVo  formatRencontreVo){
            FormatRencontre formatRencontre = formatRencontreConverter.toItem(formatRencontreVo);
            formatRencontre = formatRencontreService.update(formatRencontre);
            return formatRencontreConverter.toVo(formatRencontre);
            }

    @ApiOperation("Finds a list of all formatRencontres")
    @GetMapping("/")
    public List<FormatRencontreVo> findAll(){
        return formatRencontreConverter.toVo(formatRencontreService.findAll());
    }

    @ApiOperation("Finds a formatRencontre with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public FormatRencontreVo findByIdWithAssociatedList(@PathVariable Long id){
    return formatRencontreConverter.toVo(formatRencontreService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search formatRencontre by a specific criteria")
    @PostMapping("/search")
    public List<FormatRencontreVo> findByCriteria(@RequestBody FormatRencontreVo formatRencontreVo){
        return formatRencontreConverter.toVo(formatRencontreService.findByCriteria(formatRencontreVo));
        }

            @ApiOperation("Finds a formatRencontre by id")
            @GetMapping("/id/{id}")
            public FormatRencontreVo findById(@PathVariable Long id){
            return formatRencontreConverter.toVo(formatRencontreService.findById(id));
            }

            @ApiOperation("Saves the specified  formatRencontre")
            @PostMapping("/")
            public FormatRencontreVo save(@RequestBody FormatRencontreVo formatRencontreVo){
            FormatRencontre formatRencontre = formatRencontreConverter.toItem(formatRencontreVo);
            formatRencontre = formatRencontreService.save(formatRencontre);
            return formatRencontreConverter.toVo(formatRencontre);
            }

            @ApiOperation("Delete the specified formatRencontre")
            @DeleteMapping("/")
            public int delete(@RequestBody FormatRencontreVo formatRencontreVo){
            FormatRencontre formatRencontre = formatRencontreConverter.toItem(formatRencontreVo);
            return formatRencontreService.delete(formatRencontre);
            }

            @ApiOperation("Deletes a formatRencontre by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return formatRencontreService.deleteById(id);
            }


            @PutMapping("/archiver/")
            public FormatRencontreVo archiver(@RequestBody FormatRencontreVo formatRencontreVo){
                FormatRencontre formatRencontre = formatRencontreService.archiver(formatRencontreConverter.toItem(formatRencontreVo));
                return formatRencontreConverter.toVo(formatRencontre);
                }

            @PutMapping("/desarchiver/")
            public FormatRencontreVo desarchiver(@RequestBody FormatRencontreVo formatRencontreVo){
                FormatRencontre formatRencontre = formatRencontreService.desarchiver(formatRencontreConverter.toItem(formatRencontreVo));
                return formatRencontreConverter.toVo(formatRencontre);}
            }
