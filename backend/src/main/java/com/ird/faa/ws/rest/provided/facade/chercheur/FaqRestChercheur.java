package  com.ird.faa.ws.rest.provided.facade.chercheur;

import com.ird.faa.service.chercheur.facade.FaqChercheurService;

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
import com.ird.faa.bean.Faq;
import com.ird.faa.ws.rest.provided.converter.FaqConverter;
import com.ird.faa.ws.rest.provided.vo.FaqVo;

@Api("Manages faq services")
@RestController
@RequestMapping("api/chercheur/faq")
public class FaqRestChercheur {

@Autowired
private FaqChercheurService faqService;

@Autowired
private FaqConverter faqConverter;


            @ApiOperation("Updates the specified  faq")
            @PutMapping("/")
            public  FaqVo update(@RequestBody  FaqVo  faqVo){
            Faq faq = faqConverter.toItem(faqVo);
            faq = faqService.update(faq);
            return faqConverter.toVo(faq);
            }

    @ApiOperation("Finds a list of all faqs")
    @GetMapping("/")
    public List<FaqVo> findAll(){
        return faqConverter.toVo(faqService.findAll());
    }

    @ApiOperation("Finds a faq with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public FaqVo findByIdWithAssociatedList(@PathVariable Long id){
    return faqConverter.toVo(faqService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search faq by a specific criteria")
    @PostMapping("/search")
    public List<FaqVo> findByCriteria(@RequestBody FaqVo faqVo){
        return faqConverter.toVo(faqService.findByCriteria(faqVo));
        }

            @ApiOperation("Finds a faq by id")
            @GetMapping("/id/{id}")
            public FaqVo findById(@PathVariable Long id){
            return faqConverter.toVo(faqService.findById(id));
            }

            @ApiOperation("Saves the specified  faq")
            @PostMapping("/")
            public FaqVo save(@RequestBody FaqVo faqVo){
            Faq faq = faqConverter.toItem(faqVo);
            faq = faqService.save(faq);
            return faqConverter.toVo(faq);
            }

            @ApiOperation("Delete the specified faq")
            @DeleteMapping("/")
            public int delete(@RequestBody FaqVo faqVo){
            Faq faq = faqConverter.toItem(faqVo);
            return faqService.delete(faq);
            }

            @ApiOperation("Deletes a faq by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return faqService.deleteById(id);
            }
        @ApiOperation("find by categorieFaq ordre")
        @GetMapping("/categorieFaq/ordre/{ordre}")
        public List<Faq> findByCategorieFaqOrdre(@PathVariable Integer ordre){
        return faqService.findByCategorieFaqOrdre(ordre);
        }

        @ApiOperation("delete by categorieFaq ordre")
        @DeleteMapping("/categorieFaq/ordre/{ordre}")
        public int deleteByCategorieFaqOrdre(@PathVariable Integer ordre){
        return faqService.deleteByCategorieFaqOrdre(ordre);
        }

        @ApiOperation("find by categorieFaq id")
        @GetMapping("/categorieFaq/id/{id}")
        public List<Faq> findByCategorieFaqId(@PathVariable Long id){
        return faqService.findByCategorieFaqId(id);
        }

        @ApiOperation("delete by categorieFaq id")
        @DeleteMapping("/categorieFaq/id/{id}")
        public int deleteByCategorieFaqId(@PathVariable Long id){
        return faqService.deleteByCategorieFaqId(id);
        }



            }
