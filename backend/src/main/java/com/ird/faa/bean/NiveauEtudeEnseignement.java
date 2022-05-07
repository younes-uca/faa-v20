package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "niveau_etude_enseignement")
public class NiveauEtudeEnseignement   {

@Id
    @SequenceGenerator(name="niveau_etude_enseignement_seq",sequenceName="niveau_etude_enseignement_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="niveau_etude_enseignement_seq")
private Long id;


    @ManyToOne
    private NiveauEtude niveauEtude ;
    @ManyToOne
    private Enseignement enseignement ;


public NiveauEtudeEnseignement(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public NiveauEtude getNiveauEtude(){
            return this.niveauEtude;
            }
            public void setNiveauEtude(NiveauEtude niveauEtude){
            this.niveauEtude = niveauEtude;
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
        NiveauEtudeEnseignement niveauEtudeEnseignement = (NiveauEtudeEnseignement) o;
        return id != null && id.equals(niveauEtudeEnseignement.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

