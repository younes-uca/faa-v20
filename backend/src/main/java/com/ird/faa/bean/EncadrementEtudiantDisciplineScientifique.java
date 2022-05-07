package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "encadrement_etudiant_discipline_scientifique")
public class EncadrementEtudiantDisciplineScientifique   {

@Id
    @SequenceGenerator(name="encadrement_etudiant_discipline_scientifique_seq",sequenceName="encadrement_etudiant_discipline_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="encadrement_etudiant_discipline_scientifique_seq")
private Long id;


    @ManyToOne
    private EncadrementEtudiant encadrementEtudiant ;
    @ManyToOne
    private DisciplineScientifique disciplineScientifique ;


public EncadrementEtudiantDisciplineScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public EncadrementEtudiant getEncadrementEtudiant(){
            return this.encadrementEtudiant;
            }
            public void setEncadrementEtudiant(EncadrementEtudiant encadrementEtudiant){
            this.encadrementEtudiant = encadrementEtudiant;
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
        EncadrementEtudiantDisciplineScientifique encadrementEtudiantDisciplineScientifique = (EncadrementEtudiantDisciplineScientifique) o;
        return id != null && id.equals(encadrementEtudiantDisciplineScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

