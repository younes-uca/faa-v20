package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.RencontreMediaPeriode;
import com.ird.faa.ws.rest.provided.vo.RencontreMediaPeriodeVo;

@Component
public class RencontreMediaPeriodeConverter extends AbstractConverter<RencontreMediaPeriode,RencontreMediaPeriodeVo>{

        @Autowired
        private RencontreMediaConverter rencontreMediaConverter ;
    private Boolean rencontreMedia;

public  RencontreMediaPeriodeConverter(){
init(true);
}

@Override
public RencontreMediaPeriode toItem(RencontreMediaPeriodeVo vo) {
if (vo == null) {
return null;
} else {
RencontreMediaPeriode item = new RencontreMediaPeriode();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getDateRencontre()))
        item.setDateRencontre(DateUtil.parse(vo.getDateRencontre()));
    if(vo.getRencontreMediaVo()!=null && this.rencontreMedia)
        item.setRencontreMedia(rencontreMediaConverter.toItem(vo.getRencontreMediaVo())) ;


return item;
}
}

@Override
public RencontreMediaPeriodeVo toVo(RencontreMediaPeriode item) {
if (item == null) {
return null;
} else {
RencontreMediaPeriodeVo vo = new RencontreMediaPeriodeVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getDateRencontre()!=null)
        vo.setDateRencontre(DateUtil.formateDate(item.getDateRencontre()));
    if(item.getRencontreMedia()!=null && this.rencontreMedia) {
        vo.setRencontreMediaVo(rencontreMediaConverter.toVo(item.getRencontreMedia())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    rencontreMedia = value;
}


        public RencontreMediaConverter getRencontreMediaConverter(){
        return this.rencontreMediaConverter;
        }
        public void setRencontreMediaConverter(RencontreMediaConverter rencontreMediaConverter ){
        this.rencontreMediaConverter = rencontreMediaConverter;
        }

    public boolean  isRencontreMedia(){
    return this.rencontreMedia;
    }
    public void  setRencontreMedia(boolean rencontreMedia){
    this.rencontreMedia = rencontreMedia;
    }






}
