package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "discipline_scientifique_consultance_scientifique_ponctuelle")
public class DisciplineScientifiqueConsultanceScientifiquePonctuelle   {

@Id
    @SequenceGenerator(name="discipline_scientifique_consultance_scientifique_ponctuelle_seq",sequenceName="discipline_scientifique_consultance_scientifique_ponctuelle_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="discipline_scientifique_consultance_scientifique_ponctuelle_seq")
private Long id;


    @ManyToOne
    private ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle ;
    @ManyToOne
    private DisciplineScientifique disciplineScientifique ;


public DisciplineScientifiqueConsultanceScientifiquePonctuelle(){
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
        DisciplineScientifiqueConsultanceScientifiquePonctuelle disciplineScientifiqueConsultanceScientifiquePonctuelle = (DisciplineScientifiqueConsultanceScientifiquePonctuelle) o;
        return id != null && id.equals(disciplineScientifiqueConsultanceScientifiquePonctuelle.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

