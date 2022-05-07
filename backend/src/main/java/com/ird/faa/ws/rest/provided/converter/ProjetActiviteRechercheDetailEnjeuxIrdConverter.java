package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ProjetActiviteRechercheDetailEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailEnjeuxIrdVo;

@Component
public class ProjetActiviteRechercheDetailEnjeuxIrdConverter extends AbstractConverter<ProjetActiviteRechercheDetailEnjeuxIrd,ProjetActiviteRechercheDetailEnjeuxIrdVo>{

        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
        @Autowired
        private ProjetActiviteRechercheDetailConverter projetActiviteRechercheDetailConverter ;
    private Boolean enjeuxIrd;
    private Boolean projetActiviteRechercheDetail;

public  ProjetActiviteRechercheDetailEnjeuxIrdConverter(){
init(true);
}

@Override
public ProjetActiviteRechercheDetailEnjeuxIrd toItem(ProjetActiviteRechercheDetailEnjeuxIrdVo vo) {
if (vo == null) {
return null;
} else {
ProjetActiviteRechercheDetailEnjeuxIrd item = new ProjetActiviteRechercheDetailEnjeuxIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;
    if(vo.getProjetActiviteRechercheDetailVo()!=null && this.projetActiviteRechercheDetail)
        item.setProjetActiviteRechercheDetail(projetActiviteRechercheDetailConverter.toItem(vo.getProjetActiviteRechercheDetailVo())) ;


return item;
}
}

@Override
public ProjetActiviteRechercheDetailEnjeuxIrdVo toVo(ProjetActiviteRechercheDetailEnjeuxIrd item) {
if (item == null) {
return null;
} else {
ProjetActiviteRechercheDetailEnjeuxIrdVo vo = new ProjetActiviteRechercheDetailEnjeuxIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }
    if(item.getProjetActiviteRechercheDetail()!=null && this.projetActiviteRechercheDetail) {
        vo.setProjetActiviteRechercheDetailVo(projetActiviteRechercheDetailConverter.toVo(item.getProjetActiviteRechercheDetail())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    enjeuxIrd = value;
    projetActiviteRechercheDetail = value;
}


        public EnjeuxIrdConverter getEnjeuxIrdConverter(){
        return this.enjeuxIrdConverter;
        }
        public void setEnjeuxIrdConverter(EnjeuxIrdConverter enjeuxIrdConverter ){
        this.enjeuxIrdConverter = enjeuxIrdConverter;
        }
        public ProjetActiviteRechercheDetailConverter getProjetActiviteRechercheDetailConverter(){
        return this.projetActiviteRechercheDetailConverter;
        }
        public void setProjetActiviteRechercheDetailConverter(ProjetActiviteRechercheDetailConverter projetActiviteRechercheDetailConverter ){
        this.projetActiviteRechercheDetailConverter = projetActiviteRechercheDetailConverter;
        }

    public boolean  isEnjeuxIrd(){
    return this.enjeuxIrd;
    }
    public void  setEnjeuxIrd(boolean enjeuxIrd){
    this.enjeuxIrd = enjeuxIrd;
    }
    public boolean  isProjetActiviteRechercheDetail(){
    return this.projetActiviteRechercheDetail;
    }
    public void  setProjetActiviteRechercheDetail(boolean projetActiviteRechercheDetail){
    this.projetActiviteRechercheDetail = projetActiviteRechercheDetail;
    }






}
