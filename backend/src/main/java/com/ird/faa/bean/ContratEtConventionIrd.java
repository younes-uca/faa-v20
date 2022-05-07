package com.ird.faa.bean;

import java.util.Objects;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "contrat_et_convention_ird")
public class ContratEtConventionIrd   {

@Id
    @SequenceGenerator(name="contrat_et_convention_ird_seq",sequenceName="contrat_et_convention_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="contrat_et_convention_ird_seq")
private Long id;

            @Column(length = 500)
            private String numero;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateContrat ;
            @Column(length = 500)
            private String intitule;
            @Lob
            @Column(columnDefinition="TEXT")
            private String description;

    @ManyToOne
    private StatusContratEtConvention statusContratEtConvention ;
    @ManyToOne
    private SavoirEtInnovation savoirEtInnovation ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;


public ContratEtConventionIrd(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public String getNumero(){
            return this.numero;
            }
            public void setNumero(String numero){
            this.numero = numero;
            }
            public StatusContratEtConvention getStatusContratEtConvention(){
            return this.statusContratEtConvention;
            }
            public void setStatusContratEtConvention(StatusContratEtConvention statusContratEtConvention){
            this.statusContratEtConvention = statusContratEtConvention;
            }
            public Date getDateContrat(){
            return this.dateContrat;
            }
            public void setDateContrat(Date dateContrat){
            this.dateContrat = dateContrat;
            }
            public String getIntitule(){
            return this.intitule;
            }
            public void setIntitule(String intitule){
            this.intitule = intitule;
            }
            public String getDescription(){
            return this.description;
            }
            public void setDescription(String description){
            this.description = description;
            }
            public SavoirEtInnovation getSavoirEtInnovation(){
            return this.savoirEtInnovation;
            }
            public void setSavoirEtInnovation(SavoirEtInnovation savoirEtInnovation){
            this.savoirEtInnovation = savoirEtInnovation;
            }
            public EtatEtapeCampagne getEtatEtapeCampagne(){
            return this.etatEtapeCampagne;
            }
            public void setEtatEtapeCampagne(EtatEtapeCampagne etatEtapeCampagne){
            this.etatEtapeCampagne = etatEtapeCampagne;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContratEtConventionIrd contratEtConventionIrd = (ContratEtConventionIrd) o;
        return id != null && id.equals(contratEtConventionIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

