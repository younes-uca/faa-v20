package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;

public class DeveloppementDeSavoirEtInnovationScientifiqueVo {

    private String id ;
    private String titreInstrument ;
    private String anneeMiseEnOeuvre ;
    private String lienWeb ;


            private String anneeMiseEnOeuvreMax ;
            private String anneeMiseEnOeuvreMin ;

        private RoleDeveloppementDeSavoirVo roleDeveloppementDeSavoirVo ;
        private SavoirEtInnovationVo savoirEtInnovationVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo> typeSavoirDeveloppementDeSavoirEtInnovationScientifiquesVo ;
    private List<TypeUtilisateurSavoirConcuVo> typeUtilisateurSavoirConcusVo ;
    private List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo> developpementDeSavoirEtInnovationScientifiqueModeDiffusionsVo ;
    private List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo> developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdsVo ;
    private List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo> developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiquesVo ;
    private List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo> developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirsVo ;
    private List<DeveloppementDeSavoirEtInnovationScientifiquePaysVo> developpementDeSavoirEtInnovationScientifiquePayssVo ;
    private List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo> developpementDeSavoirEtInnovationScientifiqueEtablissementsVo ;

    public DeveloppementDeSavoirEtInnovationScientifiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getTitreInstrument(){
        return this.titreInstrument;
        }

        public void setTitreInstrument(String titreInstrument){
        this.titreInstrument = titreInstrument;
        }
        public String getAnneeMiseEnOeuvre(){
        return this.anneeMiseEnOeuvre;
        }

        public void setAnneeMiseEnOeuvre(String anneeMiseEnOeuvre){
        this.anneeMiseEnOeuvre = anneeMiseEnOeuvre;
        }
        public String getLienWeb(){
        return this.lienWeb;
        }

        public void setLienWeb(String lienWeb){
        this.lienWeb = lienWeb;
        }


            public String getAnneeMiseEnOeuvreMax(){
            return this.anneeMiseEnOeuvreMax;
            }

            public String getAnneeMiseEnOeuvreMin(){
            return this.anneeMiseEnOeuvreMin;
            }

            public void setAnneeMiseEnOeuvreMax(String anneeMiseEnOeuvreMax){
            this.anneeMiseEnOeuvreMax = anneeMiseEnOeuvreMax;
            }

            public void setAnneeMiseEnOeuvreMin(String anneeMiseEnOeuvreMin){
            this.anneeMiseEnOeuvreMin = anneeMiseEnOeuvreMin;
            }


        public RoleDeveloppementDeSavoirVo getRoleDeveloppementDeSavoirVo(){
        return this.roleDeveloppementDeSavoirVo;
        }

        public void setRoleDeveloppementDeSavoirVo(RoleDeveloppementDeSavoirVo roleDeveloppementDeSavoirVo){
        this.roleDeveloppementDeSavoirVo = roleDeveloppementDeSavoirVo;
        }
        public SavoirEtInnovationVo getSavoirEtInnovationVo(){
        return this.savoirEtInnovationVo;
        }

        public void setSavoirEtInnovationVo(SavoirEtInnovationVo savoirEtInnovationVo){
        this.savoirEtInnovationVo = savoirEtInnovationVo;
        }
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }


        public List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo> getTypeSavoirDeveloppementDeSavoirEtInnovationScientifiquesVo(){
        return this.typeSavoirDeveloppementDeSavoirEtInnovationScientifiquesVo;
        }

        public void setTypeSavoirDeveloppementDeSavoirEtInnovationScientifiquesVo(List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo> typeSavoirDeveloppementDeSavoirEtInnovationScientifiquesVo){
            this.typeSavoirDeveloppementDeSavoirEtInnovationScientifiquesVo = typeSavoirDeveloppementDeSavoirEtInnovationScientifiquesVo;
            }

        public List<TypeUtilisateurSavoirConcuVo> getTypeUtilisateurSavoirConcusVo(){
        return this.typeUtilisateurSavoirConcusVo;
        }

        public void setTypeUtilisateurSavoirConcusVo(List<TypeUtilisateurSavoirConcuVo> typeUtilisateurSavoirConcusVo){
            this.typeUtilisateurSavoirConcusVo = typeUtilisateurSavoirConcusVo;
            }

        public List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo> getDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionsVo(){
        return this.developpementDeSavoirEtInnovationScientifiqueModeDiffusionsVo;
        }

        public void setDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionsVo(List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo> developpementDeSavoirEtInnovationScientifiqueModeDiffusionsVo){
            this.developpementDeSavoirEtInnovationScientifiqueModeDiffusionsVo = developpementDeSavoirEtInnovationScientifiqueModeDiffusionsVo;
            }

        public List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo> getDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdsVo(){
        return this.developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdsVo;
        }

        public void setDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdsVo(List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo> developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdsVo){
            this.developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdsVo = developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdsVo;
            }

        public List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo> getDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiquesVo(){
        return this.developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiquesVo;
        }

        public void setDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiquesVo(List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo> developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiquesVo){
            this.developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiquesVo = developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiquesVo;
            }

        public List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo> getDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirsVo(){
        return this.developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirsVo;
        }

        public void setDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirsVo(List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo> developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirsVo){
            this.developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirsVo = developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirsVo;
            }

        public List<DeveloppementDeSavoirEtInnovationScientifiquePaysVo> getDeveloppementDeSavoirEtInnovationScientifiquePayssVo(){
        return this.developpementDeSavoirEtInnovationScientifiquePayssVo;
        }

        public void setDeveloppementDeSavoirEtInnovationScientifiquePayssVo(List<DeveloppementDeSavoirEtInnovationScientifiquePaysVo> developpementDeSavoirEtInnovationScientifiquePayssVo){
            this.developpementDeSavoirEtInnovationScientifiquePayssVo = developpementDeSavoirEtInnovationScientifiquePayssVo;
            }

        public List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo> getDeveloppementDeSavoirEtInnovationScientifiqueEtablissementsVo(){
        return this.developpementDeSavoirEtInnovationScientifiqueEtablissementsVo;
        }

        public void setDeveloppementDeSavoirEtInnovationScientifiqueEtablissementsVo(List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo> developpementDeSavoirEtInnovationScientifiqueEtablissementsVo){
            this.developpementDeSavoirEtInnovationScientifiqueEtablissementsVo = developpementDeSavoirEtInnovationScientifiqueEtablissementsVo;
            }

            }
