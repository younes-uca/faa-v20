package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "chercheur_email")
public class ChercheurEmail   {

@Id
    @SequenceGenerator(name="chercheur_email_seq",sequenceName="chercheur_email_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="chercheur_email_seq")
private Long id;

            @Column(length = 500)
            private String email;
            @Column(columnDefinition = "boolean default false")
                 private Boolean principale = false;

    @ManyToOne
    private Chercheur chercheur ;


public ChercheurEmail(){
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
            public String getEmail(){
            return this.email;
            }
            public void setEmail(String email){
            this.email = email;
            }
        public Boolean  getPrincipale(){
        return this.principale;
        }
        public void setPrincipale(Boolean principale){
        this.principale = principale;
        }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChercheurEmail chercheurEmail = (ChercheurEmail) o;
        return id != null && id.equals(chercheurEmail.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

