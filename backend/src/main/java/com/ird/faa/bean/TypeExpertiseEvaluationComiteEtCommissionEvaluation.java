package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "type_expertise_evaluation_comite_et_commission_evaluation")
public class TypeExpertiseEvaluationComiteEtCommissionEvaluation   {

@Id
    @SequenceGenerator(name="type_expertise_evaluation_comite_et_commission_evaluation_seq",sequenceName="type_expertise_evaluation_comite_et_commission_evaluation_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_expertise_evaluation_comite_et_commission_evaluation_seq")
private Long id;


    @ManyToOne
    private TypeExpertiseEvaluation typeExpertiseEvaluation ;
    @ManyToOne
    private ComiteEtCommissionEvaluation comiteEtCommissionEvaluation ;


public TypeExpertiseEvaluationComiteEtCommissionEvaluation(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public TypeExpertiseEvaluation getTypeExpertiseEvaluation(){
            return this.typeExpertiseEvaluation;
            }
            public void setTypeExpertiseEvaluation(TypeExpertiseEvaluation typeExpertiseEvaluation){
            this.typeExpertiseEvaluation = typeExpertiseEvaluation;
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
        TypeExpertiseEvaluationComiteEtCommissionEvaluation typeExpertiseEvaluationComiteEtCommissionEvaluation = (TypeExpertiseEvaluationComiteEtCommissionEvaluation) o;
        return id != null && id.equals(typeExpertiseEvaluationComiteEtCommissionEvaluation.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

