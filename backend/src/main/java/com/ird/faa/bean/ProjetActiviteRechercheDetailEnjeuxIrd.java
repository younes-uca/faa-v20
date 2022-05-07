package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "projet_activite_recherche_detail_enjeux_ird")
public class ProjetActiviteRechercheDetailEnjeuxIrd   {

@Id
    @SequenceGenerator(name="projet_activite_recherche_detail_enjeux_ird_seq",sequenceName="projet_activite_recherche_detail_enjeux_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="projet_activite_recherche_detail_enjeux_ird_seq")
private Long id;


    @ManyToOne
    private EnjeuxIrd enjeuxIrd ;
    @ManyToOne
    private ProjetActiviteRechercheDetail projetActiviteRechercheDetail ;


public ProjetActiviteRechercheDetailEnjeuxIrd(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public EnjeuxIrd getEnjeuxIrd(){
            return this.enjeuxIrd;
            }
            public void setEnjeuxIrd(EnjeuxIrd enjeuxIrd){
            this.enjeuxIrd = enjeuxIrd;
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
        ProjetActiviteRechercheDetailEnjeuxIrd projetActiviteRechercheDetailEnjeuxIrd = (ProjetActiviteRechercheDetailEnjeuxIrd) o;
        return id != null && id.equals(projetActiviteRechercheDetailEnjeuxIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

