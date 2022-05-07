package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.PaysRencontreMedia;
import com.ird.faa.ws.rest.provided.vo.PaysRencontreMediaVo;

@Component
public class PaysRencontreMediaConverter extends AbstractConverter<PaysRencontreMedia,PaysRencontreMediaVo>{

        @Autowired
        private RencontreMediaConverter rencontreMediaConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean pays;
    private Boolean rencontreMedia;

public  PaysRencontreMediaConverter(){
init(true);
}

@Override
public PaysRencontreMedia toItem(PaysRencontreMediaVo vo) {
if (vo == null) {
return null;
} else {
PaysRencontreMedia item = new PaysRencontreMedia();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getRencontreMediaVo()!=null && this.rencontreMedia)
        item.setRencontreMedia(rencontreMediaConverter.toItem(vo.getRencontreMediaVo())) ;


return item;
}
}

@Override
public PaysRencontreMediaVo toVo(PaysRencontreMedia item) {
if (item == null) {
return null;
} else {
PaysRencontreMediaVo vo = new PaysRencontreMediaVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getRencontreMedia()!=null && this.rencontreMedia) {
        vo.setRencontreMediaVo(rencontreMediaConverter.toVo(item.getRencontreMedia())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    pays = value;
    rencontreMedia = value;
}


        public RencontreMediaConverter getRencontreMediaConverter(){
        return this.rencontreMediaConverter;
        }
        public void setRencontreMediaConverter(RencontreMediaConverter rencontreMediaConverter ){
        this.rencontreMediaConverter = rencontreMediaConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }

    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }
    public boolean  isRencontreMedia(){
    return this.rencontreMedia;
    }
    public void  setRencontreMedia(boolean rencontreMedia){
    this.rencontreMedia = rencontreMedia;
    }






}
