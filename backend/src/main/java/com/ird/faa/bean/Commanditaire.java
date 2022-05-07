package com.ird.faa.bean;

import java.util.Objects;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "commanditaire")
public class Commanditaire    implements Archivable  {

@Id
    @SequenceGenerator(name="commanditaire_seq",sequenceName="commanditaire_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="commanditaire_seq")
private Long id;

            @Column(length = 500)
            private String libelle;
            @Column(length = 500)
            private String code;
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
    private Pays pays ;


public Commanditaire(){
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
            public String getDescription(){
            return this.description;
            }
            public void setDescription(String description){
            this.description = description;
            }
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
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
        Commanditaire commanditaire = (Commanditaire) o;
        return id != null && id.equals(commanditaire.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

