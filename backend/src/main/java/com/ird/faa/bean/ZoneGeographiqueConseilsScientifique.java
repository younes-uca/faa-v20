package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "zone_geographique_conseils_scientifique")
public class ZoneGeographiqueConseilsScientifique   {

@Id
    @SequenceGenerator(name="zone_geographique_conseils_scientifique_seq",sequenceName="zone_geographique_conseils_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="zone_geographique_conseils_scientifique_seq")
private Long id;

            @Column(length = 500)
            private String libelle;

    @ManyToOne
    private ConseilsScientifique conseilsScientifique ;
    @ManyToOne
    private ZoneGeographique zoneGeographique ;
    @ManyToOne
    private Pays pays ;


public ZoneGeographiqueConseilsScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public ConseilsScientifique getConseilsScientifique(){
            return this.conseilsScientifique;
            }
            public void setConseilsScientifique(ConseilsScientifique conseilsScientifique){
            this.conseilsScientifique = conseilsScientifique;
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
        ZoneGeographiqueConseilsScientifique zoneGeographiqueConseilsScientifique = (ZoneGeographiqueConseilsScientifique) o;
        return id != null && id.equals(zoneGeographiqueConseilsScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

