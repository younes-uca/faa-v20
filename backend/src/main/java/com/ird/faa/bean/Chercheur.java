package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;

import com.ird.faa.security.bean.User;


@Entity
@Table(name = "chercheur")
public class Chercheur  extends User  {


    public Chercheur(String username) {
    super(username);
    }
            @Column(columnDefinition = "boolean default false")
                 private Boolean consentementRgpd = false;
            @Column(length = 500)
            private String numeroMatricule;
            @Column(length = 500)
            private String emailPrincipale;
            @Lob
            @Column(columnDefinition="TEXT")
            private String resume;
            @Column(length = 500)
            private String natureImplication;
            @Column(columnDefinition = "boolean default false")
                 private Boolean formationEnManagement = false;
            @Column(columnDefinition = "boolean default false")
                private boolean credentialsNonExpired = false;
            @Column(columnDefinition = "boolean default false")
                private boolean enabled = false;
            @Column(columnDefinition = "boolean default false")
                private boolean accountNonExpired = false;
            @Column(columnDefinition = "boolean default false")
                private boolean accountNonLocked = false;
            @Column(columnDefinition = "boolean default false")
                private boolean passwordChanged = false;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date createdAt ;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date updatedAt ;
            @Column(length = 500)
            private String username;
            @Column(length = 500)
            private String password;
            @Column(length = 500)
            private String prenom;
            @Column(length = 500)
            private String nom;
            @Column(length = 500)
            private String baseHorizon;
          @Transient
        private String role;

    @ManyToOne
    private AffectationStructurelle affectationStructurelle ;
    @ManyToOne
    private EntiteAdministrative entiteAdministrative ;
    @ManyToOne
    private TypeEntiteAdministrative typeEntiteAdministrative ;
    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private Ville ville ;
    @ManyToOne
    private DepartementScientifique departementScientifique ;
    @ManyToOne
    private CommissionScientifique commissionScientifique ;
    @ManyToOne
    private Grade grade ;
    @ManyToOne
    private Corps corps ;
    @ManyToOne
    private Sexe sexe ;

                @OneToMany(mappedBy = "chercheur")
            private List<ChercheurEmail> chercheurEmails ;
                @OneToMany(mappedBy = "chercheur")
            private List<DisciplineScientifiqueChercheur> disciplineScientifiqueChercheurs ;
                @OneToMany(mappedBy = "chercheur")
            private List<ZoneActiviteInteractionRecherche> zoneActiviteInteractionRecherches ;
                @OneToMany(mappedBy = "chercheur")
            private List<EnjeuxIrdChercheur> enjeuxIrdChercheurs ;
                @OneToMany(mappedBy = "chercheur")
            private List<CommunauteSavoirChercheur> communauteSavoirChercheurs ;
                @OneToMany(mappedBy = "chercheur")
            private List<InstrumentIrdChercheur> instrumentIrdChercheurs ;
                @OneToMany(mappedBy = "chercheur")
            private List<TypeInstrumentIrdChercheur> typeInstrumentIrdChercheurs ;
                @OneToMany(mappedBy = "chercheur")
            private List<IdentifiantAuteurExpert> identifiantAuteurExperts ;

public Chercheur(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
        public Boolean  getConsentementRgpd(){
        return this.consentementRgpd;
        }
        public void setConsentementRgpd(Boolean consentementRgpd){
        this.consentementRgpd = consentementRgpd;
        }
            public String getNumeroMatricule(){
            return this.numeroMatricule;
            }
            public void setNumeroMatricule(String numeroMatricule){
            this.numeroMatricule = numeroMatricule;
            }
            public String getEmailPrincipale(){
            return this.emailPrincipale;
            }
            public void setEmailPrincipale(String emailPrincipale){
            this.emailPrincipale = emailPrincipale;
            }
            public List<ChercheurEmail> getChercheurEmails(){
            return this.chercheurEmails;
            }
            public void setChercheurEmails(List<ChercheurEmail> chercheurEmails){
            this.chercheurEmails = chercheurEmails;
            }
            public AffectationStructurelle getAffectationStructurelle(){
            return this.affectationStructurelle;
            }
            public void setAffectationStructurelle(AffectationStructurelle affectationStructurelle){
            this.affectationStructurelle = affectationStructurelle;
            }
            public EntiteAdministrative getEntiteAdministrative(){
            return this.entiteAdministrative;
            }
            public void setEntiteAdministrative(EntiteAdministrative entiteAdministrative){
            this.entiteAdministrative = entiteAdministrative;
            }
            public TypeEntiteAdministrative getTypeEntiteAdministrative(){
            return this.typeEntiteAdministrative;
            }
            public void setTypeEntiteAdministrative(TypeEntiteAdministrative typeEntiteAdministrative){
            this.typeEntiteAdministrative = typeEntiteAdministrative;
            }
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
            }
            public Ville getVille(){
            return this.ville;
            }
            public void setVille(Ville ville){
            this.ville = ville;
            }
            public DepartementScientifique getDepartementScientifique(){
            return this.departementScientifique;
            }
            public void setDepartementScientifique(DepartementScientifique departementScientifique){
            this.departementScientifique = departementScientifique;
            }
            public CommissionScientifique getCommissionScientifique(){
            return this.commissionScientifique;
            }
            public void setCommissionScientifique(CommissionScientifique commissionScientifique){
            this.commissionScientifique = commissionScientifique;
            }
            public Grade getGrade(){
            return this.grade;
            }
            public void setGrade(Grade grade){
            this.grade = grade;
            }
            public Corps getCorps(){
            return this.corps;
            }
            public void setCorps(Corps corps){
            this.corps = corps;
            }
            public Sexe getSexe(){
            return this.sexe;
            }
            public void setSexe(Sexe sexe){
            this.sexe = sexe;
            }
            public List<DisciplineScientifiqueChercheur> getDisciplineScientifiqueChercheurs(){
            return this.disciplineScientifiqueChercheurs;
            }
            public void setDisciplineScientifiqueChercheurs(List<DisciplineScientifiqueChercheur> disciplineScientifiqueChercheurs){
            this.disciplineScientifiqueChercheurs = disciplineScientifiqueChercheurs;
            }
            public List<ZoneActiviteInteractionRecherche> getZoneActiviteInteractionRecherches(){
            return this.zoneActiviteInteractionRecherches;
            }
            public void setZoneActiviteInteractionRecherches(List<ZoneActiviteInteractionRecherche> zoneActiviteInteractionRecherches){
            this.zoneActiviteInteractionRecherches = zoneActiviteInteractionRecherches;
            }
            public List<EnjeuxIrdChercheur> getEnjeuxIrdChercheurs(){
            return this.enjeuxIrdChercheurs;
            }
            public void setEnjeuxIrdChercheurs(List<EnjeuxIrdChercheur> enjeuxIrdChercheurs){
            this.enjeuxIrdChercheurs = enjeuxIrdChercheurs;
            }
            public List<CommunauteSavoirChercheur> getCommunauteSavoirChercheurs(){
            return this.communauteSavoirChercheurs;
            }
            public void setCommunauteSavoirChercheurs(List<CommunauteSavoirChercheur> communauteSavoirChercheurs){
            this.communauteSavoirChercheurs = communauteSavoirChercheurs;
            }
            public List<InstrumentIrdChercheur> getInstrumentIrdChercheurs(){
            return this.instrumentIrdChercheurs;
            }
            public void setInstrumentIrdChercheurs(List<InstrumentIrdChercheur> instrumentIrdChercheurs){
            this.instrumentIrdChercheurs = instrumentIrdChercheurs;
            }
            public List<TypeInstrumentIrdChercheur> getTypeInstrumentIrdChercheurs(){
            return this.typeInstrumentIrdChercheurs;
            }
            public void setTypeInstrumentIrdChercheurs(List<TypeInstrumentIrdChercheur> typeInstrumentIrdChercheurs){
            this.typeInstrumentIrdChercheurs = typeInstrumentIrdChercheurs;
            }
            public List<IdentifiantAuteurExpert> getIdentifiantAuteurExperts(){
            return this.identifiantAuteurExperts;
            }
            public void setIdentifiantAuteurExperts(List<IdentifiantAuteurExpert> identifiantAuteurExperts){
            this.identifiantAuteurExperts = identifiantAuteurExperts;
            }
            public String getResume(){
            return this.resume;
            }
            public void setResume(String resume){
            this.resume = resume;
            }
            public String getNatureImplication(){
            return this.natureImplication;
            }
            public void setNatureImplication(String natureImplication){
            this.natureImplication = natureImplication;
            }
        public Boolean  getFormationEnManagement(){
        return this.formationEnManagement;
        }
        public void setFormationEnManagement(Boolean formationEnManagement){
        this.formationEnManagement = formationEnManagement;
        }
        public boolean  getCredentialsNonExpired(){
        return this.credentialsNonExpired;
        }
        public void setCredentialsNonExpired(boolean credentialsNonExpired){
        this.credentialsNonExpired = credentialsNonExpired;
        }
        public boolean  getEnabled(){
        return this.enabled;
        }
        public void setEnabled(boolean enabled){
        this.enabled = enabled;
        }
        public boolean  getAccountNonExpired(){
        return this.accountNonExpired;
        }
        public void setAccountNonExpired(boolean accountNonExpired){
        this.accountNonExpired = accountNonExpired;
        }
        public boolean  getAccountNonLocked(){
        return this.accountNonLocked;
        }
        public void setAccountNonLocked(boolean accountNonLocked){
        this.accountNonLocked = accountNonLocked;
        }
        public boolean  getPasswordChanged(){
        return this.passwordChanged;
        }
        public void setPasswordChanged(boolean passwordChanged){
        this.passwordChanged = passwordChanged;
        }
            public Date getCreatedAt(){
            return this.createdAt;
            }
            public void setCreatedAt(Date createdAt){
            this.createdAt = createdAt;
            }
            public Date getUpdatedAt(){
            return this.updatedAt;
            }
            public void setUpdatedAt(Date updatedAt){
            this.updatedAt = updatedAt;
            }
            public String getUsername(){
            return this.username;
            }
            public void setUsername(String username){
            this.username = username;
            }
            public String getPassword(){
            return this.password;
            }
            public void setPassword(String password){
            this.password = password;
            }
            public String getPrenom(){
            return this.prenom;
            }
            public void setPrenom(String prenom){
            this.prenom = prenom;
            }
            public String getNom(){
            return this.nom;
            }
            public void setNom(String nom){
            this.nom = nom;
            }
            public String getBaseHorizon(){
            return this.baseHorizon;
            }
            public void setBaseHorizon(String baseHorizon){
            this.baseHorizon = baseHorizon;
            }
            public String getRole(){
            return this.role;
            }
            public void setRole(String role){
            this.role = role;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chercheur chercheur = (Chercheur) o;
        return id != null && id.equals(chercheur.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

