/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author PC
 */
public class MovieRecommendation {
      public List<Movie> recommendMovies(User user, String preference) {
        
        // Movies will filter based on user preference and price
        List<Movie> filteredMovies = getMovies().stream()
                .filter(movie -> isMovieMatchingPreference(movie, preference))
                .collect(Collectors.toList());

        // Limit the result to 5 movies
        return filteredMovies.stream()
                .limit(5)
                .collect(Collectors.toList());
    }
    
    
}
