package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



import javax.persistence.*;



@Entity
@Table(name = "responsabilite_pedagogique")
public class ResponsabilitePedagogique   {

@Id
    @SequenceGenerator(name="responsabilite_pedagogique_seq",sequenceName="responsabilite_pedagogique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="responsabilite_pedagogique_seq")
private Long id;

            @Column(length = 500)
            private String intituleCursus;
            @Column(columnDefinition = "boolean default false")
                 private Boolean serviceRenforcementCapacite = false;
            @Column(columnDefinition = "boolean default false")
                 private Boolean cursusConstruitAvecEtablissements = false;

    @ManyToOne
    private NiveauResponsabilitePedagogique niveauResponsabilitePedagogique ;
    @ManyToOne
    private StatusCursus statusCursus ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;
    @ManyToOne
    private EnseignementEtFormation enseignementEtFormation ;

                @OneToMany(mappedBy = "responsabilitePedagogique")
            private List<ResponsabilitePedagogiqueEnjeuxIrd> responsabilitePedagogiqueEnjeuxIrds ;
                @OneToMany(mappedBy = "responsabilitePedagogique")
            private List<ResponsabilitePedagogiqueEtablissement> responsabilitePedagogiqueEtablissements ;
                @OneToMany(mappedBy = "responsabilitePedagogique")
            private List<ResponsabilitePedagogiquePays> responsabilitePedagogiquePayss ;

public ResponsabilitePedagogique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public NiveauResponsabilitePedagogique getNiveauResponsabilitePedagogique(){
            return this.niveauResponsabilitePedagogique;
            }
            public void setNiveauResponsabilitePedagogique(NiveauResponsabilitePedagogique niveauResponsabilitePedagogique){
            this.niveauResponsabilitePedagogique = niveauResponsabilitePedagogique;
            }
            public StatusCursus getStatusCursus(){
            return this.statusCursus;
            }
            public void setStatusCursus(StatusCursus statusCursus){
            this.statusCursus = statusCursus;
            }
            public String getIntituleCursus(){
            return this.intituleCursus;
            }
            public void setIntituleCursus(String intituleCursus){
            this.intituleCursus = intituleCursus;
            }
            public List<ResponsabilitePedagogiqueEnjeuxIrd> getResponsabilitePedagogiqueEnjeuxIrds(){
            return this.responsabilitePedagogiqueEnjeuxIrds;
            }
            public void setResponsabilitePedagogiqueEnjeuxIrds(List<ResponsabilitePedagogiqueEnjeuxIrd> responsabilitePedagogiqueEnjeuxIrds){
            this.responsabilitePedagogiqueEnjeuxIrds = responsabilitePedagogiqueEnjeuxIrds;
            }
        public Boolean  getServiceRenforcementCapacite(){
        return this.serviceRenforcementCapacite;
        }
        public void setServiceRenforcementCapacite(Boolean serviceRenforcementCapacite){
        this.serviceRenforcementCapacite = serviceRenforcementCapacite;
        }
        public Boolean  getCursusConstruitAvecEtablissements(){
        return this.cursusConstruitAvecEtablissements;
        }
        public void setCursusConstruitAvecEtablissements(Boolean cursusConstruitAvecEtablissements){
        this.cursusConstruitAvecEtablissements = cursusConstruitAvecEtablissements;
        }
            public List<ResponsabilitePedagogiqueEtablissement> getResponsabilitePedagogiqueEtablissements(){
            return this.responsabilitePedagogiqueEtablissements;
            }
            public void setResponsabilitePedagogiqueEtablissements(List<ResponsabilitePedagogiqueEtablissement> responsabilitePedagogiqueEtablissements){
            this.responsabilitePedagogiqueEtablissements = responsabilitePedagogiqueEtablissements;
            }
            public List<ResponsabilitePedagogiquePays> getResponsabilitePedagogiquePayss(){
            return this.responsabilitePedagogiquePayss;
            }
            public void setResponsabilitePedagogiquePayss(List<ResponsabilitePedagogiquePays> responsabilitePedagogiquePayss){
            this.responsabilitePedagogiquePayss = responsabilitePedagogiquePayss;
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
        ResponsabilitePedagogique responsabilitePedagogique = (ResponsabilitePedagogique) o;
        return id != null && id.equals(responsabilitePedagogique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

