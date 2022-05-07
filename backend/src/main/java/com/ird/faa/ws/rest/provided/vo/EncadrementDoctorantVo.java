package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class EncadrementDoctorantVo {

    private String id ;
    private Boolean codirectionInternationale ;
    private Boolean cursus ;
    private String sujetThese ;
    private String dateDebutThese ;
    private String datePrevuSoutenanceThese ;
    private String intituleEcoleDoctorale ;


            private String dateDebutTheseMax ;
            private String dateDebutTheseMin ;
            private String datePrevuSoutenanceTheseMax ;
            private String datePrevuSoutenanceTheseMin ;

        private ResponsabiliteEncadrementDoctorantVo responsabiliteEncadrementDoctorantVo ;
        private FinancementDoctorantVo financementDoctorantVo ;
        private EtablissementVo etablissementVo ;
        private PaysVo paysVo ;
        private DoctorantVo doctorantVo ;
        private EncadrementVo encadrementVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<EnjeuxIrdEncadrementDoctorantVo> enjeuxIrdEncadrementDoctorantsVo ;
    private List<DisciplineScientifiqueEncadrementDoctorantVo> disciplineScientifiqueEncadrementDoctorantsVo ;
    private List<CommunauteSavoirEncadrementDoctorantVo> communauteSavoirEncadrementDoctorantsVo ;

    public EncadrementDoctorantVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public Boolean getCodirectionInternationale(){
        return this.codirectionInternationale;
        }

        public void setCodirectionInternationale(Boolean codirectionInternationale){
        this.codirectionInternationale = codirectionInternationale;
        }
        public Boolean getCursus(){
        return this.cursus;
        }

        public void setCursus(Boolean cursus){
        this.cursus = cursus;
        }
        public String getSujetThese(){
        return this.sujetThese;
        }

        public void setSujetThese(String sujetThese){
        this.sujetThese = sujetThese;
        }
        public String getDateDebutThese(){
        return this.dateDebutThese;
        }

        public void setDateDebutThese(String dateDebutThese){
        this.dateDebutThese = dateDebutThese;
        }
        public String getDatePrevuSoutenanceThese(){
        return this.datePrevuSoutenanceThese;
        }

        public void setDatePrevuSoutenanceThese(String datePrevuSoutenanceThese){
        this.datePrevuSoutenanceThese = datePrevuSoutenanceThese;
        }
        public String getIntituleEcoleDoctorale(){
        return this.intituleEcoleDoctorale;
        }

        public void setIntituleEcoleDoctorale(String intituleEcoleDoctorale){
        this.intituleEcoleDoctorale = intituleEcoleDoctorale;
        }


            public String getDateDebutTheseMax(){
            return this.dateDebutTheseMax;
            }

            public String getDateDebutTheseMin(){
            return this.dateDebutTheseMin;
            }

            public void setDateDebutTheseMax(String dateDebutTheseMax){
            this.dateDebutTheseMax = dateDebutTheseMax;
            }

            public void setDateDebutTheseMin(String dateDebutTheseMin){
            this.dateDebutTheseMin = dateDebutTheseMin;
            }

            public String getDatePrevuSoutenanceTheseMax(){
            return this.datePrevuSoutenanceTheseMax;
            }

            public String getDatePrevuSoutenanceTheseMin(){
            return this.datePrevuSoutenanceTheseMin;
            }

            public void setDatePrevuSoutenanceTheseMax(String datePrevuSoutenanceTheseMax){
            this.datePrevuSoutenanceTheseMax = datePrevuSoutenanceTheseMax;
            }

            public void setDatePrevuSoutenanceTheseMin(String datePrevuSoutenanceTheseMin){
            this.datePrevuSoutenanceTheseMin = datePrevuSoutenanceTheseMin;
            }


        public ResponsabiliteEncadrementDoctorantVo getResponsabiliteEncadrementDoctorantVo(){
        return this.responsabiliteEncadrementDoctorantVo;
        }

        public void setResponsabiliteEncadrementDoctorantVo(ResponsabiliteEncadrementDoctorantVo responsabiliteEncadrementDoctorantVo){
        this.responsabiliteEncadrementDoctorantVo = responsabiliteEncadrementDoctorantVo;
        }
        public FinancementDoctorantVo getFinancementDoctorantVo(){
        return this.financementDoctorantVo;
        }

        public void setFinancementDoctorantVo(FinancementDoctorantVo financementDoctorantVo){
        this.financementDoctorantVo = financementDoctorantVo;
        }
        public EtablissementVo getEtablissementVo(){
        return this.etablissementVo;
        }

        public void setEtablissementVo(EtablissementVo etablissementVo){
        this.etablissementVo = etablissementVo;
        }
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }
        public DoctorantVo getDoctorantVo(){
        return this.doctorantVo;
        }

        public void setDoctorantVo(DoctorantVo doctorantVo){
        this.doctorantVo = doctorantVo;
        }
        public EncadrementVo getEncadrementVo(){
        return this.encadrementVo;
        }

        public void setEncadrementVo(EncadrementVo encadrementVo){
        this.encadrementVo = encadrementVo;
        }
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }


        public List<EnjeuxIrdEncadrementDoctorantVo> getEnjeuxIrdEncadrementDoctorantsVo(){
        return this.enjeuxIrdEncadrementDoctorantsVo;
        }

        public void setEnjeuxIrdEncadrementDoctorantsVo(List<EnjeuxIrdEncadrementDoctorantVo> enjeuxIrdEncadrementDoctorantsVo){
            this.enjeuxIrdEncadrementDoctorantsVo = enjeuxIrdEncadrementDoctorantsVo;
            }

        public List<DisciplineScientifiqueEncadrementDoctorantVo> getDisciplineScientifiqueEncadrementDoctorantsVo(){
        return this.disciplineScientifiqueEncadrementDoctorantsVo;
        }

        public void setDisciplineScientifiqueEncadrementDoctorantsVo(List<DisciplineScientifiqueEncadrementDoctorantVo> disciplineScientifiqueEncadrementDoctorantsVo){
            this.disciplineScientifiqueEncadrementDoctorantsVo = disciplineScientifiqueEncadrementDoctorantsVo;
            }

        public List<CommunauteSavoirEncadrementDoctorantVo> getCommunauteSavoirEncadrementDoctorantsVo(){
        return this.communauteSavoirEncadrementDoctorantsVo;
        }

        public void setCommunauteSavoirEncadrementDoctorantsVo(List<CommunauteSavoirEncadrementDoctorantVo> communauteSavoirEncadrementDoctorantsVo){
            this.communauteSavoirEncadrementDoctorantsVo = communauteSavoirEncadrementDoctorantsVo;
            }

            }
