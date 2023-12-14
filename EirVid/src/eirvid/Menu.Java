package eirvid;

import java.util.Scanner;

/**
 *
 * @author Abdul Rehman
 */
public class Menu {
    public void Start(){
        UserRep userRepository = new StoreUser();            // Type UserRep and assigns it a new instance of the StoreUser class
        UserValidation emailValidator = new ValidEmail();    //This object will have access to the methods and properties defined in the UserValidation interface or class.
        UserValidation passwordValidator = new ValidPass();  //variable named passwordValidator of type UserValidation and assigns it a new instance of the ValidPass class.

        // Initialize components with dependencies
        Registration registration = new Registration(userRepository, emailValidator, passwordValidator); //The userRepository, emailValidator, and passwordValidator are passed as arguments to the constructor of the Registration class.
        Login login = new Login(userRepository);  //The new Login() part creates a new instance of the Login class.
       

        // creating a Scanner object to read input from the standard input stream (System.in)
        Scanner scanner = new Scanner(System.in);
           while (true) {                                     // the condition is true, so the loop will continue indefinitely.
            System.out.println("Choose an option:");   //This line prints a message "Choose an option:" to the Output.
            System.out.println("1. Register");        //This line prints a message "1. Register" to the Output.
            System.out.println("2. Login");          //This line prints a message "2. Login" to the Output.
            System.out.println("3. Exit");          //This line prints a message"3. Exit" to the Output.

            System.out.print("Enter your choice : ");    //This line prints a message"Enter your choice : " to the Output.
            int choice = scanner.nextInt();
            scanner.nextLine(); // the newline character

            switch (choice) {                     //It allows the program to perform different actions based on the value of choice.
                case 1:                           //If the value of choice is 1, the program will execute the code
                    registration.registerUser();  //handles user registration.
                    break;
                case 2:                         //If the value of choice is 2, the program will execute the code
                    if( login.loginUser() == true){
                     MovieRentalManager manager = MovieRentalManager.getInstance();
                   
                     MovieLoader.loadMovies(manager);      //responsible for loading movies into the manager object.
                     MovieRentalManager mrm = new MovieRentalManager();
                     SecMenu em = new SecMenu(registration.user, mrm); //it is responsible for displaying a secondary menu.
                     em.displayMenu();  //displays the secondary menu to the user.
                    }
                    
                    break;
                case 3:                           //If the value of choice is 3, the program will execute the code
                    System.out.println("Exiting the program. Goodbye!");  //prints  "Exiting the program. Goodbye!" to output
                    System.exit(0);     // indicating a successful termination.
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");  //prints  "Invalid choice. Please enter 1, 2, or 3." to output
            }
        }
    
    }
   
}
