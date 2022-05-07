package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DistinctionEtablissementPays;
import com.ird.faa.ws.rest.provided.vo.DistinctionEtablissementPaysVo;

@Component
public class DistinctionEtablissementPaysConverter extends AbstractConverter<DistinctionEtablissementPays,DistinctionEtablissementPaysVo>{

        @Autowired
        private DistinctionConverter distinctionConverter ;
        @Autowired
        private EtablissementConverter etablissementConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean pays;
    private Boolean etablissement;
    private Boolean distinction;

public  DistinctionEtablissementPaysConverter(){
init(true);
}

@Override
public DistinctionEtablissementPays toItem(DistinctionEtablissementPaysVo vo) {
if (vo == null) {
return null;
} else {
DistinctionEtablissementPays item = new DistinctionEtablissementPays();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getEtablissementVo()!=null && this.etablissement)
        item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;
    if(vo.getDistinctionVo()!=null && this.distinction)
        item.setDistinction(distinctionConverter.toItem(vo.getDistinctionVo())) ;


return item;
}
}

@Override
public DistinctionEtablissementPaysVo toVo(DistinctionEtablissementPays item) {
if (item == null) {
return null;
} else {
DistinctionEtablissementPaysVo vo = new DistinctionEtablissementPaysVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getEtablissement()!=null && this.etablissement) {
        vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
    }
    if(item.getDistinction()!=null && this.distinction) {
        vo.setDistinctionVo(distinctionConverter.toVo(item.getDistinction())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    pays = value;
    etablissement = value;
    distinction = value;
}


        public DistinctionConverter getDistinctionConverter(){
        return this.distinctionConverter;
        }
        public void setDistinctionConverter(DistinctionConverter distinctionConverter ){
        this.distinctionConverter = distinctionConverter;
        }
        public EtablissementConverter getEtablissementConverter(){
        return this.etablissementConverter;
        }
        public void setEtablissementConverter(EtablissementConverter etablissementConverter ){
        this.etablissementConverter = etablissementConverter;
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
    public boolean  isEtablissement(){
    return this.etablissement;
    }
    public void  setEtablissement(boolean etablissement){
    this.etablissement = etablissement;
    }
    public boolean  isDistinction(){
    return this.distinction;
    }
    public void  setDistinction(boolean distinction){
    this.distinction = distinction;
    }








}
