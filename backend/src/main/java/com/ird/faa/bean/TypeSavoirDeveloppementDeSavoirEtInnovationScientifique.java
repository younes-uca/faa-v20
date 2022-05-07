package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "type_savoir_developpement_de_savoir_et_innovation_scientifique")
public class TypeSavoirDeveloppementDeSavoirEtInnovationScientifique   {

@Id
    @SequenceGenerator(name="type_savoir_developpement_de_savoir_et_innovation_scientifique_seq",sequenceName="type_savoir_developpement_de_savoir_et_innovation_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_savoir_developpement_de_savoir_et_innovation_scientifique_seq")
private Long id;


    @ManyToOne
    private DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique ;
    @ManyToOne
    private TypeSavoir typeSavoir ;


public TypeSavoirDeveloppementDeSavoirEtInnovationScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public DeveloppementDeSavoirEtInnovationScientifique getDeveloppementDeSavoirEtInnovationScientifique(){
            return this.developpementDeSavoirEtInnovationScientifique;
            }
            public void setDeveloppementDeSavoirEtInnovationScientifique(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique){
            this.developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifique;
            }
            public TypeSavoir getTypeSavoir(){
            return this.typeSavoir;
            }
            public void setTypeSavoir(TypeSavoir typeSavoir){
            this.typeSavoir = typeSavoir;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeSavoirDeveloppementDeSavoirEtInnovationScientifique typeSavoirDeveloppementDeSavoirEtInnovationScientifique = (TypeSavoirDeveloppementDeSavoirEtInnovationScientifique) o;
        return id != null && id.equals(typeSavoirDeveloppementDeSavoirEtInnovationScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

