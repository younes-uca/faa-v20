package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CommissionScientifique;
import com.ird.faa.ws.rest.provided.vo.CommissionScientifiqueVo;

@Component
public class CommissionScientifiqueConverter extends AbstractConverter<CommissionScientifique,CommissionScientifiqueVo>{


public  CommissionScientifiqueConverter(){
init(true);
}

@Override
public CommissionScientifique toItem(CommissionScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
CommissionScientifique item = new CommissionScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelleCourt()))
        item.setLibelleCourt(vo.getLibelleCourt());
        if(StringUtil.isNotEmpty(vo.getLibelleLong()))
        item.setLibelleLong(vo.getLibelleLong());
        if(StringUtil.isNotEmpty(vo.getCode()))
        item.setCode(vo.getCode());
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


return item;
}
}

@Override
public CommissionScientifiqueVo toVo(CommissionScientifique item) {
if (item == null) {
return null;
} else {
CommissionScientifiqueVo vo = new CommissionScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelleCourt()))
        vo.setLibelleCourt(item.getLibelleCourt());

        if(StringUtil.isNotEmpty(item.getLibelleLong()))
        vo.setLibelleLong(item.getLibelleLong());

        if(StringUtil.isNotEmpty(item.getCode()))
        vo.setCode(item.getCode());

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


return vo;
}
}

public void init(Boolean value) {
}























}
