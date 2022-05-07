package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "communaute_savoir_expertise_scientifique")
public class CommunauteSavoirExpertiseScientifique   {

@Id
    @SequenceGenerator(name="communaute_savoir_expertise_scientifique_seq",sequenceName="communaute_savoir_expertise_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="communaute_savoir_expertise_scientifique_seq")
private Long id;


    @ManyToOne
    private CommunauteSavoir communauteSavoir ;
    @ManyToOne
    private ExpertiseScientifique expertiseScientifique ;


public CommunauteSavoirExpertiseScientifique(){
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
            public ExpertiseScientifique getExpertiseScientifique(){
            return this.expertiseScientifique;
            }
            public void setExpertiseScientifique(ExpertiseScientifique expertiseScientifique){
            this.expertiseScientifique = expertiseScientifique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommunauteSavoirExpertiseScientifique communauteSavoirExpertiseScientifique = (CommunauteSavoirExpertiseScientifique) o;
        return id != null && id.equals(communauteSavoirExpertiseScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

