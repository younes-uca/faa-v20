package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.Reclamation;
import com.ird.faa.ws.rest.provided.vo.ReclamationVo;

@Component
public class ReclamationConverter extends AbstractConverter<Reclamation,ReclamationVo>{

        @Autowired
        private TypeReclamationConverter typeReclamationConverter ;
        @Autowired
        private EtatReclamationConverter etatReclamationConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean etatReclamation;
    private Boolean typeReclamation;
    private Boolean chercheur;

public  ReclamationConverter(){
init(true);
}

@Override
public Reclamation toItem(ReclamationVo vo) {
if (vo == null) {
return null;
} else {
Reclamation item = new Reclamation();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getObjet()))
        item.setObjet(vo.getObjet());
        if(StringUtil.isNotEmpty(vo.getMessage()))
        item.setMessage(vo.getMessage());
        if(StringUtil.isNotEmpty(vo.getDateReclamation()))
        item.setDateReclamation(DateUtil.parse(vo.getDateReclamation()));
        if(StringUtil.isNotEmpty(vo.getDateTraitement()))
        item.setDateTraitement(DateUtil.parse(vo.getDateTraitement()));
    if(vo.getEtatReclamationVo()!=null && this.etatReclamation)
        item.setEtatReclamation(etatReclamationConverter.toItem(vo.getEtatReclamationVo())) ;
    if(vo.getTypeReclamationVo()!=null && this.typeReclamation)
        item.setTypeReclamation(typeReclamationConverter.toItem(vo.getTypeReclamationVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;


return item;
}
}

@Override
public ReclamationVo toVo(Reclamation item) {
if (item == null) {
return null;
} else {
ReclamationVo vo = new ReclamationVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getObjet()))
        vo.setObjet(item.getObjet());

        if(StringUtil.isNotEmpty(item.getMessage()))
        vo.setMessage(item.getMessage());

        if(item.getDateReclamation()!=null)
        vo.setDateReclamation(DateUtil.formateDate(item.getDateReclamation()));
        if(item.getDateTraitement()!=null)
        vo.setDateTraitement(DateUtil.formateDate(item.getDateTraitement()));
    if(item.getEtatReclamation()!=null && this.etatReclamation) {
        vo.setEtatReclamationVo(etatReclamationConverter.toVo(item.getEtatReclamation())) ;
    }
    if(item.getTypeReclamation()!=null && this.typeReclamation) {
        vo.setTypeReclamationVo(typeReclamationConverter.toVo(item.getTypeReclamation())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    etatReclamation = value;
    typeReclamation = value;
    chercheur = value;
}


        public TypeReclamationConverter getTypeReclamationConverter(){
        return this.typeReclamationConverter;
        }
        public void setTypeReclamationConverter(TypeReclamationConverter typeReclamationConverter ){
        this.typeReclamationConverter = typeReclamationConverter;
        }
        public EtatReclamationConverter getEtatReclamationConverter(){
        return this.etatReclamationConverter;
        }
        public void setEtatReclamationConverter(EtatReclamationConverter etatReclamationConverter ){
        this.etatReclamationConverter = etatReclamationConverter;
        }
        public ChercheurConverter getChercheurConverter(){
        return this.chercheurConverter;
        }
        public void setChercheurConverter(ChercheurConverter chercheurConverter ){
        this.chercheurConverter = chercheurConverter;
        }

    public boolean  isEtatReclamation(){
    return this.etatReclamation;
    }
    public void  setEtatReclamation(boolean etatReclamation){
    this.etatReclamation = etatReclamation;
    }
    public boolean  isTypeReclamation(){
    return this.typeReclamation;
    }
    public void  setTypeReclamation(boolean typeReclamation){
    this.typeReclamation = typeReclamation;
    }
    public boolean  isChercheur(){
    return this.chercheur;
    }
    public void  setChercheur(boolean chercheur){
    this.chercheur = chercheur;
    }
















}
