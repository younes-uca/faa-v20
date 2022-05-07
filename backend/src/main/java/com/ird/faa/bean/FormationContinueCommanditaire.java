package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "formation_continue_commanditaire")
public class FormationContinueCommanditaire   {

@Id
    @SequenceGenerator(name="formation_continue_commanditaire_seq",sequenceName="formation_continue_commanditaire_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="formation_continue_commanditaire_seq")
private Long id;


    @ManyToOne
    private Commanditaire commanditaire ;
    @ManyToOne
    private FormationContinue formationContinue ;
    @ManyToOne
    private Pays pays ;


public FormationContinueCommanditaire(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public Commanditaire getCommanditaire(){
            return this.commanditaire;
            }
            public void setCommanditaire(Commanditaire commanditaire){
            this.commanditaire = commanditaire;
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
        FormationContinueCommanditaire formationContinueCommanditaire = (FormationContinueCommanditaire) o;
        return id != null && id.equals(formationContinueCommanditaire.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

