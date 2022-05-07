package  com.ird.faa.ws.rest.provided.vo;


public class FormationContinueCommanditaireVo {

    private String id ;



        private CommanditaireVo commanditaireVo ;
        private FormationContinueVo formationContinueVo ;
        private PaysVo paysVo ;


    public FormationContinueCommanditaireVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public CommanditaireVo getCommanditaireVo(){
        return this.commanditaireVo;
        }

        public void setCommanditaireVo(CommanditaireVo commanditaireVo){
        this.commanditaireVo = commanditaireVo;
        }
        public FormationContinueVo getFormationContinueVo(){
        return this.formationContinueVo;
        }

        public void setFormationContinueVo(FormationContinueVo formationContinueVo){
        this.formationContinueVo = formationContinueVo;
        }
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }


            }
