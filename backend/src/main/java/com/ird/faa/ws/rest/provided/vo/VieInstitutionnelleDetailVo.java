package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;

public class VieInstitutionnelleDetailVo {

    private String id ;
    private Boolean cooreleStructureIrd ;
    private Boolean cooreleInstrumentIrd ;
    private String libelle ;



        private TypeInstanceVo typeInstanceVo ;
        private StructureIrdVo structureIrdVo ;
        private PaysVo paysVo ;
        private VieInstitutionnelleVo vieInstitutionnelleVo ;

    private List<VieInstitutionnelleDetailInstrumentIrdVo> vieInstitutionnelleDetailInstrumentIrdsVo ;
    private List<VieInstitutionnelleDetailEtablissementVo> vieInstitutionnelleDetailEtablissementsVo ;

    public VieInstitutionnelleDetailVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public Boolean getCooreleStructureIrd(){
        return this.cooreleStructureIrd;
        }

        public void setCooreleStructureIrd(Boolean cooreleStructureIrd){
        this.cooreleStructureIrd = cooreleStructureIrd;
        }
        public Boolean getCooreleInstrumentIrd(){
        return this.cooreleInstrumentIrd;
        }

        public void setCooreleInstrumentIrd(Boolean cooreleInstrumentIrd){
        this.cooreleInstrumentIrd = cooreleInstrumentIrd;
        }
        public String getLibelle(){
        return this.libelle;
        }

        public void setLibelle(String libelle){
        this.libelle = libelle;
        }



        public TypeInstanceVo getTypeInstanceVo(){
        return this.typeInstanceVo;
        }

        public void setTypeInstanceVo(TypeInstanceVo typeInstanceVo){
        this.typeInstanceVo = typeInstanceVo;
        }
        public StructureIrdVo getStructureIrdVo(){
        return this.structureIrdVo;
        }

        public void setStructureIrdVo(StructureIrdVo structureIrdVo){
        this.structureIrdVo = structureIrdVo;
        }
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }
        public VieInstitutionnelleVo getVieInstitutionnelleVo(){
        return this.vieInstitutionnelleVo;
        }

        public void setVieInstitutionnelleVo(VieInstitutionnelleVo vieInstitutionnelleVo){
        this.vieInstitutionnelleVo = vieInstitutionnelleVo;
        }


        public List<VieInstitutionnelleDetailInstrumentIrdVo> getVieInstitutionnelleDetailInstrumentIrdsVo(){
        return this.vieInstitutionnelleDetailInstrumentIrdsVo;
        }

        public void setVieInstitutionnelleDetailInstrumentIrdsVo(List<VieInstitutionnelleDetailInstrumentIrdVo> vieInstitutionnelleDetailInstrumentIrdsVo){
            this.vieInstitutionnelleDetailInstrumentIrdsVo = vieInstitutionnelleDetailInstrumentIrdsVo;
            }

        public List<VieInstitutionnelleDetailEtablissementVo> getVieInstitutionnelleDetailEtablissementsVo(){
        return this.vieInstitutionnelleDetailEtablissementsVo;
        }

        public void setVieInstitutionnelleDetailEtablissementsVo(List<VieInstitutionnelleDetailEtablissementVo> vieInstitutionnelleDetailEtablissementsVo){
            this.vieInstitutionnelleDetailEtablissementsVo = vieInstitutionnelleDetailEtablissementsVo;
            }

            }
