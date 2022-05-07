package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "gestion_equipe_detail")
public class GestionEquipeDetail   {

@Id
    @SequenceGenerator(name="gestion_equipe_detail_seq",sequenceName="gestion_equipe_detail_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="gestion_equipe_detail_seq")
private Long id;

            private Integer nombrePersonneEncadre;
            private Integer nombrePersonneHorsIrd;
            private Integer nombrePersonneSousConventions;
            @Column(columnDefinition = "boolean default false")
                 private Boolean formationManagement = false;

    @ManyToOne
    private GestionEquipe gestionEquipe ;


public GestionEquipeDetail(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public Integer getNombrePersonneEncadre(){
            return this.nombrePersonneEncadre;
            }
            public void setNombrePersonneEncadre(Integer nombrePersonneEncadre){
            this.nombrePersonneEncadre = nombrePersonneEncadre;
            }
            public Integer getNombrePersonneHorsIrd(){
            return this.nombrePersonneHorsIrd;
            }
            public void setNombrePersonneHorsIrd(Integer nombrePersonneHorsIrd){
            this.nombrePersonneHorsIrd = nombrePersonneHorsIrd;
            }
            public Integer getNombrePersonneSousConventions(){
            return this.nombrePersonneSousConventions;
            }
            public void setNombrePersonneSousConventions(Integer nombrePersonneSousConventions){
            this.nombrePersonneSousConventions = nombrePersonneSousConventions;
            }
        public Boolean  getFormationManagement(){
        return this.formationManagement;
        }
        public void setFormationManagement(Boolean formationManagement){
        this.formationManagement = formationManagement;
        }
            public GestionEquipe getGestionEquipe(){
            return this.gestionEquipe;
            }
            public void setGestionEquipe(GestionEquipe gestionEquipe){
            this.gestionEquipe = gestionEquipe;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GestionEquipeDetail gestionEquipeDetail = (GestionEquipeDetail) o;
        return id != null && id.equals(gestionEquipeDetail.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

