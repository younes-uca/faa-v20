package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class CampagneVo {

    private String id ;
    private String libelle ;
    private String code ;
    private String annee ;
    private String dateDepart ;
    private String dateFin ;
    private String objetOuverture ;
    private String messageOuverture ;
    private String objetCloture ;
    private String messageCloture ;


            private String anneeMax ;
            private String anneeMin ;
            private String dateDepartMax ;
            private String dateDepartMin ;
            private String dateFinMax ;
            private String dateFinMin ;

        private EtatCampagneVo etatCampagneVo ;
        private TemplateOuvertureVo templateOuvertureVo ;
        private TemplateClotureVo templateClotureVo ;

    private List<CampagneChercheurOuvertureVo> campagneChercheurOuverturesVo ;
    private List<CampagneChercheurFermetureVo> campagneChercheurFermeturesVo ;
    private List<CampagneRelanceVo> campagneRelancesVo ;
    private List<CampagneRappelVo> campagneRappelsVo ;
    private List<DistinctionVo> distinctionsVo ;
    private List<ProjetActiviteRechercheVo> projetActiviteRecherchesVo ;
    private List<InstrumentsEtDispositifsIrdVo> instrumentsEtDispositifsIrdsVo ;
    private List<GestionEquipeVo> gestionEquipesVo ;

    public CampagneVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getLibelle(){
        return this.libelle;
        }

        public void setLibelle(String libelle){
        this.libelle = libelle;
        }
        public String getCode(){
        return this.code;
        }

        public void setCode(String code){
        this.code = code;
        }
        public String getAnnee(){
        return this.annee;
        }

        public void setAnnee(String annee){
        this.annee = annee;
        }
        public String getDateDepart(){
        return this.dateDepart;
        }

        public void setDateDepart(String dateDepart){
        this.dateDepart = dateDepart;
        }
        public String getDateFin(){
        return this.dateFin;
        }

        public void setDateFin(String dateFin){
        this.dateFin = dateFin;
        }
        public String getObjetOuverture(){
        return this.objetOuverture;
        }

        public void setObjetOuverture(String objetOuverture){
        this.objetOuverture = objetOuverture;
        }
        public String getMessageOuverture(){
        return this.messageOuverture;
        }

        public void setMessageOuverture(String messageOuverture){
        this.messageOuverture = messageOuverture;
        }
        public String getObjetCloture(){
        return this.objetCloture;
        }

        public void setObjetCloture(String objetCloture){
        this.objetCloture = objetCloture;
        }
        public String getMessageCloture(){
        return this.messageCloture;
        }

        public void setMessageCloture(String messageCloture){
        this.messageCloture = messageCloture;
        }


            public String getAnneeMax(){
            return this.anneeMax;
            }

            public String getAnneeMin(){
            return this.anneeMin;
            }

            public void setAnneeMax(String anneeMax){
            this.anneeMax = anneeMax;
            }

            public void setAnneeMin(String anneeMin){
            this.anneeMin = anneeMin;
            }

            public String getDateDepartMax(){
            return this.dateDepartMax;
            }

            public String getDateDepartMin(){
            return this.dateDepartMin;
            }

            public void setDateDepartMax(String dateDepartMax){
            this.dateDepartMax = dateDepartMax;
            }

            public void setDateDepartMin(String dateDepartMin){
            this.dateDepartMin = dateDepartMin;
            }

            public String getDateFinMax(){
            return this.dateFinMax;
            }

            public String getDateFinMin(){
            return this.dateFinMin;
            }

            public void setDateFinMax(String dateFinMax){
            this.dateFinMax = dateFinMax;
            }

            public void setDateFinMin(String dateFinMin){
            this.dateFinMin = dateFinMin;
            }


        public EtatCampagneVo getEtatCampagneVo(){
        return this.etatCampagneVo;
        }

        public void setEtatCampagneVo(EtatCampagneVo etatCampagneVo){
        this.etatCampagneVo = etatCampagneVo;
        }
        public TemplateOuvertureVo getTemplateOuvertureVo(){
        return this.templateOuvertureVo;
        }

        public void setTemplateOuvertureVo(TemplateOuvertureVo templateOuvertureVo){
        this.templateOuvertureVo = templateOuvertureVo;
        }
        public TemplateClotureVo getTemplateClotureVo(){
        return this.templateClotureVo;
        }

        public void setTemplateClotureVo(TemplateClotureVo templateClotureVo){
        this.templateClotureVo = templateClotureVo;
        }


        public List<CampagneChercheurOuvertureVo> getCampagneChercheurOuverturesVo(){
        return this.campagneChercheurOuverturesVo;
        }

        public void setCampagneChercheurOuverturesVo(List<CampagneChercheurOuvertureVo> campagneChercheurOuverturesVo){
            this.campagneChercheurOuverturesVo = campagneChercheurOuverturesVo;
            }

        public List<CampagneChercheurFermetureVo> getCampagneChercheurFermeturesVo(){
        return this.campagneChercheurFermeturesVo;
        }

        public void setCampagneChercheurFermeturesVo(List<CampagneChercheurFermetureVo> campagneChercheurFermeturesVo){
            this.campagneChercheurFermeturesVo = campagneChercheurFermeturesVo;
            }

        public List<CampagneRelanceVo> getCampagneRelancesVo(){
        return this.campagneRelancesVo;
        }

        public void setCampagneRelancesVo(List<CampagneRelanceVo> campagneRelancesVo){
            this.campagneRelancesVo = campagneRelancesVo;
            }

        public List<CampagneRappelVo> getCampagneRappelsVo(){
        return this.campagneRappelsVo;
        }

        public void setCampagneRappelsVo(List<CampagneRappelVo> campagneRappelsVo){
            this.campagneRappelsVo = campagneRappelsVo;
            }

        public List<DistinctionVo> getDistinctionsVo(){
        return this.distinctionsVo;
        }

        public void setDistinctionsVo(List<DistinctionVo> distinctionsVo){
            this.distinctionsVo = distinctionsVo;
            }

        public List<ProjetActiviteRechercheVo> getProjetActiviteRecherchesVo(){
        return this.projetActiviteRecherchesVo;
        }

        public void setProjetActiviteRecherchesVo(List<ProjetActiviteRechercheVo> projetActiviteRecherchesVo){
            this.projetActiviteRecherchesVo = projetActiviteRecherchesVo;
            }

        public List<InstrumentsEtDispositifsIrdVo> getInstrumentsEtDispositifsIrdsVo(){
        return this.instrumentsEtDispositifsIrdsVo;
        }

        public void setInstrumentsEtDispositifsIrdsVo(List<InstrumentsEtDispositifsIrdVo> instrumentsEtDispositifsIrdsVo){
            this.instrumentsEtDispositifsIrdsVo = instrumentsEtDispositifsIrdsVo;
            }

        public List<GestionEquipeVo> getGestionEquipesVo(){
        return this.gestionEquipesVo;
        }

        public void setGestionEquipesVo(List<GestionEquipeVo> gestionEquipesVo){
            this.gestionEquipesVo = gestionEquipesVo;
            }

            }
