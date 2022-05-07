package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "objet_formation_generique_de_responsabilite_pedagogique")
public class ObjetFormationGeneriqueDeResponsabilitePedagogique   {

@Id
    @SequenceGenerator(name="objet_formation_generique_de_responsabilite_pedagogique_seq",sequenceName="objet_formation_generique_de_responsabilite_pedagogique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="objet_formation_generique_de_responsabilite_pedagogique_seq")
private Long id;


    @ManyToOne
    private ObjetFormationGenerique objetFormationGenerique ;
    @ManyToOne
    private ResponsabilitePedagogique responsabilitePedagogique ;


public ObjetFormationGeneriqueDeResponsabilitePedagogique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public ObjetFormationGenerique getObjetFormationGenerique(){
            return this.objetFormationGenerique;
            }
            public void setObjetFormationGenerique(ObjetFormationGenerique objetFormationGenerique){
            this.objetFormationGenerique = objetFormationGenerique;
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
        ObjetFormationGeneriqueDeResponsabilitePedagogique objetFormationGeneriqueDeResponsabilitePedagogique = (ObjetFormationGeneriqueDeResponsabilitePedagogique) o;
        return id != null && id.equals(objetFormationGeneriqueDeResponsabilitePedagogique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

