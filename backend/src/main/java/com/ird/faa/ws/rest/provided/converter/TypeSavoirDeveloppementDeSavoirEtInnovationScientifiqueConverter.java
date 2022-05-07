package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.TypeSavoirDeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.ws.rest.provided.vo.TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo;

@Component
public class TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter extends AbstractConverter<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique,TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo>{

        @Autowired
        private TypeSavoirConverter typeSavoirConverter ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ;
    private Boolean developpementDeSavoirEtInnovationScientifique;
    private Boolean typeSavoir;

public  TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter(){
init(true);
}

@Override
public TypeSavoirDeveloppementDeSavoirEtInnovationScientifique toItem(TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
TypeSavoirDeveloppementDeSavoirEtInnovationScientifique item = new TypeSavoirDeveloppementDeSavoirEtInnovationScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo()!=null && this.developpementDeSavoirEtInnovationScientifique)
        item.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifiqueConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo())) ;
    if(vo.getTypeSavoirVo()!=null && this.typeSavoir)
        item.setTypeSavoir(typeSavoirConverter.toItem(vo.getTypeSavoirVo())) ;


return item;
}
}

@Override
public TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo toVo(TypeSavoirDeveloppementDeSavoirEtInnovationScientifique item) {
if (item == null) {
return null;
} else {
TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo vo = new TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getDeveloppementDeSavoirEtInnovationScientifique()!=null && this.developpementDeSavoirEtInnovationScientifique) {
        vo.setDeveloppementDeSavoirEtInnovationScientifiqueVo(developpementDeSavoirEtInnovationScientifiqueConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifique())) ;
    }
    if(item.getTypeSavoir()!=null && this.typeSavoir) {
        vo.setTypeSavoirVo(typeSavoirConverter.toVo(item.getTypeSavoir())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    developpementDeSavoirEtInnovationScientifique = value;
    typeSavoir = value;
}


        public TypeSavoirConverter getTypeSavoirConverter(){
        return this.typeSavoirConverter;
        }
        public void setTypeSavoirConverter(TypeSavoirConverter typeSavoirConverter ){
        this.typeSavoirConverter = typeSavoirConverter;
        }
        public DeveloppementDeSavoirEtInnovationScientifiqueConverter getDeveloppementDeSavoirEtInnovationScientifiqueConverter(){
        return this.developpementDeSavoirEtInnovationScientifiqueConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiqueConverter(DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ){
        this.developpementDeSavoirEtInnovationScientifiqueConverter = developpementDeSavoirEtInnovationScientifiqueConverter;
        }

    public boolean  isDeveloppementDeSavoirEtInnovationScientifique(){
    return this.developpementDeSavoirEtInnovationScientifique;
    }
    public void  setDeveloppementDeSavoirEtInnovationScientifique(boolean developpementDeSavoirEtInnovationScientifique){
    this.developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifique;
    }
    public boolean  isTypeSavoir(){
    return this.typeSavoir;
    }
    public void  setTypeSavoir(boolean typeSavoir){
    this.typeSavoir = typeSavoir;
    }






}
