package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ConseilEtComiteScientifique;
import com.ird.faa.ws.rest.provided.vo.ConseilEtComiteScientifiqueVo;

@Component
public class ConseilEtComiteScientifiqueConverter extends AbstractConverter<ConseilEtComiteScientifique,ConseilEtComiteScientifiqueVo>{

        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private DisciplineScientifiqueConseilEtComiteScientifiqueConverter disciplineScientifiqueConseilEtComiteScientifiqueConverter ;
        @Autowired
        private CommunauteSavoirConseilEtComiteScientifiqueConverter communauteSavoirConseilEtComiteScientifiqueConverter ;
        @Autowired
        private EtablissementConverter etablissementConverter ;
        @Autowired
        private CampagneConverter campagneConverter ;
        @Autowired
        private PaysConverter paysConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean pays;
    private Boolean etablissement;
    private Boolean chercheur;
    private Boolean campagne;
    private Boolean etatEtapeCampagne;
        private Boolean communauteSavoirConseilEtComiteScientifiques;
        private Boolean disciplineScientifiqueConseilEtComiteScientifiques;

public  ConseilEtComiteScientifiqueConverter(){
init(true);
}

@Override
public ConseilEtComiteScientifique toItem(ConseilEtComiteScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
ConseilEtComiteScientifique item = new ConseilEtComiteScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getTempsEstimePourCetteAnnne()))
        item.setTempsEstimePourCetteAnnne(NumberUtil.toBigDecimal(vo.getTempsEstimePourCetteAnnne()));
        if(StringUtil.isNotEmpty(vo.getIntitule()))
        item.setIntitule(vo.getIntitule());
        if(StringUtil.isNotEmpty(vo.getNombreJoursParAnnee()))
        item.setNombreJoursParAnnee(NumberUtil.toBigDecimal(vo.getNombreJoursParAnnee()));
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getEtablissementVo()!=null && this.etablissement)
        item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;
    if(vo.getCampagneVo()!=null && this.campagne)
        item.setCampagne(campagneConverter.toItem(vo.getCampagneVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getCommunauteSavoirConseilEtComiteScientifiquesVo()) && this.communauteSavoirConseilEtComiteScientifiques)
        item.setCommunauteSavoirConseilEtComiteScientifiques(communauteSavoirConseilEtComiteScientifiqueConverter.toItem(vo.getCommunauteSavoirConseilEtComiteScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getDisciplineScientifiqueConseilEtComiteScientifiquesVo()) && this.disciplineScientifiqueConseilEtComiteScientifiques)
        item.setDisciplineScientifiqueConseilEtComiteScientifiques(disciplineScientifiqueConseilEtComiteScientifiqueConverter.toItem(vo.getDisciplineScientifiqueConseilEtComiteScientifiquesVo()));

return item;
}
}

@Override
public ConseilEtComiteScientifiqueVo toVo(ConseilEtComiteScientifique item) {
if (item == null) {
return null;
} else {
ConseilEtComiteScientifiqueVo vo = new ConseilEtComiteScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getTempsEstimePourCetteAnnne()!=null)
        vo.setTempsEstimePourCetteAnnne(NumberUtil.toString(item.getTempsEstimePourCetteAnnne()));

        if(StringUtil.isNotEmpty(item.getIntitule()))
        vo.setIntitule(item.getIntitule());

        if(item.getNombreJoursParAnnee()!=null)
        vo.setNombreJoursParAnnee(NumberUtil.toString(item.getNombreJoursParAnnee()));

    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getEtablissement()!=null && this.etablissement) {
        vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }
    if(item.getCampagne()!=null && this.campagne) {
        vo.setCampagneVo(campagneConverter.toVo(item.getCampagne())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getCommunauteSavoirConseilEtComiteScientifiques()) && this.communauteSavoirConseilEtComiteScientifiques){
        communauteSavoirConseilEtComiteScientifiqueConverter.init(true);
        communauteSavoirConseilEtComiteScientifiqueConverter.setConseilEtComiteScientifique(false);
        vo.setCommunauteSavoirConseilEtComiteScientifiquesVo(communauteSavoirConseilEtComiteScientifiqueConverter.toVo(item.getCommunauteSavoirConseilEtComiteScientifiques()));
        communauteSavoirConseilEtComiteScientifiqueConverter.setConseilEtComiteScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getDisciplineScientifiqueConseilEtComiteScientifiques()) && this.disciplineScientifiqueConseilEtComiteScientifiques){
        disciplineScientifiqueConseilEtComiteScientifiqueConverter.init(true);
        disciplineScientifiqueConseilEtComiteScientifiqueConverter.setConseilEtComiteScientifique(false);
        vo.setDisciplineScientifiqueConseilEtComiteScientifiquesVo(disciplineScientifiqueConseilEtComiteScientifiqueConverter.toVo(item.getDisciplineScientifiqueConseilEtComiteScientifiques()));
        disciplineScientifiqueConseilEtComiteScientifiqueConverter.setConseilEtComiteScientifique(true);
        }

return vo;
}
}

public void init(Boolean value) {
    pays = value;
    etablissement = value;
    chercheur = value;
    campagne = value;
    etatEtapeCampagne = value;
        communauteSavoirConseilEtComiteScientifiques = value;
        disciplineScientifiqueConseilEtComiteScientifiques = value;
}


        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public DisciplineScientifiqueConseilEtComiteScientifiqueConverter getDisciplineScientifiqueConseilEtComiteScientifiqueConverter(){
        return this.disciplineScientifiqueConseilEtComiteScientifiqueConverter;
        }
        public void setDisciplineScientifiqueConseilEtComiteScientifiqueConverter(DisciplineScientifiqueConseilEtComiteScientifiqueConverter disciplineScientifiqueConseilEtComiteScientifiqueConverter ){
        this.disciplineScientifiqueConseilEtComiteScientifiqueConverter = disciplineScientifiqueConseilEtComiteScientifiqueConverter;
        }
        public CommunauteSavoirConseilEtComiteScientifiqueConverter getCommunauteSavoirConseilEtComiteScientifiqueConverter(){
        return this.communauteSavoirConseilEtComiteScientifiqueConverter;
        }
        public void setCommunauteSavoirConseilEtComiteScientifiqueConverter(CommunauteSavoirConseilEtComiteScientifiqueConverter communauteSavoirConseilEtComiteScientifiqueConverter ){
        this.communauteSavoirConseilEtComiteScientifiqueConverter = communauteSavoirConseilEtComiteScientifiqueConverter;
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
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }













        public Boolean  isCommunauteSavoirConseilEtComiteScientifiques(){
        return this.communauteSavoirConseilEtComiteScientifiques ;
        }
        public void  setCommunauteSavoirConseilEtComiteScientifiques(Boolean communauteSavoirConseilEtComiteScientifiques ){
        this.communauteSavoirConseilEtComiteScientifiques  = communauteSavoirConseilEtComiteScientifiques ;
        }



        public Boolean  isDisciplineScientifiqueConseilEtComiteScientifiques(){
        return this.disciplineScientifiqueConseilEtComiteScientifiques ;
        }
        public void  setDisciplineScientifiqueConseilEtComiteScientifiques(Boolean disciplineScientifiqueConseilEtComiteScientifiques ){
        this.disciplineScientifiqueConseilEtComiteScientifiques  = disciplineScientifiqueConseilEtComiteScientifiques ;
        }








}
