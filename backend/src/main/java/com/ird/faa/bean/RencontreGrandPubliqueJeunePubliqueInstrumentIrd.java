package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "rencontre_grand_publique_jeune_publique_instrument_ird")
public class RencontreGrandPubliqueJeunePubliqueInstrumentIrd   {

@Id
    @SequenceGenerator(name="rencontre_grand_publique_jeune_publique_instrument_ird_seq",sequenceName="rencontre_grand_publique_jeune_publique_instrument_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="rencontre_grand_publique_jeune_publique_instrument_ird_seq")
private Long id;


    @ManyToOne
    private InstrumentIrd instrumentIrd ;
    @ManyToOne
    private RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique ;


public RencontreGrandPubliqueJeunePubliqueInstrumentIrd(){
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
            public RencontreGrandPubliqueJeunePublique getRencontreGrandPubliqueJeunePublique(){
            return this.rencontreGrandPubliqueJeunePublique;
            }
            public void setRencontreGrandPubliqueJeunePublique(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
            this.rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePublique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RencontreGrandPubliqueJeunePubliqueInstrumentIrd rencontreGrandPubliqueJeunePubliqueInstrumentIrd = (RencontreGrandPubliqueJeunePubliqueInstrumentIrd) o;
        return id != null && id.equals(rencontreGrandPubliqueJeunePubliqueInstrumentIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

