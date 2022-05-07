package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



import javax.persistence.*;



@Entity
@Table(name = "vie_institutionnelle_detail")
public class VieInstitutionnelleDetail   {

@Id
    @SequenceGenerator(name="vie_institutionnelle_detail_seq",sequenceName="vie_institutionnelle_detail_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="vie_institutionnelle_detail_seq")
private Long id;

            @Column(columnDefinition = "boolean default false")
                 private Boolean cooreleStructureIrd = false;
            @Column(columnDefinition = "boolean default false")
                 private Boolean cooreleInstrumentIrd = false;
            @Column(length = 500)
            private String libelle;

    @ManyToOne
    private TypeInstance typeInstance ;
    @ManyToOne
    private StructureIrd structureIrd ;
    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private VieInstitutionnelle vieInstitutionnelle ;

                @OneToMany(mappedBy = "vieInstitutionnelleDetail")
            private List<VieInstitutionnelleDetailInstrumentIrd> vieInstitutionnelleDetailInstrumentIrds ;
                @OneToMany(mappedBy = "vieInstitutionnelleDetail")
            private List<VieInstitutionnelleDetailEtablissement> vieInstitutionnelleDetailEtablissements ;

public VieInstitutionnelleDetail(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public TypeInstance getTypeInstance(){
            return this.typeInstance;
            }
            public void setTypeInstance(TypeInstance typeInstance){
            this.typeInstance = typeInstance;
            }
        public Boolean  getCooreleStructureIrd(){
        return this.cooreleStructureIrd;
        }
        public void setCooreleStructureIrd(Boolean cooreleStructureIrd){
        this.cooreleStructureIrd = cooreleStructureIrd;
        }
            public StructureIrd getStructureIrd(){
            return this.structureIrd;
            }
            public void setStructureIrd(StructureIrd structureIrd){
            this.structureIrd = structureIrd;
            }
        public Boolean  getCooreleInstrumentIrd(){
        return this.cooreleInstrumentIrd;
        }
        public void setCooreleInstrumentIrd(Boolean cooreleInstrumentIrd){
        this.cooreleInstrumentIrd = cooreleInstrumentIrd;
        }
            public List<VieInstitutionnelleDetailInstrumentIrd> getVieInstitutionnelleDetailInstrumentIrds(){
            return this.vieInstitutionnelleDetailInstrumentIrds;
            }
            public void setVieInstitutionnelleDetailInstrumentIrds(List<VieInstitutionnelleDetailInstrumentIrd> vieInstitutionnelleDetailInstrumentIrds){
            this.vieInstitutionnelleDetailInstrumentIrds = vieInstitutionnelleDetailInstrumentIrds;
            }
            public String getLibelle(){
            return this.libelle;
            }
            public void setLibelle(String libelle){
            this.libelle = libelle;
            }
            public List<VieInstitutionnelleDetailEtablissement> getVieInstitutionnelleDetailEtablissements(){
            return this.vieInstitutionnelleDetailEtablissements;
            }
            public void setVieInstitutionnelleDetailEtablissements(List<VieInstitutionnelleDetailEtablissement> vieInstitutionnelleDetailEtablissements){
            this.vieInstitutionnelleDetailEtablissements = vieInstitutionnelleDetailEtablissements;
            }
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
            }
            public VieInstitutionnelle getVieInstitutionnelle(){
            return this.vieInstitutionnelle;
            }
            public void setVieInstitutionnelle(VieInstitutionnelle vieInstitutionnelle){
            this.vieInstitutionnelle = vieInstitutionnelle;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VieInstitutionnelleDetail vieInstitutionnelleDetail = (VieInstitutionnelleDetail) o;
        return id != null && id.equals(vieInstitutionnelleDetail.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

