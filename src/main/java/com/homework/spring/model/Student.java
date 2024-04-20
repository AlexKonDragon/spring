package com.homework.spring.model;
import jakarta.persistence.*;

@Entity
@Table(name = "studentTable")

public class Student {
    @Id
//    @Column(name = "id")
    Integer id;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;
    @Column(name = "groupNumber")
    Integer groupNumber;
    @Column(name = "forPayment")
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

    public Student(Integer id, String name, String surname, Integer groupNumber, Integer forPayment) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.forPayment = forPayment;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupNumber=" + groupNumber +
                ", forPayment=" + forPayment +
                '}';
    }
}
