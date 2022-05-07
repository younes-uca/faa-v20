package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EtablissementConseilsScientifique;
import com.ird.faa.ws.rest.provided.vo.EtablissementConseilsScientifiqueVo;

@Component
public class EtablissementConseilsScientifiqueConverter extends AbstractConverter<EtablissementConseilsScientifique,EtablissementConseilsScientifiqueVo>{

        @Autowired
        private ConseilsScientifiqueConverter conseilsScientifiqueConverter ;
        @Autowired
        private EtablissementConverter etablissementConverter ;
    private Boolean conseilsScientifique;
    private Boolean etablissement;

public  EtablissementConseilsScientifiqueConverter(){
init(true);
}

@Override
public EtablissementConseilsScientifique toItem(EtablissementConseilsScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
EtablissementConseilsScientifique item = new EtablissementConseilsScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getConseilsScientifiqueVo()!=null && this.conseilsScientifique)
        item.setConseilsScientifique(conseilsScientifiqueConverter.toItem(vo.getConseilsScientifiqueVo())) ;
    if(vo.getEtablissementVo()!=null && this.etablissement)
        item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;


return item;
}
}

@Override
public EtablissementConseilsScientifiqueVo toVo(EtablissementConseilsScientifique item) {
if (item == null) {
return null;
} else {
EtablissementConseilsScientifiqueVo vo = new EtablissementConseilsScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getConseilsScientifique()!=null && this.conseilsScientifique) {
        vo.setConseilsScientifiqueVo(conseilsScientifiqueConverter.toVo(item.getConseilsScientifique())) ;
    }
    if(item.getEtablissement()!=null && this.etablissement) {
        vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    conseilsScientifique = value;
    etablissement = value;
}


        public ConseilsScientifiqueConverter getConseilsScientifiqueConverter(){
        return this.conseilsScientifiqueConverter;
        }
        public void setConseilsScientifiqueConverter(ConseilsScientifiqueConverter conseilsScientifiqueConverter ){
        this.conseilsScientifiqueConverter = conseilsScientifiqueConverter;
        }
        public EtablissementConverter getEtablissementConverter(){
        return this.etablissementConverter;
        }
        public void setEtablissementConverter(EtablissementConverter etablissementConverter ){
        this.etablissementConverter = etablissementConverter;
        }

    public boolean  isConseilsScientifique(){
    return this.conseilsScientifique;
    }
    public void  setConseilsScientifique(boolean conseilsScientifique){
    this.conseilsScientifique = conseilsScientifique;
    }
    public boolean  isEtablissement(){
    return this.etablissement;
    }
    public void  setEtablissement(boolean etablissement){
    this.etablissement = etablissement;
    }






}
