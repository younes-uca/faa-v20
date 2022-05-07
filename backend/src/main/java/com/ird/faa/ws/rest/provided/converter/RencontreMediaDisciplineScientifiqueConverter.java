package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.RencontreMediaDisciplineScientifique;
import com.ird.faa.ws.rest.provided.vo.RencontreMediaDisciplineScientifiqueVo;

@Component
public class RencontreMediaDisciplineScientifiqueConverter extends AbstractConverter<RencontreMediaDisciplineScientifique,RencontreMediaDisciplineScientifiqueVo>{

        @Autowired
        private RencontreMediaConverter rencontreMediaConverter ;
        @Autowired
        private DisciplineScientifiqueConverter disciplineScientifiqueConverter ;
    private Boolean rencontreMedia;
    private Boolean disciplineScientifique;

public  RencontreMediaDisciplineScientifiqueConverter(){
init(true);
}

@Override
public RencontreMediaDisciplineScientifique toItem(RencontreMediaDisciplineScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
RencontreMediaDisciplineScientifique item = new RencontreMediaDisciplineScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getRencontreMediaVo()!=null && this.rencontreMedia)
        item.setRencontreMedia(rencontreMediaConverter.toItem(vo.getRencontreMediaVo())) ;
    if(vo.getDisciplineScientifiqueVo()!=null && this.disciplineScientifique)
        item.setDisciplineScientifique(disciplineScientifiqueConverter.toItem(vo.getDisciplineScientifiqueVo())) ;


return item;
}
}

@Override
public RencontreMediaDisciplineScientifiqueVo toVo(RencontreMediaDisciplineScientifique item) {
if (item == null) {
return null;
} else {
RencontreMediaDisciplineScientifiqueVo vo = new RencontreMediaDisciplineScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getRencontreMedia()!=null && this.rencontreMedia) {
        vo.setRencontreMediaVo(rencontreMediaConverter.toVo(item.getRencontreMedia())) ;
    }
    if(item.getDisciplineScientifique()!=null && this.disciplineScientifique) {
        vo.setDisciplineScientifiqueVo(disciplineScientifiqueConverter.toVo(item.getDisciplineScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    rencontreMedia = value;
    disciplineScientifique = value;
}


        public RencontreMediaConverter getRencontreMediaConverter(){
        return this.rencontreMediaConverter;
        }
        public void setRencontreMediaConverter(RencontreMediaConverter rencontreMediaConverter ){
        this.rencontreMediaConverter = rencontreMediaConverter;
        }
        public DisciplineScientifiqueConverter getDisciplineScientifiqueConverter(){
        return this.disciplineScientifiqueConverter;
        }
        public void setDisciplineScientifiqueConverter(DisciplineScientifiqueConverter disciplineScientifiqueConverter ){
        this.disciplineScientifiqueConverter = disciplineScientifiqueConverter;
        }

    public boolean  isRencontreMedia(){
    return this.rencontreMedia;
    }
    public void  setRencontreMedia(boolean rencontreMedia){
    this.rencontreMedia = rencontreMedia;
    }
    public boolean  isDisciplineScientifique(){
    return this.disciplineScientifique;
    }
    public void  setDisciplineScientifique(boolean disciplineScientifique){
    this.disciplineScientifique = disciplineScientifique;
    }






}
