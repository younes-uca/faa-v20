package  com.ird.faa.ws.rest.provided.vo;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class RencontreMediaPeriodeVo {

    private String id ;
    private String dateRencontre ;


            private String dateRencontreMax ;
            private String dateRencontreMin ;

        private RencontreMediaVo rencontreMediaVo ;


    public RencontreMediaPeriodeVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getDateRencontre(){
        return this.dateRencontre;
        }

        public void setDateRencontre(String dateRencontre){
        this.dateRencontre = dateRencontre;
        }


            public String getDateRencontreMax(){
            return this.dateRencontreMax;
            }

            public String getDateRencontreMin(){
            return this.dateRencontreMin;
            }

            public void setDateRencontreMax(String dateRencontreMax){
            this.dateRencontreMax = dateRencontreMax;
            }

            public void setDateRencontreMin(String dateRencontreMin){
            this.dateRencontreMin = dateRencontreMin;
            }


        public RencontreMediaVo getRencontreMediaVo(){
        return this.rencontreMediaVo;
        }

        public void setRencontreMediaVo(RencontreMediaVo rencontreMediaVo){
        this.rencontreMediaVo = rencontreMediaVo;
        }


            }
