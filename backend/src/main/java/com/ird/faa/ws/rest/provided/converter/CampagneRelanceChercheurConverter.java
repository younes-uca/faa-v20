package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CampagneRelanceChercheur;
import com.ird.faa.ws.rest.provided.vo.CampagneRelanceChercheurVo;

@Component
public class CampagneRelanceChercheurConverter extends AbstractConverter<CampagneRelanceChercheur,CampagneRelanceChercheurVo>{

        @Autowired
        private CampagneRelanceConverter campagneRelanceConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean chercheur;
    private Boolean campagneRelance;

public  CampagneRelanceChercheurConverter(){
init(true);
}

@Override
public CampagneRelanceChercheur toItem(CampagneRelanceChercheurVo vo) {
if (vo == null) {
return null;
} else {
CampagneRelanceChercheur item = new CampagneRelanceChercheur();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getObjet()))
        item.setObjet(vo.getObjet());
        if(StringUtil.isNotEmpty(vo.getMessage()))
        item.setMessage(vo.getMessage());
            if(vo.getEnvoye() != null)
            item.setEnvoye(vo.getEnvoye());
        if(StringUtil.isNotEmpty(vo.getDateEnvoi()))
        item.setDateEnvoi(DateUtil.parse(vo.getDateEnvoi()));
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;
    if(vo.getCampagneRelanceVo()!=null && this.campagneRelance)
        item.setCampagneRelance(campagneRelanceConverter.toItem(vo.getCampagneRelanceVo())) ;


return item;
}
}

@Override
public CampagneRelanceChercheurVo toVo(CampagneRelanceChercheur item) {
if (item == null) {
return null;
} else {
CampagneRelanceChercheurVo vo = new CampagneRelanceChercheurVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getObjet()))
        vo.setObjet(item.getObjet());

        if(StringUtil.isNotEmpty(item.getMessage()))
        vo.setMessage(item.getMessage());

        if(item.getEnvoye()!=null)
        vo.setEnvoye(item.getEnvoye());
        if(item.getDateEnvoi()!=null)
        vo.setDateEnvoi(DateUtil.formateDate(item.getDateEnvoi()));
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }
    if(item.getCampagneRelance()!=null && this.campagneRelance) {
        vo.setCampagneRelanceVo(campagneRelanceConverter.toVo(item.getCampagneRelance())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    chercheur = value;
    campagneRelance = value;
}


        public CampagneRelanceConverter getCampagneRelanceConverter(){
        return this.campagneRelanceConverter;
        }
        public void setCampagneRelanceConverter(CampagneRelanceConverter campagneRelanceConverter ){
        this.campagneRelanceConverter = campagneRelanceConverter;
        }
        public ChercheurConverter getChercheurConverter(){
        return this.chercheurConverter;
        }
        public void setChercheurConverter(ChercheurConverter chercheurConverter ){
        this.chercheurConverter = chercheurConverter;
        }

    public boolean  isChercheur(){
    return this.chercheur;
    }
    public void  setChercheur(boolean chercheur){
    this.chercheur = chercheur;
    }
    public boolean  isCampagneRelance(){
    return this.campagneRelance;
    }
    public void  setCampagneRelance(boolean campagneRelance){
    this.campagneRelance = campagneRelance;
    }














}
