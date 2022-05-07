package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "enseignement_discipline_scientifique")
public class EnseignementDisciplineScientifique   {

@Id
    @SequenceGenerator(name="enseignement_discipline_scientifique_seq",sequenceName="enseignement_discipline_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="enseignement_discipline_scientifique_seq")
private Long id;


    @ManyToOne
    private DisciplineScientifique disciplineScientifique ;
    @ManyToOne
    private Enseignement enseignement ;


public EnseignementDisciplineScientifique(){
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
            public Enseignement getEnseignement(){
            return this.enseignement;
            }
            public void setEnseignement(Enseignement enseignement){
            this.enseignement = enseignement;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnseignementDisciplineScientifique enseignementDisciplineScientifique = (EnseignementDisciplineScientifique) o;
        return id != null && id.equals(enseignementDisciplineScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

