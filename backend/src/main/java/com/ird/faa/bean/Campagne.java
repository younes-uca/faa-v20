package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "campagne")
public class Campagne   {

@Id
    @SequenceGenerator(name="campagne_seq",sequenceName="campagne_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="campagne_seq")
private Long id;

            @Column(length = 500)
            private String libelle;
            @Column(length = 500)
            private String code;
            private Long annee ;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateDepart ;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateFin ;
            @Column(length = 500)
            private String objetOuverture;
            @Lob
            @Column(columnDefinition="TEXT")
            private String messageOuverture;
            @Column(length = 500)
            private String objetCloture;
            @Lob
            @Column(columnDefinition="TEXT")
            private String messageCloture;

    @ManyToOne
    private EtatCampagne etatCampagne ;
    @ManyToOne
    private TemplateOuverture templateOuverture ;
    @ManyToOne
    private TemplateCloture templateCloture ;

                @OneToMany(mappedBy = "campagne")
            private List<CampagneChercheurOuverture> campagneChercheurOuvertures ;
                @OneToMany(mappedBy = "campagne")
            private List<CampagneChercheurFermeture> campagneChercheurFermetures ;
                @OneToMany(mappedBy = "campagne")
            private List<CampagneRelance> campagneRelances ;
                @OneToMany(mappedBy = "campagne")
            private List<CampagneRappel> campagneRappels ;
                @OneToMany(mappedBy = "campagne")
            private List<Distinction> distinctions ;
                @OneToMany(mappedBy = "campagne")
            private List<ProjetActiviteRecherche> projetActiviteRecherches ;
                @OneToMany(mappedBy = "campagne")
            private List<InstrumentsEtDispositifsIrd> instrumentsEtDispositifsIrds ;
                @OneToMany(mappedBy = "campagne")
            private List<GestionEquipe> gestionEquipes ;

public Campagne(){
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
            public Long getAnnee(){
            return this.annee;
            }
            public void setAnnee(Long annee){
            this.annee = annee;
            }
            public Date getDateDepart(){
            return this.dateDepart;
            }
            public void setDateDepart(Date dateDepart){
            this.dateDepart = dateDepart;
            }
            public Date getDateFin(){
            return this.dateFin;
            }
            public void setDateFin(Date dateFin){
            this.dateFin = dateFin;
            }
            public EtatCampagne getEtatCampagne(){
            return this.etatCampagne;
            }
            public void setEtatCampagne(EtatCampagne etatCampagne){
            this.etatCampagne = etatCampagne;
            }
            public TemplateOuverture getTemplateOuverture(){
            return this.templateOuverture;
            }
            public void setTemplateOuverture(TemplateOuverture templateOuverture){
            this.templateOuverture = templateOuverture;
            }
            public String getObjetOuverture(){
            return this.objetOuverture;
            }
            public void setObjetOuverture(String objetOuverture){
            this.objetOuverture = objetOuverture;
            }
            public String getMessageOuverture(){
            return this.messageOuverture;
            }
            public void setMessageOuverture(String messageOuverture){
            this.messageOuverture = messageOuverture;
            }
            public TemplateCloture getTemplateCloture(){
            return this.templateCloture;
            }
            public void setTemplateCloture(TemplateCloture templateCloture){
            this.templateCloture = templateCloture;
            }
            public String getObjetCloture(){
            return this.objetCloture;
            }
            public void setObjetCloture(String objetCloture){
            this.objetCloture = objetCloture;
            }
            public String getMessageCloture(){
            return this.messageCloture;
            }
            public void setMessageCloture(String messageCloture){
            this.messageCloture = messageCloture;
            }
            public List<CampagneChercheurOuverture> getCampagneChercheurOuvertures(){
            return this.campagneChercheurOuvertures;
            }
            public void setCampagneChercheurOuvertures(List<CampagneChercheurOuverture> campagneChercheurOuvertures){
            this.campagneChercheurOuvertures = campagneChercheurOuvertures;
            }
            public List<CampagneChercheurFermeture> getCampagneChercheurFermetures(){
            return this.campagneChercheurFermetures;
            }
            public void setCampagneChercheurFermetures(List<CampagneChercheurFermeture> campagneChercheurFermetures){
            this.campagneChercheurFermetures = campagneChercheurFermetures;
            }
            public List<CampagneRelance> getCampagneRelances(){
            return this.campagneRelances;
            }
            public void setCampagneRelances(List<CampagneRelance> campagneRelances){
            this.campagneRelances = campagneRelances;
            }
            public List<CampagneRappel> getCampagneRappels(){
            return this.campagneRappels;
            }
            public void setCampagneRappels(List<CampagneRappel> campagneRappels){
            this.campagneRappels = campagneRappels;
            }
            public List<Distinction> getDistinctions(){
            return this.distinctions;
            }
            public void setDistinctions(List<Distinction> distinctions){
            this.distinctions = distinctions;
            }
            public List<ProjetActiviteRecherche> getProjetActiviteRecherches(){
            return this.projetActiviteRecherches;
            }
            public void setProjetActiviteRecherches(List<ProjetActiviteRecherche> projetActiviteRecherches){
            this.projetActiviteRecherches = projetActiviteRecherches;
            }
            public List<InstrumentsEtDispositifsIrd> getInstrumentsEtDispositifsIrds(){
            return this.instrumentsEtDispositifsIrds;
            }
            public void setInstrumentsEtDispositifsIrds(List<InstrumentsEtDispositifsIrd> instrumentsEtDispositifsIrds){
            this.instrumentsEtDispositifsIrds = instrumentsEtDispositifsIrds;
            }
            public List<GestionEquipe> getGestionEquipes(){
            return this.gestionEquipes;
            }
            public void setGestionEquipes(List<GestionEquipe> gestionEquipes){
            this.gestionEquipes = gestionEquipes;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Campagne campagne = (Campagne) o;
        return id != null && id.equals(campagne.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

