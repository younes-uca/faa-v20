package com.ird.faa.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "faq")
public class Faq {

    @Id
    @SequenceGenerator(name = "faq_seq", sequenceName = "faq_seq",
            allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "faq_seq")
    private Long id;

    @Column(length = 500)
    private String question;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String reponse;
    @Column(length = 500)
    private String contact;
    private Integer ordre;
    @Column(columnDefinition = "boolean default false")
    private Boolean archive = false;
    @Column(length = 500)
    private String lien;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dernierMisAJour;

    @ManyToOne
    private CategorieFaq categorieFaq;


    public Faq() {
        super();
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getReponse() {
        return this.reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public CategorieFaq getCategorieFaq() {
        return this.categorieFaq;
    }

    public void setCategorieFaq(CategorieFaq categorieFaq) {
        this.categorieFaq = categorieFaq;
    }

    public Integer getOrdre() {
        return this.ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    public Boolean getArchive() {
        return this.archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public String getLien() {
        return this.lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public Date getDernierMisAJour() {
        return this.dernierMisAJour;
    }

    public void setDernierMisAJour(Date dernierMisAJour) {
        this.dernierMisAJour = dernierMisAJour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faq faq = (Faq) o;
        return id != null && id.equals(faq.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

