package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "affectation_structurelle")
public class AffectationStructurelle   {

@Id
    @SequenceGenerator(name="affectation_structurelle_seq",sequenceName="affectation_structurelle_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="affectation_structurelle_seq")
private Long id;

            @Column(length = 500)
            private String code;
            @Column(length = 500)
            private String libelleCourt;
            @Column(length = 500)
            private String libelleLong;



public AffectationStructurelle(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public String getCode(){
            return this.code;
            }
            public void setCode(String code){
            this.code = code;
            }
            public String getLibelleCourt(){
            return this.libelleCourt;
            }
            public void setLibelleCourt(String libelleCourt){
            this.libelleCourt = libelleCourt;
            }
            public String getLibelleLong(){
            return this.libelleLong;
            }
            public void setLibelleLong(String libelleLong){
            this.libelleLong = libelleLong;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AffectationStructurelle affectationStructurelle = (AffectationStructurelle) o;
        return id != null && id.equals(affectationStructurelle.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

