package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "responsabilite_pedagogique_pays")
public class ResponsabilitePedagogiquePays   {

@Id
    @SequenceGenerator(name="responsabilite_pedagogique_pays_seq",sequenceName="responsabilite_pedagogique_pays_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="responsabilite_pedagogique_pays_seq")
private Long id;


    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private ResponsabilitePedagogique responsabilitePedagogique ;


public ResponsabilitePedagogiquePays(){
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
            public ResponsabilitePedagogique getResponsabilitePedagogique(){
            return this.responsabilitePedagogique;
            }
            public void setResponsabilitePedagogique(ResponsabilitePedagogique responsabilitePedagogique){
            this.responsabilitePedagogique = responsabilitePedagogique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponsabilitePedagogiquePays responsabilitePedagogiquePays = (ResponsabilitePedagogiquePays) o;
        return id != null && id.equals(responsabilitePedagogiquePays.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

