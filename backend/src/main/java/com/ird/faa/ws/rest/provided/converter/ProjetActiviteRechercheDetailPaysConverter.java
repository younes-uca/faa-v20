package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ProjetActiviteRechercheDetailPays;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailPaysVo;

@Component
public class ProjetActiviteRechercheDetailPaysConverter extends AbstractConverter<ProjetActiviteRechercheDetailPays,ProjetActiviteRechercheDetailPaysVo>{

        @Autowired
        private ProjetActiviteRechercheDetailConverter projetActiviteRechercheDetailConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean pays;
    private Boolean projetActiviteRechercheDetail;

public  ProjetActiviteRechercheDetailPaysConverter(){
init(true);
}

@Override
public ProjetActiviteRechercheDetailPays toItem(ProjetActiviteRechercheDetailPaysVo vo) {
if (vo == null) {
return null;
} else {
ProjetActiviteRechercheDetailPays item = new ProjetActiviteRechercheDetailPays();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getProjetActiviteRechercheDetailVo()!=null && this.projetActiviteRechercheDetail)
        item.setProjetActiviteRechercheDetail(projetActiviteRechercheDetailConverter.toItem(vo.getProjetActiviteRechercheDetailVo())) ;


return item;
}
}

@Override
public ProjetActiviteRechercheDetailPaysVo toVo(ProjetActiviteRechercheDetailPays item) {
if (item == null) {
return null;
} else {
ProjetActiviteRechercheDetailPaysVo vo = new ProjetActiviteRechercheDetailPaysVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getProjetActiviteRechercheDetail()!=null && this.projetActiviteRechercheDetail) {
        vo.setProjetActiviteRechercheDetailVo(projetActiviteRechercheDetailConverter.toVo(item.getProjetActiviteRechercheDetail())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    pays = value;
    projetActiviteRechercheDetail = value;
}


        public ProjetActiviteRechercheDetailConverter getProjetActiviteRechercheDetailConverter(){
        return this.projetActiviteRechercheDetailConverter;
        }
        public void setProjetActiviteRechercheDetailConverter(ProjetActiviteRechercheDetailConverter projetActiviteRechercheDetailConverter ){
        this.projetActiviteRechercheDetailConverter = projetActiviteRechercheDetailConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }

    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }
    public boolean  isProjetActiviteRechercheDetail(){
    return this.projetActiviteRechercheDetail;
    }
    public void  setProjetActiviteRechercheDetail(boolean projetActiviteRechercheDetail){
    this.projetActiviteRechercheDetail = projetActiviteRechercheDetail;
    }






}
