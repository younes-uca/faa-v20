package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EncadrementEtudiantDisciplineScientifique;
import com.ird.faa.ws.rest.provided.vo.EncadrementEtudiantDisciplineScientifiqueVo;

@Component
public class EncadrementEtudiantDisciplineScientifiqueConverter extends AbstractConverter<EncadrementEtudiantDisciplineScientifique,EncadrementEtudiantDisciplineScientifiqueVo>{

        @Autowired
        private EncadrementEtudiantConverter encadrementEtudiantConverter ;
        @Autowired
        private DisciplineScientifiqueConverter disciplineScientifiqueConverter ;
    private Boolean encadrementEtudiant;
    private Boolean disciplineScientifique;

public  EncadrementEtudiantDisciplineScientifiqueConverter(){
init(true);
}

@Override
public EncadrementEtudiantDisciplineScientifique toItem(EncadrementEtudiantDisciplineScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
EncadrementEtudiantDisciplineScientifique item = new EncadrementEtudiantDisciplineScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEncadrementEtudiantVo()!=null && this.encadrementEtudiant)
        item.setEncadrementEtudiant(encadrementEtudiantConverter.toItem(vo.getEncadrementEtudiantVo())) ;
    if(vo.getDisciplineScientifiqueVo()!=null && this.disciplineScientifique)
        item.setDisciplineScientifique(disciplineScientifiqueConverter.toItem(vo.getDisciplineScientifiqueVo())) ;


return item;
}
}

@Override
public EncadrementEtudiantDisciplineScientifiqueVo toVo(EncadrementEtudiantDisciplineScientifique item) {
if (item == null) {
return null;
} else {
EncadrementEtudiantDisciplineScientifiqueVo vo = new EncadrementEtudiantDisciplineScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEncadrementEtudiant()!=null && this.encadrementEtudiant) {
        vo.setEncadrementEtudiantVo(encadrementEtudiantConverter.toVo(item.getEncadrementEtudiant())) ;
    }
    if(item.getDisciplineScientifique()!=null && this.disciplineScientifique) {
        vo.setDisciplineScientifiqueVo(disciplineScientifiqueConverter.toVo(item.getDisciplineScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    encadrementEtudiant = value;
    disciplineScientifique = value;
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

    public boolean  isEncadrementEtudiant(){
    return this.encadrementEtudiant;
    }
    public void  setEncadrementEtudiant(boolean encadrementEtudiant){
    this.encadrementEtudiant = encadrementEtudiant;
    }
    public boolean  isDisciplineScientifique(){
    return this.disciplineScientifique;
    }
    public void  setDisciplineScientifique(boolean disciplineScientifique){
    this.disciplineScientifique = disciplineScientifique;
    }






}
