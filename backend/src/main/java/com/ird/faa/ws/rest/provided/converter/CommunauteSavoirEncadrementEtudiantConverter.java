package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CommunauteSavoirEncadrementEtudiant;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirEncadrementEtudiantVo;

@Component
public class CommunauteSavoirEncadrementEtudiantConverter extends AbstractConverter<CommunauteSavoirEncadrementEtudiant,CommunauteSavoirEncadrementEtudiantVo>{

        @Autowired
        private EncadrementEtudiantConverter encadrementEtudiantConverter ;
        @Autowired
        private CommunauteSavoirConverter communauteSavoirConverter ;
    private Boolean communauteSavoir;
    private Boolean encadrementEtudiant;

public  CommunauteSavoirEncadrementEtudiantConverter(){
init(true);
}

@Override
public CommunauteSavoirEncadrementEtudiant toItem(CommunauteSavoirEncadrementEtudiantVo vo) {
if (vo == null) {
return null;
} else {
CommunauteSavoirEncadrementEtudiant item = new CommunauteSavoirEncadrementEtudiant();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getCommunauteSavoirVo()!=null && this.communauteSavoir)
        item.setCommunauteSavoir(communauteSavoirConverter.toItem(vo.getCommunauteSavoirVo())) ;
    if(vo.getEncadrementEtudiantVo()!=null && this.encadrementEtudiant)
        item.setEncadrementEtudiant(encadrementEtudiantConverter.toItem(vo.getEncadrementEtudiantVo())) ;


return item;
}
}

@Override
public CommunauteSavoirEncadrementEtudiantVo toVo(CommunauteSavoirEncadrementEtudiant item) {
if (item == null) {
return null;
} else {
CommunauteSavoirEncadrementEtudiantVo vo = new CommunauteSavoirEncadrementEtudiantVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getCommunauteSavoir()!=null && this.communauteSavoir) {
        vo.setCommunauteSavoirVo(communauteSavoirConverter.toVo(item.getCommunauteSavoir())) ;
    }
    if(item.getEncadrementEtudiant()!=null && this.encadrementEtudiant) {
        vo.setEncadrementEtudiantVo(encadrementEtudiantConverter.toVo(item.getEncadrementEtudiant())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    communauteSavoir = value;
    encadrementEtudiant = value;
}


        public EncadrementEtudiantConverter getEncadrementEtudiantConverter(){
        return this.encadrementEtudiantConverter;
        }
        public void setEncadrementEtudiantConverter(EncadrementEtudiantConverter encadrementEtudiantConverter ){
        this.encadrementEtudiantConverter = encadrementEtudiantConverter;
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
    public boolean  isEncadrementEtudiant(){
    return this.encadrementEtudiant;
    }
    public void  setEncadrementEtudiant(boolean encadrementEtudiant){
    this.encadrementEtudiant = encadrementEtudiant;
    }






}
