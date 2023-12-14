/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Haider
 */
public class MovieLoader {

    public static void loadMovies(MovieRentalManager manager) {
        //use string for csv file path to read file from CsvReader class file
        String csvFilePath = CsvReader.readCsvFilePath();

        try {
            //use scanner to read file
            Scanner sc = new Scanner(new FileReader(csvFilePath));
            sc.useDelimiter(",");
            
            // skip the first line
            sc.nextLine(); 
            
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                String title = parts[1];
                
                //use double for the price as decimal
                double price = Double.parseDouble(parts[parts.length - 1]);
                
                //print the title and price of added movie
                System.out.println("Add Movie: " + title.trim() + ", Price: " + price);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
       
