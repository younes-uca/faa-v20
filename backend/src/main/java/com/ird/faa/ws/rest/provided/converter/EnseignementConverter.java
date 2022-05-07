package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.Enseignement;
import com.ird.faa.ws.rest.provided.vo.EnseignementVo;

@Component
public class EnseignementConverter extends AbstractConverter<Enseignement,EnseignementVo>{

        @Autowired
        private EnseignementEtFormationConverter enseignementEtFormationConverter ;
        @Autowired
        private EnseignementDisciplineScientifiqueConverter enseignementDisciplineScientifiqueConverter ;
        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private EnseignementNatureConverter enseignementNatureConverter ;
        @Autowired
        private EnseignementEnjeuxIrdConverter enseignementEnjeuxIrdConverter ;
        @Autowired
        private NiveauEtudeEnseignementConverter niveauEtudeEnseignementConverter ;
        @Autowired
        private EtablissementEnseignementConverter etablissementEnseignementConverter ;
        @Autowired
        private TypeEtudeEnseignementConverter typeEtudeEnseignementConverter ;
        @Autowired
        private ModaliteEtudeConverter modaliteEtudeConverter ;
        @Autowired
        private EnseignementZoneGeographiqueConverter enseignementZoneGeographiqueConverter ;
    private Boolean modaliteEtude;
    private Boolean etatEtapeCampagne;
    private Boolean enseignementEtFormation;
        private Boolean typeEtudeEnseignements;
        private Boolean enseignementNatures;
        private Boolean niveauEtudeEnseignements;
        private Boolean etablissementEnseignements;
        private Boolean enseignementZoneGeographiques;
        private Boolean enseignementEnjeuxIrds;
        private Boolean enseignementDisciplineScientifiques;

public  EnseignementConverter(){
init(true);
}

@Override
public Enseignement toItem(EnseignementVo vo) {
if (vo == null) {
return null;
} else {
Enseignement item = new Enseignement();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getIntitule()))
        item.setIntitule(vo.getIntitule());
        if(StringUtil.isNotEmpty(vo.getNombreHeure()))
        item.setNombreHeure(NumberUtil.toBigDecimal(vo.getNombreHeure()));
            if(vo.getEtabilssementNonReconnu() != null)
            item.setEtabilssementNonReconnu(vo.getEtabilssementNonReconnu());
    if(vo.getModaliteEtudeVo()!=null && this.modaliteEtude)
        item.setModaliteEtude(modaliteEtudeConverter.toItem(vo.getModaliteEtudeVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;
    if(vo.getEnseignementEtFormationVo()!=null && this.enseignementEtFormation)
        item.setEnseignementEtFormation(enseignementEtFormationConverter.toItem(vo.getEnseignementEtFormationVo())) ;

    if(ListUtil.isNotEmpty(vo.getTypeEtudeEnseignementsVo()) && this.typeEtudeEnseignements)
        item.setTypeEtudeEnseignements(typeEtudeEnseignementConverter.toItem(vo.getTypeEtudeEnseignementsVo()));
    if(ListUtil.isNotEmpty(vo.getEnseignementNaturesVo()) && this.enseignementNatures)
        item.setEnseignementNatures(enseignementNatureConverter.toItem(vo.getEnseignementNaturesVo()));
    if(ListUtil.isNotEmpty(vo.getNiveauEtudeEnseignementsVo()) && this.niveauEtudeEnseignements)
        item.setNiveauEtudeEnseignements(niveauEtudeEnseignementConverter.toItem(vo.getNiveauEtudeEnseignementsVo()));
    if(ListUtil.isNotEmpty(vo.getEtablissementEnseignementsVo()) && this.etablissementEnseignements)
        item.setEtablissementEnseignements(etablissementEnseignementConverter.toItem(vo.getEtablissementEnseignementsVo()));
    if(ListUtil.isNotEmpty(vo.getEnseignementZoneGeographiquesVo()) && this.enseignementZoneGeographiques)
        item.setEnseignementZoneGeographiques(enseignementZoneGeographiqueConverter.toItem(vo.getEnseignementZoneGeographiquesVo()));
    if(ListUtil.isNotEmpty(vo.getEnseignementEnjeuxIrdsVo()) && this.enseignementEnjeuxIrds)
        item.setEnseignementEnjeuxIrds(enseignementEnjeuxIrdConverter.toItem(vo.getEnseignementEnjeuxIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getEnseignementDisciplineScientifiquesVo()) && this.enseignementDisciplineScientifiques)
        item.setEnseignementDisciplineScientifiques(enseignementDisciplineScientifiqueConverter.toItem(vo.getEnseignementDisciplineScientifiquesVo()));

return item;
}
}

@Override
public EnseignementVo toVo(Enseignement item) {
if (item == null) {
return null;
} else {
EnseignementVo vo = new EnseignementVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getIntitule()))
        vo.setIntitule(item.getIntitule());

        if(item.getNombreHeure()!=null)
        vo.setNombreHeure(NumberUtil.toString(item.getNombreHeure()));

        if(item.getEtabilssementNonReconnu()!=null)
        vo.setEtabilssementNonReconnu(item.getEtabilssementNonReconnu());
    if(item.getModaliteEtude()!=null && this.modaliteEtude) {
        vo.setModaliteEtudeVo(modaliteEtudeConverter.toVo(item.getModaliteEtude())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
    if(item.getEnseignementEtFormation()!=null && this.enseignementEtFormation) {
        vo.setEnseignementEtFormationVo(enseignementEtFormationConverter.toVo(item.getEnseignementEtFormation())) ;
    }
        if(ListUtil.isNotEmpty(item.getTypeEtudeEnseignements()) && this.typeEtudeEnseignements){
        typeEtudeEnseignementConverter.init(true);
        typeEtudeEnseignementConverter.setEnseignement(false);
        vo.setTypeEtudeEnseignementsVo(typeEtudeEnseignementConverter.toVo(item.getTypeEtudeEnseignements()));
        typeEtudeEnseignementConverter.setEnseignement(true);
        }
        if(ListUtil.isNotEmpty(item.getEnseignementNatures()) && this.enseignementNatures){
        enseignementNatureConverter.init(true);
        enseignementNatureConverter.setEnseignement(false);
        vo.setEnseignementNaturesVo(enseignementNatureConverter.toVo(item.getEnseignementNatures()));
        enseignementNatureConverter.setEnseignement(true);
        }
        if(ListUtil.isNotEmpty(item.getNiveauEtudeEnseignements()) && this.niveauEtudeEnseignements){
        niveauEtudeEnseignementConverter.init(true);
        niveauEtudeEnseignementConverter.setEnseignement(false);
        vo.setNiveauEtudeEnseignementsVo(niveauEtudeEnseignementConverter.toVo(item.getNiveauEtudeEnseignements()));
        niveauEtudeEnseignementConverter.setEnseignement(true);
        }
        if(ListUtil.isNotEmpty(item.getEtablissementEnseignements()) && this.etablissementEnseignements){
        etablissementEnseignementConverter.init(true);
        etablissementEnseignementConverter.setEnseignement(false);
        vo.setEtablissementEnseignementsVo(etablissementEnseignementConverter.toVo(item.getEtablissementEnseignements()));
        etablissementEnseignementConverter.setEnseignement(true);
        }
        if(ListUtil.isNotEmpty(item.getEnseignementZoneGeographiques()) && this.enseignementZoneGeographiques){
        enseignementZoneGeographiqueConverter.init(true);
        enseignementZoneGeographiqueConverter.setEnseignement(false);
        vo.setEnseignementZoneGeographiquesVo(enseignementZoneGeographiqueConverter.toVo(item.getEnseignementZoneGeographiques()));
        enseignementZoneGeographiqueConverter.setEnseignement(true);
        }
        if(ListUtil.isNotEmpty(item.getEnseignementEnjeuxIrds()) && this.enseignementEnjeuxIrds){
        enseignementEnjeuxIrdConverter.init(true);
        enseignementEnjeuxIrdConverter.setEnseignement(false);
        vo.setEnseignementEnjeuxIrdsVo(enseignementEnjeuxIrdConverter.toVo(item.getEnseignementEnjeuxIrds()));
        enseignementEnjeuxIrdConverter.setEnseignement(true);
        }
        if(ListUtil.isNotEmpty(item.getEnseignementDisciplineScientifiques()) && this.enseignementDisciplineScientifiques){
        enseignementDisciplineScientifiqueConverter.init(true);
        enseignementDisciplineScientifiqueConverter.setEnseignement(false);
        vo.setEnseignementDisciplineScientifiquesVo(enseignementDisciplineScientifiqueConverter.toVo(item.getEnseignementDisciplineScientifiques()));
        enseignementDisciplineScientifiqueConverter.setEnseignement(true);
        }

return vo;
}
}

public void init(Boolean value) {
    modaliteEtude = value;
    etatEtapeCampagne = value;
    enseignementEtFormation = value;
        typeEtudeEnseignements = value;
        enseignementNatures = value;
        niveauEtudeEnseignements = value;
        etablissementEnseignements = value;
        enseignementZoneGeographiques = value;
        enseignementEnjeuxIrds = value;
        enseignementDisciplineScientifiques = value;
}


        public EnseignementEtFormationConverter getEnseignementEtFormationConverter(){
        return this.enseignementEtFormationConverter;
        }
        public void setEnseignementEtFormationConverter(EnseignementEtFormationConverter enseignementEtFormationConverter ){
        this.enseignementEtFormationConverter = enseignementEtFormationConverter;
        }
        public EnseignementDisciplineScientifiqueConverter getEnseignementDisciplineScientifiqueConverter(){
        return this.enseignementDisciplineScientifiqueConverter;
        }
        public void setEnseignementDisciplineScientifiqueConverter(EnseignementDisciplineScientifiqueConverter enseignementDisciplineScientifiqueConverter ){
        this.enseignementDisciplineScientifiqueConverter = enseignementDisciplineScientifiqueConverter;
        }
        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public EnseignementNatureConverter getEnseignementNatureConverter(){
        return this.enseignementNatureConverter;
        }
        public void setEnseignementNatureConverter(EnseignementNatureConverter enseignementNatureConverter ){
        this.enseignementNatureConverter = enseignementNatureConverter;
        }
        public EnseignementEnjeuxIrdConverter getEnseignementEnjeuxIrdConverter(){
        return this.enseignementEnjeuxIrdConverter;
        }
        public void setEnseignementEnjeuxIrdConverter(EnseignementEnjeuxIrdConverter enseignementEnjeuxIrdConverter ){
        this.enseignementEnjeuxIrdConverter = enseignementEnjeuxIrdConverter;
        }
        public NiveauEtudeEnseignementConverter getNiveauEtudeEnseignementConverter(){
        return this.niveauEtudeEnseignementConverter;
        }
        public void setNiveauEtudeEnseignementConverter(NiveauEtudeEnseignementConverter niveauEtudeEnseignementConverter ){
        this.niveauEtudeEnseignementConverter = niveauEtudeEnseignementConverter;
        }
        public EtablissementEnseignementConverter getEtablissementEnseignementConverter(){
        return this.etablissementEnseignementConverter;
        }
        public void setEtablissementEnseignementConverter(EtablissementEnseignementConverter etablissementEnseignementConverter ){
        this.etablissementEnseignementConverter = etablissementEnseignementConverter;
        }
        public TypeEtudeEnseignementConverter getTypeEtudeEnseignementConverter(){
        return this.typeEtudeEnseignementConverter;
        }
        public void setTypeEtudeEnseignementConverter(TypeEtudeEnseignementConverter typeEtudeEnseignementConverter ){
        this.typeEtudeEnseignementConverter = typeEtudeEnseignementConverter;
        }
        public ModaliteEtudeConverter getModaliteEtudeConverter(){
        return this.modaliteEtudeConverter;
        }
        public void setModaliteEtudeConverter(ModaliteEtudeConverter modaliteEtudeConverter ){
        this.modaliteEtudeConverter = modaliteEtudeConverter;
        }
        public EnseignementZoneGeographiqueConverter getEnseignementZoneGeographiqueConverter(){
        return this.enseignementZoneGeographiqueConverter;
        }
        public void setEnseignementZoneGeographiqueConverter(EnseignementZoneGeographiqueConverter enseignementZoneGeographiqueConverter ){
        this.enseignementZoneGeographiqueConverter = enseignementZoneGeographiqueConverter;
        }

    public boolean  isModaliteEtude(){
    return this.modaliteEtude;
    }
    public void  setModaliteEtude(boolean modaliteEtude){
    this.modaliteEtude = modaliteEtude;
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









        public Boolean  isTypeEtudeEnseignements(){
        return this.typeEtudeEnseignements ;
        }
        public void  setTypeEtudeEnseignements(Boolean typeEtudeEnseignements ){
        this.typeEtudeEnseignements  = typeEtudeEnseignements ;
        }



        public Boolean  isEnseignementNatures(){
        return this.enseignementNatures ;
        }
        public void  setEnseignementNatures(Boolean enseignementNatures ){
        this.enseignementNatures  = enseignementNatures ;
        }



        public Boolean  isNiveauEtudeEnseignements(){
        return this.niveauEtudeEnseignements ;
        }
        public void  setNiveauEtudeEnseignements(Boolean niveauEtudeEnseignements ){
        this.niveauEtudeEnseignements  = niveauEtudeEnseignements ;
        }





        public Boolean  isEtablissementEnseignements(){
        return this.etablissementEnseignements ;
        }
        public void  setEtablissementEnseignements(Boolean etablissementEnseignements ){
        this.etablissementEnseignements  = etablissementEnseignements ;
        }



        public Boolean  isEnseignementZoneGeographiques(){
        return this.enseignementZoneGeographiques ;
        }
        public void  setEnseignementZoneGeographiques(Boolean enseignementZoneGeographiques ){
        this.enseignementZoneGeographiques  = enseignementZoneGeographiques ;
        }



        public Boolean  isEnseignementEnjeuxIrds(){
        return this.enseignementEnjeuxIrds ;
        }
        public void  setEnseignementEnjeuxIrds(Boolean enseignementEnjeuxIrds ){
        this.enseignementEnjeuxIrds  = enseignementEnjeuxIrds ;
        }



        public Boolean  isEnseignementDisciplineScientifiques(){
        return this.enseignementDisciplineScientifiques ;
        }
        public void  setEnseignementDisciplineScientifiques(Boolean enseignementDisciplineScientifiques ){
        this.enseignementDisciplineScientifiques  = enseignementDisciplineScientifiques ;
        }






}
