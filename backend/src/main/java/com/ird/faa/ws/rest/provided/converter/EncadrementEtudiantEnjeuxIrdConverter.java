package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EncadrementEtudiantEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.EncadrementEtudiantEnjeuxIrdVo;

@Component
public class EncadrementEtudiantEnjeuxIrdConverter extends AbstractConverter<EncadrementEtudiantEnjeuxIrd,EncadrementEtudiantEnjeuxIrdVo>{

        @Autowired
        private EncadrementEtudiantConverter encadrementEtudiantConverter ;
        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
    private Boolean encadrementEtudiant;
    private Boolean enjeuxIrd;

public  EncadrementEtudiantEnjeuxIrdConverter(){
init(true);
}

@Override
public EncadrementEtudiantEnjeuxIrd toItem(EncadrementEtudiantEnjeuxIrdVo vo) {
if (vo == null) {
return null;
} else {
EncadrementEtudiantEnjeuxIrd item = new EncadrementEtudiantEnjeuxIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEncadrementEtudiantVo()!=null && this.encadrementEtudiant)
        item.setEncadrementEtudiant(encadrementEtudiantConverter.toItem(vo.getEncadrementEtudiantVo())) ;
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;


return item;
}
}

@Override
public EncadrementEtudiantEnjeuxIrdVo toVo(EncadrementEtudiantEnjeuxIrd item) {
if (item == null) {
return null;
} else {
EncadrementEtudiantEnjeuxIrdVo vo = new EncadrementEtudiantEnjeuxIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEncadrementEtudiant()!=null && this.encadrementEtudiant) {
        vo.setEncadrementEtudiantVo(encadrementEtudiantConverter.toVo(item.getEncadrementEtudiant())) ;
    }
    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    encadrementEtudiant = value;
    enjeuxIrd = value;
}


        public EncadrementEtudiantConverter getEncadrementEtudiantConverter(){
        return this.encadrementEtudiantConverter;
        }
        public void setEncadrementEtudiantConverter(EncadrementEtudiantConverter encadrementEtudiantConverter ){
        this.encadrementEtudiantConverter = encadrementEtudiantConverter;
        }
        public EnjeuxIrdConverter getEnjeuxIrdConverter(){
        return this.enjeuxIrdConverter;
        }
        public void setEnjeuxIrdConverter(EnjeuxIrdConverter enjeuxIrdConverter ){
        this.enjeuxIrdConverter = enjeuxIrdConverter;
        }

    public boolean  isEncadrementEtudiant(){
    return this.encadrementEtudiant;
    }
    public void  setEncadrementEtudiant(boolean encadrementEtudiant){
    this.encadrementEtudiant = encadrementEtudiant;
    }
    public boolean  isEnjeuxIrd(){
    return this.enjeuxIrd;
    }
    public void  setEnjeuxIrd(boolean enjeuxIrd){
    this.enjeuxIrd = enjeuxIrd;
    }






}
