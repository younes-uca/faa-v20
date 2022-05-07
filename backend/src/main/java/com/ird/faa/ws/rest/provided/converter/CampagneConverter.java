package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.Campagne;
import com.ird.faa.ws.rest.provided.vo.CampagneVo;

@Component
public class CampagneConverter extends AbstractConverter<Campagne,CampagneVo>{

        @Autowired
        private CampagneChercheurOuvertureConverter campagneChercheurOuvertureConverter ;
        @Autowired
        private GestionEquipeConverter gestionEquipeConverter ;
        @Autowired
        private EtatCampagneConverter etatCampagneConverter ;
        @Autowired
        private ProjetActiviteRechercheConverter projetActiviteRechercheConverter ;
        @Autowired
        private TemplateClotureConverter templateClotureConverter ;
        @Autowired
        private InstrumentsEtDispositifsIrdConverter instrumentsEtDispositifsIrdConverter ;
        @Autowired
        private TemplateOuvertureConverter templateOuvertureConverter ;
        @Autowired
        private CampagneRelanceConverter campagneRelanceConverter ;
        @Autowired
        private DistinctionConverter distinctionConverter ;
        @Autowired
        private CampagneRappelConverter campagneRappelConverter ;
        @Autowired
        private CampagneChercheurFermetureConverter campagneChercheurFermetureConverter ;
    private Boolean etatCampagne;
    private Boolean templateOuverture;
    private Boolean templateCloture;
        private Boolean campagneChercheurOuvertures;
        private Boolean campagneChercheurFermetures;
        private Boolean campagneRelances;
        private Boolean campagneRappels;
        private Boolean distinctions;
        private Boolean projetActiviteRecherches;
        private Boolean instrumentsEtDispositifsIrds;
        private Boolean gestionEquipes;

public  CampagneConverter(){
init(true);
}

@Override
public Campagne toItem(CampagneVo vo) {
if (vo == null) {
return null;
} else {
Campagne item = new Campagne();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
        if(StringUtil.isNotEmpty(vo.getCode()))
        item.setCode(vo.getCode());
        if(StringUtil.isNotEmpty(vo.getAnnee()))
        item.setAnnee(NumberUtil.toLong(vo.getAnnee()));
        if(StringUtil.isNotEmpty(vo.getDateDepart()))
        item.setDateDepart(DateUtil.parse(vo.getDateDepart()));
        if(StringUtil.isNotEmpty(vo.getDateFin()))
        item.setDateFin(DateUtil.parse(vo.getDateFin()));
        if(StringUtil.isNotEmpty(vo.getObjetOuverture()))
        item.setObjetOuverture(vo.getObjetOuverture());
        if(StringUtil.isNotEmpty(vo.getMessageOuverture()))
        item.setMessageOuverture(vo.getMessageOuverture());
        if(StringUtil.isNotEmpty(vo.getObjetCloture()))
        item.setObjetCloture(vo.getObjetCloture());
        if(StringUtil.isNotEmpty(vo.getMessageCloture()))
        item.setMessageCloture(vo.getMessageCloture());
    if(vo.getEtatCampagneVo()!=null && this.etatCampagne)
        item.setEtatCampagne(etatCampagneConverter.toItem(vo.getEtatCampagneVo())) ;
    if(vo.getTemplateOuvertureVo()!=null && this.templateOuverture)
        item.setTemplateOuverture(templateOuvertureConverter.toItem(vo.getTemplateOuvertureVo())) ;
    if(vo.getTemplateClotureVo()!=null && this.templateCloture)
        item.setTemplateCloture(templateClotureConverter.toItem(vo.getTemplateClotureVo())) ;

    if(ListUtil.isNotEmpty(vo.getCampagneChercheurOuverturesVo()) && this.campagneChercheurOuvertures)
        item.setCampagneChercheurOuvertures(campagneChercheurOuvertureConverter.toItem(vo.getCampagneChercheurOuverturesVo()));
    if(ListUtil.isNotEmpty(vo.getCampagneChercheurFermeturesVo()) && this.campagneChercheurFermetures)
        item.setCampagneChercheurFermetures(campagneChercheurFermetureConverter.toItem(vo.getCampagneChercheurFermeturesVo()));
    if(ListUtil.isNotEmpty(vo.getCampagneRelancesVo()) && this.campagneRelances)
        item.setCampagneRelances(campagneRelanceConverter.toItem(vo.getCampagneRelancesVo()));
    if(ListUtil.isNotEmpty(vo.getCampagneRappelsVo()) && this.campagneRappels)
        item.setCampagneRappels(campagneRappelConverter.toItem(vo.getCampagneRappelsVo()));
    if(ListUtil.isNotEmpty(vo.getDistinctionsVo()) && this.distinctions)
        item.setDistinctions(distinctionConverter.toItem(vo.getDistinctionsVo()));
    if(ListUtil.isNotEmpty(vo.getProjetActiviteRecherchesVo()) && this.projetActiviteRecherches)
        item.setProjetActiviteRecherches(projetActiviteRechercheConverter.toItem(vo.getProjetActiviteRecherchesVo()));
    if(ListUtil.isNotEmpty(vo.getInstrumentsEtDispositifsIrdsVo()) && this.instrumentsEtDispositifsIrds)
        item.setInstrumentsEtDispositifsIrds(instrumentsEtDispositifsIrdConverter.toItem(vo.getInstrumentsEtDispositifsIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getGestionEquipesVo()) && this.gestionEquipes)
        item.setGestionEquipes(gestionEquipeConverter.toItem(vo.getGestionEquipesVo()));

return item;
}
}

@Override
public CampagneVo toVo(Campagne item) {
if (item == null) {
return null;
} else {
CampagneVo vo = new CampagneVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

        if(StringUtil.isNotEmpty(item.getCode()))
        vo.setCode(item.getCode());

        if(item.getAnnee()!=null)
        vo.setAnnee(NumberUtil.toString(item.getAnnee()));

        if(item.getDateDepart()!=null)
        vo.setDateDepart(DateUtil.formateDate(item.getDateDepart()));
        if(item.getDateFin()!=null)
        vo.setDateFin(DateUtil.formateDate(item.getDateFin()));
        if(StringUtil.isNotEmpty(item.getObjetOuverture()))
        vo.setObjetOuverture(item.getObjetOuverture());

        if(StringUtil.isNotEmpty(item.getMessageOuverture()))
        vo.setMessageOuverture(item.getMessageOuverture());

        if(StringUtil.isNotEmpty(item.getObjetCloture()))
        vo.setObjetCloture(item.getObjetCloture());

        if(StringUtil.isNotEmpty(item.getMessageCloture()))
        vo.setMessageCloture(item.getMessageCloture());

    if(item.getEtatCampagne()!=null && this.etatCampagne) {
        vo.setEtatCampagneVo(etatCampagneConverter.toVo(item.getEtatCampagne())) ;
    }
    if(item.getTemplateOuverture()!=null && this.templateOuverture) {
        vo.setTemplateOuvertureVo(templateOuvertureConverter.toVo(item.getTemplateOuverture())) ;
    }
    if(item.getTemplateCloture()!=null && this.templateCloture) {
        vo.setTemplateClotureVo(templateClotureConverter.toVo(item.getTemplateCloture())) ;
    }
        if(ListUtil.isNotEmpty(item.getCampagneChercheurOuvertures()) && this.campagneChercheurOuvertures){
        campagneChercheurOuvertureConverter.init(true);
        campagneChercheurOuvertureConverter.setCampagne(false);
        vo.setCampagneChercheurOuverturesVo(campagneChercheurOuvertureConverter.toVo(item.getCampagneChercheurOuvertures()));
        campagneChercheurOuvertureConverter.setCampagne(true);
        }
        if(ListUtil.isNotEmpty(item.getCampagneChercheurFermetures()) && this.campagneChercheurFermetures){
        campagneChercheurFermetureConverter.init(true);
        campagneChercheurFermetureConverter.setCampagne(false);
        vo.setCampagneChercheurFermeturesVo(campagneChercheurFermetureConverter.toVo(item.getCampagneChercheurFermetures()));
        campagneChercheurFermetureConverter.setCampagne(true);
        }
        if(ListUtil.isNotEmpty(item.getCampagneRelances()) && this.campagneRelances){
        campagneRelanceConverter.init(true);
        campagneRelanceConverter.setCampagne(false);
        vo.setCampagneRelancesVo(campagneRelanceConverter.toVo(item.getCampagneRelances()));
        campagneRelanceConverter.setCampagne(true);
        }
        if(ListUtil.isNotEmpty(item.getCampagneRappels()) && this.campagneRappels){
        campagneRappelConverter.init(true);
        campagneRappelConverter.setCampagne(false);
        vo.setCampagneRappelsVo(campagneRappelConverter.toVo(item.getCampagneRappels()));
        campagneRappelConverter.setCampagne(true);
        }
        if(ListUtil.isNotEmpty(item.getDistinctions()) && this.distinctions){
        distinctionConverter.init(true);
        distinctionConverter.setCampagne(false);
        vo.setDistinctionsVo(distinctionConverter.toVo(item.getDistinctions()));
        distinctionConverter.setCampagne(true);
        }
        if(ListUtil.isNotEmpty(item.getProjetActiviteRecherches()) && this.projetActiviteRecherches){
        projetActiviteRechercheConverter.init(true);
        projetActiviteRechercheConverter.setCampagne(false);
        vo.setProjetActiviteRecherchesVo(projetActiviteRechercheConverter.toVo(item.getProjetActiviteRecherches()));
        projetActiviteRechercheConverter.setCampagne(true);
        }
        if(ListUtil.isNotEmpty(item.getInstrumentsEtDispositifsIrds()) && this.instrumentsEtDispositifsIrds){
        instrumentsEtDispositifsIrdConverter.init(true);
        instrumentsEtDispositifsIrdConverter.setCampagne(false);
        vo.setInstrumentsEtDispositifsIrdsVo(instrumentsEtDispositifsIrdConverter.toVo(item.getInstrumentsEtDispositifsIrds()));
        instrumentsEtDispositifsIrdConverter.setCampagne(true);
        }
        if(ListUtil.isNotEmpty(item.getGestionEquipes()) && this.gestionEquipes){
        gestionEquipeConverter.init(true);
        gestionEquipeConverter.setCampagne(false);
        vo.setGestionEquipesVo(gestionEquipeConverter.toVo(item.getGestionEquipes()));
        gestionEquipeConverter.setCampagne(true);
        }

return vo;
}
}

public void init(Boolean value) {
    etatCampagne = value;
    templateOuverture = value;
    templateCloture = value;
        campagneChercheurOuvertures = value;
        campagneChercheurFermetures = value;
        campagneRelances = value;
        campagneRappels = value;
        distinctions = value;
        projetActiviteRecherches = value;
        instrumentsEtDispositifsIrds = value;
        gestionEquipes = value;
}


        public CampagneChercheurOuvertureConverter getCampagneChercheurOuvertureConverter(){
        return this.campagneChercheurOuvertureConverter;
        }
        public void setCampagneChercheurOuvertureConverter(CampagneChercheurOuvertureConverter campagneChercheurOuvertureConverter ){
        this.campagneChercheurOuvertureConverter = campagneChercheurOuvertureConverter;
        }
        public GestionEquipeConverter getGestionEquipeConverter(){
        return this.gestionEquipeConverter;
        }
        public void setGestionEquipeConverter(GestionEquipeConverter gestionEquipeConverter ){
        this.gestionEquipeConverter = gestionEquipeConverter;
        }
        public EtatCampagneConverter getEtatCampagneConverter(){
        return this.etatCampagneConverter;
        }
        public void setEtatCampagneConverter(EtatCampagneConverter etatCampagneConverter ){
        this.etatCampagneConverter = etatCampagneConverter;
        }
        public ProjetActiviteRechercheConverter getProjetActiviteRechercheConverter(){
        return this.projetActiviteRechercheConverter;
        }
        public void setProjetActiviteRechercheConverter(ProjetActiviteRechercheConverter projetActiviteRechercheConverter ){
        this.projetActiviteRechercheConverter = projetActiviteRechercheConverter;
        }
        public TemplateClotureConverter getTemplateClotureConverter(){
        return this.templateClotureConverter;
        }
        public void setTemplateClotureConverter(TemplateClotureConverter templateClotureConverter ){
        this.templateClotureConverter = templateClotureConverter;
        }
        public InstrumentsEtDispositifsIrdConverter getInstrumentsEtDispositifsIrdConverter(){
        return this.instrumentsEtDispositifsIrdConverter;
        }
        public void setInstrumentsEtDispositifsIrdConverter(InstrumentsEtDispositifsIrdConverter instrumentsEtDispositifsIrdConverter ){
        this.instrumentsEtDispositifsIrdConverter = instrumentsEtDispositifsIrdConverter;
        }
        public TemplateOuvertureConverter getTemplateOuvertureConverter(){
        return this.templateOuvertureConverter;
        }
        public void setTemplateOuvertureConverter(TemplateOuvertureConverter templateOuvertureConverter ){
        this.templateOuvertureConverter = templateOuvertureConverter;
        }
        public CampagneRelanceConverter getCampagneRelanceConverter(){
        return this.campagneRelanceConverter;
        }
        public void setCampagneRelanceConverter(CampagneRelanceConverter campagneRelanceConverter ){
        this.campagneRelanceConverter = campagneRelanceConverter;
        }
        public DistinctionConverter getDistinctionConverter(){
        return this.distinctionConverter;
        }
        public void setDistinctionConverter(DistinctionConverter distinctionConverter ){
        this.distinctionConverter = distinctionConverter;
        }
        public CampagneRappelConverter getCampagneRappelConverter(){
        return this.campagneRappelConverter;
        }
        public void setCampagneRappelConverter(CampagneRappelConverter campagneRappelConverter ){
        this.campagneRappelConverter = campagneRappelConverter;
        }
        public CampagneChercheurFermetureConverter getCampagneChercheurFermetureConverter(){
        return this.campagneChercheurFermetureConverter;
        }
        public void setCampagneChercheurFermetureConverter(CampagneChercheurFermetureConverter campagneChercheurFermetureConverter ){
        this.campagneChercheurFermetureConverter = campagneChercheurFermetureConverter;
        }

    public boolean  isEtatCampagne(){
    return this.etatCampagne;
    }
    public void  setEtatCampagne(boolean etatCampagne){
    this.etatCampagne = etatCampagne;
    }
    public boolean  isTemplateOuverture(){
    return this.templateOuverture;
    }
    public void  setTemplateOuverture(boolean templateOuverture){
    this.templateOuverture = templateOuverture;
    }
    public boolean  isTemplateCloture(){
    return this.templateCloture;
    }
    public void  setTemplateCloture(boolean templateCloture){
    this.templateCloture = templateCloture;
    }



























        public Boolean  isCampagneChercheurOuvertures(){
        return this.campagneChercheurOuvertures ;
        }
        public void  setCampagneChercheurOuvertures(Boolean campagneChercheurOuvertures ){
        this.campagneChercheurOuvertures  = campagneChercheurOuvertures ;
        }



        public Boolean  isCampagneChercheurFermetures(){
        return this.campagneChercheurFermetures ;
        }
        public void  setCampagneChercheurFermetures(Boolean campagneChercheurFermetures ){
        this.campagneChercheurFermetures  = campagneChercheurFermetures ;
        }



        public Boolean  isCampagneRelances(){
        return this.campagneRelances ;
        }
        public void  setCampagneRelances(Boolean campagneRelances ){
        this.campagneRelances  = campagneRelances ;
        }



        public Boolean  isCampagneRappels(){
        return this.campagneRappels ;
        }
        public void  setCampagneRappels(Boolean campagneRappels ){
        this.campagneRappels  = campagneRappels ;
        }



        public Boolean  isDistinctions(){
        return this.distinctions ;
        }
        public void  setDistinctions(Boolean distinctions ){
        this.distinctions  = distinctions ;
        }



        public Boolean  isProjetActiviteRecherches(){
        return this.projetActiviteRecherches ;
        }
        public void  setProjetActiviteRecherches(Boolean projetActiviteRecherches ){
        this.projetActiviteRecherches  = projetActiviteRecherches ;
        }



        public Boolean  isInstrumentsEtDispositifsIrds(){
        return this.instrumentsEtDispositifsIrds ;
        }
        public void  setInstrumentsEtDispositifsIrds(Boolean instrumentsEtDispositifsIrds ){
        this.instrumentsEtDispositifsIrds  = instrumentsEtDispositifsIrds ;
        }



        public Boolean  isGestionEquipes(){
        return this.gestionEquipes ;
        }
        public void  setGestionEquipes(Boolean gestionEquipes ){
        this.gestionEquipes  = gestionEquipes ;
        }


}
