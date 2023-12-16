/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.util.List;

/**
 *
 * @author Muhammad Ahmad 2021385
 * RentalManager, manages the movie rental process by interacting with user and movie data.
 */
public class RentMovie {
    private List<User> users;   // List to store user data
    private List<Movie> movies; // List to store movie data
    
    // Initializes the RentalManager with lists of users and movies.
    public RentMovie(List<User> users, List<Movie> movies) {
        this.users = users;
        this.movies = movies;
    }

    // Initiates the movie rental process for a given user and movie title.
    public void rentMovie(User user, String email, String title) {
        
      

        Movie movie = this.movies.stream().filter(m -> m.getTitle().equals(title))
                .findFirst()
                .orElse(null);

        // Check if both user and movie are found
        if ( movie != null) {
            // Rent the movie for the user
            System.out.println(movie.getTitle() + " " + movie.toString());
            user.rentMovie(movie);

            // Display rental information
            System.out.println("Movie rented successfully!----");
            System.out.println("Movie: " + movie.getTitle());
            System.out.println("Price: " + movie.getPrice());
            System.out.println("Customer: " + user.getEmail());
        } else {
            System.out.println("Invalid email or movie title.");
        }
    }
}
