
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

/**
 *
 * @Muhammad Ahmad
 * 2021385
 *  MovieRentalManager class manages the overall movie rental system.
 */

import java.util.ArrayList;
import java.util.List;


public class MovieRentalManager {
    
    private static MovieRentalManager instance;       // Singleton instance to ensure only one instance of MovieRentalManager exists.
    
    // Lists to store users, movies, and instances of related managers.
    private final List<User> users;
    private final List<Movie> movies;
    private final MovieFilterManager movieFilterManager;
    private final MovieAdder movieAdder;
    private final RentalManager rentalManager;
      
    
    private MovieRentalManager() {                    // Private constructor initializes lists and manager instances.
        this.users = new ArrayList<>();
        this.movies = new ArrayList<>();
        this.movieFilterManager = new MovieFilterManager(this.movies);
        this.movieAdder = new MovieAdder(this.movies);
        this.rentalManager = new RentMovie(this.users, this.movies);
    }

    
    public static MovieRentalManager getInstance() {      //returns the instance of MovieRentalManager.
        if (instance == null) {
            instance = new MovieRentalManager();
        }
        return instance;
    }

    public List<User> getUsers() {                        // Getter method to retrieve a copy of the user list.

        return new ArrayList<>(users);
    }

   
    public List<Movie> getMovies() {                      // Getter method to retrieve a copy of the movie list.
        return new ArrayList<>(movies);
    }

    
    public List<Movie> filterMovies(String preference) {     // Method to filter movies based on a user's preference using the MovieFilterManager.
        return movieFilterManager.filterMovies(preference);
    }

    
    public void addMovie(String title, double price) {     // Method to add a new movie using the MovieAdder.
        movieAdder.addMovie(title, price);
    }

    
    public void RentMovie(String email, String title) {      // Method to rent a movie for a user using the RentalManager.
       
