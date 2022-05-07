package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class OutilPedagogiqueVo {

    private String id ;
    private String nom ;
    private String roleOutilPedagogique ;
    private String dateDiffusion ;
    private Boolean disponnibleNumerique ;
    private String lienWeb ;
    private Boolean lienInstrumentIrd ;
    private String partenaireEventuel ;
    private String remarque ;


            private String dateDiffusionMax ;
            private String dateDiffusionMin ;

        private CultureScientifiqueVo cultureScientifiqueVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<OutilPedagogiqueEnjeuxIrdVo> outilPedagogiqueEnjeuxIrdsVo ;
    private List<OutilPedagogiqueDisciplineScientifiqueVo> outilPedagogiqueDisciplineScientifiquesVo ;
    private List<OutilPedagogiquePubliqueCibleVo> outilPedagogiquePubliqueCiblesVo ;
    private List<TypeOutilPedagogiqueVo> typeOutilPedagogiquesVo ;
    private List<OutilPedagogiqueLangueVo> outilPedagogiqueLanguesVo ;
    private List<OutilPedagogiquePaysConceptionVo> outilPedagogiquePaysConceptionsVo ;
    private List<OutilPedagogiquePaysDiffusionVo> outilPedagogiquePaysDiffusionsVo ;
    private List<OutilPedagogiqueInstrumentIrdVo> outilPedagogiqueInstrumentIrdsVo ;
    private List<OutilPedagogiqueTypeInstrumentIrdVo> outilPedagogiqueTypeInstrumentIrdsVo ;

    public OutilPedagogiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getNom(){
        return this.nom;
        }

        public void setNom(String nom){
        this.nom = nom;
        }
        public String getRoleOutilPedagogique(){
        return this.roleOutilPedagogique;
        }

        public void setRoleOutilPedagogique(String roleOutilPedagogique){
        this.roleOutilPedagogique = roleOutilPedagogique;
        }
        public String getDateDiffusion(){
        return this.dateDiffusion;
        }

        public void setDateDiffusion(String dateDiffusion){
        this.dateDiffusion = dateDiffusion;
        }
        public Boolean getDisponnibleNumerique(){
        return this.disponnibleNumerique;
        }

        public void setDisponnibleNumerique(Boolean disponnibleNumerique){
        this.disponnibleNumerique = disponnibleNumerique;
        }
        public String getLienWeb(){
        return this.lienWeb;
        }

        public void setLienWeb(String lienWeb){
        this.lienWeb = lienWeb;
        }
        public Boolean getLienInstrumentIrd(){
        return this.lienInstrumentIrd;
        }

        public void setLienInstrumentIrd(Boolean lienInstrumentIrd){
        this.lienInstrumentIrd = lienInstrumentIrd;
        }
        public String getPartenaireEventuel(){
        return this.partenaireEventuel;
        }

        public void setPartenaireEventuel(String partenaireEventuel){
        this.partenaireEventuel = partenaireEventuel;
        }
        public String getRemarque(){
        return this.remarque;
        }

        public void setRemarque(String remarque){
        this.remarque = remarque;
        }


            public String getDateDiffusionMax(){
            return this.dateDiffusionMax;
            }

            public String getDateDiffusionMin(){
            return this.dateDiffusionMin;
            }

            public void setDateDiffusionMax(String dateDiffusionMax){
            this.dateDiffusionMax = dateDiffusionMax;
            }

            public void setDateDiffusionMin(String dateDiffusionMin){
            this.dateDiffusionMin = dateDiffusionMin;
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


        public List<OutilPedagogiqueEnjeuxIrdVo> getOutilPedagogiqueEnjeuxIrdsVo(){
        return this.outilPedagogiqueEnjeuxIrdsVo;
        }

        public void setOutilPedagogiqueEnjeuxIrdsVo(List<OutilPedagogiqueEnjeuxIrdVo> outilPedagogiqueEnjeuxIrdsVo){
            this.outilPedagogiqueEnjeuxIrdsVo = outilPedagogiqueEnjeuxIrdsVo;
            }

        public List<OutilPedagogiqueDisciplineScientifiqueVo> getOutilPedagogiqueDisciplineScientifiquesVo(){
        return this.outilPedagogiqueDisciplineScientifiquesVo;
        }

        public void setOutilPedagogiqueDisciplineScientifiquesVo(List<OutilPedagogiqueDisciplineScientifiqueVo> outilPedagogiqueDisciplineScientifiquesVo){
            this.outilPedagogiqueDisciplineScientifiquesVo = outilPedagogiqueDisciplineScientifiquesVo;
            }

        public List<OutilPedagogiquePubliqueCibleVo> getOutilPedagogiquePubliqueCiblesVo(){
        return this.outilPedagogiquePubliqueCiblesVo;
        }

        public void setOutilPedagogiquePubliqueCiblesVo(List<OutilPedagogiquePubliqueCibleVo> outilPedagogiquePubliqueCiblesVo){
            this.outilPedagogiquePubliqueCiblesVo = outilPedagogiquePubliqueCiblesVo;
            }

        public List<TypeOutilPedagogiqueVo> getTypeOutilPedagogiquesVo(){
        return this.typeOutilPedagogiquesVo;
        }

        public void setTypeOutilPedagogiquesVo(List<TypeOutilPedagogiqueVo> typeOutilPedagogiquesVo){
            this.typeOutilPedagogiquesVo = typeOutilPedagogiquesVo;
            }

        public List<OutilPedagogiqueLangueVo> getOutilPedagogiqueLanguesVo(){
        return this.outilPedagogiqueLanguesVo;
        }

        public void setOutilPedagogiqueLanguesVo(List<OutilPedagogiqueLangueVo> outilPedagogiqueLanguesVo){
            this.outilPedagogiqueLanguesVo = outilPedagogiqueLanguesVo;
            }

        public List<OutilPedagogiquePaysConceptionVo> getOutilPedagogiquePaysConceptionsVo(){
        return this.outilPedagogiquePaysConceptionsVo;
        }

        public void setOutilPedagogiquePaysConceptionsVo(List<OutilPedagogiquePaysConceptionVo> outilPedagogiquePaysConceptionsVo){
            this.outilPedagogiquePaysConceptionsVo = outilPedagogiquePaysConceptionsVo;
            }

        public List<OutilPedagogiquePaysDiffusionVo> getOutilPedagogiquePaysDiffusionsVo(){
        return this.outilPedagogiquePaysDiffusionsVo;
        }

        public void setOutilPedagogiquePaysDiffusionsVo(List<OutilPedagogiquePaysDiffusionVo> outilPedagogiquePaysDiffusionsVo){
            this.outilPedagogiquePaysDiffusionsVo = outilPedagogiquePaysDiffusionsVo;
            }

        public List<OutilPedagogiqueInstrumentIrdVo> getOutilPedagogiqueInstrumentIrdsVo(){
        return this.outilPedagogiqueInstrumentIrdsVo;
        }

        public void setOutilPedagogiqueInstrumentIrdsVo(List<OutilPedagogiqueInstrumentIrdVo> outilPedagogiqueInstrumentIrdsVo){
            this.outilPedagogiqueInstrumentIrdsVo = outilPedagogiqueInstrumentIrdsVo;
            }

        public List<OutilPedagogiqueTypeInstrumentIrdVo> getOutilPedagogiqueTypeInstrumentIrdsVo(){
        return this.outilPedagogiqueTypeInstrumentIrdsVo;
        }

        public void setOutilPedagogiqueTypeInstrumentIrdsVo(List<OutilPedagogiqueTypeInstrumentIrdVo> outilPedagogiqueTypeInstrumentIrdsVo){
            this.outilPedagogiqueTypeInstrumentIrdsVo = outilPedagogiqueTypeInstrumentIrdsVo;
            }

            }
