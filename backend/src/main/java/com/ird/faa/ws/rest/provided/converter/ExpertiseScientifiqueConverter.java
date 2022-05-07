package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ExpertiseScientifique;
import com.ird.faa.ws.rest.provided.vo.ExpertiseScientifiqueVo;

@Component
public class ExpertiseScientifiqueConverter extends AbstractConverter<ExpertiseScientifique,ExpertiseScientifiqueVo>{

        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private DisciplineScientifiqueExpertiseScientifiqueConverter disciplineScientifiqueExpertiseScientifiqueConverter ;
        @Autowired
        private TypeExpertiseConverter typeExpertiseConverter ;
        @Autowired
        private CommunauteSavoirExpertiseScientifiqueConverter communauteSavoirExpertiseScientifiqueConverter ;
        @Autowired
        private EtablissementConverter etablissementConverter ;
        @Autowired
        private CampagneConverter campagneConverter ;
        @Autowired
        private PaysConverter paysConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean typeExpertise;
    private Boolean pays;
    private Boolean etablissement;
    private Boolean etatEtapeCampagne;
    private Boolean chercheur;
    private Boolean campagne;
        private Boolean communauteSavoirExpertiseScientifiques;
        private Boolean disciplineScientifiqueExpertiseScientifiques;

public  ExpertiseScientifiqueConverter(){
init(true);
}

@Override
public ExpertiseScientifique toItem(ExpertiseScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
ExpertiseScientifique item = new ExpertiseScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getAnnee()))
        item.setAnnee(NumberUtil.toLong(vo.getAnnee()));
        if(StringUtil.isNotEmpty(vo.getIntitule()))
        item.setIntitule(vo.getIntitule());
        if(StringUtil.isNotEmpty(vo.getNombreJourConsacrePourCetteAnnee()))
        item.setNombreJourConsacrePourCetteAnnee(NumberUtil.toBigDecimal(vo.getNombreJourConsacrePourCetteAnnee()));
        if(StringUtil.isNotEmpty(vo.getPeriodeRemiseRapportMois()))
        item.setPeriodeRemiseRapportMois(NumberUtil.toInt(vo.getPeriodeRemiseRapportMois()));
        if(StringUtil.isNotEmpty(vo.getPeriodeRemiseRapportAnnee()))
        item.setPeriodeRemiseRapportAnnee(NumberUtil.toInt(vo.getPeriodeRemiseRapportAnnee()));
        if(StringUtil.isNotEmpty(vo.getCommentairesEventuels()))
        item.setCommentairesEventuels(vo.getCommentairesEventuels());
    if(vo.getTypeExpertiseVo()!=null && this.typeExpertise)
        item.setTypeExpertise(typeExpertiseConverter.toItem(vo.getTypeExpertiseVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getEtablissementVo()!=null && this.etablissement)
        item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;
    if(vo.getCampagneVo()!=null && this.campagne)
        item.setCampagne(campagneConverter.toItem(vo.getCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getCommunauteSavoirExpertiseScientifiquesVo()) && this.communauteSavoirExpertiseScientifiques)
        item.setCommunauteSavoirExpertiseScientifiques(communauteSavoirExpertiseScientifiqueConverter.toItem(vo.getCommunauteSavoirExpertiseScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getDisciplineScientifiqueExpertiseScientifiquesVo()) && this.disciplineScientifiqueExpertiseScientifiques)
        item.setDisciplineScientifiqueExpertiseScientifiques(disciplineScientifiqueExpertiseScientifiqueConverter.toItem(vo.getDisciplineScientifiqueExpertiseScientifiquesVo()));

return item;
}
}

@Override
public ExpertiseScientifiqueVo toVo(ExpertiseScientifique item) {
if (item == null) {
return null;
} else {
ExpertiseScientifiqueVo vo = new ExpertiseScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getAnnee()!=null)
        vo.setAnnee(NumberUtil.toString(item.getAnnee()));

        if(StringUtil.isNotEmpty(item.getIntitule()))
        vo.setIntitule(item.getIntitule());

        if(item.getNombreJourConsacrePourCetteAnnee()!=null)
        vo.setNombreJourConsacrePourCetteAnnee(NumberUtil.toString(item.getNombreJourConsacrePourCetteAnnee()));

        if(item.getPeriodeRemiseRapportMois()!=null)
        vo.setPeriodeRemiseRapportMois(NumberUtil.toString(item.getPeriodeRemiseRapportMois()));

        if(item.getPeriodeRemiseRapportAnnee()!=null)
        vo.setPeriodeRemiseRapportAnnee(NumberUtil.toString(item.getPeriodeRemiseRapportAnnee()));

        if(StringUtil.isNotEmpty(item.getCommentairesEventuels()))
        vo.setCommentairesEventuels(item.getCommentairesEventuels());

    if(item.getTypeExpertise()!=null && this.typeExpertise) {
        vo.setTypeExpertiseVo(typeExpertiseConverter.toVo(item.getTypeExpertise())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getEtablissement()!=null && this.etablissement) {
        vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }
    if(item.getCampagne()!=null && this.campagne) {
        vo.setCampagneVo(campagneConverter.toVo(item.getCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getCommunauteSavoirExpertiseScientifiques()) && this.communauteSavoirExpertiseScientifiques){
        communauteSavoirExpertiseScientifiqueConverter.init(true);
        communauteSavoirExpertiseScientifiqueConverter.setExpertiseScientifique(false);
        vo.setCommunauteSavoirExpertiseScientifiquesVo(communauteSavoirExpertiseScientifiqueConverter.toVo(item.getCommunauteSavoirExpertiseScientifiques()));
        communauteSavoirExpertiseScientifiqueConverter.setExpertiseScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getDisciplineScientifiqueExpertiseScientifiques()) && this.disciplineScientifiqueExpertiseScientifiques){
        disciplineScientifiqueExpertiseScientifiqueConverter.init(true);
        disciplineScientifiqueExpertiseScientifiqueConverter.setExpertiseScientifique(false);
        vo.setDisciplineScientifiqueExpertiseScientifiquesVo(disciplineScientifiqueExpertiseScientifiqueConverter.toVo(item.getDisciplineScientifiqueExpertiseScientifiques()));
        disciplineScientifiqueExpertiseScientifiqueConverter.setExpertiseScientifique(true);
        }

return vo;
}
}

public void init(Boolean value) {
    typeExpertise = value;
    pays = value;
    etablissement = value;
    etatEtapeCampagne = value;
    chercheur = value;
    campagne = value;
        communauteSavoirExpertiseScientifiques = value;
        disciplineScientifiqueExpertiseScientifiques = value;
}


        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public DisciplineScientifiqueExpertiseScientifiqueConverter getDisciplineScientifiqueExpertiseScientifiqueConverter(){
        return this.disciplineScientifiqueExpertiseScientifiqueConverter;
        }
        public void setDisciplineScientifiqueExpertiseScientifiqueConverter(DisciplineScientifiqueExpertiseScientifiqueConverter disciplineScientifiqueExpertiseScientifiqueConverter ){
        this.disciplineScientifiqueExpertiseScientifiqueConverter = disciplineScientifiqueExpertiseScientifiqueConverter;
        }
        public TypeExpertiseConverter getTypeExpertiseConverter(){
        return this.typeExpertiseConverter;
        }
        public void setTypeExpertiseConverter(TypeExpertiseConverter typeExpertiseConverter ){
        this.typeExpertiseConverter = typeExpertiseConverter;
        }
        public CommunauteSavoirExpertiseScientifiqueConverter getCommunauteSavoirExpertiseScientifiqueConverter(){
        return this.communauteSavoirExpertiseScientifiqueConverter;
        }
        public void setCommunauteSavoirExpertiseScientifiqueConverter(CommunauteSavoirExpertiseScientifiqueConverter communauteSavoirExpertiseScientifiqueConverter ){
        this.communauteSavoirExpertiseScientifiqueConverter = communauteSavoirExpertiseScientifiqueConverter;
        }
        public EtablissementConverter getEtablissementConverter(){
        return this.etablissementConverter;
        }
        public void setEtablissementConverter(EtablissementConverter etablissementConverter ){
        this.etablissementConverter = etablissementConverter;
        }
        public CampagneConverter getCampagneConverter(){
        return this.campagneConverter;
        }
        public void setCampagneConverter(CampagneConverter campagneConverter ){
        this.campagneConverter = campagneConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }
        public ChercheurConverter getChercheurConverter(){
        return this.chercheurConverter;
        }
        public void setChercheurConverter(ChercheurConverter chercheurConverter ){
        this.chercheurConverter = chercheurConverter;
        }

    public boolean  isTypeExpertise(){
    return this.typeExpertise;
    }
    public void  setTypeExpertise(boolean typeExpertise){
    this.typeExpertise = typeExpertise;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }
    public boolean  isEtablissement(){
    return this.etablissement;
    }
    public void  setEtablissement(boolean etablissement){
    this.etablissement = etablissement;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }
    public boolean  isChercheur(){
    return this.chercheur;
    }
    public void  setChercheur(boolean chercheur){
    this.chercheur = chercheur;
    }
    public boolean  isCampagne(){
    return this.campagne;
    }
    public void  setCampagne(boolean campagne){
    this.campagne = campagne;
    }



















        public Boolean  isCommunauteSavoirExpertiseScientifiques(){
        return this.communauteSavoirExpertiseScientifiques ;
        }
        public void  setCommunauteSavoirExpertiseScientifiques(Boolean communauteSavoirExpertiseScientifiques ){
        this.communauteSavoirExpertiseScientifiques  = communauteSavoirExpertiseScientifiques ;
        }



        public Boolean  isDisciplineScientifiqueExpertiseScientifiques(){
        return this.disciplineScientifiqueExpertiseScientifiques ;
        }
        public void  setDisciplineScientifiqueExpertiseScientifiques(Boolean disciplineScientifiqueExpertiseScientifiques ){
        this.disciplineScientifiqueExpertiseScientifiques  = disciplineScientifiqueExpertiseScientifiques ;
        }










}
