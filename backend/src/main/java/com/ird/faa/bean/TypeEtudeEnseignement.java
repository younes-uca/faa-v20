package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "type_etude_enseignement")
public class TypeEtudeEnseignement   {

@Id
    @SequenceGenerator(name="type_etude_enseignement_seq",sequenceName="type_etude_enseignement_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_etude_enseignement_seq")
private Long id;


    @ManyToOne
    private Enseignement enseignement ;
    @ManyToOne
    private TypeEtude typeEtude ;


public TypeEtudeEnseignement(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public Enseignement getEnseignement(){
            return this.enseignement;
            }
            public void setEnseignement(Enseignement enseignement){
            this.enseignement = enseignement;
            }
            public TypeEtude getTypeEtude(){
            return this.typeEtude;
            }
            public void setTypeEtude(TypeEtude typeEtude){
            this.typeEtude = typeEtude;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeEtudeEnseignement typeEtudeEnseignement = (TypeEtudeEnseignement) o;
        return id != null && id.equals(typeEtudeEnseignement.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

