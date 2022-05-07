package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "rencontre_grand_publique_jeune_publique_enjeux_ird")
public class RencontreGrandPubliqueJeunePubliqueEnjeuxIrd   {

@Id
    @SequenceGenerator(name="rencontre_grand_publique_jeune_publique_enjeux_ird_seq",sequenceName="rencontre_grand_publique_jeune_publique_enjeux_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="rencontre_grand_publique_jeune_publique_enjeux_ird_seq")
private Long id;


    @ManyToOne
    private RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique ;
    @ManyToOne
    private EnjeuxIrd enjeuxIrd ;


public RencontreGrandPubliqueJeunePubliqueEnjeuxIrd(){
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
            public EnjeuxIrd getEnjeuxIrd(){
            return this.enjeuxIrd;
            }
            public void setEnjeuxIrd(EnjeuxIrd enjeuxIrd){
            this.enjeuxIrd = enjeuxIrd;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RencontreGrandPubliqueJeunePubliqueEnjeuxIrd rencontreGrandPubliqueJeunePubliqueEnjeuxIrd = (RencontreGrandPubliqueJeunePubliqueEnjeuxIrd) o;
        return id != null && id.equals(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

