package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.GestionEquipeDetail;
import com.ird.faa.ws.rest.provided.vo.GestionEquipeDetailVo;

@Component
public class GestionEquipeDetailConverter extends AbstractConverter<GestionEquipeDetail,GestionEquipeDetailVo>{

        @Autowired
        private GestionEquipeConverter gestionEquipeConverter ;
    private Boolean gestionEquipe;

public  GestionEquipeDetailConverter(){
init(true);
}

@Override
public GestionEquipeDetail toItem(GestionEquipeDetailVo vo) {
if (vo == null) {
return null;
} else {
GestionEquipeDetail item = new GestionEquipeDetail();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getNombrePersonneEncadre()))
        item.setNombrePersonneEncadre(NumberUtil.toInt(vo.getNombrePersonneEncadre()));
        if(StringUtil.isNotEmpty(vo.getNombrePersonneHorsIrd()))
        item.setNombrePersonneHorsIrd(NumberUtil.toInt(vo.getNombrePersonneHorsIrd()));
        if(StringUtil.isNotEmpty(vo.getNombrePersonneSousConventions()))
        item.setNombrePersonneSousConventions(NumberUtil.toInt(vo.getNombrePersonneSousConventions()));
            if(vo.getFormationManagement() != null)
            item.setFormationManagement(vo.getFormationManagement());
    if(vo.getGestionEquipeVo()!=null && this.gestionEquipe)
        item.setGestionEquipe(gestionEquipeConverter.toItem(vo.getGestionEquipeVo())) ;


return item;
}
}

@Override
public GestionEquipeDetailVo toVo(GestionEquipeDetail item) {
if (item == null) {
return null;
} else {
GestionEquipeDetailVo vo = new GestionEquipeDetailVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getNombrePersonneEncadre()!=null)
        vo.setNombrePersonneEncadre(NumberUtil.toString(item.getNombrePersonneEncadre()));

        if(item.getNombrePersonneHorsIrd()!=null)
        vo.setNombrePersonneHorsIrd(NumberUtil.toString(item.getNombrePersonneHorsIrd()));

        if(item.getNombrePersonneSousConventions()!=null)
        vo.setNombrePersonneSousConventions(NumberUtil.toString(item.getNombrePersonneSousConventions()));

        if(item.getFormationManagement()!=null)
        vo.setFormationManagement(item.getFormationManagement());
    if(item.getGestionEquipe()!=null && this.gestionEquipe) {
        vo.setGestionEquipeVo(gestionEquipeConverter.toVo(item.getGestionEquipe())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    gestionEquipe = value;
}


        public GestionEquipeConverter getGestionEquipeConverter(){
        return this.gestionEquipeConverter;
        }
        public void setGestionEquipeConverter(GestionEquipeConverter gestionEquipeConverter ){
        this.gestionEquipeConverter = gestionEquipeConverter;
        }

    public boolean  isGestionEquipe(){
    return this.gestionEquipe;
    }
    public void  setGestionEquipe(boolean gestionEquipe){
    this.gestionEquipe = gestionEquipe;
    }












}
