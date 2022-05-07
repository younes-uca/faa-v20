package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.OutilPedagogique;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueVo;

@Component
public class OutilPedagogiqueConverter extends AbstractConverter<OutilPedagogique,OutilPedagogiqueVo>{

        @Autowired
        private OutilPedagogiqueTypeInstrumentIrdConverter outilPedagogiqueTypeInstrumentIrdConverter ;
        @Autowired
        private OutilPedagogiqueLangueConverter outilPedagogiqueLangueConverter ;
        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private OutilPedagogiqueEnjeuxIrdConverter outilPedagogiqueEnjeuxIrdConverter ;
        @Autowired
        private OutilPedagogiquePaysDiffusionConverter outilPedagogiquePaysDiffusionConverter ;
        @Autowired
        private OutilPedagogiquePubliqueCibleConverter outilPedagogiquePubliqueCibleConverter ;
        @Autowired
        private TypeOutilPedagogiqueConverter typeOutilPedagogiqueConverter ;
        @Autowired
        private OutilPedagogiquePaysConceptionConverter outilPedagogiquePaysConceptionConverter ;
        @Autowired
        private OutilPedagogiqueInstrumentIrdConverter outilPedagogiqueInstrumentIrdConverter ;
        @Autowired
        private CultureScientifiqueConverter cultureScientifiqueConverter ;
        @Autowired
        private OutilPedagogiqueDisciplineScientifiqueConverter outilPedagogiqueDisciplineScientifiqueConverter ;
    private Boolean cultureScientifique;
    private Boolean etatEtapeCampagne;
        private Boolean outilPedagogiqueEnjeuxIrds;
        private Boolean outilPedagogiqueDisciplineScientifiques;
        private Boolean outilPedagogiquePubliqueCibles;
        private Boolean typeOutilPedagogiques;
        private Boolean outilPedagogiqueLangues;
        private Boolean outilPedagogiquePaysConceptions;
        private Boolean outilPedagogiquePaysDiffusions;
        private Boolean outilPedagogiqueInstrumentIrds;
        private Boolean outilPedagogiqueTypeInstrumentIrds;

public  OutilPedagogiqueConverter(){
init(true);
}

@Override
public OutilPedagogique toItem(OutilPedagogiqueVo vo) {
if (vo == null) {
return null;
} else {
OutilPedagogique item = new OutilPedagogique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getNom()))
        item.setNom(vo.getNom());
        if(StringUtil.isNotEmpty(vo.getRoleOutilPedagogique()))
        item.setRoleOutilPedagogique(vo.getRoleOutilPedagogique());
        if(StringUtil.isNotEmpty(vo.getDateDiffusion()))
        item.setDateDiffusion(DateUtil.parse(vo.getDateDiffusion()));
            if(vo.getDisponnibleNumerique() != null)
            item.setDisponnibleNumerique(vo.getDisponnibleNumerique());
        if(StringUtil.isNotEmpty(vo.getLienWeb()))
        item.setLienWeb(vo.getLienWeb());
            if(vo.getLienInstrumentIrd() != null)
            item.setLienInstrumentIrd(vo.getLienInstrumentIrd());
        if(StringUtil.isNotEmpty(vo.getPartenaireEventuel()))
        item.setPartenaireEventuel(vo.getPartenaireEventuel());
        if(StringUtil.isNotEmpty(vo.getRemarque()))
        item.setRemarque(vo.getRemarque());
    if(vo.getCultureScientifiqueVo()!=null && this.cultureScientifique)
        item.setCultureScientifique(cultureScientifiqueConverter.toItem(vo.getCultureScientifiqueVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getOutilPedagogiqueEnjeuxIrdsVo()) && this.outilPedagogiqueEnjeuxIrds)
        item.setOutilPedagogiqueEnjeuxIrds(outilPedagogiqueEnjeuxIrdConverter.toItem(vo.getOutilPedagogiqueEnjeuxIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getOutilPedagogiqueDisciplineScientifiquesVo()) && this.outilPedagogiqueDisciplineScientifiques)
        item.setOutilPedagogiqueDisciplineScientifiques(outilPedagogiqueDisciplineScientifiqueConverter.toItem(vo.getOutilPedagogiqueDisciplineScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getOutilPedagogiquePubliqueCiblesVo()) && this.outilPedagogiquePubliqueCibles)
        item.setOutilPedagogiquePubliqueCibles(outilPedagogiquePubliqueCibleConverter.toItem(vo.getOutilPedagogiquePubliqueCiblesVo()));
    if(ListUtil.isNotEmpty(vo.getTypeOutilPedagogiquesVo()) && this.typeOutilPedagogiques)
        item.setTypeOutilPedagogiques(typeOutilPedagogiqueConverter.toItem(vo.getTypeOutilPedagogiquesVo()));
    if(ListUtil.isNotEmpty(vo.getOutilPedagogiqueLanguesVo()) && this.outilPedagogiqueLangues)
        item.setOutilPedagogiqueLangues(outilPedagogiqueLangueConverter.toItem(vo.getOutilPedagogiqueLanguesVo()));
    if(ListUtil.isNotEmpty(vo.getOutilPedagogiquePaysConceptionsVo()) && this.outilPedagogiquePaysConceptions)
        item.setOutilPedagogiquePaysConceptions(outilPedagogiquePaysConceptionConverter.toItem(vo.getOutilPedagogiquePaysConceptionsVo()));
    if(ListUtil.isNotEmpty(vo.getOutilPedagogiquePaysDiffusionsVo()) && this.outilPedagogiquePaysDiffusions)
        item.setOutilPedagogiquePaysDiffusions(outilPedagogiquePaysDiffusionConverter.toItem(vo.getOutilPedagogiquePaysDiffusionsVo()));
    if(ListUtil.isNotEmpty(vo.getOutilPedagogiqueInstrumentIrdsVo()) && this.outilPedagogiqueInstrumentIrds)
        item.setOutilPedagogiqueInstrumentIrds(outilPedagogiqueInstrumentIrdConverter.toItem(vo.getOutilPedagogiqueInstrumentIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getOutilPedagogiqueTypeInstrumentIrdsVo()) && this.outilPedagogiqueTypeInstrumentIrds)
        item.setOutilPedagogiqueTypeInstrumentIrds(outilPedagogiqueTypeInstrumentIrdConverter.toItem(vo.getOutilPedagogiqueTypeInstrumentIrdsVo()));

return item;
}
}

@Override
public OutilPedagogiqueVo toVo(OutilPedagogique item) {
if (item == null) {
return null;
} else {
OutilPedagogiqueVo vo = new OutilPedagogiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getNom()))
        vo.setNom(item.getNom());

        if(StringUtil.isNotEmpty(item.getRoleOutilPedagogique()))
        vo.setRoleOutilPedagogique(item.getRoleOutilPedagogique());

        if(item.getDateDiffusion()!=null)
        vo.setDateDiffusion(DateUtil.formateDate(item.getDateDiffusion()));
        if(item.getDisponnibleNumerique()!=null)
        vo.setDisponnibleNumerique(item.getDisponnibleNumerique());
        if(StringUtil.isNotEmpty(item.getLienWeb()))
        vo.setLienWeb(item.getLienWeb());

        if(item.getLienInstrumentIrd()!=null)
        vo.setLienInstrumentIrd(item.getLienInstrumentIrd());
        if(StringUtil.isNotEmpty(item.getPartenaireEventuel()))
        vo.setPartenaireEventuel(item.getPartenaireEventuel());

        if(StringUtil.isNotEmpty(item.getRemarque()))
        vo.setRemarque(item.getRemarque());

    if(item.getCultureScientifique()!=null && this.cultureScientifique) {
        vo.setCultureScientifiqueVo(cultureScientifiqueConverter.toVo(item.getCultureScientifique())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getOutilPedagogiqueEnjeuxIrds()) && this.outilPedagogiqueEnjeuxIrds){
        outilPedagogiqueEnjeuxIrdConverter.init(true);
        outilPedagogiqueEnjeuxIrdConverter.setOutilPedagogique(false);
        vo.setOutilPedagogiqueEnjeuxIrdsVo(outilPedagogiqueEnjeuxIrdConverter.toVo(item.getOutilPedagogiqueEnjeuxIrds()));
        outilPedagogiqueEnjeuxIrdConverter.setOutilPedagogique(true);
        }
        if(ListUtil.isNotEmpty(item.getOutilPedagogiqueDisciplineScientifiques()) && this.outilPedagogiqueDisciplineScientifiques){
        outilPedagogiqueDisciplineScientifiqueConverter.init(true);
        outilPedagogiqueDisciplineScientifiqueConverter.setOutilPedagogique(false);
        vo.setOutilPedagogiqueDisciplineScientifiquesVo(outilPedagogiqueDisciplineScientifiqueConverter.toVo(item.getOutilPedagogiqueDisciplineScientifiques()));
        outilPedagogiqueDisciplineScientifiqueConverter.setOutilPedagogique(true);
        }
        if(ListUtil.isNotEmpty(item.getOutilPedagogiquePubliqueCibles()) && this.outilPedagogiquePubliqueCibles){
        outilPedagogiquePubliqueCibleConverter.init(true);
        outilPedagogiquePubliqueCibleConverter.setOutilPedagogique(false);
        vo.setOutilPedagogiquePubliqueCiblesVo(outilPedagogiquePubliqueCibleConverter.toVo(item.getOutilPedagogiquePubliqueCibles()));
        outilPedagogiquePubliqueCibleConverter.setOutilPedagogique(true);
        }
        if(ListUtil.isNotEmpty(item.getTypeOutilPedagogiques()) && this.typeOutilPedagogiques){
        typeOutilPedagogiqueConverter.init(true);
        typeOutilPedagogiqueConverter.setOutilPedagogique(false);
        vo.setTypeOutilPedagogiquesVo(typeOutilPedagogiqueConverter.toVo(item.getTypeOutilPedagogiques()));
        typeOutilPedagogiqueConverter.setOutilPedagogique(true);
        }
        if(ListUtil.isNotEmpty(item.getOutilPedagogiqueLangues()) && this.outilPedagogiqueLangues){
        outilPedagogiqueLangueConverter.init(true);
        outilPedagogiqueLangueConverter.setOutilPedagogique(false);
        vo.setOutilPedagogiqueLanguesVo(outilPedagogiqueLangueConverter.toVo(item.getOutilPedagogiqueLangues()));
        outilPedagogiqueLangueConverter.setOutilPedagogique(true);
        }
        if(ListUtil.isNotEmpty(item.getOutilPedagogiquePaysConceptions()) && this.outilPedagogiquePaysConceptions){
        outilPedagogiquePaysConceptionConverter.init(true);
        outilPedagogiquePaysConceptionConverter.setOutilPedagogique(false);
        vo.setOutilPedagogiquePaysConceptionsVo(outilPedagogiquePaysConceptionConverter.toVo(item.getOutilPedagogiquePaysConceptions()));
        outilPedagogiquePaysConceptionConverter.setOutilPedagogique(true);
        }
        if(ListUtil.isNotEmpty(item.getOutilPedagogiquePaysDiffusions()) && this.outilPedagogiquePaysDiffusions){
        outilPedagogiquePaysDiffusionConverter.init(true);
        outilPedagogiquePaysDiffusionConverter.setOutilPedagogique(false);
        vo.setOutilPedagogiquePaysDiffusionsVo(outilPedagogiquePaysDiffusionConverter.toVo(item.getOutilPedagogiquePaysDiffusions()));
        outilPedagogiquePaysDiffusionConverter.setOutilPedagogique(true);
        }
        if(ListUtil.isNotEmpty(item.getOutilPedagogiqueInstrumentIrds()) && this.outilPedagogiqueInstrumentIrds){
        outilPedagogiqueInstrumentIrdConverter.init(true);
        outilPedagogiqueInstrumentIrdConverter.setOutilPedagogique(false);
        vo.setOutilPedagogiqueInstrumentIrdsVo(outilPedagogiqueInstrumentIrdConverter.toVo(item.getOutilPedagogiqueInstrumentIrds()));
        outilPedagogiqueInstrumentIrdConverter.setOutilPedagogique(true);
        }
        if(ListUtil.isNotEmpty(item.getOutilPedagogiqueTypeInstrumentIrds()) && this.outilPedagogiqueTypeInstrumentIrds){
        outilPedagogiqueTypeInstrumentIrdConverter.init(true);
        outilPedagogiqueTypeInstrumentIrdConverter.setOutilPedagogique(false);
        vo.setOutilPedagogiqueTypeInstrumentIrdsVo(outilPedagogiqueTypeInstrumentIrdConverter.toVo(item.getOutilPedagogiqueTypeInstrumentIrds()));
        outilPedagogiqueTypeInstrumentIrdConverter.setOutilPedagogique(true);
        }

return vo;
}
}

public void init(Boolean value) {
    cultureScientifique = value;
    etatEtapeCampagne = value;
        outilPedagogiqueEnjeuxIrds = value;
        outilPedagogiqueDisciplineScientifiques = value;
        outilPedagogiquePubliqueCibles = value;
        typeOutilPedagogiques = value;
        outilPedagogiqueLangues = value;
        outilPedagogiquePaysConceptions = value;
        outilPedagogiquePaysDiffusions = value;
        outilPedagogiqueInstrumentIrds = value;
        outilPedagogiqueTypeInstrumentIrds = value;
}


        public OutilPedagogiqueTypeInstrumentIrdConverter getOutilPedagogiqueTypeInstrumentIrdConverter(){
        return this.outilPedagogiqueTypeInstrumentIrdConverter;
        }
        public void setOutilPedagogiqueTypeInstrumentIrdConverter(OutilPedagogiqueTypeInstrumentIrdConverter outilPedagogiqueTypeInstrumentIrdConverter ){
        this.outilPedagogiqueTypeInstrumentIrdConverter = outilPedagogiqueTypeInstrumentIrdConverter;
        }
        public OutilPedagogiqueLangueConverter getOutilPedagogiqueLangueConverter(){
        return this.outilPedagogiqueLangueConverter;
        }
        public void setOutilPedagogiqueLangueConverter(OutilPedagogiqueLangueConverter outilPedagogiqueLangueConverter ){
        this.outilPedagogiqueLangueConverter = outilPedagogiqueLangueConverter;
        }
        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public OutilPedagogiqueEnjeuxIrdConverter getOutilPedagogiqueEnjeuxIrdConverter(){
        return this.outilPedagogiqueEnjeuxIrdConverter;
        }
        public void setOutilPedagogiqueEnjeuxIrdConverter(OutilPedagogiqueEnjeuxIrdConverter outilPedagogiqueEnjeuxIrdConverter ){
        this.outilPedagogiqueEnjeuxIrdConverter = outilPedagogiqueEnjeuxIrdConverter;
        }
        public OutilPedagogiquePaysDiffusionConverter getOutilPedagogiquePaysDiffusionConverter(){
        return this.outilPedagogiquePaysDiffusionConverter;
        }
        public void setOutilPedagogiquePaysDiffusionConverter(OutilPedagogiquePaysDiffusionConverter outilPedagogiquePaysDiffusionConverter ){
        this.outilPedagogiquePaysDiffusionConverter = outilPedagogiquePaysDiffusionConverter;
        }
        public OutilPedagogiquePubliqueCibleConverter getOutilPedagogiquePubliqueCibleConverter(){
        return this.outilPedagogiquePubliqueCibleConverter;
        }
        public void setOutilPedagogiquePubliqueCibleConverter(OutilPedagogiquePubliqueCibleConverter outilPedagogiquePubliqueCibleConverter ){
        this.outilPedagogiquePubliqueCibleConverter = outilPedagogiquePubliqueCibleConverter;
        }
        public TypeOutilPedagogiqueConverter getTypeOutilPedagogiqueConverter(){
        return this.typeOutilPedagogiqueConverter;
        }
        public void setTypeOutilPedagogiqueConverter(TypeOutilPedagogiqueConverter typeOutilPedagogiqueConverter ){
        this.typeOutilPedagogiqueConverter = typeOutilPedagogiqueConverter;
        }
        public OutilPedagogiquePaysConceptionConverter getOutilPedagogiquePaysConceptionConverter(){
        return this.outilPedagogiquePaysConceptionConverter;
        }
        public void setOutilPedagogiquePaysConceptionConverter(OutilPedagogiquePaysConceptionConverter outilPedagogiquePaysConceptionConverter ){
        this.outilPedagogiquePaysConceptionConverter = outilPedagogiquePaysConceptionConverter;
        }
        public OutilPedagogiqueInstrumentIrdConverter getOutilPedagogiqueInstrumentIrdConverter(){
        return this.outilPedagogiqueInstrumentIrdConverter;
        }
        public void setOutilPedagogiqueInstrumentIrdConverter(OutilPedagogiqueInstrumentIrdConverter outilPedagogiqueInstrumentIrdConverter ){
        this.outilPedagogiqueInstrumentIrdConverter = outilPedagogiqueInstrumentIrdConverter;
        }
        public CultureScientifiqueConverter getCultureScientifiqueConverter(){
        return this.cultureScientifiqueConverter;
        }
        public void setCultureScientifiqueConverter(CultureScientifiqueConverter cultureScientifiqueConverter ){
        this.cultureScientifiqueConverter = cultureScientifiqueConverter;
        }
        public OutilPedagogiqueDisciplineScientifiqueConverter getOutilPedagogiqueDisciplineScientifiqueConverter(){
        return this.outilPedagogiqueDisciplineScientifiqueConverter;
        }
        public void setOutilPedagogiqueDisciplineScientifiqueConverter(OutilPedagogiqueDisciplineScientifiqueConverter outilPedagogiqueDisciplineScientifiqueConverter ){
        this.outilPedagogiqueDisciplineScientifiqueConverter = outilPedagogiqueDisciplineScientifiqueConverter;
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





        public Boolean  isOutilPedagogiqueEnjeuxIrds(){
        return this.outilPedagogiqueEnjeuxIrds ;
        }
        public void  setOutilPedagogiqueEnjeuxIrds(Boolean outilPedagogiqueEnjeuxIrds ){
        this.outilPedagogiqueEnjeuxIrds  = outilPedagogiqueEnjeuxIrds ;
        }



        public Boolean  isOutilPedagogiqueDisciplineScientifiques(){
        return this.outilPedagogiqueDisciplineScientifiques ;
        }
        public void  setOutilPedagogiqueDisciplineScientifiques(Boolean outilPedagogiqueDisciplineScientifiques ){
        this.outilPedagogiqueDisciplineScientifiques  = outilPedagogiqueDisciplineScientifiques ;
        }







        public Boolean  isOutilPedagogiquePubliqueCibles(){
        return this.outilPedagogiquePubliqueCibles ;
        }
        public void  setOutilPedagogiquePubliqueCibles(Boolean outilPedagogiquePubliqueCibles ){
        this.outilPedagogiquePubliqueCibles  = outilPedagogiquePubliqueCibles ;
        }



        public Boolean  isTypeOutilPedagogiques(){
        return this.typeOutilPedagogiques ;
        }
        public void  setTypeOutilPedagogiques(Boolean typeOutilPedagogiques ){
        this.typeOutilPedagogiques  = typeOutilPedagogiques ;
        }





        public Boolean  isOutilPedagogiqueLangues(){
        return this.outilPedagogiqueLangues ;
        }
        public void  setOutilPedagogiqueLangues(Boolean outilPedagogiqueLangues ){
        this.outilPedagogiqueLangues  = outilPedagogiqueLangues ;
        }



        public Boolean  isOutilPedagogiquePaysConceptions(){
        return this.outilPedagogiquePaysConceptions ;
        }
        public void  setOutilPedagogiquePaysConceptions(Boolean outilPedagogiquePaysConceptions ){
        this.outilPedagogiquePaysConceptions  = outilPedagogiquePaysConceptions ;
        }





        public Boolean  isOutilPedagogiquePaysDiffusions(){
        return this.outilPedagogiquePaysDiffusions ;
        }
        public void  setOutilPedagogiquePaysDiffusions(Boolean outilPedagogiquePaysDiffusions ){
        this.outilPedagogiquePaysDiffusions  = outilPedagogiquePaysDiffusions ;
        }





        public Boolean  isOutilPedagogiqueInstrumentIrds(){
        return this.outilPedagogiqueInstrumentIrds ;
        }
        public void  setOutilPedagogiqueInstrumentIrds(Boolean outilPedagogiqueInstrumentIrds ){
        this.outilPedagogiqueInstrumentIrds  = outilPedagogiqueInstrumentIrds ;
        }



        public Boolean  isOutilPedagogiqueTypeInstrumentIrds(){
        return this.outilPedagogiqueTypeInstrumentIrds ;
        }
        public void  setOutilPedagogiqueTypeInstrumentIrds(Boolean outilPedagogiqueTypeInstrumentIrds ){
        this.outilPedagogiqueTypeInstrumentIrds  = outilPedagogiqueTypeInstrumentIrds ;
        }










}
