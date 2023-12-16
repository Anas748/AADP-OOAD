/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.util.Scanner;

/**
 *
 * @author Muhammad Anas Baig 2021387
 * Registration class which work on the
 * principal of one job
 *
 */
public class Registration {

    private UserRep userRepository; // to add user list
    // initialise for user validations
    private UserValidation emailValidator;
    private UserValidation passwordValidator;
    private User user;

    // Constructor 
    public Registration(UserRep userRepository, UserValidation emailValidator, UserValidation passwordValidator) {
        this.userRepository = userRepository;
        this.emailValidator = emailValidator;
        this.passwordValidator = passwordValidator;
    }

    // Method to register a user
    public void registerUser() {

        Scanner myKB = new Scanner(System.in);
        System.out.println("Enter Data for registration:");
        System.out.print("Name: ");
        String name = myKB.nextLine();
        // Get and validate email
        String email;
        do {
            System.out.print("Email: ");
            email = myKB.nextLine();
            if (!emailValidator.isValid(email)) {
                System.out.println("Invalid email format.Make sure to add @ in email .Please try again.");
            }
        } while (!emailValidator.isValid(email));
        // Get and validate password
        String password;
        do {
            System.out.print("Password: ");
            password = myKB.nextLine();
            if (!passwordValidator.isValid(password)) {
                System.out.println("Invalid password.Must 6 characters. Please try again.");
            }
        } while (!passwordValidator.isValid(password));

        // Create user
        user = new RegistrationUser(name, email, password);
        // Store the user information
        userRepository.addUser(user);
        System.out.println("Registration successful");
    }

         public User getUser() {
         return user;
        }
}

// Specialized RegistrationUser class for user registration
class RegistrationUser extends User {

    public RegistrationUser(String name, String email, String password) {
        super(name, email, password);
    }

}

