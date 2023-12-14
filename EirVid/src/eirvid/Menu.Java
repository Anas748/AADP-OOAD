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