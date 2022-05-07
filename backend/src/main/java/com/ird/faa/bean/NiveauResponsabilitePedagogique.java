package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "niveau_responsabilite_pedagogique")
public class NiveauResponsabilitePedagogique   {

@Id
    @SequenceGenerator(name="niveau_responsabilite_pedagogique_seq",sequenceName="niveau_responsabilite_pedagogique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="niveau_responsabilite_pedagogique_seq")
private Long id;

            @Column(length = 500)
            private String libelle;
            @Column(length = 500)
            private String code;



public NiveauResponsabilitePedagogique(){
super();
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

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NiveauResponsabilitePedagogique niveauResponsabilitePedagogique = (NiveauResponsabilitePedagogique) o;
        return id != null && id.equals(niveauResponsabilitePedagogique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

