
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

   public static MovieRentalManager instance;       // Singleton instance to ensure only one instance of MovieRentalManager exists.
    
    // Lists to store users, movies, and instances of related managers.
    private  List<User> users;
    private  List<Movie> movies;
    private  MovieFilterManager movieFilterManager;
    private  MovieAdder movieAdder;
    private  RentMovie rentalManager;
      
    
    public MovieRentalManager() {                    // Private constructor initializes lists and manager instances.
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
        return (List<Movie>) movieFilterManager.filterMovies(preference);
    }

    public void addMovie(String title, double price) {
        movieAdder.addMovie(title, price);
    }

    public void rentMovie(String email, String title) {
        rentalManager.rentMovie(email, title);
    }
}
    
