/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

/**
 *
 * @author Haider
 */
public class Movie {
     private String title;
    private double price;

    public Movie(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
      @Override
    public String toString() {
        return "Movie{" +
               "title='" + title + '\'' +
               ", price=" + price +
               '}';
    }
}

