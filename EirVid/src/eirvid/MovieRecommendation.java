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
      
      //Create cases to filter old, popular and new movies on user preferences
      private boolean isMovieMatchingPreference(Movie movie, String preference) {
        switch (preference.toLowerCase()) {
            
            case "old":
                //return movies price 6.99 for old
                return movie.getPrice() == 6.99;
                
            case "popular":
                //return movies price 7.99 for popular
                return movie.getPrice() == 7.99;
                
            case "new":
                //return movies price 9.99 for new
                return movie.getPrice() == 9.99;
                
            default:
                return false; // show default behavior if preference is not recognized
    
         }
      }
  // Replace this method with actual way of getting movies
    private List<Movie> getMovies() {
      MovieRentalManager movieRentalManager = MovieRentalManager.getInstance();

    // Retrieve the list of movies from the class MovieRentalManager
    return movieRentalManager.getMovies();
    }
}
