package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "responsabilite_pedagogique_enjeux_ird")
public class ResponsabilitePedagogiqueEnjeuxIrd   {

@Id
    @SequenceGenerator(name="responsabilite_pedagogique_enjeux_ird_seq",sequenceName="responsabilite_pedagogique_enjeux_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="responsabilite_pedagogique_enjeux_ird_seq")
private Long id;


    @ManyToOne
    private EnjeuxIrd enjeuxIrd ;
    @ManyToOne
    private ResponsabilitePedagogique responsabilitePedagogique ;


public ResponsabilitePedagogiqueEnjeuxIrd(){
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
            public ResponsabilitePedagogique getResponsabilitePedagogique(){
            return this.responsabilitePedagogique;
            }
            public void setResponsabilitePedagogique(ResponsabilitePedagogique responsabilitePedagogique){
            this.responsabilitePedagogique = responsabilitePedagogique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponsabilitePedagogiqueEnjeuxIrd responsabilitePedagogiqueEnjeuxIrd = (ResponsabilitePedagogiqueEnjeuxIrd) o;
        return id != null && id.equals(responsabilitePedagogiqueEnjeuxIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

