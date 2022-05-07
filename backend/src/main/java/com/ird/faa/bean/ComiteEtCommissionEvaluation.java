package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "comite_et_commission_evaluation")
public class ComiteEtCommissionEvaluation   {

@Id
    @SequenceGenerator(name="comite_et_commission_evaluation_seq",sequenceName="comite_et_commission_evaluation_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="comite_et_commission_evaluation_seq")
private Long id;

            @Column(length = 500)
            private String nom;
            @Column(length = 500)
            private String nomRevueOuEditeur;
            @Column(length = 500)
            private String role;
            private BigDecimal nombreJourDedie ;
            @Column(columnDefinition = "boolean default false")
                 private Boolean relieeInstrumentsIrd = false;
            @Lob
            @Column(columnDefinition="TEXT")
            private String commentaire;

    @ManyToOne
    private NatureExpertise natureExpertise ;
    @ManyToOne
    private Expertise expertise ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "comiteEtCommissionEvaluation")
            private List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> typeExpertiseEvaluationComiteEtCommissionEvaluations ;
                @OneToMany(mappedBy = "comiteEtCommissionEvaluation")
            private List<EtablissementComiteEtCommissionEvaluation> etablissementComiteEtCommissionEvaluations ;
                @OneToMany(mappedBy = "comiteEtCommissionEvaluation")
            private List<RoleComiteEtCommissionEvaluation> roleComiteEtCommissionEvaluations ;
                @OneToMany(mappedBy = "comiteEtCommissionEvaluation")
            private List<DisciplineScientifiqueComiteEtCommissionEvaluation> disciplineScientifiqueComiteEtCommissionEvaluations ;
                @OneToMany(mappedBy = "comiteEtCommissionEvaluation")
            private List<EnjeuxIrdComiteEtCommissionEvaluation> enjeuxIrdComiteEtCommissionEvaluations ;
                @OneToMany(mappedBy = "comiteEtCommissionEvaluation")
            private List<InstrumentIrdComiteEtCommissionEvaluation> instrumentIrdComiteEtCommissionEvaluations ;

public ComiteEtCommissionEvaluation(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> getTypeExpertiseEvaluationComiteEtCommissionEvaluations(){
            return this.typeExpertiseEvaluationComiteEtCommissionEvaluations;
            }
            public void setTypeExpertiseEvaluationComiteEtCommissionEvaluations(List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> typeExpertiseEvaluationComiteEtCommissionEvaluations){
            this.typeExpertiseEvaluationComiteEtCommissionEvaluations = typeExpertiseEvaluationComiteEtCommissionEvaluations;
            }
            public NatureExpertise getNatureExpertise(){
            return this.natureExpertise;
            }
            public void setNatureExpertise(NatureExpertise natureExpertise){
            this.natureExpertise = natureExpertise;
            }
            public String getNom(){
            return this.nom;
            }
            public void setNom(String nom){
            this.nom = nom;
            }
            public List<EtablissementComiteEtCommissionEvaluation> getEtablissementComiteEtCommissionEvaluations(){
            return this.etablissementComiteEtCommissionEvaluations;
            }
            public void setEtablissementComiteEtCommissionEvaluations(List<EtablissementComiteEtCommissionEvaluation> etablissementComiteEtCommissionEvaluations){
            this.etablissementComiteEtCommissionEvaluations = etablissementComiteEtCommissionEvaluations;
            }
            public String getNomRevueOuEditeur(){
            return this.nomRevueOuEditeur;
            }
            public void setNomRevueOuEditeur(String nomRevueOuEditeur){
            this.nomRevueOuEditeur = nomRevueOuEditeur;
            }
            public List<RoleComiteEtCommissionEvaluation> getRoleComiteEtCommissionEvaluations(){
            return this.roleComiteEtCommissionEvaluations;
            }
            public void setRoleComiteEtCommissionEvaluations(List<RoleComiteEtCommissionEvaluation> roleComiteEtCommissionEvaluations){
            this.roleComiteEtCommissionEvaluations = roleComiteEtCommissionEvaluations;
            }
            public String getRole(){
            return this.role;
            }
            public void setRole(String role){
            this.role = role;
            }
            public BigDecimal getNombreJourDedie(){
            return this.nombreJourDedie;
            }
            public void setNombreJourDedie(BigDecimal nombreJourDedie){
            this.nombreJourDedie = nombreJourDedie;
            }
            public List<DisciplineScientifiqueComiteEtCommissionEvaluation> getDisciplineScientifiqueComiteEtCommissionEvaluations(){
            return this.disciplineScientifiqueComiteEtCommissionEvaluations;
            }
            public void setDisciplineScientifiqueComiteEtCommissionEvaluations(List<DisciplineScientifiqueComiteEtCommissionEvaluation> disciplineScientifiqueComiteEtCommissionEvaluations){
            this.disciplineScientifiqueComiteEtCommissionEvaluations = disciplineScientifiqueComiteEtCommissionEvaluations;
            }
            public List<EnjeuxIrdComiteEtCommissionEvaluation> getEnjeuxIrdComiteEtCommissionEvaluations(){
            return this.enjeuxIrdComiteEtCommissionEvaluations;
            }
            public void setEnjeuxIrdComiteEtCommissionEvaluations(List<EnjeuxIrdComiteEtCommissionEvaluation> enjeuxIrdComiteEtCommissionEvaluations){
            this.enjeuxIrdComiteEtCommissionEvaluations = enjeuxIrdComiteEtCommissionEvaluations;
            }
        public Boolean  getRelieeInstrumentsIrd(){
        return this.relieeInstrumentsIrd;
        }
        public void setRelieeInstrumentsIrd(Boolean relieeInstrumentsIrd){
        this.relieeInstrumentsIrd = relieeInstrumentsIrd;
        }
            public List<InstrumentIrdComiteEtCommissionEvaluation> getInstrumentIrdComiteEtCommissionEvaluations(){
            return this.instrumentIrdComiteEtCommissionEvaluations;
            }
            public void setInstrumentIrdComiteEtCommissionEvaluations(List<InstrumentIrdComiteEtCommissionEvaluation> instrumentIrdComiteEtCommissionEvaluations){
            this.instrumentIrdComiteEtCommissionEvaluations = instrumentIrdComiteEtCommissionEvaluations;
            }
            public String getCommentaire(){
            return this.commentaire;
            }
            public void setCommentaire(String commentaire){
            this.commentaire = commentaire;
            }
            public Expertise getExpertise(){
            return this.expertise;
            }
            public void setExpertise(Expertise expertise){
            this.expertise = expertise;
            }
            public EtatEtapeCampagne getEtatEtapeCampagne(){
            return this.etatEtapeCampagne;
            }
            public void setEtatEtapeCampagne(EtatEtapeCampagne etatEtapeCampagne){
            this.etatEtapeCampagne = etatEtapeCampagne;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComiteEtCommissionEvaluation comiteEtCommissionEvaluation = (ComiteEtCommissionEvaluation) o;
        return id != null && id.equals(comiteEtCommissionEvaluation.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

