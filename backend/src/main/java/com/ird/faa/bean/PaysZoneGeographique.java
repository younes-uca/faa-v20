package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "pays_zone_geographique")
public class PaysZoneGeographique   {

@Id
    @SequenceGenerator(name="pays_zone_geographique_seq",sequenceName="pays_zone_geographique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="pays_zone_geographique_seq")
private Long id;


    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private ZoneGeographique zoneGeographique ;


public PaysZoneGeographique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
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

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaysZoneGeographique paysZoneGeographique = (PaysZoneGeographique) o;
        return id != null && id.equals(paysZoneGeographique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

