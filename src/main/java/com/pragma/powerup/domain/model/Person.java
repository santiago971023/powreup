package com.pragma.powerup.domain.model;

public class Person {

    private Long id;

    private String name;

    private String lastname;

    private String mail;

    private String phone;

    private String address;

    private String document;

    private String password;

    public Person(Long id, String name, String lastname, String mail, String phone, String address, String document, String password) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
        this.phone = phone;
        this.address = address;
        this.document = document;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
