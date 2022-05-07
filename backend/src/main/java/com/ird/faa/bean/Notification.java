package com.ird.faa.bean;

import java.util.Objects;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "notification")
public class Notification   {

@Id
    @SequenceGenerator(name="notification_seq",sequenceName="notification_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="notification_seq")
private Long id;

            @Column(length = 500)
            private String libelle;
            @Lob
            @Column(columnDefinition="TEXT")
            private String description;
            @Column(columnDefinition = "boolean default false")
                 private Boolean vu = false;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateNotification ;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateLecture ;

    @ManyToOne
    private Chercheur chercheur ;
    @ManyToOne
    private CategorieNotification categorieNotification ;


public Notification(){
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
            public String getDescription(){
            return this.description;
            }
            public void setDescription(String description){
            this.description = description;
            }
        public Boolean  getVu(){
        return this.vu;
        }
        public void setVu(Boolean vu){
        this.vu = vu;
        }
            public Date getDateNotification(){
            return this.dateNotification;
            }
            public void setDateNotification(Date dateNotification){
            this.dateNotification = dateNotification;
            }
            public Date getDateLecture(){
            return this.dateLecture;
            }
            public void setDateLecture(Date dateLecture){
            this.dateLecture = dateLecture;
            }
            public Chercheur getChercheur(){
            return this.chercheur;
            }
            public void setChercheur(Chercheur chercheur){
            this.chercheur = chercheur;
            }
            public CategorieNotification getCategorieNotification(){
            return this.categorieNotification;
            }
            public void setCategorieNotification(CategorieNotification categorieNotification){
            this.categorieNotification = categorieNotification;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification notification = (Notification) o;
        return id != null && id.equals(notification.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

