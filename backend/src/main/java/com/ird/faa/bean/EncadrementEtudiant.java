package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



import javax.persistence.*;



@Entity
@Table(name = "encadrement_etudiant")
public class EncadrementEtudiant   {

@Id
    @SequenceGenerator(name="encadrement_etudiant_seq",sequenceName="encadrement_etudiant_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="encadrement_etudiant_seq")
private Long id;

            @Column(length = 500)
            private String sujetEtude;
            @Column(length = 500)
            private String cursus;

    @ManyToOne
    private NiveauFormationPostBac niveauFormationPostBac ;
    @ManyToOne
    private ResponsabiliteDirectionEncadrementEtudiant responsabiliteDirectionEncadrementEtudiant ;
    @ManyToOne
    private Etudiant etudiant ;
    @ManyToOne
    private Etablissement etablissement ;
    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private Encadrement encadrement ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "encadrementEtudiant")
            private List<EncadrementEtudiantEnjeuxIrd> encadrementEtudiantEnjeuxIrds ;
                @OneToMany(mappedBy = "encadrementEtudiant")
            private List<EncadrementEtudiantDisciplineScientifique> encadrementEtudiantDisciplineScientifiques ;

public EncadrementEtudiant(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public NiveauFormationPostBac getNiveauFormationPostBac(){
            return this.niveauFormationPostBac;
            }
            public void setNiveauFormationPostBac(NiveauFormationPostBac niveauFormationPostBac){
            this.niveauFormationPostBac = niveauFormationPostBac;
            }
            public ResponsabiliteDirectionEncadrementEtudiant getResponsabiliteDirectionEncadrementEtudiant(){
            return this.responsabiliteDirectionEncadrementEtudiant;
            }
            public void setResponsabiliteDirectionEncadrementEtudiant(ResponsabiliteDirectionEncadrementEtudiant responsabiliteDirectionEncadrementEtudiant){
            this.responsabiliteDirectionEncadrementEtudiant = responsabiliteDirectionEncadrementEtudiant;
            }
            public String getSujetEtude(){
            return this.sujetEtude;
            }
            public void setSujetEtude(String sujetEtude){
            this.sujetEtude = sujetEtude;
            }
            public List<EncadrementEtudiantEnjeuxIrd> getEncadrementEtudiantEnjeuxIrds(){
            return this.encadrementEtudiantEnjeuxIrds;
            }
            public void setEncadrementEtudiantEnjeuxIrds(List<EncadrementEtudiantEnjeuxIrd> encadrementEtudiantEnjeuxIrds){
            this.encadrementEtudiantEnjeuxIrds = encadrementEtudiantEnjeuxIrds;
            }
            public List<EncadrementEtudiantDisciplineScientifique> getEncadrementEtudiantDisciplineScientifiques(){
            return this.encadrementEtudiantDisciplineScientifiques;
            }
            public void setEncadrementEtudiantDisciplineScientifiques(List<EncadrementEtudiantDisciplineScientifique> encadrementEtudiantDisciplineScientifiques){
            this.encadrementEtudiantDisciplineScientifiques = encadrementEtudiantDisciplineScientifiques;
            }
            public Etudiant getEtudiant(){
            return this.etudiant;
            }
            public void setEtudiant(Etudiant etudiant){
            this.etudiant = etudiant;
            }
            public Etablissement getEtablissement(){
            return this.etablissement;
            }
            public void setEtablissement(Etablissement etablissement){
            this.etablissement = etablissement;
            }
            public String getCursus(){
            return this.cursus;
            }
            public void setCursus(String cursus){
            this.cursus = cursus;
            }
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
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
        EncadrementEtudiant encadrementEtudiant = (EncadrementEtudiant) o;
        return id != null && id.equals(encadrementEtudiant.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

