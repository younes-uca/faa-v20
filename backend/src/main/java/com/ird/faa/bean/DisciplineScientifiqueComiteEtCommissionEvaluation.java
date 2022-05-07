package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "discipline_scientifique_comite_et_commission_evaluation")
public class DisciplineScientifiqueComiteEtCommissionEvaluation   {

@Id
    @SequenceGenerator(name="discipline_scientifique_comite_et_commission_evaluation_seq",sequenceName="discipline_scientifique_comite_et_commission_evaluation_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="discipline_scientifique_comite_et_commission_evaluation_seq")
private Long id;


    @ManyToOne
    private DisciplineScientifique disciplineScientifique ;
    @ManyToOne
    private ComiteEtCommissionEvaluation comiteEtCommissionEvaluation ;


public DisciplineScientifiqueComiteEtCommissionEvaluation(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public DisciplineScientifique getDisciplineScientifique(){
            return this.disciplineScientifique;
            }
            public void setDisciplineScientifique(DisciplineScientifique disciplineScientifique){
            this.disciplineScientifique = disciplineScientifique;
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
        DisciplineScientifiqueComiteEtCommissionEvaluation disciplineScientifiqueComiteEtCommissionEvaluation = (DisciplineScientifiqueComiteEtCommissionEvaluation) o;
        return id != null && id.equals(disciplineScientifiqueComiteEtCommissionEvaluation.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

