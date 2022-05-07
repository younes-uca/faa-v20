package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.FormationContinueDisciplineScientifique;
import com.ird.faa.ws.rest.provided.vo.FormationContinueDisciplineScientifiqueVo;

@Component
public class FormationContinueDisciplineScientifiqueConverter extends AbstractConverter<FormationContinueDisciplineScientifique,FormationContinueDisciplineScientifiqueVo>{

        @Autowired
        private FormationContinueConverter formationContinueConverter ;
        @Autowired
        private DisciplineScientifiqueConverter disciplineScientifiqueConverter ;
    private Boolean formationContinue;
    private Boolean disciplineScientifique;

public  FormationContinueDisciplineScientifiqueConverter(){
init(true);
}

@Override
public FormationContinueDisciplineScientifique toItem(FormationContinueDisciplineScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
FormationContinueDisciplineScientifique item = new FormationContinueDisciplineScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getFormationContinueVo()!=null && this.formationContinue)
        item.setFormationContinue(formationContinueConverter.toItem(vo.getFormationContinueVo())) ;
    if(vo.getDisciplineScientifiqueVo()!=null && this.disciplineScientifique)
        item.setDisciplineScientifique(disciplineScientifiqueConverter.toItem(vo.getDisciplineScientifiqueVo())) ;


return item;
}
}

@Override
public FormationContinueDisciplineScientifiqueVo toVo(FormationContinueDisciplineScientifique item) {
if (item == null) {
return null;
} else {
FormationContinueDisciplineScientifiqueVo vo = new FormationContinueDisciplineScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getFormationContinue()!=null && this.formationContinue) {
        vo.setFormationContinueVo(formationContinueConverter.toVo(item.getFormationContinue())) ;
    }
    if(item.getDisciplineScientifique()!=null && this.disciplineScientifique) {
        vo.setDisciplineScientifiqueVo(disciplineScientifiqueConverter.toVo(item.getDisciplineScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    formationContinue = value;
    disciplineScientifique = value;
}


        public FormationContinueConverter getFormationContinueConverter(){
        return this.formationContinueConverter;
        }
        public void setFormationContinueConverter(FormationContinueConverter formationContinueConverter ){
        this.formationContinueConverter = formationContinueConverter;
        }
        public DisciplineScientifiqueConverter getDisciplineScientifiqueConverter(){
        return this.disciplineScientifiqueConverter;
        }
        public void setDisciplineScientifiqueConverter(DisciplineScientifiqueConverter disciplineScientifiqueConverter ){
        this.disciplineScientifiqueConverter = disciplineScientifiqueConverter;
        }

    public boolean  isFormationContinue(){
    return this.formationContinue;
    }
    public void  setFormationContinue(boolean formationContinue){
    this.formationContinue = formationContinue;
    }
    public boolean  isDisciplineScientifique(){
    return this.disciplineScientifique;
    }
    public void  setDisciplineScientifique(boolean disciplineScientifique){
    this.disciplineScientifique = disciplineScientifique;
    }






}
