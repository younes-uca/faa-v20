package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.FormationContinue;
import com.ird.faa.ws.rest.provided.vo.FormationContinueVo;

@Component
public class FormationContinueConverter extends AbstractConverter<FormationContinue,FormationContinueVo>{

        @Autowired
        private EnseignementEtFormationConverter enseignementEtFormationConverter ;
        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private FormationContinueDisciplineScientifiqueConverter formationContinueDisciplineScientifiqueConverter ;
        @Autowired
        private ModaliteFormationContinueConverter modaliteFormationContinueConverter ;
        @Autowired
        private FormationContinueObjetFormationGeneriqueConverter formationContinueObjetFormationGeneriqueConverter ;
        @Autowired
        private FormationContinueEnjeuxIrdConverter formationContinueEnjeuxIrdConverter ;
        @Autowired
        private ZoneGeographiqueFormationContinueConverter zoneGeographiqueFormationContinueConverter ;
        @Autowired
        private FormationContinueCommanditaireConverter formationContinueCommanditaireConverter ;
        @Autowired
        private FormationContinuePubliqueProfessionelConverter formationContinuePubliqueProfessionelConverter ;
        @Autowired
        private PaysFormationContinueConverter paysFormationContinueConverter ;
    private Boolean modaliteFormationContinue;
    private Boolean enseignementEtFormation;
    private Boolean etatEtapeCampagne;
        private Boolean formationContinuePubliqueProfessionels;
        private Boolean formationContinueObjetFormationGeneriques;
        private Boolean formationContinueEnjeuxIrds;
        private Boolean formationContinueDisciplineScientifiques;
        private Boolean paysFormationContinue;
        private Boolean zoneGeographiqueFormationContinues;
        private Boolean formationContinueCommanditaires;

public  FormationContinueConverter(){
init(true);
}

@Override
public FormationContinue toItem(FormationContinueVo vo) {
if (vo == null) {
return null;
} else {
FormationContinue item = new FormationContinue();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getIntitule()))
        item.setIntitule(vo.getIntitule());
        if(StringUtil.isNotEmpty(vo.getNombreHeuresDispenseesDansAnnee()))
        item.setNombreHeuresDispenseesDansAnnee(NumberUtil.toBigDecimal(vo.getNombreHeuresDispenseesDansAnnee()));
    if(vo.getModaliteFormationContinueVo()!=null && this.modaliteFormationContinue)
        item.setModaliteFormationContinue(modaliteFormationContinueConverter.toItem(vo.getModaliteFormationContinueVo())) ;
    if(vo.getEnseignementEtFormationVo()!=null && this.enseignementEtFormation)
        item.setEnseignementEtFormation(enseignementEtFormationConverter.toItem(vo.getEnseignementEtFormationVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getFormationContinuePubliqueProfessionelsVo()) && this.formationContinuePubliqueProfessionels)
        item.setFormationContinuePubliqueProfessionels(formationContinuePubliqueProfessionelConverter.toItem(vo.getFormationContinuePubliqueProfessionelsVo()));
    if(ListUtil.isNotEmpty(vo.getFormationContinueObjetFormationGeneriquesVo()) && this.formationContinueObjetFormationGeneriques)
        item.setFormationContinueObjetFormationGeneriques(formationContinueObjetFormationGeneriqueConverter.toItem(vo.getFormationContinueObjetFormationGeneriquesVo()));
    if(ListUtil.isNotEmpty(vo.getFormationContinueEnjeuxIrdsVo()) && this.formationContinueEnjeuxIrds)
        item.setFormationContinueEnjeuxIrds(formationContinueEnjeuxIrdConverter.toItem(vo.getFormationContinueEnjeuxIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getFormationContinueDisciplineScientifiquesVo()) && this.formationContinueDisciplineScientifiques)
        item.setFormationContinueDisciplineScientifiques(formationContinueDisciplineScientifiqueConverter.toItem(vo.getFormationContinueDisciplineScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getPaysFormationContinueVo()) && this.paysFormationContinue)
        item.setPaysFormationContinue(paysFormationContinueConverter.toItem(vo.getPaysFormationContinueVo()));
    if(ListUtil.isNotEmpty(vo.getZoneGeographiqueFormationContinuesVo()) && this.zoneGeographiqueFormationContinues)
        item.setZoneGeographiqueFormationContinues(zoneGeographiqueFormationContinueConverter.toItem(vo.getZoneGeographiqueFormationContinuesVo()));
    if(ListUtil.isNotEmpty(vo.getFormationContinueCommanditairesVo()) && this.formationContinueCommanditaires)
        item.setFormationContinueCommanditaires(formationContinueCommanditaireConverter.toItem(vo.getFormationContinueCommanditairesVo()));

return item;
}
}

@Override
public FormationContinueVo toVo(FormationContinue item) {
if (item == null) {
return null;
} else {
FormationContinueVo vo = new FormationContinueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getIntitule()))
        vo.setIntitule(item.getIntitule());

        if(item.getNombreHeuresDispenseesDansAnnee()!=null)
        vo.setNombreHeuresDispenseesDansAnnee(NumberUtil.toString(item.getNombreHeuresDispenseesDansAnnee()));

    if(item.getModaliteFormationContinue()!=null && this.modaliteFormationContinue) {
        vo.setModaliteFormationContinueVo(modaliteFormationContinueConverter.toVo(item.getModaliteFormationContinue())) ;
    }
    if(item.getEnseignementEtFormation()!=null && this.enseignementEtFormation) {
        vo.setEnseignementEtFormationVo(enseignementEtFormationConverter.toVo(item.getEnseignementEtFormation())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getFormationContinuePubliqueProfessionels()) && this.formationContinuePubliqueProfessionels){
        formationContinuePubliqueProfessionelConverter.init(true);
        formationContinuePubliqueProfessionelConverter.setFormationContinue(false);
        vo.setFormationContinuePubliqueProfessionelsVo(formationContinuePubliqueProfessionelConverter.toVo(item.getFormationContinuePubliqueProfessionels()));
        formationContinuePubliqueProfessionelConverter.setFormationContinue(true);
        }
        if(ListUtil.isNotEmpty(item.getFormationContinueObjetFormationGeneriques()) && this.formationContinueObjetFormationGeneriques){
        formationContinueObjetFormationGeneriqueConverter.init(true);
        formationContinueObjetFormationGeneriqueConverter.setFormationContinue(false);
        vo.setFormationContinueObjetFormationGeneriquesVo(formationContinueObjetFormationGeneriqueConverter.toVo(item.getFormationContinueObjetFormationGeneriques()));
        formationContinueObjetFormationGeneriqueConverter.setFormationContinue(true);
        }
        if(ListUtil.isNotEmpty(item.getFormationContinueEnjeuxIrds()) && this.formationContinueEnjeuxIrds){
        formationContinueEnjeuxIrdConverter.init(true);
        formationContinueEnjeuxIrdConverter.setFormationContinue(false);
        vo.setFormationContinueEnjeuxIrdsVo(formationContinueEnjeuxIrdConverter.toVo(item.getFormationContinueEnjeuxIrds()));
        formationContinueEnjeuxIrdConverter.setFormationContinue(true);
        }
        if(ListUtil.isNotEmpty(item.getFormationContinueDisciplineScientifiques()) && this.formationContinueDisciplineScientifiques){
        formationContinueDisciplineScientifiqueConverter.init(true);
        formationContinueDisciplineScientifiqueConverter.setFormationContinue(false);
        vo.setFormationContinueDisciplineScientifiquesVo(formationContinueDisciplineScientifiqueConverter.toVo(item.getFormationContinueDisciplineScientifiques()));
        formationContinueDisciplineScientifiqueConverter.setFormationContinue(true);
        }
        if(ListUtil.isNotEmpty(item.getPaysFormationContinue()) && this.paysFormationContinue){
        paysFormationContinueConverter.init(true);
        paysFormationContinueConverter.setFormationContinue(false);
        vo.setPaysFormationContinueVo(paysFormationContinueConverter.toVo(item.getPaysFormationContinue()));
        paysFormationContinueConverter.setFormationContinue(true);
        }
        if(ListUtil.isNotEmpty(item.getZoneGeographiqueFormationContinues()) && this.zoneGeographiqueFormationContinues){
        zoneGeographiqueFormationContinueConverter.init(true);
        zoneGeographiqueFormationContinueConverter.setFormationContinue(false);
        vo.setZoneGeographiqueFormationContinuesVo(zoneGeographiqueFormationContinueConverter.toVo(item.getZoneGeographiqueFormationContinues()));
        zoneGeographiqueFormationContinueConverter.setFormationContinue(true);
        }
        if(ListUtil.isNotEmpty(item.getFormationContinueCommanditaires()) && this.formationContinueCommanditaires){
        formationContinueCommanditaireConverter.init(true);
        formationContinueCommanditaireConverter.setFormationContinue(false);
        vo.setFormationContinueCommanditairesVo(formationContinueCommanditaireConverter.toVo(item.getFormationContinueCommanditaires()));
        formationContinueCommanditaireConverter.setFormationContinue(true);
        }

return vo;
}
}

public void init(Boolean value) {
    modaliteFormationContinue = value;
    enseignementEtFormation = value;
    etatEtapeCampagne = value;
        formationContinuePubliqueProfessionels = value;
        formationContinueObjetFormationGeneriques = value;
        formationContinueEnjeuxIrds = value;
        formationContinueDisciplineScientifiques = value;
        paysFormationContinue = value;
        zoneGeographiqueFormationContinues = value;
        formationContinueCommanditaires = value;
}


        public EnseignementEtFormationConverter getEnseignementEtFormationConverter(){
        return this.enseignementEtFormationConverter;
        }
        public void setEnseignementEtFormationConverter(EnseignementEtFormationConverter enseignementEtFormationConverter ){
        this.enseignementEtFormationConverter = enseignementEtFormationConverter;
        }
        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public FormationContinueDisciplineScientifiqueConverter getFormationContinueDisciplineScientifiqueConverter(){
        return this.formationContinueDisciplineScientifiqueConverter;
        }
        public void setFormationContinueDisciplineScientifiqueConverter(FormationContinueDisciplineScientifiqueConverter formationContinueDisciplineScientifiqueConverter ){
        this.formationContinueDisciplineScientifiqueConverter = formationContinueDisciplineScientifiqueConverter;
        }
        public ModaliteFormationContinueConverter getModaliteFormationContinueConverter(){
        return this.modaliteFormationContinueConverter;
        }
        public void setModaliteFormationContinueConverter(ModaliteFormationContinueConverter modaliteFormationContinueConverter ){
        this.modaliteFormationContinueConverter = modaliteFormationContinueConverter;
        }
        public FormationContinueObjetFormationGeneriqueConverter getFormationContinueObjetFormationGeneriqueConverter(){
        return this.formationContinueObjetFormationGeneriqueConverter;
        }
        public void setFormationContinueObjetFormationGeneriqueConverter(FormationContinueObjetFormationGeneriqueConverter formationContinueObjetFormationGeneriqueConverter ){
        this.formationContinueObjetFormationGeneriqueConverter = formationContinueObjetFormationGeneriqueConverter;
        }
        public FormationContinueEnjeuxIrdConverter getFormationContinueEnjeuxIrdConverter(){
        return this.formationContinueEnjeuxIrdConverter;
        }
        public void setFormationContinueEnjeuxIrdConverter(FormationContinueEnjeuxIrdConverter formationContinueEnjeuxIrdConverter ){
        this.formationContinueEnjeuxIrdConverter = formationContinueEnjeuxIrdConverter;
        }
        public ZoneGeographiqueFormationContinueConverter getZoneGeographiqueFormationContinueConverter(){
        return this.zoneGeographiqueFormationContinueConverter;
        }
        public void setZoneGeographiqueFormationContinueConverter(ZoneGeographiqueFormationContinueConverter zoneGeographiqueFormationContinueConverter ){
        this.zoneGeographiqueFormationContinueConverter = zoneGeographiqueFormationContinueConverter;
        }
        public FormationContinueCommanditaireConverter getFormationContinueCommanditaireConverter(){
        return this.formationContinueCommanditaireConverter;
        }
        public void setFormationContinueCommanditaireConverter(FormationContinueCommanditaireConverter formationContinueCommanditaireConverter ){
        this.formationContinueCommanditaireConverter = formationContinueCommanditaireConverter;
        }
        public FormationContinuePubliqueProfessionelConverter getFormationContinuePubliqueProfessionelConverter(){
        return this.formationContinuePubliqueProfessionelConverter;
        }
        public void setFormationContinuePubliqueProfessionelConverter(FormationContinuePubliqueProfessionelConverter formationContinuePubliqueProfessionelConverter ){
        this.formationContinuePubliqueProfessionelConverter = formationContinuePubliqueProfessionelConverter;
        }
        public PaysFormationContinueConverter getPaysFormationContinueConverter(){
        return this.paysFormationContinueConverter;
        }
        public void setPaysFormationContinueConverter(PaysFormationContinueConverter paysFormationContinueConverter ){
        this.paysFormationContinueConverter = paysFormationContinueConverter;
        }

    public boolean  isModaliteFormationContinue(){
    return this.modaliteFormationContinue;
    }
    public void  setModaliteFormationContinue(boolean modaliteFormationContinue){
    this.modaliteFormationContinue = modaliteFormationContinue;
    }
    public boolean  isEnseignementEtFormation(){
    return this.enseignementEtFormation;
    }
    public void  setEnseignementEtFormation(boolean enseignementEtFormation){
    this.enseignementEtFormation = enseignementEtFormation;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }





        public Boolean  isFormationContinuePubliqueProfessionels(){
        return this.formationContinuePubliqueProfessionels ;
        }
        public void  setFormationContinuePubliqueProfessionels(Boolean formationContinuePubliqueProfessionels ){
        this.formationContinuePubliqueProfessionels  = formationContinuePubliqueProfessionels ;
        }







        public Boolean  isFormationContinueObjetFormationGeneriques(){
        return this.formationContinueObjetFormationGeneriques ;
        }
        public void  setFormationContinueObjetFormationGeneriques(Boolean formationContinueObjetFormationGeneriques ){
        this.formationContinueObjetFormationGeneriques  = formationContinueObjetFormationGeneriques ;
        }



        public Boolean  isFormationContinueEnjeuxIrds(){
        return this.formationContinueEnjeuxIrds ;
        }
        public void  setFormationContinueEnjeuxIrds(Boolean formationContinueEnjeuxIrds ){
        this.formationContinueEnjeuxIrds  = formationContinueEnjeuxIrds ;
        }



        public Boolean  isFormationContinueDisciplineScientifiques(){
        return this.formationContinueDisciplineScientifiques ;
        }
        public void  setFormationContinueDisciplineScientifiques(Boolean formationContinueDisciplineScientifiques ){
        this.formationContinueDisciplineScientifiques  = formationContinueDisciplineScientifiques ;
        }



        public Boolean  isPaysFormationContinue(){
        return this.paysFormationContinue ;
        }
        public void  setPaysFormationContinue(Boolean paysFormationContinue ){
        this.paysFormationContinue  = paysFormationContinue ;
        }



        public Boolean  isZoneGeographiqueFormationContinues(){
        return this.zoneGeographiqueFormationContinues ;
        }
        public void  setZoneGeographiqueFormationContinues(Boolean zoneGeographiqueFormationContinues ){
        this.zoneGeographiqueFormationContinues  = zoneGeographiqueFormationContinues ;
        }



        public Boolean  isFormationContinueCommanditaires(){
        return this.formationContinueCommanditaires ;
        }
        public void  setFormationContinueCommanditaires(Boolean formationContinueCommanditaires ){
        this.formationContinueCommanditaires  = formationContinueCommanditaires ;
        }






}
