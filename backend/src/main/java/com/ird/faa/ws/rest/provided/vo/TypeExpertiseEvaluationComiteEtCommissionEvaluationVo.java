package  com.ird.faa.ws.rest.provided.vo;


public class TypeExpertiseEvaluationComiteEtCommissionEvaluationVo {

    private String id ;



        private TypeExpertiseEvaluationVo typeExpertiseEvaluationVo ;
        private ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo ;


    public TypeExpertiseEvaluationComiteEtCommissionEvaluationVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public TypeExpertiseEvaluationVo getTypeExpertiseEvaluationVo(){
        return this.typeExpertiseEvaluationVo;
        }

        public void setTypeExpertiseEvaluationVo(TypeExpertiseEvaluationVo typeExpertiseEvaluationVo){
        this.typeExpertiseEvaluationVo = typeExpertiseEvaluationVo;
        }
        public ComiteEtCommissionEvaluationVo getComiteEtCommissionEvaluationVo(){
        return this.comiteEtCommissionEvaluationVo;
        }

        public void setComiteEtCommissionEvaluationVo(ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo){
        this.comiteEtCommissionEvaluationVo = comiteEtCommissionEvaluationVo;
        }


            }
