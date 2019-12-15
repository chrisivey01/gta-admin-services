package com.chris.pmagtaservices.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_inventory", schema = "essentialmode", catalog = "")
public class UserInventory {
    private int id;
    private String identifier;
    private String item;
    private int count;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "identifier", nullable = false, length = 22)
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Basic
    @Column(name = "item", nullable = false, length = 50)
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Basic
    @Column(name = "count", nullable = false)
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInventory that = (UserInventory) o;
        return id == that.id &&
                count == that.count &&
                Objects.equals(identifier, that.identifier) &&
                Objects.equals(item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identifier, item, count);
    }
}
