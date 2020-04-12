/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.beans;

/**
 *
 * @author Riley
 */
public class Book {

    private int id;
    private String title, author;
    private double price;
    private int quantity;
    private String courses, store;

    public Book() {
    }

    public Book(String title, String author, double price, int quantity, String courses, String store) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.courses = courses;
        this.store = store;
    }

    public Book(int id, String title, String author, double price, int quantity, String courses) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return id+"*"+title + "*" + author + "*" + price + "*" + quantity + "*" + courses + "*" + store;
    }

}
