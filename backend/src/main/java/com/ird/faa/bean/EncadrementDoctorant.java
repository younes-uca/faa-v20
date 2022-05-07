package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "encadrement_doctorant")
public class EncadrementDoctorant   {

@Id
    @SequenceGenerator(name="encadrement_doctorant_seq",sequenceName="encadrement_doctorant_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="encadrement_doctorant_seq")
private Long id;

            @Column(columnDefinition = "boolean default false")
                 private Boolean codirectionInternationale = false;
            @Column(columnDefinition = "boolean default false")
                 private Boolean cursus = false;
            @Column(length = 500)
            private String sujetThese;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateDebutThese ;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date datePrevuSoutenanceThese ;
            @Column(length = 500)
            private String intituleEcoleDoctorale;

    @ManyToOne
    private ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant ;
    @ManyToOne
    private FinancementDoctorant financementDoctorant ;
    @ManyToOne
    private Etablissement etablissement ;
    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private Doctorant doctorant ;
    @ManyToOne
    private Encadrement encadrement ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "encadrementDoctorant")
            private List<EnjeuxIrdEncadrementDoctorant> enjeuxIrdEncadrementDoctorants ;
                @OneToMany(mappedBy = "encadrementDoctorant")
            private List<DisciplineScientifiqueEncadrementDoctorant> disciplineScientifiqueEncadrementDoctorants ;
                @OneToMany(mappedBy = "encadrementDoctorant")
            private List<CommunauteSavoirEncadrementDoctorant> communauteSavoirEncadrementDoctorants ;

public EncadrementDoctorant(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public ResponsabiliteEncadrementDoctorant getResponsabiliteEncadrementDoctorant(){
            return this.responsabiliteEncadrementDoctorant;
            }
            public void setResponsabiliteEncadrementDoctorant(ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant){
            this.responsabiliteEncadrementDoctorant = responsabiliteEncadrementDoctorant;
            }
        public Boolean  getCodirectionInternationale(){
        return this.codirectionInternationale;
        }
        public void setCodirectionInternationale(Boolean codirectionInternationale){
        this.codirectionInternationale = codirectionInternationale;
        }
        public Boolean  getCursus(){
        return this.cursus;
        }
        public void setCursus(Boolean cursus){
        this.cursus = cursus;
        }
            public String getSujetThese(){
            return this.sujetThese;
            }
            public void setSujetThese(String sujetThese){
            this.sujetThese = sujetThese;
            }
            public List<EnjeuxIrdEncadrementDoctorant> getEnjeuxIrdEncadrementDoctorants(){
            return this.enjeuxIrdEncadrementDoctorants;
            }
            public void setEnjeuxIrdEncadrementDoctorants(List<EnjeuxIrdEncadrementDoctorant> enjeuxIrdEncadrementDoctorants){
            this.enjeuxIrdEncadrementDoctorants = enjeuxIrdEncadrementDoctorants;
            }
            public List<DisciplineScientifiqueEncadrementDoctorant> getDisciplineScientifiqueEncadrementDoctorants(){
            return this.disciplineScientifiqueEncadrementDoctorants;
            }
            public void setDisciplineScientifiqueEncadrementDoctorants(List<DisciplineScientifiqueEncadrementDoctorant> disciplineScientifiqueEncadrementDoctorants){
            this.disciplineScientifiqueEncadrementDoctorants = disciplineScientifiqueEncadrementDoctorants;
            }
            public List<CommunauteSavoirEncadrementDoctorant> getCommunauteSavoirEncadrementDoctorants(){
            return this.communauteSavoirEncadrementDoctorants;
            }
            public void setCommunauteSavoirEncadrementDoctorants(List<CommunauteSavoirEncadrementDoctorant> communauteSavoirEncadrementDoctorants){
            this.communauteSavoirEncadrementDoctorants = communauteSavoirEncadrementDoctorants;
            }
            public Date getDateDebutThese(){
            return this.dateDebutThese;
            }
            public void setDateDebutThese(Date dateDebutThese){
            this.dateDebutThese = dateDebutThese;
            }
            public Date getDatePrevuSoutenanceThese(){
            return this.datePrevuSoutenanceThese;
            }
            public void setDatePrevuSoutenanceThese(Date datePrevuSoutenanceThese){
            this.datePrevuSoutenanceThese = datePrevuSoutenanceThese;
            }
            public String getIntituleEcoleDoctorale(){
            return this.intituleEcoleDoctorale;
            }
            public void setIntituleEcoleDoctorale(String intituleEcoleDoctorale){
            this.intituleEcoleDoctorale = intituleEcoleDoctorale;
            }
            public FinancementDoctorant getFinancementDoctorant(){
            return this.financementDoctorant;
            }
            public void setFinancementDoctorant(FinancementDoctorant financementDoctorant){
            this.financementDoctorant = financementDoctorant;
            }
            public Etablissement getEtablissement(){
            return this.etablissement;
            }
            public void setEtablissement(Etablissement etablissement){
            this.etablissement = etablissement;
            }
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
            }
            public Doctorant getDoctorant(){
            return this.doctorant;
            }
            public void setDoctorant(Doctorant doctorant){
            this.doctorant = doctorant;
            }
            public Encadrement getEncadrement(){
            return this.encadrement;
            }
            public void setEncadrement(Encadrement encadrement){
            this.encadrement = encadrement;
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
        EncadrementDoctorant encadrementDoctorant = (EncadrementDoctorant) o;
        return id != null && id.equals(encadrementDoctorant.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

