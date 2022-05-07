package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EtablissementEnseignement;
import com.ird.faa.ws.rest.provided.vo.EtablissementEnseignementVo;

@Component
public class EtablissementEnseignementConverter extends AbstractConverter<EtablissementEnseignement,EtablissementEnseignementVo>{

        @Autowired
        private EnseignementConverter enseignementConverter ;
        @Autowired
        private EtablissementConverter etablissementConverter ;
    private Boolean etablissement;
    private Boolean enseignement;

public  EtablissementEnseignementConverter(){
init(true);
}

@Override
public EtablissementEnseignement toItem(EtablissementEnseignementVo vo) {
if (vo == null) {
return null;
} else {
EtablissementEnseignement item = new EtablissementEnseignement();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEtablissementVo()!=null && this.etablissement)
        item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;
    if(vo.getEnseignementVo()!=null && this.enseignement)
        item.setEnseignement(enseignementConverter.toItem(vo.getEnseignementVo())) ;


return item;
}
}

@Override
public EtablissementEnseignementVo toVo(EtablissementEnseignement item) {
if (item == null) {
return null;
} else {
EtablissementEnseignementVo vo = new EtablissementEnseignementVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEtablissement()!=null && this.etablissement) {
        vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
    }
    if(item.getEnseignement()!=null && this.enseignement) {
        vo.setEnseignementVo(enseignementConverter.toVo(item.getEnseignement())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    etablissement = value;
    enseignement = value;
}


        public EnseignementConverter getEnseignementConverter(){
        return this.enseignementConverter;
        }
        public void setEnseignementConverter(EnseignementConverter enseignementConverter ){
        this.enseignementConverter = enseignementConverter;
        }
        public EtablissementConverter getEtablissementConverter(){
        return this.etablissementConverter;
        }
        public void setEtablissementConverter(EtablissementConverter etablissementConverter ){
        this.etablissementConverter = etablissementConverter;
        }

    public boolean  isEtablissement(){
    return this.etablissement;
    }
    public void  setEtablissement(boolean etablissement){
    this.etablissement = etablissement;
    }
    public boolean  isEnseignement(){
    return this.enseignement;
    }
    public void  setEnseignement(boolean enseignement){
    this.enseignement = enseignement;
    }






}
