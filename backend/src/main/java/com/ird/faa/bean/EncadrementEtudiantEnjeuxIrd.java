package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "encadrement_etudiant_enjeux_ird")
public class EncadrementEtudiantEnjeuxIrd   {

@Id
    @SequenceGenerator(name="encadrement_etudiant_enjeux_ird_seq",sequenceName="encadrement_etudiant_enjeux_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="encadrement_etudiant_enjeux_ird_seq")
private Long id;


    @ManyToOne
    private EncadrementEtudiant encadrementEtudiant ;
    @ManyToOne
    private EnjeuxIrd enjeuxIrd ;


public EncadrementEtudiantEnjeuxIrd(){
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
        EncadrementEtudiantEnjeuxIrd encadrementEtudiantEnjeuxIrd = (EncadrementEtudiantEnjeuxIrd) o;
        return id != null && id.equals(encadrementEtudiantEnjeuxIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

