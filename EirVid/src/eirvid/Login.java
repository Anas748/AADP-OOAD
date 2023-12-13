/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.util.Scanner;

/**
 *
 * @author Muhammad Anas Baig 2021387
 * 
 */
// Login class with single responsibility
class Login {
    private UserRep userRepository;
    
    //Constructs a Login object with a user repository
    public Login(UserRep userRepository) {
        this.userRepository = userRepository;
    }
    //Attempts to log in a user by validating the entered credentials.
    public boolean loginUser() {
        Scanner myKB = new Scanner(System.in);

        System.out.println("Welcome! Please log in:");

        // Prompt the user to enter their email and password
        System.out.print("Email: ");
        String email = myKB.nextLine();

        System.out.print("Password: ");
        String password = myKB.nextLine();

        // Retrieve the user information from the hashmap
        User user = userRepository.UserEmail(email);

        // Compare the entered email and password with the stored information
        if (user != null && user.getEmail().equals(email) && user.getPassword().equals(password)) {
            System.out.println("Login successful! Welcome " + user.getName() + ".");
           
            return true;
        } else {
            System.out.println("Login failed. Invalid email or password.");
            return false;
        }
    }
}
