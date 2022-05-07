package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;

public class EncadrementEtudiantVo {

    private String id ;
    private String sujetEtude ;
    private String cursus ;



        private NiveauFormationPostBacVo niveauFormationPostBacVo ;
        private ResponsabiliteDirectionEncadrementEtudiantVo responsabiliteDirectionEncadrementEtudiantVo ;
        private EtudiantVo etudiantVo ;
        private EtablissementVo etablissementVo ;
        private PaysVo paysVo ;
        private EncadrementVo encadrementVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<EncadrementEtudiantEnjeuxIrdVo> encadrementEtudiantEnjeuxIrdsVo ;
    private List<EncadrementEtudiantDisciplineScientifiqueVo> encadrementEtudiantDisciplineScientifiquesVo ;

    public EncadrementEtudiantVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getSujetEtude(){
        return this.sujetEtude;
        }

        public void setSujetEtude(String sujetEtude){
        this.sujetEtude = sujetEtude;
        }
        public String getCursus(){
        return this.cursus;
        }

        public void setCursus(String cursus){
        this.cursus = cursus;
        }



        public NiveauFormationPostBacVo getNiveauFormationPostBacVo(){
        return this.niveauFormationPostBacVo;
        }

        public void setNiveauFormationPostBacVo(NiveauFormationPostBacVo niveauFormationPostBacVo){
        this.niveauFormationPostBacVo = niveauFormationPostBacVo;
        }
        public ResponsabiliteDirectionEncadrementEtudiantVo getResponsabiliteDirectionEncadrementEtudiantVo(){
        return this.responsabiliteDirectionEncadrementEtudiantVo;
        }

        public void setResponsabiliteDirectionEncadrementEtudiantVo(ResponsabiliteDirectionEncadrementEtudiantVo responsabiliteDirectionEncadrementEtudiantVo){
        this.responsabiliteDirectionEncadrementEtudiantVo = responsabiliteDirectionEncadrementEtudiantVo;
        }
        public EtudiantVo getEtudiantVo(){
        return this.etudiantVo;
        }

        public void setEtudiantVo(EtudiantVo etudiantVo){
        this.etudiantVo = etudiantVo;
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


        public List<EncadrementEtudiantEnjeuxIrdVo> getEncadrementEtudiantEnjeuxIrdsVo(){
        return this.encadrementEtudiantEnjeuxIrdsVo;
        }

        public void setEncadrementEtudiantEnjeuxIrdsVo(List<EncadrementEtudiantEnjeuxIrdVo> encadrementEtudiantEnjeuxIrdsVo){
            this.encadrementEtudiantEnjeuxIrdsVo = encadrementEtudiantEnjeuxIrdsVo;
            }

        public List<EncadrementEtudiantDisciplineScientifiqueVo> getEncadrementEtudiantDisciplineScientifiquesVo(){
        return this.encadrementEtudiantDisciplineScientifiquesVo;
        }

        public void setEncadrementEtudiantDisciplineScientifiquesVo(List<EncadrementEtudiantDisciplineScientifiqueVo> encadrementEtudiantDisciplineScientifiquesVo){
            this.encadrementEtudiantDisciplineScientifiquesVo = encadrementEtudiantDisciplineScientifiquesVo;
            }

            }
