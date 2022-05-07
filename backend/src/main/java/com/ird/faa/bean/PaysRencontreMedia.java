package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "pays_rencontre_media")
public class PaysRencontreMedia   {

@Id
    @SequenceGenerator(name="pays_rencontre_media_seq",sequenceName="pays_rencontre_media_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="pays_rencontre_media_seq")
private Long id;


    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private RencontreMedia rencontreMedia ;


public PaysRencontreMedia(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
            }
            public RencontreMedia getRencontreMedia(){
            return this.rencontreMedia;
            }
            public void setRencontreMedia(RencontreMedia rencontreMedia){
            this.rencontreMedia = rencontreMedia;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaysRencontreMedia paysRencontreMedia = (PaysRencontreMedia) o;
        return id != null && id.equals(paysRencontreMedia.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

