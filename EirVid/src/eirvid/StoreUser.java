/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Muhammad Anas Baig 
 * 2021387
 * this class is storing users into Hashmap as many as we want and can be expanded if needed.
 */
public class StoreUser implements UserRep {
    
    private Map<String, User> userList = new HashMap<>();
    @Override
    public void addUser(User user) {
        userList.put(user.getEmail(), user);
    }
    
    @Override
    public User UserEmail(String email) {
        return userList.get(email);
    }
} 
