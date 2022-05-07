package  com.ird.faa.ws.rest.provided.vo;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class ReclamationVo {

    private String id ;
    private String objet ;
    private String message ;
    private String dateReclamation ;
    private String dateTraitement ;


            private String dateReclamationMax ;
            private String dateReclamationMin ;
            private String dateTraitementMax ;
            private String dateTraitementMin ;

        private EtatReclamationVo etatReclamationVo ;
        private TypeReclamationVo typeReclamationVo ;
        private ChercheurVo chercheurVo ;


    public ReclamationVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getObjet(){
        return this.objet;
        }

        public void setObjet(String objet){
        this.objet = objet;
        }
        public String getMessage(){
        return this.message;
        }

        public void setMessage(String message){
        this.message = message;
        }
        public String getDateReclamation(){
        return this.dateReclamation;
        }

        public void setDateReclamation(String dateReclamation){
        this.dateReclamation = dateReclamation;
        }
        public String getDateTraitement(){
        return this.dateTraitement;
        }

        public void setDateTraitement(String dateTraitement){
        this.dateTraitement = dateTraitement;
        }


            public String getDateReclamationMax(){
            return this.dateReclamationMax;
            }

            public String getDateReclamationMin(){
            return this.dateReclamationMin;
            }

            public void setDateReclamationMax(String dateReclamationMax){
            this.dateReclamationMax = dateReclamationMax;
            }

            public void setDateReclamationMin(String dateReclamationMin){
            this.dateReclamationMin = dateReclamationMin;
            }

            public String getDateTraitementMax(){
            return this.dateTraitementMax;
            }

            public String getDateTraitementMin(){
            return this.dateTraitementMin;
            }

            public void setDateTraitementMax(String dateTraitementMax){
            this.dateTraitementMax = dateTraitementMax;
            }

            public void setDateTraitementMin(String dateTraitementMin){
            this.dateTraitementMin = dateTraitementMin;
            }


        public EtatReclamationVo getEtatReclamationVo(){
        return this.etatReclamationVo;
        }

        public void setEtatReclamationVo(EtatReclamationVo etatReclamationVo){
        this.etatReclamationVo = etatReclamationVo;
        }
        public TypeReclamationVo getTypeReclamationVo(){
        return this.typeReclamationVo;
        }

        public void setTypeReclamationVo(TypeReclamationVo typeReclamationVo){
        this.typeReclamationVo = typeReclamationVo;
        }
        public ChercheurVo getChercheurVo(){
        return this.chercheurVo;
        }

        public void setChercheurVo(ChercheurVo chercheurVo){
        this.chercheurVo = chercheurVo;
        }


            }
