package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EnseignementNature;
import com.ird.faa.ws.rest.provided.vo.EnseignementNatureVo;

@Component
public class EnseignementNatureConverter extends AbstractConverter<EnseignementNature,EnseignementNatureVo>{

        @Autowired
        private EnseignementConverter enseignementConverter ;
        @Autowired
        private NatureEnseignementConverter natureEnseignementConverter ;
    private Boolean natureEnseignement;
    private Boolean enseignement;

public  EnseignementNatureConverter(){
init(true);
}

@Override
public EnseignementNature toItem(EnseignementNatureVo vo) {
if (vo == null) {
return null;
} else {
EnseignementNature item = new EnseignementNature();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getNatureEnseignementVo()!=null && this.natureEnseignement)
        item.setNatureEnseignement(natureEnseignementConverter.toItem(vo.getNatureEnseignementVo())) ;
    if(vo.getEnseignementVo()!=null && this.enseignement)
        item.setEnseignement(enseignementConverter.toItem(vo.getEnseignementVo())) ;


return item;
}
}

@Override
public EnseignementNatureVo toVo(EnseignementNature item) {
if (item == null) {
return null;
} else {
EnseignementNatureVo vo = new EnseignementNatureVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getNatureEnseignement()!=null && this.natureEnseignement) {
        vo.setNatureEnseignementVo(natureEnseignementConverter.toVo(item.getNatureEnseignement())) ;
    }
    if(item.getEnseignement()!=null && this.enseignement) {
        vo.setEnseignementVo(enseignementConverter.toVo(item.getEnseignement())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    natureEnseignement = value;
    enseignement = value;
}


        public EnseignementConverter getEnseignementConverter(){
        return this.enseignementConverter;
        }
        public void setEnseignementConverter(EnseignementConverter enseignementConverter ){
        this.enseignementConverter = enseignementConverter;
        }
        public NatureEnseignementConverter getNatureEnseignementConverter(){
        return this.natureEnseignementConverter;
        }
        public void setNatureEnseignementConverter(NatureEnseignementConverter natureEnseignementConverter ){
        this.natureEnseignementConverter = natureEnseignementConverter;
        }

    public boolean  isNatureEnseignement(){
    return this.natureEnseignement;
    }
    public void  setNatureEnseignement(boolean natureEnseignement){
    this.natureEnseignement = natureEnseignement;
    }
    public boolean  isEnseignement(){
    return this.enseignement;
    }
    public void  setEnseignement(boolean enseignement){
    this.enseignement = enseignement;
    }






}
