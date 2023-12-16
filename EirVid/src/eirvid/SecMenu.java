/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Abdul Rehman
 */
public class SecMenu {
     private Scanner scanner = new Scanner(System.in);
    private MovieRentalManager manager;
    private MovieRecommendation reco;
    private User user;
     private  RentMovie rentalManager;

    public SecMenu(User user, MovieRentalManager manager) {
        this.user = user;
        this.manager = manager;
        this.reco = new MovieRecommendation();
        
    }

    public void displayMenu() {
        System.out.println("Welcome, " + user.getEmail() + "!");
        System.out.println("1. Rent a movie");
        System.out.println("2. View recommendations");
        System.out.println("3. View Rented Movies");
        System.out.println("4. Log out");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        while (choice != 5) {
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    rentMovie();
                    break;
                case 2:
                    displayRecommendations();
                    break;
                case 3:
                    showRentedMovies();
                    break;
                case 4:
                    logout();
                    choice = 5;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            if (choice == 5) {
                break;
            }

            System.out.println("\n\n1. Rent a movie");
            System.out.println("2. View recommendations");
            System.out.println("3. View Rented Movies");
            System.out.println("4. Log out");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
        }
    }
 
    private void rentMovie() {
        System.out.print("Enter the title of the movie you want to rent: ");
        String title = scanner.nextLine();
        manager.rentMovie(this.user, user.getEmail(), title);
    }

   public void displayRecommendations() {
        System.out.println("Choose your preference:");
        System.out.println("1. Old Movies");
        System.out.println("2. Popular Movies");
        System.out.println("3. New Movies");
        System.out.print("Enter your preference (1, 2, or 3): ");

        int preferenceChoice = scanner.nextInt();
        String preference;
        switch (preferenceChoice) {
            case 1:
                preference = "old";
                break;
            case 2:
                preference = "popular";
                break;
            case 3:
                preference = "new";
                break;
            default:
                System.out.println("Invalid preference choice. Defaulting to 'old'.");
                preference = "old";
                break;
        }

        List<Movie> recommendedMovies = reco.recommendMovies(user, preference);
        System.out.println("Recommended movies:");
        for (Movie movie : recommendedMovies) {
            System.out.println(movie.getTitle());
        }
        scanner.nextLine(); // Consume the newline character
    }


    private void showRentedMovies() {
        System.out.println("User Rented Movies:");
        int i = 1;
        for (Movie movie : user.getRentedMovies()) {
            System.out.println(i + "." + movie.getTitle());
            i++;
        }
    }

    private void logout() {
        System.out.println("Logging out...");
        user = null;
        System.out.println("Logged out successfully.\n\n");
        System.out.println("--- Login Again ---");
    }
    
}
