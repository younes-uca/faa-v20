package  com.ird.faa.ws.rest.provided.vo;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class NotificationVo {

    private String id ;
    private String libelle ;
    private String description ;
    private Boolean vu ;
    private String dateNotification ;
    private String dateLecture ;


            private String dateNotificationMax ;
            private String dateNotificationMin ;
            private String dateLectureMax ;
            private String dateLectureMin ;

        private ChercheurVo chercheurVo ;
        private CategorieNotificationVo categorieNotificationVo ;


    public NotificationVo(){
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
        public String getDescription(){
        return this.description;
        }

        public void setDescription(String description){
        this.description = description;
        }
        public Boolean getVu(){
        return this.vu;
        }

        public void setVu(Boolean vu){
        this.vu = vu;
        }
        public String getDateNotification(){
        return this.dateNotification;
        }

        public void setDateNotification(String dateNotification){
        this.dateNotification = dateNotification;
        }
        public String getDateLecture(){
        return this.dateLecture;
        }

        public void setDateLecture(String dateLecture){
        this.dateLecture = dateLecture;
        }


            public String getDateNotificationMax(){
            return this.dateNotificationMax;
            }

            public String getDateNotificationMin(){
            return this.dateNotificationMin;
            }

            public void setDateNotificationMax(String dateNotificationMax){
            this.dateNotificationMax = dateNotificationMax;
            }

            public void setDateNotificationMin(String dateNotificationMin){
            this.dateNotificationMin = dateNotificationMin;
            }

            public String getDateLectureMax(){
            return this.dateLectureMax;
            }

            public String getDateLectureMin(){
            return this.dateLectureMin;
            }

            public void setDateLectureMax(String dateLectureMax){
            this.dateLectureMax = dateLectureMax;
            }

            public void setDateLectureMin(String dateLectureMin){
            this.dateLectureMin = dateLectureMin;
            }


        public ChercheurVo getChercheurVo(){
        return this.chercheurVo;
        }

        public void setChercheurVo(ChercheurVo chercheurVo){
        this.chercheurVo = chercheurVo;
        }
        public CategorieNotificationVo getCategorieNotificationVo(){
        return this.categorieNotificationVo;
        }

        public void setCategorieNotificationVo(CategorieNotificationVo categorieNotificationVo){
        this.categorieNotificationVo = categorieNotificationVo;
        }


            }
