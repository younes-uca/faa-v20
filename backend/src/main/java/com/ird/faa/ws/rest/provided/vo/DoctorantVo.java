package  com.ird.faa.ws.rest.provided.vo;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class DoctorantVo {

    private String id ;
    private String nom ;
    private String prenom ;
    private String civilite ;
    private String anneeNaissance ;
    private Boolean archive ;
    private String dateArchivage ;
    private String dateCreation ;
    private Boolean admin ;
    private Boolean visible ;
    private String username ;


            private String anneeNaissanceMax ;
            private String anneeNaissanceMin ;
            private String dateArchivageMax ;
            private String dateArchivageMin ;
            private String dateCreationMax ;
            private String dateCreationMin ;

        private SexeVo sexeVo ;
        private PaysVo paysVo ;


    public DoctorantVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getNom(){
        return this.nom;
        }

        public void setNom(String nom){
        this.nom = nom;
        }
        public String getPrenom(){
        return this.prenom;
        }

        public void setPrenom(String prenom){
        this.prenom = prenom;
        }
        public String getCivilite(){
        return this.civilite;
        }

        public void setCivilite(String civilite){
        this.civilite = civilite;
        }
        public String getAnneeNaissance(){
        return this.anneeNaissance;
        }

        public void setAnneeNaissance(String anneeNaissance){
        this.anneeNaissance = anneeNaissance;
        }
        public Boolean getArchive(){
        return this.archive;
        }

        public void setArchive(Boolean archive){
        this.archive = archive;
        }
        public String getDateArchivage(){
        return this.dateArchivage;
        }

        public void setDateArchivage(String dateArchivage){
        this.dateArchivage = dateArchivage;
        }
        public String getDateCreation(){
        return this.dateCreation;
        }

        public void setDateCreation(String dateCreation){
        this.dateCreation = dateCreation;
        }
        public Boolean getAdmin(){
        return this.admin;
        }

        public void setAdmin(Boolean admin){
        this.admin = admin;
        }
        public Boolean getVisible(){
        return this.visible;
        }

        public void setVisible(Boolean visible){
        this.visible = visible;
        }
        public String getUsername(){
        return this.username;
        }

        public void setUsername(String username){
        this.username = username;
        }


            public String getAnneeNaissanceMax(){
            return this.anneeNaissanceMax;
            }

            public String getAnneeNaissanceMin(){
            return this.anneeNaissanceMin;
            }

            public void setAnneeNaissanceMax(String anneeNaissanceMax){
            this.anneeNaissanceMax = anneeNaissanceMax;
            }

            public void setAnneeNaissanceMin(String anneeNaissanceMin){
            this.anneeNaissanceMin = anneeNaissanceMin;
            }

            public String getDateArchivageMax(){
            return this.dateArchivageMax;
            }

            public String getDateArchivageMin(){
            return this.dateArchivageMin;
            }

            public void setDateArchivageMax(String dateArchivageMax){
            this.dateArchivageMax = dateArchivageMax;
            }

            public void setDateArchivageMin(String dateArchivageMin){
            this.dateArchivageMin = dateArchivageMin;
            }

            public String getDateCreationMax(){
            return this.dateCreationMax;
            }

            public String getDateCreationMin(){
            return this.dateCreationMin;
            }

            public void setDateCreationMax(String dateCreationMax){
            this.dateCreationMax = dateCreationMax;
            }

            public void setDateCreationMin(String dateCreationMin){
            this.dateCreationMin = dateCreationMin;
            }


        public SexeVo getSexeVo(){
        return this.sexeVo;
        }

        public void setSexeVo(SexeVo sexeVo){
        this.sexeVo = sexeVo;
        }
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }


            }
