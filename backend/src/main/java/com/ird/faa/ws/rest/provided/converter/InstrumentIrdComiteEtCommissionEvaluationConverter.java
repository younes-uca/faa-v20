package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.InstrumentIrdComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.vo.InstrumentIrdComiteEtCommissionEvaluationVo;

@Component
public class InstrumentIrdComiteEtCommissionEvaluationConverter extends AbstractConverter<InstrumentIrdComiteEtCommissionEvaluation,InstrumentIrdComiteEtCommissionEvaluationVo>{

        @Autowired
        private TypeInstrumentIrdConverter typeInstrumentIrdConverter ;
        @Autowired
        private ComiteEtCommissionEvaluationConverter comiteEtCommissionEvaluationConverter ;
        @Autowired
        private InstrumentIrdConverter instrumentIrdConverter ;
    private Boolean instrumentIrd;
    private Boolean typeInstrumentIrd;
    private Boolean comiteEtCommissionEvaluation;

public  InstrumentIrdComiteEtCommissionEvaluationConverter(){
init(true);
}

@Override
public InstrumentIrdComiteEtCommissionEvaluation toItem(InstrumentIrdComiteEtCommissionEvaluationVo vo) {
if (vo == null) {
return null;
} else {
InstrumentIrdComiteEtCommissionEvaluation item = new InstrumentIrdComiteEtCommissionEvaluation();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getInstrumentIrdVo()!=null && this.instrumentIrd)
        item.setInstrumentIrd(instrumentIrdConverter.toItem(vo.getInstrumentIrdVo())) ;
    if(vo.getTypeInstrumentIrdVo()!=null && this.typeInstrumentIrd)
        item.setTypeInstrumentIrd(typeInstrumentIrdConverter.toItem(vo.getTypeInstrumentIrdVo())) ;
    if(vo.getComiteEtCommissionEvaluationVo()!=null && this.comiteEtCommissionEvaluation)
        item.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluationConverter.toItem(vo.getComiteEtCommissionEvaluationVo())) ;


return item;
}
}

@Override
public InstrumentIrdComiteEtCommissionEvaluationVo toVo(InstrumentIrdComiteEtCommissionEvaluation item) {
if (item == null) {
return null;
} else {
InstrumentIrdComiteEtCommissionEvaluationVo vo = new InstrumentIrdComiteEtCommissionEvaluationVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getInstrumentIrd()!=null && this.instrumentIrd) {
        vo.setInstrumentIrdVo(instrumentIrdConverter.toVo(item.getInstrumentIrd())) ;
    }
    if(item.getTypeInstrumentIrd()!=null && this.typeInstrumentIrd) {
        vo.setTypeInstrumentIrdVo(typeInstrumentIrdConverter.toVo(item.getTypeInstrumentIrd())) ;
    }
    if(item.getComiteEtCommissionEvaluation()!=null && this.comiteEtCommissionEvaluation) {
        vo.setComiteEtCommissionEvaluationVo(comiteEtCommissionEvaluationConverter.toVo(item.getComiteEtCommissionEvaluation())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    instrumentIrd = value;
    typeInstrumentIrd = value;
    comiteEtCommissionEvaluation = value;
}


        public TypeInstrumentIrdConverter getTypeInstrumentIrdConverter(){
        return this.typeInstrumentIrdConverter;
        }
        public void setTypeInstrumentIrdConverter(TypeInstrumentIrdConverter typeInstrumentIrdConverter ){
        this.typeInstrumentIrdConverter = typeInstrumentIrdConverter;
        }
        public ComiteEtCommissionEvaluationConverter getComiteEtCommissionEvaluationConverter(){
        return this.comiteEtCommissionEvaluationConverter;
        }
        public void setComiteEtCommissionEvaluationConverter(ComiteEtCommissionEvaluationConverter comiteEtCommissionEvaluationConverter ){
        this.comiteEtCommissionEvaluationConverter = comiteEtCommissionEvaluationConverter;
        }
        public InstrumentIrdConverter getInstrumentIrdConverter(){
        return this.instrumentIrdConverter;
        }
        public void setInstrumentIrdConverter(InstrumentIrdConverter instrumentIrdConverter ){
        this.instrumentIrdConverter = instrumentIrdConverter;
        }

    public boolean  isInstrumentIrd(){
    return this.instrumentIrd;
    }
    public void  setInstrumentIrd(boolean instrumentIrd){
    this.instrumentIrd = instrumentIrd;
    }
    public boolean  isTypeInstrumentIrd(){
    return this.typeInstrumentIrd;
    }
    public void  setTypeInstrumentIrd(boolean typeInstrumentIrd){
    this.typeInstrumentIrd = typeInstrumentIrd;
    }
    public boolean  isComiteEtCommissionEvaluation(){
    return this.comiteEtCommissionEvaluation;
    }
    public void  setComiteEtCommissionEvaluation(boolean comiteEtCommissionEvaluation){
    this.comiteEtCommissionEvaluation = comiteEtCommissionEvaluation;
    }








}
