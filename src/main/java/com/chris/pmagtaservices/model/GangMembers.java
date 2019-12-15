package com.chris.pmagtaservices.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gang_members", schema = "essentialmode", catalog = "")
public class GangMembers {
    private int idgangs;
    private String identifier;
    private String firstname;
    private String lastname;
    private Integer gangId;
    private Integer gangRank;

    @Id
    @Column(name = "idgangs", nullable = false)
    public int getIdgangs() {
        return idgangs;
    }

    public void setIdgangs(int idgangs) {
        this.idgangs = idgangs;
    }

    @Basic
    @Column(name = "identifier", nullable = true, length = 255)
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Basic
    @Column(name = "firstname", nullable = true, length = 45)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname", nullable = true, length = 45)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "gang_id", nullable = true)
    public Integer getGangId() {
        return gangId;
    }

    public void setGangId(Integer gangId) {
        this.gangId = gangId;
    }

    @Basic
    @Column(name = "gang_rank", nullable = true)
    public Integer getGangRank() {
        return gangRank;
    }

    public void setGangRank(Integer gangRank) {
        this.gangRank = gangRank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GangMembers that = (GangMembers) o;
        return idgangs == that.idgangs &&
                Objects.equals(identifier, that.identifier) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(gangId, that.gangId) &&
                Objects.equals(gangRank, that.gangRank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idgangs, identifier, firstname, lastname, gangId, gangRank);
    }
}
