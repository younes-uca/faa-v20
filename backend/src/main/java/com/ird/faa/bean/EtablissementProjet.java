package com.ird.faa.bean;

import java.util.Objects;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "etablissement_projet")
public class EtablissementProjet    implements Archivable  {

@Id
    @SequenceGenerator(name="etablissement_projet_seq",sequenceName="etablissement_projet_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etablissement_projet_seq")
private Long id;

            @Column(length = 500)
            private String libelle;
            @Column(length = 500)
            private String code;
            @Lob
            @Column(columnDefinition="TEXT")
            private String description;
            @Column(length = 500)
            private String sigleOfficiel;
            @Column(length = 500)
            private String nomEnFrancais;
            @Column(length = 500)
            private String sigleEnFrancais;
            @Column(length = 500)
            private String anciensNom;
            @Column(length = 500)
            private String champIntervention;
            @Column(columnDefinition = "boolean default false")
                 private Boolean valide = false;
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
    private Ville ville ;
    @ManyToOne
    private Pays pays ;


public EtablissementProjet(){
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
            public String getSigleOfficiel(){
            return this.sigleOfficiel;
            }
            public void setSigleOfficiel(String sigleOfficiel){
            this.sigleOfficiel = sigleOfficiel;
            }
            public String getNomEnFrancais(){
            return this.nomEnFrancais;
            }
            public void setNomEnFrancais(String nomEnFrancais){
            this.nomEnFrancais = nomEnFrancais;
            }
            public String getSigleEnFrancais(){
            return this.sigleEnFrancais;
            }
            public void setSigleEnFrancais(String sigleEnFrancais){
            this.sigleEnFrancais = sigleEnFrancais;
            }
            public String getAnciensNom(){
            return this.anciensNom;
            }
            public void setAnciensNom(String anciensNom){
            this.anciensNom = anciensNom;
            }
            public Ville getVille(){
            return this.ville;
            }
            public void setVille(Ville ville){
            this.ville = ville;
            }
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
            }
            public String getChampIntervention(){
            return this.champIntervention;
            }
            public void setChampIntervention(String champIntervention){
            this.champIntervention = champIntervention;
            }
        public Boolean  getValide(){
        return this.valide;
        }
        public void setValide(Boolean valide){
        this.valide = valide;
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
        EtablissementProjet etablissementProjet = (EtablissementProjet) o;
        return id != null && id.equals(etablissementProjet.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

