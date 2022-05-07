package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



import javax.persistence.*;



@Entity
@Table(name = "conseils_scientifique")
public class ConseilsScientifique   {

@Id
    @SequenceGenerator(name="conseils_scientifique_seq",sequenceName="conseils_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="conseils_scientifique_seq")
private Long id;

            @Column(length = 500)
            private String intitule;
            private Long nombreJoursConsacres ;

    @ManyToOne
    private NatureExpertise natureExpertise ;
    @ManyToOne
    private TypeExpertise typeExpertise ;
    @ManyToOne
    private Expertise expertise ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "conseilsScientifique")
            private List<EtablissementConseilsScientifique> etablissementConseilsScientifiques ;
                @OneToMany(mappedBy = "conseilsScientifique")
            private List<ZoneGeographiqueConseilsScientifique> zoneGeographiqueConseilsScientifiques ;
                @OneToMany(mappedBy = "conseilsScientifique")
            private List<EnjeuxIrdConseilsScientifique> enjeuxIrdConseilsScientifiques ;
                @OneToMany(mappedBy = "conseilsScientifique")
            private List<DisciplineScientifiqueConseilsScientifique> disciplineScientifiqueConseilsScientifiques ;

public ConseilsScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public NatureExpertise getNatureExpertise(){
            return this.natureExpertise;
            }
            public void setNatureExpertise(NatureExpertise natureExpertise){
            this.natureExpertise = natureExpertise;
            }
            public String getIntitule(){
            return this.intitule;
            }
            public void setIntitule(String intitule){
            this.intitule = intitule;
            }
            public List<EtablissementConseilsScientifique> getEtablissementConseilsScientifiques(){
            return this.etablissementConseilsScientifiques;
            }
            public void setEtablissementConseilsScientifiques(List<EtablissementConseilsScientifique> etablissementConseilsScientifiques){
            this.etablissementConseilsScientifiques = etablissementConseilsScientifiques;
            }
            public List<ZoneGeographiqueConseilsScientifique> getZoneGeographiqueConseilsScientifiques(){
            return this.zoneGeographiqueConseilsScientifiques;
            }
            public void setZoneGeographiqueConseilsScientifiques(List<ZoneGeographiqueConseilsScientifique> zoneGeographiqueConseilsScientifiques){
            this.zoneGeographiqueConseilsScientifiques = zoneGeographiqueConseilsScientifiques;
            }
            public List<EnjeuxIrdConseilsScientifique> getEnjeuxIrdConseilsScientifiques(){
            return this.enjeuxIrdConseilsScientifiques;
            }
            public void setEnjeuxIrdConseilsScientifiques(List<EnjeuxIrdConseilsScientifique> enjeuxIrdConseilsScientifiques){
            this.enjeuxIrdConseilsScientifiques = enjeuxIrdConseilsScientifiques;
            }
            public List<DisciplineScientifiqueConseilsScientifique> getDisciplineScientifiqueConseilsScientifiques(){
            return this.disciplineScientifiqueConseilsScientifiques;
            }
            public void setDisciplineScientifiqueConseilsScientifiques(List<DisciplineScientifiqueConseilsScientifique> disciplineScientifiqueConseilsScientifiques){
            this.disciplineScientifiqueConseilsScientifiques = disciplineScientifiqueConseilsScientifiques;
            }
            public TypeExpertise getTypeExpertise(){
            return this.typeExpertise;
            }
            public void setTypeExpertise(TypeExpertise typeExpertise){
            this.typeExpertise = typeExpertise;
            }
            public Long getNombreJoursConsacres(){
            return this.nombreJoursConsacres;
            }
            public void setNombreJoursConsacres(Long nombreJoursConsacres){
            this.nombreJoursConsacres = nombreJoursConsacres;
            }
            public Expertise getExpertise(){
            return this.expertise;
            }
            public void setExpertise(Expertise expertise){
            this.expertise = expertise;
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
        ConseilsScientifique conseilsScientifique = (ConseilsScientifique) o;
        return id != null && id.equals(conseilsScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

