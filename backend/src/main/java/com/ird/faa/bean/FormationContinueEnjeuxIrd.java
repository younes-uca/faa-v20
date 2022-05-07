package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "formation_continue_enjeux_ird")
public class FormationContinueEnjeuxIrd   {

@Id
    @SequenceGenerator(name="formation_continue_enjeux_ird_seq",sequenceName="formation_continue_enjeux_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="formation_continue_enjeux_ird_seq")
private Long id;


    @ManyToOne
    private EnjeuxIrd enjeuxIrd ;
    @ManyToOne
    private FormationContinue formationContinue ;


public FormationContinueEnjeuxIrd(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public EnjeuxIrd getEnjeuxIrd(){
            return this.enjeuxIrd;
            }
            public void setEnjeuxIrd(EnjeuxIrd enjeuxIrd){
            this.enjeuxIrd = enjeuxIrd;
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
        FormationContinueEnjeuxIrd formationContinueEnjeuxIrd = (FormationContinueEnjeuxIrd) o;
        return id != null && id.equals(formationContinueEnjeuxIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

