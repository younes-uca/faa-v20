package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "instruments_et_dispositifs_ird")
public class InstrumentsEtDispositifsIrd   {

@Id
    @SequenceGenerator(name="instruments_et_dispositifs_ird_seq",sequenceName="instruments_et_dispositifs_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="instruments_et_dispositifs_ird_seq")
private Long id;

            @Column(length = 500)
            private String libelle;
            @Column(length = 500)
            private String code;
            @Lob
            @Column(columnDefinition="TEXT")
            private String description;
            @Column(columnDefinition = "boolean default false")
                 private Boolean numerique = false;

    @ManyToOne
    private Campagne campagne ;
    @ManyToOne
    private Chercheur chercheur ;


public InstrumentsEtDispositifsIrd(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public String getLibelle(){
            return this.libelle;
            }
            public void setLibelle(String libelle){
            this.libelle = libelle;
            }
            public String getCode(){
            return this.code;
            }
            public void setCode(String code){
            this.code = code;
            }
            public String getDescription(){
            return this.description;
            }
            public void setDescription(String description){
            this.description = description;
            }
            public Campagne getCampagne(){
            return this.campagne;
            }
            public void setCampagne(Campagne campagne){
            this.campagne = campagne;
            }
            public Chercheur getChercheur(){
            return this.chercheur;
            }
            public void setChercheur(Chercheur chercheur){
            this.chercheur = chercheur;
            }
        public Boolean  getNumerique(){
        return this.numerique;
        }
        public void setNumerique(Boolean numerique){
        this.numerique = numerique;
        }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstrumentsEtDispositifsIrd instrumentsEtDispositifsIrd = (InstrumentsEtDispositifsIrd) o;
        return id != null && id.equals(instrumentsEtDispositifsIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

