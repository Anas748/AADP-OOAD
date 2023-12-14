package eirvid;

import java.util.Scanner;

/**
 *
 * @author Abdul Rehman  2021333 
 */
public class Menu {
    public void Start(){
        UserRep userRepository = new StoreUser();
        UserValidation emailValidator = new ValidEmail();
        UserValidation passwordValidator = new ValidPass();
        Registration registration = new Registration(userRepository, emailValidator, passwordValidator);
        Login login = new Login(userRepository);

        Scanner scanner = new Scanner(System.in);
           while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registration.registerUser();
                    break;
                case 2:
                    if( login.loginUser() == true){
                     MovieRentalManager manager = MovieRentalManager.getInstance();
                   
                     MovieLoader.loadMovies(manager);
                     MovieRentalManager mrm = new MovieRentalManager();
                     SecMenu em = new SecMenu(registration.user, mrm);
                     em.displayMenu();
                    }
                    
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    
    }
   
}
