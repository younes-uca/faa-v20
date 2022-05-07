package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.VieInstitutionnelleDetail;
import com.ird.faa.ws.rest.provided.vo.VieInstitutionnelleDetailVo;

@Component
public class VieInstitutionnelleDetailConverter extends AbstractConverter<VieInstitutionnelleDetail,VieInstitutionnelleDetailVo>{

        @Autowired
        private TypeInstanceConverter typeInstanceConverter ;
        @Autowired
        private VieInstitutionnelleConverter vieInstitutionnelleConverter ;
        @Autowired
        private VieInstitutionnelleDetailInstrumentIrdConverter vieInstitutionnelleDetailInstrumentIrdConverter ;
        @Autowired
        private StructureIrdConverter structureIrdConverter ;
        @Autowired
        private PaysConverter paysConverter ;
        @Autowired
        private VieInstitutionnelleDetailEtablissementConverter vieInstitutionnelleDetailEtablissementConverter ;
    private Boolean typeInstance;
    private Boolean structureIrd;
    private Boolean pays;
    private Boolean vieInstitutionnelle;
        private Boolean vieInstitutionnelleDetailInstrumentIrds;
        private Boolean vieInstitutionnelleDetailEtablissements;

public  VieInstitutionnelleDetailConverter(){
init(true);
}

@Override
public VieInstitutionnelleDetail toItem(VieInstitutionnelleDetailVo vo) {
if (vo == null) {
return null;
} else {
VieInstitutionnelleDetail item = new VieInstitutionnelleDetail();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
            if(vo.getCooreleStructureIrd() != null)
            item.setCooreleStructureIrd(vo.getCooreleStructureIrd());
            if(vo.getCooreleInstrumentIrd() != null)
            item.setCooreleInstrumentIrd(vo.getCooreleInstrumentIrd());
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
    if(vo.getTypeInstanceVo()!=null && this.typeInstance)
        item.setTypeInstance(typeInstanceConverter.toItem(vo.getTypeInstanceVo())) ;
    if(vo.getStructureIrdVo()!=null && this.structureIrd)
        item.setStructureIrd(structureIrdConverter.toItem(vo.getStructureIrdVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getVieInstitutionnelleVo()!=null && this.vieInstitutionnelle)
        item.setVieInstitutionnelle(vieInstitutionnelleConverter.toItem(vo.getVieInstitutionnelleVo())) ;

    if(ListUtil.isNotEmpty(vo.getVieInstitutionnelleDetailInstrumentIrdsVo()) && this.vieInstitutionnelleDetailInstrumentIrds)
        item.setVieInstitutionnelleDetailInstrumentIrds(vieInstitutionnelleDetailInstrumentIrdConverter.toItem(vo.getVieInstitutionnelleDetailInstrumentIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getVieInstitutionnelleDetailEtablissementsVo()) && this.vieInstitutionnelleDetailEtablissements)
        item.setVieInstitutionnelleDetailEtablissements(vieInstitutionnelleDetailEtablissementConverter.toItem(vo.getVieInstitutionnelleDetailEtablissementsVo()));

return item;
}
}

@Override
public VieInstitutionnelleDetailVo toVo(VieInstitutionnelleDetail item) {
if (item == null) {
return null;
} else {
VieInstitutionnelleDetailVo vo = new VieInstitutionnelleDetailVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getCooreleStructureIrd()!=null)
        vo.setCooreleStructureIrd(item.getCooreleStructureIrd());
        if(item.getCooreleInstrumentIrd()!=null)
        vo.setCooreleInstrumentIrd(item.getCooreleInstrumentIrd());
        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

    if(item.getTypeInstance()!=null && this.typeInstance) {
        vo.setTypeInstanceVo(typeInstanceConverter.toVo(item.getTypeInstance())) ;
    }
    if(item.getStructureIrd()!=null && this.structureIrd) {
        vo.setStructureIrdVo(structureIrdConverter.toVo(item.getStructureIrd())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getVieInstitutionnelle()!=null && this.vieInstitutionnelle) {
        vo.setVieInstitutionnelleVo(vieInstitutionnelleConverter.toVo(item.getVieInstitutionnelle())) ;
    }
        if(ListUtil.isNotEmpty(item.getVieInstitutionnelleDetailInstrumentIrds()) && this.vieInstitutionnelleDetailInstrumentIrds){
        vieInstitutionnelleDetailInstrumentIrdConverter.init(true);
        vieInstitutionnelleDetailInstrumentIrdConverter.setVieInstitutionnelleDetail(false);
        vo.setVieInstitutionnelleDetailInstrumentIrdsVo(vieInstitutionnelleDetailInstrumentIrdConverter.toVo(item.getVieInstitutionnelleDetailInstrumentIrds()));
        vieInstitutionnelleDetailInstrumentIrdConverter.setVieInstitutionnelleDetail(true);
        }
        if(ListUtil.isNotEmpty(item.getVieInstitutionnelleDetailEtablissements()) && this.vieInstitutionnelleDetailEtablissements){
        vieInstitutionnelleDetailEtablissementConverter.init(true);
        vieInstitutionnelleDetailEtablissementConverter.setVieInstitutionnelleDetail(false);
        vo.setVieInstitutionnelleDetailEtablissementsVo(vieInstitutionnelleDetailEtablissementConverter.toVo(item.getVieInstitutionnelleDetailEtablissements()));
        vieInstitutionnelleDetailEtablissementConverter.setVieInstitutionnelleDetail(true);
        }

return vo;
}
}

public void init(Boolean value) {
    typeInstance = value;
    structureIrd = value;
    pays = value;
    vieInstitutionnelle = value;
        vieInstitutionnelleDetailInstrumentIrds = value;
        vieInstitutionnelleDetailEtablissements = value;
}


        public TypeInstanceConverter getTypeInstanceConverter(){
        return this.typeInstanceConverter;
        }
        public void setTypeInstanceConverter(TypeInstanceConverter typeInstanceConverter ){
        this.typeInstanceConverter = typeInstanceConverter;
        }
        public VieInstitutionnelleConverter getVieInstitutionnelleConverter(){
        return this.vieInstitutionnelleConverter;
        }
        public void setVieInstitutionnelleConverter(VieInstitutionnelleConverter vieInstitutionnelleConverter ){
        this.vieInstitutionnelleConverter = vieInstitutionnelleConverter;
        }
        public VieInstitutionnelleDetailInstrumentIrdConverter getVieInstitutionnelleDetailInstrumentIrdConverter(){
        return this.vieInstitutionnelleDetailInstrumentIrdConverter;
        }
        public void setVieInstitutionnelleDetailInstrumentIrdConverter(VieInstitutionnelleDetailInstrumentIrdConverter vieInstitutionnelleDetailInstrumentIrdConverter ){
        this.vieInstitutionnelleDetailInstrumentIrdConverter = vieInstitutionnelleDetailInstrumentIrdConverter;
        }
        public StructureIrdConverter getStructureIrdConverter(){
        return this.structureIrdConverter;
        }
        public void setStructureIrdConverter(StructureIrdConverter structureIrdConverter ){
        this.structureIrdConverter = structureIrdConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }
        public VieInstitutionnelleDetailEtablissementConverter getVieInstitutionnelleDetailEtablissementConverter(){
        return this.vieInstitutionnelleDetailEtablissementConverter;
        }
        public void setVieInstitutionnelleDetailEtablissementConverter(VieInstitutionnelleDetailEtablissementConverter vieInstitutionnelleDetailEtablissementConverter ){
        this.vieInstitutionnelleDetailEtablissementConverter = vieInstitutionnelleDetailEtablissementConverter;
        }

    public boolean  isTypeInstance(){
    return this.typeInstance;
    }
    public void  setTypeInstance(boolean typeInstance){
    this.typeInstance = typeInstance;
    }
    public boolean  isStructureIrd(){
    return this.structureIrd;
    }
    public void  setStructureIrd(boolean structureIrd){
    this.structureIrd = structureIrd;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }
    public boolean  isVieInstitutionnelle(){
    return this.vieInstitutionnelle;
    }
    public void  setVieInstitutionnelle(boolean vieInstitutionnelle){
    this.vieInstitutionnelle = vieInstitutionnelle;
    }











        public Boolean  isVieInstitutionnelleDetailInstrumentIrds(){
        return this.vieInstitutionnelleDetailInstrumentIrds ;
        }
        public void  setVieInstitutionnelleDetailInstrumentIrds(Boolean vieInstitutionnelleDetailInstrumentIrds ){
        this.vieInstitutionnelleDetailInstrumentIrds  = vieInstitutionnelleDetailInstrumentIrds ;
        }





        public Boolean  isVieInstitutionnelleDetailEtablissements(){
        return this.vieInstitutionnelleDetailEtablissements ;
        }
        public void  setVieInstitutionnelleDetailEtablissements(Boolean vieInstitutionnelleDetailEtablissements ){
        this.vieInstitutionnelleDetailEtablissements  = vieInstitutionnelleDetailEtablissements ;
        }






}
