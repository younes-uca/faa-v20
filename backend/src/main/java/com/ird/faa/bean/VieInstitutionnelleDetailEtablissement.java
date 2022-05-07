package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "vie_institutionnelle_detail_etablissement")
public class VieInstitutionnelleDetailEtablissement   {

@Id
    @SequenceGenerator(name="vie_institutionnelle_detail_etablissement_seq",sequenceName="vie_institutionnelle_detail_etablissement_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="vie_institutionnelle_detail_etablissement_seq")
private Long id;


    @ManyToOne
    private VieInstitutionnelleDetail vieInstitutionnelleDetail ;
    @ManyToOne
    private Etablissement etablissement ;


public VieInstitutionnelleDetailEtablissement(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public VieInstitutionnelleDetail getVieInstitutionnelleDetail(){
            return this.vieInstitutionnelleDetail;
            }
            public void setVieInstitutionnelleDetail(VieInstitutionnelleDetail vieInstitutionnelleDetail){
            this.vieInstitutionnelleDetail = vieInstitutionnelleDetail;
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
        VieInstitutionnelleDetailEtablissement vieInstitutionnelleDetailEtablissement = (VieInstitutionnelleDetailEtablissement) o;
        return id != null && id.equals(vieInstitutionnelleDetailEtablissement.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

