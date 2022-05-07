package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "etablissement_comite_et_commission_evaluation")
public class EtablissementComiteEtCommissionEvaluation   {

@Id
    @SequenceGenerator(name="etablissement_comite_et_commission_evaluation_seq",sequenceName="etablissement_comite_et_commission_evaluation_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etablissement_comite_et_commission_evaluation_seq")
private Long id;


    @ManyToOne
    private Etablissement etablissement ;
    @ManyToOne
    private ComiteEtCommissionEvaluation comiteEtCommissionEvaluation ;


public EtablissementComiteEtCommissionEvaluation(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public Etablissement getEtablissement(){
            return this.etablissement;
            }
            public void setEtablissement(Etablissement etablissement){
            this.etablissement = etablissement;
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
        EtablissementComiteEtCommissionEvaluation etablissementComiteEtCommissionEvaluation = (EtablissementComiteEtCommissionEvaluation) o;
        return id != null && id.equals(etablissementComiteEtCommissionEvaluation.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

