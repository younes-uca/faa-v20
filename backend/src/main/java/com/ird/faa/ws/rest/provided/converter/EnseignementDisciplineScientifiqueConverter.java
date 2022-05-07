package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EnseignementDisciplineScientifique;
import com.ird.faa.ws.rest.provided.vo.EnseignementDisciplineScientifiqueVo;

@Component
public class EnseignementDisciplineScientifiqueConverter extends AbstractConverter<EnseignementDisciplineScientifique,EnseignementDisciplineScientifiqueVo>{

        @Autowired
        private EnseignementConverter enseignementConverter ;
        @Autowired
        private DisciplineScientifiqueConverter disciplineScientifiqueConverter ;
    private Boolean disciplineScientifique;
    private Boolean enseignement;

public  EnseignementDisciplineScientifiqueConverter(){
init(true);
}

@Override
public EnseignementDisciplineScientifique toItem(EnseignementDisciplineScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
EnseignementDisciplineScientifique item = new EnseignementDisciplineScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getDisciplineScientifiqueVo()!=null && this.disciplineScientifique)
        item.setDisciplineScientifique(disciplineScientifiqueConverter.toItem(vo.getDisciplineScientifiqueVo())) ;
    if(vo.getEnseignementVo()!=null && this.enseignement)
        item.setEnseignement(enseignementConverter.toItem(vo.getEnseignementVo())) ;


return item;
}
}

@Override
public EnseignementDisciplineScientifiqueVo toVo(EnseignementDisciplineScientifique item) {
if (item == null) {
return null;
} else {
EnseignementDisciplineScientifiqueVo vo = new EnseignementDisciplineScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getDisciplineScientifique()!=null && this.disciplineScientifique) {
        vo.setDisciplineScientifiqueVo(disciplineScientifiqueConverter.toVo(item.getDisciplineScientifique())) ;
    }
    if(item.getEnseignement()!=null && this.enseignement) {
        vo.setEnseignementVo(enseignementConverter.toVo(item.getEnseignement())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    disciplineScientifique = value;
    enseignement = value;
}


        public EnseignementConverter getEnseignementConverter(){
        return this.enseignementConverter;
        }
        public void setEnseignementConverter(EnseignementConverter enseignementConverter ){
        this.enseignementConverter = enseignementConverter;
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
    public boolean  isEnseignement(){
    return this.enseignement;
    }
    public void  setEnseignement(boolean enseignement){
    this.enseignement = enseignement;
    }






}
