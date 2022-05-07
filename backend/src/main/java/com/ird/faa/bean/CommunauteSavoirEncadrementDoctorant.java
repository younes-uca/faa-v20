package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "communaute_savoir_encadrement_doctorant")
public class CommunauteSavoirEncadrementDoctorant   {

@Id
    @SequenceGenerator(name="communaute_savoir_encadrement_doctorant_seq",sequenceName="communaute_savoir_encadrement_doctorant_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="communaute_savoir_encadrement_doctorant_seq")
private Long id;


    @ManyToOne
    private CommunauteSavoir communauteSavoir ;
    @ManyToOne
    private EncadrementDoctorant encadrementDoctorant ;


public CommunauteSavoirEncadrementDoctorant(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public CommunauteSavoir getCommunauteSavoir(){
            return this.communauteSavoir;
            }
            public void setCommunauteSavoir(CommunauteSavoir communauteSavoir){
            this.communauteSavoir = communauteSavoir;
            }
            public EncadrementDoctorant getEncadrementDoctorant(){
            return this.encadrementDoctorant;
            }
            public void setEncadrementDoctorant(EncadrementDoctorant encadrementDoctorant){
            this.encadrementDoctorant = encadrementDoctorant;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommunauteSavoirEncadrementDoctorant communauteSavoirEncadrementDoctorant = (CommunauteSavoirEncadrementDoctorant) o;
        return id != null && id.equals(communauteSavoirEncadrementDoctorant.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

