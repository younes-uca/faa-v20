package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "type_instrument_ird_consultance_scientifique_ponctuelle")
public class TypeInstrumentIrdConsultanceScientifiquePonctuelle   {

@Id
    @SequenceGenerator(name="type_instrument_ird_consultance_scientifique_ponctuelle_seq",sequenceName="type_instrument_ird_consultance_scientifique_ponctuelle_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_instrument_ird_consultance_scientifique_ponctuelle_seq")
private Long id;


    @ManyToOne
    private TypeInstrumentIrd typeInstrumentIrd ;
    @ManyToOne
    private ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle ;


public TypeInstrumentIrdConsultanceScientifiquePonctuelle(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public TypeInstrumentIrd getTypeInstrumentIrd(){
            return this.typeInstrumentIrd;
            }
            public void setTypeInstrumentIrd(TypeInstrumentIrd typeInstrumentIrd){
            this.typeInstrumentIrd = typeInstrumentIrd;
            }
            public ConsultanceScientifiquePonctuelle getConsultanceScientifiquePonctuelle(){
            return this.consultanceScientifiquePonctuelle;
            }
            public void setConsultanceScientifiquePonctuelle(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
            this.consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelle;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeInstrumentIrdConsultanceScientifiquePonctuelle typeInstrumentIrdConsultanceScientifiquePonctuelle = (TypeInstrumentIrdConsultanceScientifiquePonctuelle) o;
        return id != null && id.equals(typeInstrumentIrdConsultanceScientifiquePonctuelle.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

