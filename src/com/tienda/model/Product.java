package com.tienda.model;

public class Product {

    // Atributos
    private String title;
    private int year;
    private double price;
    private int stock;

    // Constructores
    public Product(String title, int year, double price, int stock){
        this.title = title;
        this.year = year;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }

    // toString
    @Override public String toString() {
        return title + " | " + year + " | $" + price + " | Stock: " + stock;
    }


}
