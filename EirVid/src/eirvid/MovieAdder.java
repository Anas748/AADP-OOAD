/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.util.List;

/**
 *
 * @author Muhammad Ahmad
 *MovieAdder, is responsible for adding new movies to the system
 */
public class MovieAdder {
    private List<Movie> movies;  // List to store movie data

    
    public MovieAdder(List<Movie> movies) {         //Initializes the MovieAdder with a list of movies.
        this.movies = movies;                       //movies List of movies in the system.
    }

  
   public List<Movie> getMovies(){
       return this.movies;
   }
        public void addMovie(String title, double price) {      //Adds a new movie to the system with the specified title and price.
        this.movies.add(new Movie(title, price));           //Title & price of the new movie.
    } 
    
}
