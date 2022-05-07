package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CampagneRappel;
import com.ird.faa.ws.rest.provided.vo.CampagneRappelVo;

@Component
public class CampagneRappelConverter extends AbstractConverter<CampagneRappel,CampagneRappelVo>{

        @Autowired
        private CampagneRappelChercheurConverter campagneRappelChercheurConverter ;
        @Autowired
        private TemplateRappelConverter templateRappelConverter ;
        @Autowired
        private CampagneConverter campagneConverter ;
    private Boolean campagne;
    private Boolean templateRappel;
        private Boolean campagneRappelChercheurs;

public  CampagneRappelConverter(){
init(true);
}

@Override
public CampagneRappel toItem(CampagneRappelVo vo) {
if (vo == null) {
return null;
} else {
CampagneRappel item = new CampagneRappel();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getDateRappel()))
        item.setDateRappel(DateUtil.parse(vo.getDateRappel()));
        if(StringUtil.isNotEmpty(vo.getObjetRappel()))
        item.setObjetRappel(vo.getObjetRappel());
        if(StringUtil.isNotEmpty(vo.getMessageRappel()))
        item.setMessageRappel(vo.getMessageRappel());
    if(vo.getCampagneVo()!=null && this.campagne)
        item.setCampagne(campagneConverter.toItem(vo.getCampagneVo())) ;
    if(vo.getTemplateRappelVo()!=null && this.templateRappel)
        item.setTemplateRappel(templateRappelConverter.toItem(vo.getTemplateRappelVo())) ;

    if(ListUtil.isNotEmpty(vo.getCampagneRappelChercheursVo()) && this.campagneRappelChercheurs)
        item.setCampagneRappelChercheurs(campagneRappelChercheurConverter.toItem(vo.getCampagneRappelChercheursVo()));

return item;
}
}

@Override
public CampagneRappelVo toVo(CampagneRappel item) {
if (item == null) {
return null;
} else {
CampagneRappelVo vo = new CampagneRappelVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getDateRappel()!=null)
        vo.setDateRappel(DateUtil.formateDate(item.getDateRappel()));
        if(StringUtil.isNotEmpty(item.getObjetRappel()))
        vo.setObjetRappel(item.getObjetRappel());

        if(StringUtil.isNotEmpty(item.getMessageRappel()))
        vo.setMessageRappel(item.getMessageRappel());

    if(item.getCampagne()!=null && this.campagne) {
        vo.setCampagneVo(campagneConverter.toVo(item.getCampagne())) ;
    }
    if(item.getTemplateRappel()!=null && this.templateRappel) {
        vo.setTemplateRappelVo(templateRappelConverter.toVo(item.getTemplateRappel())) ;
    }
        if(ListUtil.isNotEmpty(item.getCampagneRappelChercheurs()) && this.campagneRappelChercheurs){
        campagneRappelChercheurConverter.init(true);
        campagneRappelChercheurConverter.setCampagneRappel(false);
        vo.setCampagneRappelChercheursVo(campagneRappelChercheurConverter.toVo(item.getCampagneRappelChercheurs()));
        campagneRappelChercheurConverter.setCampagneRappel(true);
        }

return vo;
}
}

public void init(Boolean value) {
    campagne = value;
    templateRappel = value;
        campagneRappelChercheurs = value;
}


        public CampagneRappelChercheurConverter getCampagneRappelChercheurConverter(){
        return this.campagneRappelChercheurConverter;
        }
        public void setCampagneRappelChercheurConverter(CampagneRappelChercheurConverter campagneRappelChercheurConverter ){
        this.campagneRappelChercheurConverter = campagneRappelChercheurConverter;
        }
        public TemplateRappelConverter getTemplateRappelConverter(){
        return this.templateRappelConverter;
        }
        public void setTemplateRappelConverter(TemplateRappelConverter templateRappelConverter ){
        this.templateRappelConverter = templateRappelConverter;
        }
        public CampagneConverter getCampagneConverter(){
        return this.campagneConverter;
        }
        public void setCampagneConverter(CampagneConverter campagneConverter ){
        this.campagneConverter = campagneConverter;
        }

    public boolean  isCampagne(){
    return this.campagne;
    }
    public void  setCampagne(boolean campagne){
    this.campagne = campagne;
    }
    public boolean  isTemplateRappel(){
    return this.templateRappel;
    }
    public void  setTemplateRappel(boolean templateRappel){
    this.templateRappel = templateRappel;
    }













        public Boolean  isCampagneRappelChercheurs(){
        return this.campagneRappelChercheurs ;
        }
        public void  setCampagneRappelChercheurs(Boolean campagneRappelChercheurs ){
        this.campagneRappelChercheurs  = campagneRappelChercheurs ;
        }


}
