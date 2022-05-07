package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DisciplineScientifiqueEncadrementEtudiant;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueEncadrementEtudiantVo;

@Component
public class DisciplineScientifiqueEncadrementEtudiantConverter extends AbstractConverter<DisciplineScientifiqueEncadrementEtudiant,DisciplineScientifiqueEncadrementEtudiantVo>{

        @Autowired
        private EncadrementEtudiantConverter encadrementEtudiantConverter ;
        @Autowired
        private DisciplineScientifiqueConverter disciplineScientifiqueConverter ;
    private Boolean disciplineScientifique;
    private Boolean encadrementEtudiant;

public  DisciplineScientifiqueEncadrementEtudiantConverter(){
init(true);
}

@Override
public DisciplineScientifiqueEncadrementEtudiant toItem(DisciplineScientifiqueEncadrementEtudiantVo vo) {
if (vo == null) {
return null;
} else {
DisciplineScientifiqueEncadrementEtudiant item = new DisciplineScientifiqueEncadrementEtudiant();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getDisciplineScientifiqueVo()!=null && this.disciplineScientifique)
        item.setDisciplineScientifique(disciplineScientifiqueConverter.toItem(vo.getDisciplineScientifiqueVo())) ;
    if(vo.getEncadrementEtudiantVo()!=null && this.encadrementEtudiant)
        item.setEncadrementEtudiant(encadrementEtudiantConverter.toItem(vo.getEncadrementEtudiantVo())) ;


return item;
}
}

@Override
public DisciplineScientifiqueEncadrementEtudiantVo toVo(DisciplineScientifiqueEncadrementEtudiant item) {
if (item == null) {
return null;
} else {
DisciplineScientifiqueEncadrementEtudiantVo vo = new DisciplineScientifiqueEncadrementEtudiantVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getDisciplineScientifique()!=null && this.disciplineScientifique) {
        vo.setDisciplineScientifiqueVo(disciplineScientifiqueConverter.toVo(item.getDisciplineScientifique())) ;
    }
    if(item.getEncadrementEtudiant()!=null && this.encadrementEtudiant) {
        vo.setEncadrementEtudiantVo(encadrementEtudiantConverter.toVo(item.getEncadrementEtudiant())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    disciplineScientifique = value;
    encadrementEtudiant = value;
}


        public EncadrementEtudiantConverter getEncadrementEtudiantConverter(){
        return this.encadrementEtudiantConverter;
        }
        public void setEncadrementEtudiantConverter(EncadrementEtudiantConverter encadrementEtudiantConverter ){
        this.encadrementEtudiantConverter = encadrementEtudiantConverter;
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
    public boolean  isEncadrementEtudiant(){
    return this.encadrementEtudiant;
    }
    public void  setEncadrementEtudiant(boolean encadrementEtudiant){
    this.encadrementEtudiant = encadrementEtudiant;
    }






}
