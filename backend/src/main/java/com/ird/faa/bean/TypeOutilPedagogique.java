package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "type_outil_pedagogique")
public class TypeOutilPedagogique   {

@Id
    @SequenceGenerator(name="type_outil_pedagogique_seq",sequenceName="type_outil_pedagogique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_outil_pedagogique_seq")
private Long id;


    @ManyToOne
    private TypeOutil typeOutil ;
    @ManyToOne
    private OutilPedagogique outilPedagogique ;


public TypeOutilPedagogique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public TypeOutil getTypeOutil(){
            return this.typeOutil;
            }
            public void setTypeOutil(TypeOutil typeOutil){
            this.typeOutil = typeOutil;
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
        TypeOutilPedagogique typeOutilPedagogique = (TypeOutilPedagogique) o;
        return id != null && id.equals(typeOutilPedagogique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

