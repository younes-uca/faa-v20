package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.FormationContinueCommanditaire;
import com.ird.faa.ws.rest.provided.vo.FormationContinueCommanditaireVo;

@Component
public class FormationContinueCommanditaireConverter extends AbstractConverter<FormationContinueCommanditaire,FormationContinueCommanditaireVo>{

        @Autowired
        private CommanditaireConverter commanditaireConverter ;
        @Autowired
        private FormationContinueConverter formationContinueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean commanditaire;
    private Boolean formationContinue;
    private Boolean pays;

public  FormationContinueCommanditaireConverter(){
init(true);
}

@Override
public FormationContinueCommanditaire toItem(FormationContinueCommanditaireVo vo) {
if (vo == null) {
return null;
} else {
FormationContinueCommanditaire item = new FormationContinueCommanditaire();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getCommanditaireVo()!=null && this.commanditaire)
        item.setCommanditaire(commanditaireConverter.toItem(vo.getCommanditaireVo())) ;
    if(vo.getFormationContinueVo()!=null && this.formationContinue)
        item.setFormationContinue(formationContinueConverter.toItem(vo.getFormationContinueVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;


return item;
}
}

@Override
public FormationContinueCommanditaireVo toVo(FormationContinueCommanditaire item) {
if (item == null) {
return null;
} else {
FormationContinueCommanditaireVo vo = new FormationContinueCommanditaireVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getCommanditaire()!=null && this.commanditaire) {
        vo.setCommanditaireVo(commanditaireConverter.toVo(item.getCommanditaire())) ;
    }
    if(item.getFormationContinue()!=null && this.formationContinue) {
        vo.setFormationContinueVo(formationContinueConverter.toVo(item.getFormationContinue())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    commanditaire = value;
    formationContinue = value;
    pays = value;
}


        public CommanditaireConverter getCommanditaireConverter(){
        return this.commanditaireConverter;
        }
        public void setCommanditaireConverter(CommanditaireConverter commanditaireConverter ){
        this.commanditaireConverter = commanditaireConverter;
        }
        public FormationContinueConverter getFormationContinueConverter(){
        return this.formationContinueConverter;
        }
        public void setFormationContinueConverter(FormationContinueConverter formationContinueConverter ){
        this.formationContinueConverter = formationContinueConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }

    public boolean  isCommanditaire(){
    return this.commanditaire;
    }
    public void  setCommanditaire(boolean commanditaire){
    this.commanditaire = commanditaire;
    }
    public boolean  isFormationContinue(){
    return this.formationContinue;
    }
    public void  setFormationContinue(boolean formationContinue){
    this.formationContinue = formationContinue;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }








}
