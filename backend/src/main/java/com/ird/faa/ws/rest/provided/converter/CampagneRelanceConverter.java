package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CampagneRelance;
import com.ird.faa.ws.rest.provided.vo.CampagneRelanceVo;

@Component
public class CampagneRelanceConverter extends AbstractConverter<CampagneRelance,CampagneRelanceVo>{

        @Autowired
        private CampagneRelanceChercheurConverter campagneRelanceChercheurConverter ;
        @Autowired
        private TemplateRelanceConverter templateRelanceConverter ;
        @Autowired
        private CampagneConverter campagneConverter ;
    private Boolean campagne;
    private Boolean templateRelance;
        private Boolean campagneRelanceChercheurs;

public  CampagneRelanceConverter(){
init(true);
}

@Override
public CampagneRelance toItem(CampagneRelanceVo vo) {
if (vo == null) {
return null;
} else {
CampagneRelance item = new CampagneRelance();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getDateRelance()))
        item.setDateRelance(DateUtil.parse(vo.getDateRelance()));
        if(StringUtil.isNotEmpty(vo.getObjetRelance()))
        item.setObjetRelance(vo.getObjetRelance());
        if(StringUtil.isNotEmpty(vo.getMessageRelance()))
        item.setMessageRelance(vo.getMessageRelance());
    if(vo.getCampagneVo()!=null && this.campagne)
        item.setCampagne(campagneConverter.toItem(vo.getCampagneVo())) ;
    if(vo.getTemplateRelanceVo()!=null && this.templateRelance)
        item.setTemplateRelance(templateRelanceConverter.toItem(vo.getTemplateRelanceVo())) ;

    if(ListUtil.isNotEmpty(vo.getCampagneRelanceChercheursVo()) && this.campagneRelanceChercheurs)
        item.setCampagneRelanceChercheurs(campagneRelanceChercheurConverter.toItem(vo.getCampagneRelanceChercheursVo()));

return item;
}
}

@Override
public CampagneRelanceVo toVo(CampagneRelance item) {
if (item == null) {
return null;
} else {
CampagneRelanceVo vo = new CampagneRelanceVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getDateRelance()!=null)
        vo.setDateRelance(DateUtil.formateDate(item.getDateRelance()));
        if(StringUtil.isNotEmpty(item.getObjetRelance()))
        vo.setObjetRelance(item.getObjetRelance());

        if(StringUtil.isNotEmpty(item.getMessageRelance()))
        vo.setMessageRelance(item.getMessageRelance());

    if(item.getCampagne()!=null && this.campagne) {
        vo.setCampagneVo(campagneConverter.toVo(item.getCampagne())) ;
    }
    if(item.getTemplateRelance()!=null && this.templateRelance) {
        vo.setTemplateRelanceVo(templateRelanceConverter.toVo(item.getTemplateRelance())) ;
    }
        if(ListUtil.isNotEmpty(item.getCampagneRelanceChercheurs()) && this.campagneRelanceChercheurs){
        campagneRelanceChercheurConverter.init(true);
        campagneRelanceChercheurConverter.setCampagneRelance(false);
        vo.setCampagneRelanceChercheursVo(campagneRelanceChercheurConverter.toVo(item.getCampagneRelanceChercheurs()));
        campagneRelanceChercheurConverter.setCampagneRelance(true);
        }

return vo;
}
}

public void init(Boolean value) {
    campagne = value;
    templateRelance = value;
        campagneRelanceChercheurs = value;
}


        public CampagneRelanceChercheurConverter getCampagneRelanceChercheurConverter(){
        return this.campagneRelanceChercheurConverter;
        }
        public void setCampagneRelanceChercheurConverter(CampagneRelanceChercheurConverter campagneRelanceChercheurConverter ){
        this.campagneRelanceChercheurConverter = campagneRelanceChercheurConverter;
        }
        public TemplateRelanceConverter getTemplateRelanceConverter(){
        return this.templateRelanceConverter;
        }
        public void setTemplateRelanceConverter(TemplateRelanceConverter templateRelanceConverter ){
        this.templateRelanceConverter = templateRelanceConverter;
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
    public boolean  isTemplateRelance(){
    return this.templateRelance;
    }
    public void  setTemplateRelance(boolean templateRelance){
    this.templateRelance = templateRelance;
    }













        public Boolean  isCampagneRelanceChercheurs(){
        return this.campagneRelanceChercheurs ;
        }
        public void  setCampagneRelanceChercheurs(Boolean campagneRelanceChercheurs ){
        this.campagneRelanceChercheurs  = campagneRelanceChercheurs ;
        }


}
