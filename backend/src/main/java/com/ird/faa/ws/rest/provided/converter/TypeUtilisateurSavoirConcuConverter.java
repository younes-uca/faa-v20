package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.TypeUtilisateurSavoirConcu;
import com.ird.faa.ws.rest.provided.vo.TypeUtilisateurSavoirConcuVo;

@Component
public class TypeUtilisateurSavoirConcuConverter extends AbstractConverter<TypeUtilisateurSavoirConcu,TypeUtilisateurSavoirConcuVo>{

        @Autowired
        private TypeUtilisateurConverter typeUtilisateurConverter ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ;
    private Boolean typeUtilisateur;
    private Boolean developpementDeSavoirEtInnovationScientifique;

public  TypeUtilisateurSavoirConcuConverter(){
init(true);
}

@Override
public TypeUtilisateurSavoirConcu toItem(TypeUtilisateurSavoirConcuVo vo) {
if (vo == null) {
return null;
} else {
TypeUtilisateurSavoirConcu item = new TypeUtilisateurSavoirConcu();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getTypeUtilisateurVo()!=null && this.typeUtilisateur)
        item.setTypeUtilisateur(typeUtilisateurConverter.toItem(vo.getTypeUtilisateurVo())) ;
    if(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo()!=null && this.developpementDeSavoirEtInnovationScientifique)
        item.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifiqueConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo())) ;


return item;
}
}

@Override
public TypeUtilisateurSavoirConcuVo toVo(TypeUtilisateurSavoirConcu item) {
if (item == null) {
return null;
} else {
TypeUtilisateurSavoirConcuVo vo = new TypeUtilisateurSavoirConcuVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getTypeUtilisateur()!=null && this.typeUtilisateur) {
        vo.setTypeUtilisateurVo(typeUtilisateurConverter.toVo(item.getTypeUtilisateur())) ;
    }
    if(item.getDeveloppementDeSavoirEtInnovationScientifique()!=null && this.developpementDeSavoirEtInnovationScientifique) {
        vo.setDeveloppementDeSavoirEtInnovationScientifiqueVo(developpementDeSavoirEtInnovationScientifiqueConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    typeUtilisateur = value;
    developpementDeSavoirEtInnovationScientifique = value;
}


        public TypeUtilisateurConverter getTypeUtilisateurConverter(){
        return this.typeUtilisateurConverter;
        }
        public void setTypeUtilisateurConverter(TypeUtilisateurConverter typeUtilisateurConverter ){
        this.typeUtilisateurConverter = typeUtilisateurConverter;
        }
        public DeveloppementDeSavoirEtInnovationScientifiqueConverter getDeveloppementDeSavoirEtInnovationScientifiqueConverter(){
        return this.developpementDeSavoirEtInnovationScientifiqueConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiqueConverter(DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ){
        this.developpementDeSavoirEtInnovationScientifiqueConverter = developpementDeSavoirEtInnovationScientifiqueConverter;
        }

    public boolean  isTypeUtilisateur(){
    return this.typeUtilisateur;
    }
    public void  setTypeUtilisateur(boolean typeUtilisateur){
    this.typeUtilisateur = typeUtilisateur;
    }
    public boolean  isDeveloppementDeSavoirEtInnovationScientifique(){
    return this.developpementDeSavoirEtInnovationScientifique;
    }
    public void  setDeveloppementDeSavoirEtInnovationScientifique(boolean developpementDeSavoirEtInnovationScientifique){
    this.developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifique;
    }






}
