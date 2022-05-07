package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "responsabilite_pedagogique_etablissement")
public class ResponsabilitePedagogiqueEtablissement   {

@Id
    @SequenceGenerator(name="responsabilite_pedagogique_etablissement_seq",sequenceName="responsabilite_pedagogique_etablissement_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="responsabilite_pedagogique_etablissement_seq")
private Long id;


    @ManyToOne
    private Etablissement etablissement ;
    @ManyToOne
    private ResponsabilitePedagogique responsabilitePedagogique ;
    @ManyToOne
    private Pays pays ;


public ResponsabilitePedagogiqueEtablissement(){
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
            public ResponsabilitePedagogique getResponsabilitePedagogique(){
            return this.responsabilitePedagogique;
            }
            public void setResponsabilitePedagogique(ResponsabilitePedagogique responsabilitePedagogique){
            this.responsabilitePedagogique = responsabilitePedagogique;
            }
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponsabilitePedagogiqueEtablissement responsabilitePedagogiqueEtablissement = (ResponsabilitePedagogiqueEtablissement) o;
        return id != null && id.equals(responsabilitePedagogiqueEtablissement.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

