package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.VieInstitutionnelleDetailEtablissement;
import com.ird.faa.ws.rest.provided.vo.VieInstitutionnelleDetailEtablissementVo;

@Component
public class VieInstitutionnelleDetailEtablissementConverter extends AbstractConverter<VieInstitutionnelleDetailEtablissement,VieInstitutionnelleDetailEtablissementVo>{

        @Autowired
        private VieInstitutionnelleDetailConverter vieInstitutionnelleDetailConverter ;
        @Autowired
        private EtablissementConverter etablissementConverter ;
    private Boolean vieInstitutionnelleDetail;
    private Boolean etablissement;

public  VieInstitutionnelleDetailEtablissementConverter(){
init(true);
}

@Override
public VieInstitutionnelleDetailEtablissement toItem(VieInstitutionnelleDetailEtablissementVo vo) {
if (vo == null) {
return null;
} else {
VieInstitutionnelleDetailEtablissement item = new VieInstitutionnelleDetailEtablissement();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getVieInstitutionnelleDetailVo()!=null && this.vieInstitutionnelleDetail)
        item.setVieInstitutionnelleDetail(vieInstitutionnelleDetailConverter.toItem(vo.getVieInstitutionnelleDetailVo())) ;
    if(vo.getEtablissementVo()!=null && this.etablissement)
        item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;


return item;
}
}

@Override
public VieInstitutionnelleDetailEtablissementVo toVo(VieInstitutionnelleDetailEtablissement item) {
if (item == null) {
return null;
} else {
VieInstitutionnelleDetailEtablissementVo vo = new VieInstitutionnelleDetailEtablissementVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getVieInstitutionnelleDetail()!=null && this.vieInstitutionnelleDetail) {
        vo.setVieInstitutionnelleDetailVo(vieInstitutionnelleDetailConverter.toVo(item.getVieInstitutionnelleDetail())) ;
    }
    if(item.getEtablissement()!=null && this.etablissement) {
        vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    vieInstitutionnelleDetail = value;
    etablissement = value;
}


        public VieInstitutionnelleDetailConverter getVieInstitutionnelleDetailConverter(){
        return this.vieInstitutionnelleDetailConverter;
        }
        public void setVieInstitutionnelleDetailConverter(VieInstitutionnelleDetailConverter vieInstitutionnelleDetailConverter ){
        this.vieInstitutionnelleDetailConverter = vieInstitutionnelleDetailConverter;
        }
        public EtablissementConverter getEtablissementConverter(){
        return this.etablissementConverter;
        }
        public void setEtablissementConverter(EtablissementConverter etablissementConverter ){
        this.etablissementConverter = etablissementConverter;
        }

    public boolean  isVieInstitutionnelleDetail(){
    return this.vieInstitutionnelleDetail;
    }
    public void  setVieInstitutionnelleDetail(boolean vieInstitutionnelleDetail){
    this.vieInstitutionnelleDetail = vieInstitutionnelleDetail;
    }
    public boolean  isEtablissement(){
    return this.etablissement;
    }
    public void  setEtablissement(boolean etablissement){
    this.etablissement = etablissement;
    }






}
