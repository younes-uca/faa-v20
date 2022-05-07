package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class DistinctionVo {

    private String id ;
    private String dateObtention ;
    private String intitule ;


            private String dateObtentionMax ;
            private String dateObtentionMin ;

        private TypeParticipationVo typeParticipationVo ;
        private PaysVo paysVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;
        private ChercheurVo chercheurVo ;
        private CampagneVo campagneVo ;

    private List<DistinctionEtablissementPaysVo> distinctionEtablissementPayssVo ;

    public DistinctionVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getDateObtention(){
        return this.dateObtention;
        }

        public void setDateObtention(String dateObtention){
        this.dateObtention = dateObtention;
        }
        public String getIntitule(){
        return this.intitule;
        }

        public void setIntitule(String intitule){
        this.intitule = intitule;
        }


            public String getDateObtentionMax(){
            return this.dateObtentionMax;
            }

            public String getDateObtentionMin(){
            return this.dateObtentionMin;
            }

            public void setDateObtentionMax(String dateObtentionMax){
            this.dateObtentionMax = dateObtentionMax;
            }

            public void setDateObtentionMin(String dateObtentionMin){
            this.dateObtentionMin = dateObtentionMin;
            }


        public TypeParticipationVo getTypeParticipationVo(){
        return this.typeParticipationVo;
        }

        public void setTypeParticipationVo(TypeParticipationVo typeParticipationVo){
        this.typeParticipationVo = typeParticipationVo;
        }
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }
        public ChercheurVo getChercheurVo(){
        return this.chercheurVo;
        }

        public void setChercheurVo(ChercheurVo chercheurVo){
        this.chercheurVo = chercheurVo;
        }
        public CampagneVo getCampagneVo(){
        return this.campagneVo;
        }

        public void setCampagneVo(CampagneVo campagneVo){
        this.campagneVo = campagneVo;
        }


        public List<DistinctionEtablissementPaysVo> getDistinctionEtablissementPayssVo(){
        return this.distinctionEtablissementPayssVo;
        }

        public void setDistinctionEtablissementPayssVo(List<DistinctionEtablissementPaysVo> distinctionEtablissementPayssVo){
            this.distinctionEtablissementPayssVo = distinctionEtablissementPayssVo;
            }

            }
