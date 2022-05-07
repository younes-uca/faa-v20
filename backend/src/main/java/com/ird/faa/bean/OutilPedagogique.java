package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;



@Entity
@Table(name = "outil_pedagogique")
public class OutilPedagogique   {

@Id
    @SequenceGenerator(name="outil_pedagogique_seq",sequenceName="outil_pedagogique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="outil_pedagogique_seq")
private Long id;

            @Column(length = 500)
            private String nom;
            @Column(length = 500)
            private String roleOutilPedagogique;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateDiffusion ;
            @Column(columnDefinition = "boolean default false")
                 private Boolean disponnibleNumerique = false;
            @Column(length = 500)
            private String lienWeb;
            @Column(columnDefinition = "boolean default false")
                 private Boolean lienInstrumentIrd = false;
            @Column(length = 500)
            private String partenaireEventuel;
            @Lob
            @Column(columnDefinition="TEXT")
            private String remarque;

    @ManyToOne
    private CultureScientifique cultureScientifique ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "outilPedagogique")
            private List<OutilPedagogiqueEnjeuxIrd> outilPedagogiqueEnjeuxIrds ;
                @OneToMany(mappedBy = "outilPedagogique")
            private List<OutilPedagogiqueDisciplineScientifique> outilPedagogiqueDisciplineScientifiques ;
                @OneToMany(mappedBy = "outilPedagogique")
            private List<OutilPedagogiquePubliqueCible> outilPedagogiquePubliqueCibles ;
                @OneToMany(mappedBy = "outilPedagogique")
            private List<TypeOutilPedagogique> typeOutilPedagogiques ;
                @OneToMany(mappedBy = "outilPedagogique")
            private List<OutilPedagogiqueLangue> outilPedagogiqueLangues ;
                @OneToMany(mappedBy = "outilPedagogique")
            private List<OutilPedagogiquePaysConception> outilPedagogiquePaysConceptions ;
                @OneToMany(mappedBy = "outilPedagogique")
            private List<OutilPedagogiquePaysDiffusion> outilPedagogiquePaysDiffusions ;
                @OneToMany(mappedBy = "outilPedagogique")
            private List<OutilPedagogiqueInstrumentIrd> outilPedagogiqueInstrumentIrds ;
                @OneToMany(mappedBy = "outilPedagogique")
            private List<OutilPedagogiqueTypeInstrumentIrd> outilPedagogiqueTypeInstrumentIrds ;

public OutilPedagogique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public String getNom(){
            return this.nom;
            }
            public void setNom(String nom){
            this.nom = nom;
            }
            public List<OutilPedagogiqueEnjeuxIrd> getOutilPedagogiqueEnjeuxIrds(){
            return this.outilPedagogiqueEnjeuxIrds;
            }
            public void setOutilPedagogiqueEnjeuxIrds(List<OutilPedagogiqueEnjeuxIrd> outilPedagogiqueEnjeuxIrds){
            this.outilPedagogiqueEnjeuxIrds = outilPedagogiqueEnjeuxIrds;
            }
            public List<OutilPedagogiqueDisciplineScientifique> getOutilPedagogiqueDisciplineScientifiques(){
            return this.outilPedagogiqueDisciplineScientifiques;
            }
            public void setOutilPedagogiqueDisciplineScientifiques(List<OutilPedagogiqueDisciplineScientifique> outilPedagogiqueDisciplineScientifiques){
            this.outilPedagogiqueDisciplineScientifiques = outilPedagogiqueDisciplineScientifiques;
            }
            public String getRoleOutilPedagogique(){
            return this.roleOutilPedagogique;
            }
            public void setRoleOutilPedagogique(String roleOutilPedagogique){
            this.roleOutilPedagogique = roleOutilPedagogique;
            }
            public Date getDateDiffusion(){
            return this.dateDiffusion;
            }
            public void setDateDiffusion(Date dateDiffusion){
            this.dateDiffusion = dateDiffusion;
            }
            public List<OutilPedagogiquePubliqueCible> getOutilPedagogiquePubliqueCibles(){
            return this.outilPedagogiquePubliqueCibles;
            }
            public void setOutilPedagogiquePubliqueCibles(List<OutilPedagogiquePubliqueCible> outilPedagogiquePubliqueCibles){
            this.outilPedagogiquePubliqueCibles = outilPedagogiquePubliqueCibles;
            }
            public List<TypeOutilPedagogique> getTypeOutilPedagogiques(){
            return this.typeOutilPedagogiques;
            }
            public void setTypeOutilPedagogiques(List<TypeOutilPedagogique> typeOutilPedagogiques){
            this.typeOutilPedagogiques = typeOutilPedagogiques;
            }
        public Boolean  getDisponnibleNumerique(){
        return this.disponnibleNumerique;
        }
        public void setDisponnibleNumerique(Boolean disponnibleNumerique){
        this.disponnibleNumerique = disponnibleNumerique;
        }
            public List<OutilPedagogiqueLangue> getOutilPedagogiqueLangues(){
            return this.outilPedagogiqueLangues;
            }
            public void setOutilPedagogiqueLangues(List<OutilPedagogiqueLangue> outilPedagogiqueLangues){
            this.outilPedagogiqueLangues = outilPedagogiqueLangues;
            }
            public List<OutilPedagogiquePaysConception> getOutilPedagogiquePaysConceptions(){
            return this.outilPedagogiquePaysConceptions;
            }
            public void setOutilPedagogiquePaysConceptions(List<OutilPedagogiquePaysConception> outilPedagogiquePaysConceptions){
            this.outilPedagogiquePaysConceptions = outilPedagogiquePaysConceptions;
            }
            public String getLienWeb(){
            return this.lienWeb;
            }
            public void setLienWeb(String lienWeb){
            this.lienWeb = lienWeb;
            }
            public List<OutilPedagogiquePaysDiffusion> getOutilPedagogiquePaysDiffusions(){
            return this.outilPedagogiquePaysDiffusions;
            }
            public void setOutilPedagogiquePaysDiffusions(List<OutilPedagogiquePaysDiffusion> outilPedagogiquePaysDiffusions){
            this.outilPedagogiquePaysDiffusions = outilPedagogiquePaysDiffusions;
            }
        public Boolean  getLienInstrumentIrd(){
        return this.lienInstrumentIrd;
        }
        public void setLienInstrumentIrd(Boolean lienInstrumentIrd){
        this.lienInstrumentIrd = lienInstrumentIrd;
        }
            public List<OutilPedagogiqueInstrumentIrd> getOutilPedagogiqueInstrumentIrds(){
            return this.outilPedagogiqueInstrumentIrds;
            }
            public void setOutilPedagogiqueInstrumentIrds(List<OutilPedagogiqueInstrumentIrd> outilPedagogiqueInstrumentIrds){
            this.outilPedagogiqueInstrumentIrds = outilPedagogiqueInstrumentIrds;
            }
            public List<OutilPedagogiqueTypeInstrumentIrd> getOutilPedagogiqueTypeInstrumentIrds(){
            return this.outilPedagogiqueTypeInstrumentIrds;
            }
            public void setOutilPedagogiqueTypeInstrumentIrds(List<OutilPedagogiqueTypeInstrumentIrd> outilPedagogiqueTypeInstrumentIrds){
            this.outilPedagogiqueTypeInstrumentIrds = outilPedagogiqueTypeInstrumentIrds;
            }
            public String getPartenaireEventuel(){
            return this.partenaireEventuel;
            }
            public void setPartenaireEventuel(String partenaireEventuel){
            this.partenaireEventuel = partenaireEventuel;
            }
            public String getRemarque(){
            return this.remarque;
            }
            public void setRemarque(String remarque){
            this.remarque = remarque;
            }
            public CultureScientifique getCultureScientifique(){
            return this.cultureScientifique;
            }
            public void setCultureScientifique(CultureScientifique cultureScientifique){
            this.cultureScientifique = cultureScientifique;
            }
            public EtatEtapeCampagne getEtatEtapeCampagne(){
            return this.etatEtapeCampagne;
            }
            public void setEtatEtapeCampagne(EtatEtapeCampagne etatEtapeCampagne){
            this.etatEtapeCampagne = etatEtapeCampagne;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutilPedagogique outilPedagogique = (OutilPedagogique) o;
        return id != null && id.equals(outilPedagogique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

