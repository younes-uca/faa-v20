package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ResponsabilitePedagogiqueEtablissement;
import com.ird.faa.ws.rest.provided.vo.ResponsabilitePedagogiqueEtablissementVo;

@Component
public class ResponsabilitePedagogiqueEtablissementConverter extends AbstractConverter<ResponsabilitePedagogiqueEtablissement,ResponsabilitePedagogiqueEtablissementVo>{

        @Autowired
        private EtablissementConverter etablissementConverter ;
        @Autowired
        private ResponsabilitePedagogiqueConverter responsabilitePedagogiqueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean etablissement;
    private Boolean responsabilitePedagogique;
    private Boolean pays;

public  ResponsabilitePedagogiqueEtablissementConverter(){
init(true);
}

@Override
public ResponsabilitePedagogiqueEtablissement toItem(ResponsabilitePedagogiqueEtablissementVo vo) {
if (vo == null) {
return null;
} else {
ResponsabilitePedagogiqueEtablissement item = new ResponsabilitePedagogiqueEtablissement();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEtablissementVo()!=null && this.etablissement)
        item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;
    if(vo.getResponsabilitePedagogiqueVo()!=null && this.responsabilitePedagogique)
        item.setResponsabilitePedagogique(responsabilitePedagogiqueConverter.toItem(vo.getResponsabilitePedagogiqueVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;


return item;
}
}

@Override
public ResponsabilitePedagogiqueEtablissementVo toVo(ResponsabilitePedagogiqueEtablissement item) {
if (item == null) {
return null;
} else {
ResponsabilitePedagogiqueEtablissementVo vo = new ResponsabilitePedagogiqueEtablissementVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEtablissement()!=null && this.etablissement) {
        vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
    }
    if(item.getResponsabilitePedagogique()!=null && this.responsabilitePedagogique) {
        vo.setResponsabilitePedagogiqueVo(responsabilitePedagogiqueConverter.toVo(item.getResponsabilitePedagogique())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    etablissement = value;
    responsabilitePedagogique = value;
    pays = value;
}


        public EtablissementConverter getEtablissementConverter(){
        return this.etablissementConverter;
        }
        public void setEtablissementConverter(EtablissementConverter etablissementConverter ){
        this.etablissementConverter = etablissementConverter;
        }
        public ResponsabilitePedagogiqueConverter getResponsabilitePedagogiqueConverter(){
        return this.responsabilitePedagogiqueConverter;
        }
        public void setResponsabilitePedagogiqueConverter(ResponsabilitePedagogiqueConverter responsabilitePedagogiqueConverter ){
        this.responsabilitePedagogiqueConverter = responsabilitePedagogiqueConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }

    public boolean  isEtablissement(){
    return this.etablissement;
    }
    public void  setEtablissement(boolean etablissement){
    this.etablissement = etablissement;
    }
    public boolean  isResponsabilitePedagogique(){
    return this.responsabilitePedagogique;
    }
    public void  setResponsabilitePedagogique(boolean responsabilitePedagogique){
    this.responsabilitePedagogique = responsabilitePedagogique;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }








}
