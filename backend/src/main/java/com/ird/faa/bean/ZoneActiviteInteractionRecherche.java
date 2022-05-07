package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "zone_activite_interaction_recherche")
public class ZoneActiviteInteractionRecherche   {

@Id
    @SequenceGenerator(name="zone_activite_interaction_recherche_seq",sequenceName="zone_activite_interaction_recherche_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="zone_activite_interaction_recherche_seq")
private Long id;

          @Transient
        private String libelle;

    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private ZoneGeographique zoneGeographique ;
    @ManyToOne
    private Chercheur chercheur ;


public ZoneActiviteInteractionRecherche(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public String getLibelle(){
            return this.libelle;
            }
            public void setLibelle(String libelle){
            this.libelle = libelle;
            }
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
            }
            public ZoneGeographique getZoneGeographique(){
            return this.zoneGeographique;
            }
            public void setZoneGeographique(ZoneGeographique zoneGeographique){
            this.zoneGeographique = zoneGeographique;
            }
            public Chercheur getChercheur(){
            return this.chercheur;
            }
            public void setChercheur(Chercheur chercheur){
            this.chercheur = chercheur;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZoneActiviteInteractionRecherche zoneActiviteInteractionRecherche = (ZoneActiviteInteractionRecherche) o;
        return id != null && id.equals(zoneActiviteInteractionRecherche.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

