package com.ird.faa.bean;

import java.util.Objects;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "etat_campagne")
public class EtatCampagne    implements Archivable  {

@Id
    @SequenceGenerator(name="etat_campagne_seq",sequenceName="etat_campagne_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etat_campagne_seq")
private Long id;

            @Column(length = 500)
            private String libelle;
            @Column(length = 500)
            private String code;
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
            private Integer ordre;
            @Column(columnDefinition = "boolean default false")
                 private Boolean archive = false;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateArchivage ;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateCreation ;
            @Column(columnDefinition = "boolean default false")
                 private Boolean admin = false;
            @Column(columnDefinition = "boolean default false")
                 private Boolean visible = false;
            @Column(length = 500)
            private String username;



public EtatCampagne(){
super();
}
public EtatCampagne(String libelle,String code){
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
        public Boolean  getArchive(){
        return this.archive;
        }
        public void setArchive(Boolean archive){
        this.archive = archive;
        }
            public Date getDateArchivage(){
            return this.dateArchivage;
            }
            public void setDateArchivage(Date dateArchivage){
            this.dateArchivage = dateArchivage;
            }
            public Date getDateCreation(){
            return this.dateCreation;
            }
            public void setDateCreation(Date dateCreation){
            this.dateCreation = dateCreation;
            }
        public Boolean  getAdmin(){
        return this.admin;
        }
        public void setAdmin(Boolean admin){
        this.admin = admin;
        }
        public Boolean  getVisible(){
        return this.visible;
        }
        public void setVisible(Boolean visible){
        this.visible = visible;
        }
            public String getUsername(){
            return this.username;
            }
            public void setUsername(String username){
            this.username = username;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtatCampagne etatCampagne = (EtatCampagne) o;
        return id != null && id.equals(etatCampagne.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

