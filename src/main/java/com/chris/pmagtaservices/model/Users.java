package com.chris.pmagtaservices.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Users {
    private String identifier;
    private String license;
    private Integer money;
    private String name;
    private String skin;
    private String job;
    private Integer jobGrade;
    private String loadout;
    private String position;
    private Integer bank;
    private Integer permissionLevel;
    private String group;
    private String firstname;
    private String lastname;
    private String dateofbirth;
    private String sex;
    private String height;
    private Byte isDead;
    private String lastProperty;
    private String phoneNumber;
    private int jail;
    private String status;
    private int id;

    @Basic
    @Column(name = "identifier", nullable = true, length = 50)
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Basic
    @Column(name = "license", nullable = true, length = 50)
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Basic
    @Column(name = "money", nullable = true)
    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "skin", nullable = true, length = -1)
    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    @Basic
    @Column(name = "job", nullable = true, length = 50)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "job_grade", nullable = true)
    public Integer getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(Integer jobGrade) {
        this.jobGrade = jobGrade;
    }

    @Basic
    @Column(name = "loadout", nullable = true, length = -1)
    public String getLoadout() {
        return loadout;
    }

    public void setLoadout(String loadout) {
        this.loadout = loadout;
    }

    @Basic
    @Column(name = "position", nullable = true, length = 255)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "bank", nullable = true)
    public Integer getBank() {
        return bank;
    }

    public void setBank(Integer bank) {
        this.bank = bank;
    }

    @Basic
    @Column(name = "permission_level", nullable = true)
    public Integer getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(Integer permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    @Basic
    @Column(name = "group", nullable = true, length = 50)
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Basic
    @Column(name = "firstname", nullable = true, length = 50)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname", nullable = true, length = 50)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "dateofbirth", nullable = true, length = 25)
    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 10)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "height", nullable = true, length = 5)
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Basic
    @Column(name = "is_dead", nullable = true)
    public Byte getIsDead() {
        return isDead;
    }

    public void setIsDead(Byte isDead) {
        this.isDead = isDead;
    }

    @Basic
    @Column(name = "last_property", nullable = true, length = 255)
    public String getLastProperty() {
        return lastProperty;
    }

    public void setLastProperty(String lastProperty) {
        this.lastProperty = lastProperty;
    }

    @Basic
    @Column(name = "phone_number", nullable = true, length = 10)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "jail", nullable = false)
    public int getJail() {
        return jail;
    }

    public void setJail(int jail) {
        this.jail = jail;
    }

    @Basic
    @Column(name = "status", nullable = true, length = -1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return jail == users.jail &&
                id == users.id &&
                Objects.equals(identifier, users.identifier) &&
                Objects.equals(license, users.license) &&
                Objects.equals(money, users.money) &&
                Objects.equals(name, users.name) &&
                Objects.equals(skin, users.skin) &&
                Objects.equals(job, users.job) &&
                Objects.equals(jobGrade, users.jobGrade) &&
                Objects.equals(loadout, users.loadout) &&
                Objects.equals(position, users.position) &&
                Objects.equals(bank, users.bank) &&
                Objects.equals(permissionLevel, users.permissionLevel) &&
                Objects.equals(group, users.group) &&
                Objects.equals(firstname, users.firstname) &&
                Objects.equals(lastname, users.lastname) &&
                Objects.equals(dateofbirth, users.dateofbirth) &&
                Objects.equals(sex, users.sex) &&
                Objects.equals(height, users.height) &&
                Objects.equals(isDead, users.isDead) &&
                Objects.equals(lastProperty, users.lastProperty) &&
                Objects.equals(phoneNumber, users.phoneNumber) &&
                Objects.equals(status, users.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, license, money, name, skin, job, jobGrade, loadout, position, bank, permissionLevel, group, firstname, lastname, dateofbirth, sex, height, isDead, lastProperty, phoneNumber, jail, status, id);
    }
}
