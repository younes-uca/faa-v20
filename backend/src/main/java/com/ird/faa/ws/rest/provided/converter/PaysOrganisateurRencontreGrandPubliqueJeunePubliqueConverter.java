package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.PaysOrganisateurRencontreGrandPubliqueJeunePublique;
import com.ird.faa.ws.rest.provided.vo.PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo;

@Component
public class PaysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter extends AbstractConverter<PaysOrganisateurRencontreGrandPubliqueJeunePublique,PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo>{

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean rencontreGrandPubliqueJeunePublique;
    private Boolean pays;

public  PaysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter(){
init(true);
}

@Override
public PaysOrganisateurRencontreGrandPubliqueJeunePublique toItem(PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo vo) {
if (vo == null) {
return null;
} else {
PaysOrganisateurRencontreGrandPubliqueJeunePublique item = new PaysOrganisateurRencontreGrandPubliqueJeunePublique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getRencontreGrandPubliqueJeunePubliqueVo()!=null && this.rencontreGrandPubliqueJeunePublique)
        item.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePubliqueConverter.toItem(vo.getRencontreGrandPubliqueJeunePubliqueVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;


return item;
}
}

@Override
public PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo toVo(PaysOrganisateurRencontreGrandPubliqueJeunePublique item) {
if (item == null) {
return null;
} else {
PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo vo = new PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getRencontreGrandPubliqueJeunePublique()!=null && this.rencontreGrandPubliqueJeunePublique) {
        vo.setRencontreGrandPubliqueJeunePubliqueVo(rencontreGrandPubliqueJeunePubliqueConverter.toVo(item.getRencontreGrandPubliqueJeunePublique())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    rencontreGrandPubliqueJeunePublique = value;
    pays = value;
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

    public boolean  isRencontreGrandPubliqueJeunePublique(){
    return this.rencontreGrandPubliqueJeunePublique;
    }
    public void  setRencontreGrandPubliqueJeunePublique(boolean rencontreGrandPubliqueJeunePublique){
    this.rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePublique;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }






}
