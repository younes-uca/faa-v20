package com.ird.faa.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "expertise")
public class Expertise {

    @Id
    @SequenceGenerator(name = "expertise_seq", sequenceName = "expertise_seq",
            allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "expertise_seq")
    private Long id;

    private BigDecimal tempsEstimePourCetteAnnne;
    private Long annee;

    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne;
    @ManyToOne
    private Chercheur chercheur;
    @ManyToOne
    private Campagne campagne;

    @OneToMany(mappedBy = "expertise")
    private List<ConseilsScientifique> conseilsScientifiques;
    @OneToMany(mappedBy = "expertise")
    private List<ConsultanceScientifiquePonctuelle> consultanceScientifiquePonctuelles;
    @OneToMany(mappedBy = "expertise")
    private List<ComiteEtCommissionEvaluation> comiteEtCommissionEvaluations;

    public Expertise() {
        super();
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTempsEstimePourCetteAnnne() {
        return this.tempsEstimePourCetteAnnne;
    }

    public void setTempsEstimePourCetteAnnne(BigDecimal tempsEstimePourCetteAnnne) {
        this.tempsEstimePourCetteAnnne = tempsEstimePourCetteAnnne;
    }

    public Long getAnnee() {
        return this.annee;
    }

    public void setAnnee(Long annee) {
        this.annee = annee;
    }

    public List<ConseilsScientifique> getConseilsScientifiques() {
        return this.conseilsScientifiques;
    }

    public void setConseilsScientifiques(List<ConseilsScientifique> conseilsScientifiques) {
        this.conseilsScientifiques = conseilsScientifiques;
    }

    public List<ConsultanceScientifiquePonctuelle> getConsultanceScientifiquePonctuelles() {
        return this.consultanceScientifiquePonctuelles;
    }

    public void setConsultanceScientifiquePonctuelles(List<ConsultanceScientifiquePonctuelle> consultanceScientifiquePonctuelles) {
        this.consultanceScientifiquePonctuelles = consultanceScientifiquePonctuelles;
    }

    public List<ComiteEtCommissionEvaluation> getComiteEtCommissionEvaluations() {
        return this.comiteEtCommissionEvaluations;
    }

    public void setComiteEtCommissionEvaluations(List<ComiteEtCommissionEvaluation> comiteEtCommissionEvaluations) {
        this.comiteEtCommissionEvaluations = comiteEtCommissionEvaluations;
    }

    public EtatEtapeCampagne getEtatEtapeCampagne() {
        return this.etatEtapeCampagne;
    }

    public void setEtatEtapeCampagne(EtatEtapeCampagne etatEtapeCampagne) {
        this.etatEtapeCampagne = etatEtapeCampagne;
    }

    public Chercheur getChercheur() {
        return this.chercheur;
    }

    public void setChercheur(Chercheur chercheur) {
        this.chercheur = chercheur;
    }

    public Campagne getCampagne() {
        return this.campagne;
    }

    public void setCampagne(Campagne campagne) {
        this.campagne = campagne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expertise expertise = (Expertise) o;
        return id != null && id.equals(expertise.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

