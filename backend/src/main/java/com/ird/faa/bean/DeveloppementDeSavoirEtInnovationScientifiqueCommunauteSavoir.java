package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "developpement_de_savoir_et_innovation_scientifique_communaute_savoir")
public class DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir   {

@Id
    @SequenceGenerator(name="developpement_de_savoir_et_innovation_scientifique_communaute_savoir_seq",sequenceName="developpement_de_savoir_et_innovation_scientifique_communaute_savoir_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="developpement_de_savoir_et_innovation_scientifique_communaute_savoir_seq")
private Long id;


    @ManyToOne
    private CommunauteSavoir communauteSavoir ;
    @ManyToOne
    private DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique ;


public DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public CommunauteSavoir getCommunauteSavoir(){
            return this.communauteSavoir;
            }
            public void setCommunauteSavoir(CommunauteSavoir communauteSavoir){
            this.communauteSavoir = communauteSavoir;
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
        DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir = (DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir) o;
        return id != null && id.equals(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

