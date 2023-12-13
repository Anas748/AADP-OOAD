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
 * @Muhammad Ahmad 2021385
 */
public class MovieRentalManager {
    private static MovieRentalManager instance;
    private Map<String, User> users;
    private List<Movie> movies;

    private MovieRentalManager() {
        this.users = new HashMap<>();
        this.movies = new ArrayList<>(); 
    }
}
