package com.example.enumbug;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    /*
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }*/
}
