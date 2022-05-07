package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "outil_pedagogique_langue")
public class OutilPedagogiqueLangue   {

@Id
    @SequenceGenerator(name="outil_pedagogique_langue_seq",sequenceName="outil_pedagogique_langue_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="outil_pedagogique_langue_seq")
private Long id;


    @ManyToOne
    private Langue langue ;
    @ManyToOne
    private OutilPedagogique outilPedagogique ;


public OutilPedagogiqueLangue(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public Langue getLangue(){
            return this.langue;
            }
            public void setLangue(Langue langue){
            this.langue = langue;
            }
            public OutilPedagogique getOutilPedagogique(){
            return this.outilPedagogique;
            }
            public void setOutilPedagogique(OutilPedagogique outilPedagogique){
            this.outilPedagogique = outilPedagogique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutilPedagogiqueLangue outilPedagogiqueLangue = (OutilPedagogiqueLangue) o;
        return id != null && id.equals(outilPedagogiqueLangue.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

