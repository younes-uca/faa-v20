package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "projet_activite_recherche_detail_etablissement_lanceur")
public class ProjetActiviteRechercheDetailEtablissementLanceur   {

@Id
    @SequenceGenerator(name="projet_activite_recherche_detail_etablissement_lanceur_seq",sequenceName="projet_activite_recherche_detail_etablissement_lanceur_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="projet_activite_recherche_detail_etablissement_lanceur_seq")
private Long id;


    @ManyToOne
    private Etablissement etablissement ;
    @ManyToOne
    private ProjetActiviteRechercheDetail projetActiviteRechercheDetail ;


public ProjetActiviteRechercheDetailEtablissementLanceur(){
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
            public ProjetActiviteRechercheDetail getProjetActiviteRechercheDetail(){
            return this.projetActiviteRechercheDetail;
            }
            public void setProjetActiviteRechercheDetail(ProjetActiviteRechercheDetail projetActiviteRechercheDetail){
            this.projetActiviteRechercheDetail = projetActiviteRechercheDetail;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjetActiviteRechercheDetailEtablissementLanceur projetActiviteRechercheDetailEtablissementLanceur = (ProjetActiviteRechercheDetailEtablissementLanceur) o;
        return id != null && id.equals(projetActiviteRechercheDetailEtablissementLanceur.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

