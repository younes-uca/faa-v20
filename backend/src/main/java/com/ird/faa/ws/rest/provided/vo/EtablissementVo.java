package  com.ird.faa.ws.rest.provided.vo;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class EtablissementVo {

    private String id ;
    private String libelle ;
    private String code ;
    private String description ;
    private String sigleOfficiel ;
    private String nomEnFrancais ;
    private String sigleEnFrancais ;
    private String anciensNom ;
    private String champIntervention ;
    private Boolean valide ;
    private Boolean archive ;
    private String dateArchivage ;
    private String dateCreation ;
    private Boolean admin ;
    private Boolean visible ;
    private String username ;


            private String dateArchivageMax ;
            private String dateArchivageMin ;
            private String dateCreationMax ;
            private String dateCreationMin ;

        private VilleVo villeVo ;
        private PaysVo paysVo ;


    public EtablissementVo(){
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
        public String getDescription(){
        return this.description;
        }

        public void setDescription(String description){
        this.description = description;
        }
        public String getSigleOfficiel(){
        return this.sigleOfficiel;
        }

        public void setSigleOfficiel(String sigleOfficiel){
        this.sigleOfficiel = sigleOfficiel;
        }
        public String getNomEnFrancais(){
        return this.nomEnFrancais;
        }

        public void setNomEnFrancais(String nomEnFrancais){
        this.nomEnFrancais = nomEnFrancais;
        }
        public String getSigleEnFrancais(){
        return this.sigleEnFrancais;
        }

        public void setSigleEnFrancais(String sigleEnFrancais){
        this.sigleEnFrancais = sigleEnFrancais;
        }
        public String getAnciensNom(){
        return this.anciensNom;
        }

        public void setAnciensNom(String anciensNom){
        this.anciensNom = anciensNom;
        }
        public String getChampIntervention(){
        return this.champIntervention;
        }

        public void setChampIntervention(String champIntervention){
        this.champIntervention = champIntervention;
        }
        public Boolean getValide(){
        return this.valide;
        }

        public void setValide(Boolean valide){
        this.valide = valide;
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


        public VilleVo getVilleVo(){
        return this.villeVo;
        }

        public void setVilleVo(VilleVo villeVo){
        this.villeVo = villeVo;
        }
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }


            }
