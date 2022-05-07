package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CampagneRappelChercheur;
import com.ird.faa.ws.rest.provided.vo.CampagneRappelChercheurVo;

@Component
public class CampagneRappelChercheurConverter extends AbstractConverter<CampagneRappelChercheur,CampagneRappelChercheurVo>{

        @Autowired
        private CampagneRappelConverter campagneRappelConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean chercheur;
    private Boolean campagneRappel;

public  CampagneRappelChercheurConverter(){
init(true);
}

@Override
public CampagneRappelChercheur toItem(CampagneRappelChercheurVo vo) {
if (vo == null) {
return null;
} else {
CampagneRappelChercheur item = new CampagneRappelChercheur();
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
    if(vo.getCampagneRappelVo()!=null && this.campagneRappel)
        item.setCampagneRappel(campagneRappelConverter.toItem(vo.getCampagneRappelVo())) ;


return item;
}
}

@Override
public CampagneRappelChercheurVo toVo(CampagneRappelChercheur item) {
if (item == null) {
return null;
} else {
CampagneRappelChercheurVo vo = new CampagneRappelChercheurVo();
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
    if(item.getCampagneRappel()!=null && this.campagneRappel) {
        vo.setCampagneRappelVo(campagneRappelConverter.toVo(item.getCampagneRappel())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    chercheur = value;
    campagneRappel = value;
}


        public CampagneRappelConverter getCampagneRappelConverter(){
        return this.campagneRappelConverter;
        }
        public void setCampagneRappelConverter(CampagneRappelConverter campagneRappelConverter ){
        this.campagneRappelConverter = campagneRappelConverter;
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
    public boolean  isCampagneRappel(){
    return this.campagneRappel;
    }
    public void  setCampagneRappel(boolean campagneRappel){
    this.campagneRappel = campagneRappel;
    }














}
