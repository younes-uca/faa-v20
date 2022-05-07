package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "enseignement_zone_geographique")
public class EnseignementZoneGeographique   {

@Id
    @SequenceGenerator(name="enseignement_zone_geographique_seq",sequenceName="enseignement_zone_geographique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="enseignement_zone_geographique_seq")
private Long id;

          @Transient
        private String libelle;

    @ManyToOne
    private Enseignement enseignement ;
    @ManyToOne
    private ZoneGeographique zoneGeographique ;
    @ManyToOne
    private Pays pays ;


public EnseignementZoneGeographique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public Enseignement getEnseignement(){
            return this.enseignement;
            }
            public void setEnseignement(Enseignement enseignement){
            this.enseignement = enseignement;
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
        EnseignementZoneGeographique enseignementZoneGeographique = (EnseignementZoneGeographique) o;
        return id != null && id.equals(enseignementZoneGeographique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

