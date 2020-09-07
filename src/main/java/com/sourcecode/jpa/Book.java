package com.sourcecode.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String author;
    @Column(name = "cost")
    private float cost;

    public Book() {

    }
//
//    public Book(int id, String name, String author, float cost) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.cost = cost;
//    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override()
    public String toString() {
        return "Book : " + this.name + " " + this.author + " " + this.cost;
    }
}
