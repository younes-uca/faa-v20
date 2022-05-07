package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CommunauteSavoirChercheur;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirChercheurVo;

@Component
public class CommunauteSavoirChercheurConverter extends AbstractConverter<CommunauteSavoirChercheur,CommunauteSavoirChercheurVo>{

        @Autowired
        private CommunauteSavoirConverter communauteSavoirConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean communauteSavoir;
    private Boolean chercheur;

public  CommunauteSavoirChercheurConverter(){
init(true);
}

@Override
public CommunauteSavoirChercheur toItem(CommunauteSavoirChercheurVo vo) {
if (vo == null) {
return null;
} else {
CommunauteSavoirChercheur item = new CommunauteSavoirChercheur();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getCommunauteSavoirVo()!=null && this.communauteSavoir)
        item.setCommunauteSavoir(communauteSavoirConverter.toItem(vo.getCommunauteSavoirVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;


return item;
}
}

@Override
public CommunauteSavoirChercheurVo toVo(CommunauteSavoirChercheur item) {
if (item == null) {
return null;
} else {
CommunauteSavoirChercheurVo vo = new CommunauteSavoirChercheurVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getCommunauteSavoir()!=null && this.communauteSavoir) {
        vo.setCommunauteSavoirVo(communauteSavoirConverter.toVo(item.getCommunauteSavoir())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    communauteSavoir = value;
    chercheur = value;
}


        public CommunauteSavoirConverter getCommunauteSavoirConverter(){
        return this.communauteSavoirConverter;
        }
        public void setCommunauteSavoirConverter(CommunauteSavoirConverter communauteSavoirConverter ){
        this.communauteSavoirConverter = communauteSavoirConverter;
        }
        public ChercheurConverter getChercheurConverter(){
        return this.chercheurConverter;
        }
        public void setChercheurConverter(ChercheurConverter chercheurConverter ){
        this.chercheurConverter = chercheurConverter;
        }

    public boolean  isCommunauteSavoir(){
    return this.communauteSavoir;
    }
    public void  setCommunauteSavoir(boolean communauteSavoir){
    this.communauteSavoir = communauteSavoir;
    }
    public boolean  isChercheur(){
    return this.chercheur;
    }
    public void  setChercheur(boolean chercheur){
    this.chercheur = chercheur;
    }






}
