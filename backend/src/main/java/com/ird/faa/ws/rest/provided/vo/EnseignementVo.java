package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.math.BigDecimal;

public class EnseignementVo {

    private String id ;
    private String intitule ;
    private String nombreHeure ;
    private Boolean etabilssementNonReconnu ;


            private String nombreHeureMax ;
            private String nombreHeureMin ;

        private ModaliteEtudeVo modaliteEtudeVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;
        private EnseignementEtFormationVo enseignementEtFormationVo ;

    private List<TypeEtudeEnseignementVo> typeEtudeEnseignementsVo ;
    private List<EnseignementNatureVo> enseignementNaturesVo ;
    private List<NiveauEtudeEnseignementVo> niveauEtudeEnseignementsVo ;
    private List<EtablissementEnseignementVo> etablissementEnseignementsVo ;
    private List<EnseignementZoneGeographiqueVo> enseignementZoneGeographiquesVo ;
    private List<EnseignementEnjeuxIrdVo> enseignementEnjeuxIrdsVo ;
    private List<EnseignementDisciplineScientifiqueVo> enseignementDisciplineScientifiquesVo ;

    public EnseignementVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getIntitule(){
        return this.intitule;
        }

        public void setIntitule(String intitule){
        this.intitule = intitule;
        }
        public String getNombreHeure(){
        return this.nombreHeure;
        }

        public void setNombreHeure(String nombreHeure){
        this.nombreHeure = nombreHeure;
        }
        public Boolean getEtabilssementNonReconnu(){
        return this.etabilssementNonReconnu;
        }

        public void setEtabilssementNonReconnu(Boolean etabilssementNonReconnu){
        this.etabilssementNonReconnu = etabilssementNonReconnu;
        }


            public String getNombreHeureMax(){
            return this.nombreHeureMax;
            }

            public String getNombreHeureMin(){
            return this.nombreHeureMin;
            }

            public void setNombreHeureMax(String nombreHeureMax){
            this.nombreHeureMax = nombreHeureMax;
            }

            public void setNombreHeureMin(String nombreHeureMin){
            this.nombreHeureMin = nombreHeureMin;
            }


        public ModaliteEtudeVo getModaliteEtudeVo(){
        return this.modaliteEtudeVo;
        }

        public void setModaliteEtudeVo(ModaliteEtudeVo modaliteEtudeVo){
        this.modaliteEtudeVo = modaliteEtudeVo;
        }
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }
        public EnseignementEtFormationVo getEnseignementEtFormationVo(){
        return this.enseignementEtFormationVo;
        }

        public void setEnseignementEtFormationVo(EnseignementEtFormationVo enseignementEtFormationVo){
        this.enseignementEtFormationVo = enseignementEtFormationVo;
        }


        public List<TypeEtudeEnseignementVo> getTypeEtudeEnseignementsVo(){
        return this.typeEtudeEnseignementsVo;
        }

        public void setTypeEtudeEnseignementsVo(List<TypeEtudeEnseignementVo> typeEtudeEnseignementsVo){
            this.typeEtudeEnseignementsVo = typeEtudeEnseignementsVo;
            }

        public List<EnseignementNatureVo> getEnseignementNaturesVo(){
        return this.enseignementNaturesVo;
        }

        public void setEnseignementNaturesVo(List<EnseignementNatureVo> enseignementNaturesVo){
            this.enseignementNaturesVo = enseignementNaturesVo;
            }

        public List<NiveauEtudeEnseignementVo> getNiveauEtudeEnseignementsVo(){
        return this.niveauEtudeEnseignementsVo;
        }

        public void setNiveauEtudeEnseignementsVo(List<NiveauEtudeEnseignementVo> niveauEtudeEnseignementsVo){
            this.niveauEtudeEnseignementsVo = niveauEtudeEnseignementsVo;
            }

        public List<EtablissementEnseignementVo> getEtablissementEnseignementsVo(){
        return this.etablissementEnseignementsVo;
        }

        public void setEtablissementEnseignementsVo(List<EtablissementEnseignementVo> etablissementEnseignementsVo){
            this.etablissementEnseignementsVo = etablissementEnseignementsVo;
            }

        public List<EnseignementZoneGeographiqueVo> getEnseignementZoneGeographiquesVo(){
        return this.enseignementZoneGeographiquesVo;
        }

        public void setEnseignementZoneGeographiquesVo(List<EnseignementZoneGeographiqueVo> enseignementZoneGeographiquesVo){
            this.enseignementZoneGeographiquesVo = enseignementZoneGeographiquesVo;
            }

        public List<EnseignementEnjeuxIrdVo> getEnseignementEnjeuxIrdsVo(){
        return this.enseignementEnjeuxIrdsVo;
        }

        public void setEnseignementEnjeuxIrdsVo(List<EnseignementEnjeuxIrdVo> enseignementEnjeuxIrdsVo){
            this.enseignementEnjeuxIrdsVo = enseignementEnjeuxIrdsVo;
            }

        public List<EnseignementDisciplineScientifiqueVo> getEnseignementDisciplineScientifiquesVo(){
        return this.enseignementDisciplineScientifiquesVo;
        }

        public void setEnseignementDisciplineScientifiquesVo(List<EnseignementDisciplineScientifiqueVo> enseignementDisciplineScientifiquesVo){
            this.enseignementDisciplineScientifiquesVo = enseignementDisciplineScientifiquesVo;
            }

            }
