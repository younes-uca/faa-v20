package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ChercheurEmail;
import com.ird.faa.ws.rest.provided.vo.ChercheurEmailVo;

@Component
public class ChercheurEmailConverter extends AbstractConverter<ChercheurEmail,ChercheurEmailVo>{

        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean chercheur;

public  ChercheurEmailConverter(){
init(true);
}

@Override
public ChercheurEmail toItem(ChercheurEmailVo vo) {
if (vo == null) {
return null;
} else {
ChercheurEmail item = new ChercheurEmail();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getEmail()))
        item.setEmail(vo.getEmail());
            if(vo.getPrincipale() != null)
            item.setPrincipale(vo.getPrincipale());
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;


return item;
}
}

@Override
public ChercheurEmailVo toVo(ChercheurEmail item) {
if (item == null) {
return null;
} else {
ChercheurEmailVo vo = new ChercheurEmailVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getEmail()))
        vo.setEmail(item.getEmail());

        if(item.getPrincipale()!=null)
        vo.setPrincipale(item.getPrincipale());
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    chercheur = value;
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








}
