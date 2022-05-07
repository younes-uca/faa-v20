package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;

public class RencontreMediaVo {

    private String id ;
    private String intituleSujet ;
    private String lienWeb ;
    private String remarque ;



        private FormatRencontreVo formatRencontreVo ;
        private CultureScientifiqueVo cultureScientifiqueVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<TypePubliqueRencontreMediaVo> typePubliqueRencontreMediasVo ;
    private List<RencontreMediaEnjeuxIrdVo> rencontreMediaEnjeuxIrdsVo ;
    private List<RencontreMediaDisciplineScientifiqueVo> rencontreMediaDisciplineScientifiquesVo ;
    private List<RencontreMediaPeriodeVo> rencontreMediaPeriodesVo ;
    private List<PaysRencontreMediaVo> paysRencontreMediasVo ;

    public RencontreMediaVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getIntituleSujet(){
        return this.intituleSujet;
        }

        public void setIntituleSujet(String intituleSujet){
        this.intituleSujet = intituleSujet;
        }
        public String getLienWeb(){
        return this.lienWeb;
        }

        public void setLienWeb(String lienWeb){
        this.lienWeb = lienWeb;
        }
        public String getRemarque(){
        return this.remarque;
        }

        public void setRemarque(String remarque){
        this.remarque = remarque;
        }



        public FormatRencontreVo getFormatRencontreVo(){
        return this.formatRencontreVo;
        }

        public void setFormatRencontreVo(FormatRencontreVo formatRencontreVo){
        this.formatRencontreVo = formatRencontreVo;
        }
        public CultureScientifiqueVo getCultureScientifiqueVo(){
        return this.cultureScientifiqueVo;
        }

        public void setCultureScientifiqueVo(CultureScientifiqueVo cultureScientifiqueVo){
        this.cultureScientifiqueVo = cultureScientifiqueVo;
        }
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }


        public List<TypePubliqueRencontreMediaVo> getTypePubliqueRencontreMediasVo(){
        return this.typePubliqueRencontreMediasVo;
        }

        public void setTypePubliqueRencontreMediasVo(List<TypePubliqueRencontreMediaVo> typePubliqueRencontreMediasVo){
            this.typePubliqueRencontreMediasVo = typePubliqueRencontreMediasVo;
            }

        public List<RencontreMediaEnjeuxIrdVo> getRencontreMediaEnjeuxIrdsVo(){
        return this.rencontreMediaEnjeuxIrdsVo;
        }

        public void setRencontreMediaEnjeuxIrdsVo(List<RencontreMediaEnjeuxIrdVo> rencontreMediaEnjeuxIrdsVo){
            this.rencontreMediaEnjeuxIrdsVo = rencontreMediaEnjeuxIrdsVo;
            }

        public List<RencontreMediaDisciplineScientifiqueVo> getRencontreMediaDisciplineScientifiquesVo(){
        return this.rencontreMediaDisciplineScientifiquesVo;
        }

        public void setRencontreMediaDisciplineScientifiquesVo(List<RencontreMediaDisciplineScientifiqueVo> rencontreMediaDisciplineScientifiquesVo){
            this.rencontreMediaDisciplineScientifiquesVo = rencontreMediaDisciplineScientifiquesVo;
            }

        public List<RencontreMediaPeriodeVo> getRencontreMediaPeriodesVo(){
        return this.rencontreMediaPeriodesVo;
        }

        public void setRencontreMediaPeriodesVo(List<RencontreMediaPeriodeVo> rencontreMediaPeriodesVo){
            this.rencontreMediaPeriodesVo = rencontreMediaPeriodesVo;
            }

        public List<PaysRencontreMediaVo> getPaysRencontreMediasVo(){
        return this.paysRencontreMediasVo;
        }

        public void setPaysRencontreMediasVo(List<PaysRencontreMediaVo> paysRencontreMediasVo){
            this.paysRencontreMediasVo = paysRencontreMediasVo;
            }

            }
