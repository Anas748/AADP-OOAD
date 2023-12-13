/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

/**
 *
 * @author Muhammad anas baig
 * 2021387
 * Allow data access strategies without modifying.
 */
// User repository interface for dependency 
interface UserRep {
    void addUser(User user);
    User UserEmail(String email);
}