package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "developpement_de_savoir_et_innovation_scientifique_pays")
public class DeveloppementDeSavoirEtInnovationScientifiquePays   {

@Id
    @SequenceGenerator(name="developpement_de_savoir_et_innovation_scientifique_pays_seq",sequenceName="developpement_de_savoir_et_innovation_scientifique_pays_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="developpement_de_savoir_et_innovation_scientifique_pays_seq")
private Long id;


    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique ;


public DeveloppementDeSavoirEtInnovationScientifiquePays(){
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
        DeveloppementDeSavoirEtInnovationScientifiquePays developpementDeSavoirEtInnovationScientifiquePays = (DeveloppementDeSavoirEtInnovationScientifiquePays) o;
        return id != null && id.equals(developpementDeSavoirEtInnovationScientifiquePays.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

