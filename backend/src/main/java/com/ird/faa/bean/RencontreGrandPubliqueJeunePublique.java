package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "rencontre_grand_publique_jeune_publique")
public class RencontreGrandPubliqueJeunePublique   {

@Id
    @SequenceGenerator(name="rencontre_grand_publique_jeune_publique_seq",sequenceName="rencontre_grand_publique_jeune_publique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="rencontre_grand_publique_jeune_publique_seq")
private Long id;

            @Column(length = 500)
            private String intituleSujet;
            private BigDecimal nombrePersonneEstime ;
            @Column(columnDefinition = "boolean default false")
                 private Boolean lienInstrumentIrd = false;
            @Column(length = 500)
            private String lienWeb;
            @Lob
            @Column(columnDefinition="TEXT")
            private String remarque;

    @ManyToOne
    private FormatRencontre formatRencontre ;
    @ManyToOne
    private Contexte contexte ;
    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private CultureScientifique cultureScientifique ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "rencontreGrandPubliqueJeunePublique")
            private List<TypePubliqueRencontreGrandPubliqueJeunePublique> typePubliqueRencontreGrandPubliqueJeunePubliques ;
                @OneToMany(mappedBy = "rencontreGrandPubliqueJeunePublique")
            private List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> rencontreGrandPubliqueJeunePubliqueEnjeuxIrds ;
                @OneToMany(mappedBy = "rencontreGrandPubliqueJeunePublique")
            private List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques ;
                @OneToMany(mappedBy = "rencontreGrandPubliqueJeunePublique")
            private List<RencontreGrandPubliqueJeunePubliquePeriode> rencontreGrandPubliqueJeunePubliquePeriodes ;
                @OneToMany(mappedBy = "rencontreGrandPubliqueJeunePublique")
            private List<StructureOganisatrice> structureOganisatrices ;
                @OneToMany(mappedBy = "rencontreGrandPubliqueJeunePublique")
            private List<PaysRencontreGrandPubliqueJeunePublique> paysRencontreGrandPubliqueJeunePubliques ;
                @OneToMany(mappedBy = "rencontreGrandPubliqueJeunePublique")
            private List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> paysOrganisateurRencontreGrandPubliqueJeunePubliques ;
                @OneToMany(mappedBy = "rencontreGrandPubliqueJeunePublique")
            private List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> rencontreGrandPubliqueJeunePubliqueInstrumentIrds ;
                @OneToMany(mappedBy = "rencontreGrandPubliqueJeunePublique")
            private List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds ;

public RencontreGrandPubliqueJeunePublique(){
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
            public List<TypePubliqueRencontreGrandPubliqueJeunePublique> getTypePubliqueRencontreGrandPubliqueJeunePubliques(){
            return this.typePubliqueRencontreGrandPubliqueJeunePubliques;
            }
            public void setTypePubliqueRencontreGrandPubliqueJeunePubliques(List<TypePubliqueRencontreGrandPubliqueJeunePublique> typePubliqueRencontreGrandPubliqueJeunePubliques){
            this.typePubliqueRencontreGrandPubliqueJeunePubliques = typePubliqueRencontreGrandPubliqueJeunePubliques;
            }
            public String getIntituleSujet(){
            return this.intituleSujet;
            }
            public void setIntituleSujet(String intituleSujet){
            this.intituleSujet = intituleSujet;
            }
            public List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> getRencontreGrandPubliqueJeunePubliqueEnjeuxIrds(){
            return this.rencontreGrandPubliqueJeunePubliqueEnjeuxIrds;
            }
            public void setRencontreGrandPubliqueJeunePubliqueEnjeuxIrds(List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> rencontreGrandPubliqueJeunePubliqueEnjeuxIrds){
            this.rencontreGrandPubliqueJeunePubliqueEnjeuxIrds = rencontreGrandPubliqueJeunePubliqueEnjeuxIrds;
            }
            public List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> getRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques(){
            return this.rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques;
            }
            public void setRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques(List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques){
            this.rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques = rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques;
            }
            public BigDecimal getNombrePersonneEstime(){
            return this.nombrePersonneEstime;
            }
            public void setNombrePersonneEstime(BigDecimal nombrePersonneEstime){
            this.nombrePersonneEstime = nombrePersonneEstime;
            }
            public List<RencontreGrandPubliqueJeunePubliquePeriode> getRencontreGrandPubliqueJeunePubliquePeriodes(){
            return this.rencontreGrandPubliqueJeunePubliquePeriodes;
            }
            public void setRencontreGrandPubliqueJeunePubliquePeriodes(List<RencontreGrandPubliqueJeunePubliquePeriode> rencontreGrandPubliqueJeunePubliquePeriodes){
            this.rencontreGrandPubliqueJeunePubliquePeriodes = rencontreGrandPubliqueJeunePubliquePeriodes;
            }
            public List<StructureOganisatrice> getStructureOganisatrices(){
            return this.structureOganisatrices;
            }
            public void setStructureOganisatrices(List<StructureOganisatrice> structureOganisatrices){
            this.structureOganisatrices = structureOganisatrices;
            }
            public List<PaysRencontreGrandPubliqueJeunePublique> getPaysRencontreGrandPubliqueJeunePubliques(){
            return this.paysRencontreGrandPubliqueJeunePubliques;
            }
            public void setPaysRencontreGrandPubliqueJeunePubliques(List<PaysRencontreGrandPubliqueJeunePublique> paysRencontreGrandPubliqueJeunePubliques){
            this.paysRencontreGrandPubliqueJeunePubliques = paysRencontreGrandPubliqueJeunePubliques;
            }
            public List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> getPaysOrganisateurRencontreGrandPubliqueJeunePubliques(){
            return this.paysOrganisateurRencontreGrandPubliqueJeunePubliques;
            }
            public void setPaysOrganisateurRencontreGrandPubliqueJeunePubliques(List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> paysOrganisateurRencontreGrandPubliqueJeunePubliques){
            this.paysOrganisateurRencontreGrandPubliqueJeunePubliques = paysOrganisateurRencontreGrandPubliqueJeunePubliques;
            }
            public Contexte getContexte(){
            return this.contexte;
            }
            public void setContexte(Contexte contexte){
            this.contexte = contexte;
            }
        public Boolean  getLienInstrumentIrd(){
        return this.lienInstrumentIrd;
        }
        public void setLienInstrumentIrd(Boolean lienInstrumentIrd){
        this.lienInstrumentIrd = lienInstrumentIrd;
        }
            public List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> getRencontreGrandPubliqueJeunePubliqueInstrumentIrds(){
            return this.rencontreGrandPubliqueJeunePubliqueInstrumentIrds;
            }
            public void setRencontreGrandPubliqueJeunePubliqueInstrumentIrds(List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> rencontreGrandPubliqueJeunePubliqueInstrumentIrds){
            this.rencontreGrandPubliqueJeunePubliqueInstrumentIrds = rencontreGrandPubliqueJeunePubliqueInstrumentIrds;
            }
            public List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> getRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds(){
            return this.rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds;
            }
            public void setRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds(List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds){
            this.rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds = rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds;
            }
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
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
        RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique = (RencontreGrandPubliqueJeunePublique) o;
        return id != null && id.equals(rencontreGrandPubliqueJeunePublique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

