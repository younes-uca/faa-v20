package com.ird.faa.bean;

import java.util.Objects;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "entite_administrative")
public class EntiteAdministrative    implements Archivable  {

@Id
    @SequenceGenerator(name="entite_administrative_seq",sequenceName="entite_administrative_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="entite_administrative_seq")
private Long id;

            @Column(length = 500)
            private String libelle;
            @Column(length = 500)
            private String code;
            @Column(length = 500)
            private String identifiantNational;
            @Column(length = 500)
            private String siteWeb;
            @Column(length = 500)
            private String libelleCourt;
            @Column(length = 500)
            private String libelleLong;
            @Lob
            @Column(columnDefinition="TEXT")
            private String description;
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

    @ManyToOne
    private TypeEntiteAdministrative typeEntiteAdministrative ;


public EntiteAdministrative(){
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
            public String getIdentifiantNational(){
            return this.identifiantNational;
            }
            public void setIdentifiantNational(String identifiantNational){
            this.identifiantNational = identifiantNational;
            }
            public String getSiteWeb(){
            return this.siteWeb;
            }
            public void setSiteWeb(String siteWeb){
            this.siteWeb = siteWeb;
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
            public String getDescription(){
            return this.description;
            }
            public void setDescription(String description){
            this.description = description;
            }
            public TypeEntiteAdministrative getTypeEntiteAdministrative(){
            return this.typeEntiteAdministrative;
            }
            public void setTypeEntiteAdministrative(TypeEntiteAdministrative typeEntiteAdministrative){
            this.typeEntiteAdministrative = typeEntiteAdministrative;
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
        EntiteAdministrative entiteAdministrative = (EntiteAdministrative) o;
        return id != null && id.equals(entiteAdministrative.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}
