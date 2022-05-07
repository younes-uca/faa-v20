package  com.ird.faa.ws.rest.provided.vo;


public class RoleComiteEtCommissionEvaluationVo {

    private String id ;



        private RoleEvaluationVo roleEvaluationVo ;
        private ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo ;


    public RoleComiteEtCommissionEvaluationVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public RoleEvaluationVo getRoleEvaluationVo(){
        return this.roleEvaluationVo;
        }

        public void setRoleEvaluationVo(RoleEvaluationVo roleEvaluationVo){
        this.roleEvaluationVo = roleEvaluationVo;
        }
        public ComiteEtCommissionEvaluationVo getComiteEtCommissionEvaluationVo(){
        return this.comiteEtCommissionEvaluationVo;
        }

        public void setComiteEtCommissionEvaluationVo(ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo){
        this.comiteEtCommissionEvaluationVo = comiteEtCommissionEvaluationVo;
        }


            }
