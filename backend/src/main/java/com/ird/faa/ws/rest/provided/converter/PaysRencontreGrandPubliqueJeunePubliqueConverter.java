package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.PaysRencontreGrandPubliqueJeunePublique;
import com.ird.faa.ws.rest.provided.vo.PaysRencontreGrandPubliqueJeunePubliqueVo;

@Component
public class PaysRencontreGrandPubliqueJeunePubliqueConverter extends AbstractConverter<PaysRencontreGrandPubliqueJeunePublique,PaysRencontreGrandPubliqueJeunePubliqueVo>{

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean pays;
    private Boolean rencontreGrandPubliqueJeunePublique;

public  PaysRencontreGrandPubliqueJeunePubliqueConverter(){
init(true);
}

@Override
public PaysRencontreGrandPubliqueJeunePublique toItem(PaysRencontreGrandPubliqueJeunePubliqueVo vo) {
if (vo == null) {
return null;
} else {
PaysRencontreGrandPubliqueJeunePublique item = new PaysRencontreGrandPubliqueJeunePublique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getRencontreGrandPubliqueJeunePubliqueVo()!=null && this.rencontreGrandPubliqueJeunePublique)
        item.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePubliqueConverter.toItem(vo.getRencontreGrandPubliqueJeunePubliqueVo())) ;


return item;
}
}

@Override
public PaysRencontreGrandPubliqueJeunePubliqueVo toVo(PaysRencontreGrandPubliqueJeunePublique item) {
if (item == null) {
return null;
} else {
PaysRencontreGrandPubliqueJeunePubliqueVo vo = new PaysRencontreGrandPubliqueJeunePubliqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getRencontreGrandPubliqueJeunePublique()!=null && this.rencontreGrandPubliqueJeunePublique) {
        vo.setRencontreGrandPubliqueJeunePubliqueVo(rencontreGrandPubliqueJeunePubliqueConverter.toVo(item.getRencontreGrandPubliqueJeunePublique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    pays = value;
    rencontreGrandPubliqueJeunePublique = value;
}


        public RencontreGrandPubliqueJeunePubliqueConverter getRencontreGrandPubliqueJeunePubliqueConverter(){
        return this.rencontreGrandPubliqueJeunePubliqueConverter;
        }
        public void setRencontreGrandPubliqueJeunePubliqueConverter(RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter ){
        this.rencontreGrandPubliqueJeunePubliqueConverter = rencontreGrandPubliqueJeunePubliqueConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }

    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }
    public boolean  isRencontreGrandPubliqueJeunePublique(){
    return this.rencontreGrandPubliqueJeunePublique;
    }
    public void  setRencontreGrandPubliqueJeunePublique(boolean rencontreGrandPubliqueJeunePublique){
    this.rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePublique;
    }






}
