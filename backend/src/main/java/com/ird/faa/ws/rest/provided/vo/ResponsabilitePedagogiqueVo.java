package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;

public class ResponsabilitePedagogiqueVo {

    private String id ;
    private String intituleCursus ;
    private Boolean serviceRenforcementCapacite ;
    private Boolean cursusConstruitAvecEtablissements ;



        private NiveauResponsabilitePedagogiqueVo niveauResponsabilitePedagogiqueVo ;
        private StatusCursusVo statusCursusVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;
        private EnseignementEtFormationVo enseignementEtFormationVo ;

    private List<ResponsabilitePedagogiqueEnjeuxIrdVo> responsabilitePedagogiqueEnjeuxIrdsVo ;
    private List<ResponsabilitePedagogiqueEtablissementVo> responsabilitePedagogiqueEtablissementsVo ;
    private List<ResponsabilitePedagogiquePaysVo> responsabilitePedagogiquePayssVo ;

    public ResponsabilitePedagogiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getIntituleCursus(){
        return this.intituleCursus;
        }

        public void setIntituleCursus(String intituleCursus){
        this.intituleCursus = intituleCursus;
        }
        public Boolean getServiceRenforcementCapacite(){
        return this.serviceRenforcementCapacite;
        }

        public void setServiceRenforcementCapacite(Boolean serviceRenforcementCapacite){
        this.serviceRenforcementCapacite = serviceRenforcementCapacite;
        }
        public Boolean getCursusConstruitAvecEtablissements(){
        return this.cursusConstruitAvecEtablissements;
        }

        public void setCursusConstruitAvecEtablissements(Boolean cursusConstruitAvecEtablissements){
        this.cursusConstruitAvecEtablissements = cursusConstruitAvecEtablissements;
        }



        public NiveauResponsabilitePedagogiqueVo getNiveauResponsabilitePedagogiqueVo(){
        return this.niveauResponsabilitePedagogiqueVo;
        }

        public void setNiveauResponsabilitePedagogiqueVo(NiveauResponsabilitePedagogiqueVo niveauResponsabilitePedagogiqueVo){
        this.niveauResponsabilitePedagogiqueVo = niveauResponsabilitePedagogiqueVo;
        }
        public StatusCursusVo getStatusCursusVo(){
        return this.statusCursusVo;
        }

        public void setStatusCursusVo(StatusCursusVo statusCursusVo){
        this.statusCursusVo = statusCursusVo;
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


        public List<ResponsabilitePedagogiqueEnjeuxIrdVo> getResponsabilitePedagogiqueEnjeuxIrdsVo(){
        return this.responsabilitePedagogiqueEnjeuxIrdsVo;
        }

        public void setResponsabilitePedagogiqueEnjeuxIrdsVo(List<ResponsabilitePedagogiqueEnjeuxIrdVo> responsabilitePedagogiqueEnjeuxIrdsVo){
            this.responsabilitePedagogiqueEnjeuxIrdsVo = responsabilitePedagogiqueEnjeuxIrdsVo;
            }

        public List<ResponsabilitePedagogiqueEtablissementVo> getResponsabilitePedagogiqueEtablissementsVo(){
        return this.responsabilitePedagogiqueEtablissementsVo;
        }

        public void setResponsabilitePedagogiqueEtablissementsVo(List<ResponsabilitePedagogiqueEtablissementVo> responsabilitePedagogiqueEtablissementsVo){
            this.responsabilitePedagogiqueEtablissementsVo = responsabilitePedagogiqueEtablissementsVo;
            }

        public List<ResponsabilitePedagogiquePaysVo> getResponsabilitePedagogiquePayssVo(){
        return this.responsabilitePedagogiquePayssVo;
        }

        public void setResponsabilitePedagogiquePayssVo(List<ResponsabilitePedagogiquePaysVo> responsabilitePedagogiquePayssVo){
            this.responsabilitePedagogiquePayssVo = responsabilitePedagogiquePayssVo;
            }

            }
