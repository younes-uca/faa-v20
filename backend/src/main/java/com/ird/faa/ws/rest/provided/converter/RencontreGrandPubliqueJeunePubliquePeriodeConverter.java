package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliquePeriode;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliquePeriodeVo;

@Component
public class RencontreGrandPubliqueJeunePubliquePeriodeConverter extends AbstractConverter<RencontreGrandPubliqueJeunePubliquePeriode,RencontreGrandPubliqueJeunePubliquePeriodeVo>{

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter ;
    private Boolean rencontreGrandPubliqueJeunePublique;

public  RencontreGrandPubliqueJeunePubliquePeriodeConverter(){
init(true);
}

@Override
public RencontreGrandPubliqueJeunePubliquePeriode toItem(RencontreGrandPubliqueJeunePubliquePeriodeVo vo) {
if (vo == null) {
return null;
} else {
RencontreGrandPubliqueJeunePubliquePeriode item = new RencontreGrandPubliqueJeunePubliquePeriode();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getDateRencontre()))
        item.setDateRencontre(DateUtil.parse(vo.getDateRencontre()));
    if(vo.getRencontreGrandPubliqueJeunePubliqueVo()!=null && this.rencontreGrandPubliqueJeunePublique)
        item.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePubliqueConverter.toItem(vo.getRencontreGrandPubliqueJeunePubliqueVo())) ;


return item;
}
}

@Override
public RencontreGrandPubliqueJeunePubliquePeriodeVo toVo(RencontreGrandPubliqueJeunePubliquePeriode item) {
if (item == null) {
return null;
} else {
RencontreGrandPubliqueJeunePubliquePeriodeVo vo = new RencontreGrandPubliqueJeunePubliquePeriodeVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getDateRencontre()!=null)
        vo.setDateRencontre(DateUtil.formateDate(item.getDateRencontre()));
    if(item.getRencontreGrandPubliqueJeunePublique()!=null && this.rencontreGrandPubliqueJeunePublique) {
        vo.setRencontreGrandPubliqueJeunePubliqueVo(rencontreGrandPubliqueJeunePubliqueConverter.toVo(item.getRencontreGrandPubliqueJeunePublique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    rencontreGrandPubliqueJeunePublique = value;
}


        public RencontreGrandPubliqueJeunePubliqueConverter getRencontreGrandPubliqueJeunePubliqueConverter(){
        return this.rencontreGrandPubliqueJeunePubliqueConverter;
        }
        public void setRencontreGrandPubliqueJeunePubliqueConverter(RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter ){
        this.rencontreGrandPubliqueJeunePubliqueConverter = rencontreGrandPubliqueJeunePubliqueConverter;
        }

    public boolean  isRencontreGrandPubliqueJeunePublique(){
    return this.rencontreGrandPubliqueJeunePublique;
    }
    public void  setRencontreGrandPubliqueJeunePublique(boolean rencontreGrandPubliqueJeunePublique){
    this.rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePublique;
    }






}
