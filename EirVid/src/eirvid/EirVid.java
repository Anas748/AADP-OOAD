/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eirvid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class EirVid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        public List<Movie> recommendMovies() {
        Map<Movie, Integer> movieRentCount = new HashMap<>();
        long fiveMinutesAgo = System.currentTimeMillis() - (5 * 60 * 1000);

        for (User user : users.values()) {
            Map<Movie, Long> rentedMovies = user.getRentedMoviesWithTime();
            for (Movie movie : rentedMovies.keySet()) {
                if (rentedMovies.get(movie) >= fiveMinutesAgo) {
                    movieRentCount.put(movie, movieRentCount.getOrDefault(movie, 0) + 1);
                }
            }
        }
    
    

