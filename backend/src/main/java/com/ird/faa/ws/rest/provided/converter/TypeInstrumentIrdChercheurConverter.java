package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.TypeInstrumentIrdChercheur;
import com.ird.faa.ws.rest.provided.vo.TypeInstrumentIrdChercheurVo;

@Component
public class TypeInstrumentIrdChercheurConverter extends AbstractConverter<TypeInstrumentIrdChercheur,TypeInstrumentIrdChercheurVo>{

        @Autowired
        private TypeInstrumentIrdConverter typeInstrumentIrdConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean typeInstrumentIrd;
    private Boolean chercheur;

public  TypeInstrumentIrdChercheurConverter(){
init(true);
}

@Override
public TypeInstrumentIrdChercheur toItem(TypeInstrumentIrdChercheurVo vo) {
if (vo == null) {
return null;
} else {
TypeInstrumentIrdChercheur item = new TypeInstrumentIrdChercheur();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getTypeInstrumentIrdVo()!=null && this.typeInstrumentIrd)
        item.setTypeInstrumentIrd(typeInstrumentIrdConverter.toItem(vo.getTypeInstrumentIrdVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;


return item;
}
}

@Override
public TypeInstrumentIrdChercheurVo toVo(TypeInstrumentIrdChercheur item) {
if (item == null) {
return null;
} else {
TypeInstrumentIrdChercheurVo vo = new TypeInstrumentIrdChercheurVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getTypeInstrumentIrd()!=null && this.typeInstrumentIrd) {
        vo.setTypeInstrumentIrdVo(typeInstrumentIrdConverter.toVo(item.getTypeInstrumentIrd())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    typeInstrumentIrd = value;
    chercheur = value;
}


        public TypeInstrumentIrdConverter getTypeInstrumentIrdConverter(){
        return this.typeInstrumentIrdConverter;
        }
        public void setTypeInstrumentIrdConverter(TypeInstrumentIrdConverter typeInstrumentIrdConverter ){
        this.typeInstrumentIrdConverter = typeInstrumentIrdConverter;
        }
        public ChercheurConverter getChercheurConverter(){
        return this.chercheurConverter;
        }
        public void setChercheurConverter(ChercheurConverter chercheurConverter ){
        this.chercheurConverter = chercheurConverter;
        }

    public boolean  isTypeInstrumentIrd(){
    return this.typeInstrumentIrd;
    }
    public void  setTypeInstrumentIrd(boolean typeInstrumentIrd){
    this.typeInstrumentIrd = typeInstrumentIrd;
    }
    public boolean  isChercheur(){
    return this.chercheur;
    }
    public void  setChercheur(boolean chercheur){
    this.chercheur = chercheur;
    }






}
