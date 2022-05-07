package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "discipline_scientifique_conseils_scientifique")
public class DisciplineScientifiqueConseilsScientifique   {

@Id
    @SequenceGenerator(name="discipline_scientifique_conseils_scientifique_seq",sequenceName="discipline_scientifique_conseils_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="discipline_scientifique_conseils_scientifique_seq")
private Long id;


    @ManyToOne
    private ConseilsScientifique conseilsScientifique ;
    @ManyToOne
    private DisciplineScientifique disciplineScientifique ;


public DisciplineScientifiqueConseilsScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public ConseilsScientifique getConseilsScientifique(){
            return this.conseilsScientifique;
            }
            public void setConseilsScientifique(ConseilsScientifique conseilsScientifique){
            this.conseilsScientifique = conseilsScientifique;
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
        DisciplineScientifiqueConseilsScientifique disciplineScientifiqueConseilsScientifique = (DisciplineScientifiqueConseilsScientifique) o;
        return id != null && id.equals(disciplineScientifiqueConseilsScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

