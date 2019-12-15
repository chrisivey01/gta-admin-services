package com.chris.pmagtaservices.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "owned_properties", schema = "essentialmode", catalog = "")
public class OwnedProperties {
    private int id;
    private String name;
    private double price;
    private int rented;
    private String owner;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "rented", nullable = false)
    public int getRented() {
        return rented;
    }

    public void setRented(int rented) {
        this.rented = rented;
    }

    @Basic
    @Column(name = "owner", nullable = false, length = 60)
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OwnedProperties that = (OwnedProperties) o;
        return id == that.id &&
                Double.compare(that.price, price) == 0 &&
                rented == that.rented &&
                Objects.equals(name, that.name) &&
                Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, rented, owner);
    }
}
