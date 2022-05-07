package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "developpement_de_savoir_et_innovation_scientifique_etablissement")
public class DeveloppementDeSavoirEtInnovationScientifiqueEtablissement   {

@Id
    @SequenceGenerator(name="developpement_de_savoir_et_innovation_scientifique_etablissement_seq",sequenceName="developpement_de_savoir_et_innovation_scientifique_etablissement_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="developpement_de_savoir_et_innovation_scientifique_etablissement_seq")
private Long id;


    @ManyToOne
    private Etablissement etablissement ;
    @ManyToOne
    private DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique ;


public DeveloppementDeSavoirEtInnovationScientifiqueEtablissement(){
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
            public DeveloppementDeSavoirEtInnovationScientifique getDeveloppementDeSavoirEtInnovationScientifique(){
            return this.developpementDeSavoirEtInnovationScientifique;
            }
            public void setDeveloppementDeSavoirEtInnovationScientifique(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique){
            this.developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeveloppementDeSavoirEtInnovationScientifiqueEtablissement developpementDeSavoirEtInnovationScientifiqueEtablissement = (DeveloppementDeSavoirEtInnovationScientifiqueEtablissement) o;
        return id != null && id.equals(developpementDeSavoirEtInnovationScientifiqueEtablissement.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

