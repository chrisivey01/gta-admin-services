package com.chris.pmagtaservices.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gang_inventory", schema = "essentialmode", catalog = "")
public class GangInventory {
    private int id;
    private String gang;
    private String data;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "gang", nullable = false, length = 45)
    public String getGang() {
        return gang;
    }

    public void setGang(String gang) {
        this.gang = gang;
    }

    @Basic
    @Column(name = "data", nullable = false, length = -1)
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GangInventory that = (GangInventory) o;
        return id == that.id &&
                Objects.equals(gang, that.gang) &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gang, data);
    }
}
