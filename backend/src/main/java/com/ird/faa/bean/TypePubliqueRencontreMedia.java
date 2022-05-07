package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "type_publique_rencontre_media")
public class TypePubliqueRencontreMedia   {

@Id
    @SequenceGenerator(name="type_publique_rencontre_media_seq",sequenceName="type_publique_rencontre_media_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_publique_rencontre_media_seq")
private Long id;


    @ManyToOne
    private TypePublique typePublique ;
    @ManyToOne
    private RencontreMedia rencontreMedia ;


public TypePubliqueRencontreMedia(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public TypePublique getTypePublique(){
            return this.typePublique;
            }
            public void setTypePublique(TypePublique typePublique){
            this.typePublique = typePublique;
            }
            public RencontreMedia getRencontreMedia(){
            return this.rencontreMedia;
            }
            public void setRencontreMedia(RencontreMedia rencontreMedia){
            this.rencontreMedia = rencontreMedia;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypePubliqueRencontreMedia typePubliqueRencontreMedia = (TypePubliqueRencontreMedia) o;
        return id != null && id.equals(typePubliqueRencontreMedia.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

