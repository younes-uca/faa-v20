package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ProjetActiviteRechercheDetail;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailVo;

@Component
public class ProjetActiviteRechercheDetailConverter extends AbstractConverter<ProjetActiviteRechercheDetail,ProjetActiviteRechercheDetailVo>{

        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private ProjetActiviteRechercheDetailPaysConverter projetActiviteRechercheDetailPaysConverter ;
        @Autowired
        private ProjetActiviteRechercheConverter projetActiviteRechercheConverter ;
        @Autowired
        private RoleProjetConverter roleProjetConverter ;
        @Autowired
        private ProjetActiviteRechercheDetailEtablissementLanceurConverter projetActiviteRechercheDetailEtablissementLanceurConverter ;
        @Autowired
        private StatusProjetConverter statusProjetConverter ;
        @Autowired
        private EtablissementConverter etablissementConverter ;
        @Autowired
        private ProjetActiviteRechercheDetailInstitutionCoContractantConverter projetActiviteRechercheDetailInstitutionCoContractantConverter ;
        @Autowired
        private PaysConverter paysConverter ;
        @Autowired
        private ProjetActiviteRechercheDetailEnjeuxIrdConverter projetActiviteRechercheDetailEnjeuxIrdConverter ;
        @Autowired
        private ProjetActiviteRechercheDetailInstrumentIrdConverter projetActiviteRechercheDetailInstrumentIrdConverter ;
    private Boolean statusProjet;
    private Boolean roleProjet;
    private Boolean etablissement;
    private Boolean pays;
    private Boolean projetActiviteRecherche;
    private Boolean etatEtapeCampagne;
        private Boolean projetActiviteRechercheDetailEnjeuxIrds;
        private Boolean projetActiviteRechercheDetailInstrumentIrds;
        private Boolean projetActiviteRechercheDetailPayss;
        private Boolean projetActiviteRechercheDetailInstitutionCoContractants;
        private Boolean projetActiviteRechercheDetailEtablissementLanceurs;

public  ProjetActiviteRechercheDetailConverter(){
init(true);
}

@Override
public ProjetActiviteRechercheDetail toItem(ProjetActiviteRechercheDetailVo vo) {
if (vo == null) {
return null;
} else {
ProjetActiviteRechercheDetail item = new ProjetActiviteRechercheDetail();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getSujetIntituleReponse()))
        item.setSujetIntituleReponse(vo.getSujetIntituleReponse());
        if(StringUtil.isNotEmpty(vo.getDureePrevuEnMois()))
        item.setDureePrevuEnMois(NumberUtil.toInt(vo.getDureePrevuEnMois()));
            if(vo.getFinancementSpecifique() != null)
            item.setFinancementSpecifique(vo.getFinancementSpecifique());
        if(StringUtil.isNotEmpty(vo.getMontantFinancementPrevu()))
        item.setMontantFinancementPrevu(NumberUtil.toBigDecimal(vo.getMontantFinancementPrevu()));
    if(vo.getStatusProjetVo()!=null && this.statusProjet)
        item.setStatusProjet(statusProjetConverter.toItem(vo.getStatusProjetVo())) ;
    if(vo.getRoleProjetVo()!=null && this.roleProjet)
        item.setRoleProjet(roleProjetConverter.toItem(vo.getRoleProjetVo())) ;
    if(vo.getEtablissementVo()!=null && this.etablissement)
        item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getProjetActiviteRechercheVo()!=null && this.projetActiviteRecherche)
        item.setProjetActiviteRecherche(projetActiviteRechercheConverter.toItem(vo.getProjetActiviteRechercheVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getProjetActiviteRechercheDetailEnjeuxIrdsVo()) && this.projetActiviteRechercheDetailEnjeuxIrds)
        item.setProjetActiviteRechercheDetailEnjeuxIrds(projetActiviteRechercheDetailEnjeuxIrdConverter.toItem(vo.getProjetActiviteRechercheDetailEnjeuxIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getProjetActiviteRechercheDetailInstrumentIrdsVo()) && this.projetActiviteRechercheDetailInstrumentIrds)
        item.setProjetActiviteRechercheDetailInstrumentIrds(projetActiviteRechercheDetailInstrumentIrdConverter.toItem(vo.getProjetActiviteRechercheDetailInstrumentIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getProjetActiviteRechercheDetailPayssVo()) && this.projetActiviteRechercheDetailPayss)
        item.setProjetActiviteRechercheDetailPayss(projetActiviteRechercheDetailPaysConverter.toItem(vo.getProjetActiviteRechercheDetailPayssVo()));
    if(ListUtil.isNotEmpty(vo.getProjetActiviteRechercheDetailInstitutionCoContractantsVo()) && this.projetActiviteRechercheDetailInstitutionCoContractants)
        item.setProjetActiviteRechercheDetailInstitutionCoContractants(projetActiviteRechercheDetailInstitutionCoContractantConverter.toItem(vo.getProjetActiviteRechercheDetailInstitutionCoContractantsVo()));
    if(ListUtil.isNotEmpty(vo.getProjetActiviteRechercheDetailEtablissementLanceursVo()) && this.projetActiviteRechercheDetailEtablissementLanceurs)
        item.setProjetActiviteRechercheDetailEtablissementLanceurs(projetActiviteRechercheDetailEtablissementLanceurConverter.toItem(vo.getProjetActiviteRechercheDetailEtablissementLanceursVo()));

return item;
}
}

@Override
public ProjetActiviteRechercheDetailVo toVo(ProjetActiviteRechercheDetail item) {
if (item == null) {
return null;
} else {
ProjetActiviteRechercheDetailVo vo = new ProjetActiviteRechercheDetailVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getSujetIntituleReponse()))
        vo.setSujetIntituleReponse(item.getSujetIntituleReponse());

        if(item.getDureePrevuEnMois()!=null)
        vo.setDureePrevuEnMois(NumberUtil.toString(item.getDureePrevuEnMois()));

        if(item.getFinancementSpecifique()!=null)
        vo.setFinancementSpecifique(item.getFinancementSpecifique());
        if(item.getMontantFinancementPrevu()!=null)
        vo.setMontantFinancementPrevu(NumberUtil.toString(item.getMontantFinancementPrevu()));

    if(item.getStatusProjet()!=null && this.statusProjet) {
        vo.setStatusProjetVo(statusProjetConverter.toVo(item.getStatusProjet())) ;
    }
    if(item.getRoleProjet()!=null && this.roleProjet) {
        vo.setRoleProjetVo(roleProjetConverter.toVo(item.getRoleProjet())) ;
    }
    if(item.getEtablissement()!=null && this.etablissement) {
        vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getProjetActiviteRecherche()!=null && this.projetActiviteRecherche) {
        vo.setProjetActiviteRechercheVo(projetActiviteRechercheConverter.toVo(item.getProjetActiviteRecherche())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getProjetActiviteRechercheDetailEnjeuxIrds()) && this.projetActiviteRechercheDetailEnjeuxIrds){
        projetActiviteRechercheDetailEnjeuxIrdConverter.init(true);
        projetActiviteRechercheDetailEnjeuxIrdConverter.setProjetActiviteRechercheDetail(false);
        vo.setProjetActiviteRechercheDetailEnjeuxIrdsVo(projetActiviteRechercheDetailEnjeuxIrdConverter.toVo(item.getProjetActiviteRechercheDetailEnjeuxIrds()));
        projetActiviteRechercheDetailEnjeuxIrdConverter.setProjetActiviteRechercheDetail(true);
        }
        if(ListUtil.isNotEmpty(item.getProjetActiviteRechercheDetailInstrumentIrds()) && this.projetActiviteRechercheDetailInstrumentIrds){
        projetActiviteRechercheDetailInstrumentIrdConverter.init(true);
        projetActiviteRechercheDetailInstrumentIrdConverter.setProjetActiviteRechercheDetail(false);
        vo.setProjetActiviteRechercheDetailInstrumentIrdsVo(projetActiviteRechercheDetailInstrumentIrdConverter.toVo(item.getProjetActiviteRechercheDetailInstrumentIrds()));
        projetActiviteRechercheDetailInstrumentIrdConverter.setProjetActiviteRechercheDetail(true);
        }
        if(ListUtil.isNotEmpty(item.getProjetActiviteRechercheDetailPayss()) && this.projetActiviteRechercheDetailPayss){
        projetActiviteRechercheDetailPaysConverter.init(true);
        projetActiviteRechercheDetailPaysConverter.setProjetActiviteRechercheDetail(false);
        vo.setProjetActiviteRechercheDetailPayssVo(projetActiviteRechercheDetailPaysConverter.toVo(item.getProjetActiviteRechercheDetailPayss()));
        projetActiviteRechercheDetailPaysConverter.setProjetActiviteRechercheDetail(true);
        }
        if(ListUtil.isNotEmpty(item.getProjetActiviteRechercheDetailInstitutionCoContractants()) && this.projetActiviteRechercheDetailInstitutionCoContractants){
        projetActiviteRechercheDetailInstitutionCoContractantConverter.init(true);
        projetActiviteRechercheDetailInstitutionCoContractantConverter.setProjetActiviteRechercheDetail(false);
        vo.setProjetActiviteRechercheDetailInstitutionCoContractantsVo(projetActiviteRechercheDetailInstitutionCoContractantConverter.toVo(item.getProjetActiviteRechercheDetailInstitutionCoContractants()));
        projetActiviteRechercheDetailInstitutionCoContractantConverter.setProjetActiviteRechercheDetail(true);
        }
        if(ListUtil.isNotEmpty(item.getProjetActiviteRechercheDetailEtablissementLanceurs()) && this.projetActiviteRechercheDetailEtablissementLanceurs){
        projetActiviteRechercheDetailEtablissementLanceurConverter.init(true);
        projetActiviteRechercheDetailEtablissementLanceurConverter.setProjetActiviteRechercheDetail(false);
        vo.setProjetActiviteRechercheDetailEtablissementLanceursVo(projetActiviteRechercheDetailEtablissementLanceurConverter.toVo(item.getProjetActiviteRechercheDetailEtablissementLanceurs()));
        projetActiviteRechercheDetailEtablissementLanceurConverter.setProjetActiviteRechercheDetail(true);
        }

return vo;
}
}

public void init(Boolean value) {
    statusProjet = value;
    roleProjet = value;
    etablissement = value;
    pays = value;
    projetActiviteRecherche = value;
    etatEtapeCampagne = value;
        projetActiviteRechercheDetailEnjeuxIrds = value;
        projetActiviteRechercheDetailInstrumentIrds = value;
        projetActiviteRechercheDetailPayss = value;
        projetActiviteRechercheDetailInstitutionCoContractants = value;
        projetActiviteRechercheDetailEtablissementLanceurs = value;
}


        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public ProjetActiviteRechercheDetailPaysConverter getProjetActiviteRechercheDetailPaysConverter(){
        return this.projetActiviteRechercheDetailPaysConverter;
        }
        public void setProjetActiviteRechercheDetailPaysConverter(ProjetActiviteRechercheDetailPaysConverter projetActiviteRechercheDetailPaysConverter ){
        this.projetActiviteRechercheDetailPaysConverter = projetActiviteRechercheDetailPaysConverter;
        }
        public ProjetActiviteRechercheConverter getProjetActiviteRechercheConverter(){
        return this.projetActiviteRechercheConverter;
        }
        public void setProjetActiviteRechercheConverter(ProjetActiviteRechercheConverter projetActiviteRechercheConverter ){
        this.projetActiviteRechercheConverter = projetActiviteRechercheConverter;
        }
        public RoleProjetConverter getRoleProjetConverter(){
        return this.roleProjetConverter;
        }
        public void setRoleProjetConverter(RoleProjetConverter roleProjetConverter ){
        this.roleProjetConverter = roleProjetConverter;
        }
        public ProjetActiviteRechercheDetailEtablissementLanceurConverter getProjetActiviteRechercheDetailEtablissementLanceurConverter(){
        return this.projetActiviteRechercheDetailEtablissementLanceurConverter;
        }
        public void setProjetActiviteRechercheDetailEtablissementLanceurConverter(ProjetActiviteRechercheDetailEtablissementLanceurConverter projetActiviteRechercheDetailEtablissementLanceurConverter ){
        this.projetActiviteRechercheDetailEtablissementLanceurConverter = projetActiviteRechercheDetailEtablissementLanceurConverter;
        }
        public StatusProjetConverter getStatusProjetConverter(){
        return this.statusProjetConverter;
        }
        public void setStatusProjetConverter(StatusProjetConverter statusProjetConverter ){
        this.statusProjetConverter = statusProjetConverter;
        }
        public EtablissementConverter getEtablissementConverter(){
        return this.etablissementConverter;
        }
        public void setEtablissementConverter(EtablissementConverter etablissementConverter ){
        this.etablissementConverter = etablissementConverter;
        }
        public ProjetActiviteRechercheDetailInstitutionCoContractantConverter getProjetActiviteRechercheDetailInstitutionCoContractantConverter(){
        return this.projetActiviteRechercheDetailInstitutionCoContractantConverter;
        }
        public void setProjetActiviteRechercheDetailInstitutionCoContractantConverter(ProjetActiviteRechercheDetailInstitutionCoContractantConverter projetActiviteRechercheDetailInstitutionCoContractantConverter ){
        this.projetActiviteRechercheDetailInstitutionCoContractantConverter = projetActiviteRechercheDetailInstitutionCoContractantConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }
        public ProjetActiviteRechercheDetailEnjeuxIrdConverter getProjetActiviteRechercheDetailEnjeuxIrdConverter(){
        return this.projetActiviteRechercheDetailEnjeuxIrdConverter;
        }
        public void setProjetActiviteRechercheDetailEnjeuxIrdConverter(ProjetActiviteRechercheDetailEnjeuxIrdConverter projetActiviteRechercheDetailEnjeuxIrdConverter ){
        this.projetActiviteRechercheDetailEnjeuxIrdConverter = projetActiviteRechercheDetailEnjeuxIrdConverter;
        }
        public ProjetActiviteRechercheDetailInstrumentIrdConverter getProjetActiviteRechercheDetailInstrumentIrdConverter(){
        return this.projetActiviteRechercheDetailInstrumentIrdConverter;
        }
        public void setProjetActiviteRechercheDetailInstrumentIrdConverter(ProjetActiviteRechercheDetailInstrumentIrdConverter projetActiviteRechercheDetailInstrumentIrdConverter ){
        this.projetActiviteRechercheDetailInstrumentIrdConverter = projetActiviteRechercheDetailInstrumentIrdConverter;
        }

    public boolean  isStatusProjet(){
    return this.statusProjet;
    }
    public void  setStatusProjet(boolean statusProjet){
    this.statusProjet = statusProjet;
    }
    public boolean  isRoleProjet(){
    return this.roleProjet;
    }
    public void  setRoleProjet(boolean roleProjet){
    this.roleProjet = roleProjet;
    }
    public boolean  isEtablissement(){
    return this.etablissement;
    }
    public void  setEtablissement(boolean etablissement){
    this.etablissement = etablissement;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }
    public boolean  isProjetActiviteRecherche(){
    return this.projetActiviteRecherche;
    }
    public void  setProjetActiviteRecherche(boolean projetActiviteRecherche){
    this.projetActiviteRecherche = projetActiviteRecherche;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }











        public Boolean  isProjetActiviteRechercheDetailEnjeuxIrds(){
        return this.projetActiviteRechercheDetailEnjeuxIrds ;
        }
        public void  setProjetActiviteRechercheDetailEnjeuxIrds(Boolean projetActiviteRechercheDetailEnjeuxIrds ){
        this.projetActiviteRechercheDetailEnjeuxIrds  = projetActiviteRechercheDetailEnjeuxIrds ;
        }



        public Boolean  isProjetActiviteRechercheDetailInstrumentIrds(){
        return this.projetActiviteRechercheDetailInstrumentIrds ;
        }
        public void  setProjetActiviteRechercheDetailInstrumentIrds(Boolean projetActiviteRechercheDetailInstrumentIrds ){
        this.projetActiviteRechercheDetailInstrumentIrds  = projetActiviteRechercheDetailInstrumentIrds ;
        }



        public Boolean  isProjetActiviteRechercheDetailPayss(){
        return this.projetActiviteRechercheDetailPayss ;
        }
        public void  setProjetActiviteRechercheDetailPayss(Boolean projetActiviteRechercheDetailPayss ){
        this.projetActiviteRechercheDetailPayss  = projetActiviteRechercheDetailPayss ;
        }











        public Boolean  isProjetActiviteRechercheDetailInstitutionCoContractants(){
        return this.projetActiviteRechercheDetailInstitutionCoContractants ;
        }
        public void  setProjetActiviteRechercheDetailInstitutionCoContractants(Boolean projetActiviteRechercheDetailInstitutionCoContractants ){
        this.projetActiviteRechercheDetailInstitutionCoContractants  = projetActiviteRechercheDetailInstitutionCoContractants ;
        }



        public Boolean  isProjetActiviteRechercheDetailEtablissementLanceurs(){
        return this.projetActiviteRechercheDetailEtablissementLanceurs ;
        }
        public void  setProjetActiviteRechercheDetailEtablissementLanceurs(Boolean projetActiviteRechercheDetailEtablissementLanceurs ){
        this.projetActiviteRechercheDetailEtablissementLanceurs  = projetActiviteRechercheDetailEtablissementLanceurs ;
        }






}
