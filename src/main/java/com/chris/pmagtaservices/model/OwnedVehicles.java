package com.chris.pmagtaservices.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "owned_vehicles", schema = "essentialmode", catalog = "")
public class OwnedVehicles {
    private String owner;
    private byte state;
    private String plate;
    private String vehicle;
    private String type;
    private String job;
    private byte stored;

    @Basic
    @Column(name = "owner", nullable = false, length = 22)
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Basic
    @Column(name = "state", nullable = false)
    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    @Id
    @Column(name = "plate", nullable = false, length = 12)
    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Basic
    @Column(name = "vehicle", nullable = true, length = -1)
    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 20)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "job", nullable = true, length = 20)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "stored", nullable = false)
    public byte getStored() {
        return stored;
    }

    public void setStored(byte stored) {
        this.stored = stored;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OwnedVehicles that = (OwnedVehicles) o;
        return state == that.state &&
                stored == that.stored &&
                Objects.equals(owner, that.owner) &&
                Objects.equals(plate, that.plate) &&
                Objects.equals(vehicle, that.vehicle) &&
                Objects.equals(type, that.type) &&
                Objects.equals(job, that.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, state, plate, vehicle, type, job, stored);
    }
}
