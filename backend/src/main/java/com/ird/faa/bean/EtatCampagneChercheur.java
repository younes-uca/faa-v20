package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "etat_campagne_chercheur")
public class EtatCampagneChercheur   {

@Id
    @SequenceGenerator(name="etat_campagne_chercheur_seq",sequenceName="etat_campagne_chercheur_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etat_campagne_chercheur_seq")
private Long id;

            @Column(length = 500)
            private String libelle;
            @Column(length = 500)
            private String code;
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
            private Integer ordre;



public EtatCampagneChercheur(){
super();
}
public EtatCampagneChercheur(String libelle,String code){
this.libelle=libelle;
this.code=code;
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public String getLibelle(){
            return this.libelle;
            }
            public void setLibelle(String libelle){
            this.libelle = libelle;
            }
            public String getCode(){
            return this.code;
            }
            public void setCode(String code){
            this.code = code;
            }
            public Integer getOrdre(){
            return this.ordre;
            }
            public void setOrdre(Integer ordre){
            this.ordre = ordre;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtatCampagneChercheur etatCampagneChercheur = (EtatCampagneChercheur) o;
        return id != null && id.equals(etatCampagneChercheur.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

