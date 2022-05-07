package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CommunauteSavoirEncadrementDoctorant;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirEncadrementDoctorantVo;

@Component
public class CommunauteSavoirEncadrementDoctorantConverter extends AbstractConverter<CommunauteSavoirEncadrementDoctorant,CommunauteSavoirEncadrementDoctorantVo>{

        @Autowired
        private EncadrementDoctorantConverter encadrementDoctorantConverter ;
        @Autowired
        private CommunauteSavoirConverter communauteSavoirConverter ;
    private Boolean communauteSavoir;
    private Boolean encadrementDoctorant;

public  CommunauteSavoirEncadrementDoctorantConverter(){
init(true);
}

@Override
public CommunauteSavoirEncadrementDoctorant toItem(CommunauteSavoirEncadrementDoctorantVo vo) {
if (vo == null) {
return null;
} else {
CommunauteSavoirEncadrementDoctorant item = new CommunauteSavoirEncadrementDoctorant();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getCommunauteSavoirVo()!=null && this.communauteSavoir)
        item.setCommunauteSavoir(communauteSavoirConverter.toItem(vo.getCommunauteSavoirVo())) ;
    if(vo.getEncadrementDoctorantVo()!=null && this.encadrementDoctorant)
        item.setEncadrementDoctorant(encadrementDoctorantConverter.toItem(vo.getEncadrementDoctorantVo())) ;


return item;
}
}

@Override
public CommunauteSavoirEncadrementDoctorantVo toVo(CommunauteSavoirEncadrementDoctorant item) {
if (item == null) {
return null;
} else {
CommunauteSavoirEncadrementDoctorantVo vo = new CommunauteSavoirEncadrementDoctorantVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getCommunauteSavoir()!=null && this.communauteSavoir) {
        vo.setCommunauteSavoirVo(communauteSavoirConverter.toVo(item.getCommunauteSavoir())) ;
    }
    if(item.getEncadrementDoctorant()!=null && this.encadrementDoctorant) {
        vo.setEncadrementDoctorantVo(encadrementDoctorantConverter.toVo(item.getEncadrementDoctorant())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    communauteSavoir = value;
    encadrementDoctorant = value;
}


        public EncadrementDoctorantConverter getEncadrementDoctorantConverter(){
        return this.encadrementDoctorantConverter;
        }
        public void setEncadrementDoctorantConverter(EncadrementDoctorantConverter encadrementDoctorantConverter ){
        this.encadrementDoctorantConverter = encadrementDoctorantConverter;
        }
        public CommunauteSavoirConverter getCommunauteSavoirConverter(){
        return this.communauteSavoirConverter;
        }
        public void setCommunauteSavoirConverter(CommunauteSavoirConverter communauteSavoirConverter ){
        this.communauteSavoirConverter = communauteSavoirConverter;
        }

    public boolean  isCommunauteSavoir(){
    return this.communauteSavoir;
    }
    public void  setCommunauteSavoir(boolean communauteSavoir){
    this.communauteSavoir = communauteSavoir;
    }
    public boolean  isEncadrementDoctorant(){
    return this.encadrementDoctorant;
    }
    public void  setEncadrementDoctorant(boolean encadrementDoctorant){
    this.encadrementDoctorant = encadrementDoctorant;
    }






}
