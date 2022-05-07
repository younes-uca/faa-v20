package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.RencontreGrandPubliqueJeunePublique;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueVo;

@Component
public class RencontreGrandPubliqueJeunePubliqueConverter extends AbstractConverter<RencontreGrandPubliqueJeunePublique,RencontreGrandPubliqueJeunePubliqueVo>{

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter ;
        @Autowired
        private RencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter ;
        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter ;
        @Autowired
        private FormatRencontreConverter formatRencontreConverter ;
        @Autowired
        private PaysRencontreGrandPubliqueJeunePubliqueConverter paysRencontreGrandPubliqueJeunePubliqueConverter ;
        @Autowired
        private RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter ;
        @Autowired
        private PaysConverter paysConverter ;
        @Autowired
        private CultureScientifiqueConverter cultureScientifiqueConverter ;
        @Autowired
        private RencontreGrandPubliqueJeunePubliquePeriodeConverter rencontreGrandPubliqueJeunePubliquePeriodeConverter ;
        @Autowired
        private PaysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter ;
        @Autowired
        private TypePubliqueRencontreGrandPubliqueJeunePubliqueConverter typePubliqueRencontreGrandPubliqueJeunePubliqueConverter ;
        @Autowired
        private StructureOganisatriceConverter structureOganisatriceConverter ;
        @Autowired
        private ContexteConverter contexteConverter ;
    private Boolean formatRencontre;
    private Boolean contexte;
    private Boolean pays;
    private Boolean cultureScientifique;
    private Boolean etatEtapeCampagne;
        private Boolean typePubliqueRencontreGrandPubliqueJeunePubliques;
        private Boolean rencontreGrandPubliqueJeunePubliqueEnjeuxIrds;
        private Boolean rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques;
        private Boolean rencontreGrandPubliqueJeunePubliquePeriodes;
        private Boolean structureOganisatrices;
        private Boolean paysRencontreGrandPubliqueJeunePubliques;
        private Boolean paysOrganisateurRencontreGrandPubliqueJeunePubliques;
        private Boolean rencontreGrandPubliqueJeunePubliqueInstrumentIrds;
        private Boolean rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds;

public  RencontreGrandPubliqueJeunePubliqueConverter(){
init(true);
}

@Override
public RencontreGrandPubliqueJeunePublique toItem(RencontreGrandPubliqueJeunePubliqueVo vo) {
if (vo == null) {
return null;
} else {
RencontreGrandPubliqueJeunePublique item = new RencontreGrandPubliqueJeunePublique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getIntituleSujet()))
        item.setIntituleSujet(vo.getIntituleSujet());
        if(StringUtil.isNotEmpty(vo.getNombrePersonneEstime()))
        item.setNombrePersonneEstime(NumberUtil.toBigDecimal(vo.getNombrePersonneEstime()));
            if(vo.getLienInstrumentIrd() != null)
            item.setLienInstrumentIrd(vo.getLienInstrumentIrd());
        if(StringUtil.isNotEmpty(vo.getLienWeb()))
        item.setLienWeb(vo.getLienWeb());
        if(StringUtil.isNotEmpty(vo.getRemarque()))
        item.setRemarque(vo.getRemarque());
    if(vo.getFormatRencontreVo()!=null && this.formatRencontre)
        item.setFormatRencontre(formatRencontreConverter.toItem(vo.getFormatRencontreVo())) ;
    if(vo.getContexteVo()!=null && this.contexte)
        item.setContexte(contexteConverter.toItem(vo.getContexteVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getCultureScientifiqueVo()!=null && this.cultureScientifique)
        item.setCultureScientifique(cultureScientifiqueConverter.toItem(vo.getCultureScientifiqueVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getTypePubliqueRencontreGrandPubliqueJeunePubliquesVo()) && this.typePubliqueRencontreGrandPubliqueJeunePubliques)
        item.setTypePubliqueRencontreGrandPubliqueJeunePubliques(typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.toItem(vo.getTypePubliqueRencontreGrandPubliqueJeunePubliquesVo()));
    if(ListUtil.isNotEmpty(vo.getRencontreGrandPubliqueJeunePubliqueEnjeuxIrdsVo()) && this.rencontreGrandPubliqueJeunePubliqueEnjeuxIrds)
        item.setRencontreGrandPubliqueJeunePubliqueEnjeuxIrds(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.toItem(vo.getRencontreGrandPubliqueJeunePubliqueEnjeuxIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getRencontreGrandPubliqueJeunePubliqueDisciplineScientifiquesVo()) && this.rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques)
        item.setRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.toItem(vo.getRencontreGrandPubliqueJeunePubliqueDisciplineScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getRencontreGrandPubliqueJeunePubliquePeriodesVo()) && this.rencontreGrandPubliqueJeunePubliquePeriodes)
        item.setRencontreGrandPubliqueJeunePubliquePeriodes(rencontreGrandPubliqueJeunePubliquePeriodeConverter.toItem(vo.getRencontreGrandPubliqueJeunePubliquePeriodesVo()));
    if(ListUtil.isNotEmpty(vo.getStructureOganisatricesVo()) && this.structureOganisatrices)
        item.setStructureOganisatrices(structureOganisatriceConverter.toItem(vo.getStructureOganisatricesVo()));
    if(ListUtil.isNotEmpty(vo.getPaysRencontreGrandPubliqueJeunePubliquesVo()) && this.paysRencontreGrandPubliqueJeunePubliques)
        item.setPaysRencontreGrandPubliqueJeunePubliques(paysRencontreGrandPubliqueJeunePubliqueConverter.toItem(vo.getPaysRencontreGrandPubliqueJeunePubliquesVo()));
    if(ListUtil.isNotEmpty(vo.getPaysOrganisateurRencontreGrandPubliqueJeunePubliquesVo()) && this.paysOrganisateurRencontreGrandPubliqueJeunePubliques)
        item.setPaysOrganisateurRencontreGrandPubliqueJeunePubliques(paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.toItem(vo.getPaysOrganisateurRencontreGrandPubliqueJeunePubliquesVo()));
    if(ListUtil.isNotEmpty(vo.getRencontreGrandPubliqueJeunePubliqueInstrumentIrdsVo()) && this.rencontreGrandPubliqueJeunePubliqueInstrumentIrds)
        item.setRencontreGrandPubliqueJeunePubliqueInstrumentIrds(rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.toItem(vo.getRencontreGrandPubliqueJeunePubliqueInstrumentIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdsVo()) && this.rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds)
        item.setRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter.toItem(vo.getRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdsVo()));

return item;
}
}

@Override
public RencontreGrandPubliqueJeunePubliqueVo toVo(RencontreGrandPubliqueJeunePublique item) {
if (item == null) {
return null;
} else {
RencontreGrandPubliqueJeunePubliqueVo vo = new RencontreGrandPubliqueJeunePubliqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getIntituleSujet()))
        vo.setIntituleSujet(item.getIntituleSujet());

        if(item.getNombrePersonneEstime()!=null)
        vo.setNombrePersonneEstime(NumberUtil.toString(item.getNombrePersonneEstime()));

        if(item.getLienInstrumentIrd()!=null)
        vo.setLienInstrumentIrd(item.getLienInstrumentIrd());
        if(StringUtil.isNotEmpty(item.getLienWeb()))
        vo.setLienWeb(item.getLienWeb());

        if(StringUtil.isNotEmpty(item.getRemarque()))
        vo.setRemarque(item.getRemarque());

    if(item.getFormatRencontre()!=null && this.formatRencontre) {
        vo.setFormatRencontreVo(formatRencontreConverter.toVo(item.getFormatRencontre())) ;
    }
    if(item.getContexte()!=null && this.contexte) {
        vo.setContexteVo(contexteConverter.toVo(item.getContexte())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getCultureScientifique()!=null && this.cultureScientifique) {
        vo.setCultureScientifiqueVo(cultureScientifiqueConverter.toVo(item.getCultureScientifique())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getTypePubliqueRencontreGrandPubliqueJeunePubliques()) && this.typePubliqueRencontreGrandPubliqueJeunePubliques){
        typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.init(true);
        typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.setRencontreGrandPubliqueJeunePublique(false);
        vo.setTypePubliqueRencontreGrandPubliqueJeunePubliquesVo(typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.toVo(item.getTypePubliqueRencontreGrandPubliqueJeunePubliques()));
        typePubliqueRencontreGrandPubliqueJeunePubliqueConverter.setRencontreGrandPubliqueJeunePublique(true);
        }
        if(ListUtil.isNotEmpty(item.getRencontreGrandPubliqueJeunePubliqueEnjeuxIrds()) && this.rencontreGrandPubliqueJeunePubliqueEnjeuxIrds){
        rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.init(true);
        rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.setRencontreGrandPubliqueJeunePublique(false);
        vo.setRencontreGrandPubliqueJeunePubliqueEnjeuxIrdsVo(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.toVo(item.getRencontreGrandPubliqueJeunePubliqueEnjeuxIrds()));
        rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter.setRencontreGrandPubliqueJeunePublique(true);
        }
        if(ListUtil.isNotEmpty(item.getRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques()) && this.rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques){
        rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.init(true);
        rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.setRencontreGrandPubliqueJeunePublique(false);
        vo.setRencontreGrandPubliqueJeunePubliqueDisciplineScientifiquesVo(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.toVo(item.getRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques()));
        rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter.setRencontreGrandPubliqueJeunePublique(true);
        }
        if(ListUtil.isNotEmpty(item.getRencontreGrandPubliqueJeunePubliquePeriodes()) && this.rencontreGrandPubliqueJeunePubliquePeriodes){
        rencontreGrandPubliqueJeunePubliquePeriodeConverter.init(true);
        rencontreGrandPubliqueJeunePubliquePeriodeConverter.setRencontreGrandPubliqueJeunePublique(false);
        vo.setRencontreGrandPubliqueJeunePubliquePeriodesVo(rencontreGrandPubliqueJeunePubliquePeriodeConverter.toVo(item.getRencontreGrandPubliqueJeunePubliquePeriodes()));
        rencontreGrandPubliqueJeunePubliquePeriodeConverter.setRencontreGrandPubliqueJeunePublique(true);
        }
        if(ListUtil.isNotEmpty(item.getStructureOganisatrices()) && this.structureOganisatrices){
        structureOganisatriceConverter.init(true);
        structureOganisatriceConverter.setRencontreGrandPubliqueJeunePublique(false);
        vo.setStructureOganisatricesVo(structureOganisatriceConverter.toVo(item.getStructureOganisatrices()));
        structureOganisatriceConverter.setRencontreGrandPubliqueJeunePublique(true);
        }
        if(ListUtil.isNotEmpty(item.getPaysRencontreGrandPubliqueJeunePubliques()) && this.paysRencontreGrandPubliqueJeunePubliques){
        paysRencontreGrandPubliqueJeunePubliqueConverter.init(true);
        paysRencontreGrandPubliqueJeunePubliqueConverter.setRencontreGrandPubliqueJeunePublique(false);
        vo.setPaysRencontreGrandPubliqueJeunePubliquesVo(paysRencontreGrandPubliqueJeunePubliqueConverter.toVo(item.getPaysRencontreGrandPubliqueJeunePubliques()));
        paysRencontreGrandPubliqueJeunePubliqueConverter.setRencontreGrandPubliqueJeunePublique(true);
        }
        if(ListUtil.isNotEmpty(item.getPaysOrganisateurRencontreGrandPubliqueJeunePubliques()) && this.paysOrganisateurRencontreGrandPubliqueJeunePubliques){
        paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.init(true);
        paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.setRencontreGrandPubliqueJeunePublique(false);
        vo.setPaysOrganisateurRencontreGrandPubliqueJeunePubliquesVo(paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.toVo(item.getPaysOrganisateurRencontreGrandPubliqueJeunePubliques()));
        paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter.setRencontreGrandPubliqueJeunePublique(true);
        }
        if(ListUtil.isNotEmpty(item.getRencontreGrandPubliqueJeunePubliqueInstrumentIrds()) && this.rencontreGrandPubliqueJeunePubliqueInstrumentIrds){
        rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.init(true);
        rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.setRencontreGrandPubliqueJeunePublique(false);
        vo.setRencontreGrandPubliqueJeunePubliqueInstrumentIrdsVo(rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.toVo(item.getRencontreGrandPubliqueJeunePubliqueInstrumentIrds()));
        rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter.setRencontreGrandPubliqueJeunePublique(true);
        }
        if(ListUtil.isNotEmpty(item.getRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds()) && this.rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds){
        rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter.init(true);
        rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter.setRencontreGrandPubliqueJeunePublique(false);
        vo.setRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdsVo(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter.toVo(item.getRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds()));
        rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter.setRencontreGrandPubliqueJeunePublique(true);
        }

return vo;
}
}

public void init(Boolean value) {
    formatRencontre = value;
    contexte = value;
    pays = value;
    cultureScientifique = value;
    etatEtapeCampagne = value;
        typePubliqueRencontreGrandPubliqueJeunePubliques = value;
        rencontreGrandPubliqueJeunePubliqueEnjeuxIrds = value;
        rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques = value;
        rencontreGrandPubliqueJeunePubliquePeriodes = value;
        structureOganisatrices = value;
        paysRencontreGrandPubliqueJeunePubliques = value;
        paysOrganisateurRencontreGrandPubliqueJeunePubliques = value;
        rencontreGrandPubliqueJeunePubliqueInstrumentIrds = value;
        rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds = value;
}


        public RencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter getRencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter(){
        return this.rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter;
        }
        public void setRencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter(RencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter ){
        this.rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter = rencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter;
        }
        public RencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter getRencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter(){
        return this.rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter;
        }
        public void setRencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter(RencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter ){
        this.rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter = rencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter;
        }
        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter getRencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter(){
        return this.rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter;
        }
        public void setRencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter(RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter ){
        this.rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter = rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueConverter;
        }
        public FormatRencontreConverter getFormatRencontreConverter(){
        return this.formatRencontreConverter;
        }
        public void setFormatRencontreConverter(FormatRencontreConverter formatRencontreConverter ){
        this.formatRencontreConverter = formatRencontreConverter;
        }
        public PaysRencontreGrandPubliqueJeunePubliqueConverter getPaysRencontreGrandPubliqueJeunePubliqueConverter(){
        return this.paysRencontreGrandPubliqueJeunePubliqueConverter;
        }
        public void setPaysRencontreGrandPubliqueJeunePubliqueConverter(PaysRencontreGrandPubliqueJeunePubliqueConverter paysRencontreGrandPubliqueJeunePubliqueConverter ){
        this.paysRencontreGrandPubliqueJeunePubliqueConverter = paysRencontreGrandPubliqueJeunePubliqueConverter;
        }
        public RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter getRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter(){
        return this.rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter;
        }
        public void setRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter(RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter ){
        this.rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter = rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }
        public CultureScientifiqueConverter getCultureScientifiqueConverter(){
        return this.cultureScientifiqueConverter;
        }
        public void setCultureScientifiqueConverter(CultureScientifiqueConverter cultureScientifiqueConverter ){
        this.cultureScientifiqueConverter = cultureScientifiqueConverter;
        }
        public RencontreGrandPubliqueJeunePubliquePeriodeConverter getRencontreGrandPubliqueJeunePubliquePeriodeConverter(){
        return this.rencontreGrandPubliqueJeunePubliquePeriodeConverter;
        }
        public void setRencontreGrandPubliqueJeunePubliquePeriodeConverter(RencontreGrandPubliqueJeunePubliquePeriodeConverter rencontreGrandPubliqueJeunePubliquePeriodeConverter ){
        this.rencontreGrandPubliqueJeunePubliquePeriodeConverter = rencontreGrandPubliqueJeunePubliquePeriodeConverter;
        }
        public PaysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter getPaysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter(){
        return this.paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter;
        }
        public void setPaysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter(PaysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter ){
        this.paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter = paysOrganisateurRencontreGrandPubliqueJeunePubliqueConverter;
        }
        public TypePubliqueRencontreGrandPubliqueJeunePubliqueConverter getTypePubliqueRencontreGrandPubliqueJeunePubliqueConverter(){
        return this.typePubliqueRencontreGrandPubliqueJeunePubliqueConverter;
        }
        public void setTypePubliqueRencontreGrandPubliqueJeunePubliqueConverter(TypePubliqueRencontreGrandPubliqueJeunePubliqueConverter typePubliqueRencontreGrandPubliqueJeunePubliqueConverter ){
        this.typePubliqueRencontreGrandPubliqueJeunePubliqueConverter = typePubliqueRencontreGrandPubliqueJeunePubliqueConverter;
        }
        public StructureOganisatriceConverter getStructureOganisatriceConverter(){
        return this.structureOganisatriceConverter;
        }
        public void setStructureOganisatriceConverter(StructureOganisatriceConverter structureOganisatriceConverter ){
        this.structureOganisatriceConverter = structureOganisatriceConverter;
        }
        public ContexteConverter getContexteConverter(){
        return this.contexteConverter;
        }
        public void setContexteConverter(ContexteConverter contexteConverter ){
        this.contexteConverter = contexteConverter;
        }

    public boolean  isFormatRencontre(){
    return this.formatRencontre;
    }
    public void  setFormatRencontre(boolean formatRencontre){
    this.formatRencontre = formatRencontre;
    }
    public boolean  isContexte(){
    return this.contexte;
    }
    public void  setContexte(boolean contexte){
    this.contexte = contexte;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }
    public boolean  isCultureScientifique(){
    return this.cultureScientifique;
    }
    public void  setCultureScientifique(boolean cultureScientifique){
    this.cultureScientifique = cultureScientifique;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }





        public Boolean  isTypePubliqueRencontreGrandPubliqueJeunePubliques(){
        return this.typePubliqueRencontreGrandPubliqueJeunePubliques ;
        }
        public void  setTypePubliqueRencontreGrandPubliqueJeunePubliques(Boolean typePubliqueRencontreGrandPubliqueJeunePubliques ){
        this.typePubliqueRencontreGrandPubliqueJeunePubliques  = typePubliqueRencontreGrandPubliqueJeunePubliques ;
        }





        public Boolean  isRencontreGrandPubliqueJeunePubliqueEnjeuxIrds(){
        return this.rencontreGrandPubliqueJeunePubliqueEnjeuxIrds ;
        }
        public void  setRencontreGrandPubliqueJeunePubliqueEnjeuxIrds(Boolean rencontreGrandPubliqueJeunePubliqueEnjeuxIrds ){
        this.rencontreGrandPubliqueJeunePubliqueEnjeuxIrds  = rencontreGrandPubliqueJeunePubliqueEnjeuxIrds ;
        }



        public Boolean  isRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques(){
        return this.rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques ;
        }
        public void  setRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques(Boolean rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques ){
        this.rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques  = rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques ;
        }





        public Boolean  isRencontreGrandPubliqueJeunePubliquePeriodes(){
        return this.rencontreGrandPubliqueJeunePubliquePeriodes ;
        }
        public void  setRencontreGrandPubliqueJeunePubliquePeriodes(Boolean rencontreGrandPubliqueJeunePubliquePeriodes ){
        this.rencontreGrandPubliqueJeunePubliquePeriodes  = rencontreGrandPubliqueJeunePubliquePeriodes ;
        }



        public Boolean  isStructureOganisatrices(){
        return this.structureOganisatrices ;
        }
        public void  setStructureOganisatrices(Boolean structureOganisatrices ){
        this.structureOganisatrices  = structureOganisatrices ;
        }



        public Boolean  isPaysRencontreGrandPubliqueJeunePubliques(){
        return this.paysRencontreGrandPubliqueJeunePubliques ;
        }
        public void  setPaysRencontreGrandPubliqueJeunePubliques(Boolean paysRencontreGrandPubliqueJeunePubliques ){
        this.paysRencontreGrandPubliqueJeunePubliques  = paysRencontreGrandPubliqueJeunePubliques ;
        }



        public Boolean  isPaysOrganisateurRencontreGrandPubliqueJeunePubliques(){
        return this.paysOrganisateurRencontreGrandPubliqueJeunePubliques ;
        }
        public void  setPaysOrganisateurRencontreGrandPubliqueJeunePubliques(Boolean paysOrganisateurRencontreGrandPubliqueJeunePubliques ){
        this.paysOrganisateurRencontreGrandPubliqueJeunePubliques  = paysOrganisateurRencontreGrandPubliqueJeunePubliques ;
        }







        public Boolean  isRencontreGrandPubliqueJeunePubliqueInstrumentIrds(){
        return this.rencontreGrandPubliqueJeunePubliqueInstrumentIrds ;
        }
        public void  setRencontreGrandPubliqueJeunePubliqueInstrumentIrds(Boolean rencontreGrandPubliqueJeunePubliqueInstrumentIrds ){
        this.rencontreGrandPubliqueJeunePubliqueInstrumentIrds  = rencontreGrandPubliqueJeunePubliqueInstrumentIrds ;
        }



        public Boolean  isRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds(){
        return this.rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds ;
        }
        public void  setRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds(Boolean rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds ){
        this.rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds  = rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds ;
        }












}
