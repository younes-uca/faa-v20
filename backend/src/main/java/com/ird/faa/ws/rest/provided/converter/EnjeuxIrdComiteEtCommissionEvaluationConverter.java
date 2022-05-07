package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EnjeuxIrdComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.vo.EnjeuxIrdComiteEtCommissionEvaluationVo;

@Component
public class EnjeuxIrdComiteEtCommissionEvaluationConverter extends AbstractConverter<EnjeuxIrdComiteEtCommissionEvaluation,EnjeuxIrdComiteEtCommissionEvaluationVo>{

        @Autowired
        private ComiteEtCommissionEvaluationConverter comiteEtCommissionEvaluationConverter ;
        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
    private Boolean enjeuxIrd;
    private Boolean comiteEtCommissionEvaluation;

public  EnjeuxIrdComiteEtCommissionEvaluationConverter(){
init(true);
}

@Override
public EnjeuxIrdComiteEtCommissionEvaluation toItem(EnjeuxIrdComiteEtCommissionEvaluationVo vo) {
if (vo == null) {
return null;
} else {
EnjeuxIrdComiteEtCommissionEvaluation item = new EnjeuxIrdComiteEtCommissionEvaluation();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;
    if(vo.getComiteEtCommissionEvaluationVo()!=null && this.comiteEtCommissionEvaluation)
        item.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluationConverter.toItem(vo.getComiteEtCommissionEvaluationVo())) ;


return item;
}
}

@Override
public EnjeuxIrdComiteEtCommissionEvaluationVo toVo(EnjeuxIrdComiteEtCommissionEvaluation item) {
if (item == null) {
return null;
} else {
EnjeuxIrdComiteEtCommissionEvaluationVo vo = new EnjeuxIrdComiteEtCommissionEvaluationVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }
    if(item.getComiteEtCommissionEvaluation()!=null && this.comiteEtCommissionEvaluation) {
        vo.setComiteEtCommissionEvaluationVo(comiteEtCommissionEvaluationConverter.toVo(item.getComiteEtCommissionEvaluation())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    enjeuxIrd = value;
    comiteEtCommissionEvaluation = value;
}


        public ComiteEtCommissionEvaluationConverter getComiteEtCommissionEvaluationConverter(){
        return this.comiteEtCommissionEvaluationConverter;
        }
        public void setComiteEtCommissionEvaluationConverter(ComiteEtCommissionEvaluationConverter comiteEtCommissionEvaluationConverter ){
        this.comiteEtCommissionEvaluationConverter = comiteEtCommissionEvaluationConverter;
        }
        public EnjeuxIrdConverter getEnjeuxIrdConverter(){
        return this.enjeuxIrdConverter;
        }
        public void setEnjeuxIrdConverter(EnjeuxIrdConverter enjeuxIrdConverter ){
        this.enjeuxIrdConverter = enjeuxIrdConverter;
        }

    public boolean  isEnjeuxIrd(){
    return this.enjeuxIrd;
    }
    public void  setEnjeuxIrd(boolean enjeuxIrd){
    this.enjeuxIrd = enjeuxIrd;
    }
    public boolean  isComiteEtCommissionEvaluation(){
    return this.comiteEtCommissionEvaluation;
    }
    public void  setComiteEtCommissionEvaluation(boolean comiteEtCommissionEvaluation){
    this.comiteEtCommissionEvaluation = comiteEtCommissionEvaluation;
    }






}
