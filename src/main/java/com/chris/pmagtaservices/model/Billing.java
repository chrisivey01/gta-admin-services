package com.chris.pmagtaservices.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Billing {
    private int id;
    private String identifier;
    private String sender;
    private String targetType;
    private String target;
    private String label;
    private int amount;
    private int mechanicUpgrade;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "identifier", nullable = false, length = 255)
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Basic
    @Column(name = "sender", nullable = false, length = 255)
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Basic
    @Column(name = "target_type", nullable = false, length = 50)
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    @Basic
    @Column(name = "target", nullable = false, length = 255)
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Basic
    @Column(name = "label", nullable = false, length = 255)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "amount", nullable = false)
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "mechanic_upgrade", nullable = false)
    public int getMechanicUpgrade() {
        return mechanicUpgrade;
    }

    public void setMechanicUpgrade(int mechanicUpgrade) {
        this.mechanicUpgrade = mechanicUpgrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Billing billing = (Billing) o;
        return id == billing.id &&
                amount == billing.amount &&
                mechanicUpgrade == billing.mechanicUpgrade &&
                Objects.equals(identifier, billing.identifier) &&
                Objects.equals(sender, billing.sender) &&
                Objects.equals(targetType, billing.targetType) &&
                Objects.equals(target, billing.target) &&
                Objects.equals(label, billing.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identifier, sender, targetType, target, label, amount, mechanicUpgrade);
    }
}
