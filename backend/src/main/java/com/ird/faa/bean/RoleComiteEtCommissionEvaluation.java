package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "role_comite_et_commission_evaluation")
public class RoleComiteEtCommissionEvaluation   {

@Id
    @SequenceGenerator(name="role_comite_et_commission_evaluation_seq",sequenceName="role_comite_et_commission_evaluation_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="role_comite_et_commission_evaluation_seq")
private Long id;


    @ManyToOne
    private RoleEvaluation roleEvaluation ;
    @ManyToOne
    private ComiteEtCommissionEvaluation comiteEtCommissionEvaluation ;


public RoleComiteEtCommissionEvaluation(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public RoleEvaluation getRoleEvaluation(){
            return this.roleEvaluation;
            }
            public void setRoleEvaluation(RoleEvaluation roleEvaluation){
            this.roleEvaluation = roleEvaluation;
            }
            public ComiteEtCommissionEvaluation getComiteEtCommissionEvaluation(){
            return this.comiteEtCommissionEvaluation;
            }
            public void setComiteEtCommissionEvaluation(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation){
            this.comiteEtCommissionEvaluation = comiteEtCommissionEvaluation;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleComiteEtCommissionEvaluation roleComiteEtCommissionEvaluation = (RoleComiteEtCommissionEvaluation) o;
        return id != null && id.equals(roleComiteEtCommissionEvaluation.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

