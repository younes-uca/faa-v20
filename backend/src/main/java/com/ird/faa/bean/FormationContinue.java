package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "formation_continue")
public class FormationContinue   {

@Id
    @SequenceGenerator(name="formation_continue_seq",sequenceName="formation_continue_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="formation_continue_seq")
private Long id;

            @Column(length = 500)
            private String intitule;
            private BigDecimal nombreHeuresDispenseesDansAnnee ;

    @ManyToOne
    private ModaliteFormationContinue modaliteFormationContinue ;
    @ManyToOne
    private EnseignementEtFormation enseignementEtFormation ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "formationContinue")
            private List<FormationContinuePubliqueProfessionel> formationContinuePubliqueProfessionels ;
                @OneToMany(mappedBy = "formationContinue")
            private List<FormationContinueObjetFormationGenerique> formationContinueObjetFormationGeneriques ;
                @OneToMany(mappedBy = "formationContinue")
            private List<FormationContinueEnjeuxIrd> formationContinueEnjeuxIrds ;
                @OneToMany(mappedBy = "formationContinue")
            private List<FormationContinueDisciplineScientifique> formationContinueDisciplineScientifiques ;
                @OneToMany(mappedBy = "formationContinue")
            private List<PaysFormationContinue> paysFormationContinue ;
                @OneToMany(mappedBy = "formationContinue")
            private List<ZoneGeographiqueFormationContinue> zoneGeographiqueFormationContinues ;
                @OneToMany(mappedBy = "formationContinue")
            private List<FormationContinueCommanditaire> formationContinueCommanditaires ;

public FormationContinue(){
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
            public List<FormationContinuePubliqueProfessionel> getFormationContinuePubliqueProfessionels(){
            return this.formationContinuePubliqueProfessionels;
            }
            public void setFormationContinuePubliqueProfessionels(List<FormationContinuePubliqueProfessionel> formationContinuePubliqueProfessionels){
            this.formationContinuePubliqueProfessionels = formationContinuePubliqueProfessionels;
            }
            public BigDecimal getNombreHeuresDispenseesDansAnnee(){
            return this.nombreHeuresDispenseesDansAnnee;
            }
            public void setNombreHeuresDispenseesDansAnnee(BigDecimal nombreHeuresDispenseesDansAnnee){
            this.nombreHeuresDispenseesDansAnnee = nombreHeuresDispenseesDansAnnee;
            }
            public ModaliteFormationContinue getModaliteFormationContinue(){
            return this.modaliteFormationContinue;
            }
            public void setModaliteFormationContinue(ModaliteFormationContinue modaliteFormationContinue){
            this.modaliteFormationContinue = modaliteFormationContinue;
            }
            public List<FormationContinueObjetFormationGenerique> getFormationContinueObjetFormationGeneriques(){
            return this.formationContinueObjetFormationGeneriques;
            }
            public void setFormationContinueObjetFormationGeneriques(List<FormationContinueObjetFormationGenerique> formationContinueObjetFormationGeneriques){
            this.formationContinueObjetFormationGeneriques = formationContinueObjetFormationGeneriques;
            }
            public List<FormationContinueEnjeuxIrd> getFormationContinueEnjeuxIrds(){
            return this.formationContinueEnjeuxIrds;
            }
            public void setFormationContinueEnjeuxIrds(List<FormationContinueEnjeuxIrd> formationContinueEnjeuxIrds){
            this.formationContinueEnjeuxIrds = formationContinueEnjeuxIrds;
            }
            public List<FormationContinueDisciplineScientifique> getFormationContinueDisciplineScientifiques(){
            return this.formationContinueDisciplineScientifiques;
            }
            public void setFormationContinueDisciplineScientifiques(List<FormationContinueDisciplineScientifique> formationContinueDisciplineScientifiques){
            this.formationContinueDisciplineScientifiques = formationContinueDisciplineScientifiques;
            }
            public List<PaysFormationContinue> getPaysFormationContinue(){
            return this.paysFormationContinue;
            }
            public void setPaysFormationContinue(List<PaysFormationContinue> paysFormationContinue){
            this.paysFormationContinue = paysFormationContinue;
            }
            public List<ZoneGeographiqueFormationContinue> getZoneGeographiqueFormationContinues(){
            return this.zoneGeographiqueFormationContinues;
            }
            public void setZoneGeographiqueFormationContinues(List<ZoneGeographiqueFormationContinue> zoneGeographiqueFormationContinues){
            this.zoneGeographiqueFormationContinues = zoneGeographiqueFormationContinues;
            }
            public List<FormationContinueCommanditaire> getFormationContinueCommanditaires(){
            return this.formationContinueCommanditaires;
            }
            public void setFormationContinueCommanditaires(List<FormationContinueCommanditaire> formationContinueCommanditaires){
            this.formationContinueCommanditaires = formationContinueCommanditaires;
            }
            public EnseignementEtFormation getEnseignementEtFormation(){
            return this.enseignementEtFormation;
            }
            public void setEnseignementEtFormation(EnseignementEtFormation enseignementEtFormation){
            this.enseignementEtFormation = enseignementEtFormation;
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
        FormationContinue formationContinue = (FormationContinue) o;
        return id != null && id.equals(formationContinue.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

