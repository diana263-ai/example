package com.dee.app.example.model;


import javax.persistence.*;

@Entity
public class User {

@Id
//this tells MySQL that id will be unique for each user
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long   id;

//this tells that each detail will be a column in the database
@Column
    private String firstName;
@Column
    private String lastName;
@Column
    private int age;
@Column
    private String occupation;

//the getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
