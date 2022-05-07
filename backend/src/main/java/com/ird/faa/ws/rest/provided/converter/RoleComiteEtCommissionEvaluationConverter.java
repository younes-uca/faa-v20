package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.RoleComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.vo.RoleComiteEtCommissionEvaluationVo;

@Component
public class RoleComiteEtCommissionEvaluationConverter extends AbstractConverter<RoleComiteEtCommissionEvaluation,RoleComiteEtCommissionEvaluationVo>{

        @Autowired
        private ComiteEtCommissionEvaluationConverter comiteEtCommissionEvaluationConverter ;
        @Autowired
        private RoleEvaluationConverter roleEvaluationConverter ;
    private Boolean roleEvaluation;
    private Boolean comiteEtCommissionEvaluation;

public  RoleComiteEtCommissionEvaluationConverter(){
init(true);
}

@Override
public RoleComiteEtCommissionEvaluation toItem(RoleComiteEtCommissionEvaluationVo vo) {
if (vo == null) {
return null;
} else {
RoleComiteEtCommissionEvaluation item = new RoleComiteEtCommissionEvaluation();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getRoleEvaluationVo()!=null && this.roleEvaluation)
        item.setRoleEvaluation(roleEvaluationConverter.toItem(vo.getRoleEvaluationVo())) ;
    if(vo.getComiteEtCommissionEvaluationVo()!=null && this.comiteEtCommissionEvaluation)
        item.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluationConverter.toItem(vo.getComiteEtCommissionEvaluationVo())) ;


return item;
}
}

@Override
public RoleComiteEtCommissionEvaluationVo toVo(RoleComiteEtCommissionEvaluation item) {
if (item == null) {
return null;
} else {
RoleComiteEtCommissionEvaluationVo vo = new RoleComiteEtCommissionEvaluationVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getRoleEvaluation()!=null && this.roleEvaluation) {
        vo.setRoleEvaluationVo(roleEvaluationConverter.toVo(item.getRoleEvaluation())) ;
    }
    if(item.getComiteEtCommissionEvaluation()!=null && this.comiteEtCommissionEvaluation) {
        vo.setComiteEtCommissionEvaluationVo(comiteEtCommissionEvaluationConverter.toVo(item.getComiteEtCommissionEvaluation())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    roleEvaluation = value;
    comiteEtCommissionEvaluation = value;
}


        public ComiteEtCommissionEvaluationConverter getComiteEtCommissionEvaluationConverter(){
        return this.comiteEtCommissionEvaluationConverter;
        }
        public void setComiteEtCommissionEvaluationConverter(ComiteEtCommissionEvaluationConverter comiteEtCommissionEvaluationConverter ){
        this.comiteEtCommissionEvaluationConverter = comiteEtCommissionEvaluationConverter;
        }
        public RoleEvaluationConverter getRoleEvaluationConverter(){
        return this.roleEvaluationConverter;
        }
        public void setRoleEvaluationConverter(RoleEvaluationConverter roleEvaluationConverter ){
        this.roleEvaluationConverter = roleEvaluationConverter;
        }

    public boolean  isRoleEvaluation(){
    return this.roleEvaluation;
    }
    public void  setRoleEvaluation(boolean roleEvaluation){
    this.roleEvaluation = roleEvaluation;
    }
    public boolean  isComiteEtCommissionEvaluation(){
    return this.comiteEtCommissionEvaluation;
    }
    public void  setComiteEtCommissionEvaluation(boolean comiteEtCommissionEvaluation){
    this.comiteEtCommissionEvaluation = comiteEtCommissionEvaluation;
    }






}
