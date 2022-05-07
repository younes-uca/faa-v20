package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "rencontre_media_discipline_scientifique")
public class RencontreMediaDisciplineScientifique   {

@Id
    @SequenceGenerator(name="rencontre_media_discipline_scientifique_seq",sequenceName="rencontre_media_discipline_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="rencontre_media_discipline_scientifique_seq")
private Long id;


    @ManyToOne
    private RencontreMedia rencontreMedia ;
    @ManyToOne
    private DisciplineScientifique disciplineScientifique ;


public RencontreMediaDisciplineScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public RencontreMedia getRencontreMedia(){
            return this.rencontreMedia;
            }
            public void setRencontreMedia(RencontreMedia rencontreMedia){
            this.rencontreMedia = rencontreMedia;
            }
            public DisciplineScientifique getDisciplineScientifique(){
            return this.disciplineScientifique;
            }
            public void setDisciplineScientifique(DisciplineScientifique disciplineScientifique){
            this.disciplineScientifique = disciplineScientifique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RencontreMediaDisciplineScientifique rencontreMediaDisciplineScientifique = (RencontreMediaDisciplineScientifique) o;
        return id != null && id.equals(rencontreMediaDisciplineScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

