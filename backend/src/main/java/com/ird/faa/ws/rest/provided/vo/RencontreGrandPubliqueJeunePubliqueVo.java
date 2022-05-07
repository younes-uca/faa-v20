package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.math.BigDecimal;

public class RencontreGrandPubliqueJeunePubliqueVo {

    private String id ;
    private String intituleSujet ;
    private String nombrePersonneEstime ;
    private Boolean lienInstrumentIrd ;
    private String lienWeb ;
    private String remarque ;


            private String nombrePersonneEstimeMax ;
            private String nombrePersonneEstimeMin ;

        private FormatRencontreVo formatRencontreVo ;
        private ContexteVo contexteVo ;
        private PaysVo paysVo ;
        private CultureScientifiqueVo cultureScientifiqueVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<TypePubliqueRencontreGrandPubliqueJeunePubliqueVo> typePubliqueRencontreGrandPubliqueJeunePubliquesVo ;
    private List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo> rencontreGrandPubliqueJeunePubliqueEnjeuxIrdsVo ;
    private List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo> rencontreGrandPubliqueJeunePubliqueDisciplineScientifiquesVo ;
    private List<RencontreGrandPubliqueJeunePubliquePeriodeVo> rencontreGrandPubliqueJeunePubliquePeriodesVo ;
    private List<StructureOganisatriceVo> structureOganisatricesVo ;
    private List<PaysRencontreGrandPubliqueJeunePubliqueVo> paysRencontreGrandPubliqueJeunePubliquesVo ;
    private List<PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo> paysOrganisateurRencontreGrandPubliqueJeunePubliquesVo ;
    private List<RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo> rencontreGrandPubliqueJeunePubliqueInstrumentIrdsVo ;
    private List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo> rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdsVo ;

    public RencontreGrandPubliqueJeunePubliqueVo(){
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
        public String getNombrePersonneEstime(){
        return this.nombrePersonneEstime;
        }

        public void setNombrePersonneEstime(String nombrePersonneEstime){
        this.nombrePersonneEstime = nombrePersonneEstime;
        }
        public Boolean getLienInstrumentIrd(){
        return this.lienInstrumentIrd;
        }

        public void setLienInstrumentIrd(Boolean lienInstrumentIrd){
        this.lienInstrumentIrd = lienInstrumentIrd;
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


            public String getNombrePersonneEstimeMax(){
            return this.nombrePersonneEstimeMax;
            }

            public String getNombrePersonneEstimeMin(){
            return this.nombrePersonneEstimeMin;
            }

            public void setNombrePersonneEstimeMax(String nombrePersonneEstimeMax){
            this.nombrePersonneEstimeMax = nombrePersonneEstimeMax;
            }

            public void setNombrePersonneEstimeMin(String nombrePersonneEstimeMin){
            this.nombrePersonneEstimeMin = nombrePersonneEstimeMin;
            }


        public FormatRencontreVo getFormatRencontreVo(){
        return this.formatRencontreVo;
        }

        public void setFormatRencontreVo(FormatRencontreVo formatRencontreVo){
        this.formatRencontreVo = formatRencontreVo;
        }
        public ContexteVo getContexteVo(){
        return this.contexteVo;
        }

        public void setContexteVo(ContexteVo contexteVo){
        this.contexteVo = contexteVo;
        }
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
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


        public List<TypePubliqueRencontreGrandPubliqueJeunePubliqueVo> getTypePubliqueRencontreGrandPubliqueJeunePubliquesVo(){
        return this.typePubliqueRencontreGrandPubliqueJeunePubliquesVo;
        }

        public void setTypePubliqueRencontreGrandPubliqueJeunePubliquesVo(List<TypePubliqueRencontreGrandPubliqueJeunePubliqueVo> typePubliqueRencontreGrandPubliqueJeunePubliquesVo){
            this.typePubliqueRencontreGrandPubliqueJeunePubliquesVo = typePubliqueRencontreGrandPubliqueJeunePubliquesVo;
            }

        public List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo> getRencontreGrandPubliqueJeunePubliqueEnjeuxIrdsVo(){
        return this.rencontreGrandPubliqueJeunePubliqueEnjeuxIrdsVo;
        }

        public void setRencontreGrandPubliqueJeunePubliqueEnjeuxIrdsVo(List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo> rencontreGrandPubliqueJeunePubliqueEnjeuxIrdsVo){
            this.rencontreGrandPubliqueJeunePubliqueEnjeuxIrdsVo = rencontreGrandPubliqueJeunePubliqueEnjeuxIrdsVo;
            }

        public List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo> getRencontreGrandPubliqueJeunePubliqueDisciplineScientifiquesVo(){
        return this.rencontreGrandPubliqueJeunePubliqueDisciplineScientifiquesVo;
        }

        public void setRencontreGrandPubliqueJeunePubliqueDisciplineScientifiquesVo(List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo> rencontreGrandPubliqueJeunePubliqueDisciplineScientifiquesVo){
            this.rencontreGrandPubliqueJeunePubliqueDisciplineScientifiquesVo = rencontreGrandPubliqueJeunePubliqueDisciplineScientifiquesVo;
            }

        public List<RencontreGrandPubliqueJeunePubliquePeriodeVo> getRencontreGrandPubliqueJeunePubliquePeriodesVo(){
        return this.rencontreGrandPubliqueJeunePubliquePeriodesVo;
        }

        public void setRencontreGrandPubliqueJeunePubliquePeriodesVo(List<RencontreGrandPubliqueJeunePubliquePeriodeVo> rencontreGrandPubliqueJeunePubliquePeriodesVo){
            this.rencontreGrandPubliqueJeunePubliquePeriodesVo = rencontreGrandPubliqueJeunePubliquePeriodesVo;
            }

        public List<StructureOganisatriceVo> getStructureOganisatricesVo(){
        return this.structureOganisatricesVo;
        }

        public void setStructureOganisatricesVo(List<StructureOganisatriceVo> structureOganisatricesVo){
            this.structureOganisatricesVo = structureOganisatricesVo;
            }

        public List<PaysRencontreGrandPubliqueJeunePubliqueVo> getPaysRencontreGrandPubliqueJeunePubliquesVo(){
        return this.paysRencontreGrandPubliqueJeunePubliquesVo;
        }

        public void setPaysRencontreGrandPubliqueJeunePubliquesVo(List<PaysRencontreGrandPubliqueJeunePubliqueVo> paysRencontreGrandPubliqueJeunePubliquesVo){
            this.paysRencontreGrandPubliqueJeunePubliquesVo = paysRencontreGrandPubliqueJeunePubliquesVo;
            }

        public List<PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo> getPaysOrganisateurRencontreGrandPubliqueJeunePubliquesVo(){
        return this.paysOrganisateurRencontreGrandPubliqueJeunePubliquesVo;
        }

        public void setPaysOrganisateurRencontreGrandPubliqueJeunePubliquesVo(List<PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo> paysOrganisateurRencontreGrandPubliqueJeunePubliquesVo){
            this.paysOrganisateurRencontreGrandPubliqueJeunePubliquesVo = paysOrganisateurRencontreGrandPubliqueJeunePubliquesVo;
            }

        public List<RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo> getRencontreGrandPubliqueJeunePubliqueInstrumentIrdsVo(){
        return this.rencontreGrandPubliqueJeunePubliqueInstrumentIrdsVo;
        }

        public void setRencontreGrandPubliqueJeunePubliqueInstrumentIrdsVo(List<RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo> rencontreGrandPubliqueJeunePubliqueInstrumentIrdsVo){
            this.rencontreGrandPubliqueJeunePubliqueInstrumentIrdsVo = rencontreGrandPubliqueJeunePubliqueInstrumentIrdsVo;
            }

        public List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo> getRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdsVo(){
        return this.rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdsVo;
        }

        public void setRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdsVo(List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo> rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdsVo){
            this.rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdsVo = rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdsVo;
            }

            }
