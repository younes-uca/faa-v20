package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueVo;

@Component
public class DeveloppementDeSavoirEtInnovationScientifiqueConverter extends AbstractConverter<DeveloppementDeSavoirEtInnovationScientifique,DeveloppementDeSavoirEtInnovationScientifiqueVo>{

        @Autowired
        private SavoirEtInnovationConverter savoirEtInnovationConverter ;
        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiquePaysConverter developpementDeSavoirEtInnovationScientifiquePaysConverter ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueEtablissementConverter developpementDeSavoirEtInnovationScientifiqueEtablissementConverter ;
        @Autowired
        private RoleDeveloppementDeSavoirConverter roleDeveloppementDeSavoirConverter ;
        @Autowired
        private TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter ;
        @Autowired
        private TypeUtilisateurSavoirConcuConverter typeUtilisateurSavoirConcuConverter ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionConverter developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter ;
    private Boolean roleDeveloppementDeSavoir;
    private Boolean savoirEtInnovation;
    private Boolean etatEtapeCampagne;
        private Boolean typeSavoirDeveloppementDeSavoirEtInnovationScientifiques;
        private Boolean typeUtilisateurSavoirConcus;
        private Boolean developpementDeSavoirEtInnovationScientifiqueModeDiffusions;
        private Boolean developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds;
        private Boolean developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques;
        private Boolean developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs;
        private Boolean developpementDeSavoirEtInnovationScientifiquePayss;
        private Boolean developpementDeSavoirEtInnovationScientifiqueEtablissements;

public  DeveloppementDeSavoirEtInnovationScientifiqueConverter(){
init(true);
}

@Override
public DeveloppementDeSavoirEtInnovationScientifique toItem(DeveloppementDeSavoirEtInnovationScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
DeveloppementDeSavoirEtInnovationScientifique item = new DeveloppementDeSavoirEtInnovationScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getTitreInstrument()))
        item.setTitreInstrument(vo.getTitreInstrument());
        if(StringUtil.isNotEmpty(vo.getAnneeMiseEnOeuvre()))
        item.setAnneeMiseEnOeuvre(NumberUtil.toInt(vo.getAnneeMiseEnOeuvre()));
        if(StringUtil.isNotEmpty(vo.getLienWeb()))
        item.setLienWeb(vo.getLienWeb());
    if(vo.getRoleDeveloppementDeSavoirVo()!=null && this.roleDeveloppementDeSavoir)
        item.setRoleDeveloppementDeSavoir(roleDeveloppementDeSavoirConverter.toItem(vo.getRoleDeveloppementDeSavoirVo())) ;
    if(vo.getSavoirEtInnovationVo()!=null && this.savoirEtInnovation)
        item.setSavoirEtInnovation(savoirEtInnovationConverter.toItem(vo.getSavoirEtInnovationVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getTypeSavoirDeveloppementDeSavoirEtInnovationScientifiquesVo()) && this.typeSavoirDeveloppementDeSavoirEtInnovationScientifiques)
        item.setTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques(typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.toItem(vo.getTypeSavoirDeveloppementDeSavoirEtInnovationScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getTypeUtilisateurSavoirConcusVo()) && this.typeUtilisateurSavoirConcus)
        item.setTypeUtilisateurSavoirConcus(typeUtilisateurSavoirConcuConverter.toItem(vo.getTypeUtilisateurSavoirConcusVo()));
    if(ListUtil.isNotEmpty(vo.getDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionsVo()) && this.developpementDeSavoirEtInnovationScientifiqueModeDiffusions)
        item.setDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions(developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionsVo()));
    if(ListUtil.isNotEmpty(vo.getDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdsVo()) && this.developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds)
        item.setDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiquesVo()) && this.developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques)
        item.setDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirsVo()) && this.developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs)
        item.setDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirsVo()));
    if(ListUtil.isNotEmpty(vo.getDeveloppementDeSavoirEtInnovationScientifiquePayssVo()) && this.developpementDeSavoirEtInnovationScientifiquePayss)
        item.setDeveloppementDeSavoirEtInnovationScientifiquePayss(developpementDeSavoirEtInnovationScientifiquePaysConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiquePayssVo()));
    if(ListUtil.isNotEmpty(vo.getDeveloppementDeSavoirEtInnovationScientifiqueEtablissementsVo()) && this.developpementDeSavoirEtInnovationScientifiqueEtablissements)
        item.setDeveloppementDeSavoirEtInnovationScientifiqueEtablissements(developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiqueEtablissementsVo()));

return item;
}
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueVo toVo(DeveloppementDeSavoirEtInnovationScientifique item) {
if (item == null) {
return null;
} else {
DeveloppementDeSavoirEtInnovationScientifiqueVo vo = new DeveloppementDeSavoirEtInnovationScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getTitreInstrument()))
        vo.setTitreInstrument(item.getTitreInstrument());

        if(item.getAnneeMiseEnOeuvre()!=null)
        vo.setAnneeMiseEnOeuvre(NumberUtil.toString(item.getAnneeMiseEnOeuvre()));

        if(StringUtil.isNotEmpty(item.getLienWeb()))
        vo.setLienWeb(item.getLienWeb());

    if(item.getRoleDeveloppementDeSavoir()!=null && this.roleDeveloppementDeSavoir) {
        vo.setRoleDeveloppementDeSavoirVo(roleDeveloppementDeSavoirConverter.toVo(item.getRoleDeveloppementDeSavoir())) ;
    }
    if(item.getSavoirEtInnovation()!=null && this.savoirEtInnovation) {
        vo.setSavoirEtInnovationVo(savoirEtInnovationConverter.toVo(item.getSavoirEtInnovation())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques()) && this.typeSavoirDeveloppementDeSavoirEtInnovationScientifiques){
        typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.init(true);
        typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.setDeveloppementDeSavoirEtInnovationScientifique(false);
        vo.setTypeSavoirDeveloppementDeSavoirEtInnovationScientifiquesVo(typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.toVo(item.getTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques()));
        typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter.setDeveloppementDeSavoirEtInnovationScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getTypeUtilisateurSavoirConcus()) && this.typeUtilisateurSavoirConcus){
        typeUtilisateurSavoirConcuConverter.init(true);
        typeUtilisateurSavoirConcuConverter.setDeveloppementDeSavoirEtInnovationScientifique(false);
        vo.setTypeUtilisateurSavoirConcusVo(typeUtilisateurSavoirConcuConverter.toVo(item.getTypeUtilisateurSavoirConcus()));
        typeUtilisateurSavoirConcuConverter.setDeveloppementDeSavoirEtInnovationScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions()) && this.developpementDeSavoirEtInnovationScientifiqueModeDiffusions){
        developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.init(true);
        developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.setDeveloppementDeSavoirEtInnovationScientifique(false);
        vo.setDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionsVo(developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions()));
        developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter.setDeveloppementDeSavoirEtInnovationScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds()) && this.developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds){
        developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.init(true);
        developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.setDeveloppementDeSavoirEtInnovationScientifique(false);
        vo.setDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdsVo(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds()));
        developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter.setDeveloppementDeSavoirEtInnovationScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques()) && this.developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques){
        developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter.init(true);
        developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter.setDeveloppementDeSavoirEtInnovationScientifique(false);
        vo.setDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiquesVo(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques()));
        developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter.setDeveloppementDeSavoirEtInnovationScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs()) && this.developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs){
        developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.init(true);
        developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.setDeveloppementDeSavoirEtInnovationScientifique(false);
        vo.setDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirsVo(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs()));
        developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter.setDeveloppementDeSavoirEtInnovationScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getDeveloppementDeSavoirEtInnovationScientifiquePayss()) && this.developpementDeSavoirEtInnovationScientifiquePayss){
        developpementDeSavoirEtInnovationScientifiquePaysConverter.init(true);
        developpementDeSavoirEtInnovationScientifiquePaysConverter.setDeveloppementDeSavoirEtInnovationScientifique(false);
        vo.setDeveloppementDeSavoirEtInnovationScientifiquePayssVo(developpementDeSavoirEtInnovationScientifiquePaysConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifiquePayss()));
        developpementDeSavoirEtInnovationScientifiquePaysConverter.setDeveloppementDeSavoirEtInnovationScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getDeveloppementDeSavoirEtInnovationScientifiqueEtablissements()) && this.developpementDeSavoirEtInnovationScientifiqueEtablissements){
        developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.init(true);
        developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.setDeveloppementDeSavoirEtInnovationScientifique(false);
        vo.setDeveloppementDeSavoirEtInnovationScientifiqueEtablissementsVo(developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifiqueEtablissements()));
        developpementDeSavoirEtInnovationScientifiqueEtablissementConverter.setDeveloppementDeSavoirEtInnovationScientifique(true);
        }

return vo;
}
}

public void init(Boolean value) {
    roleDeveloppementDeSavoir = value;
    savoirEtInnovation = value;
    etatEtapeCampagne = value;
        typeSavoirDeveloppementDeSavoirEtInnovationScientifiques = value;
        typeUtilisateurSavoirConcus = value;
        developpementDeSavoirEtInnovationScientifiqueModeDiffusions = value;
        developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds = value;
        developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques = value;
        developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs = value;
        developpementDeSavoirEtInnovationScientifiquePayss = value;
        developpementDeSavoirEtInnovationScientifiqueEtablissements = value;
}


        public SavoirEtInnovationConverter getSavoirEtInnovationConverter(){
        return this.savoirEtInnovationConverter;
        }
        public void setSavoirEtInnovationConverter(SavoirEtInnovationConverter savoirEtInnovationConverter ){
        this.savoirEtInnovationConverter = savoirEtInnovationConverter;
        }
        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public DeveloppementDeSavoirEtInnovationScientifiquePaysConverter getDeveloppementDeSavoirEtInnovationScientifiquePaysConverter(){
        return this.developpementDeSavoirEtInnovationScientifiquePaysConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiquePaysConverter(DeveloppementDeSavoirEtInnovationScientifiquePaysConverter developpementDeSavoirEtInnovationScientifiquePaysConverter ){
        this.developpementDeSavoirEtInnovationScientifiquePaysConverter = developpementDeSavoirEtInnovationScientifiquePaysConverter;
        }
        public DeveloppementDeSavoirEtInnovationScientifiqueEtablissementConverter getDeveloppementDeSavoirEtInnovationScientifiqueEtablissementConverter(){
        return this.developpementDeSavoirEtInnovationScientifiqueEtablissementConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiqueEtablissementConverter(DeveloppementDeSavoirEtInnovationScientifiqueEtablissementConverter developpementDeSavoirEtInnovationScientifiqueEtablissementConverter ){
        this.developpementDeSavoirEtInnovationScientifiqueEtablissementConverter = developpementDeSavoirEtInnovationScientifiqueEtablissementConverter;
        }
        public RoleDeveloppementDeSavoirConverter getRoleDeveloppementDeSavoirConverter(){
        return this.roleDeveloppementDeSavoirConverter;
        }
        public void setRoleDeveloppementDeSavoirConverter(RoleDeveloppementDeSavoirConverter roleDeveloppementDeSavoirConverter ){
        this.roleDeveloppementDeSavoirConverter = roleDeveloppementDeSavoirConverter;
        }
        public TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter getTypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter(){
        return this.typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter;
        }
        public void setTypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter(TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter ){
        this.typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter = typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueConverter;
        }
        public DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter getDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter(){
        return this.developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter(DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter ){
        this.developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter = developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter;
        }
        public TypeUtilisateurSavoirConcuConverter getTypeUtilisateurSavoirConcuConverter(){
        return this.typeUtilisateurSavoirConcuConverter;
        }
        public void setTypeUtilisateurSavoirConcuConverter(TypeUtilisateurSavoirConcuConverter typeUtilisateurSavoirConcuConverter ){
        this.typeUtilisateurSavoirConcuConverter = typeUtilisateurSavoirConcuConverter;
        }
        public DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter getDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter(){
        return this.developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter(DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter ){
        this.developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter = developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueConverter;
        }
        public DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionConverter getDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionConverter(){
        return this.developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionConverter(DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionConverter developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter ){
        this.developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter = developpementDeSavoirEtInnovationScientifiqueModeDiffusionConverter;
        }
        public DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter getDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter(){
        return this.developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter(DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter ){
        this.developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter = developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter;
        }

    public boolean  isRoleDeveloppementDeSavoir(){
    return this.roleDeveloppementDeSavoir;
    }
    public void  setRoleDeveloppementDeSavoir(boolean roleDeveloppementDeSavoir){
    this.roleDeveloppementDeSavoir = roleDeveloppementDeSavoir;
    }
    public boolean  isSavoirEtInnovation(){
    return this.savoirEtInnovation;
    }
    public void  setSavoirEtInnovation(boolean savoirEtInnovation){
    this.savoirEtInnovation = savoirEtInnovation;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }



        public Boolean  isTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques(){
        return this.typeSavoirDeveloppementDeSavoirEtInnovationScientifiques ;
        }
        public void  setTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques(Boolean typeSavoirDeveloppementDeSavoirEtInnovationScientifiques ){
        this.typeSavoirDeveloppementDeSavoirEtInnovationScientifiques  = typeSavoirDeveloppementDeSavoirEtInnovationScientifiques ;
        }







        public Boolean  isTypeUtilisateurSavoirConcus(){
        return this.typeUtilisateurSavoirConcus ;
        }
        public void  setTypeUtilisateurSavoirConcus(Boolean typeUtilisateurSavoirConcus ){
        this.typeUtilisateurSavoirConcus  = typeUtilisateurSavoirConcus ;
        }





        public Boolean  isDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions(){
        return this.developpementDeSavoirEtInnovationScientifiqueModeDiffusions ;
        }
        public void  setDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions(Boolean developpementDeSavoirEtInnovationScientifiqueModeDiffusions ){
        this.developpementDeSavoirEtInnovationScientifiqueModeDiffusions  = developpementDeSavoirEtInnovationScientifiqueModeDiffusions ;
        }



        public Boolean  isDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds(){
        return this.developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds ;
        }
        public void  setDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds(Boolean developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds ){
        this.developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds  = developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds ;
        }



        public Boolean  isDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques(){
        return this.developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques ;
        }
        public void  setDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques(Boolean developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques ){
        this.developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques  = developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques ;
        }



        public Boolean  isDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs(){
        return this.developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs ;
        }
        public void  setDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs(Boolean developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs ){
        this.developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs  = developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs ;
        }



        public Boolean  isDeveloppementDeSavoirEtInnovationScientifiquePayss(){
        return this.developpementDeSavoirEtInnovationScientifiquePayss ;
        }
        public void  setDeveloppementDeSavoirEtInnovationScientifiquePayss(Boolean developpementDeSavoirEtInnovationScientifiquePayss ){
        this.developpementDeSavoirEtInnovationScientifiquePayss  = developpementDeSavoirEtInnovationScientifiquePayss ;
        }



        public Boolean  isDeveloppementDeSavoirEtInnovationScientifiqueEtablissements(){
        return this.developpementDeSavoirEtInnovationScientifiqueEtablissements ;
        }
        public void  setDeveloppementDeSavoirEtInnovationScientifiqueEtablissements(Boolean developpementDeSavoirEtInnovationScientifiqueEtablissements ){
        this.developpementDeSavoirEtInnovationScientifiqueEtablissements  = developpementDeSavoirEtInnovationScientifiqueEtablissements ;
        }








}
