package com.ird.faa.bean;

import java.util.Objects;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "rencontre_media_periode")
public class RencontreMediaPeriode   {

@Id
    @SequenceGenerator(name="rencontre_media_periode_seq",sequenceName="rencontre_media_periode_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="rencontre_media_periode_seq")
private Long id;

            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateRencontre ;

    @ManyToOne
    private RencontreMedia rencontreMedia ;


public RencontreMediaPeriode(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public RencontreMedia getRencontreMedia(){
            return this.rencontreMedia;
            }
            public void setRencontreMedia(RencontreMedia rencontreMedia){
            this.rencontreMedia = rencontreMedia;
            }
            public Date getDateRencontre(){
            return this.dateRencontre;
            }
            public void setDateRencontre(Date dateRencontre){
            this.dateRencontre = dateRencontre;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RencontreMediaPeriode rencontreMediaPeriode = (RencontreMediaPeriode) o;
        return id != null && id.equals(rencontreMediaPeriode.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

