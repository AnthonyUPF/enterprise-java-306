package com.example.Intro.PRCompany.models;

import jakarta.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contact")
    private int idContact;

    @Embedded
    Name name;
    String title;
    String company;

    public Contact() {
    }

    public Contact(Name name, String title, String company) {
        this.name = name;
        this.title = title;
        this.company = company;
    }

    public int getIdContact() {
        return idContact;
    }



    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
