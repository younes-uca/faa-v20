package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.Faq;
import com.ird.faa.ws.rest.provided.vo.FaqVo;

@Component
public class FaqConverter extends AbstractConverter<Faq,FaqVo>{

        @Autowired
        private CategorieFaqConverter categorieFaqConverter ;
    private Boolean categorieFaq;

public  FaqConverter(){
init(true);
}

@Override
public Faq toItem(FaqVo vo) {
if (vo == null) {
return null;
} else {
Faq item = new Faq();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getQuestion()))
        item.setQuestion(vo.getQuestion());
        if(StringUtil.isNotEmpty(vo.getReponse()))
        item.setReponse(vo.getReponse());
        if(StringUtil.isNotEmpty(vo.getContact()))
        item.setContact(vo.getContact());
        if(StringUtil.isNotEmpty(vo.getOrdre()))
        item.setOrdre(NumberUtil.toInt(vo.getOrdre()));
            if(vo.getArchive() != null)
            item.setArchive(vo.getArchive());
        if(StringUtil.isNotEmpty(vo.getLien()))
        item.setLien(vo.getLien());
        if(StringUtil.isNotEmpty(vo.getDernierMisAJour()))
        item.setDernierMisAJour(DateUtil.parse(vo.getDernierMisAJour()));
    if(vo.getCategorieFaqVo()!=null && this.categorieFaq)
        item.setCategorieFaq(categorieFaqConverter.toItem(vo.getCategorieFaqVo())) ;


return item;
}
}

@Override
public FaqVo toVo(Faq item) {
if (item == null) {
return null;
} else {
FaqVo vo = new FaqVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getQuestion()))
        vo.setQuestion(item.getQuestion());

        if(StringUtil.isNotEmpty(item.getReponse()))
        vo.setReponse(item.getReponse());

        if(StringUtil.isNotEmpty(item.getContact()))
        vo.setContact(item.getContact());

        if(item.getOrdre()!=null)
        vo.setOrdre(NumberUtil.toString(item.getOrdre()));

        if(item.getArchive()!=null)
        vo.setArchive(item.getArchive());
        if(StringUtil.isNotEmpty(item.getLien()))
        vo.setLien(item.getLien());

        if(item.getDernierMisAJour()!=null)
        vo.setDernierMisAJour(DateUtil.formateDate(item.getDernierMisAJour()));
    if(item.getCategorieFaq()!=null && this.categorieFaq) {
        vo.setCategorieFaqVo(categorieFaqConverter.toVo(item.getCategorieFaq())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    categorieFaq = value;
}


        public CategorieFaqConverter getCategorieFaqConverter(){
        return this.categorieFaqConverter;
        }
        public void setCategorieFaqConverter(CategorieFaqConverter categorieFaqConverter ){
        this.categorieFaqConverter = categorieFaqConverter;
        }

    public boolean  isCategorieFaq(){
    return this.categorieFaq;
    }
    public void  setCategorieFaq(boolean categorieFaq){
    this.categorieFaq = categorieFaq;
    }


















}
