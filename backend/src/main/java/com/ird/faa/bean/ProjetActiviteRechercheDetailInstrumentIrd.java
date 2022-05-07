package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "projet_activite_recherche_detail_instrument_ird")
public class ProjetActiviteRechercheDetailInstrumentIrd   {

@Id
    @SequenceGenerator(name="projet_activite_recherche_detail_instrument_ird_seq",sequenceName="projet_activite_recherche_detail_instrument_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="projet_activite_recherche_detail_instrument_ird_seq")
private Long id;


    @ManyToOne
    private ProjetActiviteRechercheDetail projetActiviteRechercheDetail ;
    @ManyToOne
    private InstrumentIrd instrumentIrd ;


public ProjetActiviteRechercheDetailInstrumentIrd(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public ProjetActiviteRechercheDetail getProjetActiviteRechercheDetail(){
            return this.projetActiviteRechercheDetail;
            }
            public void setProjetActiviteRechercheDetail(ProjetActiviteRechercheDetail projetActiviteRechercheDetail){
            this.projetActiviteRechercheDetail = projetActiviteRechercheDetail;
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
        ProjetActiviteRechercheDetailInstrumentIrd projetActiviteRechercheDetailInstrumentIrd = (ProjetActiviteRechercheDetailInstrumentIrd) o;
        return id != null && id.equals(projetActiviteRechercheDetailInstrumentIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

