package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EncadrementDoctorant;
import com.ird.faa.ws.rest.provided.vo.EncadrementDoctorantVo;

@Component
public class EncadrementDoctorantConverter extends AbstractConverter<EncadrementDoctorant,EncadrementDoctorantVo>{

        @Autowired
        private FinancementDoctorantConverter financementDoctorantConverter ;
        @Autowired
        private EnjeuxIrdEncadrementDoctorantConverter enjeuxIrdEncadrementDoctorantConverter ;
        @Autowired
        private DisciplineScientifiqueEncadrementDoctorantConverter disciplineScientifiqueEncadrementDoctorantConverter ;
        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private CommunauteSavoirEncadrementDoctorantConverter communauteSavoirEncadrementDoctorantConverter ;
        @Autowired
        private EncadrementConverter encadrementConverter ;
        @Autowired
        private DoctorantConverter doctorantConverter ;
        @Autowired
        private ResponsabiliteEncadrementDoctorantConverter responsabiliteEncadrementDoctorantConverter ;
        @Autowired
        private EtablissementConverter etablissementConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean responsabiliteEncadrementDoctorant;
    private Boolean financementDoctorant;
    private Boolean etablissement;
    private Boolean pays;
    private Boolean doctorant;
    private Boolean encadrement;
    private Boolean etatEtapeCampagne;
        private Boolean enjeuxIrdEncadrementDoctorants;
        private Boolean disciplineScientifiqueEncadrementDoctorants;
        private Boolean communauteSavoirEncadrementDoctorants;

public  EncadrementDoctorantConverter(){
init(true);
}

@Override
public EncadrementDoctorant toItem(EncadrementDoctorantVo vo) {
if (vo == null) {
return null;
} else {
EncadrementDoctorant item = new EncadrementDoctorant();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
            if(vo.getCodirectionInternationale() != null)
            item.setCodirectionInternationale(vo.getCodirectionInternationale());
            if(vo.getCursus() != null)
            item.setCursus(vo.getCursus());
        if(StringUtil.isNotEmpty(vo.getSujetThese()))
        item.setSujetThese(vo.getSujetThese());
        if(StringUtil.isNotEmpty(vo.getDateDebutThese()))
        item.setDateDebutThese(DateUtil.parse(vo.getDateDebutThese()));
        if(StringUtil.isNotEmpty(vo.getDatePrevuSoutenanceThese()))
        item.setDatePrevuSoutenanceThese(DateUtil.parse(vo.getDatePrevuSoutenanceThese()));
        if(StringUtil.isNotEmpty(vo.getIntituleEcoleDoctorale()))
        item.setIntituleEcoleDoctorale(vo.getIntituleEcoleDoctorale());
    if(vo.getResponsabiliteEncadrementDoctorantVo()!=null && this.responsabiliteEncadrementDoctorant)
        item.setResponsabiliteEncadrementDoctorant(responsabiliteEncadrementDoctorantConverter.toItem(vo.getResponsabiliteEncadrementDoctorantVo())) ;
    if(vo.getFinancementDoctorantVo()!=null && this.financementDoctorant)
        item.setFinancementDoctorant(financementDoctorantConverter.toItem(vo.getFinancementDoctorantVo())) ;
    if(vo.getEtablissementVo()!=null && this.etablissement)
        item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getDoctorantVo()!=null && this.doctorant)
        item.setDoctorant(doctorantConverter.toItem(vo.getDoctorantVo())) ;
    if(vo.getEncadrementVo()!=null && this.encadrement)
        item.setEncadrement(encadrementConverter.toItem(vo.getEncadrementVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getEnjeuxIrdEncadrementDoctorantsVo()) && this.enjeuxIrdEncadrementDoctorants)
        item.setEnjeuxIrdEncadrementDoctorants(enjeuxIrdEncadrementDoctorantConverter.toItem(vo.getEnjeuxIrdEncadrementDoctorantsVo()));
    if(ListUtil.isNotEmpty(vo.getDisciplineScientifiqueEncadrementDoctorantsVo()) && this.disciplineScientifiqueEncadrementDoctorants)
        item.setDisciplineScientifiqueEncadrementDoctorants(disciplineScientifiqueEncadrementDoctorantConverter.toItem(vo.getDisciplineScientifiqueEncadrementDoctorantsVo()));
    if(ListUtil.isNotEmpty(vo.getCommunauteSavoirEncadrementDoctorantsVo()) && this.communauteSavoirEncadrementDoctorants)
        item.setCommunauteSavoirEncadrementDoctorants(communauteSavoirEncadrementDoctorantConverter.toItem(vo.getCommunauteSavoirEncadrementDoctorantsVo()));

return item;
}
}

@Override
public EncadrementDoctorantVo toVo(EncadrementDoctorant item) {
if (item == null) {
return null;
} else {
EncadrementDoctorantVo vo = new EncadrementDoctorantVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getCodirectionInternationale()!=null)
        vo.setCodirectionInternationale(item.getCodirectionInternationale());
        if(item.getCursus()!=null)
        vo.setCursus(item.getCursus());
        if(StringUtil.isNotEmpty(item.getSujetThese()))
        vo.setSujetThese(item.getSujetThese());

        if(item.getDateDebutThese()!=null)
        vo.setDateDebutThese(DateUtil.formateDate(item.getDateDebutThese()));
        if(item.getDatePrevuSoutenanceThese()!=null)
        vo.setDatePrevuSoutenanceThese(DateUtil.formateDate(item.getDatePrevuSoutenanceThese()));
        if(StringUtil.isNotEmpty(item.getIntituleEcoleDoctorale()))
        vo.setIntituleEcoleDoctorale(item.getIntituleEcoleDoctorale());

    if(item.getResponsabiliteEncadrementDoctorant()!=null && this.responsabiliteEncadrementDoctorant) {
        vo.setResponsabiliteEncadrementDoctorantVo(responsabiliteEncadrementDoctorantConverter.toVo(item.getResponsabiliteEncadrementDoctorant())) ;
    }
    if(item.getFinancementDoctorant()!=null && this.financementDoctorant) {
        vo.setFinancementDoctorantVo(financementDoctorantConverter.toVo(item.getFinancementDoctorant())) ;
    }
    if(item.getEtablissement()!=null && this.etablissement) {
        vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getDoctorant()!=null && this.doctorant) {
        vo.setDoctorantVo(doctorantConverter.toVo(item.getDoctorant())) ;
    }
    if(item.getEncadrement()!=null && this.encadrement) {
        vo.setEncadrementVo(encadrementConverter.toVo(item.getEncadrement())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getEnjeuxIrdEncadrementDoctorants()) && this.enjeuxIrdEncadrementDoctorants){
        enjeuxIrdEncadrementDoctorantConverter.init(true);
        enjeuxIrdEncadrementDoctorantConverter.setEncadrementDoctorant(false);
        vo.setEnjeuxIrdEncadrementDoctorantsVo(enjeuxIrdEncadrementDoctorantConverter.toVo(item.getEnjeuxIrdEncadrementDoctorants()));
        enjeuxIrdEncadrementDoctorantConverter.setEncadrementDoctorant(true);
        }
        if(ListUtil.isNotEmpty(item.getDisciplineScientifiqueEncadrementDoctorants()) && this.disciplineScientifiqueEncadrementDoctorants){
        disciplineScientifiqueEncadrementDoctorantConverter.init(true);
        disciplineScientifiqueEncadrementDoctorantConverter.setEncadrementDoctorant(false);
        vo.setDisciplineScientifiqueEncadrementDoctorantsVo(disciplineScientifiqueEncadrementDoctorantConverter.toVo(item.getDisciplineScientifiqueEncadrementDoctorants()));
        disciplineScientifiqueEncadrementDoctorantConverter.setEncadrementDoctorant(true);
        }
        if(ListUtil.isNotEmpty(item.getCommunauteSavoirEncadrementDoctorants()) && this.communauteSavoirEncadrementDoctorants){
        communauteSavoirEncadrementDoctorantConverter.init(true);
        communauteSavoirEncadrementDoctorantConverter.setEncadrementDoctorant(false);
        vo.setCommunauteSavoirEncadrementDoctorantsVo(communauteSavoirEncadrementDoctorantConverter.toVo(item.getCommunauteSavoirEncadrementDoctorants()));
        communauteSavoirEncadrementDoctorantConverter.setEncadrementDoctorant(true);
        }

return vo;
}
}

public void init(Boolean value) {
    responsabiliteEncadrementDoctorant = value;
    financementDoctorant = value;
    etablissement = value;
    pays = value;
    doctorant = value;
    encadrement = value;
    etatEtapeCampagne = value;
        enjeuxIrdEncadrementDoctorants = value;
        disciplineScientifiqueEncadrementDoctorants = value;
        communauteSavoirEncadrementDoctorants = value;
}


        public FinancementDoctorantConverter getFinancementDoctorantConverter(){
        return this.financementDoctorantConverter;
        }
        public void setFinancementDoctorantConverter(FinancementDoctorantConverter financementDoctorantConverter ){
        this.financementDoctorantConverter = financementDoctorantConverter;
        }
        public EnjeuxIrdEncadrementDoctorantConverter getEnjeuxIrdEncadrementDoctorantConverter(){
        return this.enjeuxIrdEncadrementDoctorantConverter;
        }
        public void setEnjeuxIrdEncadrementDoctorantConverter(EnjeuxIrdEncadrementDoctorantConverter enjeuxIrdEncadrementDoctorantConverter ){
        this.enjeuxIrdEncadrementDoctorantConverter = enjeuxIrdEncadrementDoctorantConverter;
        }
        public DisciplineScientifiqueEncadrementDoctorantConverter getDisciplineScientifiqueEncadrementDoctorantConverter(){
        return this.disciplineScientifiqueEncadrementDoctorantConverter;
        }
        public void setDisciplineScientifiqueEncadrementDoctorantConverter(DisciplineScientifiqueEncadrementDoctorantConverter disciplineScientifiqueEncadrementDoctorantConverter ){
        this.disciplineScientifiqueEncadrementDoctorantConverter = disciplineScientifiqueEncadrementDoctorantConverter;
        }
        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public CommunauteSavoirEncadrementDoctorantConverter getCommunauteSavoirEncadrementDoctorantConverter(){
        return this.communauteSavoirEncadrementDoctorantConverter;
        }
        public void setCommunauteSavoirEncadrementDoctorantConverter(CommunauteSavoirEncadrementDoctorantConverter communauteSavoirEncadrementDoctorantConverter ){
        this.communauteSavoirEncadrementDoctorantConverter = communauteSavoirEncadrementDoctorantConverter;
        }
        public EncadrementConverter getEncadrementConverter(){
        return this.encadrementConverter;
        }
        public void setEncadrementConverter(EncadrementConverter encadrementConverter ){
        this.encadrementConverter = encadrementConverter;
        }
        public DoctorantConverter getDoctorantConverter(){
        return this.doctorantConverter;
        }
        public void setDoctorantConverter(DoctorantConverter doctorantConverter ){
        this.doctorantConverter = doctorantConverter;
        }
        public ResponsabiliteEncadrementDoctorantConverter getResponsabiliteEncadrementDoctorantConverter(){
        return this.responsabiliteEncadrementDoctorantConverter;
        }
        public void setResponsabiliteEncadrementDoctorantConverter(ResponsabiliteEncadrementDoctorantConverter responsabiliteEncadrementDoctorantConverter ){
        this.responsabiliteEncadrementDoctorantConverter = responsabiliteEncadrementDoctorantConverter;
        }
        public EtablissementConverter getEtablissementConverter(){
        return this.etablissementConverter;
        }
        public void setEtablissementConverter(EtablissementConverter etablissementConverter ){
        this.etablissementConverter = etablissementConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }

    public boolean  isResponsabiliteEncadrementDoctorant(){
    return this.responsabiliteEncadrementDoctorant;
    }
    public void  setResponsabiliteEncadrementDoctorant(boolean responsabiliteEncadrementDoctorant){
    this.responsabiliteEncadrementDoctorant = responsabiliteEncadrementDoctorant;
    }
    public boolean  isFinancementDoctorant(){
    return this.financementDoctorant;
    }
    public void  setFinancementDoctorant(boolean financementDoctorant){
    this.financementDoctorant = financementDoctorant;
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
    public boolean  isDoctorant(){
    return this.doctorant;
    }
    public void  setDoctorant(boolean doctorant){
    this.doctorant = doctorant;
    }
    public boolean  isEncadrement(){
    return this.encadrement;
    }
    public void  setEncadrement(boolean encadrement){
    this.encadrement = encadrement;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }











        public Boolean  isEnjeuxIrdEncadrementDoctorants(){
        return this.enjeuxIrdEncadrementDoctorants ;
        }
        public void  setEnjeuxIrdEncadrementDoctorants(Boolean enjeuxIrdEncadrementDoctorants ){
        this.enjeuxIrdEncadrementDoctorants  = enjeuxIrdEncadrementDoctorants ;
        }



        public Boolean  isDisciplineScientifiqueEncadrementDoctorants(){
        return this.disciplineScientifiqueEncadrementDoctorants ;
        }
        public void  setDisciplineScientifiqueEncadrementDoctorants(Boolean disciplineScientifiqueEncadrementDoctorants ){
        this.disciplineScientifiqueEncadrementDoctorants  = disciplineScientifiqueEncadrementDoctorants ;
        }



        public Boolean  isCommunauteSavoirEncadrementDoctorants(){
        return this.communauteSavoirEncadrementDoctorants ;
        }
        public void  setCommunauteSavoirEncadrementDoctorants(Boolean communauteSavoirEncadrementDoctorants ){
        this.communauteSavoirEncadrementDoctorants  = communauteSavoirEncadrementDoctorants ;
        }




















}
