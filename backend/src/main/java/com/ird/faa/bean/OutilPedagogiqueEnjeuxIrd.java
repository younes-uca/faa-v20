package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "outil_pedagogique_enjeux_ird")
public class OutilPedagogiqueEnjeuxIrd   {

@Id
    @SequenceGenerator(name="outil_pedagogique_enjeux_ird_seq",sequenceName="outil_pedagogique_enjeux_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="outil_pedagogique_enjeux_ird_seq")
private Long id;


    @ManyToOne
    private OutilPedagogique outilPedagogique ;
    @ManyToOne
    private EnjeuxIrd enjeuxIrd ;


public OutilPedagogiqueEnjeuxIrd(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public OutilPedagogique getOutilPedagogique(){
            return this.outilPedagogique;
            }
            public void setOutilPedagogique(OutilPedagogique outilPedagogique){
            this.outilPedagogique = outilPedagogique;
            }
            public EnjeuxIrd getEnjeuxIrd(){
            return this.enjeuxIrd;
            }
            public void setEnjeuxIrd(EnjeuxIrd enjeuxIrd){
            this.enjeuxIrd = enjeuxIrd;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutilPedagogiqueEnjeuxIrd outilPedagogiqueEnjeuxIrd = (OutilPedagogiqueEnjeuxIrd) o;
        return id != null && id.equals(outilPedagogiqueEnjeuxIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

