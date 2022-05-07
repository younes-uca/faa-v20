package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "outil_pedagogique_instrument_ird")
public class OutilPedagogiqueInstrumentIrd   {

@Id
    @SequenceGenerator(name="outil_pedagogique_instrument_ird_seq",sequenceName="outil_pedagogique_instrument_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="outil_pedagogique_instrument_ird_seq")
private Long id;


    @ManyToOne
    private InstrumentIrd instrumentIrd ;
    @ManyToOne
    private OutilPedagogique outilPedagogique ;


public OutilPedagogiqueInstrumentIrd(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public InstrumentIrd getInstrumentIrd(){
            return this.instrumentIrd;
            }
            public void setInstrumentIrd(InstrumentIrd instrumentIrd){
            this.instrumentIrd = instrumentIrd;
            }
            public OutilPedagogique getOutilPedagogique(){
            return this.outilPedagogique;
            }
            public void setOutilPedagogique(OutilPedagogique outilPedagogique){
            this.outilPedagogique = outilPedagogique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutilPedagogiqueInstrumentIrd outilPedagogiqueInstrumentIrd = (OutilPedagogiqueInstrumentIrd) o;
        return id != null && id.equals(outilPedagogiqueInstrumentIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

