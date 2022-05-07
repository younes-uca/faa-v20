package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.OutilPedagogiqueDisciplineScientifique;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueDisciplineScientifiqueVo;

@Component
public class OutilPedagogiqueDisciplineScientifiqueConverter extends AbstractConverter<OutilPedagogiqueDisciplineScientifique,OutilPedagogiqueDisciplineScientifiqueVo>{

        @Autowired
        private OutilPedagogiqueConverter outilPedagogiqueConverter ;
        @Autowired
        private DisciplineScientifiqueConverter disciplineScientifiqueConverter ;
    private Boolean outilPedagogique;
    private Boolean disciplineScientifique;

public  OutilPedagogiqueDisciplineScientifiqueConverter(){
init(true);
}

@Override
public OutilPedagogiqueDisciplineScientifique toItem(OutilPedagogiqueDisciplineScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
OutilPedagogiqueDisciplineScientifique item = new OutilPedagogiqueDisciplineScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getOutilPedagogiqueVo()!=null && this.outilPedagogique)
        item.setOutilPedagogique(outilPedagogiqueConverter.toItem(vo.getOutilPedagogiqueVo())) ;
    if(vo.getDisciplineScientifiqueVo()!=null && this.disciplineScientifique)
        item.setDisciplineScientifique(disciplineScientifiqueConverter.toItem(vo.getDisciplineScientifiqueVo())) ;


return item;
}
}

@Override
public OutilPedagogiqueDisciplineScientifiqueVo toVo(OutilPedagogiqueDisciplineScientifique item) {
if (item == null) {
return null;
} else {
OutilPedagogiqueDisciplineScientifiqueVo vo = new OutilPedagogiqueDisciplineScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getOutilPedagogique()!=null && this.outilPedagogique) {
        vo.setOutilPedagogiqueVo(outilPedagogiqueConverter.toVo(item.getOutilPedagogique())) ;
    }
    if(item.getDisciplineScientifique()!=null && this.disciplineScientifique) {
        vo.setDisciplineScientifiqueVo(disciplineScientifiqueConverter.toVo(item.getDisciplineScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    outilPedagogique = value;
    disciplineScientifique = value;
}


        public OutilPedagogiqueConverter getOutilPedagogiqueConverter(){
        return this.outilPedagogiqueConverter;
        }
        public void setOutilPedagogiqueConverter(OutilPedagogiqueConverter outilPedagogiqueConverter ){
        this.outilPedagogiqueConverter = outilPedagogiqueConverter;
        }
        public DisciplineScientifiqueConverter getDisciplineScientifiqueConverter(){
        return this.disciplineScientifiqueConverter;
        }
        public void setDisciplineScientifiqueConverter(DisciplineScientifiqueConverter disciplineScientifiqueConverter ){
        this.disciplineScientifiqueConverter = disciplineScientifiqueConverter;
        }

    public boolean  isOutilPedagogique(){
    return this.outilPedagogique;
    }
    public void  setOutilPedagogique(boolean outilPedagogique){
    this.outilPedagogique = outilPedagogique;
    }
    public boolean  isDisciplineScientifique(){
    return this.disciplineScientifique;
    }
    public void  setDisciplineScientifique(boolean disciplineScientifique){
    this.disciplineScientifique = disciplineScientifique;
    }






}
