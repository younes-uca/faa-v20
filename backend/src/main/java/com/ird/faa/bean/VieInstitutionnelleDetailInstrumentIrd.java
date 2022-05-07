package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "vie_institutionnelle_detail_instrument_ird")
public class VieInstitutionnelleDetailInstrumentIrd   {

@Id
    @SequenceGenerator(name="vie_institutionnelle_detail_instrument_ird_seq",sequenceName="vie_institutionnelle_detail_instrument_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="vie_institutionnelle_detail_instrument_ird_seq")
private Long id;


    @ManyToOne
    private VieInstitutionnelleDetail vieInstitutionnelleDetail ;
    @ManyToOne
    private InstrumentIrd instrumentIrd ;


public VieInstitutionnelleDetailInstrumentIrd(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public VieInstitutionnelleDetail getVieInstitutionnelleDetail(){
            return this.vieInstitutionnelleDetail;
            }
            public void setVieInstitutionnelleDetail(VieInstitutionnelleDetail vieInstitutionnelleDetail){
            this.vieInstitutionnelleDetail = vieInstitutionnelleDetail;
            }
            public InstrumentIrd getInstrumentIrd(){
            return this.instrumentIrd;
            }
            public void setInstrumentIrd(InstrumentIrd instrumentIrd){
            this.instrumentIrd = instrumentIrd;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VieInstitutionnelleDetailInstrumentIrd vieInstitutionnelleDetailInstrumentIrd = (VieInstitutionnelleDetailInstrumentIrd) o;
        return id != null && id.equals(vieInstitutionnelleDetailInstrumentIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

