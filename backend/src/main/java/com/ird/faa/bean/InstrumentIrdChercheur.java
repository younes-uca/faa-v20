package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "instrument_ird_chercheur")
public class InstrumentIrdChercheur   {

@Id
    @SequenceGenerator(name="instrument_ird_chercheur_seq",sequenceName="instrument_ird_chercheur_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="instrument_ird_chercheur_seq")
private Long id;

            @Column(length = 500)
            private String natureImplication;

    @ManyToOne
    private InstrumentIrd instrumentIrd ;
    @ManyToOne
    private Chercheur chercheur ;


public InstrumentIrdChercheur(){
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
            public Chercheur getChercheur(){
            return this.chercheur;
            }
            public void setChercheur(Chercheur chercheur){
            this.chercheur = chercheur;
            }
            public String getNatureImplication(){
            return this.natureImplication;
            }
            public void setNatureImplication(String natureImplication){
            this.natureImplication = natureImplication;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstrumentIrdChercheur instrumentIrdChercheur = (InstrumentIrdChercheur) o;
        return id != null && id.equals(instrumentIrdChercheur.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

