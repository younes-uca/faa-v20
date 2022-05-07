package com.ird.faa.bean;

import java.util.Objects;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "niveau_formation")
public class NiveauFormation    implements Archivable  {

@Id
    @SequenceGenerator(name="niveau_formation_seq",sequenceName="niveau_formation_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="niveau_formation_seq")
private Long id;

            @Column(length = 500)
            private String libelleMicro;
            @Column(length = 500)
            private String libelleMacro;
            @Column(length = 500)
            private String code;
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



public NiveauFormation(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public String getLibelleMicro(){
            return this.libelleMicro;
            }
            public void setLibelleMicro(String libelleMicro){
            this.libelleMicro = libelleMicro;
            }
            public String getLibelleMacro(){
            return this.libelleMacro;
            }
            public void setLibelleMacro(String libelleMacro){
            this.libelleMacro = libelleMacro;
            }
            public String getCode(){
            return this.code;
            }
            public void setCode(String code){
            this.code = code;
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
        NiveauFormation niveauFormation = (NiveauFormation) o;
        return id != null && id.equals(niveauFormation.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

