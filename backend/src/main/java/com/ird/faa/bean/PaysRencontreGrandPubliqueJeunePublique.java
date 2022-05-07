package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "pays_rencontre_grand_publique_jeune_publique")
public class PaysRencontreGrandPubliqueJeunePublique   {

@Id
    @SequenceGenerator(name="pays_rencontre_grand_publique_jeune_publique_seq",sequenceName="pays_rencontre_grand_publique_jeune_publique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="pays_rencontre_grand_publique_jeune_publique_seq")
private Long id;


    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique ;


public PaysRencontreGrandPubliqueJeunePublique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
            }
            public RencontreGrandPubliqueJeunePublique getRencontreGrandPubliqueJeunePublique(){
            return this.rencontreGrandPubliqueJeunePublique;
            }
            public void setRencontreGrandPubliqueJeunePublique(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
            this.rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePublique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaysRencontreGrandPubliqueJeunePublique paysRencontreGrandPubliqueJeunePublique = (PaysRencontreGrandPubliqueJeunePublique) o;
        return id != null && id.equals(paysRencontreGrandPubliqueJeunePublique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

