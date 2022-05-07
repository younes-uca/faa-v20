package com.ird.faa.bean;

import java.util.Objects;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "campagne_chercheur_fermeture")
public class CampagneChercheurFermeture   {

@Id
    @SequenceGenerator(name="campagne_chercheur_fermeture_seq",sequenceName="campagne_chercheur_fermeture_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="campagne_chercheur_fermeture_seq")
private Long id;

            @Column(length = 500)
            private String objet;
            @Lob
            @Column(columnDefinition="TEXT")
            private String message;
            @Column(columnDefinition = "boolean default false")
                 private Boolean envoye = false;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateEnvoi ;

    @ManyToOne
    private Chercheur chercheur ;
    @ManyToOne
    private Campagne campagne ;


public CampagneChercheurFermeture(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public Chercheur getChercheur(){
            return this.chercheur;
            }
            public void setChercheur(Chercheur chercheur){
            this.chercheur = chercheur;
            }
            public Campagne getCampagne(){
            return this.campagne;
            }
            public void setCampagne(Campagne campagne){
            this.campagne = campagne;
            }
            public String getObjet(){
            return this.objet;
            }
            public void setObjet(String objet){
            this.objet = objet;
            }
            public String getMessage(){
            return this.message;
            }
            public void setMessage(String message){
            this.message = message;
            }
        public Boolean  getEnvoye(){
        return this.envoye;
        }
        public void setEnvoye(Boolean envoye){
        this.envoye = envoye;
        }
            public Date getDateEnvoi(){
            return this.dateEnvoi;
            }
            public void setDateEnvoi(Date dateEnvoi){
            this.dateEnvoi = dateEnvoi;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CampagneChercheurFermeture campagneChercheurFermeture = (CampagneChercheurFermeture) o;
        return id != null && id.equals(campagneChercheurFermeture.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

