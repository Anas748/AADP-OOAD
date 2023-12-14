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