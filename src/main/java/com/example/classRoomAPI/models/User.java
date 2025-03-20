package com.example.classRoomAPI.models;

import com.example.classRoomAPI.helpers.TypeUser;

public class User {
    private Integer idUser;
    private String name;
    private String password;
    private String mail;
    private String phoneNumber;
    private TypeUser typeUser;

    public User() {
        
    }

    public User(Integer idUser, String name, String password, String mail, String phoneNumber, TypeUser typeUser) {
        this.idUser = idUser;
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.typeUser = typeUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
