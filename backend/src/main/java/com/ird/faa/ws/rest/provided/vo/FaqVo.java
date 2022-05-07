package  com.ird.faa.ws.rest.provided.vo;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class FaqVo {

    private String id ;
    private String question ;
    private String reponse ;
    private String contact ;
    private String ordre ;
    private Boolean archive ;
    private String lien ;
    private String dernierMisAJour ;


            private String ordreMax ;
            private String ordreMin ;
            private String dernierMisAJourMax ;
            private String dernierMisAJourMin ;

        private CategorieFaqVo categorieFaqVo ;


    public FaqVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getQuestion(){
        return this.question;
        }

        public void setQuestion(String question){
        this.question = question;
        }
        public String getReponse(){
        return this.reponse;
        }

        public void setReponse(String reponse){
        this.reponse = reponse;
        }
        public String getContact(){
        return this.contact;
        }

        public void setContact(String contact){
        this.contact = contact;
        }
        public String getOrdre(){
        return this.ordre;
        }

        public void setOrdre(String ordre){
        this.ordre = ordre;
        }
        public Boolean getArchive(){
        return this.archive;
        }

        public void setArchive(Boolean archive){
        this.archive = archive;
        }
        public String getLien(){
        return this.lien;
        }

        public void setLien(String lien){
        this.lien = lien;
        }
        public String getDernierMisAJour(){
        return this.dernierMisAJour;
        }

        public void setDernierMisAJour(String dernierMisAJour){
        this.dernierMisAJour = dernierMisAJour;
        }


            public String getOrdreMax(){
            return this.ordreMax;
            }

            public String getOrdreMin(){
            return this.ordreMin;
            }

            public void setOrdreMax(String ordreMax){
            this.ordreMax = ordreMax;
            }

            public void setOrdreMin(String ordreMin){
            this.ordreMin = ordreMin;
            }

            public String getDernierMisAJourMax(){
            return this.dernierMisAJourMax;
            }

            public String getDernierMisAJourMin(){
            return this.dernierMisAJourMin;
            }

            public void setDernierMisAJourMax(String dernierMisAJourMax){
            this.dernierMisAJourMax = dernierMisAJourMax;
            }

            public void setDernierMisAJourMin(String dernierMisAJourMin){
            this.dernierMisAJourMin = dernierMisAJourMin;
            }


        public CategorieFaqVo getCategorieFaqVo(){
        return this.categorieFaqVo;
        }

        public void setCategorieFaqVo(CategorieFaqVo categorieFaqVo){
        this.categorieFaqVo = categorieFaqVo;
        }


            }
