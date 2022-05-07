package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.NiveauEtudeEnseignement;
import com.ird.faa.ws.rest.provided.vo.NiveauEtudeEnseignementVo;

@Component
public class NiveauEtudeEnseignementConverter extends AbstractConverter<NiveauEtudeEnseignement,NiveauEtudeEnseignementVo>{

        @Autowired
        private EnseignementConverter enseignementConverter ;
        @Autowired
        private NiveauEtudeConverter niveauEtudeConverter ;
    private Boolean niveauEtude;
    private Boolean enseignement;

public  NiveauEtudeEnseignementConverter(){
init(true);
}

@Override
public NiveauEtudeEnseignement toItem(NiveauEtudeEnseignementVo vo) {
if (vo == null) {
return null;
} else {
NiveauEtudeEnseignement item = new NiveauEtudeEnseignement();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getNiveauEtudeVo()!=null && this.niveauEtude)
        item.setNiveauEtude(niveauEtudeConverter.toItem(vo.getNiveauEtudeVo())) ;
    if(vo.getEnseignementVo()!=null && this.enseignement)
        item.setEnseignement(enseignementConverter.toItem(vo.getEnseignementVo())) ;


return item;
}
}

@Override
public NiveauEtudeEnseignementVo toVo(NiveauEtudeEnseignement item) {
if (item == null) {
return null;
} else {
NiveauEtudeEnseignementVo vo = new NiveauEtudeEnseignementVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getNiveauEtude()!=null && this.niveauEtude) {
        vo.setNiveauEtudeVo(niveauEtudeConverter.toVo(item.getNiveauEtude())) ;
    }
    if(item.getEnseignement()!=null && this.enseignement) {
        vo.setEnseignementVo(enseignementConverter.toVo(item.getEnseignement())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    niveauEtude = value;
    enseignement = value;
}


        public EnseignementConverter getEnseignementConverter(){
        return this.enseignementConverter;
        }
        public void setEnseignementConverter(EnseignementConverter enseignementConverter ){
        this.enseignementConverter = enseignementConverter;
        }
        public NiveauEtudeConverter getNiveauEtudeConverter(){
        return this.niveauEtudeConverter;
        }
        public void setNiveauEtudeConverter(NiveauEtudeConverter niveauEtudeConverter ){
        this.niveauEtudeConverter = niveauEtudeConverter;
        }

    public boolean  isNiveauEtude(){
    return this.niveauEtude;
    }
    public void  setNiveauEtude(boolean niveauEtude){
    this.niveauEtude = niveauEtude;
    }
    public boolean  isEnseignement(){
    return this.enseignement;
    }
    public void  setEnseignement(boolean enseignement){
    this.enseignement = enseignement;
    }






}
