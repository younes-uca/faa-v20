package  com.ird.faa.ws.rest.provided.vo;


public class GestionEquipeDetailVo {

    private String id ;
    private String nombrePersonneEncadre ;
    private String nombrePersonneHorsIrd ;
    private String nombrePersonneSousConventions ;
    private Boolean formationManagement ;


            private String nombrePersonneEncadreMax ;
            private String nombrePersonneEncadreMin ;
            private String nombrePersonneHorsIrdMax ;
            private String nombrePersonneHorsIrdMin ;
            private String nombrePersonneSousConventionsMax ;
            private String nombrePersonneSousConventionsMin ;

        private GestionEquipeVo gestionEquipeVo ;


    public GestionEquipeDetailVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getNombrePersonneEncadre(){
        return this.nombrePersonneEncadre;
        }

        public void setNombrePersonneEncadre(String nombrePersonneEncadre){
        this.nombrePersonneEncadre = nombrePersonneEncadre;
        }
        public String getNombrePersonneHorsIrd(){
        return this.nombrePersonneHorsIrd;
        }

        public void setNombrePersonneHorsIrd(String nombrePersonneHorsIrd){
        this.nombrePersonneHorsIrd = nombrePersonneHorsIrd;
        }
        public String getNombrePersonneSousConventions(){
        return this.nombrePersonneSousConventions;
        }

        public void setNombrePersonneSousConventions(String nombrePersonneSousConventions){
        this.nombrePersonneSousConventions = nombrePersonneSousConventions;
        }
        public Boolean getFormationManagement(){
        return this.formationManagement;
        }

        public void setFormationManagement(Boolean formationManagement){
        this.formationManagement = formationManagement;
        }


            public String getNombrePersonneEncadreMax(){
            return this.nombrePersonneEncadreMax;
            }

            public String getNombrePersonneEncadreMin(){
            return this.nombrePersonneEncadreMin;
            }

            public void setNombrePersonneEncadreMax(String nombrePersonneEncadreMax){
            this.nombrePersonneEncadreMax = nombrePersonneEncadreMax;
            }

            public void setNombrePersonneEncadreMin(String nombrePersonneEncadreMin){
            this.nombrePersonneEncadreMin = nombrePersonneEncadreMin;
            }

            public String getNombrePersonneHorsIrdMax(){
            return this.nombrePersonneHorsIrdMax;
            }

            public String getNombrePersonneHorsIrdMin(){
            return this.nombrePersonneHorsIrdMin;
            }

            public void setNombrePersonneHorsIrdMax(String nombrePersonneHorsIrdMax){
            this.nombrePersonneHorsIrdMax = nombrePersonneHorsIrdMax;
            }

            public void setNombrePersonneHorsIrdMin(String nombrePersonneHorsIrdMin){
            this.nombrePersonneHorsIrdMin = nombrePersonneHorsIrdMin;
            }

            public String getNombrePersonneSousConventionsMax(){
            return this.nombrePersonneSousConventionsMax;
            }

            public String getNombrePersonneSousConventionsMin(){
            return this.nombrePersonneSousConventionsMin;
            }

            public void setNombrePersonneSousConventionsMax(String nombrePersonneSousConventionsMax){
            this.nombrePersonneSousConventionsMax = nombrePersonneSousConventionsMax;
            }

            public void setNombrePersonneSousConventionsMin(String nombrePersonneSousConventionsMin){
            this.nombrePersonneSousConventionsMin = nombrePersonneSousConventionsMin;
            }


        public GestionEquipeVo getGestionEquipeVo(){
        return this.gestionEquipeVo;
        }

        public void setGestionEquipeVo(GestionEquipeVo gestionEquipeVo){
        this.gestionEquipeVo = gestionEquipeVo;
        }


            }
