package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ObjetFormationGeneriqueDeResponsabilitePedagogique;
import com.ird.faa.ws.rest.provided.vo.ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo;

@Component
public class ObjetFormationGeneriqueDeResponsabilitePedagogiqueConverter extends AbstractConverter<ObjetFormationGeneriqueDeResponsabilitePedagogique,ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo>{

        @Autowired
        private ObjetFormationGeneriqueConverter objetFormationGeneriqueConverter ;
        @Autowired
        private ResponsabilitePedagogiqueConverter responsabilitePedagogiqueConverter ;
    private Boolean objetFormationGenerique;
    private Boolean responsabilitePedagogique;

public  ObjetFormationGeneriqueDeResponsabilitePedagogiqueConverter(){
init(true);
}

@Override
public ObjetFormationGeneriqueDeResponsabilitePedagogique toItem(ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo vo) {
if (vo == null) {
return null;
} else {
ObjetFormationGeneriqueDeResponsabilitePedagogique item = new ObjetFormationGeneriqueDeResponsabilitePedagogique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getObjetFormationGeneriqueVo()!=null && this.objetFormationGenerique)
        item.setObjetFormationGenerique(objetFormationGeneriqueConverter.toItem(vo.getObjetFormationGeneriqueVo())) ;
    if(vo.getResponsabilitePedagogiqueVo()!=null && this.responsabilitePedagogique)
        item.setResponsabilitePedagogique(responsabilitePedagogiqueConverter.toItem(vo.getResponsabilitePedagogiqueVo())) ;


return item;
}
}

@Override
public ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo toVo(ObjetFormationGeneriqueDeResponsabilitePedagogique item) {
if (item == null) {
return null;
} else {
ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo vo = new ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getObjetFormationGenerique()!=null && this.objetFormationGenerique) {
        vo.setObjetFormationGeneriqueVo(objetFormationGeneriqueConverter.toVo(item.getObjetFormationGenerique())) ;
    }
    if(item.getResponsabilitePedagogique()!=null && this.responsabilitePedagogique) {
        vo.setResponsabilitePedagogiqueVo(responsabilitePedagogiqueConverter.toVo(item.getResponsabilitePedagogique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    objetFormationGenerique = value;
    responsabilitePedagogique = value;
}


        public ObjetFormationGeneriqueConverter getObjetFormationGeneriqueConverter(){
        return this.objetFormationGeneriqueConverter;
        }
        public void setObjetFormationGeneriqueConverter(ObjetFormationGeneriqueConverter objetFormationGeneriqueConverter ){
        this.objetFormationGeneriqueConverter = objetFormationGeneriqueConverter;
        }
        public ResponsabilitePedagogiqueConverter getResponsabilitePedagogiqueConverter(){
        return this.responsabilitePedagogiqueConverter;
        }
        public void setResponsabilitePedagogiqueConverter(ResponsabilitePedagogiqueConverter responsabilitePedagogiqueConverter ){
        this.responsabilitePedagogiqueConverter = responsabilitePedagogiqueConverter;
        }

    public boolean  isObjetFormationGenerique(){
    return this.objetFormationGenerique;
    }
    public void  setObjetFormationGenerique(boolean objetFormationGenerique){
    this.objetFormationGenerique = objetFormationGenerique;
    }
    public boolean  isResponsabilitePedagogique(){
    return this.responsabilitePedagogique;
    }
    public void  setResponsabilitePedagogique(boolean responsabilitePedagogique){
    this.responsabilitePedagogique = responsabilitePedagogique;
    }






}
