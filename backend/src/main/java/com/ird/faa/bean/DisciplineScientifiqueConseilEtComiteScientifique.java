package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "discipline_scientifique_conseil_et_comite_scientifique")
public class DisciplineScientifiqueConseilEtComiteScientifique   {

@Id
    @SequenceGenerator(name="discipline_scientifique_conseil_et_comite_scientifique_seq",sequenceName="discipline_scientifique_conseil_et_comite_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="discipline_scientifique_conseil_et_comite_scientifique_seq")
private Long id;


    @ManyToOne
    private DisciplineScientifique disciplineScientifique ;
    @ManyToOne
    private ConseilEtComiteScientifique conseilEtComiteScientifique ;


public DisciplineScientifiqueConseilEtComiteScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public DisciplineScientifique getDisciplineScientifique(){
            return this.disciplineScientifique;
            }
            public void setDisciplineScientifique(DisciplineScientifique disciplineScientifique){
            this.disciplineScientifique = disciplineScientifique;
            }
            public ConseilEtComiteScientifique getConseilEtComiteScientifique(){
            return this.conseilEtComiteScientifique;
            }
            public void setConseilEtComiteScientifique(ConseilEtComiteScientifique conseilEtComiteScientifique){
            this.conseilEtComiteScientifique = conseilEtComiteScientifique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisciplineScientifiqueConseilEtComiteScientifique disciplineScientifiqueConseilEtComiteScientifique = (DisciplineScientifiqueConseilEtComiteScientifique) o;
        return id != null && id.equals(disciplineScientifiqueConseilEtComiteScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

