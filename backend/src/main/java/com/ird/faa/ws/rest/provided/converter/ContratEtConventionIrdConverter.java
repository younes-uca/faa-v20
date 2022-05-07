package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ContratEtConventionIrd;
import com.ird.faa.ws.rest.provided.vo.ContratEtConventionIrdVo;

@Component
public class ContratEtConventionIrdConverter extends AbstractConverter<ContratEtConventionIrd,ContratEtConventionIrdVo>{

        @Autowired
        private SavoirEtInnovationConverter savoirEtInnovationConverter ;
        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private StatusContratEtConventionConverter statusContratEtConventionConverter ;
    private Boolean statusContratEtConvention;
    private Boolean savoirEtInnovation;
    private Boolean etatEtapeCampagne;

public  ContratEtConventionIrdConverter(){
init(true);
}

@Override
public ContratEtConventionIrd toItem(ContratEtConventionIrdVo vo) {
if (vo == null) {
return null;
} else {
ContratEtConventionIrd item = new ContratEtConventionIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getNumero()))
        item.setNumero(vo.getNumero());
        if(StringUtil.isNotEmpty(vo.getDateContrat()))
        item.setDateContrat(DateUtil.parse(vo.getDateContrat()));
        if(StringUtil.isNotEmpty(vo.getIntitule()))
        item.setIntitule(vo.getIntitule());
        if(StringUtil.isNotEmpty(vo.getDescription()))
        item.setDescription(vo.getDescription());
    if(vo.getStatusContratEtConventionVo()!=null && this.statusContratEtConvention)
        item.setStatusContratEtConvention(statusContratEtConventionConverter.toItem(vo.getStatusContratEtConventionVo())) ;
    if(vo.getSavoirEtInnovationVo()!=null && this.savoirEtInnovation)
        item.setSavoirEtInnovation(savoirEtInnovationConverter.toItem(vo.getSavoirEtInnovationVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;


return item;
}
}

@Override
public ContratEtConventionIrdVo toVo(ContratEtConventionIrd item) {
if (item == null) {
return null;
} else {
ContratEtConventionIrdVo vo = new ContratEtConventionIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getNumero()))
        vo.setNumero(item.getNumero());

        if(item.getDateContrat()!=null)
        vo.setDateContrat(DateUtil.formateDate(item.getDateContrat()));
        if(StringUtil.isNotEmpty(item.getIntitule()))
        vo.setIntitule(item.getIntitule());

        if(StringUtil.isNotEmpty(item.getDescription()))
        vo.setDescription(item.getDescription());

    if(item.getStatusContratEtConvention()!=null && this.statusContratEtConvention) {
        vo.setStatusContratEtConventionVo(statusContratEtConventionConverter.toVo(item.getStatusContratEtConvention())) ;
    }
    if(item.getSavoirEtInnovation()!=null && this.savoirEtInnovation) {
        vo.setSavoirEtInnovationVo(savoirEtInnovationConverter.toVo(item.getSavoirEtInnovation())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    statusContratEtConvention = value;
    savoirEtInnovation = value;
    etatEtapeCampagne = value;
}


        public SavoirEtInnovationConverter getSavoirEtInnovationConverter(){
        return this.savoirEtInnovationConverter;
        }
        public void setSavoirEtInnovationConverter(SavoirEtInnovationConverter savoirEtInnovationConverter ){
        this.savoirEtInnovationConverter = savoirEtInnovationConverter;
        }
        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public StatusContratEtConventionConverter getStatusContratEtConventionConverter(){
        return this.statusContratEtConventionConverter;
        }
        public void setStatusContratEtConventionConverter(StatusContratEtConventionConverter statusContratEtConventionConverter ){
        this.statusContratEtConventionConverter = statusContratEtConventionConverter;
        }

    public boolean  isStatusContratEtConvention(){
    return this.statusContratEtConvention;
    }
    public void  setStatusContratEtConvention(boolean statusContratEtConvention){
    this.statusContratEtConvention = statusContratEtConvention;
    }
    public boolean  isSavoirEtInnovation(){
    return this.savoirEtInnovation;
    }
    public void  setSavoirEtInnovation(boolean savoirEtInnovation){
    this.savoirEtInnovation = savoirEtInnovation;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }
















}
