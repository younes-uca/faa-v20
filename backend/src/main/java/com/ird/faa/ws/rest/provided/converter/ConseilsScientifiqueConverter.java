package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ConseilsScientifique;
import com.ird.faa.ws.rest.provided.vo.ConseilsScientifiqueVo;

@Component
public class ConseilsScientifiqueConverter extends AbstractConverter<ConseilsScientifique,ConseilsScientifiqueVo>{

        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private EnjeuxIrdConseilsScientifiqueConverter enjeuxIrdConseilsScientifiqueConverter ;
        @Autowired
        private NatureExpertiseConverter natureExpertiseConverter ;
        @Autowired
        private TypeExpertiseConverter typeExpertiseConverter ;
        @Autowired
        private EtablissementConseilsScientifiqueConverter etablissementConseilsScientifiqueConverter ;
        @Autowired
        private DisciplineScientifiqueConseilsScientifiqueConverter disciplineScientifiqueConseilsScientifiqueConverter ;
        @Autowired
        private ZoneGeographiqueConseilsScientifiqueConverter zoneGeographiqueConseilsScientifiqueConverter ;
        @Autowired
        private ExpertiseConverter expertiseConverter ;
    private Boolean natureExpertise;
    private Boolean typeExpertise;
    private Boolean expertise;
    private Boolean etatEtapeCampagne;
        private Boolean etablissementConseilsScientifiques;
        private Boolean zoneGeographiqueConseilsScientifiques;
        private Boolean enjeuxIrdConseilsScientifiques;
        private Boolean disciplineScientifiqueConseilsScientifiques;

public  ConseilsScientifiqueConverter(){
init(true);
}

@Override
public ConseilsScientifique toItem(ConseilsScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
ConseilsScientifique item = new ConseilsScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getIntitule()))
        item.setIntitule(vo.getIntitule());
        if(StringUtil.isNotEmpty(vo.getNombreJoursConsacres()))
        item.setNombreJoursConsacres(NumberUtil.toLong(vo.getNombreJoursConsacres()));
    if(vo.getNatureExpertiseVo()!=null && this.natureExpertise)
        item.setNatureExpertise(natureExpertiseConverter.toItem(vo.getNatureExpertiseVo())) ;
    if(vo.getTypeExpertiseVo()!=null && this.typeExpertise)
        item.setTypeExpertise(typeExpertiseConverter.toItem(vo.getTypeExpertiseVo())) ;
    if(vo.getExpertiseVo()!=null && this.expertise)
        item.setExpertise(expertiseConverter.toItem(vo.getExpertiseVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getEtablissementConseilsScientifiquesVo()) && this.etablissementConseilsScientifiques)
        item.setEtablissementConseilsScientifiques(etablissementConseilsScientifiqueConverter.toItem(vo.getEtablissementConseilsScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getZoneGeographiqueConseilsScientifiquesVo()) && this.zoneGeographiqueConseilsScientifiques)
        item.setZoneGeographiqueConseilsScientifiques(zoneGeographiqueConseilsScientifiqueConverter.toItem(vo.getZoneGeographiqueConseilsScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getEnjeuxIrdConseilsScientifiquesVo()) && this.enjeuxIrdConseilsScientifiques)
        item.setEnjeuxIrdConseilsScientifiques(enjeuxIrdConseilsScientifiqueConverter.toItem(vo.getEnjeuxIrdConseilsScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getDisciplineScientifiqueConseilsScientifiquesVo()) && this.disciplineScientifiqueConseilsScientifiques)
        item.setDisciplineScientifiqueConseilsScientifiques(disciplineScientifiqueConseilsScientifiqueConverter.toItem(vo.getDisciplineScientifiqueConseilsScientifiquesVo()));

return item;
}
}

@Override
public ConseilsScientifiqueVo toVo(ConseilsScientifique item) {
if (item == null) {
return null;
} else {
ConseilsScientifiqueVo vo = new ConseilsScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getIntitule()))
        vo.setIntitule(item.getIntitule());

        if(item.getNombreJoursConsacres()!=null)
        vo.setNombreJoursConsacres(NumberUtil.toString(item.getNombreJoursConsacres()));

    if(item.getNatureExpertise()!=null && this.natureExpertise) {
        vo.setNatureExpertiseVo(natureExpertiseConverter.toVo(item.getNatureExpertise())) ;
    }
    if(item.getTypeExpertise()!=null && this.typeExpertise) {
        vo.setTypeExpertiseVo(typeExpertiseConverter.toVo(item.getTypeExpertise())) ;
    }
    if(item.getExpertise()!=null && this.expertise) {
        vo.setExpertiseVo(expertiseConverter.toVo(item.getExpertise())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getEtablissementConseilsScientifiques()) && this.etablissementConseilsScientifiques){
        etablissementConseilsScientifiqueConverter.init(true);
        etablissementConseilsScientifiqueConverter.setConseilsScientifique(false);
        vo.setEtablissementConseilsScientifiquesVo(etablissementConseilsScientifiqueConverter.toVo(item.getEtablissementConseilsScientifiques()));
        etablissementConseilsScientifiqueConverter.setConseilsScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getZoneGeographiqueConseilsScientifiques()) && this.zoneGeographiqueConseilsScientifiques){
        zoneGeographiqueConseilsScientifiqueConverter.init(true);
        zoneGeographiqueConseilsScientifiqueConverter.setConseilsScientifique(false);
        vo.setZoneGeographiqueConseilsScientifiquesVo(zoneGeographiqueConseilsScientifiqueConverter.toVo(item.getZoneGeographiqueConseilsScientifiques()));
        zoneGeographiqueConseilsScientifiqueConverter.setConseilsScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getEnjeuxIrdConseilsScientifiques()) && this.enjeuxIrdConseilsScientifiques){
        enjeuxIrdConseilsScientifiqueConverter.init(true);
        enjeuxIrdConseilsScientifiqueConverter.setConseilsScientifique(false);
        vo.setEnjeuxIrdConseilsScientifiquesVo(enjeuxIrdConseilsScientifiqueConverter.toVo(item.getEnjeuxIrdConseilsScientifiques()));
        enjeuxIrdConseilsScientifiqueConverter.setConseilsScientifique(true);
        }
        if(ListUtil.isNotEmpty(item.getDisciplineScientifiqueConseilsScientifiques()) && this.disciplineScientifiqueConseilsScientifiques){
        disciplineScientifiqueConseilsScientifiqueConverter.init(true);
        disciplineScientifiqueConseilsScientifiqueConverter.setConseilsScientifique(false);
        vo.setDisciplineScientifiqueConseilsScientifiquesVo(disciplineScientifiqueConseilsScientifiqueConverter.toVo(item.getDisciplineScientifiqueConseilsScientifiques()));
        disciplineScientifiqueConseilsScientifiqueConverter.setConseilsScientifique(true);
        }

return vo;
}
}

public void init(Boolean value) {
    natureExpertise = value;
    typeExpertise = value;
    expertise = value;
    etatEtapeCampagne = value;
        etablissementConseilsScientifiques = value;
        zoneGeographiqueConseilsScientifiques = value;
        enjeuxIrdConseilsScientifiques = value;
        disciplineScientifiqueConseilsScientifiques = value;
}


        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public EnjeuxIrdConseilsScientifiqueConverter getEnjeuxIrdConseilsScientifiqueConverter(){
        return this.enjeuxIrdConseilsScientifiqueConverter;
        }
        public void setEnjeuxIrdConseilsScientifiqueConverter(EnjeuxIrdConseilsScientifiqueConverter enjeuxIrdConseilsScientifiqueConverter ){
        this.enjeuxIrdConseilsScientifiqueConverter = enjeuxIrdConseilsScientifiqueConverter;
        }
        public NatureExpertiseConverter getNatureExpertiseConverter(){
        return this.natureExpertiseConverter;
        }
        public void setNatureExpertiseConverter(NatureExpertiseConverter natureExpertiseConverter ){
        this.natureExpertiseConverter = natureExpertiseConverter;
        }
        public TypeExpertiseConverter getTypeExpertiseConverter(){
        return this.typeExpertiseConverter;
        }
        public void setTypeExpertiseConverter(TypeExpertiseConverter typeExpertiseConverter ){
        this.typeExpertiseConverter = typeExpertiseConverter;
        }
        public EtablissementConseilsScientifiqueConverter getEtablissementConseilsScientifiqueConverter(){
        return this.etablissementConseilsScientifiqueConverter;
        }
        public void setEtablissementConseilsScientifiqueConverter(EtablissementConseilsScientifiqueConverter etablissementConseilsScientifiqueConverter ){
        this.etablissementConseilsScientifiqueConverter = etablissementConseilsScientifiqueConverter;
        }
        public DisciplineScientifiqueConseilsScientifiqueConverter getDisciplineScientifiqueConseilsScientifiqueConverter(){
        return this.disciplineScientifiqueConseilsScientifiqueConverter;
        }
        public void setDisciplineScientifiqueConseilsScientifiqueConverter(DisciplineScientifiqueConseilsScientifiqueConverter disciplineScientifiqueConseilsScientifiqueConverter ){
        this.disciplineScientifiqueConseilsScientifiqueConverter = disciplineScientifiqueConseilsScientifiqueConverter;
        }
        public ZoneGeographiqueConseilsScientifiqueConverter getZoneGeographiqueConseilsScientifiqueConverter(){
        return this.zoneGeographiqueConseilsScientifiqueConverter;
        }
        public void setZoneGeographiqueConseilsScientifiqueConverter(ZoneGeographiqueConseilsScientifiqueConverter zoneGeographiqueConseilsScientifiqueConverter ){
        this.zoneGeographiqueConseilsScientifiqueConverter = zoneGeographiqueConseilsScientifiqueConverter;
        }
        public ExpertiseConverter getExpertiseConverter(){
        return this.expertiseConverter;
        }
        public void setExpertiseConverter(ExpertiseConverter expertiseConverter ){
        this.expertiseConverter = expertiseConverter;
        }

    public boolean  isNatureExpertise(){
    return this.natureExpertise;
    }
    public void  setNatureExpertise(boolean natureExpertise){
    this.natureExpertise = natureExpertise;
    }
    public boolean  isTypeExpertise(){
    return this.typeExpertise;
    }
    public void  setTypeExpertise(boolean typeExpertise){
    this.typeExpertise = typeExpertise;
    }
    public boolean  isExpertise(){
    return this.expertise;
    }
    public void  setExpertise(boolean expertise){
    this.expertise = expertise;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }







        public Boolean  isEtablissementConseilsScientifiques(){
        return this.etablissementConseilsScientifiques ;
        }
        public void  setEtablissementConseilsScientifiques(Boolean etablissementConseilsScientifiques ){
        this.etablissementConseilsScientifiques  = etablissementConseilsScientifiques ;
        }



        public Boolean  isZoneGeographiqueConseilsScientifiques(){
        return this.zoneGeographiqueConseilsScientifiques ;
        }
        public void  setZoneGeographiqueConseilsScientifiques(Boolean zoneGeographiqueConseilsScientifiques ){
        this.zoneGeographiqueConseilsScientifiques  = zoneGeographiqueConseilsScientifiques ;
        }



        public Boolean  isEnjeuxIrdConseilsScientifiques(){
        return this.enjeuxIrdConseilsScientifiques ;
        }
        public void  setEnjeuxIrdConseilsScientifiques(Boolean enjeuxIrdConseilsScientifiques ){
        this.enjeuxIrdConseilsScientifiques  = enjeuxIrdConseilsScientifiques ;
        }



        public Boolean  isDisciplineScientifiqueConseilsScientifiques(){
        return this.disciplineScientifiqueConseilsScientifiques ;
        }
        public void  setDisciplineScientifiqueConseilsScientifiques(Boolean disciplineScientifiqueConseilsScientifiques ){
        this.disciplineScientifiqueConseilsScientifiques  = disciplineScientifiqueConseilsScientifiques ;
        }










}
