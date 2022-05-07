package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.TypeEtudeEnseignement;
import com.ird.faa.ws.rest.provided.vo.TypeEtudeEnseignementVo;

@Component
public class TypeEtudeEnseignementConverter extends AbstractConverter<TypeEtudeEnseignement,TypeEtudeEnseignementVo>{

        @Autowired
        private TypeEtudeConverter typeEtudeConverter ;
        @Autowired
        private EnseignementConverter enseignementConverter ;
    private Boolean enseignement;
    private Boolean typeEtude;

public  TypeEtudeEnseignementConverter(){
init(true);
}

@Override
public TypeEtudeEnseignement toItem(TypeEtudeEnseignementVo vo) {
if (vo == null) {
return null;
} else {
TypeEtudeEnseignement item = new TypeEtudeEnseignement();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEnseignementVo()!=null && this.enseignement)
        item.setEnseignement(enseignementConverter.toItem(vo.getEnseignementVo())) ;
    if(vo.getTypeEtudeVo()!=null && this.typeEtude)
        item.setTypeEtude(typeEtudeConverter.toItem(vo.getTypeEtudeVo())) ;


return item;
}
}

@Override
public TypeEtudeEnseignementVo toVo(TypeEtudeEnseignement item) {
if (item == null) {
return null;
} else {
TypeEtudeEnseignementVo vo = new TypeEtudeEnseignementVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEnseignement()!=null && this.enseignement) {
        vo.setEnseignementVo(enseignementConverter.toVo(item.getEnseignement())) ;
    }
    if(item.getTypeEtude()!=null && this.typeEtude) {
        vo.setTypeEtudeVo(typeEtudeConverter.toVo(item.getTypeEtude())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    enseignement = value;
    typeEtude = value;
}


        public TypeEtudeConverter getTypeEtudeConverter(){
        return this.typeEtudeConverter;
        }
        public void setTypeEtudeConverter(TypeEtudeConverter typeEtudeConverter ){
        this.typeEtudeConverter = typeEtudeConverter;
        }
        public EnseignementConverter getEnseignementConverter(){
        return this.enseignementConverter;
        }
        public void setEnseignementConverter(EnseignementConverter enseignementConverter ){
        this.enseignementConverter = enseignementConverter;
        }

    public boolean  isEnseignement(){
    return this.enseignement;
    }
    public void  setEnseignement(boolean enseignement){
    this.enseignement = enseignement;
    }
    public boolean  isTypeEtude(){
    return this.typeEtude;
    }
    public void  setTypeEtude(boolean typeEtude){
    this.typeEtude = typeEtude;
    }






}
