package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.PaysFormationContinue;
import com.ird.faa.ws.rest.provided.vo.PaysFormationContinueVo;

@Component
public class PaysFormationContinueConverter extends AbstractConverter<PaysFormationContinue,PaysFormationContinueVo>{

        @Autowired
        private FormationContinueConverter formationContinueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean formationContinue;
    private Boolean pays;

public  PaysFormationContinueConverter(){
init(true);
}

@Override
public PaysFormationContinue toItem(PaysFormationContinueVo vo) {
if (vo == null) {
return null;
} else {
PaysFormationContinue item = new PaysFormationContinue();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getFormationContinueVo()!=null && this.formationContinue)
        item.setFormationContinue(formationContinueConverter.toItem(vo.getFormationContinueVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;


return item;
}
}

@Override
public PaysFormationContinueVo toVo(PaysFormationContinue item) {
if (item == null) {
return null;
} else {
PaysFormationContinueVo vo = new PaysFormationContinueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getFormationContinue()!=null && this.formationContinue) {
        vo.setFormationContinueVo(formationContinueConverter.toVo(item.getFormationContinue())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    formationContinue = value;
    pays = value;
}


        public FormationContinueConverter getFormationContinueConverter(){
        return this.formationContinueConverter;
        }
        public void setFormationContinueConverter(FormationContinueConverter formationContinueConverter ){
        this.formationContinueConverter = formationContinueConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }

    public boolean  isFormationContinue(){
    return this.formationContinue;
    }
    public void  setFormationContinue(boolean formationContinue){
    this.formationContinue = formationContinue;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }






}
