/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;


/**
 *
 *@author Muhammad Anas Baig
 * 2021387
 * this is validation of user while he is registering on system
 * this validation is for email;
 */
public class ValidEmail implements UserValidation {
    @Override
    public boolean isValid(String email) {
        //let see if user enter nothing 
        if (email == null) {
            return false;
        }
        // just for testing check if it contains @
        return email.contains("@");
    }
}