package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "etablissement_enseignement")
public class EtablissementEnseignement   {

@Id
    @SequenceGenerator(name="etablissement_enseignement_seq",sequenceName="etablissement_enseignement_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etablissement_enseignement_seq")
private Long id;


    @ManyToOne
    private Etablissement etablissement ;
    @ManyToOne
    private Enseignement enseignement ;


public EtablissementEnseignement(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public Etablissement getEtablissement(){
            return this.etablissement;
            }
            public void setEtablissement(Etablissement etablissement){
            this.etablissement = etablissement;
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
        EtablissementEnseignement etablissementEnseignement = (EtablissementEnseignement) o;
        return id != null && id.equals(etablissementEnseignement.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

