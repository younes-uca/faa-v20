package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "pays_formation_continue")
public class PaysFormationContinue   {

@Id
    @SequenceGenerator(name="pays_formation_continue_seq",sequenceName="pays_formation_continue_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="pays_formation_continue_seq")
private Long id;


    @ManyToOne
    private FormationContinue formationContinue ;
    @ManyToOne
    private Pays pays ;


public PaysFormationContinue(){
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
        PaysFormationContinue paysFormationContinue = (PaysFormationContinue) o;
        return id != null && id.equals(paysFormationContinue.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

