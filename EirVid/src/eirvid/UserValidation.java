/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

/**
 *
 * @author Muhammad Anas Baig  
 * 2021387
 * Created a user validation interface which can be 
 * access by other classes if they need  also its a good practice 
 * in this way you can add more validation function when needed
 */

// Interface for user validation
public interface UserValidation {
    boolean isValid(String input);
}
