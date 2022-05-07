package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.FormationContinueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.FormationContinueEnjeuxIrdVo;

@Component
public class FormationContinueEnjeuxIrdConverter extends AbstractConverter<FormationContinueEnjeuxIrd,FormationContinueEnjeuxIrdVo>{

        @Autowired
        private FormationContinueConverter formationContinueConverter ;
        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
    private Boolean enjeuxIrd;
    private Boolean formationContinue;

public  FormationContinueEnjeuxIrdConverter(){
init(true);
}

@Override
public FormationContinueEnjeuxIrd toItem(FormationContinueEnjeuxIrdVo vo) {
if (vo == null) {
return null;
} else {
FormationContinueEnjeuxIrd item = new FormationContinueEnjeuxIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;
    if(vo.getFormationContinueVo()!=null && this.formationContinue)
        item.setFormationContinue(formationContinueConverter.toItem(vo.getFormationContinueVo())) ;


return item;
}
}

@Override
public FormationContinueEnjeuxIrdVo toVo(FormationContinueEnjeuxIrd item) {
if (item == null) {
return null;
} else {
FormationContinueEnjeuxIrdVo vo = new FormationContinueEnjeuxIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }
    if(item.getFormationContinue()!=null && this.formationContinue) {
        vo.setFormationContinueVo(formationContinueConverter.toVo(item.getFormationContinue())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    enjeuxIrd = value;
    formationContinue = value;
}


        public FormationContinueConverter getFormationContinueConverter(){
        return this.formationContinueConverter;
        }
        public void setFormationContinueConverter(FormationContinueConverter formationContinueConverter ){
        this.formationContinueConverter = formationContinueConverter;
        }
        public EnjeuxIrdConverter getEnjeuxIrdConverter(){
        return this.enjeuxIrdConverter;
        }
        public void setEnjeuxIrdConverter(EnjeuxIrdConverter enjeuxIrdConverter ){
        this.enjeuxIrdConverter = enjeuxIrdConverter;
        }

    public boolean  isEnjeuxIrd(){
    return this.enjeuxIrd;
    }
    public void  setEnjeuxIrd(boolean enjeuxIrd){
    this.enjeuxIrd = enjeuxIrd;
    }
    public boolean  isFormationContinue(){
    return this.formationContinue;
    }
    public void  setFormationContinue(boolean formationContinue){
    this.formationContinue = formationContinue;
    }






}
