package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "formation_continue_objet_formation_generique")
public class FormationContinueObjetFormationGenerique   {

@Id
    @SequenceGenerator(name="formation_continue_objet_formation_generique_seq",sequenceName="formation_continue_objet_formation_generique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="formation_continue_objet_formation_generique_seq")
private Long id;


    @ManyToOne
    private ObjetFormationGenerique objetFormationGenerique ;
    @ManyToOne
    private FormationContinue formationContinue ;


public FormationContinueObjetFormationGenerique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public ObjetFormationGenerique getObjetFormationGenerique(){
            return this.objetFormationGenerique;
            }
            public void setObjetFormationGenerique(ObjetFormationGenerique objetFormationGenerique){
            this.objetFormationGenerique = objetFormationGenerique;
            }
            public FormationContinue getFormationContinue(){
            return this.formationContinue;
            }
            public void setFormationContinue(FormationContinue formationContinue){
            this.formationContinue = formationContinue;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormationContinueObjetFormationGenerique formationContinueObjetFormationGenerique = (FormationContinueObjetFormationGenerique) o;
        return id != null && id.equals(formationContinueObjetFormationGenerique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

