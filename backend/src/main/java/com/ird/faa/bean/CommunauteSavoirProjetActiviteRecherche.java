package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "communaute_savoir_projet_activite_recherche")
public class CommunauteSavoirProjetActiviteRecherche   {

@Id
    @SequenceGenerator(name="communaute_savoir_projet_activite_recherche_seq",sequenceName="communaute_savoir_projet_activite_recherche_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="communaute_savoir_projet_activite_recherche_seq")
private Long id;


    @ManyToOne
    private ProjetActiviteRecherche projetActiviteRecherche ;
    @ManyToOne
    private CommunauteSavoir communauteSavoir ;


public CommunauteSavoirProjetActiviteRecherche(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public ProjetActiviteRecherche getProjetActiviteRecherche(){
            return this.projetActiviteRecherche;
            }
            public void setProjetActiviteRecherche(ProjetActiviteRecherche projetActiviteRecherche){
            this.projetActiviteRecherche = projetActiviteRecherche;
            }
            public CommunauteSavoir getCommunauteSavoir(){
            return this.communauteSavoir;
            }
            public void setCommunauteSavoir(CommunauteSavoir communauteSavoir){
            this.communauteSavoir = communauteSavoir;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommunauteSavoirProjetActiviteRecherche communauteSavoirProjetActiviteRecherche = (CommunauteSavoirProjetActiviteRecherche) o;
        return id != null && id.equals(communauteSavoirProjetActiviteRecherche.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

