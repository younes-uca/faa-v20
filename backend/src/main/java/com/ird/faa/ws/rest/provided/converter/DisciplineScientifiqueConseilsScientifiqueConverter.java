package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DisciplineScientifiqueConseilsScientifique;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueConseilsScientifiqueVo;

@Component
public class DisciplineScientifiqueConseilsScientifiqueConverter extends AbstractConverter<DisciplineScientifiqueConseilsScientifique,DisciplineScientifiqueConseilsScientifiqueVo>{

        @Autowired
        private ConseilsScientifiqueConverter conseilsScientifiqueConverter ;
        @Autowired
        private DisciplineScientifiqueConverter disciplineScientifiqueConverter ;
    private Boolean conseilsScientifique;
    private Boolean disciplineScientifique;

public  DisciplineScientifiqueConseilsScientifiqueConverter(){
init(true);
}

@Override
public DisciplineScientifiqueConseilsScientifique toItem(DisciplineScientifiqueConseilsScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
DisciplineScientifiqueConseilsScientifique item = new DisciplineScientifiqueConseilsScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getConseilsScientifiqueVo()!=null && this.conseilsScientifique)
        item.setConseilsScientifique(conseilsScientifiqueConverter.toItem(vo.getConseilsScientifiqueVo())) ;
    if(vo.getDisciplineScientifiqueVo()!=null && this.disciplineScientifique)
        item.setDisciplineScientifique(disciplineScientifiqueConverter.toItem(vo.getDisciplineScientifiqueVo())) ;


return item;
}
}

@Override
public DisciplineScientifiqueConseilsScientifiqueVo toVo(DisciplineScientifiqueConseilsScientifique item) {
if (item == null) {
return null;
} else {
DisciplineScientifiqueConseilsScientifiqueVo vo = new DisciplineScientifiqueConseilsScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getConseilsScientifique()!=null && this.conseilsScientifique) {
        vo.setConseilsScientifiqueVo(conseilsScientifiqueConverter.toVo(item.getConseilsScientifique())) ;
    }
    if(item.getDisciplineScientifique()!=null && this.disciplineScientifique) {
        vo.setDisciplineScientifiqueVo(disciplineScientifiqueConverter.toVo(item.getDisciplineScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    conseilsScientifique = value;
    disciplineScientifique = value;
}


        public ConseilsScientifiqueConverter getConseilsScientifiqueConverter(){
        return this.conseilsScientifiqueConverter;
        }
        public void setConseilsScientifiqueConverter(ConseilsScientifiqueConverter conseilsScientifiqueConverter ){
        this.conseilsScientifiqueConverter = conseilsScientifiqueConverter;
        }
        public DisciplineScientifiqueConverter getDisciplineScientifiqueConverter(){
        return this.disciplineScientifiqueConverter;
        }
        public void setDisciplineScientifiqueConverter(DisciplineScientifiqueConverter disciplineScientifiqueConverter ){
        this.disciplineScientifiqueConverter = disciplineScientifiqueConverter;
        }

    public boolean  isConseilsScientifique(){
    return this.conseilsScientifique;
    }
    public void  setConseilsScientifique(boolean conseilsScientifique){
    this.conseilsScientifique = conseilsScientifique;
    }
    public boolean  isDisciplineScientifique(){
    return this.disciplineScientifique;
    }
    public void  setDisciplineScientifique(boolean disciplineScientifique){
    this.disciplineScientifique = disciplineScientifique;
    }






}
