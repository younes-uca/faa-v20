package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "discipline_scientifique_expertise_scientifique")
public class DisciplineScientifiqueExpertiseScientifique   {

@Id
    @SequenceGenerator(name="discipline_scientifique_expertise_scientifique_seq",sequenceName="discipline_scientifique_expertise_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="discipline_scientifique_expertise_scientifique_seq")
private Long id;


    @ManyToOne
    private DisciplineScientifique disciplineScientifique ;
    @ManyToOne
    private ExpertiseScientifique expertiseScientifique ;


public DisciplineScientifiqueExpertiseScientifique(){
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
            public ExpertiseScientifique getExpertiseScientifique(){
            return this.expertiseScientifique;
            }
            public void setExpertiseScientifique(ExpertiseScientifique expertiseScientifique){
            this.expertiseScientifique = expertiseScientifique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisciplineScientifiqueExpertiseScientifique disciplineScientifiqueExpertiseScientifique = (DisciplineScientifiqueExpertiseScientifique) o;
        return id != null && id.equals(disciplineScientifiqueExpertiseScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

