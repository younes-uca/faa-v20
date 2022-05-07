package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DisciplineScientifiqueConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueConsultanceScientifiquePonctuelleVo;

@Component
public class DisciplineScientifiqueConsultanceScientifiquePonctuelleConverter extends AbstractConverter<DisciplineScientifiqueConsultanceScientifiquePonctuelle,DisciplineScientifiqueConsultanceScientifiquePonctuelleVo>{

        @Autowired
        private ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ;
        @Autowired
        private DisciplineScientifiqueConverter disciplineScientifiqueConverter ;
    private Boolean consultanceScientifiquePonctuelle;
    private Boolean disciplineScientifique;

public  DisciplineScientifiqueConsultanceScientifiquePonctuelleConverter(){
init(true);
}

@Override
public DisciplineScientifiqueConsultanceScientifiquePonctuelle toItem(DisciplineScientifiqueConsultanceScientifiquePonctuelleVo vo) {
if (vo == null) {
return null;
} else {
DisciplineScientifiqueConsultanceScientifiquePonctuelle item = new DisciplineScientifiqueConsultanceScientifiquePonctuelle();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getConsultanceScientifiquePonctuelleVo()!=null && this.consultanceScientifiquePonctuelle)
        item.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelleConverter.toItem(vo.getConsultanceScientifiquePonctuelleVo())) ;
    if(vo.getDisciplineScientifiqueVo()!=null && this.disciplineScientifique)
        item.setDisciplineScientifique(disciplineScientifiqueConverter.toItem(vo.getDisciplineScientifiqueVo())) ;


return item;
}
}

@Override
public DisciplineScientifiqueConsultanceScientifiquePonctuelleVo toVo(DisciplineScientifiqueConsultanceScientifiquePonctuelle item) {
if (item == null) {
return null;
} else {
DisciplineScientifiqueConsultanceScientifiquePonctuelleVo vo = new DisciplineScientifiqueConsultanceScientifiquePonctuelleVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getConsultanceScientifiquePonctuelle()!=null && this.consultanceScientifiquePonctuelle) {
        vo.setConsultanceScientifiquePonctuelleVo(consultanceScientifiquePonctuelleConverter.toVo(item.getConsultanceScientifiquePonctuelle())) ;
    }
    if(item.getDisciplineScientifique()!=null && this.disciplineScientifique) {
        vo.setDisciplineScientifiqueVo(disciplineScientifiqueConverter.toVo(item.getDisciplineScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    consultanceScientifiquePonctuelle = value;
    disciplineScientifique = value;
}


        public ConsultanceScientifiquePonctuelleConverter getConsultanceScientifiquePonctuelleConverter(){
        return this.consultanceScientifiquePonctuelleConverter;
        }
        public void setConsultanceScientifiquePonctuelleConverter(ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ){
        this.consultanceScientifiquePonctuelleConverter = consultanceScientifiquePonctuelleConverter;
        }
        public DisciplineScientifiqueConverter getDisciplineScientifiqueConverter(){
        return this.disciplineScientifiqueConverter;
        }
        public void setDisciplineScientifiqueConverter(DisciplineScientifiqueConverter disciplineScientifiqueConverter ){
        this.disciplineScientifiqueConverter = disciplineScientifiqueConverter;
        }

    public boolean  isConsultanceScientifiquePonctuelle(){
    return this.consultanceScientifiquePonctuelle;
    }
    public void  setConsultanceScientifiquePonctuelle(boolean consultanceScientifiquePonctuelle){
    this.consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelle;
    }
    public boolean  isDisciplineScientifique(){
    return this.disciplineScientifique;
    }
    public void  setDisciplineScientifique(boolean disciplineScientifique){
    this.disciplineScientifique = disciplineScientifique;
    }






}
