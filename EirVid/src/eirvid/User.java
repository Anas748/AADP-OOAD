/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

/**
 *
 * @author user
 */
public class User {
    private String password;
    private String email;
    private Map<Movie, Long> rentedMovies;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.rentedMovies = new HashMap<>();
    }

    public void rentMovie(Movie movie) {
        rentedMovies.put(movie, System.currentTimeMillis());
        System.out.printf("User: %s, Movie: %s, Price: %.2f\n", email, movie.getTitle(), movie.getPrice());
    }
     
}

