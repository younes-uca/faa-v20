package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "enseignement")
public class Enseignement   {

@Id
    @SequenceGenerator(name="enseignement_seq",sequenceName="enseignement_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="enseignement_seq")
private Long id;

            @Column(length = 500)
            private String intitule;
            private BigDecimal nombreHeure ;
            @Column(columnDefinition = "boolean default false")
                 private Boolean etabilssementNonReconnu = false;

    @ManyToOne
    private ModaliteEtude modaliteEtude ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;
    @ManyToOne
    private EnseignementEtFormation enseignementEtFormation ;

                @OneToMany(mappedBy = "enseignement")
            private List<TypeEtudeEnseignement> typeEtudeEnseignements ;
                @OneToMany(mappedBy = "enseignement")
            private List<EnseignementNature> enseignementNatures ;
                @OneToMany(mappedBy = "enseignement")
            private List<NiveauEtudeEnseignement> niveauEtudeEnseignements ;
                @OneToMany(mappedBy = "enseignement")
            private List<EtablissementEnseignement> etablissementEnseignements ;
                @OneToMany(mappedBy = "enseignement")
            private List<EnseignementZoneGeographique> enseignementZoneGeographiques ;
                @OneToMany(mappedBy = "enseignement")
            private List<EnseignementEnjeuxIrd> enseignementEnjeuxIrds ;
                @OneToMany(mappedBy = "enseignement")
            private List<EnseignementDisciplineScientifique> enseignementDisciplineScientifiques ;

public Enseignement(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public String getIntitule(){
            return this.intitule;
            }
            public void setIntitule(String intitule){
            this.intitule = intitule;
            }
            public BigDecimal getNombreHeure(){
            return this.nombreHeure;
            }
            public void setNombreHeure(BigDecimal nombreHeure){
            this.nombreHeure = nombreHeure;
            }
            public ModaliteEtude getModaliteEtude(){
            return this.modaliteEtude;
            }
            public void setModaliteEtude(ModaliteEtude modaliteEtude){
            this.modaliteEtude = modaliteEtude;
            }
            public List<TypeEtudeEnseignement> getTypeEtudeEnseignements(){
            return this.typeEtudeEnseignements;
            }
            public void setTypeEtudeEnseignements(List<TypeEtudeEnseignement> typeEtudeEnseignements){
            this.typeEtudeEnseignements = typeEtudeEnseignements;
            }
            public List<EnseignementNature> getEnseignementNatures(){
            return this.enseignementNatures;
            }
            public void setEnseignementNatures(List<EnseignementNature> enseignementNatures){
            this.enseignementNatures = enseignementNatures;
            }
            public List<NiveauEtudeEnseignement> getNiveauEtudeEnseignements(){
            return this.niveauEtudeEnseignements;
            }
            public void setNiveauEtudeEnseignements(List<NiveauEtudeEnseignement> niveauEtudeEnseignements){
            this.niveauEtudeEnseignements = niveauEtudeEnseignements;
            }
        public Boolean  getEtabilssementNonReconnu(){
        return this.etabilssementNonReconnu;
        }
        public void setEtabilssementNonReconnu(Boolean etabilssementNonReconnu){
        this.etabilssementNonReconnu = etabilssementNonReconnu;
        }
            public List<EtablissementEnseignement> getEtablissementEnseignements(){
            return this.etablissementEnseignements;
            }
            public void setEtablissementEnseignements(List<EtablissementEnseignement> etablissementEnseignements){
            this.etablissementEnseignements = etablissementEnseignements;
            }
            public List<EnseignementZoneGeographique> getEnseignementZoneGeographiques(){
            return this.enseignementZoneGeographiques;
            }
            public void setEnseignementZoneGeographiques(List<EnseignementZoneGeographique> enseignementZoneGeographiques){
            this.enseignementZoneGeographiques = enseignementZoneGeographiques;
            }
            public List<EnseignementEnjeuxIrd> getEnseignementEnjeuxIrds(){
            return this.enseignementEnjeuxIrds;
            }
            public void setEnseignementEnjeuxIrds(List<EnseignementEnjeuxIrd> enseignementEnjeuxIrds){
            this.enseignementEnjeuxIrds = enseignementEnjeuxIrds;
            }
            public List<EnseignementDisciplineScientifique> getEnseignementDisciplineScientifiques(){
            return this.enseignementDisciplineScientifiques;
            }
            public void setEnseignementDisciplineScientifiques(List<EnseignementDisciplineScientifique> enseignementDisciplineScientifiques){
            this.enseignementDisciplineScientifiques = enseignementDisciplineScientifiques;
            }
            public EtatEtapeCampagne getEtatEtapeCampagne(){
            return this.etatEtapeCampagne;
            }
            public void setEtatEtapeCampagne(EtatEtapeCampagne etatEtapeCampagne){
            this.etatEtapeCampagne = etatEtapeCampagne;
            }
            public EnseignementEtFormation getEnseignementEtFormation(){
            return this.enseignementEtFormation;
            }
            public void setEnseignementEtFormation(EnseignementEtFormation enseignementEtFormation){
            this.enseignementEtFormation = enseignementEtFormation;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enseignement enseignement = (Enseignement) o;
        return id != null && id.equals(enseignement.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

