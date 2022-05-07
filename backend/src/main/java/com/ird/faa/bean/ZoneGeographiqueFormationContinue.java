package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "zone_geographique_formation_continue")
public class ZoneGeographiqueFormationContinue   {

@Id
    @SequenceGenerator(name="zone_geographique_formation_continue_seq",sequenceName="zone_geographique_formation_continue_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="zone_geographique_formation_continue_seq")
private Long id;

          @Transient
        private String libelle;

    @ManyToOne
    private FormationContinue formationContinue ;
    @ManyToOne
    private ZoneGeographique zoneGeographique ;
    @ManyToOne
    private Pays pays ;


public ZoneGeographiqueFormationContinue(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public FormationContinue getFormationContinue(){
            return this.formationContinue;
            }
            public void setFormationContinue(FormationContinue formationContinue){
            this.formationContinue = formationContinue;
            }
            public ZoneGeographique getZoneGeographique(){
            return this.zoneGeographique;
            }
            public void setZoneGeographique(ZoneGeographique zoneGeographique){
            this.zoneGeographique = zoneGeographique;
            }
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
            }
            public String getLibelle(){
            return this.libelle;
            }
            public void setLibelle(String libelle){
            this.libelle = libelle;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZoneGeographiqueFormationContinue zoneGeographiqueFormationContinue = (ZoneGeographiqueFormationContinue) o;
        return id != null && id.equals(zoneGeographiqueFormationContinue.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

