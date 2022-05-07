package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "outil_pedagogique_publique_cible")
public class OutilPedagogiquePubliqueCible   {

@Id
    @SequenceGenerator(name="outil_pedagogique_publique_cible_seq",sequenceName="outil_pedagogique_publique_cible_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="outil_pedagogique_publique_cible_seq")
private Long id;


    @ManyToOne
    private PubliqueCible publiqueCible ;
    @ManyToOne
    private OutilPedagogique outilPedagogique ;


public OutilPedagogiquePubliqueCible(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public PubliqueCible getPubliqueCible(){
            return this.publiqueCible;
            }
            public void setPubliqueCible(PubliqueCible publiqueCible){
            this.publiqueCible = publiqueCible;
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
        OutilPedagogiquePubliqueCible outilPedagogiquePubliqueCible = (OutilPedagogiquePubliqueCible) o;
        return id != null && id.equals(outilPedagogiquePubliqueCible.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

