
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;
/**
 *
 * @author Muhammad Anas Baig
 * 2021387
 * this is validation of user while he is registering on system
 * this validation is for password
 */
public class ValidPass implements UserValidation {
    @Override
    public boolean isValid(String password) {
        // For just checking  we will just simply check if pass is not null or too long
        if (password == null) {
        return false;
    }if (password.length() < 6) {
        return false;
    }
    return true;
    }
}
