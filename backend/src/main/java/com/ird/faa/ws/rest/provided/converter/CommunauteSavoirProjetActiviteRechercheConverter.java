package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CommunauteSavoirProjetActiviteRecherche;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirProjetActiviteRechercheVo;

@Component
public class CommunauteSavoirProjetActiviteRechercheConverter extends AbstractConverter<CommunauteSavoirProjetActiviteRecherche,CommunauteSavoirProjetActiviteRechercheVo>{

        @Autowired
        private ProjetActiviteRechercheConverter projetActiviteRechercheConverter ;
        @Autowired
        private CommunauteSavoirConverter communauteSavoirConverter ;
    private Boolean projetActiviteRecherche;
    private Boolean communauteSavoir;

public  CommunauteSavoirProjetActiviteRechercheConverter(){
init(true);
}

@Override
public CommunauteSavoirProjetActiviteRecherche toItem(CommunauteSavoirProjetActiviteRechercheVo vo) {
if (vo == null) {
return null;
} else {
CommunauteSavoirProjetActiviteRecherche item = new CommunauteSavoirProjetActiviteRecherche();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getProjetActiviteRechercheVo()!=null && this.projetActiviteRecherche)
        item.setProjetActiviteRecherche(projetActiviteRechercheConverter.toItem(vo.getProjetActiviteRechercheVo())) ;
    if(vo.getCommunauteSavoirVo()!=null && this.communauteSavoir)
        item.setCommunauteSavoir(communauteSavoirConverter.toItem(vo.getCommunauteSavoirVo())) ;


return item;
}
}

@Override
public CommunauteSavoirProjetActiviteRechercheVo toVo(CommunauteSavoirProjetActiviteRecherche item) {
if (item == null) {
return null;
} else {
CommunauteSavoirProjetActiviteRechercheVo vo = new CommunauteSavoirProjetActiviteRechercheVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getProjetActiviteRecherche()!=null && this.projetActiviteRecherche) {
        vo.setProjetActiviteRechercheVo(projetActiviteRechercheConverter.toVo(item.getProjetActiviteRecherche())) ;
    }
    if(item.getCommunauteSavoir()!=null && this.communauteSavoir) {
        vo.setCommunauteSavoirVo(communauteSavoirConverter.toVo(item.getCommunauteSavoir())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    projetActiviteRecherche = value;
    communauteSavoir = value;
}


        public ProjetActiviteRechercheConverter getProjetActiviteRechercheConverter(){
        return this.projetActiviteRechercheConverter;
        }
        public void setProjetActiviteRechercheConverter(ProjetActiviteRechercheConverter projetActiviteRechercheConverter ){
        this.projetActiviteRechercheConverter = projetActiviteRechercheConverter;
        }
        public CommunauteSavoirConverter getCommunauteSavoirConverter(){
        return this.communauteSavoirConverter;
        }
        public void setCommunauteSavoirConverter(CommunauteSavoirConverter communauteSavoirConverter ){
        this.communauteSavoirConverter = communauteSavoirConverter;
        }

    public boolean  isProjetActiviteRecherche(){
    return this.projetActiviteRecherche;
    }
    public void  setProjetActiviteRecherche(boolean projetActiviteRecherche){
    this.projetActiviteRecherche = projetActiviteRecherche;
    }
    public boolean  isCommunauteSavoir(){
    return this.communauteSavoir;
    }
    public void  setCommunauteSavoir(boolean communauteSavoir){
    this.communauteSavoir = communauteSavoir;
    }






}
