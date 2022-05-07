package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.TypeExpertiseEvaluationComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.vo.TypeExpertiseEvaluationComiteEtCommissionEvaluationVo;

@Component
public class TypeExpertiseEvaluationComiteEtCommissionEvaluationConverter extends AbstractConverter<TypeExpertiseEvaluationComiteEtCommissionEvaluation,TypeExpertiseEvaluationComiteEtCommissionEvaluationVo>{

        @Autowired
        private ComiteEtCommissionEvaluationConverter comiteEtCommissionEvaluationConverter ;
        @Autowired
        private TypeExpertiseEvaluationConverter typeExpertiseEvaluationConverter ;
    private Boolean typeExpertiseEvaluation;
    private Boolean comiteEtCommissionEvaluation;

public  TypeExpertiseEvaluationComiteEtCommissionEvaluationConverter(){
init(true);
}

@Override
public TypeExpertiseEvaluationComiteEtCommissionEvaluation toItem(TypeExpertiseEvaluationComiteEtCommissionEvaluationVo vo) {
if (vo == null) {
return null;
} else {
TypeExpertiseEvaluationComiteEtCommissionEvaluation item = new TypeExpertiseEvaluationComiteEtCommissionEvaluation();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getTypeExpertiseEvaluationVo()!=null && this.typeExpertiseEvaluation)
        item.setTypeExpertiseEvaluation(typeExpertiseEvaluationConverter.toItem(vo.getTypeExpertiseEvaluationVo())) ;
    if(vo.getComiteEtCommissionEvaluationVo()!=null && this.comiteEtCommissionEvaluation)
        item.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluationConverter.toItem(vo.getComiteEtCommissionEvaluationVo())) ;


return item;
}
}

@Override
public TypeExpertiseEvaluationComiteEtCommissionEvaluationVo toVo(TypeExpertiseEvaluationComiteEtCommissionEvaluation item) {
if (item == null) {
return null;
} else {
TypeExpertiseEvaluationComiteEtCommissionEvaluationVo vo = new TypeExpertiseEvaluationComiteEtCommissionEvaluationVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getTypeExpertiseEvaluation()!=null && this.typeExpertiseEvaluation) {
        vo.setTypeExpertiseEvaluationVo(typeExpertiseEvaluationConverter.toVo(item.getTypeExpertiseEvaluation())) ;
    }
    if(item.getComiteEtCommissionEvaluation()!=null && this.comiteEtCommissionEvaluation) {
        vo.setComiteEtCommissionEvaluationVo(comiteEtCommissionEvaluationConverter.toVo(item.getComiteEtCommissionEvaluation())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    typeExpertiseEvaluation = value;
    comiteEtCommissionEvaluation = value;
}


        public ComiteEtCommissionEvaluationConverter getComiteEtCommissionEvaluationConverter(){
        return this.comiteEtCommissionEvaluationConverter;
        }
        public void setComiteEtCommissionEvaluationConverter(ComiteEtCommissionEvaluationConverter comiteEtCommissionEvaluationConverter ){
        this.comiteEtCommissionEvaluationConverter = comiteEtCommissionEvaluationConverter;
        }
        public TypeExpertiseEvaluationConverter getTypeExpertiseEvaluationConverter(){
        return this.typeExpertiseEvaluationConverter;
        }
        public void setTypeExpertiseEvaluationConverter(TypeExpertiseEvaluationConverter typeExpertiseEvaluationConverter ){
        this.typeExpertiseEvaluationConverter = typeExpertiseEvaluationConverter;
        }

    public boolean  isTypeExpertiseEvaluation(){
    return this.typeExpertiseEvaluation;
    }
    public void  setTypeExpertiseEvaluation(boolean typeExpertiseEvaluation){
    this.typeExpertiseEvaluation = typeExpertiseEvaluation;
    }
    public boolean  isComiteEtCommissionEvaluation(){
    return this.comiteEtCommissionEvaluation;
    }
    public void  setComiteEtCommissionEvaluation(boolean comiteEtCommissionEvaluation){
    this.comiteEtCommissionEvaluation = comiteEtCommissionEvaluation;
    }






}
