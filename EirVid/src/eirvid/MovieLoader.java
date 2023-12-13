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

    public static void loadMovies() {
        String csvFilePath = CsvReader.readCsvFilePath();

        try {
            Scanner sc = new Scanner(new FileReader(csvFilePath));
            sc.useDelimiter(",");
            sc.nextLine(); // skip the first line
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                String title = parts[1];
                double price = Double.parseDouble(parts[parts.length - 1]);
                
                System.out.println("Add Movie: " + title.trim() + ", Price: " + price);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
       
