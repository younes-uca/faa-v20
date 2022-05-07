package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "campagne_rappel")
public class CampagneRappel   {

@Id
    @SequenceGenerator(name="campagne_rappel_seq",sequenceName="campagne_rappel_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="campagne_rappel_seq")
private Long id;

            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateRappel ;
            @Column(length = 500)
            private String objetRappel;
            @Lob
            @Column(columnDefinition="TEXT")
            private String messageRappel;

    @ManyToOne
    private Campagne campagne ;
    @ManyToOne
    private TemplateRappel templateRappel ;

                @OneToMany(mappedBy = "campagneRappel")
            private List<CampagneRappelChercheur> campagneRappelChercheurs ;

public CampagneRappel(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public Campagne getCampagne(){
            return this.campagne;
            }
            public void setCampagne(Campagne campagne){
            this.campagne = campagne;
            }
            public Date getDateRappel(){
            return this.dateRappel;
            }
            public void setDateRappel(Date dateRappel){
            this.dateRappel = dateRappel;
            }
            public TemplateRappel getTemplateRappel(){
            return this.templateRappel;
            }
            public void setTemplateRappel(TemplateRappel templateRappel){
            this.templateRappel = templateRappel;
            }
            public String getObjetRappel(){
            return this.objetRappel;
            }
            public void setObjetRappel(String objetRappel){
            this.objetRappel = objetRappel;
            }
            public String getMessageRappel(){
            return this.messageRappel;
            }
            public void setMessageRappel(String messageRappel){
            this.messageRappel = messageRappel;
            }
            public List<CampagneRappelChercheur> getCampagneRappelChercheurs(){
            return this.campagneRappelChercheurs;
            }
            public void setCampagneRappelChercheurs(List<CampagneRappelChercheur> campagneRappelChercheurs){
            this.campagneRappelChercheurs = campagneRappelChercheurs;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CampagneRappel campagneRappel = (CampagneRappel) o;
        return id != null && id.equals(campagneRappel.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

