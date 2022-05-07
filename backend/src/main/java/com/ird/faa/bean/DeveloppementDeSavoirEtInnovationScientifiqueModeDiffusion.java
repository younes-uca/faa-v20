package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "developpement_de_savoir_et_innovation_scientifique_mode_diffusion")
public class DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion   {

@Id
    @SequenceGenerator(name="developpement_de_savoir_et_innovation_scientifique_mode_diffusion_seq",sequenceName="developpement_de_savoir_et_innovation_scientifique_mode_diffusion_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="developpement_de_savoir_et_innovation_scientifique_mode_diffusion_seq")
private Long id;


    @ManyToOne
    private ModeDiffusion modeDiffusion ;
    @ManyToOne
    private DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique ;


public DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public ModeDiffusion getModeDiffusion(){
            return this.modeDiffusion;
            }
            public void setModeDiffusion(ModeDiffusion modeDiffusion){
            this.modeDiffusion = modeDiffusion;
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
        DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion developpementDeSavoirEtInnovationScientifiqueModeDiffusion = (DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion) o;
        return id != null && id.equals(developpementDeSavoirEtInnovationScientifiqueModeDiffusion.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

