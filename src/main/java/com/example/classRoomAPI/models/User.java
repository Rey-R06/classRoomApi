package com.example.classRoomAPI.models;

import com.example.classRoomAPI.helpers.TypeUser;
import jakarta.persistence.*;

//Faltan relaciones uno a uno
@Entity
@Table(name = "names")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_User")
    private Integer id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "password", length = 255, nullable = false)
    private String password;

    @Column(name = "mail", length = 150, unique = true, nullable = false)
    private String mail;

    @Column(name = "phoneNumber", length = 20, nullable = true)
    private String phoneNumber;

    @Column(name = "typeUser", nullable = false)
    private TypeUser typeUser;

    public User() {
        
    }

    public User(Integer id, String name, String password, String mail, String phoneNumber, TypeUser typeUser) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.typeUser = typeUser;
    }

    public Integer getIdUser() {
        return id;
    }

    public void setIdUser(Integer id) {
        this.id = id;
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
