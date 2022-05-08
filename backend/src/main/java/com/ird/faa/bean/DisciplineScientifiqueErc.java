package com.ird.faa.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "discipline_scientifique_erc")
public class DisciplineScientifiqueErc implements Archivable {

    @Id
    @SequenceGenerator(name = "discipline_scientifique_erc_seq", sequenceName = "discipline_scientifique_erc_seq",
            allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "discipline_scientifique_erc_seq")
    private Long id;

    @Column(length = 500)
    private String libelleFr;
    @Column(length = 500)
    private String libelleEng;
    @Column(length = 500)
    private String code;
    private Long niveau;
    @Column(columnDefinition = "boolean default false")
    private Boolean archive = false;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateArchivage;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Column(columnDefinition = "boolean default false")
    private Boolean admin = false;
    @Column(columnDefinition = "boolean default false")
    private Boolean visible = false;
    @Column(length = 500)
    private String username;

    @ManyToOne
    private DisciplineScientifiqueErcParent disciplineScientifiqueErcParent;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "disciplineScientifiqueErc")
    private List<KeyWordDisciplineScientifiqueErc> keyWordDisciplineScientifiqueErcs;

    public DisciplineScientifiqueErc() {
        super();
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelleFr() {
        return this.libelleFr;
    }

    public void setLibelleFr(String libelleFr) {
        this.libelleFr = libelleFr;
    }

    public String getLibelleEng() {
        return this.libelleEng;
    }

    public void setLibelleEng(String libelleEng) {
        this.libelleEng = libelleEng;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getNiveau() {
        return this.niveau;
    }

    public void setNiveau(Long niveau) {
        this.niveau = niveau;
    }

    public DisciplineScientifiqueErcParent getDisciplineScientifiqueErcParent() {
        return this.disciplineScientifiqueErcParent;
    }

    public void setDisciplineScientifiqueErcParent(DisciplineScientifiqueErcParent disciplineScientifiqueErcParent) {
        this.disciplineScientifiqueErcParent = disciplineScientifiqueErcParent;
    }

    public List<KeyWordDisciplineScientifiqueErc> getKeyWordDisciplineScientifiqueErcs() {
        return this.keyWordDisciplineScientifiqueErcs;
    }

    public void setKeyWordDisciplineScientifiqueErcs(List<KeyWordDisciplineScientifiqueErc> keyWordDisciplineScientifiqueErcs) {
        this.keyWordDisciplineScientifiqueErcs = keyWordDisciplineScientifiqueErcs;
    }

    public Boolean getArchive() {
        return this.archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public Date getDateArchivage() {
        return this.dateArchivage;
    }

    public void setDateArchivage(Date dateArchivage) {
        this.dateArchivage = dateArchivage;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Boolean getAdmin() {
        return this.admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisciplineScientifiqueErc disciplineScientifiqueErc = (DisciplineScientifiqueErc) o;
        return id != null && id.equals(disciplineScientifiqueErc.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

