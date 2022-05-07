package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "type_instrument_ird_chercheur")
public class TypeInstrumentIrdChercheur   {

@Id
    @SequenceGenerator(name="type_instrument_ird_chercheur_seq",sequenceName="type_instrument_ird_chercheur_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_instrument_ird_chercheur_seq")
private Long id;


    @ManyToOne
    private TypeInstrumentIrd typeInstrumentIrd ;
    @ManyToOne
    private Chercheur chercheur ;


public TypeInstrumentIrdChercheur(){
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
            public Chercheur getChercheur(){
            return this.chercheur;
            }
            public void setChercheur(Chercheur chercheur){
            this.chercheur = chercheur;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeInstrumentIrdChercheur typeInstrumentIrdChercheur = (TypeInstrumentIrdChercheur) o;
        return id != null && id.equals(typeInstrumentIrdChercheur.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

