package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DisciplineScientifiqueComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueComiteEtCommissionEvaluationVo;

@Component
public class DisciplineScientifiqueComiteEtCommissionEvaluationConverter extends AbstractConverter<DisciplineScientifiqueComiteEtCommissionEvaluation,DisciplineScientifiqueComiteEtCommissionEvaluationVo>{

        @Autowired
        private ComiteEtCommissionEvaluationConverter comiteEtCommissionEvaluationConverter ;
        @Autowired
        private DisciplineScientifiqueConverter disciplineScientifiqueConverter ;
    private Boolean disciplineScientifique;
    private Boolean comiteEtCommissionEvaluation;

public  DisciplineScientifiqueComiteEtCommissionEvaluationConverter(){
init(true);
}

@Override
public DisciplineScientifiqueComiteEtCommissionEvaluation toItem(DisciplineScientifiqueComiteEtCommissionEvaluationVo vo) {
if (vo == null) {
return null;
} else {
DisciplineScientifiqueComiteEtCommissionEvaluation item = new DisciplineScientifiqueComiteEtCommissionEvaluation();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getDisciplineScientifiqueVo()!=null && this.disciplineScientifique)
        item.setDisciplineScientifique(disciplineScientifiqueConverter.toItem(vo.getDisciplineScientifiqueVo())) ;
    if(vo.getComiteEtCommissionEvaluationVo()!=null && this.comiteEtCommissionEvaluation)
        item.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluationConverter.toItem(vo.getComiteEtCommissionEvaluationVo())) ;


return item;
}
}

@Override
public DisciplineScientifiqueComiteEtCommissionEvaluationVo toVo(DisciplineScientifiqueComiteEtCommissionEvaluation item) {
if (item == null) {
return null;
} else {
DisciplineScientifiqueComiteEtCommissionEvaluationVo vo = new DisciplineScientifiqueComiteEtCommissionEvaluationVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getDisciplineScientifique()!=null && this.disciplineScientifique) {
        vo.setDisciplineScientifiqueVo(disciplineScientifiqueConverter.toVo(item.getDisciplineScientifique())) ;
    }
    if(item.getComiteEtCommissionEvaluation()!=null && this.comiteEtCommissionEvaluation) {
        vo.setComiteEtCommissionEvaluationVo(comiteEtCommissionEvaluationConverter.toVo(item.getComiteEtCommissionEvaluation())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    disciplineScientifique = value;
    comiteEtCommissionEvaluation = value;
}


        public ComiteEtCommissionEvaluationConverter getComiteEtCommissionEvaluationConverter(){
        return this.comiteEtCommissionEvaluationConverter;
        }
        public void setComiteEtCommissionEvaluationConverter(ComiteEtCommissionEvaluationConverter comiteEtCommissionEvaluationConverter ){
        this.comiteEtCommissionEvaluationConverter = comiteEtCommissionEvaluationConverter;
        }
        public DisciplineScientifiqueConverter getDisciplineScientifiqueConverter(){
        return this.disciplineScientifiqueConverter;
        }
        public void setDisciplineScientifiqueConverter(DisciplineScientifiqueConverter disciplineScientifiqueConverter ){
        this.disciplineScientifiqueConverter = disciplineScientifiqueConverter;
        }

    public boolean  isDisciplineScientifique(){
    return this.disciplineScientifique;
    }
    public void  setDisciplineScientifique(boolean disciplineScientifique){
    this.disciplineScientifique = disciplineScientifique;
    }
    public boolean  isComiteEtCommissionEvaluation(){
    return this.comiteEtCommissionEvaluation;
    }
    public void  setComiteEtCommissionEvaluation(boolean comiteEtCommissionEvaluation){
    this.comiteEtCommissionEvaluation = comiteEtCommissionEvaluation;
    }






}
