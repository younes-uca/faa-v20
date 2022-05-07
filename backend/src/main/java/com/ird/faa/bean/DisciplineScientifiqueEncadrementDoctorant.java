package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "discipline_scientifique_encadrement_doctorant")
public class DisciplineScientifiqueEncadrementDoctorant   {

@Id
    @SequenceGenerator(name="discipline_scientifique_encadrement_doctorant_seq",sequenceName="discipline_scientifique_encadrement_doctorant_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="discipline_scientifique_encadrement_doctorant_seq")
private Long id;


    @ManyToOne
    private EncadrementDoctorant encadrementDoctorant ;
    @ManyToOne
    private DisciplineScientifique disciplineScientifique ;


public DisciplineScientifiqueEncadrementDoctorant(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public EncadrementDoctorant getEncadrementDoctorant(){
            return this.encadrementDoctorant;
            }
            public void setEncadrementDoctorant(EncadrementDoctorant encadrementDoctorant){
            this.encadrementDoctorant = encadrementDoctorant;
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
        DisciplineScientifiqueEncadrementDoctorant disciplineScientifiqueEncadrementDoctorant = (DisciplineScientifiqueEncadrementDoctorant) o;
        return id != null && id.equals(disciplineScientifiqueEncadrementDoctorant.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

