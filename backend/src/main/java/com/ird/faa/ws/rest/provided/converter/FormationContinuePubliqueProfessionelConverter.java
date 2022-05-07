package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.FormationContinuePubliqueProfessionel;
import com.ird.faa.ws.rest.provided.vo.FormationContinuePubliqueProfessionelVo;

@Component
public class FormationContinuePubliqueProfessionelConverter extends AbstractConverter<FormationContinuePubliqueProfessionel,FormationContinuePubliqueProfessionelVo>{

        @Autowired
        private FormationContinueConverter formationContinueConverter ;
        @Autowired
        private PubliqueProfessionelConverter publiqueProfessionelConverter ;
    private Boolean formationContinue;
    private Boolean publiqueProfessionel;

public  FormationContinuePubliqueProfessionelConverter(){
init(true);
}

@Override
public FormationContinuePubliqueProfessionel toItem(FormationContinuePubliqueProfessionelVo vo) {
if (vo == null) {
return null;
} else {
FormationContinuePubliqueProfessionel item = new FormationContinuePubliqueProfessionel();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getFormationContinueVo()!=null && this.formationContinue)
        item.setFormationContinue(formationContinueConverter.toItem(vo.getFormationContinueVo())) ;
    if(vo.getPubliqueProfessionelVo()!=null && this.publiqueProfessionel)
        item.setPubliqueProfessionel(publiqueProfessionelConverter.toItem(vo.getPubliqueProfessionelVo())) ;


return item;
}
}

@Override
public FormationContinuePubliqueProfessionelVo toVo(FormationContinuePubliqueProfessionel item) {
if (item == null) {
return null;
} else {
FormationContinuePubliqueProfessionelVo vo = new FormationContinuePubliqueProfessionelVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getFormationContinue()!=null && this.formationContinue) {
        vo.setFormationContinueVo(formationContinueConverter.toVo(item.getFormationContinue())) ;
    }
    if(item.getPubliqueProfessionel()!=null && this.publiqueProfessionel) {
        vo.setPubliqueProfessionelVo(publiqueProfessionelConverter.toVo(item.getPubliqueProfessionel())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    formationContinue = value;
    publiqueProfessionel = value;
}


        public FormationContinueConverter getFormationContinueConverter(){
        return this.formationContinueConverter;
        }
        public void setFormationContinueConverter(FormationContinueConverter formationContinueConverter ){
        this.formationContinueConverter = formationContinueConverter;
        }
        public PubliqueProfessionelConverter getPubliqueProfessionelConverter(){
        return this.publiqueProfessionelConverter;
        }
        public void setPubliqueProfessionelConverter(PubliqueProfessionelConverter publiqueProfessionelConverter ){
        this.publiqueProfessionelConverter = publiqueProfessionelConverter;
        }

    public boolean  isFormationContinue(){
    return this.formationContinue;
    }
    public void  setFormationContinue(boolean formationContinue){
    this.formationContinue = formationContinue;
    }
    public boolean  isPubliqueProfessionel(){
    return this.publiqueProfessionel;
    }
    public void  setPubliqueProfessionel(boolean publiqueProfessionel){
    this.publiqueProfessionel = publiqueProfessionel;
    }






}
