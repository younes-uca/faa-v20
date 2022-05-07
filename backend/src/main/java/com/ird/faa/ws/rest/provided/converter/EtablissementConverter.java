package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.Etablissement;
import com.ird.faa.ws.rest.provided.vo.EtablissementVo;

@Component
public class EtablissementConverter extends AbstractConverter<Etablissement,EtablissementVo>{

        @Autowired
        private VilleConverter villeConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean ville;
    private Boolean pays;

public  EtablissementConverter(){
init(true);
}

@Override
public Etablissement toItem(EtablissementVo vo) {
if (vo == null) {
return null;
} else {
Etablissement item = new Etablissement();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
        if(StringUtil.isNotEmpty(vo.getCode()))
        item.setCode(vo.getCode());
        if(StringUtil.isNotEmpty(vo.getDescription()))
        item.setDescription(vo.getDescription());
        if(StringUtil.isNotEmpty(vo.getSigleOfficiel()))
        item.setSigleOfficiel(vo.getSigleOfficiel());
        if(StringUtil.isNotEmpty(vo.getNomEnFrancais()))
        item.setNomEnFrancais(vo.getNomEnFrancais());
        if(StringUtil.isNotEmpty(vo.getSigleEnFrancais()))
        item.setSigleEnFrancais(vo.getSigleEnFrancais());
        if(StringUtil.isNotEmpty(vo.getAnciensNom()))
        item.setAnciensNom(vo.getAnciensNom());
        if(StringUtil.isNotEmpty(vo.getChampIntervention()))
        item.setChampIntervention(vo.getChampIntervention());
            if(vo.getValide() != null)
            item.setValide(vo.getValide());
            if(vo.getArchive() != null)
            item.setArchive(vo.getArchive());
        if(StringUtil.isNotEmpty(vo.getDateArchivage()))
        item.setDateArchivage(DateUtil.parse(vo.getDateArchivage()));
        if(StringUtil.isNotEmpty(vo.getDateCreation()))
        item.setDateCreation(DateUtil.parse(vo.getDateCreation()));
            if(vo.getAdmin() != null)
            item.setAdmin(vo.getAdmin());
            if(vo.getVisible() != null)
            item.setVisible(vo.getVisible());
        if(StringUtil.isNotEmpty(vo.getUsername()))
        item.setUsername(vo.getUsername());
    if(vo.getVilleVo()!=null && this.ville)
        item.setVille(villeConverter.toItem(vo.getVilleVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;


return item;
}
}

@Override
public EtablissementVo toVo(Etablissement item) {
if (item == null) {
return null;
} else {
EtablissementVo vo = new EtablissementVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

        if(StringUtil.isNotEmpty(item.getCode()))
        vo.setCode(item.getCode());

        if(StringUtil.isNotEmpty(item.getDescription()))
        vo.setDescription(item.getDescription());

        if(StringUtil.isNotEmpty(item.getSigleOfficiel()))
        vo.setSigleOfficiel(item.getSigleOfficiel());

        if(StringUtil.isNotEmpty(item.getNomEnFrancais()))
        vo.setNomEnFrancais(item.getNomEnFrancais());

        if(StringUtil.isNotEmpty(item.getSigleEnFrancais()))
        vo.setSigleEnFrancais(item.getSigleEnFrancais());

        if(StringUtil.isNotEmpty(item.getAnciensNom()))
        vo.setAnciensNom(item.getAnciensNom());

        if(StringUtil.isNotEmpty(item.getChampIntervention()))
        vo.setChampIntervention(item.getChampIntervention());

        if(item.getValide()!=null)
        vo.setValide(item.getValide());
        if(item.getArchive()!=null)
        vo.setArchive(item.getArchive());
        if(item.getDateArchivage()!=null)
        vo.setDateArchivage(DateUtil.formateDate(item.getDateArchivage()));
        if(item.getDateCreation()!=null)
        vo.setDateCreation(DateUtil.formateDate(item.getDateCreation()));
        if(item.getAdmin()!=null)
        vo.setAdmin(item.getAdmin());
        if(item.getVisible()!=null)
        vo.setVisible(item.getVisible());
        if(StringUtil.isNotEmpty(item.getUsername()))
        vo.setUsername(item.getUsername());

    if(item.getVille()!=null && this.ville) {
        vo.setVilleVo(villeConverter.toVo(item.getVille())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    ville = value;
    pays = value;
}


        public VilleConverter getVilleConverter(){
        return this.villeConverter;
        }
        public void setVilleConverter(VilleConverter villeConverter ){
        this.villeConverter = villeConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }

    public boolean  isVille(){
    return this.ville;
    }
    public void  setVille(boolean ville){
    this.ville = ville;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }




































}
