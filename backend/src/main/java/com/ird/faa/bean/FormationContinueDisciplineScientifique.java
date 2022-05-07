package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "formation_continue_discipline_scientifique")
public class FormationContinueDisciplineScientifique   {

@Id
    @SequenceGenerator(name="formation_continue_discipline_scientifique_seq",sequenceName="formation_continue_discipline_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="formation_continue_discipline_scientifique_seq")
private Long id;


    @ManyToOne
    private FormationContinue formationContinue ;
    @ManyToOne
    private DisciplineScientifique disciplineScientifique ;


public FormationContinueDisciplineScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public FormationContinue getFormationContinue(){
            return this.formationContinue;
            }
            public void setFormationContinue(FormationContinue formationContinue){
            this.formationContinue = formationContinue;
            }
            public DisciplineScientifique getDisciplineScientifique(){
            return this.disciplineScientifique;
            }
            public void setDisciplineScientifique(DisciplineScientifique disciplineScientifique){
            this.disciplineScientifique = disciplineScientifique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormationContinueDisciplineScientifique formationContinueDisciplineScientifique = (FormationContinueDisciplineScientifique) o;
        return id != null && id.equals(formationContinueDisciplineScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

