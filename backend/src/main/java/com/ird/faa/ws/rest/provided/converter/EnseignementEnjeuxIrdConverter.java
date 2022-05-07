package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EnseignementEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.EnseignementEnjeuxIrdVo;

@Component
public class EnseignementEnjeuxIrdConverter extends AbstractConverter<EnseignementEnjeuxIrd,EnseignementEnjeuxIrdVo>{

        @Autowired
        private EnseignementConverter enseignementConverter ;
        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
    private Boolean enseignement;
    private Boolean enjeuxIrd;

public  EnseignementEnjeuxIrdConverter(){
init(true);
}

@Override
public EnseignementEnjeuxIrd toItem(EnseignementEnjeuxIrdVo vo) {
if (vo == null) {
return null;
} else {
EnseignementEnjeuxIrd item = new EnseignementEnjeuxIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEnseignementVo()!=null && this.enseignement)
        item.setEnseignement(enseignementConverter.toItem(vo.getEnseignementVo())) ;
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;


return item;
}
}

@Override
public EnseignementEnjeuxIrdVo toVo(EnseignementEnjeuxIrd item) {
if (item == null) {
return null;
} else {
EnseignementEnjeuxIrdVo vo = new EnseignementEnjeuxIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEnseignement()!=null && this.enseignement) {
        vo.setEnseignementVo(enseignementConverter.toVo(item.getEnseignement())) ;
    }
    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    enseignement = value;
    enjeuxIrd = value;
}


        public EnseignementConverter getEnseignementConverter(){
        return this.enseignementConverter;
        }
        public void setEnseignementConverter(EnseignementConverter enseignementConverter ){
        this.enseignementConverter = enseignementConverter;
        }
        public EnjeuxIrdConverter getEnjeuxIrdConverter(){
        return this.enjeuxIrdConverter;
        }
        public void setEnjeuxIrdConverter(EnjeuxIrdConverter enjeuxIrdConverter ){
        this.enjeuxIrdConverter = enjeuxIrdConverter;
        }

    public boolean  isEnseignement(){
    return this.enseignement;
    }
    public void  setEnseignement(boolean enseignement){
    this.enseignement = enseignement;
    }
    public boolean  isEnjeuxIrd(){
    return this.enjeuxIrd;
    }
    public void  setEnjeuxIrd(boolean enjeuxIrd){
    this.enjeuxIrd = enjeuxIrd;
    }






}
