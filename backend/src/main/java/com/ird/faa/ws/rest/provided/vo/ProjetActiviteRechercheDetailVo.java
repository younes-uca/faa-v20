package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.math.BigDecimal;

public class ProjetActiviteRechercheDetailVo {

    private String id ;
    private String sujetIntituleReponse ;
    private String dureePrevuEnMois ;
    private Boolean financementSpecifique ;
    private String montantFinancementPrevu ;


            private String dureePrevuEnMoisMax ;
            private String dureePrevuEnMoisMin ;
            private String montantFinancementPrevuMax ;
            private String montantFinancementPrevuMin ;

        private StatusProjetVo statusProjetVo ;
        private RoleProjetVo roleProjetVo ;
        private EtablissementVo etablissementVo ;
        private PaysVo paysVo ;
        private ProjetActiviteRechercheVo projetActiviteRechercheVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<ProjetActiviteRechercheDetailEnjeuxIrdVo> projetActiviteRechercheDetailEnjeuxIrdsVo ;
    private List<ProjetActiviteRechercheDetailInstrumentIrdVo> projetActiviteRechercheDetailInstrumentIrdsVo ;
    private List<ProjetActiviteRechercheDetailPaysVo> projetActiviteRechercheDetailPayssVo ;
    private List<ProjetActiviteRechercheDetailInstitutionCoContractantVo> projetActiviteRechercheDetailInstitutionCoContractantsVo ;
    private List<ProjetActiviteRechercheDetailEtablissementLanceurVo> projetActiviteRechercheDetailEtablissementLanceursVo ;

    public ProjetActiviteRechercheDetailVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getSujetIntituleReponse(){
        return this.sujetIntituleReponse;
        }

        public void setSujetIntituleReponse(String sujetIntituleReponse){
        this.sujetIntituleReponse = sujetIntituleReponse;
        }
        public String getDureePrevuEnMois(){
        return this.dureePrevuEnMois;
        }

        public void setDureePrevuEnMois(String dureePrevuEnMois){
        this.dureePrevuEnMois = dureePrevuEnMois;
        }
        public Boolean getFinancementSpecifique(){
        return this.financementSpecifique;
        }

        public void setFinancementSpecifique(Boolean financementSpecifique){
        this.financementSpecifique = financementSpecifique;
        }
        public String getMontantFinancementPrevu(){
        return this.montantFinancementPrevu;
        }

        public void setMontantFinancementPrevu(String montantFinancementPrevu){
        this.montantFinancementPrevu = montantFinancementPrevu;
        }


            public String getDureePrevuEnMoisMax(){
            return this.dureePrevuEnMoisMax;
            }

            public String getDureePrevuEnMoisMin(){
            return this.dureePrevuEnMoisMin;
            }

            public void setDureePrevuEnMoisMax(String dureePrevuEnMoisMax){
            this.dureePrevuEnMoisMax = dureePrevuEnMoisMax;
            }

            public void setDureePrevuEnMoisMin(String dureePrevuEnMoisMin){
            this.dureePrevuEnMoisMin = dureePrevuEnMoisMin;
            }

            public String getMontantFinancementPrevuMax(){
            return this.montantFinancementPrevuMax;
            }

            public String getMontantFinancementPrevuMin(){
            return this.montantFinancementPrevuMin;
            }

            public void setMontantFinancementPrevuMax(String montantFinancementPrevuMax){
            this.montantFinancementPrevuMax = montantFinancementPrevuMax;
            }

            public void setMontantFinancementPrevuMin(String montantFinancementPrevuMin){
            this.montantFinancementPrevuMin = montantFinancementPrevuMin;
            }


        public StatusProjetVo getStatusProjetVo(){
        return this.statusProjetVo;
        }

        public void setStatusProjetVo(StatusProjetVo statusProjetVo){
        this.statusProjetVo = statusProjetVo;
        }
        public RoleProjetVo getRoleProjetVo(){
        return this.roleProjetVo;
        }

        public void setRoleProjetVo(RoleProjetVo roleProjetVo){
        this.roleProjetVo = roleProjetVo;
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
        public ProjetActiviteRechercheVo getProjetActiviteRechercheVo(){
        return this.projetActiviteRechercheVo;
        }

        public void setProjetActiviteRechercheVo(ProjetActiviteRechercheVo projetActiviteRechercheVo){
        this.projetActiviteRechercheVo = projetActiviteRechercheVo;
        }
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }


        public List<ProjetActiviteRechercheDetailEnjeuxIrdVo> getProjetActiviteRechercheDetailEnjeuxIrdsVo(){
        return this.projetActiviteRechercheDetailEnjeuxIrdsVo;
        }

        public void setProjetActiviteRechercheDetailEnjeuxIrdsVo(List<ProjetActiviteRechercheDetailEnjeuxIrdVo> projetActiviteRechercheDetailEnjeuxIrdsVo){
            this.projetActiviteRechercheDetailEnjeuxIrdsVo = projetActiviteRechercheDetailEnjeuxIrdsVo;
            }

        public List<ProjetActiviteRechercheDetailInstrumentIrdVo> getProjetActiviteRechercheDetailInstrumentIrdsVo(){
        return this.projetActiviteRechercheDetailInstrumentIrdsVo;
        }

        public void setProjetActiviteRechercheDetailInstrumentIrdsVo(List<ProjetActiviteRechercheDetailInstrumentIrdVo> projetActiviteRechercheDetailInstrumentIrdsVo){
            this.projetActiviteRechercheDetailInstrumentIrdsVo = projetActiviteRechercheDetailInstrumentIrdsVo;
            }

        public List<ProjetActiviteRechercheDetailPaysVo> getProjetActiviteRechercheDetailPayssVo(){
        return this.projetActiviteRechercheDetailPayssVo;
        }

        public void setProjetActiviteRechercheDetailPayssVo(List<ProjetActiviteRechercheDetailPaysVo> projetActiviteRechercheDetailPayssVo){
            this.projetActiviteRechercheDetailPayssVo = projetActiviteRechercheDetailPayssVo;
            }

        public List<ProjetActiviteRechercheDetailInstitutionCoContractantVo> getProjetActiviteRechercheDetailInstitutionCoContractantsVo(){
        return this.projetActiviteRechercheDetailInstitutionCoContractantsVo;
        }

        public void setProjetActiviteRechercheDetailInstitutionCoContractantsVo(List<ProjetActiviteRechercheDetailInstitutionCoContractantVo> projetActiviteRechercheDetailInstitutionCoContractantsVo){
            this.projetActiviteRechercheDetailInstitutionCoContractantsVo = projetActiviteRechercheDetailInstitutionCoContractantsVo;
            }

        public List<ProjetActiviteRechercheDetailEtablissementLanceurVo> getProjetActiviteRechercheDetailEtablissementLanceursVo(){
        return this.projetActiviteRechercheDetailEtablissementLanceursVo;
        }

        public void setProjetActiviteRechercheDetailEtablissementLanceursVo(List<ProjetActiviteRechercheDetailEtablissementLanceurVo> projetActiviteRechercheDetailEtablissementLanceursVo){
            this.projetActiviteRechercheDetailEtablissementLanceursVo = projetActiviteRechercheDetailEtablissementLanceursVo;
            }

            }
