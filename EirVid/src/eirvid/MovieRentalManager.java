
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
import java.util.stream.Collectors;


public class MovieRentalManager {

   public static MovieRentalManager instance;       // Singleton instance to ensure only one instance of MovieRentalManager exists.
    // Lists to store users, movies, and instances of related managers.
    private  List<User> users;
    private  List<Movie> movies;
    private  MovieAdder movieAdder;
    private  RentMovie rentalManager;
      
    
    public MovieRentalManager() {                    // Private constructor initializes lists and manager instances.
        this.users = new ArrayList<>();
        this.movies = new ArrayList<>();
        this.movieAdder = new MovieAdder(this.movies);
        this.rentalManager = new RentMovie(users,this.movieAdder.getMovies());
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
        return this.movieAdder.getMovies();
        
    }
     public List<Movie> getRecommendedMovies(String preference) {
        // Filter movies based on user preference and price
        return this.movies.stream()
                .filter(movie -> isMovieMatchingPreference(movie, preference))
                .collect(Collectors.toList());
    }

    private boolean isMovieMatchingPreference(Movie movie, String preference) {
        switch (preference.toLowerCase()) {
            case "old":
                return movie.getPrice() == 6.99;
            case "popular":
                return movie.getPrice() == 7.99;
            case "new":
                return movie.getPrice() == 9.99;
            default:
                return false; // Default behavior if preference is not recognized
        }
    }

    public void addMovie(String title, double price) {
        movieAdder.addMovie(title, price);
    }

    public void rentMovie(User user, String email, String title) {
        rentalManager.rentMovie(user, email, title);
    }
}
    
