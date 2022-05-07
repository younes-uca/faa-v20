package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "discipline_scientifique_encadrement_etudiant")
public class DisciplineScientifiqueEncadrementEtudiant   {

@Id
    @SequenceGenerator(name="discipline_scientifique_encadrement_etudiant_seq",sequenceName="discipline_scientifique_encadrement_etudiant_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="discipline_scientifique_encadrement_etudiant_seq")
private Long id;


    @ManyToOne
    private DisciplineScientifique disciplineScientifique ;
    @ManyToOne
    private EncadrementEtudiant encadrementEtudiant ;


public DisciplineScientifiqueEncadrementEtudiant(){
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
            public EncadrementEtudiant getEncadrementEtudiant(){
            return this.encadrementEtudiant;
            }
            public void setEncadrementEtudiant(EncadrementEtudiant encadrementEtudiant){
            this.encadrementEtudiant = encadrementEtudiant;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisciplineScientifiqueEncadrementEtudiant disciplineScientifiqueEncadrementEtudiant = (DisciplineScientifiqueEncadrementEtudiant) o;
        return id != null && id.equals(disciplineScientifiqueEncadrementEtudiant.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

