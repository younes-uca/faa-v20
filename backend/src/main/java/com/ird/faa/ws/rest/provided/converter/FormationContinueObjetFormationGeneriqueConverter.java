package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.FormationContinueObjetFormationGenerique;
import com.ird.faa.ws.rest.provided.vo.FormationContinueObjetFormationGeneriqueVo;

@Component
public class FormationContinueObjetFormationGeneriqueConverter extends AbstractConverter<FormationContinueObjetFormationGenerique,FormationContinueObjetFormationGeneriqueVo>{

        @Autowired
        private ObjetFormationGeneriqueConverter objetFormationGeneriqueConverter ;
        @Autowired
        private FormationContinueConverter formationContinueConverter ;
    private Boolean objetFormationGenerique;
    private Boolean formationContinue;

public  FormationContinueObjetFormationGeneriqueConverter(){
init(true);
}

@Override
public FormationContinueObjetFormationGenerique toItem(FormationContinueObjetFormationGeneriqueVo vo) {
if (vo == null) {
return null;
} else {
FormationContinueObjetFormationGenerique item = new FormationContinueObjetFormationGenerique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getObjetFormationGeneriqueVo()!=null && this.objetFormationGenerique)
        item.setObjetFormationGenerique(objetFormationGeneriqueConverter.toItem(vo.getObjetFormationGeneriqueVo())) ;
    if(vo.getFormationContinueVo()!=null && this.formationContinue)
        item.setFormationContinue(formationContinueConverter.toItem(vo.getFormationContinueVo())) ;


return item;
}
}

@Override
public FormationContinueObjetFormationGeneriqueVo toVo(FormationContinueObjetFormationGenerique item) {
if (item == null) {
return null;
} else {
FormationContinueObjetFormationGeneriqueVo vo = new FormationContinueObjetFormationGeneriqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getObjetFormationGenerique()!=null && this.objetFormationGenerique) {
        vo.setObjetFormationGeneriqueVo(objetFormationGeneriqueConverter.toVo(item.getObjetFormationGenerique())) ;
    }
    if(item.getFormationContinue()!=null && this.formationContinue) {
        vo.setFormationContinueVo(formationContinueConverter.toVo(item.getFormationContinue())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    objetFormationGenerique = value;
    formationContinue = value;
}


        public ObjetFormationGeneriqueConverter getObjetFormationGeneriqueConverter(){
        return this.objetFormationGeneriqueConverter;
        }
        public void setObjetFormationGeneriqueConverter(ObjetFormationGeneriqueConverter objetFormationGeneriqueConverter ){
        this.objetFormationGeneriqueConverter = objetFormationGeneriqueConverter;
        }
        public FormationContinueConverter getFormationContinueConverter(){
        return this.formationContinueConverter;
        }
        public void setFormationContinueConverter(FormationContinueConverter formationContinueConverter ){
        this.formationContinueConverter = formationContinueConverter;
        }

    public boolean  isObjetFormationGenerique(){
    return this.objetFormationGenerique;
    }
    public void  setObjetFormationGenerique(boolean objetFormationGenerique){
    this.objetFormationGenerique = objetFormationGenerique;
    }
    public boolean  isFormationContinue(){
    return this.formationContinue;
    }
    public void  setFormationContinue(boolean formationContinue){
    this.formationContinue = formationContinue;
    }






}
