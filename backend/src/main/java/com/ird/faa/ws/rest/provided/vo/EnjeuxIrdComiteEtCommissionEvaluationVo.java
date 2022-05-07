package  com.ird.faa.ws.rest.provided.vo;


public class EnjeuxIrdComiteEtCommissionEvaluationVo {

    private String id ;



        private EnjeuxIrdVo enjeuxIrdVo ;
        private ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo ;


    public EnjeuxIrdComiteEtCommissionEvaluationVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EnjeuxIrdVo getEnjeuxIrdVo(){
        return this.enjeuxIrdVo;
        }

        public void setEnjeuxIrdVo(EnjeuxIrdVo enjeuxIrdVo){
        this.enjeuxIrdVo = enjeuxIrdVo;
        }
        public ComiteEtCommissionEvaluationVo getComiteEtCommissionEvaluationVo(){
        return this.comiteEtCommissionEvaluationVo;
        }

        public void setComiteEtCommissionEvaluationVo(ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo){
        this.comiteEtCommissionEvaluationVo = comiteEtCommissionEvaluationVo;
        }


            }
