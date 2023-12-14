
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

/**
 *
 * @authourMuhammad Ahmad
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
    public static MovieRentalManager getInstance() {
        if (instance == null) {
            instance = new MovieRentalManager();
        }
        return instance;
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public List<Movie> getMovies() {
        return new ArrayList<>(movies);
    }

    public List<Movie> filterMovies(String preference) {
        return movieFilterManager.filterMovies(preference);
    }

    public void addMovie(String title, double price) {
        movieAdder.addMovie(title, price);
    }

    public void rentMovie(String email, String title) {
        rentalManager.rentMovie(email, title);
    }
}
    
    