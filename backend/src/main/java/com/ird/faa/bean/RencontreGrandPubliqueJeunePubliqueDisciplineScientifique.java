package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "rencontre_grand_publique_jeune_publique_discipline_scientifique")
public class RencontreGrandPubliqueJeunePubliqueDisciplineScientifique   {

@Id
    @SequenceGenerator(name="rencontre_grand_publique_jeune_publique_discipline_scientifique_seq",sequenceName="rencontre_grand_publique_jeune_publique_discipline_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="rencontre_grand_publique_jeune_publique_discipline_scientifique_seq")
private Long id;


    @ManyToOne
    private RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique ;
    @ManyToOne
    private DisciplineScientifique disciplineScientifique ;


public RencontreGrandPubliqueJeunePubliqueDisciplineScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public RencontreGrandPubliqueJeunePublique getRencontreGrandPubliqueJeunePublique(){
            return this.rencontreGrandPubliqueJeunePublique;
            }
            public void setRencontreGrandPubliqueJeunePublique(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
            this.rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePublique;
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
        RencontreGrandPubliqueJeunePubliqueDisciplineScientifique rencontreGrandPubliqueJeunePubliqueDisciplineScientifique = (RencontreGrandPubliqueJeunePubliqueDisciplineScientifique) o;
        return id != null && id.equals(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

