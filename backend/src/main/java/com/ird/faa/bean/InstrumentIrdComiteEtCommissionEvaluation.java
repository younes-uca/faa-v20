package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "instrument_ird_comite_et_commission_evaluation")
public class InstrumentIrdComiteEtCommissionEvaluation   {

@Id
    @SequenceGenerator(name="instrument_ird_comite_et_commission_evaluation_seq",sequenceName="instrument_ird_comite_et_commission_evaluation_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="instrument_ird_comite_et_commission_evaluation_seq")
private Long id;


    @ManyToOne
    private InstrumentIrd instrumentIrd ;
    @ManyToOne
    private TypeInstrumentIrd typeInstrumentIrd ;
    @ManyToOne
    private ComiteEtCommissionEvaluation comiteEtCommissionEvaluation ;


public InstrumentIrdComiteEtCommissionEvaluation(){
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
            public TypeInstrumentIrd getTypeInstrumentIrd(){
            return this.typeInstrumentIrd;
            }
            public void setTypeInstrumentIrd(TypeInstrumentIrd typeInstrumentIrd){
            this.typeInstrumentIrd = typeInstrumentIrd;
            }
            public ComiteEtCommissionEvaluation getComiteEtCommissionEvaluation(){
            return this.comiteEtCommissionEvaluation;
            }
            public void setComiteEtCommissionEvaluation(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation){
            this.comiteEtCommissionEvaluation = comiteEtCommissionEvaluation;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstrumentIrdComiteEtCommissionEvaluation instrumentIrdComiteEtCommissionEvaluation = (InstrumentIrdComiteEtCommissionEvaluation) o;
        return id != null && id.equals(instrumentIrdComiteEtCommissionEvaluation.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

