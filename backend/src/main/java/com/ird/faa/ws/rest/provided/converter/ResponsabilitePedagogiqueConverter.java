package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ResponsabilitePedagogique;
import com.ird.faa.ws.rest.provided.vo.ResponsabilitePedagogiqueVo;

@Component
public class ResponsabilitePedagogiqueConverter extends AbstractConverter<ResponsabilitePedagogique,ResponsabilitePedagogiqueVo>{

        @Autowired
        private EnseignementEtFormationConverter enseignementEtFormationConverter ;
        @Autowired
        private StatusCursusConverter statusCursusConverter ;
        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private NiveauResponsabilitePedagogiqueConverter niveauResponsabilitePedagogiqueConverter ;
        @Autowired
        private ResponsabilitePedagogiqueEtablissementConverter responsabilitePedagogiqueEtablissementConverter ;
        @Autowired
        private ResponsabilitePedagogiqueEnjeuxIrdConverter responsabilitePedagogiqueEnjeuxIrdConverter ;
        @Autowired
        private ResponsabilitePedagogiquePaysConverter responsabilitePedagogiquePaysConverter ;
    private Boolean niveauResponsabilitePedagogique;
    private Boolean statusCursus;
    private Boolean etatEtapeCampagne;
    private Boolean enseignementEtFormation;
        private Boolean responsabilitePedagogiqueEnjeuxIrds;
        private Boolean responsabilitePedagogiqueEtablissements;
        private Boolean responsabilitePedagogiquePayss;

public  ResponsabilitePedagogiqueConverter(){
init(true);
}

@Override
public ResponsabilitePedagogique toItem(ResponsabilitePedagogiqueVo vo) {
if (vo == null) {
return null;
} else {
ResponsabilitePedagogique item = new ResponsabilitePedagogique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getIntituleCursus()))
        item.setIntituleCursus(vo.getIntituleCursus());
            if(vo.getServiceRenforcementCapacite() != null)
            item.setServiceRenforcementCapacite(vo.getServiceRenforcementCapacite());
            if(vo.getCursusConstruitAvecEtablissements() != null)
            item.setCursusConstruitAvecEtablissements(vo.getCursusConstruitAvecEtablissements());
    if(vo.getNiveauResponsabilitePedagogiqueVo()!=null && this.niveauResponsabilitePedagogique)
        item.setNiveauResponsabilitePedagogique(niveauResponsabilitePedagogiqueConverter.toItem(vo.getNiveauResponsabilitePedagogiqueVo())) ;
    if(vo.getStatusCursusVo()!=null && this.statusCursus)
        item.setStatusCursus(statusCursusConverter.toItem(vo.getStatusCursusVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;
    if(vo.getEnseignementEtFormationVo()!=null && this.enseignementEtFormation)
        item.setEnseignementEtFormation(enseignementEtFormationConverter.toItem(vo.getEnseignementEtFormationVo())) ;

    if(ListUtil.isNotEmpty(vo.getResponsabilitePedagogiqueEnjeuxIrdsVo()) && this.responsabilitePedagogiqueEnjeuxIrds)
        item.setResponsabilitePedagogiqueEnjeuxIrds(responsabilitePedagogiqueEnjeuxIrdConverter.toItem(vo.getResponsabilitePedagogiqueEnjeuxIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getResponsabilitePedagogiqueEtablissementsVo()) && this.responsabilitePedagogiqueEtablissements)
        item.setResponsabilitePedagogiqueEtablissements(responsabilitePedagogiqueEtablissementConverter.toItem(vo.getResponsabilitePedagogiqueEtablissementsVo()));
    if(ListUtil.isNotEmpty(vo.getResponsabilitePedagogiquePayssVo()) && this.responsabilitePedagogiquePayss)
        item.setResponsabilitePedagogiquePayss(responsabilitePedagogiquePaysConverter.toItem(vo.getResponsabilitePedagogiquePayssVo()));

return item;
}
}

@Override
public ResponsabilitePedagogiqueVo toVo(ResponsabilitePedagogique item) {
if (item == null) {
return null;
} else {
ResponsabilitePedagogiqueVo vo = new ResponsabilitePedagogiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getIntituleCursus()))
        vo.setIntituleCursus(item.getIntituleCursus());

        if(item.getServiceRenforcementCapacite()!=null)
        vo.setServiceRenforcementCapacite(item.getServiceRenforcementCapacite());
        if(item.getCursusConstruitAvecEtablissements()!=null)
        vo.setCursusConstruitAvecEtablissements(item.getCursusConstruitAvecEtablissements());
    if(item.getNiveauResponsabilitePedagogique()!=null && this.niveauResponsabilitePedagogique) {
        vo.setNiveauResponsabilitePedagogiqueVo(niveauResponsabilitePedagogiqueConverter.toVo(item.getNiveauResponsabilitePedagogique())) ;
    }
    if(item.getStatusCursus()!=null && this.statusCursus) {
        vo.setStatusCursusVo(statusCursusConverter.toVo(item.getStatusCursus())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
    if(item.getEnseignementEtFormation()!=null && this.enseignementEtFormation) {
        vo.setEnseignementEtFormationVo(enseignementEtFormationConverter.toVo(item.getEnseignementEtFormation())) ;
    }
        if(ListUtil.isNotEmpty(item.getResponsabilitePedagogiqueEnjeuxIrds()) && this.responsabilitePedagogiqueEnjeuxIrds){
        responsabilitePedagogiqueEnjeuxIrdConverter.init(true);
        responsabilitePedagogiqueEnjeuxIrdConverter.setResponsabilitePedagogique(false);
        vo.setResponsabilitePedagogiqueEnjeuxIrdsVo(responsabilitePedagogiqueEnjeuxIrdConverter.toVo(item.getResponsabilitePedagogiqueEnjeuxIrds()));
        responsabilitePedagogiqueEnjeuxIrdConverter.setResponsabilitePedagogique(true);
        }
        if(ListUtil.isNotEmpty(item.getResponsabilitePedagogiqueEtablissements()) && this.responsabilitePedagogiqueEtablissements){
        responsabilitePedagogiqueEtablissementConverter.init(true);
        responsabilitePedagogiqueEtablissementConverter.setResponsabilitePedagogique(false);
        vo.setResponsabilitePedagogiqueEtablissementsVo(responsabilitePedagogiqueEtablissementConverter.toVo(item.getResponsabilitePedagogiqueEtablissements()));
        responsabilitePedagogiqueEtablissementConverter.setResponsabilitePedagogique(true);
        }
        if(ListUtil.isNotEmpty(item.getResponsabilitePedagogiquePayss()) && this.responsabilitePedagogiquePayss){
        responsabilitePedagogiquePaysConverter.init(true);
        responsabilitePedagogiquePaysConverter.setResponsabilitePedagogique(false);
        vo.setResponsabilitePedagogiquePayssVo(responsabilitePedagogiquePaysConverter.toVo(item.getResponsabilitePedagogiquePayss()));
        responsabilitePedagogiquePaysConverter.setResponsabilitePedagogique(true);
        }

return vo;
}
}

public void init(Boolean value) {
    niveauResponsabilitePedagogique = value;
    statusCursus = value;
    etatEtapeCampagne = value;
    enseignementEtFormation = value;
        responsabilitePedagogiqueEnjeuxIrds = value;
        responsabilitePedagogiqueEtablissements = value;
        responsabilitePedagogiquePayss = value;
}


        public EnseignementEtFormationConverter getEnseignementEtFormationConverter(){
        return this.enseignementEtFormationConverter;
        }
        public void setEnseignementEtFormationConverter(EnseignementEtFormationConverter enseignementEtFormationConverter ){
        this.enseignementEtFormationConverter = enseignementEtFormationConverter;
        }
        public StatusCursusConverter getStatusCursusConverter(){
        return this.statusCursusConverter;
        }
        public void setStatusCursusConverter(StatusCursusConverter statusCursusConverter ){
        this.statusCursusConverter = statusCursusConverter;
        }
        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public NiveauResponsabilitePedagogiqueConverter getNiveauResponsabilitePedagogiqueConverter(){
        return this.niveauResponsabilitePedagogiqueConverter;
        }
        public void setNiveauResponsabilitePedagogiqueConverter(NiveauResponsabilitePedagogiqueConverter niveauResponsabilitePedagogiqueConverter ){
        this.niveauResponsabilitePedagogiqueConverter = niveauResponsabilitePedagogiqueConverter;
        }
        public ResponsabilitePedagogiqueEtablissementConverter getResponsabilitePedagogiqueEtablissementConverter(){
        return this.responsabilitePedagogiqueEtablissementConverter;
        }
        public void setResponsabilitePedagogiqueEtablissementConverter(ResponsabilitePedagogiqueEtablissementConverter responsabilitePedagogiqueEtablissementConverter ){
        this.responsabilitePedagogiqueEtablissementConverter = responsabilitePedagogiqueEtablissementConverter;
        }
        public ResponsabilitePedagogiqueEnjeuxIrdConverter getResponsabilitePedagogiqueEnjeuxIrdConverter(){
        return this.responsabilitePedagogiqueEnjeuxIrdConverter;
        }
        public void setResponsabilitePedagogiqueEnjeuxIrdConverter(ResponsabilitePedagogiqueEnjeuxIrdConverter responsabilitePedagogiqueEnjeuxIrdConverter ){
        this.responsabilitePedagogiqueEnjeuxIrdConverter = responsabilitePedagogiqueEnjeuxIrdConverter;
        }
        public ResponsabilitePedagogiquePaysConverter getResponsabilitePedagogiquePaysConverter(){
        return this.responsabilitePedagogiquePaysConverter;
        }
        public void setResponsabilitePedagogiquePaysConverter(ResponsabilitePedagogiquePaysConverter responsabilitePedagogiquePaysConverter ){
        this.responsabilitePedagogiquePaysConverter = responsabilitePedagogiquePaysConverter;
        }

    public boolean  isNiveauResponsabilitePedagogique(){
    return this.niveauResponsabilitePedagogique;
    }
    public void  setNiveauResponsabilitePedagogique(boolean niveauResponsabilitePedagogique){
    this.niveauResponsabilitePedagogique = niveauResponsabilitePedagogique;
    }
    public boolean  isStatusCursus(){
    return this.statusCursus;
    }
    public void  setStatusCursus(boolean statusCursus){
    this.statusCursus = statusCursus;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }
    public boolean  isEnseignementEtFormation(){
    return this.enseignementEtFormation;
    }
    public void  setEnseignementEtFormation(boolean enseignementEtFormation){
    this.enseignementEtFormation = enseignementEtFormation;
    }









        public Boolean  isResponsabilitePedagogiqueEnjeuxIrds(){
        return this.responsabilitePedagogiqueEnjeuxIrds ;
        }
        public void  setResponsabilitePedagogiqueEnjeuxIrds(Boolean responsabilitePedagogiqueEnjeuxIrds ){
        this.responsabilitePedagogiqueEnjeuxIrds  = responsabilitePedagogiqueEnjeuxIrds ;
        }







        public Boolean  isResponsabilitePedagogiqueEtablissements(){
        return this.responsabilitePedagogiqueEtablissements ;
        }
        public void  setResponsabilitePedagogiqueEtablissements(Boolean responsabilitePedagogiqueEtablissements ){
        this.responsabilitePedagogiqueEtablissements  = responsabilitePedagogiqueEtablissements ;
        }



        public Boolean  isResponsabilitePedagogiquePayss(){
        return this.responsabilitePedagogiquePayss ;
        }
        public void  setResponsabilitePedagogiquePayss(Boolean responsabilitePedagogiquePayss ){
        this.responsabilitePedagogiquePayss  = responsabilitePedagogiquePayss ;
        }






}
