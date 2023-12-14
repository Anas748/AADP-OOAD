/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Ahmad
 */
public class MovieFilterManager {
     private List<Movie> movies;

    //Constructor to Initializes the MovieFilterManager with a list of movies.
        public MovieFilterManager(List<Movie> movies) {
        this.movies = movies;
    }

   
    public List<Movie> filterMovies(String preference) {
        return this.movies.stream()
                .filter(movie -> isMovieMatchingPreference(movie, preference))
                .collect(Collectors.toList());
    }

    
      //Checks if a movie matches the  preference of users.
     
    //  The user's movie preference are ("old", "popular", "new").
     
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
}
