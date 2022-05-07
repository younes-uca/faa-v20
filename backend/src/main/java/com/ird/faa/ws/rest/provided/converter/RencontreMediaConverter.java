package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.RencontreMedia;
import com.ird.faa.ws.rest.provided.vo.RencontreMediaVo;

@Component
public class RencontreMediaConverter extends AbstractConverter<RencontreMedia,RencontreMediaVo>{

        @Autowired
        private RencontreMediaPeriodeConverter rencontreMediaPeriodeConverter ;
        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private PaysRencontreMediaConverter paysRencontreMediaConverter ;
        @Autowired
        private RencontreMediaDisciplineScientifiqueConverter rencontreMediaDisciplineScientifiqueConverter ;
        @Autowired
        private RencontreMediaEnjeuxIrdConverter rencontreMediaEnjeuxIrdConverter ;
        @Autowired
        private TypePubliqueRencontreMediaConverter typePubliqueRencontreMediaConverter ;
        @Autowired
        private FormatRencontreConverter formatRencontreConverter ;
        @Autowired
        private CultureScientifiqueConverter cultureScientifiqueConverter ;
    private Boolean formatRencontre;
    private Boolean cultureScientifique;
    private Boolean etatEtapeCampagne;
        private Boolean typePubliqueRencontreMedias;
        private Boolean rencontreMediaEnjeuxIrds;
        private Boolean rencontreMediaDisciplineScientifiques;
        private Boolean rencontreMediaPeriodes;
        private Boolean paysRencontreMedias;

public  RencontreMediaConverter(){
init(true);
}

@Override
public RencontreMedia toItem(RencontreMediaVo vo) {
if (vo == null) {
return null;
} else {
RencontreMedia item = new RencontreMedia();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getIntituleSujet()))
        item.setIntituleSujet(vo.getIntituleSujet());
        if(StringUtil.isNotEmpty(vo.getLienWeb()))
        item.setLienWeb(vo.getLienWeb());
        if(StringUtil.isNotEmpty(vo.getRemarque()))
        item.setRemarque(vo.getRemarque());
    if(vo.getFormatRencontreVo()!=null && this.formatRencontre)
        item.setFormatRencontre(formatRencontreConverter.toItem(vo.getFormatRencontreVo())) ;
    if(vo.getCultureScientifiqueVo()!=null && this.cultureScientifique)
        item.setCultureScientifique(cultureScientifiqueConverter.toItem(vo.getCultureScientifiqueVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getTypePubliqueRencontreMediasVo()) && this.typePubliqueRencontreMedias)
        item.setTypePubliqueRencontreMedias(typePubliqueRencontreMediaConverter.toItem(vo.getTypePubliqueRencontreMediasVo()));
    if(ListUtil.isNotEmpty(vo.getRencontreMediaEnjeuxIrdsVo()) && this.rencontreMediaEnjeuxIrds)
        item.setRencontreMediaEnjeuxIrds(rencontreMediaEnjeuxIrdConverter.toItem(vo.getRencontreMediaEnjeuxIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getRencontreMediaDisciplineScientifiquesVo()) && this.rencontreMediaDisciplineScientifiques)
        item.setRencontreMediaDisciplineScientifiques(rencontreMediaDisciplineScientifiqueConverter.toItem(vo.getRencontreMediaDisciplineScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getRencontreMediaPeriodesVo()) && this.rencontreMediaPeriodes)
        item.setRencontreMediaPeriodes(rencontreMediaPeriodeConverter.toItem(vo.getRencontreMediaPeriodesVo()));
    if(ListUtil.isNotEmpty(vo.getPaysRencontreMediasVo()) && this.paysRencontreMedias)
        item.setPaysRencontreMedias(paysRencontreMediaConverter.toItem(vo.getPaysRencontreMediasVo()));

return item;
}
}

@Override
public RencontreMediaVo toVo(RencontreMedia item) {
if (item == null) {
return null;
} else {
RencontreMediaVo vo = new RencontreMediaVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getIntituleSujet()))
        vo.setIntituleSujet(item.getIntituleSujet());

        if(StringUtil.isNotEmpty(item.getLienWeb()))
        vo.setLienWeb(item.getLienWeb());

        if(StringUtil.isNotEmpty(item.getRemarque()))
        vo.setRemarque(item.getRemarque());

    if(item.getFormatRencontre()!=null && this.formatRencontre) {
        vo.setFormatRencontreVo(formatRencontreConverter.toVo(item.getFormatRencontre())) ;
    }
    if(item.getCultureScientifique()!=null && this.cultureScientifique) {
        vo.setCultureScientifiqueVo(cultureScientifiqueConverter.toVo(item.getCultureScientifique())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getTypePubliqueRencontreMedias()) && this.typePubliqueRencontreMedias){
        typePubliqueRencontreMediaConverter.init(true);
        typePubliqueRencontreMediaConverter.setRencontreMedia(false);
        vo.setTypePubliqueRencontreMediasVo(typePubliqueRencontreMediaConverter.toVo(item.getTypePubliqueRencontreMedias()));
        typePubliqueRencontreMediaConverter.setRencontreMedia(true);
        }
        if(ListUtil.isNotEmpty(item.getRencontreMediaEnjeuxIrds()) && this.rencontreMediaEnjeuxIrds){
        rencontreMediaEnjeuxIrdConverter.init(true);
        rencontreMediaEnjeuxIrdConverter.setRencontreMedia(false);
        vo.setRencontreMediaEnjeuxIrdsVo(rencontreMediaEnjeuxIrdConverter.toVo(item.getRencontreMediaEnjeuxIrds()));
        rencontreMediaEnjeuxIrdConverter.setRencontreMedia(true);
        }
        if(ListUtil.isNotEmpty(item.getRencontreMediaDisciplineScientifiques()) && this.rencontreMediaDisciplineScientifiques){
        rencontreMediaDisciplineScientifiqueConverter.init(true);
        rencontreMediaDisciplineScientifiqueConverter.setRencontreMedia(false);
        vo.setRencontreMediaDisciplineScientifiquesVo(rencontreMediaDisciplineScientifiqueConverter.toVo(item.getRencontreMediaDisciplineScientifiques()));
        rencontreMediaDisciplineScientifiqueConverter.setRencontreMedia(true);
        }
        if(ListUtil.isNotEmpty(item.getRencontreMediaPeriodes()) && this.rencontreMediaPeriodes){
        rencontreMediaPeriodeConverter.init(true);
        rencontreMediaPeriodeConverter.setRencontreMedia(false);
        vo.setRencontreMediaPeriodesVo(rencontreMediaPeriodeConverter.toVo(item.getRencontreMediaPeriodes()));
        rencontreMediaPeriodeConverter.setRencontreMedia(true);
        }
        if(ListUtil.isNotEmpty(item.getPaysRencontreMedias()) && this.paysRencontreMedias){
        paysRencontreMediaConverter.init(true);
        paysRencontreMediaConverter.setRencontreMedia(false);
        vo.setPaysRencontreMediasVo(paysRencontreMediaConverter.toVo(item.getPaysRencontreMedias()));
        paysRencontreMediaConverter.setRencontreMedia(true);
        }

return vo;
}
}

public void init(Boolean value) {
    formatRencontre = value;
    cultureScientifique = value;
    etatEtapeCampagne = value;
        typePubliqueRencontreMedias = value;
        rencontreMediaEnjeuxIrds = value;
        rencontreMediaDisciplineScientifiques = value;
        rencontreMediaPeriodes = value;
        paysRencontreMedias = value;
}


        public RencontreMediaPeriodeConverter getRencontreMediaPeriodeConverter(){
        return this.rencontreMediaPeriodeConverter;
        }
        public void setRencontreMediaPeriodeConverter(RencontreMediaPeriodeConverter rencontreMediaPeriodeConverter ){
        this.rencontreMediaPeriodeConverter = rencontreMediaPeriodeConverter;
        }
        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public PaysRencontreMediaConverter getPaysRencontreMediaConverter(){
        return this.paysRencontreMediaConverter;
        }
        public void setPaysRencontreMediaConverter(PaysRencontreMediaConverter paysRencontreMediaConverter ){
        this.paysRencontreMediaConverter = paysRencontreMediaConverter;
        }
        public RencontreMediaDisciplineScientifiqueConverter getRencontreMediaDisciplineScientifiqueConverter(){
        return this.rencontreMediaDisciplineScientifiqueConverter;
        }
        public void setRencontreMediaDisciplineScientifiqueConverter(RencontreMediaDisciplineScientifiqueConverter rencontreMediaDisciplineScientifiqueConverter ){
        this.rencontreMediaDisciplineScientifiqueConverter = rencontreMediaDisciplineScientifiqueConverter;
        }
        public RencontreMediaEnjeuxIrdConverter getRencontreMediaEnjeuxIrdConverter(){
        return this.rencontreMediaEnjeuxIrdConverter;
        }
        public void setRencontreMediaEnjeuxIrdConverter(RencontreMediaEnjeuxIrdConverter rencontreMediaEnjeuxIrdConverter ){
        this.rencontreMediaEnjeuxIrdConverter = rencontreMediaEnjeuxIrdConverter;
        }
        public TypePubliqueRencontreMediaConverter getTypePubliqueRencontreMediaConverter(){
        return this.typePubliqueRencontreMediaConverter;
        }
        public void setTypePubliqueRencontreMediaConverter(TypePubliqueRencontreMediaConverter typePubliqueRencontreMediaConverter ){
        this.typePubliqueRencontreMediaConverter = typePubliqueRencontreMediaConverter;
        }
        public FormatRencontreConverter getFormatRencontreConverter(){
        return this.formatRencontreConverter;
        }
        public void setFormatRencontreConverter(FormatRencontreConverter formatRencontreConverter ){
        this.formatRencontreConverter = formatRencontreConverter;
        }
        public CultureScientifiqueConverter getCultureScientifiqueConverter(){
        return this.cultureScientifiqueConverter;
        }
        public void setCultureScientifiqueConverter(CultureScientifiqueConverter cultureScientifiqueConverter ){
        this.cultureScientifiqueConverter = cultureScientifiqueConverter;
        }

    public boolean  isFormatRencontre(){
    return this.formatRencontre;
    }
    public void  setFormatRencontre(boolean formatRencontre){
    this.formatRencontre = formatRencontre;
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





        public Boolean  isTypePubliqueRencontreMedias(){
        return this.typePubliqueRencontreMedias ;
        }
        public void  setTypePubliqueRencontreMedias(Boolean typePubliqueRencontreMedias ){
        this.typePubliqueRencontreMedias  = typePubliqueRencontreMedias ;
        }





        public Boolean  isRencontreMediaEnjeuxIrds(){
        return this.rencontreMediaEnjeuxIrds ;
        }
        public void  setRencontreMediaEnjeuxIrds(Boolean rencontreMediaEnjeuxIrds ){
        this.rencontreMediaEnjeuxIrds  = rencontreMediaEnjeuxIrds ;
        }



        public Boolean  isRencontreMediaDisciplineScientifiques(){
        return this.rencontreMediaDisciplineScientifiques ;
        }
        public void  setRencontreMediaDisciplineScientifiques(Boolean rencontreMediaDisciplineScientifiques ){
        this.rencontreMediaDisciplineScientifiques  = rencontreMediaDisciplineScientifiques ;
        }



        public Boolean  isRencontreMediaPeriodes(){
        return this.rencontreMediaPeriodes ;
        }
        public void  setRencontreMediaPeriodes(Boolean rencontreMediaPeriodes ){
        this.rencontreMediaPeriodes  = rencontreMediaPeriodes ;
        }



        public Boolean  isPaysRencontreMedias(){
        return this.paysRencontreMedias ;
        }
        public void  setPaysRencontreMedias(Boolean paysRencontreMedias ){
        this.paysRencontreMedias  = paysRencontreMedias ;
        }










}
