package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "campagne_relance")
public class CampagneRelance   {

@Id
    @SequenceGenerator(name="campagne_relance_seq",sequenceName="campagne_relance_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="campagne_relance_seq")
private Long id;

            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateRelance ;
            @Column(length = 500)
            private String objetRelance;
            @Lob
            @Column(columnDefinition="TEXT")
            private String messageRelance;

    @ManyToOne
    private Campagne campagne ;
    @ManyToOne
    private TemplateRelance templateRelance ;

                @OneToMany(mappedBy = "campagneRelance")
            private List<CampagneRelanceChercheur> campagneRelanceChercheurs ;

public CampagneRelance(){
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
            public Date getDateRelance(){
            return this.dateRelance;
            }
            public void setDateRelance(Date dateRelance){
            this.dateRelance = dateRelance;
            }
            public TemplateRelance getTemplateRelance(){
            return this.templateRelance;
            }
            public void setTemplateRelance(TemplateRelance templateRelance){
            this.templateRelance = templateRelance;
            }
            public String getObjetRelance(){
            return this.objetRelance;
            }
            public void setObjetRelance(String objetRelance){
            this.objetRelance = objetRelance;
            }
            public String getMessageRelance(){
            return this.messageRelance;
            }
            public void setMessageRelance(String messageRelance){
            this.messageRelance = messageRelance;
            }
            public List<CampagneRelanceChercheur> getCampagneRelanceChercheurs(){
            return this.campagneRelanceChercheurs;
            }
            public void setCampagneRelanceChercheurs(List<CampagneRelanceChercheur> campagneRelanceChercheurs){
            this.campagneRelanceChercheurs = campagneRelanceChercheurs;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CampagneRelance campagneRelance = (CampagneRelance) o;
        return id != null && id.equals(campagneRelance.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

