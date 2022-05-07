package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "projet_activite_recherche_detail_pays")
public class ProjetActiviteRechercheDetailPays   {

@Id
    @SequenceGenerator(name="projet_activite_recherche_detail_pays_seq",sequenceName="projet_activite_recherche_detail_pays_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="projet_activite_recherche_detail_pays_seq")
private Long id;


    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private ProjetActiviteRechercheDetail projetActiviteRechercheDetail ;


public ProjetActiviteRechercheDetailPays(){
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
        ProjetActiviteRechercheDetailPays projetActiviteRechercheDetailPays = (ProjetActiviteRechercheDetailPays) o;
        return id != null && id.equals(projetActiviteRechercheDetailPays.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

