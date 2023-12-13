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
        MovieRentalSystem system = MovieRentalSystem.getInstance();
        
        MovieLoader.loadMovies();

        Scanner SC = new Scanner(System.in);

        while (true) {

            System.out.print("\n\nEnter email (Enter 'X' to Exit): ");
            String email = SC.nextLine();
            if(Objects.equals(email, "X")) {
                break;
            }

            System.out.print("Enter password: ");
            String pass = SC.nextLine();

            // Create a new user or log in if the user already exists
            User loggedInUser = system.login(email, pass);
            if (loggedInUser == null) {
                // If the user does not exist, create a new user
                system.createUser(email, pass);
                loggedInUser = system.login(email, pass);
            }

            // Rest of the code remains the same
            if (loggedInUser != null) {
                Menu menu = new Menu(loggedInUser);
                menu.displayMenu();
            } else {
                System.out.println("Invalid email or password.");
            }
        }
    }

    private static MovieRentalSystem instance;
    private Map<String, User> users;
    private List<Movie> movies;

    private MovieRentalSystem() {
        this.users = new HashMap<>();
        this.movies = new ArrayList<>();
    }

    public static MovieRentalSystem getInstance() {
        if (instance == null) {
            instance = new MovieRentalSystem();
        }
        return instance;
    }

    public void addMovie(String title, double price) {
        this.movies.add(new Movie(title, price));
    }

    public void createUser(String email, String password) {
        this.users.put(email, new User(email, password));
    }

    public User login(String email, String password) {
        User user = users.get(email);
        if (user != null && password.equals(user.getPassword())) {
            return user;
        }
        return null;
    }

    public void rentMovie(String email, String title) {
        User user = this.users.get(email);
        Movie movie = this.movies.stream().filter(m -> m.getTitle().equals(title.strip())).findFirst().orElse(null);

        if (movie != null) {
            user.rentMovie(movie);
            System.out.println("x:-----------------Movie rented successfully!-----------------:x");
            System.out.println("Movie: " + movie.getTitle());
            System.out.println("Price: " + movie.getPrice());
            System.out.println("Customer: " + user.getEmail());
        } else {
            System.out.println("Invalid movie title.");
        }
    }
}
 
