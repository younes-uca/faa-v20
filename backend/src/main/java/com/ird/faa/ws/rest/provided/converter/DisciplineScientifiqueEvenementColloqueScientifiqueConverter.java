package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DisciplineScientifiqueEvenementColloqueScientifique;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueEvenementColloqueScientifiqueVo;

@Component
public class DisciplineScientifiqueEvenementColloqueScientifiqueConverter extends AbstractConverter<DisciplineScientifiqueEvenementColloqueScientifique,DisciplineScientifiqueEvenementColloqueScientifiqueVo>{

        @Autowired
        private DisciplineScientifiqueConverter disciplineScientifiqueConverter ;
        @Autowired
        private EvenementColloqueScienntifiqueConverter evenementColloqueScienntifiqueConverter ;
    private Boolean evenementColloqueScienntifique;
    private Boolean disciplineScientifique;

public  DisciplineScientifiqueEvenementColloqueScientifiqueConverter(){
init(true);
}

@Override
public DisciplineScientifiqueEvenementColloqueScientifique toItem(DisciplineScientifiqueEvenementColloqueScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
DisciplineScientifiqueEvenementColloqueScientifique item = new DisciplineScientifiqueEvenementColloqueScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEvenementColloqueScienntifiqueVo()!=null && this.evenementColloqueScienntifique)
        item.setEvenementColloqueScienntifique(evenementColloqueScienntifiqueConverter.toItem(vo.getEvenementColloqueScienntifiqueVo())) ;
    if(vo.getDisciplineScientifiqueVo()!=null && this.disciplineScientifique)
        item.setDisciplineScientifique(disciplineScientifiqueConverter.toItem(vo.getDisciplineScientifiqueVo())) ;


return item;
}
}

@Override
public DisciplineScientifiqueEvenementColloqueScientifiqueVo toVo(DisciplineScientifiqueEvenementColloqueScientifique item) {
if (item == null) {
return null;
} else {
DisciplineScientifiqueEvenementColloqueScientifiqueVo vo = new DisciplineScientifiqueEvenementColloqueScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEvenementColloqueScienntifique()!=null && this.evenementColloqueScienntifique) {
        vo.setEvenementColloqueScienntifiqueVo(evenementColloqueScienntifiqueConverter.toVo(item.getEvenementColloqueScienntifique())) ;
    }
    if(item.getDisciplineScientifique()!=null && this.disciplineScientifique) {
        vo.setDisciplineScientifiqueVo(disciplineScientifiqueConverter.toVo(item.getDisciplineScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    evenementColloqueScienntifique = value;
    disciplineScientifique = value;
}


        public DisciplineScientifiqueConverter getDisciplineScientifiqueConverter(){
        return this.disciplineScientifiqueConverter;
        }
        public void setDisciplineScientifiqueConverter(DisciplineScientifiqueConverter disciplineScientifiqueConverter ){
        this.disciplineScientifiqueConverter = disciplineScientifiqueConverter;
        }
        public EvenementColloqueScienntifiqueConverter getEvenementColloqueScienntifiqueConverter(){
        return this.evenementColloqueScienntifiqueConverter;
        }
        public void setEvenementColloqueScienntifiqueConverter(EvenementColloqueScienntifiqueConverter evenementColloqueScienntifiqueConverter ){
        this.evenementColloqueScienntifiqueConverter = evenementColloqueScienntifiqueConverter;
        }

    public boolean  isEvenementColloqueScienntifique(){
    return this.evenementColloqueScienntifique;
    }
    public void  setEvenementColloqueScienntifique(boolean evenementColloqueScienntifique){
    this.evenementColloqueScienntifique = evenementColloqueScienntifique;
    }
    public boolean  isDisciplineScientifique(){
    return this.disciplineScientifique;
    }
    public void  setDisciplineScientifique(boolean disciplineScientifique){
    this.disciplineScientifique = disciplineScientifique;
    }






}
