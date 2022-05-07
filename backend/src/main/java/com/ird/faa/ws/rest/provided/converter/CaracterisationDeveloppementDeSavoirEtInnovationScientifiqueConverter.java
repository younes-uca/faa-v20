package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CaracterisationDeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.ws.rest.provided.vo.CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo;

@Component
public class CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueConverter extends AbstractConverter<CaracterisationDeveloppementDeSavoirEtInnovationScientifique,CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo>{

        @Autowired
        private CaracterisationConverter caracterisationConverter ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ;
    private Boolean caracterisation;
    private Boolean developpementDeSavoirEtInnovationScientifique;

public  CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueConverter(){
init(true);
}

@Override
public CaracterisationDeveloppementDeSavoirEtInnovationScientifique toItem(CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
CaracterisationDeveloppementDeSavoirEtInnovationScientifique item = new CaracterisationDeveloppementDeSavoirEtInnovationScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getCaracterisationVo()!=null && this.caracterisation)
        item.setCaracterisation(caracterisationConverter.toItem(vo.getCaracterisationVo())) ;
    if(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo()!=null && this.developpementDeSavoirEtInnovationScientifique)
        item.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifiqueConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo())) ;


return item;
}
}

@Override
public CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo toVo(CaracterisationDeveloppementDeSavoirEtInnovationScientifique item) {
if (item == null) {
return null;
} else {
CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo vo = new CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getCaracterisation()!=null && this.caracterisation) {
        vo.setCaracterisationVo(caracterisationConverter.toVo(item.getCaracterisation())) ;
    }
    if(item.getDeveloppementDeSavoirEtInnovationScientifique()!=null && this.developpementDeSavoirEtInnovationScientifique) {
        vo.setDeveloppementDeSavoirEtInnovationScientifiqueVo(developpementDeSavoirEtInnovationScientifiqueConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    caracterisation = value;
    developpementDeSavoirEtInnovationScientifique = value;
}


        public CaracterisationConverter getCaracterisationConverter(){
        return this.caracterisationConverter;
        }
        public void setCaracterisationConverter(CaracterisationConverter caracterisationConverter ){
        this.caracterisationConverter = caracterisationConverter;
        }
        public DeveloppementDeSavoirEtInnovationScientifiqueConverter getDeveloppementDeSavoirEtInnovationScientifiqueConverter(){
        return this.developpementDeSavoirEtInnovationScientifiqueConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiqueConverter(DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ){
        this.developpementDeSavoirEtInnovationScientifiqueConverter = developpementDeSavoirEtInnovationScientifiqueConverter;
        }

    public boolean  isCaracterisation(){
    return this.caracterisation;
    }
    public void  setCaracterisation(boolean caracterisation){
    this.caracterisation = caracterisation;
    }
    public boolean  isDeveloppementDeSavoirEtInnovationScientifique(){
    return this.developpementDeSavoirEtInnovationScientifique;
    }
    public void  setDeveloppementDeSavoirEtInnovationScientifique(boolean developpementDeSavoirEtInnovationScientifique){
    this.developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifique;
    }






}
