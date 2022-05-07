package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DisciplineScientifiqueConseilEtComiteScientifique;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueConseilEtComiteScientifiqueVo;

@Component
public class DisciplineScientifiqueConseilEtComiteScientifiqueConverter extends AbstractConverter<DisciplineScientifiqueConseilEtComiteScientifique,DisciplineScientifiqueConseilEtComiteScientifiqueVo>{

        @Autowired
        private ConseilEtComiteScientifiqueConverter conseilEtComiteScientifiqueConverter ;
        @Autowired
        private DisciplineScientifiqueConverter disciplineScientifiqueConverter ;
    private Boolean disciplineScientifique;
    private Boolean conseilEtComiteScientifique;

public  DisciplineScientifiqueConseilEtComiteScientifiqueConverter(){
init(true);
}

@Override
public DisciplineScientifiqueConseilEtComiteScientifique toItem(DisciplineScientifiqueConseilEtComiteScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
DisciplineScientifiqueConseilEtComiteScientifique item = new DisciplineScientifiqueConseilEtComiteScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getDisciplineScientifiqueVo()!=null && this.disciplineScientifique)
        item.setDisciplineScientifique(disciplineScientifiqueConverter.toItem(vo.getDisciplineScientifiqueVo())) ;
    if(vo.getConseilEtComiteScientifiqueVo()!=null && this.conseilEtComiteScientifique)
        item.setConseilEtComiteScientifique(conseilEtComiteScientifiqueConverter.toItem(vo.getConseilEtComiteScientifiqueVo())) ;


return item;
}
}

@Override
public DisciplineScientifiqueConseilEtComiteScientifiqueVo toVo(DisciplineScientifiqueConseilEtComiteScientifique item) {
if (item == null) {
return null;
} else {
DisciplineScientifiqueConseilEtComiteScientifiqueVo vo = new DisciplineScientifiqueConseilEtComiteScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getDisciplineScientifique()!=null && this.disciplineScientifique) {
        vo.setDisciplineScientifiqueVo(disciplineScientifiqueConverter.toVo(item.getDisciplineScientifique())) ;
    }
    if(item.getConseilEtComiteScientifique()!=null && this.conseilEtComiteScientifique) {
        vo.setConseilEtComiteScientifiqueVo(conseilEtComiteScientifiqueConverter.toVo(item.getConseilEtComiteScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    disciplineScientifique = value;
    conseilEtComiteScientifique = value;
}


        public ConseilEtComiteScientifiqueConverter getConseilEtComiteScientifiqueConverter(){
        return this.conseilEtComiteScientifiqueConverter;
        }
        public void setConseilEtComiteScientifiqueConverter(ConseilEtComiteScientifiqueConverter conseilEtComiteScientifiqueConverter ){
        this.conseilEtComiteScientifiqueConverter = conseilEtComiteScientifiqueConverter;
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
    public boolean  isConseilEtComiteScientifique(){
    return this.conseilEtComiteScientifique;
    }
    public void  setConseilEtComiteScientifique(boolean conseilEtComiteScientifique){
    this.conseilEtComiteScientifique = conseilEtComiteScientifique;
    }






}
