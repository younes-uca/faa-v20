package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DisciplineScientifiqueExpertiseScientifique;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueExpertiseScientifiqueVo;

@Component
public class DisciplineScientifiqueExpertiseScientifiqueConverter extends AbstractConverter<DisciplineScientifiqueExpertiseScientifique,DisciplineScientifiqueExpertiseScientifiqueVo>{

        @Autowired
        private ExpertiseScientifiqueConverter expertiseScientifiqueConverter ;
        @Autowired
        private DisciplineScientifiqueConverter disciplineScientifiqueConverter ;
    private Boolean disciplineScientifique;
    private Boolean expertiseScientifique;

public  DisciplineScientifiqueExpertiseScientifiqueConverter(){
init(true);
}

@Override
public DisciplineScientifiqueExpertiseScientifique toItem(DisciplineScientifiqueExpertiseScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
DisciplineScientifiqueExpertiseScientifique item = new DisciplineScientifiqueExpertiseScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getDisciplineScientifiqueVo()!=null && this.disciplineScientifique)
        item.setDisciplineScientifique(disciplineScientifiqueConverter.toItem(vo.getDisciplineScientifiqueVo())) ;
    if(vo.getExpertiseScientifiqueVo()!=null && this.expertiseScientifique)
        item.setExpertiseScientifique(expertiseScientifiqueConverter.toItem(vo.getExpertiseScientifiqueVo())) ;


return item;
}
}

@Override
public DisciplineScientifiqueExpertiseScientifiqueVo toVo(DisciplineScientifiqueExpertiseScientifique item) {
if (item == null) {
return null;
} else {
DisciplineScientifiqueExpertiseScientifiqueVo vo = new DisciplineScientifiqueExpertiseScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getDisciplineScientifique()!=null && this.disciplineScientifique) {
        vo.setDisciplineScientifiqueVo(disciplineScientifiqueConverter.toVo(item.getDisciplineScientifique())) ;
    }
    if(item.getExpertiseScientifique()!=null && this.expertiseScientifique) {
        vo.setExpertiseScientifiqueVo(expertiseScientifiqueConverter.toVo(item.getExpertiseScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    disciplineScientifique = value;
    expertiseScientifique = value;
}


        public ExpertiseScientifiqueConverter getExpertiseScientifiqueConverter(){
        return this.expertiseScientifiqueConverter;
        }
        public void setExpertiseScientifiqueConverter(ExpertiseScientifiqueConverter expertiseScientifiqueConverter ){
        this.expertiseScientifiqueConverter = expertiseScientifiqueConverter;
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
    public boolean  isExpertiseScientifique(){
    return this.expertiseScientifique;
    }
    public void  setExpertiseScientifique(boolean expertiseScientifique){
    this.expertiseScientifique = expertiseScientifique;
    }






}
