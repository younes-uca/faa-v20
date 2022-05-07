package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "discipline_scientifique_evenement_colloque_scientifique")
public class DisciplineScientifiqueEvenementColloqueScientifique   {

@Id
    @SequenceGenerator(name="discipline_scientifique_evenement_colloque_scientifique_seq",sequenceName="discipline_scientifique_evenement_colloque_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="discipline_scientifique_evenement_colloque_scientifique_seq")
private Long id;


    @ManyToOne
    private EvenementColloqueScienntifique evenementColloqueScienntifique ;
    @ManyToOne
    private DisciplineScientifique disciplineScientifique ;


public DisciplineScientifiqueEvenementColloqueScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public EvenementColloqueScienntifique getEvenementColloqueScienntifique(){
            return this.evenementColloqueScienntifique;
            }
            public void setEvenementColloqueScienntifique(EvenementColloqueScienntifique evenementColloqueScienntifique){
            this.evenementColloqueScienntifique = evenementColloqueScienntifique;
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
        DisciplineScientifiqueEvenementColloqueScientifique disciplineScientifiqueEvenementColloqueScientifique = (DisciplineScientifiqueEvenementColloqueScientifique) o;
        return id != null && id.equals(disciplineScientifiqueEvenementColloqueScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

