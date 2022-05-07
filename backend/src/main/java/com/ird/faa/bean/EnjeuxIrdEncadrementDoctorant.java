package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "enjeux_ird_encadrement_doctorant")
public class EnjeuxIrdEncadrementDoctorant   {

@Id
    @SequenceGenerator(name="enjeux_ird_encadrement_doctorant_seq",sequenceName="enjeux_ird_encadrement_doctorant_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="enjeux_ird_encadrement_doctorant_seq")
private Long id;


    @ManyToOne
    private EnjeuxIrd enjeuxIrd ;
    @ManyToOne
    private EncadrementDoctorant encadrementDoctorant ;


public EnjeuxIrdEncadrementDoctorant(){
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
            public EncadrementDoctorant getEncadrementDoctorant(){
            return this.encadrementDoctorant;
            }
            public void setEncadrementDoctorant(EncadrementDoctorant encadrementDoctorant){
            this.encadrementDoctorant = encadrementDoctorant;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnjeuxIrdEncadrementDoctorant enjeuxIrdEncadrementDoctorant = (EnjeuxIrdEncadrementDoctorant) o;
        return id != null && id.equals(enjeuxIrdEncadrementDoctorant.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

