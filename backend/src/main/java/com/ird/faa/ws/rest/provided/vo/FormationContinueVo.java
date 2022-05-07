package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.math.BigDecimal;

public class FormationContinueVo {

    private String id ;
    private String intitule ;
    private String nombreHeuresDispenseesDansAnnee ;


            private String nombreHeuresDispenseesDansAnneeMax ;
            private String nombreHeuresDispenseesDansAnneeMin ;

        private ModaliteFormationContinueVo modaliteFormationContinueVo ;
        private EnseignementEtFormationVo enseignementEtFormationVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<FormationContinuePubliqueProfessionelVo> formationContinuePubliqueProfessionelsVo ;
    private List<FormationContinueObjetFormationGeneriqueVo> formationContinueObjetFormationGeneriquesVo ;
    private List<FormationContinueEnjeuxIrdVo> formationContinueEnjeuxIrdsVo ;
    private List<FormationContinueDisciplineScientifiqueVo> formationContinueDisciplineScientifiquesVo ;
    private List<PaysFormationContinueVo> paysFormationContinueVo ;
    private List<ZoneGeographiqueFormationContinueVo> zoneGeographiqueFormationContinuesVo ;
    private List<FormationContinueCommanditaireVo> formationContinueCommanditairesVo ;

    public FormationContinueVo(){
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
        public String getNombreHeuresDispenseesDansAnnee(){
        return this.nombreHeuresDispenseesDansAnnee;
        }

        public void setNombreHeuresDispenseesDansAnnee(String nombreHeuresDispenseesDansAnnee){
        this.nombreHeuresDispenseesDansAnnee = nombreHeuresDispenseesDansAnnee;
        }


            public String getNombreHeuresDispenseesDansAnneeMax(){
            return this.nombreHeuresDispenseesDansAnneeMax;
            }

            public String getNombreHeuresDispenseesDansAnneeMin(){
            return this.nombreHeuresDispenseesDansAnneeMin;
            }

            public void setNombreHeuresDispenseesDansAnneeMax(String nombreHeuresDispenseesDansAnneeMax){
            this.nombreHeuresDispenseesDansAnneeMax = nombreHeuresDispenseesDansAnneeMax;
            }

            public void setNombreHeuresDispenseesDansAnneeMin(String nombreHeuresDispenseesDansAnneeMin){
            this.nombreHeuresDispenseesDansAnneeMin = nombreHeuresDispenseesDansAnneeMin;
            }


        public ModaliteFormationContinueVo getModaliteFormationContinueVo(){
        return this.modaliteFormationContinueVo;
        }

        public void setModaliteFormationContinueVo(ModaliteFormationContinueVo modaliteFormationContinueVo){
        this.modaliteFormationContinueVo = modaliteFormationContinueVo;
        }
        public EnseignementEtFormationVo getEnseignementEtFormationVo(){
        return this.enseignementEtFormationVo;
        }

        public void setEnseignementEtFormationVo(EnseignementEtFormationVo enseignementEtFormationVo){
        this.enseignementEtFormationVo = enseignementEtFormationVo;
        }
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }


        public List<FormationContinuePubliqueProfessionelVo> getFormationContinuePubliqueProfessionelsVo(){
        return this.formationContinuePubliqueProfessionelsVo;
        }

        public void setFormationContinuePubliqueProfessionelsVo(List<FormationContinuePubliqueProfessionelVo> formationContinuePubliqueProfessionelsVo){
            this.formationContinuePubliqueProfessionelsVo = formationContinuePubliqueProfessionelsVo;
            }

        public List<FormationContinueObjetFormationGeneriqueVo> getFormationContinueObjetFormationGeneriquesVo(){
        return this.formationContinueObjetFormationGeneriquesVo;
        }

        public void setFormationContinueObjetFormationGeneriquesVo(List<FormationContinueObjetFormationGeneriqueVo> formationContinueObjetFormationGeneriquesVo){
            this.formationContinueObjetFormationGeneriquesVo = formationContinueObjetFormationGeneriquesVo;
            }

        public List<FormationContinueEnjeuxIrdVo> getFormationContinueEnjeuxIrdsVo(){
        return this.formationContinueEnjeuxIrdsVo;
        }

        public void setFormationContinueEnjeuxIrdsVo(List<FormationContinueEnjeuxIrdVo> formationContinueEnjeuxIrdsVo){
            this.formationContinueEnjeuxIrdsVo = formationContinueEnjeuxIrdsVo;
            }

        public List<FormationContinueDisciplineScientifiqueVo> getFormationContinueDisciplineScientifiquesVo(){
        return this.formationContinueDisciplineScientifiquesVo;
        }

        public void setFormationContinueDisciplineScientifiquesVo(List<FormationContinueDisciplineScientifiqueVo> formationContinueDisciplineScientifiquesVo){
            this.formationContinueDisciplineScientifiquesVo = formationContinueDisciplineScientifiquesVo;
            }

        public List<PaysFormationContinueVo> getPaysFormationContinueVo(){
        return this.paysFormationContinueVo;
        }

        public void setPaysFormationContinueVo(List<PaysFormationContinueVo> paysFormationContinueVo){
            this.paysFormationContinueVo = paysFormationContinueVo;
            }

        public List<ZoneGeographiqueFormationContinueVo> getZoneGeographiqueFormationContinuesVo(){
        return this.zoneGeographiqueFormationContinuesVo;
        }

        public void setZoneGeographiqueFormationContinuesVo(List<ZoneGeographiqueFormationContinueVo> zoneGeographiqueFormationContinuesVo){
            this.zoneGeographiqueFormationContinuesVo = zoneGeographiqueFormationContinuesVo;
            }

        public List<FormationContinueCommanditaireVo> getFormationContinueCommanditairesVo(){
        return this.formationContinueCommanditairesVo;
        }

        public void setFormationContinueCommanditairesVo(List<FormationContinueCommanditaireVo> formationContinueCommanditairesVo){
            this.formationContinueCommanditairesVo = formationContinueCommanditairesVo;
            }

            }
