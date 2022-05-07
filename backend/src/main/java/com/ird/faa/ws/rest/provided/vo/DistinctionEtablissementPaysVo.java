package  com.ird.faa.ws.rest.provided.vo;


public class DistinctionEtablissementPaysVo {

    private String id ;



        private PaysVo paysVo ;
        private EtablissementVo etablissementVo ;
        private DistinctionVo distinctionVo ;


    public DistinctionEtablissementPaysVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }
        public EtablissementVo getEtablissementVo(){
        return this.etablissementVo;
        }

        public void setEtablissementVo(EtablissementVo etablissementVo){
        this.etablissementVo = etablissementVo;
        }
        public DistinctionVo getDistinctionVo(){
        return this.distinctionVo;
        }

        public void setDistinctionVo(DistinctionVo distinctionVo){
        this.distinctionVo = distinctionVo;
        }


            }
