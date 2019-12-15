package com.chris.pmagtaservices.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Gang {
    private int gangId;
    private String gangName;

    @Id
    @Column(name = "gang_id", nullable = false)
    public int getGangId() {
        return gangId;
    }

    public void setGangId(int gangId) {
        this.gangId = gangId;
    }

    @Basic
    @Column(name = "gang_name", nullable = true, length = 45)
    public String getGangName() {
        return gangName;
    }

    public void setGangName(String gangName) {
        this.gangName = gangName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gang gang = (Gang) o;
        return gangId == gang.gangId &&
                Objects.equals(gangName, gang.gangName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gangId, gangName);
    }
}
