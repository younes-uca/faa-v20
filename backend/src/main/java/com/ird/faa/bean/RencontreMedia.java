package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



import javax.persistence.*;



@Entity
@Table(name = "rencontre_media")
public class RencontreMedia   {

@Id
    @SequenceGenerator(name="rencontre_media_seq",sequenceName="rencontre_media_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="rencontre_media_seq")
private Long id;

            @Column(length = 500)
            private String intituleSujet;
            @Column(length = 500)
            private String lienWeb;
            @Lob
            @Column(columnDefinition="TEXT")
            private String remarque;

    @ManyToOne
    private FormatRencontre formatRencontre ;
    @ManyToOne
    private CultureScientifique cultureScientifique ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "rencontreMedia")
            private List<TypePubliqueRencontreMedia> typePubliqueRencontreMedias ;
                @OneToMany(mappedBy = "rencontreMedia")
            private List<RencontreMediaEnjeuxIrd> rencontreMediaEnjeuxIrds ;
                @OneToMany(mappedBy = "rencontreMedia")
            private List<RencontreMediaDisciplineScientifique> rencontreMediaDisciplineScientifiques ;
                @OneToMany(mappedBy = "rencontreMedia")
            private List<RencontreMediaPeriode> rencontreMediaPeriodes ;
                @OneToMany(mappedBy = "rencontreMedia")
            private List<PaysRencontreMedia> paysRencontreMedias ;

public RencontreMedia(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public FormatRencontre getFormatRencontre(){
            return this.formatRencontre;
            }
            public void setFormatRencontre(FormatRencontre formatRencontre){
            this.formatRencontre = formatRencontre;
            }
            public List<TypePubliqueRencontreMedia> getTypePubliqueRencontreMedias(){
            return this.typePubliqueRencontreMedias;
            }
            public void setTypePubliqueRencontreMedias(List<TypePubliqueRencontreMedia> typePubliqueRencontreMedias){
            this.typePubliqueRencontreMedias = typePubliqueRencontreMedias;
            }
            public String getIntituleSujet(){
            return this.intituleSujet;
            }
            public void setIntituleSujet(String intituleSujet){
            this.intituleSujet = intituleSujet;
            }
            public List<RencontreMediaEnjeuxIrd> getRencontreMediaEnjeuxIrds(){
            return this.rencontreMediaEnjeuxIrds;
            }
            public void setRencontreMediaEnjeuxIrds(List<RencontreMediaEnjeuxIrd> rencontreMediaEnjeuxIrds){
            this.rencontreMediaEnjeuxIrds = rencontreMediaEnjeuxIrds;
            }
            public List<RencontreMediaDisciplineScientifique> getRencontreMediaDisciplineScientifiques(){
            return this.rencontreMediaDisciplineScientifiques;
            }
            public void setRencontreMediaDisciplineScientifiques(List<RencontreMediaDisciplineScientifique> rencontreMediaDisciplineScientifiques){
            this.rencontreMediaDisciplineScientifiques = rencontreMediaDisciplineScientifiques;
            }
            public List<RencontreMediaPeriode> getRencontreMediaPeriodes(){
            return this.rencontreMediaPeriodes;
            }
            public void setRencontreMediaPeriodes(List<RencontreMediaPeriode> rencontreMediaPeriodes){
            this.rencontreMediaPeriodes = rencontreMediaPeriodes;
            }
            public List<PaysRencontreMedia> getPaysRencontreMedias(){
            return this.paysRencontreMedias;
            }
            public void setPaysRencontreMedias(List<PaysRencontreMedia> paysRencontreMedias){
            this.paysRencontreMedias = paysRencontreMedias;
            }
            public String getLienWeb(){
            return this.lienWeb;
            }
            public void setLienWeb(String lienWeb){
            this.lienWeb = lienWeb;
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
        RencontreMedia rencontreMedia = (RencontreMedia) o;
        return id != null && id.equals(rencontreMedia.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

