package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DisciplineScientifiqueEncadrementDoctorant;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueEncadrementDoctorantVo;

@Component
public class DisciplineScientifiqueEncadrementDoctorantConverter extends AbstractConverter<DisciplineScientifiqueEncadrementDoctorant,DisciplineScientifiqueEncadrementDoctorantVo>{

        @Autowired
        private DisciplineScientifiqueConverter disciplineScientifiqueConverter ;
        @Autowired
        private EncadrementDoctorantConverter encadrementDoctorantConverter ;
    private Boolean encadrementDoctorant;
    private Boolean disciplineScientifique;

public  DisciplineScientifiqueEncadrementDoctorantConverter(){
init(true);
}

@Override
public DisciplineScientifiqueEncadrementDoctorant toItem(DisciplineScientifiqueEncadrementDoctorantVo vo) {
if (vo == null) {
return null;
} else {
DisciplineScientifiqueEncadrementDoctorant item = new DisciplineScientifiqueEncadrementDoctorant();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEncadrementDoctorantVo()!=null && this.encadrementDoctorant)
        item.setEncadrementDoctorant(encadrementDoctorantConverter.toItem(vo.getEncadrementDoctorantVo())) ;
    if(vo.getDisciplineScientifiqueVo()!=null && this.disciplineScientifique)
        item.setDisciplineScientifique(disciplineScientifiqueConverter.toItem(vo.getDisciplineScientifiqueVo())) ;


return item;
}
}

@Override
public DisciplineScientifiqueEncadrementDoctorantVo toVo(DisciplineScientifiqueEncadrementDoctorant item) {
if (item == null) {
return null;
} else {
DisciplineScientifiqueEncadrementDoctorantVo vo = new DisciplineScientifiqueEncadrementDoctorantVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEncadrementDoctorant()!=null && this.encadrementDoctorant) {
        vo.setEncadrementDoctorantVo(encadrementDoctorantConverter.toVo(item.getEncadrementDoctorant())) ;
    }
    if(item.getDisciplineScientifique()!=null && this.disciplineScientifique) {
        vo.setDisciplineScientifiqueVo(disciplineScientifiqueConverter.toVo(item.getDisciplineScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    encadrementDoctorant = value;
    disciplineScientifique = value;
}


        public DisciplineScientifiqueConverter getDisciplineScientifiqueConverter(){
        return this.disciplineScientifiqueConverter;
        }
        public void setDisciplineScientifiqueConverter(DisciplineScientifiqueConverter disciplineScientifiqueConverter ){
        this.disciplineScientifiqueConverter = disciplineScientifiqueConverter;
        }
        public EncadrementDoctorantConverter getEncadrementDoctorantConverter(){
        return this.encadrementDoctorantConverter;
        }
        public void setEncadrementDoctorantConverter(EncadrementDoctorantConverter encadrementDoctorantConverter ){
        this.encadrementDoctorantConverter = encadrementDoctorantConverter;
        }

    public boolean  isEncadrementDoctorant(){
    return this.encadrementDoctorant;
    }
    public void  setEncadrementDoctorant(boolean encadrementDoctorant){
    this.encadrementDoctorant = encadrementDoctorant;
    }
    public boolean  isDisciplineScientifique(){
    return this.disciplineScientifique;
    }
    public void  setDisciplineScientifique(boolean disciplineScientifique){
    this.disciplineScientifique = disciplineScientifique;
    }






}
