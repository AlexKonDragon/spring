package com.homework.spring.model;

public class Student {
    Integer id;
    String name;
    String surname;
    Integer groupNumber;
    Integer forPayment;
    private Boolean willDelete;

    public Boolean getWillDelete() {
        return willDelete;
    }

    public void setWillDelete(Boolean willDelete) {
        this.willDelete = willDelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Integer getForPayment() {
        return forPayment;
    }

    public void setForPayment(Integer forPayment) {
        this.forPayment = forPayment;
    }
}
