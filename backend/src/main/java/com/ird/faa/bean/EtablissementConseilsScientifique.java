package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "etablissement_conseils_scientifique")
public class EtablissementConseilsScientifique   {

@Id
    @SequenceGenerator(name="etablissement_conseils_scientifique_seq",sequenceName="etablissement_conseils_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etablissement_conseils_scientifique_seq")
private Long id;


    @ManyToOne
    private ConseilsScientifique conseilsScientifique ;
    @ManyToOne
    private Etablissement etablissement ;


public EtablissementConseilsScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public ConseilsScientifique getConseilsScientifique(){
            return this.conseilsScientifique;
            }
            public void setConseilsScientifique(ConseilsScientifique conseilsScientifique){
            this.conseilsScientifique = conseilsScientifique;
            }
            public Etablissement getEtablissement(){
            return this.etablissement;
            }
            public void setEtablissement(Etablissement etablissement){
            this.etablissement = etablissement;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtablissementConseilsScientifique etablissementConseilsScientifique = (EtablissementConseilsScientifique) o;
        return id != null && id.equals(etablissementConseilsScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

