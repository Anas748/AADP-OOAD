/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Muhammad Anas Baig
 * 2021387
 * 
 */


public class User {
     private String name; // User name
    private String email; // User email 
    private String password; // User password for authentication
    private final Map<Movie, Long> rentedMovies; // Movies rented by the user 

    // Constructor with encapsulated fields
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.rentedMovies = new HashMap<>();
    }

    // Getters and setters 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Movie related methods
    //Rents a movie for the user.
    public void rentMovie(Movie movie) {
        rentedMovies.put(movie, System.currentTimeMillis());
        System.out.printf("User: %s, Movie: %s, Price: %.2f\n", email, movie.getTitle(), movie.getPrice());
    }
    //Checks if the user has rented a specific movie.
    public boolean hasRentedMovie(Movie movie) {
        return rentedMovies.containsKey(movie);
    }
    //Gets a list of movies rented by the user.
    public List<Movie> getRentedMovies() {
        return new ArrayList<>(rentedMovies.keySet());
    }
    //Gets a map of rented movies along with their rental timestamps.
    public Map<Movie, Long> getRentedMoviesWithTime() {
        return rentedMovies;
    }
}


