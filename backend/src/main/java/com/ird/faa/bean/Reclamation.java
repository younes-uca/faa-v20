package com.ird.faa.bean;

import java.util.Objects;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "reclamation")
public class Reclamation   {

@Id
    @SequenceGenerator(name="reclamation_seq",sequenceName="reclamation_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reclamation_seq")
private Long id;

            @Column(length = 500)
            private String objet;
            @Lob
            @Column(columnDefinition="TEXT")
            private String message;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateReclamation ;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateTraitement ;

    @ManyToOne
    private EtatReclamation etatReclamation ;
    @ManyToOne
    private TypeReclamation typeReclamation ;
    @ManyToOne
    private Chercheur chercheur ;


public Reclamation(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
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
            public EtatReclamation getEtatReclamation(){
            return this.etatReclamation;
            }
            public void setEtatReclamation(EtatReclamation etatReclamation){
            this.etatReclamation = etatReclamation;
            }
            public TypeReclamation getTypeReclamation(){
            return this.typeReclamation;
            }
            public void setTypeReclamation(TypeReclamation typeReclamation){
            this.typeReclamation = typeReclamation;
            }
            public Chercheur getChercheur(){
            return this.chercheur;
            }
            public void setChercheur(Chercheur chercheur){
            this.chercheur = chercheur;
            }
            public Date getDateReclamation(){
            return this.dateReclamation;
            }
            public void setDateReclamation(Date dateReclamation){
            this.dateReclamation = dateReclamation;
            }
            public Date getDateTraitement(){
            return this.dateTraitement;
            }
            public void setDateTraitement(Date dateTraitement){
            this.dateTraitement = dateTraitement;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reclamation reclamation = (Reclamation) o;
        return id != null && id.equals(reclamation.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

