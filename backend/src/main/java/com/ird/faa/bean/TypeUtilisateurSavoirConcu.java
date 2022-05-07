package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "type_utilisateur_savoir_concu")
public class TypeUtilisateurSavoirConcu   {

@Id
    @SequenceGenerator(name="type_utilisateur_savoir_concu_seq",sequenceName="type_utilisateur_savoir_concu_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_utilisateur_savoir_concu_seq")
private Long id;


    @ManyToOne
    private TypeUtilisateur typeUtilisateur ;
    @ManyToOne
    private DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique ;


public TypeUtilisateurSavoirConcu(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public TypeUtilisateur getTypeUtilisateur(){
            return this.typeUtilisateur;
            }
            public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur){
            this.typeUtilisateur = typeUtilisateur;
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
        TypeUtilisateurSavoirConcu typeUtilisateurSavoirConcu = (TypeUtilisateurSavoirConcu) o;
        return id != null && id.equals(typeUtilisateurSavoirConcu.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

