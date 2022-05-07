package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.Encadrement;
import com.ird.faa.ws.rest.provided.vo.EncadrementVo;

@Component
public class EncadrementConverter extends AbstractConverter<Encadrement,EncadrementVo>{

        @Autowired
        private EncadrementEtudiantConverter encadrementEtudiantConverter ;
        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private EncadrementDoctorantConverter encadrementDoctorantConverter ;
        @Autowired
        private CampagneConverter campagneConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean campagne;
    private Boolean chercheur;
    private Boolean etatEtapeCampagne;
        private Boolean encadrementEtudiants;
        private Boolean encadrementDoctorants;

public  EncadrementConverter(){
init(true);
}

@Override
public Encadrement toItem(EncadrementVo vo) {
if (vo == null) {
return null;
} else {
Encadrement item = new Encadrement();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getAnnee()))
        item.setAnnee(NumberUtil.toLong(vo.getAnnee()));
        if(StringUtil.isNotEmpty(vo.getTempsEstimePourCetteAnnne()))
        item.setTempsEstimePourCetteAnnne(NumberUtil.toBigDecimal(vo.getTempsEstimePourCetteAnnne()));
    if(vo.getCampagneVo()!=null && this.campagne)
        item.setCampagne(campagneConverter.toItem(vo.getCampagneVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getEncadrementEtudiantsVo()) && this.encadrementEtudiants)
        item.setEncadrementEtudiants(encadrementEtudiantConverter.toItem(vo.getEncadrementEtudiantsVo()));
    if(ListUtil.isNotEmpty(vo.getEncadrementDoctorantsVo()) && this.encadrementDoctorants)
        item.setEncadrementDoctorants(encadrementDoctorantConverter.toItem(vo.getEncadrementDoctorantsVo()));

return item;
}
}

@Override
public EncadrementVo toVo(Encadrement item) {
if (item == null) {
return null;
} else {
EncadrementVo vo = new EncadrementVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getAnnee()!=null)
        vo.setAnnee(NumberUtil.toString(item.getAnnee()));

        if(item.getTempsEstimePourCetteAnnne()!=null)
        vo.setTempsEstimePourCetteAnnne(NumberUtil.toString(item.getTempsEstimePourCetteAnnne()));

    if(item.getCampagne()!=null && this.campagne) {
        vo.setCampagneVo(campagneConverter.toVo(item.getCampagne())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getEncadrementEtudiants()) && this.encadrementEtudiants){
        encadrementEtudiantConverter.init(true);
        encadrementEtudiantConverter.setEncadrement(false);
        vo.setEncadrementEtudiantsVo(encadrementEtudiantConverter.toVo(item.getEncadrementEtudiants()));
        encadrementEtudiantConverter.setEncadrement(true);
        }
        if(ListUtil.isNotEmpty(item.getEncadrementDoctorants()) && this.encadrementDoctorants){
        encadrementDoctorantConverter.init(true);
        encadrementDoctorantConverter.setEncadrement(false);
        vo.setEncadrementDoctorantsVo(encadrementDoctorantConverter.toVo(item.getEncadrementDoctorants()));
        encadrementDoctorantConverter.setEncadrement(true);
        }

return vo;
}
}

public void init(Boolean value) {
    campagne = value;
    chercheur = value;
    etatEtapeCampagne = value;
        encadrementEtudiants = value;
        encadrementDoctorants = value;
}


        public EncadrementEtudiantConverter getEncadrementEtudiantConverter(){
        return this.encadrementEtudiantConverter;
        }
        public void setEncadrementEtudiantConverter(EncadrementEtudiantConverter encadrementEtudiantConverter ){
        this.encadrementEtudiantConverter = encadrementEtudiantConverter;
        }
        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public EncadrementDoctorantConverter getEncadrementDoctorantConverter(){
        return this.encadrementDoctorantConverter;
        }
        public void setEncadrementDoctorantConverter(EncadrementDoctorantConverter encadrementDoctorantConverter ){
        this.encadrementDoctorantConverter = encadrementDoctorantConverter;
        }
        public CampagneConverter getCampagneConverter(){
        return this.campagneConverter;
        }
        public void setCampagneConverter(CampagneConverter campagneConverter ){
        this.campagneConverter = campagneConverter;
        }
        public ChercheurConverter getChercheurConverter(){
        return this.chercheurConverter;
        }
        public void setChercheurConverter(ChercheurConverter chercheurConverter ){
        this.chercheurConverter = chercheurConverter;
        }

    public boolean  isCampagne(){
    return this.campagne;
    }
    public void  setCampagne(boolean campagne){
    this.campagne = campagne;
    }
    public boolean  isChercheur(){
    return this.chercheur;
    }
    public void  setChercheur(boolean chercheur){
    this.chercheur = chercheur;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }











        public Boolean  isEncadrementEtudiants(){
        return this.encadrementEtudiants ;
        }
        public void  setEncadrementEtudiants(Boolean encadrementEtudiants ){
        this.encadrementEtudiants  = encadrementEtudiants ;
        }



        public Boolean  isEncadrementDoctorants(){
        return this.encadrementDoctorants ;
        }
        public void  setEncadrementDoctorants(Boolean encadrementDoctorants ){
        this.encadrementDoctorants  = encadrementDoctorants ;
        }




}
