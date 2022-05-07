package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "type_publique_rencontre_grand_publique_jeune_publique")
public class TypePubliqueRencontreGrandPubliqueJeunePublique   {

@Id
    @SequenceGenerator(name="type_publique_rencontre_grand_publique_jeune_publique_seq",sequenceName="type_publique_rencontre_grand_publique_jeune_publique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_publique_rencontre_grand_publique_jeune_publique_seq")
private Long id;


    @ManyToOne
    private RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique ;
    @ManyToOne
    private TypePublique typePublique ;


public TypePubliqueRencontreGrandPubliqueJeunePublique(){
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
            public TypePublique getTypePublique(){
            return this.typePublique;
            }
            public void setTypePublique(TypePublique typePublique){
            this.typePublique = typePublique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypePubliqueRencontreGrandPubliqueJeunePublique typePubliqueRencontreGrandPubliqueJeunePublique = (TypePubliqueRencontreGrandPubliqueJeunePublique) o;
        return id != null && id.equals(typePubliqueRencontreGrandPubliqueJeunePublique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

