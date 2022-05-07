package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "zone_geographique_consultance_scientifique_ponctuelle")
public class ZoneGeographiqueConsultanceScientifiquePonctuelle   {

@Id
    @SequenceGenerator(name="zone_geographique_consultance_scientifique_ponctuelle_seq",sequenceName="zone_geographique_consultance_scientifique_ponctuelle_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="zone_geographique_consultance_scientifique_ponctuelle_seq")
private Long id;


    @ManyToOne
    private ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle ;
    @ManyToOne
    private ZoneGeographique zoneGeographique ;
    @ManyToOne
    private Pays pays ;


public ZoneGeographiqueConsultanceScientifiquePonctuelle(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public ConsultanceScientifiquePonctuelle getConsultanceScientifiquePonctuelle(){
            return this.consultanceScientifiquePonctuelle;
            }
            public void setConsultanceScientifiquePonctuelle(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
            this.consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelle;
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

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZoneGeographiqueConsultanceScientifiquePonctuelle zoneGeographiqueConsultanceScientifiquePonctuelle = (ZoneGeographiqueConsultanceScientifiquePonctuelle) o;
        return id != null && id.equals(zoneGeographiqueConsultanceScientifiquePonctuelle.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

