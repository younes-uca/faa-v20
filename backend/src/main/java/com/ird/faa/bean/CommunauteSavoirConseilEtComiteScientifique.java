package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "communaute_savoir_conseil_et_comite_scientifique")
public class CommunauteSavoirConseilEtComiteScientifique   {

@Id
    @SequenceGenerator(name="communaute_savoir_conseil_et_comite_scientifique_seq",sequenceName="communaute_savoir_conseil_et_comite_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="communaute_savoir_conseil_et_comite_scientifique_seq")
private Long id;


    @ManyToOne
    private CommunauteSavoir communauteSavoir ;
    @ManyToOne
    private ConseilEtComiteScientifique conseilEtComiteScientifique ;


public CommunauteSavoirConseilEtComiteScientifique(){
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
            public ConseilEtComiteScientifique getConseilEtComiteScientifique(){
            return this.conseilEtComiteScientifique;
            }
            public void setConseilEtComiteScientifique(ConseilEtComiteScientifique conseilEtComiteScientifique){
            this.conseilEtComiteScientifique = conseilEtComiteScientifique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommunauteSavoirConseilEtComiteScientifique communauteSavoirConseilEtComiteScientifique = (CommunauteSavoirConseilEtComiteScientifique) o;
        return id != null && id.equals(communauteSavoirConseilEtComiteScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

