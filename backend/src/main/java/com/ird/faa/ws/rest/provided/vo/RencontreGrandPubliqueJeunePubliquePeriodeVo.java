package  com.ird.faa.ws.rest.provided.vo;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class RencontreGrandPubliqueJeunePubliquePeriodeVo {

    private String id ;
    private String dateRencontre ;


            private String dateRencontreMax ;
            private String dateRencontreMin ;

        private RencontreGrandPubliqueJeunePubliqueVo rencontreGrandPubliqueJeunePubliqueVo ;


    public RencontreGrandPubliqueJeunePubliquePeriodeVo(){
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


        public RencontreGrandPubliqueJeunePubliqueVo getRencontreGrandPubliqueJeunePubliqueVo(){
        return this.rencontreGrandPubliqueJeunePubliqueVo;
        }

        public void setRencontreGrandPubliqueJeunePubliqueVo(RencontreGrandPubliqueJeunePubliqueVo rencontreGrandPubliqueJeunePubliqueVo){
        this.rencontreGrandPubliqueJeunePubliqueVo = rencontreGrandPubliqueJeunePubliqueVo;
        }


            }
