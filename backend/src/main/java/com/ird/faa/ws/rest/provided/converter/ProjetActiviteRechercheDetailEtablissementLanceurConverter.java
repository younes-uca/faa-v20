package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ProjetActiviteRechercheDetailEtablissementLanceur;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailEtablissementLanceurVo;

@Component
public class ProjetActiviteRechercheDetailEtablissementLanceurConverter extends AbstractConverter<ProjetActiviteRechercheDetailEtablissementLanceur,ProjetActiviteRechercheDetailEtablissementLanceurVo>{

        @Autowired
        private ProjetActiviteRechercheDetailConverter projetActiviteRechercheDetailConverter ;
        @Autowired
        private EtablissementConverter etablissementConverter ;
    private Boolean etablissement;
    private Boolean projetActiviteRechercheDetail;

public  ProjetActiviteRechercheDetailEtablissementLanceurConverter(){
init(true);
}

@Override
public ProjetActiviteRechercheDetailEtablissementLanceur toItem(ProjetActiviteRechercheDetailEtablissementLanceurVo vo) {
if (vo == null) {
return null;
} else {
ProjetActiviteRechercheDetailEtablissementLanceur item = new ProjetActiviteRechercheDetailEtablissementLanceur();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEtablissementVo()!=null && this.etablissement)
        item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;
    if(vo.getProjetActiviteRechercheDetailVo()!=null && this.projetActiviteRechercheDetail)
        item.setProjetActiviteRechercheDetail(projetActiviteRechercheDetailConverter.toItem(vo.getProjetActiviteRechercheDetailVo())) ;


return item;
}
}

@Override
public ProjetActiviteRechercheDetailEtablissementLanceurVo toVo(ProjetActiviteRechercheDetailEtablissementLanceur item) {
if (item == null) {
return null;
} else {
ProjetActiviteRechercheDetailEtablissementLanceurVo vo = new ProjetActiviteRechercheDetailEtablissementLanceurVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEtablissement()!=null && this.etablissement) {
        vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
    }
    if(item.getProjetActiviteRechercheDetail()!=null && this.projetActiviteRechercheDetail) {
        vo.setProjetActiviteRechercheDetailVo(projetActiviteRechercheDetailConverter.toVo(item.getProjetActiviteRechercheDetail())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    etablissement = value;
    projetActiviteRechercheDetail = value;
}


        public ProjetActiviteRechercheDetailConverter getProjetActiviteRechercheDetailConverter(){
        return this.projetActiviteRechercheDetailConverter;
        }
        public void setProjetActiviteRechercheDetailConverter(ProjetActiviteRechercheDetailConverter projetActiviteRechercheDetailConverter ){
        this.projetActiviteRechercheDetailConverter = projetActiviteRechercheDetailConverter;
        }
        public EtablissementConverter getEtablissementConverter(){
        return this.etablissementConverter;
        }
        public void setEtablissementConverter(EtablissementConverter etablissementConverter ){
        this.etablissementConverter = etablissementConverter;
        }

    public boolean  isEtablissement(){
    return this.etablissement;
    }
    public void  setEtablissement(boolean etablissement){
    this.etablissement = etablissement;
    }
    public boolean  isProjetActiviteRechercheDetail(){
    return this.projetActiviteRechercheDetail;
    }
    public void  setProjetActiviteRechercheDetail(boolean projetActiviteRechercheDetail){
    this.projetActiviteRechercheDetail = projetActiviteRechercheDetail;
    }






}
