package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CultureScientifique;
import com.ird.faa.ws.rest.provided.vo.CultureScientifiqueVo;

@Component
public class CultureScientifiqueConverter extends AbstractConverter<CultureScientifique,CultureScientifiqueVo>{

        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private OutilPedagogiqueConverter outilPedagogiqueConverter ;
        @Autowired
        private RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter ;
        @Autowired
        private RencontreMediaConverter rencontreMediaConverter ;
        @Autowired
        private NatureActiviteGrandPubliqueConverter natureActiviteGrandPubliqueConverter ;
        @Autowired
        private CampagneConverter campagneConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean campagne;
    private Boolean chercheur;
    private Boolean etatEtapeCampagne;
    private Boolean natureActiviteGrandPublique;
        private Boolean rencontreGrandPubliqueJeunePubliques;
        private Boolean rencontreMedias;
        private Boolean outilPedagogiques;

public  CultureScientifiqueConverter(){
init(true);
}

@Override
public CultureScientifique toItem(CultureScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
CultureScientifique item = new CultureScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getAnnee()))
        item.setAnnee(NumberUtil.toLong(vo.getAnnee()));
        if(StringUtil.isNotEmpty(vo.getTempsEstimePourCetteAnnne()))
        item.setTempsEstimePourCetteAnnne(NumberUtil.toBigDecimal(vo.getTempsEstimePourCetteAnnne()));
    if(vo.getCampagneVo()!=null && this.campagne)
        item.setCampagne(campagneConverter.toItem(vo.getCampagneVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;
    if(vo.getNatureActiviteGrandPubliqueVo()!=null && this.natureActiviteGrandPublique)
        item.setNatureActiviteGrandPublique(natureActiviteGrandPubliqueConverter.toItem(vo.getNatureActiviteGrandPubliqueVo())) ;

    if(ListUtil.isNotEmpty(vo.getRencontreGrandPubliqueJeunePubliquesVo()) && this.rencontreGrandPubliqueJeunePubliques)
        item.setRencontreGrandPubliqueJeunePubliques(rencontreGrandPubliqueJeunePubliqueConverter.toItem(vo.getRencontreGrandPubliqueJeunePubliquesVo()));
    if(ListUtil.isNotEmpty(vo.getRencontreMediasVo()) && this.rencontreMedias)
        item.setRencontreMedias(rencontreMediaConverter.toItem(vo.getRencontreMediasVo()));
    if(ListUtil.isNotEmpty(vo.getOutilPedagogiquesVo()) && this.outilPedagogiques)
        item.setOutilPedagogiques(outilPedagogiqueConverter.toItem(vo.getOutilPedagogiquesVo()));

return item;
}
}

@Override
public CultureScientifiqueVo toVo(CultureScientifique item) {
if (item == null) {
return null;
} else {
CultureScientifiqueVo vo = new CultureScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getAnnee()!=null)
        vo.setAnnee(NumberUtil.toString(item.getAnnee()));

        if(item.getTempsEstimePourCetteAnnne()!=null)
        vo.setTempsEstimePourCetteAnnne(NumberUtil.toString(item.getTempsEstimePourCetteAnnne()));

    if(item.getCampagne()!=null && this.campagne) {
        vo.setCampagneVo(campagneConverter.toVo(item.getCampagne())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
    if(item.getNatureActiviteGrandPublique()!=null && this.natureActiviteGrandPublique) {
        vo.setNatureActiviteGrandPubliqueVo(natureActiviteGrandPubliqueConverter.toVo(item.getNatureActiviteGrandPublique())) ;
    }
        if(ListUtil.isNotEmpty(item.getRencontreGrandPubliqueJeunePubliques()) && this.rencontreGrandPubliqueJeunePubliques){
        rencontreGrandPubliqueJeunePubliqueConverter.init(true);
        rencontreGrandPubliqueJeunePubliqueConverter.setCultureScientifique(false);
        vo.setRencontreGrandPubliqueJeunePubliquesVo(rencontreGrandPubliqueJeunePubliqueConverter.toVo(item.getRencontreGrandPubliqueJeunePubliques()));
        rencontreGrandPubliqueJeunePubliqueConverter.setCultureScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getRencontreMedias()) && this.rencontreMedias){
        rencontreMediaConverter.init(true);
        rencontreMediaConverter.setCultureScientifique(false);
        vo.setRencontreMediasVo(rencontreMediaConverter.toVo(item.getRencontreMedias()));
        rencontreMediaConverter.setCultureScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getOutilPedagogiques()) && this.outilPedagogiques){
        outilPedagogiqueConverter.init(true);
        outilPedagogiqueConverter.setCultureScientifique(false);
        vo.setOutilPedagogiquesVo(outilPedagogiqueConverter.toVo(item.getOutilPedagogiques()));
        outilPedagogiqueConverter.setCultureScientifique(true);
        }

return vo;
}
}

public void init(Boolean value) {
    campagne = value;
    chercheur = value;
    etatEtapeCampagne = value;
    natureActiviteGrandPublique = value;
        rencontreGrandPubliqueJeunePubliques = value;
        rencontreMedias = value;
        outilPedagogiques = value;
}


        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public OutilPedagogiqueConverter getOutilPedagogiqueConverter(){
        return this.outilPedagogiqueConverter;
        }
        public void setOutilPedagogiqueConverter(OutilPedagogiqueConverter outilPedagogiqueConverter ){
        this.outilPedagogiqueConverter = outilPedagogiqueConverter;
        }
        public RencontreGrandPubliqueJeunePubliqueConverter getRencontreGrandPubliqueJeunePubliqueConverter(){
        return this.rencontreGrandPubliqueJeunePubliqueConverter;
        }
        public void setRencontreGrandPubliqueJeunePubliqueConverter(RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter ){
        this.rencontreGrandPubliqueJeunePubliqueConverter = rencontreGrandPubliqueJeunePubliqueConverter;
        }
        public RencontreMediaConverter getRencontreMediaConverter(){
        return this.rencontreMediaConverter;
        }
        public void setRencontreMediaConverter(RencontreMediaConverter rencontreMediaConverter ){
        this.rencontreMediaConverter = rencontreMediaConverter;
        }
        public NatureActiviteGrandPubliqueConverter getNatureActiviteGrandPubliqueConverter(){
        return this.natureActiviteGrandPubliqueConverter;
        }
        public void setNatureActiviteGrandPubliqueConverter(NatureActiviteGrandPubliqueConverter natureActiviteGrandPubliqueConverter ){
        this.natureActiviteGrandPubliqueConverter = natureActiviteGrandPubliqueConverter;
        }
        public CampagneConverter getCampagneConverter(){
        return this.campagneConverter;
        }
        public void setCampagneConverter(CampagneConverter campagneConverter ){
        this.campagneConverter = campagneConverter;
        }
        public ChercheurConverter getChercheurConverter(){
        return this.chercheurConverter;
        }
        public void setChercheurConverter(ChercheurConverter chercheurConverter ){
        this.chercheurConverter = chercheurConverter;
        }

    public boolean  isCampagne(){
    return this.campagne;
    }
    public void  setCampagne(boolean campagne){
    this.campagne = campagne;
    }
    public boolean  isChercheur(){
    return this.chercheur;
    }
    public void  setChercheur(boolean chercheur){
    this.chercheur = chercheur;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }
    public boolean  isNatureActiviteGrandPublique(){
    return this.natureActiviteGrandPublique;
    }
    public void  setNatureActiviteGrandPublique(boolean natureActiviteGrandPublique){
    this.natureActiviteGrandPublique = natureActiviteGrandPublique;
    }















        public Boolean  isRencontreGrandPubliqueJeunePubliques(){
        return this.rencontreGrandPubliqueJeunePubliques ;
        }
        public void  setRencontreGrandPubliqueJeunePubliques(Boolean rencontreGrandPubliqueJeunePubliques ){
        this.rencontreGrandPubliqueJeunePubliques  = rencontreGrandPubliqueJeunePubliques ;
        }



        public Boolean  isRencontreMedias(){
        return this.rencontreMedias ;
        }
        public void  setRencontreMedias(Boolean rencontreMedias ){
        this.rencontreMedias  = rencontreMedias ;
        }



        public Boolean  isOutilPedagogiques(){
        return this.outilPedagogiques ;
        }
        public void  setOutilPedagogiques(Boolean outilPedagogiques ){
        this.outilPedagogiques  = outilPedagogiques ;
        }


}
